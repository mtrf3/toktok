package X;

import com.bytedance.keva.Keva;

/* renamed from: X.JBn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48755JBn extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C48755JBn LJLIL = new C48755JBn();

    public C48755JBn() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("feed_auto_scroll");
    }
}
