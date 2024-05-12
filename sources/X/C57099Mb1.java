package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.compliance.protection.antiaddiction.relieveaweme.RelieveAwemeApi;

/* renamed from: X.Mb1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57099Mb1 extends AbstractC65781Prl implements InterfaceC65784Pro<RelieveAwemeApi.RealApi> {
    public static final C57099Mb1 LJLIL = new C57099Mb1();

    public C57099Mb1() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.compliance.protection.antiaddiction.relieveaweme.RelieveAwemeApi$RealApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final RelieveAwemeApi.RealApi invoke() {
        return RetrofitFactory.LIZLLL().create(C778533t.LIZ).create(RelieveAwemeApi.RealApi.class);
    }
}
