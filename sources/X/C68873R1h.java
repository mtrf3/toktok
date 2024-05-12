package X;

import com.bytedance.keva.Keva;

/* renamed from: X.R1h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68873R1h extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C68873R1h LJLIL = new C68873R1h();

    public C68873R1h() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("ws_pref_monitor");
    }
}
