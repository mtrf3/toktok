package X;

import com.bytedance.keva.Keva;

/* renamed from: X.Xks, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85738Xks extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C85738Xks LJLIL = new C85738Xks();

    public C85738Xks() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("show_pii_index");
    }
}
