package X;

import com.bytedance.keva.Keva;

/* renamed from: X.KSu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51752KSu extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C51752KSu LJLIL = new C51752KSu();

    public C51752KSu() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("ec_mall_main_cache");
    }
}
