package X;

import kotlin.jvm.internal.IDqS1S0301000;
import kotlin.jvm.internal.o;

/* renamed from: X.057, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass057 {
    public static final C44031o7 LIZ = C24410xZ.LIZLLL(C45381qI.LJLIL);
    public static final C44031o7 LIZIZ = C24410xZ.LIZLLL(C45391qJ.LJLIL);
    public static final C44031o7 LIZJ = C24410xZ.LIZLLL(C45401qK.LJLIL);
    public static final C44031o7 LIZLLL = C24410xZ.LIZLLL(C45411qL.LJLIL);
    public static final C44031o7 LJ = C24410xZ.LIZLLL(C45421qM.LJLIL);
    public static final C44031o7 LJFF = C24410xZ.LIZLLL(C45431qN.LJLIL);
    public static final C44031o7 LJI = C24410xZ.LIZLLL(C45451qP.LJLIL);
    public static final C44031o7 LJII = C24410xZ.LIZLLL(C45441qO.LJLIL);
    public static final C44031o7 LJIIIIZZ = C24410xZ.LIZLLL(C45461qQ.LJLIL);
    public static final C44031o7 LJIIIZ = C24410xZ.LIZLLL(C45471qR.LJLIL);
    public static final C44031o7 LJIIJ = C24410xZ.LIZLLL(C45481qS.LJLIL);
    public static final C44031o7 LJIIJJI = C24410xZ.LIZLLL(C45501qU.LJLIL);
    public static final C44031o7 LJIIL = C24410xZ.LIZLLL(C45511qV.LJLIL);
    public static final C44031o7 LJIILIIL = C24410xZ.LIZLLL(C45521qW.LJLIL);
    public static final C44031o7 LJIILJJIL = C24410xZ.LIZLLL(C45531qX.LJLIL);
    public static final C44031o7 LJIILL = C24410xZ.LIZLLL(C45541qY.LJLIL);
    public static final C44031o7 LJIILLIIL = C24410xZ.LIZLLL(C45491qT.LJLIL);

    public static final void LIZIZ(String str) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("CompositionLocal ");
        LIZ2.append(str);
        LIZ2.append(" not present");
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        LIZIZ2.toString();
        throw new IllegalStateException(LIZIZ2);
    }

    public static final void LIZ(C0DR owner, C04N uriHandler, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> content, InterfaceC24520xk interfaceC24520xk, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(uriHandler, "uriHandler");
        o.LJIIIZ(content, "content");
        C35931b3 LJIL = interfaceC24520xk.LJIL(874662829);
        if ((i & 14) == 0) {
            if (LJIL.LJIJJ(owner)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (LJIL.LJIJJ(uriHandler)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (LJIL.LJIJJ(content)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !LJIL.LIZ()) {
            C44031o7 c44031o7 = LJI;
            InterfaceC13440fs fontLoader = owner.getFontLoader();
            c44031o7.getClass();
            C44031o7 c44031o72 = LJII;
            InterfaceC13480fw fontFamilyResolver = owner.getFontFamilyResolver();
            c44031o72.getClass();
            C24410xZ.LIZ(new C24620xu[]{LIZ.LIZIZ(owner.getAccessibilityManager()), LIZIZ.LIZIZ(owner.getAutofill()), LIZJ.LIZIZ(owner.getAutofillTree()), LIZLLL.LIZIZ(owner.getClipboardManager()), LJ.LIZIZ(owner.getDensity()), LJFF.LIZIZ(owner.getFocusManager()), new C24620xu(c44031o7, fontLoader, false), new C24620xu(c44031o72, fontFamilyResolver, false), LJIIIIZZ.LIZIZ(owner.getHapticFeedBack()), LJIIIZ.LIZIZ(owner.getInputModeManager()), LJIIJ.LIZIZ(owner.getLayoutDirection()), LJIIJJI.LIZIZ(owner.getTextInputService()), LJIIL.LIZIZ(owner.getTextToolbar()), LJIILIIL.LIZIZ(uriHandler), LJIILJJIL.LIZIZ(owner.getViewConfiguration()), LJIILL.LIZIZ(owner.getWindowInfo()), LJIILLIIL.LIZIZ(owner.getPointerIconService())}, content, LJIL, ((i2 >> 3) & 112) | 8);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new IDqS1S0301000(owner, (C0DR) uriHandler, (C04N) content, (InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe>) i, 1);
    }
}
