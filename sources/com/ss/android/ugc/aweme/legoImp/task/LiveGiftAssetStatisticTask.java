package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C145995oB;
import X.C16880lQ;
import X.C19N;
import X.C39698Fi2;
import X.C56463MDz;
import X.C62046OWs;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FMX;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.io.File;
import java.util.List;

/* loaded from: classes7.dex */
public final class LiveGiftAssetStatisticTask implements EE1 {

    /* loaded from: classes7.dex */
    public static final class LiveEnableReportEffectCacheSizeAfterAppLaunch {
        public static final boolean DEFAULT = true;
        public static final LiveEnableReportEffectCacheSizeAfterAppLaunch INSTANCE = new LiveEnableReportEffectCacheSizeAfterAppLaunch();

        public final boolean getValue() {
            return C19N.LJ("enable_report_gift_asset_size_background", true);
        }
    }

    @Override // X.EEY
    public final String key() {
        return "LiveGiftAssetStatisticTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final int targetProcess() {
        return 1;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.APP_BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        File LLIIJLIL;
        File parentFile;
        String absolutePath;
        int i;
        String[] list;
        LiveOuterService.LJJJLL().LJJIZ().LJJJJIZL();
        if (!C62046OWs.LJFF("livesdk_gift_assets_info", 0.1d)) {
            return;
        }
        Keva repo = Keva.getRepo("live_gift");
        if (!LiveEnableReportEffectCacheSizeAfterAppLaunch.INSTANCE.getValue() || context == null || (LLIIJLIL = C16880lQ.LLIIJLIL(context)) == null || (parentFile = LLIIJLIL.getParentFile()) == null || (absolutePath = new File(parentFile, "app_assets").getAbsolutePath()) == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - repo.getLong("gift_asset_disk_timestamp", 0L);
        if (j <= 86400000) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long LJ = C56463MDz.LJ(absolutePath);
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        File file = new File(absolutePath);
        if (file.exists() && file.isDirectory() && (list = file.list(C39698Fi2.LIZ)) != null) {
            i = list.length;
        } else {
            i = 0;
        }
        long elapsedRealtime3 = SystemClock.elapsedRealtime();
        C145995oB c145995oB = new C145995oB();
        long j2 = 1048576;
        c145995oB.LIZIZ(LJ / j2, "cache_size");
        c145995oB.LIZIZ(elapsedRealtime2 - elapsedRealtime, "calculate_cache_size_duration");
        c145995oB.LIZ(i, "local_resources_count");
        c145995oB.LIZIZ(elapsedRealtime3 - elapsedRealtime2, "calculate_local_resources_count_duration");
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        c145995oB.LIZIZ((statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / j2, "free_disk_size");
        c145995oB.LIZIZ(j, "last_report_pass_interval");
        c145995oB.LIZIZ(elapsedRealtime3 - elapsedRealtime, "total_duration");
        FMX.LJIIL("livesdk_gift_assets_info", c145995oB.LIZ);
        repo.storeLong("gift_asset_disk_timestamp", currentTimeMillis);
    }
}
