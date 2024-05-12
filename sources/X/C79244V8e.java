package X;

import android.content.Intent;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.DownloadLiveReplayMethod;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import java.util.HashMap;

/* renamed from: X.V8e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C79244V8e implements C0EN {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final /* synthetic */ DownloadLiveReplayMethod LJFF;

    public final String LIZIZ() {
        if (TextUtils.isEmpty(this.LIZIZ)) {
            return this.LIZ;
        }
        return this.LIZIZ;
    }

    @Override // X.C0EN
    public final void LIZ(DownloadInfo downloadInfo) {
        this.LJFF.LJJI(this.LIZ, 2, downloadInfo);
        BZI LIZ = C28787BRn.LIZ("livesdk_download_live_replay_duration");
        C0EP LJFF = C0EP.LJFF();
        int id = downloadInfo.getId();
        String str = this.LIZJ;
        LJFF.getClass();
        HashMap hashMap = new HashMap();
        C0EO<Long, Long> c0eo = LJFF.LIZ.get(Integer.valueOf(id));
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(Downloader.getInstance(C15380j0.LIZLLL()).getDownloadInfo(id).getTargetFilePath());
        String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
        if (c0eo != null) {
            hashMap.put("duration", String.valueOf(c0eo.LIZ));
        }
        hashMap.put("live_duration", extractMetadata);
        hashMap.put("room_id", str);
        hashMap.put("download_type", "normal");
        LJFF.LIZ.remove(Integer.valueOf(id));
        LIZ.LJJIFFI(hashMap);
        LIZ.LJIJJ(this.LIZLLL, "from_source");
        LIZ.LJIJJ(this.LJ, "event_page");
        if (BM1.LJ == 0) {
            LIZ.LJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
        }
        LIZ.LJJIIJZLJL();
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(android.net.Uri.fromFile(new File(downloadInfo.getTargetFilePath())));
        C15380j0.LIZLLL().sendBroadcast(intent);
        if (!TextUtils.isEmpty(this.LIZIZ)) {
            C30863C9j.LIZIZ(this.LIZIZ);
        }
    }

    @Override // X.C0EN
    public final void onPause(DownloadInfo downloadInfo) {
        this.LJFF.LJJI(this.LIZ, 3, downloadInfo);
    }

    @Override // X.C0EN
    public final void onProgress(DownloadInfo downloadInfo) {
        this.LJFF.LJJI(this.LIZ, 1, downloadInfo);
    }

    @Override // X.C0EN
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        BZI LIZ = C28787BRn.LIZ("livesdk_download_replay_failed");
        LIZ.LJIJJ(this.LIZJ, "room_id");
        LIZ.LJIJJ(this.LIZLLL, "from_source");
        LIZ.LJIJJ(this.LJ, "event_page");
        LIZ.LJIJJ("normal", "download_type");
        LIZ.LJIJJ(baseException.getErrorMessage(), "error_msg");
        LIZ.LJIJJ(Integer.valueOf(baseException.getErrorCode()), "failed_reason");
        if (BM1.LJ == 0) {
            LIZ.LJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
        }
        LIZ.LJJIIJZLJL();
        this.LJFF.LJJI(this.LIZ, 4, downloadInfo);
        if (!TextUtils.isEmpty(this.LIZIZ)) {
            C30863C9j.LIZIZ(this.LIZIZ);
        }
    }

    public C79244V8e(DownloadLiveReplayMethod downloadLiveReplayMethod, String str, String str2, String str3, String str4, String str5) {
        this.LJFF = downloadLiveReplayMethod;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
    }
}
