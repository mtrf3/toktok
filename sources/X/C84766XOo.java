package X;

import kotlin.jvm.internal.o;

/* renamed from: X.XOo, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84766XOo<T> implements InterfaceC73592SuS {
    public final /* synthetic */ C68322mC<C84767XOp> LJLIL;

    public C84766XOo(C68322mC<C84767XOp> c68322mC) {
        this.LJLIL = c68322mC;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.Object, X.XOp] */
    @Override // X.InterfaceC73592SuS
    public final boolean test(Object obj) {
        Integer num;
        C84767XOp c84767XOp;
        Integer num2;
        ?? it = (T) ((C84767XOp) obj);
        o.LJIIIZ(it, "it");
        C68322mC<C84767XOp> c68322mC = this.LJLIL;
        if (c68322mC.element == null) {
            c68322mC.element = it;
        }
        C84767XOp c84767XOp2 = c68322mC.element;
        if (c84767XOp2 != null) {
            c68322mC.element = (T) C1E5.LJIIIIZZ(it, c84767XOp2);
            C84767XOp c84767XOp3 = this.LJLIL.element;
            if (c84767XOp3 != null && (num2 = c84767XOp3.LJFF) != null && num2.intValue() == -103) {
                return true;
            }
            C84767XOp c84767XOp4 = this.LJLIL.element;
            if (c84767XOp4 != null && (num = c84767XOp4.LJFF) != null && num.intValue() == 100 && (c84767XOp = this.LJLIL.element) != null && c84767XOp.LIZJ != null) {
                return true;
            }
            return false;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
