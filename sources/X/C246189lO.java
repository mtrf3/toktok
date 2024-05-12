package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.music.ghost.GhostApi;

/* renamed from: X.9lO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C246189lO {
    public static final /* synthetic */ C246189lO LIZ = new C246189lO();
    public static final GhostApi LIZIZ;

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        LIZIZ = (GhostApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, GhostApi.class);
    }
}
