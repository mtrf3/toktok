package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.innerpush.idl.InnerPushApi;

/* loaded from: classes16.dex */
public final class XS4 extends AbstractC65781Prl implements InterfaceC65784Pro<InnerPushApi.Api> {
    public static final XS4 LJLIL = new XS4();

    public XS4() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.innerpush.idl.InnerPushApi$Api, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final InnerPushApi.Api invoke() {
        return RetrofitFactory.LIZLLL().create(InnerPushApi.LIZ).create(InnerPushApi.Api.class);
    }
}
