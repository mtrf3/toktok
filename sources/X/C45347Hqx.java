package X;

import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.Hqx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45347Hqx {
    public static final void LIZIZ(EnumC45368HrI enumC45368HrI, Aweme aweme) {
        StringBuilder sb = new StringBuilder("ForbidDownload:ForbidType:");
        sb.append(enumC45368HrI);
        if (aweme != null) {
            sb.append(",aweme_id");
            sb.append(aweme.getAid());
        }
        C1GE.LJIILL("aweme_movie_download_error_message", "download", sb.toString(), "");
    }

    public static final void LIZ(Aweme aweme, BaseException baseException, String str) {
        StringBuilder sb = new StringBuilder("DownloaderError:");
        if (baseException != null) {
            sb.append("error_code:");
            sb.append(baseException.getErrorCode());
            sb.append(",error_message:");
            sb.append(baseException.getMessage());
        }
        if (aweme != null) {
            sb.append(",aweme_id:");
            sb.append(aweme.getAid());
        }
        C1GE.LJIILL("aweme_movie_download_error_message", "download", sb.toString(), str);
    }

    public static final void LIZJ(String str, Aweme aweme, String str2) {
        C1GE.LJIILL("aweme_movie_download_error_message", "download", "WaterMark:inputPath:" + str + ",outputPath:" + str2 + ",aweme_id:" + aweme.getAid(), "");
    }
}
