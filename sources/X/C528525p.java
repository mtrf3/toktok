package X;

import com.bytedance.keva.Keva;

/* renamed from: X.25p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C528525p extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C528525p LJLIL = new C528525p();

    public C528525p() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("session_manager");
    }
}
