package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;

/* renamed from: X.ENt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36333ENt implements InterfaceC36336ENw {
    @Override // X.InterfaceC36336ENw
    public final <T> T LIZ(Class<T> cls) {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        return (T) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, cls);
    }

    @Override // X.InterfaceC36336ENw
    public final Object create(Class cls) {
        return C65083PgV.LJIIIIZZ(cls, "http://zero-rating.tiktok.com");
    }
}
