package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.base.api.ISkylightApi;

/* loaded from: classes7.dex */
public final class E8Y extends AbstractC65781Prl implements InterfaceC65784Pro<ISkylightApi> {
    public static final E8Y LJLIL = new E8Y();

    public E8Y() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.base.api.ISkylightApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final ISkylightApi invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        return C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(ISkylightApi.class);
    }
}
