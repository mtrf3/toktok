package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SoZ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73227SoZ {
    public static <T> void LIZ(InterfaceC73226SoY<T> interfaceC73226SoY, List<? extends T> list) {
        o.LJIIJ(list, "list");
        interfaceC73226SoY.LJJIIJ(list, null);
    }

    public static <T> void LIZIZ(InterfaceC73226SoY<T> interfaceC73226SoY, List<? extends T> list, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIJ(list, "list");
        C73231Sod<T> LJJIIZI = interfaceC73226SoY.LJJIIZI();
        LJJIIZI.getClass();
        int i = LJJIIZI.LIZIZ + 1;
        LJJIIZI.LIZIZ = i;
        List<? extends T> list2 = LJJIIZI.LIZJ;
        if (list != list2) {
            if (list.isEmpty()) {
                int size = list2.size();
                LJJIIZI.LIZJ = C61878OQg.INSTANCE;
                LJJIIZI.LIZLLL.LJJIJLIJ(0, size);
                if (interfaceC65784Pro != null) {
                    interfaceC65784Pro.invoke();
                    return;
                }
                return;
            }
            if (list2.isEmpty()) {
                LJJIIZI.LIZJ = list;
                LJJIIZI.LIZLLL.LJLIIIL(0, list.size());
                if (interfaceC65784Pro == null) {
                    return;
                }
                interfaceC65784Pro.invoke();
                return;
            }
            LJJIIZI.LJ.LIZ.execute(new RunnableC73233Sof(LJJIIZI, list2, list, i, interfaceC65784Pro));
        }
    }
}
