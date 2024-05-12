package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.opt.ILocationApi;

/* loaded from: classes7.dex */
public final class EOF extends AbstractC65781Prl implements InterfaceC65784Pro<ILocationApi> {
    public static final EOF LJLIL = new EOF();

    public EOF() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.ss.android.ugc.aweme.opt.ILocationApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final ILocationApi invoke() {
        return RetrofitFactory.LIZLLL().LIZ("https://location.tiktokv.com").LJFF().LIZ.LIZ(ILocationApi.class);
    }
}
