package com.ss.android.ugc.aweme.kids.common.response;

import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class KidsComplianceSettings {

    @InterfaceC65349Pkn("age_appeal_menu")
    public final AgeAppealMenu ageAppealMenu;

    @InterfaceC65349Pkn("settings_black_menu_list")
    public final List<String> blackSetting;

    @InterfaceC65349Pkn("bpea_limit_config")
    public final String bpeaLimitConfig;

    @InterfaceC65349Pkn("cmpl_enc")
    public final String complianceEncrypt;

    @InterfaceC65349Pkn("helios_settings")
    public final String heliosSettings;

    @InterfaceC65349Pkn("interface_control_settings")
    public final String interfaceControlSettingsString;

    @InterfaceC65349Pkn("kids_log_events")
    public final List<String> kidsEvents;

    @InterfaceC65349Pkn("km_report_reasons")
    public final String kmReportReasons;

    @InterfaceC65349Pkn("rule_engine_config_settings")
    public final String ruleEngineConfig;

    @InterfaceC65349Pkn("rule_engine_strategy_settings")
    public final String ruleEngineStrategy;

    @InterfaceC65349Pkn("screen_time_management_self")
    public Integer timeLockSelfInMin;

    /* JADX WARN: Multi-variable type inference failed */
    public KidsComplianceSettings() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 2047, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KidsComplianceSettings copy$default(KidsComplianceSettings kidsComplianceSettings, List list, String str, Integer num, List list2, String str2, String str3, String str4, String str5, String str6, String str7, AgeAppealMenu ageAppealMenu, int i, Object obj) {
        if ((i & 1) != 0) {
            list = kidsComplianceSettings.blackSetting;
        }
        if ((i & 2) != 0) {
            str = kidsComplianceSettings.complianceEncrypt;
        }
        if ((i & 4) != 0) {
            num = kidsComplianceSettings.timeLockSelfInMin;
        }
        if ((i & 8) != 0) {
            list2 = kidsComplianceSettings.kidsEvents;
        }
        if ((i & 16) != 0) {
            str2 = kidsComplianceSettings.interfaceControlSettingsString;
        }
        if ((i & 32) != 0) {
            str3 = kidsComplianceSettings.kmReportReasons;
        }
        if ((i & 64) != 0) {
            str4 = kidsComplianceSettings.heliosSettings;
        }
        if ((i & 128) != 0) {
            str5 = kidsComplianceSettings.ruleEngineConfig;
        }
        if ((i & 256) != 0) {
            str6 = kidsComplianceSettings.ruleEngineStrategy;
        }
        if ((i & 512) != 0) {
            str7 = kidsComplianceSettings.bpeaLimitConfig;
        }
        if ((i & 1024) != 0) {
            ageAppealMenu = kidsComplianceSettings.ageAppealMenu;
        }
        return kidsComplianceSettings.copy(list, str, num, list2, str2, str3, str4, str5, str6, str7, ageAppealMenu);
    }

    public final KidsComplianceSettings copy(List<String> list, String str, Integer num, List<String> list2, String str2, String str3, String str4, String str5, String str6, String str7, AgeAppealMenu ageAppealMenu) {
        return new KidsComplianceSettings(list, str, num, list2, str2, str3, str4, str5, str6, str7, ageAppealMenu);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KidsComplianceSettings)) {
            return false;
        }
        KidsComplianceSettings kidsComplianceSettings = (KidsComplianceSettings) obj;
        return o.LJ(this.blackSetting, kidsComplianceSettings.blackSetting) && o.LJ(this.complianceEncrypt, kidsComplianceSettings.complianceEncrypt) && o.LJ(this.timeLockSelfInMin, kidsComplianceSettings.timeLockSelfInMin) && o.LJ(this.kidsEvents, kidsComplianceSettings.kidsEvents) && o.LJ(this.interfaceControlSettingsString, kidsComplianceSettings.interfaceControlSettingsString) && o.LJ(this.kmReportReasons, kidsComplianceSettings.kmReportReasons) && o.LJ(this.heliosSettings, kidsComplianceSettings.heliosSettings) && o.LJ(this.ruleEngineConfig, kidsComplianceSettings.ruleEngineConfig) && o.LJ(this.ruleEngineStrategy, kidsComplianceSettings.ruleEngineStrategy) && o.LJ(this.bpeaLimitConfig, kidsComplianceSettings.bpeaLimitConfig) && o.LJ(this.ageAppealMenu, kidsComplianceSettings.ageAppealMenu);
    }

    public int hashCode() {
        List<String> list = this.blackSetting;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.complianceEncrypt;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.timeLockSelfInMin;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List<String> list2 = this.kidsEvents;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.interfaceControlSettingsString;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.kmReportReasons;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.heliosSettings;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.ruleEngineConfig;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.ruleEngineStrategy;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.bpeaLimitConfig;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        AgeAppealMenu ageAppealMenu = this.ageAppealMenu;
        return hashCode10 + (ageAppealMenu != null ? ageAppealMenu.hashCode() : 0);
    }

    public String toString() {
        return "KidsComplianceSettings(blackSetting=" + this.blackSetting + ", complianceEncrypt=" + this.complianceEncrypt + ", timeLockSelfInMin=" + this.timeLockSelfInMin + ", kidsEvents=" + this.kidsEvents + ", interfaceControlSettingsString=" + this.interfaceControlSettingsString + ", kmReportReasons=" + this.kmReportReasons + ", heliosSettings=" + this.heliosSettings + ", ruleEngineConfig=" + this.ruleEngineConfig + ", ruleEngineStrategy=" + this.ruleEngineStrategy + ", bpeaLimitConfig=" + this.bpeaLimitConfig + ", ageAppealMenu=" + this.ageAppealMenu + ')';
    }

    public final AgeAppealMenu getAgeAppealMenu() {
        return this.ageAppealMenu;
    }

    public final List<String> getBlackSetting() {
        return this.blackSetting;
    }

    public final String getBpeaLimitConfig() {
        return this.bpeaLimitConfig;
    }

    public final String getComplianceEncrypt() {
        return this.complianceEncrypt;
    }

    public final String getHeliosSettings() {
        return this.heliosSettings;
    }

    public final String getInterfaceControlSettingsString() {
        return this.interfaceControlSettingsString;
    }

    public final List<String> getKidsEvents() {
        return this.kidsEvents;
    }

    public final String getKmReportReasons() {
        return this.kmReportReasons;
    }

    public final String getRuleEngineConfig() {
        return this.ruleEngineConfig;
    }

    public final String getRuleEngineStrategy() {
        return this.ruleEngineStrategy;
    }

    public final Integer getTimeLockSelfInMin() {
        return this.timeLockSelfInMin;
    }

    public final void setTimeLockSelfInMin(Integer num) {
        this.timeLockSelfInMin = num;
    }

    public KidsComplianceSettings(List<String> list, String str, Integer num, List<String> list2, String str2, String str3, String str4, String str5, String str6, String str7, AgeAppealMenu ageAppealMenu) {
        this.blackSetting = list;
        this.complianceEncrypt = str;
        this.timeLockSelfInMin = num;
        this.kidsEvents = list2;
        this.interfaceControlSettingsString = str2;
        this.kmReportReasons = str3;
        this.heliosSettings = str4;
        this.ruleEngineConfig = str5;
        this.ruleEngineStrategy = str6;
        this.bpeaLimitConfig = str7;
        this.ageAppealMenu = ageAppealMenu;
    }

    public /* synthetic */ KidsComplianceSettings(List list, String str, Integer num, List list2, String str2, String str3, String str4, String str5, String str6, String str7, AgeAppealMenu ageAppealMenu, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? 0 : num, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) == 0 ? ageAppealMenu : null);
    }
}
