package com.bytedance.vcloud.abrmodule;

/* loaded from: classes9.dex */
public class ABRConfig {
    public static final int ABR_4G_MAX_BITRATE_KEY = 2;
    public static final int ABR_BANDWIDTH_PARAMETER_KEY = 11;
    public static final int ABR_DEFAULT_WIFI_BITRATE = 12;
    public static final int ABR_FIXED_LEVEL = 4;
    public static final int ABR_LOG_LEVEL_KEY = 0;
    public static final int ABR_PLAYER_DISPLAY_HEIGHT_KEY = 7;
    public static final int ABR_PLAYER_DISPLAY_WIDTH_KEY = 6;
    public static final int ABR_SELECT_SCENE = 14;
    public static final int ABR_STALL_PENALTY_PARAMETER_KEY = 9;
    public static final int ABR_STARTUP_BANDWIDTH_PARAMETER_KEY = 8;
    public static final int ABR_STARTUP_MAX_BITRATE = 13;
    public static final int ABR_STARTUP_MODEL_KEY = 5;
    public static final int ABR_SWITCH_MODEL_KEY = 3;
    public static final int ABR_SWITCH_PENALTY_PARAMETER_KEY = 10;
    public static final int ABR_SWITCH_SENSITIVITY_KEY = 1;
    public static String sAbrFlowJson = null;
    public static String sAbrPreloadJson = null;
    public static String sAbrStartupJson = null;
    public static float sBandwidthParameter = 1.0f;
    public static int sFixedLevel = 2;
    public static int sLogLevel = 3;
    public static int sNarrowScreenUseWidth = 0;
    public static float sStallPenaltyParameter = 9.0f;
    public static float sStartupBandwidthParameter = 0.9f;
    public static int sStartupModel = 0;
    public static double sStartupModelFirstParam = 0.0d;
    public static double sStartupModelFourthParam = 69.0106422d;
    public static double sStartupModelSecondParam = 2.67952228E-5d;
    public static double sStartupModelThirdParam = 0.151840652d;
    public static int sStartupUseCache = 0;
    public static int sSwitchModel = 1;
    public static float sSwitchPenaltyParameter = 2.0f;
    public static int sSwitchSensitivity;

    public static String getAbrFlowJson() {
        return sAbrFlowJson;
    }

    public static String getAbrPreloadJson() {
        return sAbrPreloadJson;
    }

    public static String getAbrStartupJson() {
        return sAbrStartupJson;
    }

    public static float getBandwidthParameter() {
        return sBandwidthParameter;
    }

    public static int getFixedLevel() {
        return sFixedLevel;
    }

    public static int getLogLevel() {
        return sLogLevel;
    }

    public static int getNarrowScreenUseWidth() {
        return sNarrowScreenUseWidth;
    }

    public static float getStallPenaltyParameter() {
        return sStallPenaltyParameter;
    }

    public static float getStartupBandwidthParameter() {
        return sStartupBandwidthParameter;
    }

    public static int getStartupModel() {
        return sStartupModel;
    }

    public static double getStartupModelFirstParam() {
        return sStartupModelFirstParam;
    }

    public static double getStartupModelFourthParam() {
        return sStartupModelFourthParam;
    }

    public static double getStartupModelSecondParam() {
        return sStartupModelSecondParam;
    }

    public static double getStartupModelThirdParam() {
        return sStartupModelThirdParam;
    }

    public static int getStartupUseCache() {
        return sStartupUseCache;
    }

    public static int getSwitchModel() {
        return sSwitchModel;
    }

    public static float getSwitchPenaltyParameter() {
        return sSwitchPenaltyParameter;
    }

    public static int getSwitchSensitivity() {
        return sSwitchSensitivity;
    }

    public static void setAbrFlowJson(String str) {
        sAbrFlowJson = str;
    }

    public static void setAbrPreloadJson(String str) {
        sAbrPreloadJson = str;
    }

    public static void setAbrStartupJson(String str) {
        sAbrStartupJson = str;
    }

    public static void setBandwidthParameter(float f) {
        sBandwidthParameter = f;
    }

    public static void setFixedLevel(int i) {
        sFixedLevel = i;
    }

    public static void setLoglevel(int i) {
        sLogLevel = i;
    }

    public static void setNarrowScreenUseWidth(int i) {
        sNarrowScreenUseWidth = i;
    }

    public static void setStallPenaltyParameter(float f) {
        sStallPenaltyParameter = f;
    }

    public static void setStartupBandwidthParameter(float f) {
        sStartupBandwidthParameter = f;
    }

    public static void setStartupModel(int i) {
        sStartupModel = i;
    }

    public static void setStartupModelFirstParam(double d) {
        sStartupModelFirstParam = d;
    }

    public static void setStartupModelFourthParam(double d) {
        sStartupModelFourthParam = d;
    }

    public static void setStartupModelSecondParam(double d) {
        sStartupModelSecondParam = d;
    }

    public static void setStartupModelThirdParam(double d) {
        sStartupModelThirdParam = d;
    }

    public static void setStartupUseCache(int i) {
        sStartupUseCache = i;
    }

    public static void setSwitchModel(int i) {
        sSwitchModel = i;
    }

    public static void setSwitchPenaltyParameter(float f) {
        sSwitchPenaltyParameter = f;
    }

    public static void setSwitchSensitivity(int i) {
        sSwitchSensitivity = i;
    }
}