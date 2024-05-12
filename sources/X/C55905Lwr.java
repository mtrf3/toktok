package X;

import com.bytedance.keva.Keva;

/* renamed from: X.Lwr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55905Lwr extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C55905Lwr LJLIL = new C55905Lwr();

    public C55905Lwr() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("following_widget_manager_repo");
    }
}
