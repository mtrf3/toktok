package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.discover.hitrank.RankApi;
import com.ss.android.ugc.aweme.services.RetrofitService;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.3Hx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81533Hx {
    public static RankApi LIZ;

    public static void LIZ(final int i, final String str, final String str2, final List list) {
        HG3.LJIIL();
        if (!HG3.LJLJL.LJFF().isLogin()) {
            return;
        }
        if (LIZ == null) {
            LIZ = (RankApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(EFJ.LIZJ).create(RankApi.class);
        }
        C10K.LIZJ(new Callable() { // from class: X.3Hy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                RankApi rankApi = C81533Hx.LIZ;
                o.LJI(rankApi);
                C76L<BaseResponse> finishHitRankTask = rankApi.finishHitRankTask(str, 1, i, list, str2);
                if (finishHitRankTask != null) {
                    return finishHitRankTask.get();
                }
                return null;
            }
        });
    }
}
