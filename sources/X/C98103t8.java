package X;

import android.widget.ImageView;
import kotlin.jvm.internal.o;

/* renamed from: X.3t8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98103t8 extends C3G6 {
    public static final C98103t8 LJLJI = new C98103t8();

    @Override // X.InterfaceC224288rA
    public final boolean LIZ(C3G7 c3g7) {
        if (c3g7 != null && LJII(c3g7)) {
            float LJI = C3G6.LJI(c3g7);
            if (LJI < 1.0f) {
                C98343tW.LIZ.getClass();
                C62822Ol8 c62822Ol8 = C98343tW.LIZJ;
                if (((float[]) c62822Ol8.getValue()).length == 2) {
                    float f = 1;
                    boolean z = false;
                    if (LJI >= f - ((float[]) c62822Ol8.getValue())[0]) {
                        if (((Number) C98383ta.LIZ.getValue()).intValue() == 0) {
                            return true;
                        }
                        return false;
                    }
                    if (LJI >= f - ((float[]) c62822Ol8.getValue())[1]) {
                        if (((Number) C98383ta.LIZ.getValue()).intValue() == 2) {
                            z = true;
                        }
                        return !z;
                    }
                }
            }
        }
        return true;
    }

    @Override // X.C3G6, X.InterfaceC224288rA
    public final void LIZJ(ImageView coverView) {
        o.LJIIIZ(coverView, "coverView");
    }

    @Override // X.InterfaceC224288rA
    public final C3G7 LIZLLL(C3G7 c3g7) {
        if (C53946LFe.LIZJ(null, null).LJFF || LIZ(c3g7)) {
        }
        return C3G6.LJFF(c3g7);
    }

    @Override // X.C3G6
    public final boolean LJII(C3G7 param) {
        o.LJIIIZ(param, "param");
        if (!C54966Lhi.LIZIZ() && !C54966Lhi.LIZ() && !C53946LFe.LIZJ(null, null).LJFF && param.LJLIL > 0 && param.LJLILLLLZI > 0 && param.LJLJI > 0 && param.LJLJJI > 0) {
            return true;
        }
        return false;
    }
}
