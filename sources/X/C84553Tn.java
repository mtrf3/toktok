package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3Tn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84553Tn extends AbstractC65781Prl implements InterfaceC88471Ynr<Boolean, String, C76800UCe> {
    public static final C84553Tn LJLIL = new C84553Tn();

    public C84553Tn() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Boolean bool, String str) {
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(str, "<anonymous parameter 1>");
        if (booleanValue) {
            C84543Tm.LIZ.getClass();
            C84543Tm.LIZJ();
            C84543Tm.LIZ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("fetch success: isAvatar exist:");
            LIZ.append(C96963rI.LJII().LIZ());
            V1B.LJIIZILJ(X1D.LIZIZ(LIZ));
        } else {
            V1B.LJIIZILJ("fetch fail");
        }
        return C76800UCe.LIZ;
    }
}
