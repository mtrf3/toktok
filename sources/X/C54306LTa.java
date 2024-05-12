package X;

import com.bytedance.keva.Keva;

/* renamed from: X.LTa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54306LTa extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C54306LTa LJLIL = new C54306LTa();

    public C54306LTa() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("stem_keva_repo");
    }
}
