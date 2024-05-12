package X;

import kotlin.jvm.internal.o;

/* renamed from: X.AmR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27231AmR extends AbstractC65781Prl implements InterfaceC88471Ynr<C27021Aj3, C27230AmQ, C27021Aj3> {
    public static final C27231AmR LJLIL = new C27231AmR();

    public C27231AmR() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C27021Aj3 invoke(C27021Aj3 c27021Aj3, C27230AmQ c27230AmQ) {
        Object obj;
        String str;
        C27021Aj3 inputItemVO = c27021Aj3;
        C27230AmQ c27230AmQ2 = c27230AmQ;
        o.LJIIIZ(inputItemVO, "inputItemVO");
        if (c27230AmQ2 != null) {
            obj = c27230AmQ2.LIZIZ;
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        return C27021Aj3.LIZ(inputItemVO, null, new C253009wO(str, null, false, 6), false, false, null, 123);
    }
}
