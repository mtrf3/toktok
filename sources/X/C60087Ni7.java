package X;

import Y.ACListenerS30S0100000_10;
import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Ni7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60087Ni7 implements InterfaceC60844NuK {
    public final /* synthetic */ AbstractC60088Ni8 LJLIL;

    @Override // X.InterfaceC60844NuK
    public final void LJIJJ(boolean z) {
    }

    @Override // X.M2J
    public final void release() {
        this.LJLIL.getClass();
    }

    public C60087Ni7(AbstractC60088Ni8 abstractC60088Ni8) {
        this.LJLIL = abstractC60088Ni8;
    }

    @Override // X.InterfaceC60844NuK
    public final View LJI(Context context) {
        o.LJIIIZ(context, "context");
        return this.LJLIL.LIZ(context);
    }

    @Override // X.InterfaceC60844NuK
    public final void LJIIJJI(View.OnClickListener onClickListener) {
        this.LJLIL.LIZIZ(onClickListener);
    }

    @Override // X.InterfaceC60844NuK
    public final void LJIILJJIL(String subTitle) {
        o.LJIIJ(subTitle, "subTitle");
    }

    @Override // X.InterfaceC60844NuK
    public final void LJIIZILJ(EnumC60084Ni4 navBtnType) {
        String str;
        o.LJIIIZ(navBtnType, "navBtnType");
        int i = C60086Ni6.LIZ[navBtnType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            str = "";
                        } else {
                            throw new C162476Zf();
                        }
                    } else {
                        str = "more";
                    }
                } else {
                    str = "report";
                }
            } else {
                str = "share";
            }
        } else {
            str = "collect";
        }
        this.LJLIL.LJ(str);
    }

    @Override // X.InterfaceC60844NuK
    public final void LJJII(ACListenerS30S0100000_10 aCListenerS30S0100000_10) {
        this.LJLIL.LIZLLL(aCListenerS30S0100000_10);
    }

    @Override // X.InterfaceC60844NuK
    public final void LJJIII(String title) {
        o.LJIIIZ(title, "title");
        this.LJLIL.LJFF(title);
    }

    @Override // X.InterfaceC60844NuK
    public final void LJJIJIIJI(int i) {
        this.LJLIL.LJII(i);
    }

    @Override // X.InterfaceC60844NuK
    public final void LJJIL(int i) {
        this.LJLIL.LJI(i);
    }

    @Override // X.InterfaceC60844NuK
    public final void LJJJ(boolean z) {
        this.LJLIL.LIZJ(z);
    }
}
