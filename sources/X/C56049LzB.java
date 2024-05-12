package X;

import com.bytedance.keva.Keva;

/* renamed from: X.LzB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56049LzB extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C56049LzB LJLIL = new C56049LzB();

    public C56049LzB() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("ec_fashion_mall_cache");
    }
}
