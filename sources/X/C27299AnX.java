package X;

import com.bytedance.keva.Keva;

/* renamed from: X.AnX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27299AnX extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C27299AnX LJLIL = new C27299AnX();

    public C27299AnX() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("ec_address_draft_repo");
    }
}
