package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.live.Live;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.video.api.SubOnlyVideoApi;
import kotlin.jvm.internal.o;

/* renamed from: X.7UG, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7UG {
    public static final /* synthetic */ C7UG LIZ = new C7UG();
    public static final SubOnlyVideoApi LIZIZ;

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("https://");
        LiveOuterService.LJJJLL().LJJIJIL().getClass();
        LIZ2.append(Live.getLiveDomain());
        LIZIZ = (SubOnlyVideoApi) LIZLLL.LIZ(X1D.LIZIZ(LIZ2)).LJFF().LIZ.LIZ(SubOnlyVideoApi.class);
    }

    public static C73454SsE LIZ(C7UF cursor) {
        o.LJIIIZ(cursor, "cursor");
        return LIZIZ.getSubOnlyVideoList(Long.valueOf(cursor.LJLILLLLZI), cursor.LJLJI, cursor.LJLJJI, cursor.LJLJJL, cursor.LJLJJLL).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
    }
}
