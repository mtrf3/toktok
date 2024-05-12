package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V6M {
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a7, code lost:
    
        if (r0 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x012a, code lost:
    
        if ((r1 instanceof X.V7J) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0047, code lost:
    
        if (r0 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0146, code lost:
    
        if ((r1 instanceof X.V7J) != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object LIZIZ(X.V6O<T> r7, X.V7O r8, X.InterfaceC88471Ynr<? super X.V75, ? super X.InterfaceC67352kd<? super X.C76800UCe>, ? extends java.lang.Object> r9, X.InterfaceC24760y8<java.lang.Integer> r10, X.InterfaceC24760y8<java.lang.Integer> r11, X.InterfaceC67352kd<? super X.C76800UCe> r12) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V6M.LIZIZ(X.V6O, X.V7O, X.Ynr, X.0y8, X.0y8, X.2kd):java.lang.Object");
    }

    public static final <T> void LIZ(V7O pagingLazyConfig, InterfaceC88471Ynr<? super V75, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> triggerPaging, V6O<T> pagingLazyState, int i, int i2, C0UK state, InterfaceC24520xk interfaceC24520xk, int i3) {
        o.LJIIIZ(pagingLazyConfig, "pagingLazyConfig");
        o.LJIIIZ(triggerPaging, "triggerPaging");
        o.LJIIIZ(pagingLazyState, "pagingLazyState");
        o.LJIIIZ(state, "state");
        C35931b3 LJIL = interfaceC24520xk.LJIL(1440928941);
        InterfaceC35811ar LJJJJIZL = C78966Uyw.LJJJJIZL(Integer.valueOf(i), LJIL);
        InterfaceC35811ar LJJJJIZL2 = C78966Uyw.LJJJJIZL(Integer.valueOf(i2), LJIL);
        C24610xt.LJ(Boolean.TRUE, new C79184V5w(state, pagingLazyState, pagingLazyConfig, triggerPaging, LJJJJIZL, LJJJJIZL2, null), LJIL);
        C24610xt.LJ(pagingLazyState.LJLJJI.getValue(), new C79185V5x(pagingLazyState, pagingLazyConfig, triggerPaging, LJJJJIZL, LJJJJIZL2, null), LJIL);
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new V6L(pagingLazyConfig, triggerPaging, pagingLazyState, i, i2, state, i3);
    }
}
