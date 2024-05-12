package X;

import com.bytedance.keva.Keva;

/* renamed from: X.7EU, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7EU extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C7EU LJLIL = new C7EU();

    public C7EU() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("comment_keyboard_keva");
    }
}
