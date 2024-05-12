package X;

import com.bytedance.keva.Keva;

/* renamed from: X.QpD, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68171QpD extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C68171QpD LJLIL = new C68171QpD();

    public C68171QpD() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("ecommerce_debug_panel");
    }
}
