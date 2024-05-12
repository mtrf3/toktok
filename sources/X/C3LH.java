package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3LH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3LH extends AbstractC38521fE {
    public static final /* synthetic */ int LJLJI = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3LH(C3R9 parameters) {
        super(parameters);
        o.LJIIIZ(parameters, "parameters");
    }

    public final boolean LJIIL(C63120Opw obj) {
        o.LJIIIZ(obj, "obj");
        if ((obj.isGroupChat() && (((C3R9) this.LJLILLLLZI).LJIIJ || C84283Sm.LJ(obj) || !C84283Sm.LJII(obj))) || C100013wD.LIZ(obj) || obj.getLastShowMessage() == null) {
            return false;
        }
        return true;
    }
}
