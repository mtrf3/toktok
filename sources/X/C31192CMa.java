package X;

import com.bytedance.keva.Keva;

/* renamed from: X.CMa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31192CMa extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C31192CMa LJLIL = new C31192CMa();

    public C31192CMa() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("live_debug_tools_repo");
    }
}
