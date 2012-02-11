package com.intellij.lang.javascript.flex.projectStructure.model;

import com.intellij.lang.javascript.flex.projectStructure.options.BuildConfigurationNature;
import com.intellij.openapi.projectRoots.Sdk;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * User: ksafonov
 */
public interface FlexIdeBuildConfiguration {

  @NotNull
  String getName();

  @NotNull
  TargetPlatform getTargetPlatform();

  boolean isPureAs();

  @NotNull
  OutputType getOutputType();

  @NotNull
  String getOptimizeFor();

  @NotNull
  String getMainClass();

  @NotNull
  String getOutputFileName();

  @NotNull
  String getOutputFolder();

  boolean isUseHtmlWrapper();

  @NotNull
  String getWrapperTemplatePath();

  boolean isSkipCompile();

  @NotNull
  Dependencies getDependencies();

  @NotNull
  CompilerOptions getCompilerOptions();

  @NotNull
  AirDesktopPackagingOptions getAirDesktopPackagingOptions();

  @NotNull
  AndroidPackagingOptions getAndroidPackagingOptions();

  @NotNull
  IosPackagingOptions getIosPackagingOptions();

  Icon getIcon();

  String getOutputFilePath(boolean respectAdditionalConfigFile);

  BuildConfigurationNature getNature();

  @Nullable
  Sdk getSdk();

  /**
   * Returns <code>true</code> if this is a temporary BC used for compilation of FlexUnit runner or app with main class that is overridden in run configuration.<br><br>
   * <code>true</code> means that main class and output folder/file name from BC must win over over overridden values from additional config file (in ordinary case additional config file wins).
   * I.e. <code>true</code> means that additional config file must not be used literally, but instead must be merged with the autogenerated one.
   */
  boolean isTempBCForCompilation();

  boolean isEqual(FlexIdeBuildConfiguration other);
}
