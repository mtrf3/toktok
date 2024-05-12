package X;

import com.bytedance.keva.Keva;

/* renamed from: X.JDl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48805JDl extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C48805JDl LJLIL = new C48805JDl();

    public C48805JDl() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("pip_feed_manager");
    }
}
