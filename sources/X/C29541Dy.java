package X;

import android.content.Intent;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.File;

/* renamed from: X.1Dy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C29541Dy implements C0EN {
    public final String LIZ;
    public final String LIZIZ;
    public boolean LIZJ;

    public final String LIZIZ() {
        if (TextUtils.isEmpty(this.LIZIZ)) {
            return this.LIZ;
        }
        return this.LIZIZ;
    }

    @Override // X.C0EN
    public void LIZ(DownloadInfo downloadInfo) {
        String str;
        C0NB.LIZIZ("LiveReplyDownloader", "onSuccess");
        long j = BM1.LJ;
        if (j == 0) {
            j = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_download_live_replay_duration");
        LIZ.LJIJJ(this.LIZIZ, "room_id");
        if (this.LIZJ) {
            str = "normal";
        } else {
            str = "schedule";
        }
        LIZ.LJIJJ(str, "download_type");
        LIZ.LJIJJ(String.valueOf(j), "anchor_id");
        LIZ.LJIJJ(Long.valueOf(downloadInfo.getDownloadTime()), "duration");
        LIZ.LJIJJ("video_page", "event_page");
        LIZ.LJIJJ(CardStruct.IStatusCode.DEFAULT, "from_source");
        LIZ.LJJIIJZLJL();
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(android.net.Uri.fromFile(new File(downloadInfo.getTargetFilePath())));
        C15380j0.LIZLLL().sendBroadcast(intent);
        if (!TextUtils.isEmpty(this.LIZIZ)) {
            C30863C9j.LIZIZ(this.LIZIZ);
        }
    }

    @Override // X.C0EN
    public void onPause(DownloadInfo downloadInfo) {
        C0NB.LIZIZ("LiveReplyDownloader", "onPause");
    }

    @Override // X.C0EN
    public void onProgress(DownloadInfo downloadInfo) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onProgress:");
        LIZ.append(downloadInfo.getDownloadProcess());
        C0NB.LIZIZ("LiveReplyDownloader", X1D.LIZIZ(LIZ));
    }

    public C29541Dy(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }

    @Override // X.C0EN
    public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        C0NB.LIZIZ("LiveReplyDownloader", "onFailed");
        if (BM1.LJ == 0) {
            ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_download_replay_failed");
        LIZ.LJIJJ(this.LIZIZ, "room_id");
        if (this.LIZJ) {
            str = "normal";
        } else {
            str = "schedule";
        }
        LIZ.LJIJJ(str, "download_type");
        LIZ.LJIJJ(baseException.getErrorMessage(), "error_msg");
        LIZ.LJIJJ(Integer.valueOf(baseException.getErrorCode()), "failed_reason");
        LIZ.LJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
        LIZ.LJJIIJZLJL();
        if (!TextUtils.isEmpty(this.LIZIZ)) {
            C30863C9j.LIZIZ(this.LIZIZ);
        }
    }

    public C29541Dy(String str, String str2, int i) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = true;
    }
}
