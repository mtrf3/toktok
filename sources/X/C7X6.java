package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.models.NowArchiveFeedResponse;
import com.ss.android.ugc.aweme.models.NowArchiveRequest;
import com.ss.android.ugc.aweme.models.NowArchiveResponse;
import com.ss.android.ugc.aweme.nows.api.INowApi;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7X6, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7X6 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C7X5.LJLIL);

    public static INowApi LIZJ() {
        return (INowApi) LIZ.getValue();
    }

    public static NowArchiveResponse LIZ(NowArchiveRequest nowArchiveRequest) {
        NowArchiveResponse nowArchiveResponse = LIZJ().fetchArchiveData(nowArchiveRequest.cursor, nowArchiveRequest.count, nowArchiveRequest.loadType).execute().LIZIZ;
        o.LJIIIIZZ(nowArchiveResponse, "api.fetchArchiveData(req…oadType).execute().body()");
        return nowArchiveResponse;
    }

    public static BaseResponse LJ(String str, String str2) {
        BaseResponse baseResponse = LIZJ().updateLikeStatus(str, str2, "199", null, null).execute().LIZIZ;
        o.LJIIIIZZ(baseResponse, "api.updateLikeStatus(aid…terFrom).execute().body()");
        return baseResponse;
    }

    public static NowArchiveFeedResponse LIZLLL(int i, long j, String str) {
        NowArchiveFeedResponse nowArchiveFeedResponse = LIZJ().getNowArchiveFeedList(j, i, 30L, str).execute().LIZIZ;
        o.LJIIIIZZ(nowArchiveFeedResponse, "api.getNowArchiveFeedLis…nt, aid).execute().body()");
        return nowArchiveFeedResponse;
    }

    public static InterfaceC37276Ek4 LIZIZ(long j, int i, List list, String str, int i2) {
        String str2 = str;
        if ((i2 & 16) != 0) {
            list = null;
        }
        if ((i2 & 32) != 0) {
            str2 = null;
        }
        return C7XF.LIZ(LIZJ(), j, i, 0, null, String.valueOf(list), str2, 16);
    }
}
