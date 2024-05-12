package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.external.AVCameraInitTask;
import com.ss.android.ugc.aweme.external.AVCleanStorageTask;
import com.ss.android.ugc.aweme.external.AVCleanWatermarkFilesTask;
import com.ss.android.ugc.aweme.external.DownloadCameraWidgetGuide;
import com.ss.android.ugc.aweme.external.DownloadSuperEntranceResTask;
import com.ss.android.ugc.aweme.external.InstallBytevc1enc8PluginTask;
import com.ss.android.ugc.aweme.external.InstallLiveQuicPluginTask;
import com.ss.android.ugc.aweme.external.PreDownloadEffectModel;
import com.ss.android.ugc.aweme.external.PrefetchSeriesCreation;
import com.ss.android.ugc.aweme.external.ReportAppExitInfoTask;
import com.ss.android.ugc.aweme.services.external.IInitTaskService;

/* renamed from: X.Edv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36895Edv implements IInitTaskService {
    @Override // com.ss.android.ugc.aweme.services.external.IInitTaskService
    public final EE1 initTask(int i) {
        switch (i) {
            case 1:
                return new AVCleanStorageTask();
            case 2:
            case 3:
            case 8:
            case 14:
            case 15:
            default:
                return null;
            case 4:
                return new AVCameraInitTask();
            case 5:
                return new DownloadSuperEntranceResTask();
            case 6:
                return new ReportAppExitInfoTask();
            case 7:
                return new AVCameraInitTask.InitCBClickTrack();
            case 9:
                return new AVCameraInitTask.PostedDraftConvertToNormal();
            case 10:
                return new AVCameraInitTask.InitToolsActivityListener();
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return new DownloadCameraWidgetGuide();
            case 12:
                return new AVCleanWatermarkFilesTask();
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return new PreDownloadEffectModel();
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return new PrefetchSeriesCreation();
            case 17:
                return new InstallLiveQuicPluginTask();
            case 18:
                return new InstallBytevc1enc8PluginTask();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.IInitTaskService
    public final Runnable initTask(int i, Object obj) {
        if (i == 3) {
            return RunnableC36896Edw.LJLIL;
        }
        return null;
    }
}
