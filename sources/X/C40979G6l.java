package X;

import com.bytedance.keva.Keva;

/* renamed from: X.G6l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C40979G6l extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C40979G6l LJLIL = new C40979G6l();

    public C40979G6l() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("camera_facing_repo");
    }
}
