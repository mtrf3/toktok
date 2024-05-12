package X;

import com.bytedance.keva.Keva;

/* renamed from: X.96g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2313896g extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C2313896g LJLIL = new C2313896g();

    public C2313896g() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("profile_tab_red_dot_repo");
        LIZ.append(C2313996h.LIZ.getUid());
        return Keva.getRepo(X1D.LIZIZ(LIZ));
    }
}
