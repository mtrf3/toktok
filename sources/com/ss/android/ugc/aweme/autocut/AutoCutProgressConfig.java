package com.ss.android.ugc.aweme.autocut;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.bytedance.ies.abmock.SettingsManager;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AutoCutProgressConfig {
    public static final AutoCutProgressSetting LIZ;

    /* loaded from: classes8.dex */
    public static final class AutoCutStepProgressConfig {

        @InterfaceC65349Pkn("progress")
        public final int progress;

        @InterfaceC65349Pkn("update_count")
        public final int updateCount;

        @InterfaceC65349Pkn("update_interval")
        public final long updateInterval;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public AutoCutStepProgressConfig() {
            /*
                r7 = this;
                r1 = 0
                r2 = 0
                r5 = 7
                r6 = 0
                r0 = r7
                r4 = r1
                r0.<init>(r1, r2, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.autocut.AutoCutProgressConfig.AutoCutStepProgressConfig.<init>():void");
        }

        public static /* synthetic */ AutoCutStepProgressConfig copy$default(AutoCutStepProgressConfig autoCutStepProgressConfig, int i, long j, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = autoCutStepProgressConfig.progress;
            }
            if ((i3 & 2) != 0) {
                j = autoCutStepProgressConfig.updateInterval;
            }
            if ((i3 & 4) != 0) {
                i2 = autoCutStepProgressConfig.updateCount;
            }
            return autoCutStepProgressConfig.copy(i, j, i2);
        }

        public final AutoCutStepProgressConfig copy(int i, long j, int i2) {
            return new AutoCutStepProgressConfig(i, j, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AutoCutStepProgressConfig)) {
                return false;
            }
            AutoCutStepProgressConfig autoCutStepProgressConfig = (AutoCutStepProgressConfig) obj;
            return this.progress == autoCutStepProgressConfig.progress && this.updateInterval == autoCutStepProgressConfig.updateInterval && this.updateCount == autoCutStepProgressConfig.updateCount;
        }

        public int hashCode() {
            return JBR.LIZJ(this.updateInterval, this.progress * 31, 31) + this.updateCount;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AutoCutStepProgressConfig(progress=");
            LIZ.append(this.progress);
            LIZ.append(", updateInterval=");
            LIZ.append(this.updateInterval);
            LIZ.append(", updateCount=");
            return b0.LIZJ(LIZ, this.updateCount, ')', LIZ);
        }

        public final int getProgress() {
            return this.progress;
        }

        public final int getUpdateCount() {
            return this.updateCount;
        }

        public final long getUpdateInterval() {
            return this.updateInterval;
        }

        public AutoCutStepProgressConfig(int i, long j, int i2) {
            this.progress = i;
            this.updateInterval = j;
            this.updateCount = i2;
        }

        public /* synthetic */ AutoCutStepProgressConfig(int i, long j, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0L : j, (i3 & 4) != 0 ? 0 : i2);
        }
    }

    /* loaded from: classes8.dex */
    public static final class AutoCutStepSetting {

        @InterfaceC65349Pkn("download_music")
        public final AutoCutStepProgressConfig downloadConfig;

        @InterfaceC65349Pkn("req_music_list")
        public final AutoCutStepProgressConfig reqMusicListConfig;

        @InterfaceC65349Pkn("req_nle")
        public final AutoCutStepProgressConfig reqNLEConfig;

        public static /* synthetic */ AutoCutStepSetting copy$default(AutoCutStepSetting autoCutStepSetting, AutoCutStepProgressConfig autoCutStepProgressConfig, AutoCutStepProgressConfig autoCutStepProgressConfig2, AutoCutStepProgressConfig autoCutStepProgressConfig3, int i, Object obj) {
            if ((i & 1) != 0) {
                autoCutStepProgressConfig = autoCutStepSetting.reqMusicListConfig;
            }
            if ((i & 2) != 0) {
                autoCutStepProgressConfig2 = autoCutStepSetting.downloadConfig;
            }
            if ((i & 4) != 0) {
                autoCutStepProgressConfig3 = autoCutStepSetting.reqNLEConfig;
            }
            return autoCutStepSetting.copy(autoCutStepProgressConfig, autoCutStepProgressConfig2, autoCutStepProgressConfig3);
        }

        public final AutoCutStepSetting copy(AutoCutStepProgressConfig reqMusicListConfig, AutoCutStepProgressConfig downloadConfig, AutoCutStepProgressConfig reqNLEConfig) {
            o.LJIIIZ(reqMusicListConfig, "reqMusicListConfig");
            o.LJIIIZ(downloadConfig, "downloadConfig");
            o.LJIIIZ(reqNLEConfig, "reqNLEConfig");
            return new AutoCutStepSetting(reqMusicListConfig, downloadConfig, reqNLEConfig);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AutoCutStepSetting)) {
                return false;
            }
            AutoCutStepSetting autoCutStepSetting = (AutoCutStepSetting) obj;
            return o.LJ(this.reqMusicListConfig, autoCutStepSetting.reqMusicListConfig) && o.LJ(this.downloadConfig, autoCutStepSetting.downloadConfig) && o.LJ(this.reqNLEConfig, autoCutStepSetting.reqNLEConfig);
        }

        public int hashCode() {
            return this.reqNLEConfig.hashCode() + ((this.downloadConfig.hashCode() + (this.reqMusicListConfig.hashCode() * 31)) * 31);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AutoCutStepSetting(reqMusicListConfig=");
            LIZ.append(this.reqMusicListConfig);
            LIZ.append(", downloadConfig=");
            LIZ.append(this.downloadConfig);
            LIZ.append(", reqNNLEConfig=");
            LIZ.append(this.reqNLEConfig);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public final AutoCutStepProgressConfig getDownloadConfig() {
            return this.downloadConfig;
        }

        public final AutoCutStepProgressConfig getReqMusicListConfig() {
            return this.reqMusicListConfig;
        }

        public final AutoCutStepProgressConfig getReqNLEConfig() {
            return this.reqNLEConfig;
        }

        public AutoCutStepSetting(AutoCutStepProgressConfig reqMusicListConfig, AutoCutStepProgressConfig downloadConfig, AutoCutStepProgressConfig reqNLEConfig) {
            o.LJIIIZ(reqMusicListConfig, "reqMusicListConfig");
            o.LJIIIZ(downloadConfig, "downloadConfig");
            o.LJIIIZ(reqNLEConfig, "reqNLEConfig");
            this.reqMusicListConfig = reqMusicListConfig;
            this.downloadConfig = downloadConfig;
            this.reqNLEConfig = reqNLEConfig;
        }
    }

    static {
        new AutoCutProgressConfig();
        LIZ = new AutoCutProgressSetting(new AutoCutStepSetting(new AutoCutStepProgressConfig(60, 80L, 100), new AutoCutStepProgressConfig(20, 60L, 100), new AutoCutStepProgressConfig(20, 60L, 100)), new AutoCutStepSetting(new AutoCutStepProgressConfig(0, 0L, 0), new AutoCutStepProgressConfig(50, 60L, 100), new AutoCutStepProgressConfig(50, 60L, 100)));
    }

    public static final AutoCutProgressSetting LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        AutoCutProgressSetting autoCutProgressSetting = LIZ;
        AutoCutProgressSetting autoCutProgressSetting2 = (AutoCutProgressSetting) LIZLLL.LJIIIIZZ("autocut_progress_config", AutoCutProgressSetting.class, autoCutProgressSetting);
        if (autoCutProgressSetting2 == null) {
            return autoCutProgressSetting;
        }
        return autoCutProgressSetting2;
    }

    /* loaded from: classes8.dex */
    public static final class AutoCutProgressSetting {

        @InterfaceC65349Pkn("main_process")
        public final AutoCutStepSetting mainProcess;

        @InterfaceC65349Pkn("switch_process")
        public final AutoCutStepSetting switchProcess;

        public static /* synthetic */ AutoCutProgressSetting copy$default(AutoCutProgressSetting autoCutProgressSetting, AutoCutStepSetting autoCutStepSetting, AutoCutStepSetting autoCutStepSetting2, int i, Object obj) {
            if ((i & 1) != 0) {
                autoCutStepSetting = autoCutProgressSetting.mainProcess;
            }
            if ((i & 2) != 0) {
                autoCutStepSetting2 = autoCutProgressSetting.switchProcess;
            }
            return autoCutProgressSetting.copy(autoCutStepSetting, autoCutStepSetting2);
        }

        public final AutoCutProgressSetting copy(AutoCutStepSetting mainProcess, AutoCutStepSetting switchProcess) {
            o.LJIIIZ(mainProcess, "mainProcess");
            o.LJIIIZ(switchProcess, "switchProcess");
            return new AutoCutProgressSetting(mainProcess, switchProcess);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AutoCutProgressSetting)) {
                return false;
            }
            AutoCutProgressSetting autoCutProgressSetting = (AutoCutProgressSetting) obj;
            return o.LJ(this.mainProcess, autoCutProgressSetting.mainProcess) && o.LJ(this.switchProcess, autoCutProgressSetting.switchProcess);
        }

        public int hashCode() {
            return this.switchProcess.hashCode() + (this.mainProcess.hashCode() * 31);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AutoCutProgressSetting(mainProcess=");
            LIZ.append(this.mainProcess);
            LIZ.append(", switchProcess=");
            LIZ.append(this.switchProcess);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public final AutoCutStepSetting getMainProcess() {
            return this.mainProcess;
        }

        public final AutoCutStepSetting getSwitchProcess() {
            return this.switchProcess;
        }

        public AutoCutProgressSetting(AutoCutStepSetting mainProcess, AutoCutStepSetting switchProcess) {
            o.LJIIIZ(mainProcess, "mainProcess");
            o.LJIIIZ(switchProcess, "switchProcess");
            this.mainProcess = mainProcess;
            this.switchProcess = switchProcess;
        }
    }
}
