package X;

import com.bytedance.keva.Keva;

/* renamed from: X.E7l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35909E7l extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C35909E7l LJLIL = new C35909E7l();

    public C35909E7l() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("tiktok-location");
    }
}
