package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.adr, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94243adr extends AbstractViewOnClickListenerC55470Lpq {
    public final /* synthetic */ C93566aSw LJLJJI;

    public C94243adr(C93566aSw c93566aSw) {
        this.LJLJJI = c93566aSw;
    }

    @Override // X.AbstractViewOnClickListenerC55470Lpq
    public final void LIZ(View v) {
        o.LJIIIZ(v, "v");
        C93566aSw c93566aSw = this.LJLJJI;
        c93566aSw.getClass();
        int i = 3;
        if (AnonymousClass699.LIZIZ().LIZIZ.LJLIL) {
            int i2 = c93566aSw.LJLJJLL;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                }
            } else {
                i = 4;
            }
            c93566aSw.LJLJJLL = i;
        } else {
            int i3 = c93566aSw.LJLJJLL;
            if (i3 != 1) {
                if (i3 != 2) {
                    i = 1;
                }
            } else {
                i = 2;
            }
            c93566aSw.LJLJJLL = i;
        }
        c93566aSw.LIZ();
        C94441ah3 c94441ah3 = c93566aSw.LJLILLLLZI;
        if (c94441ah3 != null) {
            c94441ah3.LJI(c93566aSw.LJLJJLL, c93566aSw.LJLJLLL);
            int i4 = c93566aSw.LJLJJLL;
            c93566aSw.LJLJL = i4;
            InterfaceC139695e1 interfaceC139695e1 = c93566aSw.LL;
            if (interfaceC139695e1 != null) {
                interfaceC139695e1.LJIIIIZZ(i4, 0, "text", null);
                return;
            }
            return;
        }
        o.LJIJI("simpleEditText");
        throw null;
    }
}
