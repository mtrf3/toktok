package X;

import com.bytedance.keva.Keva;

/* renamed from: X.327, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass327 extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final AnonymousClass327 LJLIL = new AnonymousClass327();

    public AnonymousClass327() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("message_repo_key");
        LIZ.append((Object) C80763Ey.LIZ(false));
        return Keva.getRepo(X1D.LIZIZ(LIZ));
    }
}
