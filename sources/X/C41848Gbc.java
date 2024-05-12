package X;

import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.ForwardVideo;
import com.ss.android.ugc.aweme.canvas.VideoDownloadPartialResult;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEDownloaderConfig;
import com.ss.android.vesdk.VEFileDownloader;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.Gbc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41848Gbc implements ForwardMediaDownloader {
    public static final C41848Gbc LIZ = new C41848Gbc();
    public static final java.util.Map<String, VEFileDownloader> LIZIZ = new LinkedHashMap();
    public static final java.util.Map<String, Integer> LIZJ = new LinkedHashMap();
    public static final java.util.Map<String, E0S> LIZLLL = new LinkedHashMap();

    public static void LIZ(String str) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("cancelDownload for url:");
        LIZ2.append(str);
        LIZLLL(X1D.LIZIZ(LIZ2));
        java.util.Map<String, VEFileDownloader> map = LIZIZ;
        synchronized (map) {
            VEFileDownloader vEFileDownloader = (VEFileDownloader) ((LinkedHashMap) map).get(str);
            if (vEFileDownloader != null) {
                vEFileDownloader.destroyFileDownload();
            }
            map.remove(str);
        }
        java.util.Map<String, E0S> map2 = LIZLLL;
        synchronized (map2) {
            E0S e0s = (E0S) ((LinkedHashMap) map2).get(str);
            if (e0s != null) {
                e0s.LIZIZ();
            }
            map2.remove(str);
        }
    }

    public static int LIZJ(VideoPublishEditModel videoPublishEditModel) {
        String str;
        Integer num;
        CanvasVideoData canvasVideoData;
        List<String> sourceInfo;
        if (videoPublishEditModel != null && (canvasVideoData = videoPublishEditModel.canvasVideoData) != null && (sourceInfo = canvasVideoData.getSourceInfo()) != null) {
            str = (String) ORZ.LJLLLL(sourceInfo);
        } else {
            str = null;
        }
        if (str == null || str.length() == 0 || (num = (Integer) ((LinkedHashMap) LIZJ).get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    public static void LIZLLL(String str) {
        FP1.LJ("StreamEditDownloader->", str);
    }

    public static int LIZIZ(int i, String str) {
        int i2;
        java.util.Map<String, VEFileDownloader> map = LIZIZ;
        synchronized (map) {
            VEFileDownloader vEFileDownloader = (VEFileDownloader) ((LinkedHashMap) map).get(str);
            if (vEFileDownloader != null) {
                i2 = vEFileDownloader.getBufferTimeWithTimestamp(i);
            } else {
                i2 = -1;
            }
        }
        return i2;
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader
    public final void download(ForwardVideo video, ForwardMediaDownloader.DownloadConfig downloadConfig, VideoDownloadPartialResult videoDownloadPartialResult, ForwardMediaDownloader.DownloadListener callback) {
        long j;
        o.LJIIIZ(video, "video");
        o.LJIIIZ(downloadConfig, "downloadConfig");
        o.LJIIIZ(callback, "callback");
        String downloadUrl = ForwardMediaKt.getDownloadUrl(video);
        if (downloadUrl.length() == 0) {
            return;
        }
        C44428Hc8 LIZ2 = C44428Hc8.LIZ();
        long LIZIZ2 = LIZ2.LIZIZ(TimeUnit.MILLISECONDS);
        int sourceDuration = video.getSourceDuration();
        if (videoDownloadPartialResult != null) {
            j = videoDownloadPartialResult.getCacheSizeFromZero();
        } else {
            j = 0;
        }
        LJ(this, 0, LIZIZ2, sourceDuration, j, null, 48);
        VEFileDownloader vEFileDownloader = new VEFileDownloader();
        VEDownloaderConfig vEDownloaderConfig = new VEDownloaderConfig(downloadUrl, downloadConfig.getCacheDir());
        if (videoDownloadPartialResult != null) {
            vEDownloaderConfig.externalPath = videoDownloadPartialResult.getLocalFilePath();
            vEDownloaderConfig.externalFirstSegOffset = videoDownloadPartialResult.getCacheSizeFromZero();
            vEDownloaderConfig.externalMediaSize = videoDownloadPartialResult.getMediaSize();
        }
        E0S e0s = new E0S();
        e0s.LIZ(new C41847Gbb(LIZ2, video, videoDownloadPartialResult, callback, downloadUrl));
        vEFileDownloader.createFileDownload(vEDownloaderConfig, e0s);
        java.util.Map<String, VEFileDownloader> map = LIZIZ;
        synchronized (map) {
            map.put(downloadUrl, vEFileDownloader);
        }
        java.util.Map<String, E0S> map2 = LIZLLL;
        synchronized (map2) {
            map2.put(downloadUrl, e0s);
        }
        StringBuilder LIZIZ3 = C25620zW.LIZIZ("start download for url:", downloadUrl, ",cacheDir:");
        LIZIZ3.append(vEDownloaderConfig.cacheDir);
        LIZLLL(X1D.LIZIZ(LIZIZ3));
    }

    public static void LJ(C41848Gbc c41848Gbc, int i, long j, int i2, long j2, InterfaceC88472Yns interfaceC88472Yns, int i3) {
        String str;
        if ((i3 & 16) != 0) {
            str = "video";
        } else {
            str = null;
        }
        if ((i3 & 32) != 0) {
            interfaceC88472Yns = C41849Gbd.LJLIL;
        }
        c41848Gbc.getClass();
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZ(i, "status");
        c145995oB.LJI("source_type", str);
        c145995oB.LIZIZ(j, "total_time");
        c145995oB.LIZ(i2, "source_video_duration");
        c145995oB.LIZIZ(j2, "external_cache_size");
        interfaceC88472Yns.invoke(c145995oB);
        GXR.LIZ("tool_performance_stream_edit_downloader", c145995oB.LIZ);
    }
}
