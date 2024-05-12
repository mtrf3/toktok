package X;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* renamed from: X.VdE, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC80168VdE extends RelativeLayout implements InterfaceC80178VdO {
    public final View LJLIL;
    public C80182VdS LJLILLLLZI;
    public final InterfaceC80178VdO LJLJI;

    @Override // X.InterfaceC80178VdO
    public boolean LJIILLIIL() {
        InterfaceC80178VdO interfaceC80178VdO = this.LJLJI;
        if (interfaceC80178VdO != null && interfaceC80178VdO != this && interfaceC80178VdO.LJIILLIIL()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC80178VdO
    public C80182VdS getSpinnerStyle() {
        int i;
        C80182VdS c80182VdS = this.LJLILLLLZI;
        if (c80182VdS != null) {
            return c80182VdS;
        }
        InterfaceC80178VdO interfaceC80178VdO = this.LJLJI;
        if (interfaceC80178VdO != null && interfaceC80178VdO != this) {
            return interfaceC80178VdO.getSpinnerStyle();
        }
        View view = this.LJLIL;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof C80176VdM) {
                C80182VdS c80182VdS2 = ((C80176VdM) layoutParams).LIZIZ;
                this.LJLILLLLZI = c80182VdS2;
                if (c80182VdS2 != null) {
                    return c80182VdS2;
                }
            }
            if (layoutParams != null && ((i = layoutParams.height) == 0 || i == -1)) {
                C80182VdS[] c80182VdSArr = C80182VdS.LJI;
                int i2 = 0;
                do {
                    C80182VdS c80182VdS3 = c80182VdSArr[i2];
                    if (c80182VdS3.LIZIZ) {
                        this.LJLILLLLZI = c80182VdS3;
                        return c80182VdS3;
                    }
                    i2++;
                } while (i2 < 5);
            }
        }
        C80182VdS c80182VdS4 = C80182VdS.LIZJ;
        this.LJLILLLLZI = c80182VdS4;
        return c80182VdS4;
    }

    @Override // X.InterfaceC80178VdO
    public View getView() {
        View view = this.LJLIL;
        if (view == null) {
            return this;
        }
        return view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC80168VdE(View view) {
        super(view.getContext(), null, 0);
        InterfaceC80178VdO interfaceC80178VdO;
        if (view instanceof InterfaceC80178VdO) {
            interfaceC80178VdO = (InterfaceC80178VdO) view;
        } else {
            interfaceC80178VdO = null;
        }
        this.LJLIL = view;
        this.LJLJI = interfaceC80178VdO;
        if ((this instanceof C80183VdT) && (interfaceC80178VdO instanceof InterfaceC80161Vd7) && interfaceC80178VdO.getSpinnerStyle() == C80182VdS.LJFF) {
            interfaceC80178VdO.getView().setScaleY(-1.0f);
        } else {
            if (!(this instanceof C80184VdU) || !(interfaceC80178VdO instanceof InterfaceC80186VdW) || interfaceC80178VdO.getSpinnerStyle() != C80182VdS.LJFF) {
                return;
            }
            interfaceC80178VdO.getView().setScaleY(-1.0f);
        }
    }

    public final boolean LJIIJJI(boolean z) {
        InterfaceC80178VdO interfaceC80178VdO = this.LJLJI;
        if ((interfaceC80178VdO instanceof InterfaceC80186VdW) && ((InterfaceC80186VdW) interfaceC80178VdO).LJIIJJI(z)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        }
        if ((obj instanceof InterfaceC80178VdO) && getView() == ((InterfaceC80178VdO) obj).getView()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC80178VdO
    public void setPrimaryColors(int... iArr) {
        InterfaceC80178VdO interfaceC80178VdO = this.LJLJI;
        if (interfaceC80178VdO != null && interfaceC80178VdO != this) {
            interfaceC80178VdO.setPrimaryColors(iArr);
        }
    }

    public AbstractC80168VdE(Context context) {
        super(context, null, 0);
    }

    @Override // X.InterfaceC80178VdO
    public int LJIIIIZZ(C80164VdA c80164VdA, boolean z) {
        InterfaceC80178VdO interfaceC80178VdO = this.LJLJI;
        if (interfaceC80178VdO != null && interfaceC80178VdO != this) {
            return interfaceC80178VdO.LJIIIIZZ(c80164VdA, z);
        }
        return 0;
    }

    @Override // X.InterfaceC80185VdV
    public void LIZIZ(InterfaceC78979Uz9 interfaceC78979Uz9, EnumC80174VdK enumC80174VdK, EnumC80174VdK enumC80174VdK2) {
        InterfaceC80178VdO interfaceC80178VdO = this.LJLJI;
        if (interfaceC80178VdO != null && interfaceC80178VdO != this) {
            if ((this instanceof C80183VdT) && (interfaceC80178VdO instanceof InterfaceC80161Vd7)) {
                if (enumC80174VdK.isFooter) {
                    enumC80174VdK = enumC80174VdK.toHeader();
                }
                if (enumC80174VdK2.isFooter) {
                    enumC80174VdK2 = enumC80174VdK2.toHeader();
                }
            } else if ((this instanceof C80184VdU) && (interfaceC80178VdO instanceof InterfaceC80186VdW)) {
                if (enumC80174VdK.isHeader) {
                    enumC80174VdK = enumC80174VdK.toFooter();
                }
                if (enumC80174VdK2.isHeader) {
                    enumC80174VdK2 = enumC80174VdK2.toFooter();
                }
            }
            InterfaceC80178VdO interfaceC80178VdO2 = this.LJLJI;
            if (interfaceC80178VdO2 != null) {
                interfaceC80178VdO2.LIZIZ(interfaceC78979Uz9, enumC80174VdK, enumC80174VdK2);
            }
        }
    }

    @Override // X.InterfaceC80178VdO
    public final void LJII(C80165VdB c80165VdB, int i, int i2) {
        InterfaceC80178VdO interfaceC80178VdO = this.LJLJI;
        if (interfaceC80178VdO != null && interfaceC80178VdO != this) {
            interfaceC80178VdO.LJII(c80165VdB, i, i2);
            return;
        }
        View view = this.LJLIL;
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C80176VdM)) {
            return;
        }
        int i3 = ((C80176VdM) layoutParams).LIZ;
        C80164VdA c80164VdA = c80165VdB.LIZ;
        if (c80164VdA.LLJJL == null && i3 != 0) {
            c80164VdA.LLJJL = new Paint();
        }
        if (equals(c80165VdB.LIZ.LLJJJJ)) {
            c80165VdB.LIZ.LLJLLIL = i3;
        } else {
            if (!equals(c80165VdB.LIZ.LLJJJJJIL)) {
                return;
            }
            c80165VdB.LIZ.LLJLLL = i3;
        }
    }

    @Override // X.InterfaceC80178VdO
    public void LJIILL(float f, int i, int i2) {
        InterfaceC80178VdO interfaceC80178VdO = this.LJLJI;
        if (interfaceC80178VdO != null && interfaceC80178VdO != this) {
            interfaceC80178VdO.LJIILL(f, i, i2);
        }
    }

    @Override // X.InterfaceC80178VdO
    public void LJIJ(InterfaceC78979Uz9 interfaceC78979Uz9, int i, int i2) {
        InterfaceC80178VdO interfaceC80178VdO = this.LJLJI;
        if (interfaceC80178VdO != null && interfaceC80178VdO != this) {
            interfaceC80178VdO.LJIJ(interfaceC78979Uz9, i, i2);
        }
    }

    @Override // X.InterfaceC80178VdO
    public void LJJI(InterfaceC78979Uz9 interfaceC78979Uz9, int i, int i2) {
        InterfaceC80178VdO interfaceC80178VdO = this.LJLJI;
        if (interfaceC80178VdO != null && interfaceC80178VdO != this) {
            interfaceC80178VdO.LJJI(interfaceC78979Uz9, i, i2);
        }
    }

    @Override // X.InterfaceC80178VdO
    public void LJJIFFI(boolean z, float f, int i, int i2, int i3) {
        InterfaceC80178VdO interfaceC80178VdO = this.LJLJI;
        if (interfaceC80178VdO != null && interfaceC80178VdO != this) {
            interfaceC80178VdO.LJJIFFI(z, f, i, i2, i3);
        }
    }
}
