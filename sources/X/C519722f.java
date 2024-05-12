package X;

import kotlin.jvm.internal.o;

/* renamed from: X.22f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C519722f extends AbstractC65781Prl implements InterfaceC88471Ynr<C1WN, Float, C76800UCe> {
    public static final C519722f LJLIL = new C519722f();

    public C519722f() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(C1WN c1wn, Float f) {
        C1WN set = c1wn;
        float floatValue = f.floatValue();
        o.LJIIIZ(set, "$this$set");
        if (set.LJIIJJI != floatValue) {
            set.LJIIJJI = floatValue;
            set.LJIILL = true;
            set.LIZJ();
        }
        return C76800UCe.LIZ;
    }
}
