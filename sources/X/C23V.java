package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.23V, reason: invalid class name */
/* loaded from: classes.dex */
public final class C23V extends AbstractC65781Prl implements InterfaceC88471Ynr<C0MK, C18690oL, List<? extends Object>> {
    public static final C23V LJLIL = new C23V();

    public C23V() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final List<? extends Object> invoke(C0MK listSaver, C18690oL c18690oL) {
        C18690oL it = c18690oL;
        o.LJIIIZ(listSaver, "$this$listSaver");
        o.LJIIIZ(it, "it");
        Object[] objArr = new Object[2];
        boolean z = false;
        objArr[0] = Float.valueOf(it.LIZ());
        if (it.LJ.getValue() == C0UT.Vertical) {
            z = true;
        }
        objArr[1] = Boolean.valueOf(z);
        return C47261Igj.LJJIJIIJI(objArr);
    }
}
