package X;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.IDqS28S0300000;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1UA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1UA implements InterfaceC14980iM {
    public final View LIZ;
    public final InterfaceC14890iD LIZIZ;
    public boolean LIZJ;
    public InterfaceC88472Yns<? super List<? extends InterfaceC14750hz>, C76800UCe> LIZLLL;
    public InterfaceC88472Yns<? super C14850i9, C76800UCe> LJ;
    public C15010iP LJFF;
    public C14870iB LJI;
    public final List<WeakReference<InputConnectionC14990iN>> LJII;
    public final C5H3 LJIIIIZZ;
    public final XK4 LJIIIZ;

    @Override // X.InterfaceC14980iM
    public final void LIZ() {
        this.LIZJ = false;
        this.LIZLLL = C518021o.LJLIL;
        this.LJ = C518121p.LJLIL;
        this.LJIIIZ.LJIILLIIL(EnumC15030iR.StopInput);
    }

    @Override // X.InterfaceC14980iM
    public final void LIZIZ() {
        this.LJIIIZ.LJIILLIIL(EnumC15030iR.HideKeyboard);
    }

    @Override // X.InterfaceC14980iM
    public final void LJ() {
        this.LJIIIZ.LJIILLIIL(EnumC15030iR.ShowKeyboard);
    }

    public C1UA(View view) {
        o.LJIIIZ(view, "view");
        final Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        InterfaceC14890iD interfaceC14890iD = new InterfaceC14890iD(context) { // from class: X.1U5
            public final C5H3 LIZ;

            {
                this.LIZ = C221108m2.LIZ(EnumC221088m0.NONE, new IDqS420S0100000(context, 131));
            }

            @Override // X.InterfaceC14890iD
            public final void LIZ(View view2) {
                o.LJIIIZ(view2, "view");
                ((InputMethodManager) this.LIZ.getValue()).showSoftInput(view2, 0);
            }

            @Override // X.InterfaceC14890iD
            public final void LIZLLL(IBinder iBinder) {
                ((InputMethodManager) this.LIZ.getValue()).hideSoftInputFromWindow(iBinder, 0);
            }

            @Override // X.InterfaceC14890iD
            public final void LJ(View view2) {
                o.LJIIIZ(view2, "view");
                ((InputMethodManager) this.LIZ.getValue()).restartInput(view2);
            }

            @Override // X.InterfaceC14890iD
            public final void LIZJ(View view2, int i, ExtractedText extractedText) {
                ((InputMethodManager) this.LIZ.getValue()).updateExtractedText(view2, i, extractedText);
            }

            @Override // X.InterfaceC14890iD
            public final void LIZIZ(View view2, int i, int i2, int i3, int i4) {
                o.LJIIIZ(view2, "view");
                ((InputMethodManager) this.LIZ.getValue()).updateSelection(view2, i, i2, i3, i4);
            }
        };
        this.LIZ = view;
        this.LIZIZ = interfaceC14890iD;
        this.LIZLLL = C517621k.LJLIL;
        this.LJ = C517721l.LJLIL;
        this.LJFF = new C15010iP("", C08350Ul.LIZIZ, 4);
        this.LJI = C14870iB.LJFF;
        this.LJII = new ArrayList();
        this.LJIIIIZZ = C221108m2.LIZ(EnumC221088m0.NONE, new IDqS420S0100000(this, 130));
        this.LJIIIZ = C78934UyQ.LIZJ(Integer.MAX_VALUE, null, 6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Type inference failed for: r0v19, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [T, java.lang.Boolean] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0050 -> B:10:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.InterfaceC67352kd<? super X.C76800UCe> r11) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1UA.LJFF(X.2kd):java.lang.Object");
    }

    @Override // X.InterfaceC14980iM
    public final void LIZJ(C15010iP c15010iP, C15010iP c15010iP2) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        if (!C08350Ul.LIZ(this.LJFF.LIZIZ, c15010iP2.LIZIZ) || !o.LJ(this.LJFF.LIZJ, c15010iP2.LIZJ)) {
            z = true;
        } else {
            z = false;
        }
        this.LJFF = c15010iP2;
        int size = ((ArrayList) this.LJII).size();
        for (int i5 = 0; i5 < size; i5++) {
            InputConnectionC14990iN inputConnectionC14990iN = (InputConnectionC14990iN) ((Reference) ListProtector.get(this.LJII, i5)).get();
            if (inputConnectionC14990iN != null) {
                inputConnectionC14990iN.LIZLLL = c15010iP2;
            }
        }
        if (o.LJ(c15010iP, c15010iP2)) {
            if (z) {
                InterfaceC14890iD interfaceC14890iD = this.LIZIZ;
                View view = this.LIZ;
                int LJ = C08350Ul.LJ(c15010iP2.LIZIZ);
                int LIZLLL = C08350Ul.LIZLLL(c15010iP2.LIZIZ);
                C08350Ul c08350Ul = this.LJFF.LIZJ;
                if (c08350Ul != null) {
                    i3 = C08350Ul.LJ(c08350Ul.LIZ);
                } else {
                    i3 = -1;
                }
                C08350Ul c08350Ul2 = this.LJFF.LIZJ;
                if (c08350Ul2 != null) {
                    i4 = C08350Ul.LIZLLL(c08350Ul2.LIZ);
                } else {
                    i4 = -1;
                }
                interfaceC14890iD.LIZIZ(view, LJ, LIZLLL, i3, i4);
                return;
            }
            return;
        }
        if (c15010iP != null && (!o.LJ(c15010iP.LIZ.LJLIL, c15010iP2.LIZ.LJLIL) || (C08350Ul.LIZ(c15010iP.LIZIZ, c15010iP2.LIZIZ) && !o.LJ(c15010iP.LIZJ, c15010iP2.LIZJ)))) {
            this.LIZIZ.LJ(this.LIZ);
            return;
        }
        int size2 = ((ArrayList) this.LJII).size();
        for (int i6 = 0; i6 < size2; i6++) {
            InputConnectionC14990iN inputConnectionC14990iN2 = (InputConnectionC14990iN) ((Reference) ListProtector.get(this.LJII, i6)).get();
            if (inputConnectionC14990iN2 != null) {
                C15010iP state = this.LJFF;
                InterfaceC14890iD inputMethodManager = this.LIZIZ;
                View view2 = this.LIZ;
                o.LJIIIZ(state, "state");
                o.LJIIIZ(inputMethodManager, "inputMethodManager");
                o.LJIIIZ(view2, "view");
                if (inputConnectionC14990iN2.LJII) {
                    inputConnectionC14990iN2.LIZLLL = state;
                    if (inputConnectionC14990iN2.LJFF) {
                        inputMethodManager.LIZJ(view2, inputConnectionC14990iN2.LJ, C78915Uy7.LJJIJIIJIL(state));
                    }
                    C08350Ul c08350Ul3 = state.LIZJ;
                    if (c08350Ul3 != null) {
                        i = C08350Ul.LJ(c08350Ul3.LIZ);
                    } else {
                        i = -1;
                    }
                    C08350Ul c08350Ul4 = state.LIZJ;
                    if (c08350Ul4 != null) {
                        i2 = C08350Ul.LIZLLL(c08350Ul4.LIZ);
                    } else {
                        i2 = -1;
                    }
                    inputMethodManager.LIZIZ(view2, C08350Ul.LJ(state.LIZIZ), C08350Ul.LIZLLL(state.LIZIZ), i, i2);
                }
            }
        }
    }

    @Override // X.InterfaceC14980iM
    public final void LIZLLL(C15010iP value, C14870iB imeOptions, IDqS28S0300000 iDqS28S0300000, IDqS416S0100000 onImeActionPerformed) {
        o.LJIIIZ(value, "value");
        o.LJIIIZ(imeOptions, "imeOptions");
        o.LJIIIZ(onImeActionPerformed, "onImeActionPerformed");
        this.LIZJ = true;
        this.LJFF = value;
        this.LJI = imeOptions;
        this.LIZLLL = iDqS28S0300000;
        this.LJ = onImeActionPerformed;
        this.LJIIIZ.LJIILLIIL(EnumC15030iR.StartInput);
    }
}
