package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Snq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73182Snq extends AbstractC73196So4 {
    public static final /* synthetic */ InterfaceC74236TBo[] LJIIL;
    public InterfaceC88472Yns<? super ViewGroup, ? extends InterfaceC73206SoE> LJ;
    public InterfaceC73206SoE LJI;
    public boolean LJIIIZ;
    public InterfaceC65784Pro<C76800UCe> LJIIJ;
    public int LIZLLL = 16056320;
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1089));
    public int LJII = 241;
    public int LJIIIIZZ = 241;
    public final C73185Snt LJIIJJI = new C73185Snt(this);

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(C73182Snq.class), "defaultLoading", "getDefaultLoading()Lkotlin/jvm/functions/Function1;");
        C65352Pkq.LIZ.getClass();
        LJIIL = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.InterfaceC73200So8
    public final boolean isEnable() {
        if (this.LJIIIIZZ != 241 && this.LJIIJ != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC73200So8
    public final int LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC73200So8
    public final RecyclerView.ViewHolder LIZIZ(ViewGroup parent) {
        View view;
        o.LJIIJ(parent, "parent");
        InterfaceC73206SoE interfaceC73206SoE = this.LJI;
        if (interfaceC73206SoE == null || (view = interfaceC73206SoE.getView()) == null) {
            InterfaceC88472Yns<? super ViewGroup, ? extends InterfaceC73206SoE> interfaceC88472Yns = this.LJ;
            if (interfaceC88472Yns == null) {
                interfaceC88472Yns = (InterfaceC88472Yns) this.LJFF.getValue();
            }
            InterfaceC73206SoE invoke = interfaceC88472Yns.invoke(parent);
            this.LJI = invoke;
            view = invoke.getView();
        }
        C73203SoB c73203SoB = new C73203SoB(view);
        int i = this.LJII;
        InterfaceC73206SoE interfaceC73206SoE2 = this.LJI;
        if (interfaceC73206SoE2 != null) {
            interfaceC73206SoE2.LIZIZ(i);
        }
        LJ(c73203SoB);
        return c73203SoB;
    }

    @Override // X.InterfaceC73200So8
    public final void LIZJ(int i) {
        this.LIZLLL = i;
    }

    public final void LJI(int i) {
        if (this.LJII == i && !this.LJIIIZ) {
            this.LJIIIZ = true;
            LJII(242);
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJIIJ;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
        }
    }

    public final void LJII(int i) {
        boolean z;
        if (this.LJII == i) {
            return;
        }
        this.LJII = i;
        if (i == 242) {
            z = true;
        } else {
            z = false;
        }
        this.LJIIIZ = z;
        InterfaceC73206SoE interfaceC73206SoE = this.LJI;
        if (interfaceC73206SoE != null) {
            interfaceC73206SoE.LIZIZ(i);
        }
    }
}
