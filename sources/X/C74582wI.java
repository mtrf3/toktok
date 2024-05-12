package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;

/* renamed from: X.2wI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74582wI extends AbstractC65781Prl implements InterfaceC65784Pro<InterfaceC789838c> {
    public static final C74582wI LJLIL = new C74582wI();

    public C74582wI() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final InterfaceC789838c invoke() {
        return RetrofitFactory.LIZLLL().create("https://oec-api.tiktokv.com/");
    }
}
