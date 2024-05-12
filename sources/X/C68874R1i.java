package X;

import com.bytedance.keva.Keva;

/* renamed from: X.R1i, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68874R1i extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C68874R1i LJLIL = new C68874R1i();

    public C68874R1i() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("ws_pref_monitor");
    }
}
