package X;

import kotlin.jvm.internal.IDqS28S0300000;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0oU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18780oU {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object, X.0i0] */
    public static C14760i0 LIZ(C15020iQ textInputService, C15010iP value, C14780i2 editProcessor, C14870iB imeOptions, IDqS416S0100000 onValueChange, IDqS416S0100000 onImeActionPerformed) {
        o.LJIIIZ(textInputService, "textInputService");
        o.LJIIIZ(value, "value");
        o.LJIIIZ(editProcessor, "editProcessor");
        o.LJIIIZ(imeOptions, "imeOptions");
        o.LJIIIZ(onValueChange, "onValueChange");
        o.LJIIIZ(onImeActionPerformed, "onImeActionPerformed");
        C68322mC c68322mC = new C68322mC();
        textInputService.LIZ.LIZLLL(value, imeOptions, new IDqS28S0300000(editProcessor, onValueChange, c68322mC, 24), onImeActionPerformed);
        ?? c14760i0 = new C14760i0(textInputService, textInputService.LIZ);
        textInputService.LIZIZ.set(c14760i0);
        c68322mC.element = c14760i0;
        return c14760i0;
    }
}
