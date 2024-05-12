package X;

/* renamed from: X.6Mj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159136Mj extends AbstractC65781Prl implements InterfaceC88472Yns<Exception, C76800UCe> {
    public static final C159136Mj INSTANCE = new C159136Mj();

    public C159136Mj() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Exception exc) {
        C76800UCe c76800UCe;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("change_avatar_mode: change avatar request fail ");
        if (exc != null) {
            C16880lQ.LLLLIIL(exc);
            c76800UCe = C76800UCe.LIZ;
        } else {
            c76800UCe = null;
        }
        LIZ.append(c76800UCe);
        H78.LIZJ(X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ C76800UCe invoke(Exception exc) {
        invoke2(exc);
        return C76800UCe.LIZ;
    }
}
