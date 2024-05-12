package com.ss.android.ugc.aweme.plugin;

import X.AbstractC73391SrD;
import X.C16880lQ;
import X.C1NE;
import X.C35855E5j;
import X.C47135Ieh;
import X.C48339Iy7;
import X.E4G;
import X.E5J;
import X.E5L;
import X.E5V;
import X.EnumC35839E4t;
import X.InterfaceC65349Pkn;
import X.InterfaceC79713Ax;
import X.JBR;
import X.V0N;
import X.WM7;
import X.X1D;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.plugin.clienttrigger.ConditionalStateMachine;
import com.ss.android.ugc.aweme.plugin.firstlike.FirstLikeToastData;
import com.ss.android.ugc.aweme.plugin.journey.OnboardingFlowData;
import com.ss.android.ugc.aweme.plugin.not_interested.NotInterestedTutorialData;
import com.ss.android.ugc.aweme.plugin.personalizednuj.PersonalizedNUJPreloadData;
import com.ss.android.ugc.aweme.plugin.personalizednuj.PersonalizedNUJV2Data;
import com.ss.android.ugc.aweme.plugin.progressbar.NewUserProgressModel$ProgressBarInfo;
import com.ss.android.ugc.aweme.plugin.realtimecohorts.CohortSubscribeData;
import com.ss.android.ugc.aweme.plugin.shortcuts.ShortcutsData;
import com.ss.android.ugc.aweme.plugin.tooltipprotection.TooltipProtectionModel$TooltipDataProtection;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import defpackage.q;
import defpackage.s0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public interface IPluginService {

    /* loaded from: classes7.dex */
    public static final class PluginData {
        public long LIZ;

        @InterfaceC65349Pkn("ab_expose_vid")
        public final String abExposeVid;

        @InterfaceC65349Pkn("auto_exposure_config")
        public final AutoExposureConfig autoExposureConfig;

        @InterfaceC65349Pkn("params")
        public final PluginDataWrapper configData;

        @InterfaceC65349Pkn("id")
        public final int id;

        @InterfaceC65349Pkn("instance_id")
        public final Integer instanceId;

        @InterfaceC65349Pkn("show_config")
        public final ShowConfig showConfig;

        @InterfaceC65349Pkn("timestamp")
        public final long timestamp;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PluginData)) {
                return false;
            }
            PluginData pluginData = (PluginData) obj;
            return this.id == pluginData.id && o.LJ(this.showConfig, pluginData.showConfig) && o.LJ(this.configData, pluginData.configData) && this.timestamp == pluginData.timestamp && o.LJ(this.instanceId, pluginData.instanceId) && o.LJ(this.abExposeVid, pluginData.abExposeVid) && o.LJ(this.autoExposureConfig, pluginData.autoExposureConfig) && this.LIZ == pluginData.LIZ;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4 = (this.showConfig.hashCode() + (this.id * 31)) * 31;
            PluginDataWrapper pluginDataWrapper = this.configData;
            int i = 0;
            if (pluginDataWrapper == null) {
                hashCode = 0;
            } else {
                hashCode = pluginDataWrapper.hashCode();
            }
            int LIZJ = JBR.LIZJ(this.timestamp, (hashCode4 + hashCode) * 31, 31);
            Integer num = this.instanceId;
            if (num == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = num.hashCode();
            }
            int i2 = (LIZJ + hashCode2) * 31;
            String str = this.abExposeVid;
            if (str == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str.hashCode();
            }
            int i3 = (i2 + hashCode3) * 31;
            AutoExposureConfig autoExposureConfig = this.autoExposureConfig;
            if (autoExposureConfig != null) {
                i = autoExposureConfig.hashCode();
            }
            return C16880lQ.LLJIJIL(this.LIZ) + ((i3 + i) * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PluginData(id=");
            LIZ.append(this.id);
            LIZ.append(", showConfig=");
            LIZ.append(this.showConfig);
            LIZ.append(", configData=");
            LIZ.append(this.configData);
            LIZ.append(", timestamp=");
            LIZ.append(this.timestamp);
            LIZ.append(", instanceId=");
            LIZ.append(this.instanceId);
            LIZ.append(", abExposeVid=");
            LIZ.append(this.abExposeVid);
            LIZ.append(", autoExposureConfig=");
            LIZ.append(this.autoExposureConfig);
            LIZ.append(", deviceTime=");
            return C47135Ieh.LIZIZ(LIZ, this.LIZ, ')', LIZ);
        }

        public PluginData(int i, ShowConfig showConfig, PluginDataWrapper pluginDataWrapper, long j, Integer num, String str, AutoExposureConfig autoExposureConfig, long j2) {
            o.LJIIIZ(showConfig, "showConfig");
            this.id = i;
            this.showConfig = showConfig;
            this.configData = pluginDataWrapper;
            this.timestamp = j;
            this.instanceId = num;
            this.abExposeVid = str;
            this.autoExposureConfig = autoExposureConfig;
            this.LIZ = j2;
        }
    }

    /* loaded from: classes7.dex */
    public static final class PluginDataWrapper {

        @InterfaceC65349Pkn("cohort_subscribe_data")
        public final CohortSubscribeData cohortSubscribeData;

        @InterfaceC65349Pkn("first_like_toast_data")
        public final FirstLikeToastData firstLikeToastdata;

        @InterfaceC65349Pkn("non_forced_login_region_flow_data")
        public final NonForcedLoginRegionFlow nonForcedLoginRegionFlow;

        @InterfaceC65349Pkn("video_tutorial_data")
        public final NotInterestedTutorialData notInterestedTutorialData;

        @InterfaceC65349Pkn("onboarding_flow_data")
        public final OnboardingFlowData onboardingFlowData;

        @InterfaceC65349Pkn("personalized_nuj_preload_data")
        public final PersonalizedNUJPreloadData personalizedNUJPreloadData;

        @InterfaceC65349Pkn("personalized_nuj_v2_data")
        public final PersonalizedNUJV2Data personalizedNUJV2Data;

        @InterfaceC65349Pkn("previous_login_data")
        public final PreviousLoginData previousLoginData;

        @InterfaceC65349Pkn("proactive_login_data")
        public final ProactiveLoginData proactiveLoginData;

        @InterfaceC65349Pkn("progress_bar_data")
        public final NewUserProgressModel$ProgressBarInfo progressBarData;

        @InterfaceC65349Pkn("remove_interest_selection_data")
        public final RemoveISData removeISData;

        @InterfaceC65349Pkn("remove_nuj_steps_data")
        public final Map<String, Boolean> removeNujStepConfigData;

        @InterfaceC65349Pkn("shortcut_data")
        public final ShortcutsData shortcutsData;

        @InterfaceC65349Pkn("simple_plugin_data")
        public final SimplePluginData simplePluginData;

        @InterfaceC65349Pkn("tooltips_protection_plugin_data")
        public final TooltipProtectionModel$TooltipDataProtection tooltipDataProtection;

        /* JADX WARN: Multi-variable type inference failed */
        public PluginDataWrapper() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 32767, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PluginDataWrapper)) {
                return false;
            }
            PluginDataWrapper pluginDataWrapper = (PluginDataWrapper) obj;
            return o.LJ(this.notInterestedTutorialData, pluginDataWrapper.notInterestedTutorialData) && o.LJ(this.firstLikeToastdata, pluginDataWrapper.firstLikeToastdata) && o.LJ(this.progressBarData, pluginDataWrapper.progressBarData) && o.LJ(this.cohortSubscribeData, pluginDataWrapper.cohortSubscribeData) && o.LJ(this.onboardingFlowData, pluginDataWrapper.onboardingFlowData) && o.LJ(this.shortcutsData, pluginDataWrapper.shortcutsData) && o.LJ(this.personalizedNUJV2Data, pluginDataWrapper.personalizedNUJV2Data) && o.LJ(this.nonForcedLoginRegionFlow, pluginDataWrapper.nonForcedLoginRegionFlow) && o.LJ(this.personalizedNUJPreloadData, pluginDataWrapper.personalizedNUJPreloadData) && o.LJ(this.simplePluginData, pluginDataWrapper.simplePluginData) && o.LJ(this.tooltipDataProtection, pluginDataWrapper.tooltipDataProtection) && o.LJ(this.removeISData, pluginDataWrapper.removeISData) && o.LJ(this.removeNujStepConfigData, pluginDataWrapper.removeNujStepConfigData) && o.LJ(this.previousLoginData, pluginDataWrapper.previousLoginData) && o.LJ(this.proactiveLoginData, pluginDataWrapper.proactiveLoginData);
        }

        public final String toString() {
            return "PluginDataWrapper(notInterestedTutorialData=" + this.notInterestedTutorialData + ", firstLikeToastdata=" + this.firstLikeToastdata + ", progressBarData=" + this.progressBarData + ", cohortSubscribeData=" + this.cohortSubscribeData + ", onboardingFlowData=" + this.onboardingFlowData + ", shortcutsData=" + this.shortcutsData + ", personalizedNUJV2Data=" + this.personalizedNUJV2Data + ", nonForcedLoginRegionFlow=" + this.nonForcedLoginRegionFlow + ", personalizedNUJPreloadData=" + this.personalizedNUJPreloadData + ", simplePluginData=" + this.simplePluginData + ", tooltipDataProtection=" + this.tooltipDataProtection + ", removeISData=" + this.removeISData + ", removeNujStepConfigData=" + this.removeNujStepConfigData + ", previousLoginData=" + this.previousLoginData + ", proactiveLoginData=" + this.proactiveLoginData + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5;
            int hashCode6;
            int hashCode7;
            int hashCode8;
            int hashCode9;
            int hashCode10;
            int hashCode11;
            int i;
            int hashCode12;
            int hashCode13;
            NotInterestedTutorialData notInterestedTutorialData = this.notInterestedTutorialData;
            int i2 = 0;
            if (notInterestedTutorialData == null) {
                hashCode = 0;
            } else {
                hashCode = notInterestedTutorialData.hashCode();
            }
            int i3 = hashCode * 31;
            FirstLikeToastData firstLikeToastData = this.firstLikeToastdata;
            if (firstLikeToastData == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = firstLikeToastData.hashCode();
            }
            int i4 = (i3 + hashCode2) * 31;
            NewUserProgressModel$ProgressBarInfo newUserProgressModel$ProgressBarInfo = this.progressBarData;
            if (newUserProgressModel$ProgressBarInfo == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = newUserProgressModel$ProgressBarInfo.hashCode();
            }
            int i5 = (i4 + hashCode3) * 31;
            CohortSubscribeData cohortSubscribeData = this.cohortSubscribeData;
            if (cohortSubscribeData == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = cohortSubscribeData.hashCode();
            }
            int i6 = (i5 + hashCode4) * 31;
            OnboardingFlowData onboardingFlowData = this.onboardingFlowData;
            if (onboardingFlowData == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = onboardingFlowData.hashCode();
            }
            int i7 = (i6 + hashCode5) * 31;
            ShortcutsData shortcutsData = this.shortcutsData;
            if (shortcutsData == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = shortcutsData.hashCode();
            }
            int i8 = (i7 + hashCode6) * 31;
            PersonalizedNUJV2Data personalizedNUJV2Data = this.personalizedNUJV2Data;
            if (personalizedNUJV2Data == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = personalizedNUJV2Data.hashCode();
            }
            int i9 = (i8 + hashCode7) * 31;
            NonForcedLoginRegionFlow nonForcedLoginRegionFlow = this.nonForcedLoginRegionFlow;
            if (nonForcedLoginRegionFlow == null) {
                hashCode8 = 0;
            } else {
                hashCode8 = nonForcedLoginRegionFlow.hashCode();
            }
            int i10 = (i9 + hashCode8) * 31;
            PersonalizedNUJPreloadData personalizedNUJPreloadData = this.personalizedNUJPreloadData;
            if (personalizedNUJPreloadData == null) {
                hashCode9 = 0;
            } else {
                hashCode9 = personalizedNUJPreloadData.hashCode();
            }
            int i11 = (i10 + hashCode9) * 31;
            SimplePluginData simplePluginData = this.simplePluginData;
            if (simplePluginData == null) {
                hashCode10 = 0;
            } else {
                hashCode10 = simplePluginData.hashCode();
            }
            int i12 = (i11 + hashCode10) * 31;
            TooltipProtectionModel$TooltipDataProtection tooltipProtectionModel$TooltipDataProtection = this.tooltipDataProtection;
            if (tooltipProtectionModel$TooltipDataProtection == null) {
                hashCode11 = 0;
            } else {
                hashCode11 = tooltipProtectionModel$TooltipDataProtection.hashCode();
            }
            int i13 = (i12 + hashCode11) * 31;
            RemoveISData removeISData = this.removeISData;
            if (removeISData == null) {
                i = 0;
            } else {
                boolean z = removeISData.shouldSkipIS;
                i = z;
                if (z != 0) {
                    i = 1;
                }
            }
            int i14 = (i13 + i) * 31;
            Map<String, Boolean> map = this.removeNujStepConfigData;
            if (map == null) {
                hashCode12 = 0;
            } else {
                hashCode12 = map.hashCode();
            }
            int i15 = (i14 + hashCode12) * 31;
            PreviousLoginData previousLoginData = this.previousLoginData;
            if (previousLoginData == null) {
                hashCode13 = 0;
            } else {
                hashCode13 = previousLoginData.hashCode();
            }
            int i16 = (i15 + hashCode13) * 31;
            ProactiveLoginData proactiveLoginData = this.proactiveLoginData;
            if (proactiveLoginData != null) {
                i2 = proactiveLoginData.hashCode();
            }
            return i16 + i2;
        }

        public PluginDataWrapper(NotInterestedTutorialData notInterestedTutorialData, FirstLikeToastData firstLikeToastData, NewUserProgressModel$ProgressBarInfo newUserProgressModel$ProgressBarInfo, CohortSubscribeData cohortSubscribeData, OnboardingFlowData onboardingFlowData, ShortcutsData shortcutsData, PersonalizedNUJV2Data personalizedNUJV2Data, NonForcedLoginRegionFlow nonForcedLoginRegionFlow, PersonalizedNUJPreloadData personalizedNUJPreloadData, SimplePluginData simplePluginData, TooltipProtectionModel$TooltipDataProtection tooltipProtectionModel$TooltipDataProtection, RemoveISData removeISData, Map<String, Boolean> map, PreviousLoginData previousLoginData, ProactiveLoginData proactiveLoginData) {
            this.notInterestedTutorialData = notInterestedTutorialData;
            this.firstLikeToastdata = firstLikeToastData;
            this.progressBarData = newUserProgressModel$ProgressBarInfo;
            this.cohortSubscribeData = cohortSubscribeData;
            this.onboardingFlowData = onboardingFlowData;
            this.shortcutsData = shortcutsData;
            this.personalizedNUJV2Data = personalizedNUJV2Data;
            this.nonForcedLoginRegionFlow = nonForcedLoginRegionFlow;
            this.personalizedNUJPreloadData = personalizedNUJPreloadData;
            this.simplePluginData = simplePluginData;
            this.tooltipDataProtection = tooltipProtectionModel$TooltipDataProtection;
            this.removeISData = removeISData;
            this.removeNujStepConfigData = map;
            this.previousLoginData = previousLoginData;
            this.proactiveLoginData = proactiveLoginData;
        }

        public /* synthetic */ PluginDataWrapper(NotInterestedTutorialData notInterestedTutorialData, FirstLikeToastData firstLikeToastData, NewUserProgressModel$ProgressBarInfo newUserProgressModel$ProgressBarInfo, CohortSubscribeData cohortSubscribeData, OnboardingFlowData onboardingFlowData, ShortcutsData shortcutsData, PersonalizedNUJV2Data personalizedNUJV2Data, NonForcedLoginRegionFlow nonForcedLoginRegionFlow, PersonalizedNUJPreloadData personalizedNUJPreloadData, SimplePluginData simplePluginData, TooltipProtectionModel$TooltipDataProtection tooltipProtectionModel$TooltipDataProtection, RemoveISData removeISData, Map map, PreviousLoginData previousLoginData, ProactiveLoginData proactiveLoginData, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : notInterestedTutorialData, (i & 2) != 0 ? null : firstLikeToastData, (i & 4) != 0 ? null : newUserProgressModel$ProgressBarInfo, (i & 8) != 0 ? null : cohortSubscribeData, (i & 16) != 0 ? null : onboardingFlowData, (i & 32) != 0 ? null : shortcutsData, (i & 64) != 0 ? null : personalizedNUJV2Data, (i & 128) != 0 ? null : nonForcedLoginRegionFlow, (i & 256) != 0 ? null : personalizedNUJPreloadData, (i & 512) != 0 ? null : simplePluginData, (i & 1024) != 0 ? null : tooltipProtectionModel$TooltipDataProtection, (i & 2048) != 0 ? null : removeISData, (i & 4096) != 0 ? null : map, (i & FileUtils.BUFFER_SIZE) != 0 ? null : previousLoginData, (i & 16384) == 0 ? proactiveLoginData : null);
        }
    }

    InterfaceC79713Ax backgroundThreadObserveAll(EnumC35839E4t enumC35839E4t, Observer<List<E4G>> observer);

    InterfaceC79713Ax backgroundThreadObserveFirst(EnumC35839E4t enumC35839E4t, Observer<E4G> observer);

    InterfaceC79713Ax backgroundThreadObserveFirstPluginData(EnumC35839E4t enumC35839E4t, Observer<PluginData> observer);

    List<E4G> getCurrentPluginList();

    List<PluginData> getCurrentPluginListPluginData();

    void initRealtimeFeedbackInterceptor();

    void observe(EnumC35839E4t enumC35839E4t, LifecycleOwner lifecycleOwner, AbstractC73391SrD<E4G> abstractC73391SrD);

    void observeInitialLaunchRequestResult(LifecycleOwner lifecycleOwner, AbstractC73391SrD<E5L> abstractC73391SrD);

    InterfaceC79713Ax observeInitialLaunchRequestResultForever(Observer<E5L> observer);

    void runClientExperimentUploadTask();

    void startPluginRequest(Boolean bool, E5V e5v, Boolean bool2, Boolean bool3, boolean z, int i);

    void subscribeInit(E5J e5j);

    void tryInit();

    /* loaded from: classes7.dex */
    public static final class ABExperimentNode {

        @InterfaceC65349Pkn("ab_group")
        public final String abGroup;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ABExperimentNode) && o.LJ(this.abGroup, ((ABExperimentNode) obj).abGroup);
        }

        public final int hashCode() {
            String str = this.abGroup;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ABExperimentNode(abGroup=");
            return q.LIZIZ(LIZ, this.abGroup, ')', LIZ);
        }

        public ABExperimentNode(String str) {
            this.abGroup = str;
        }
    }

    /* loaded from: classes7.dex */
    public static final class AutoExposureConfig {

        @InterfaceC65349Pkn("type")
        public final ExposureType exposureType;

        @InterfaceC65349Pkn("full_expose_vid")
        public final String fullExposureVid;

        @InterfaceC65349Pkn("precise_expose_vid")
        public final String preciseExposureVid;

        /* JADX WARN: Multi-variable type inference failed */
        public AutoExposureConfig() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AutoExposureConfig)) {
                return false;
            }
            AutoExposureConfig autoExposureConfig = (AutoExposureConfig) obj;
            return this.exposureType == autoExposureConfig.exposureType && o.LJ(this.fullExposureVid, autoExposureConfig.fullExposureVid) && o.LJ(this.preciseExposureVid, autoExposureConfig.preciseExposureVid);
        }

        public final int hashCode() {
            ExposureType exposureType = this.exposureType;
            int hashCode = (exposureType == null ? 0 : exposureType.hashCode()) * 31;
            String str = this.fullExposureVid;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.preciseExposureVid;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AutoExposureConfig(exposureType=");
            LIZ.append(this.exposureType);
            LIZ.append(", fullExposureVid=");
            LIZ.append(this.fullExposureVid);
            LIZ.append(", preciseExposureVid=");
            return q.LIZIZ(LIZ, this.preciseExposureVid, ')', LIZ);
        }

        /* loaded from: classes7.dex */
        public enum ExposureType {
            PRECISE(0),
            FULL(1),
            FULL_AND_PRECISE(2);

            public final int LJLIL;

            public static ExposureType valueOf(String str) {
                return (ExposureType) V0N.LJJJ(ExposureType.class, str);
            }

            public final int getValue() {
                return this.LJLIL;
            }

            ExposureType(int i) {
                this.LJLIL = i;
            }
        }

        public AutoExposureConfig(ExposureType exposureType, String str, String str2) {
            this.exposureType = exposureType;
            this.fullExposureVid = str;
            this.preciseExposureVid = str2;
        }

        public /* synthetic */ AutoExposureConfig(ExposureType exposureType, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : exposureType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
        }
    }

    /* loaded from: classes7.dex */
    public static final class ClientTriggerConfig {

        @InterfaceC65349Pkn("enable")
        public final Boolean enable;

        @InterfaceC65349Pkn("max_queue_size")
        public final Integer maxQueueSize;

        @InterfaceC65349Pkn("missed_et_track_window")
        public final Long missedEtTrackingWindowMs;

        @InterfaceC65349Pkn("vid")
        public final String vid;

        /* JADX WARN: Multi-variable type inference failed */
        public ClientTriggerConfig() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClientTriggerConfig)) {
                return false;
            }
            ClientTriggerConfig clientTriggerConfig = (ClientTriggerConfig) obj;
            return o.LJ(this.enable, clientTriggerConfig.enable) && o.LJ(this.maxQueueSize, clientTriggerConfig.maxQueueSize) && o.LJ(this.missedEtTrackingWindowMs, clientTriggerConfig.missedEtTrackingWindowMs) && o.LJ(this.vid, clientTriggerConfig.vid);
        }

        public final int hashCode() {
            Boolean bool = this.enable;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Integer num = this.maxQueueSize;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Long l = this.missedEtTrackingWindowMs;
            int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
            String str = this.vid;
            return hashCode3 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ClientTriggerConfig(enable=");
            LIZ.append(this.enable);
            LIZ.append(", maxQueueSize=");
            LIZ.append(this.maxQueueSize);
            LIZ.append(", missedEtTrackingWindowMs=");
            LIZ.append(this.missedEtTrackingWindowMs);
            LIZ.append(", vid=");
            return q.LIZIZ(LIZ, this.vid, ')', LIZ);
        }

        public ClientTriggerConfig(Boolean bool, Integer num, Long l, String str) {
            this.enable = bool;
            this.maxQueueSize = num;
            this.missedEtTrackingWindowMs = l;
            this.vid = str;
        }

        public /* synthetic */ ClientTriggerConfig(Boolean bool, Integer num, Long l, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str);
        }
    }

    /* loaded from: classes7.dex */
    public static final class CurrentStoreRegion {

        @InterfaceC65349Pkn("country_code")
        public final String countryCode;

        @InterfaceC65349Pkn("enabled_region_option")
        public final boolean enabledRegionOption;

        @InterfaceC65349Pkn("localized_country_name")
        public final String localizedCountryName;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CurrentStoreRegion)) {
                return false;
            }
            CurrentStoreRegion currentStoreRegion = (CurrentStoreRegion) obj;
            return o.LJ(this.countryCode, currentStoreRegion.countryCode) && o.LJ(this.localizedCountryName, currentStoreRegion.localizedCountryName) && this.enabledRegionOption == currentStoreRegion.enabledRegionOption;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            String str = this.countryCode;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.localizedCountryName;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            boolean z = this.enabledRegionOption;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode2 + i;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CurrentStoreRegion(countryCode=");
            LIZ.append(this.countryCode);
            LIZ.append(", localizedCountryName=");
            LIZ.append(this.localizedCountryName);
            LIZ.append(", enabledRegionOption=");
            return C48339Iy7.LIZJ(LIZ, this.enabledRegionOption, ')', LIZ);
        }

        public CurrentStoreRegion(String str, String str2, boolean z) {
            this.countryCode = str;
            this.localizedCountryName = str2;
            this.enabledRegionOption = z;
        }

        public /* synthetic */ CurrentStoreRegion(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? true : z);
        }
    }

    /* loaded from: classes7.dex */
    public static final class NonForcedLoginRegionFlow {

        @InterfaceC65349Pkn("enable_non_forced_login_region_flow")
        public final boolean enableFlow;

        @InterfaceC65349Pkn("enable_on_app_launch")
        public final Boolean enableOnAppLaunch;

        @InterfaceC65349Pkn("frequency_post_failure")
        public final Integer frequencyPostFailure;

        @InterfaceC65349Pkn("single_account_login_type")
        public final Integer singleAccountLoginType;

        /* JADX WARN: Multi-variable type inference failed */
        public NonForcedLoginRegionFlow() {
            this(false, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NonForcedLoginRegionFlow)) {
                return false;
            }
            NonForcedLoginRegionFlow nonForcedLoginRegionFlow = (NonForcedLoginRegionFlow) obj;
            return this.enableFlow == nonForcedLoginRegionFlow.enableFlow && o.LJ(this.singleAccountLoginType, nonForcedLoginRegionFlow.singleAccountLoginType) && o.LJ(this.enableOnAppLaunch, nonForcedLoginRegionFlow.enableOnAppLaunch) && o.LJ(this.frequencyPostFailure, nonForcedLoginRegionFlow.frequencyPostFailure);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v11 */
        /* JADX WARN: Type inference failed for: r0v12 */
        public final int hashCode() {
            boolean z = this.enableFlow;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            Integer num = this.singleAccountLoginType;
            int hashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
            Boolean bool = this.enableOnAppLaunch;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num2 = this.frequencyPostFailure;
            return hashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("NonForcedLoginRegionFlow(enableFlow=");
            LIZ.append(this.enableFlow);
            LIZ.append(", singleAccountLoginType=");
            LIZ.append(this.singleAccountLoginType);
            LIZ.append(", enableOnAppLaunch=");
            LIZ.append(this.enableOnAppLaunch);
            LIZ.append(", frequencyPostFailure=");
            return s0.LIZJ(LIZ, this.frequencyPostFailure, ')', LIZ);
        }

        public NonForcedLoginRegionFlow(boolean z, Integer num, Boolean bool, Integer num2) {
            this.enableFlow = z;
            this.singleAccountLoginType = num;
            this.enableOnAppLaunch = bool;
            this.frequencyPostFailure = num2;
        }

        public /* synthetic */ NonForcedLoginRegionFlow(boolean z, Integer num, Boolean bool, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? Boolean.FALSE : bool, (i & 8) != 0 ? 0 : num2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class PreviousLoginData {

        @InterfaceC65349Pkn("ab_experiment_nodes")
        public final List<ABExperimentNode> abExperimentNodes;

        @InterfaceC65349Pkn("previous_login_nodes")
        public final List<PreviousLoginNode> previousLoginNodes;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PreviousLoginData)) {
                return false;
            }
            PreviousLoginData previousLoginData = (PreviousLoginData) obj;
            return o.LJ(this.previousLoginNodes, previousLoginData.previousLoginNodes) && o.LJ(this.abExperimentNodes, previousLoginData.abExperimentNodes);
        }

        public final int hashCode() {
            return this.abExperimentNodes.hashCode() + (this.previousLoginNodes.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PreviousLoginData(previousLoginNodes=");
            LIZ.append(this.previousLoginNodes);
            LIZ.append(", abExperimentNodes=");
            return C1NE.LIZIZ(LIZ, this.abExperimentNodes, ')', LIZ);
        }

        public PreviousLoginData(List<PreviousLoginNode> previousLoginNodes, List<ABExperimentNode> abExperimentNodes) {
            o.LJIIIZ(previousLoginNodes, "previousLoginNodes");
            o.LJIIIZ(abExperimentNodes, "abExperimentNodes");
            this.previousLoginNodes = previousLoginNodes;
            this.abExperimentNodes = abExperimentNodes;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PreviousLoginNode {

        @InterfaceC65349Pkn("detail")
        public final String detail;

        @InterfaceC65349Pkn("method")
        public final Integer method;

        @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
        public final Integer scene;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PreviousLoginNode)) {
                return false;
            }
            PreviousLoginNode previousLoginNode = (PreviousLoginNode) obj;
            return o.LJ(this.detail, previousLoginNode.detail) && o.LJ(this.method, previousLoginNode.method) && o.LJ(this.scene, previousLoginNode.scene);
        }

        public final int hashCode() {
            String str = this.detail;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.method;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.scene;
            return hashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PreviousLoginNode(detail=");
            LIZ.append(this.detail);
            LIZ.append(", method=");
            LIZ.append(this.method);
            LIZ.append(", scene=");
            return s0.LIZJ(LIZ, this.scene, ')', LIZ);
        }

        public PreviousLoginNode(String str, Integer num, Integer num2) {
            this.detail = str;
            this.method = num;
            this.scene = num2;
        }
    }

    /* loaded from: classes7.dex */
    public static final class ProactiveLoginData {

        @InterfaceC65349Pkn("expiration_offset_end_millis")
        public final Long expirationOffsetEndtMillis;

        @InterfaceC65349Pkn("expiration_offset_start_millis")
        public final Long expirationOffsetStartMillis;

        @InterfaceC65349Pkn("title_text_login")
        public final String titleTextLogin;

        @InterfaceC65349Pkn("title_text_signup")
        public final String titleTextSignup;

        @InterfaceC65349Pkn("vv_trigger_threshold")
        public final Integer vvTriggerThreshold;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProactiveLoginData)) {
                return false;
            }
            ProactiveLoginData proactiveLoginData = (ProactiveLoginData) obj;
            return o.LJ(this.titleTextLogin, proactiveLoginData.titleTextLogin) && o.LJ(this.titleTextSignup, proactiveLoginData.titleTextSignup) && o.LJ(this.expirationOffsetStartMillis, proactiveLoginData.expirationOffsetStartMillis) && o.LJ(this.expirationOffsetEndtMillis, proactiveLoginData.expirationOffsetEndtMillis) && o.LJ(this.vvTriggerThreshold, proactiveLoginData.vvTriggerThreshold);
        }

        public final int hashCode() {
            String str = this.titleTextLogin;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.titleTextSignup;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Long l = this.expirationOffsetStartMillis;
            int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
            Long l2 = this.expirationOffsetEndtMillis;
            int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
            Integer num = this.vvTriggerThreshold;
            return hashCode4 + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ProactiveLoginData(titleTextLogin=");
            LIZ.append(this.titleTextLogin);
            LIZ.append(", titleTextSignup=");
            LIZ.append(this.titleTextSignup);
            LIZ.append(", expirationOffsetStartMillis=");
            LIZ.append(this.expirationOffsetStartMillis);
            LIZ.append(", expirationOffsetEndtMillis=");
            LIZ.append(this.expirationOffsetEndtMillis);
            LIZ.append(", vvTriggerThreshold=");
            return s0.LIZJ(LIZ, this.vvTriggerThreshold, ')', LIZ);
        }

        public ProactiveLoginData(String str, String str2, Long l, Long l2, Integer num) {
            this.titleTextLogin = str;
            this.titleTextSignup = str2;
            this.expirationOffsetStartMillis = l;
            this.expirationOffsetEndtMillis = l2;
            this.vvTriggerThreshold = num;
        }
    }

    /* loaded from: classes7.dex */
    public static final class RemoveISData {

        @InterfaceC65349Pkn("should_skip_interest_selection")
        public final boolean shouldSkipIS;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoveISData) && this.shouldSkipIS == ((RemoveISData) obj).shouldSkipIS;
        }

        public final int hashCode() {
            boolean z = this.shouldSkipIS;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("RemoveISData(shouldSkipIS=");
            return C48339Iy7.LIZJ(LIZ, this.shouldSkipIS, ')', LIZ);
        }

        public RemoveISData(boolean z) {
            this.shouldSkipIS = z;
        }
    }

    /* loaded from: classes7.dex */
    public static final class SimplePluginData {

        @InterfaceC65349Pkn("ab_group")
        public final int abGroup;

        @InterfaceC65349Pkn("kv_list")
        public final List<SpKvItem> kvList;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SimplePluginData)) {
                return false;
            }
            SimplePluginData simplePluginData = (SimplePluginData) obj;
            return this.abGroup == simplePluginData.abGroup && o.LJ(this.kvList, simplePluginData.kvList);
        }

        public final int hashCode() {
            int i = this.abGroup * 31;
            List<SpKvItem> list = this.kvList;
            return i + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SimplePluginData(abGroup=");
            LIZ.append(this.abGroup);
            LIZ.append(", kvList=");
            return C1NE.LIZIZ(LIZ, this.kvList, ')', LIZ);
        }

        public SimplePluginData(int i, List<SpKvItem> list) {
            this.abGroup = i;
            this.kvList = list;
        }
    }

    /* loaded from: classes7.dex */
    public static final class SpKvItem {

        @InterfaceC65349Pkn("bool_value")
        public final String boolValue;

        @InterfaceC65349Pkn("int_value")
        public final String intValue;

        @InterfaceC65349Pkn("key")
        public final String key;

        @InterfaceC65349Pkn("string_value")
        public final String stringValue;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpKvItem)) {
                return false;
            }
            SpKvItem spKvItem = (SpKvItem) obj;
            return o.LJ(this.key, spKvItem.key) && o.LJ(this.stringValue, spKvItem.stringValue) && o.LJ(this.intValue, spKvItem.intValue) && o.LJ(this.boolValue, spKvItem.boolValue);
        }

        public final int hashCode() {
            int hashCode = this.key.hashCode() * 31;
            String str = this.stringValue;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.intValue;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.boolValue;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SpKvItem(key=");
            LIZ.append(this.key);
            LIZ.append(", stringValue=");
            LIZ.append(this.stringValue);
            LIZ.append(", intValue=");
            LIZ.append(this.intValue);
            LIZ.append(", boolValue=");
            return q.LIZIZ(LIZ, this.boolValue, ')', LIZ);
        }

        public SpKvItem(String key, String str, String str2, String str3) {
            o.LJIIIZ(key, "key");
            this.key = key;
            this.stringValue = str;
            this.intValue = str2;
            this.boolValue = str3;
        }
    }

    /* loaded from: classes7.dex */
    public static final class ShowType {

        @InterfaceC65349Pkn("apply_action")
        public ApplyAction applyAction;

        @InterfaceC65349Pkn("conditional_state_machine_id")
        public final Integer conditionalStateMachineId;

        @InterfaceC65349Pkn("type")
        public final ShowTypeEnum type;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowType)) {
                return false;
            }
            ShowType showType = (ShowType) obj;
            return this.type == showType.type && o.LJ(this.conditionalStateMachineId, showType.conditionalStateMachineId) && this.applyAction == showType.applyAction;
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            Integer num = this.conditionalStateMachineId;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            ApplyAction applyAction = this.applyAction;
            return hashCode2 + (applyAction != null ? applyAction.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ShowType(type=");
            LIZ.append(this.type);
            LIZ.append(", conditionalStateMachineId=");
            LIZ.append(this.conditionalStateMachineId);
            LIZ.append(", applyAction=");
            LIZ.append(this.applyAction);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        /* loaded from: classes7.dex */
        public enum ApplyAction {
            ENABLE(1),
            ENABLE_REALTIME_ONLY(2);

            public final int LJLIL;

            public static ApplyAction valueOf(String str) {
                return (ApplyAction) V0N.LJJJ(ApplyAction.class, str);
            }

            public final int getValue() {
                return this.LJLIL;
            }

            ApplyAction(int i) {
                this.LJLIL = i;
            }
        }

        /* loaded from: classes7.dex */
        public enum ShowTypeEnum {
            CONDITIONAL_SHOW(100);

            public final int LJLIL;

            public static ShowTypeEnum valueOf(String str) {
                return (ShowTypeEnum) V0N.LJJJ(ShowTypeEnum.class, str);
            }

            public final int getValue() {
                return this.LJLIL;
            }

            ShowTypeEnum(int i) {
                this.LJLIL = i;
            }
        }

        public ShowType(ShowTypeEnum type, Integer num, ApplyAction applyAction) {
            o.LJIIIZ(type, "type");
            this.type = type;
            this.conditionalStateMachineId = num;
            this.applyAction = applyAction;
        }

        public /* synthetic */ ShowType(ShowTypeEnum showTypeEnum, Integer num, ApplyAction applyAction, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(showTypeEnum, (i & 2) != 0 ? null : num, applyAction);
        }
    }

    /* loaded from: classes7.dex */
    public enum ReinstallCheck {
        REINSTALL_CHECK_UNKNOWN(0),
        REINSTALL(1),
        NON_REINSTALL(2);

        public static final C35855E5j Companion = new C35855E5j();
        public final int LJLIL;

        public static ReinstallCheck valueOf(String str) {
            return (ReinstallCheck) V0N.LJJJ(ReinstallCheck.class, str);
        }

        public final int getValue() {
            return this.LJLIL;
        }

        ReinstallCheck(int i) {
            this.LJLIL = i;
        }
    }

    /* loaded from: classes7.dex */
    public static final class ShowConfig {

        @InterfaceC65349Pkn("should_show")
        public Boolean shouldShow;

        @InterfaceC65349Pkn("show_type")
        public final ShowType showType;

        /* JADX WARN: Multi-variable type inference failed */
        public ShowConfig() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowConfig)) {
                return false;
            }
            ShowConfig showConfig = (ShowConfig) obj;
            return o.LJ(this.shouldShow, showConfig.shouldShow) && o.LJ(this.showType, showConfig.showType);
        }

        public final int hashCode() {
            Boolean bool = this.shouldShow;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            ShowType showType = this.showType;
            return hashCode + (showType != null ? showType.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ShowConfig(shouldShow=");
            LIZ.append(this.shouldShow);
            LIZ.append(", showType=");
            LIZ.append(this.showType);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public ShowConfig(Boolean bool, ShowType showType) {
            this.shouldShow = bool;
            this.showType = showType;
        }

        public /* synthetic */ ShowConfig(Boolean bool, ShowType showType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : showType);
        }
    }

    /* loaded from: classes7.dex */
    public static final class PluginConfigResponse {

        @InterfaceC65349Pkn("client_trigger_config")
        public final ClientTriggerConfig clientTriggerConfig;

        @InterfaceC65349Pkn("current_store_region")
        public final CurrentStoreRegion currentStoreRegion;

        @InterfaceC65349Pkn("android_device_reinstall_check")
        public final ReinstallCheck deviceCheckResult;

        @InterfaceC65349Pkn("ug_feature_list")
        public final List<PluginData> featureList;

        @InterfaceC65349Pkn("conditional_state_machines")
        public final List<ConditionalStateMachine> stateMachine;

        /* JADX WARN: Multi-variable type inference failed */
        public PluginConfigResponse() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PluginConfigResponse)) {
                return false;
            }
            PluginConfigResponse pluginConfigResponse = (PluginConfigResponse) obj;
            return this.deviceCheckResult == pluginConfigResponse.deviceCheckResult && o.LJ(this.featureList, pluginConfigResponse.featureList) && o.LJ(this.stateMachine, pluginConfigResponse.stateMachine) && o.LJ(this.clientTriggerConfig, pluginConfigResponse.clientTriggerConfig) && o.LJ(this.currentStoreRegion, pluginConfigResponse.currentStoreRegion);
        }

        public final int hashCode() {
            ReinstallCheck reinstallCheck = this.deviceCheckResult;
            int hashCode = (reinstallCheck == null ? 0 : reinstallCheck.hashCode()) * 31;
            List<PluginData> list = this.featureList;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            List<ConditionalStateMachine> list2 = this.stateMachine;
            int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            ClientTriggerConfig clientTriggerConfig = this.clientTriggerConfig;
            int hashCode4 = (hashCode3 + (clientTriggerConfig == null ? 0 : clientTriggerConfig.hashCode())) * 31;
            CurrentStoreRegion currentStoreRegion = this.currentStoreRegion;
            return hashCode4 + (currentStoreRegion != null ? currentStoreRegion.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PluginConfigResponse(deviceCheckResult=");
            LIZ.append(this.deviceCheckResult);
            LIZ.append(", featureList=");
            LIZ.append(this.featureList);
            LIZ.append(", stateMachine=");
            LIZ.append(this.stateMachine);
            LIZ.append(", clientTriggerConfig=");
            LIZ.append(this.clientTriggerConfig);
            LIZ.append(", currentStoreRegion=");
            LIZ.append(this.currentStoreRegion);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public PluginConfigResponse(ReinstallCheck reinstallCheck, List<PluginData> list, List<ConditionalStateMachine> list2, ClientTriggerConfig clientTriggerConfig, CurrentStoreRegion currentStoreRegion) {
            this.deviceCheckResult = reinstallCheck;
            this.featureList = list;
            this.stateMachine = list2;
            this.clientTriggerConfig = clientTriggerConfig;
            this.currentStoreRegion = currentStoreRegion;
        }

        public /* synthetic */ PluginConfigResponse(ReinstallCheck reinstallCheck, List list, List list2, ClientTriggerConfig clientTriggerConfig, CurrentStoreRegion currentStoreRegion, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : reinstallCheck, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : clientTriggerConfig, (i & 16) == 0 ? currentStoreRegion : null);
        }
    }
}
