package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.Snr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73183Snr extends AbstractC73196So4 {
    public static final /* synthetic */ InterfaceC74236TBo[] LJIIJJI;
    public InterfaceC88472Yns<? super ViewGroup, ? extends InterfaceC73205SoD> LJ;
    public InterfaceC73205SoD LJI;
    public int LJII;
    public final AbstractC73196So4 LJIIIZ;
    public final AbstractC73196So4 LJIIJ;
    public int LIZLLL = 15990784;
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(C73154SnO.LJLIL);
    public int LJIIIIZZ = 241;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(C73183Snr.class), "defaultEmpty", "getDefaultEmpty()Lkotlin/jvm/functions/Function1;");
        C65352Pkq.LIZ.getClass();
        LJIIJJI = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.AbstractC73196So4
    public final int LIZLLL() {
        int i;
        if (this.LJIIIIZZ == 241 || (this.LJII & 1) != 1) {
            i = 0;
        } else {
            i = 1;
        }
        if (this.LJIIIZ.isEnable() && (this.LJII & 2) == 2) {
            i += this.LJIIIZ.LIZLLL();
        }
        if (this.LJIIJ.isEnable() && (this.LJII & 4) == 4) {
            return i + this.LJIIJ.LIZLLL();
        }
        return i;
    }

    @Override // X.InterfaceC73200So8
    public final boolean isEnable() {
        if (this.LJII != 0) {
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
        InterfaceC73205SoD interfaceC73205SoD = this.LJI;
        if (interfaceC73205SoD == null || (view = interfaceC73205SoD.getView()) == null) {
            InterfaceC88472Yns<? super ViewGroup, ? extends InterfaceC73205SoD> interfaceC88472Yns = this.LJ;
            if (interfaceC88472Yns == null) {
                interfaceC88472Yns = (InterfaceC88472Yns) this.LJFF.getValue();
            }
            InterfaceC73205SoD invoke = interfaceC88472Yns.invoke(parent);
            this.LJI = invoke;
            view = invoke.getView();
        }
        C73202SoA c73202SoA = new C73202SoA(view);
        int i = this.LJIIIIZZ;
        InterfaceC73205SoD interfaceC73205SoD2 = this.LJI;
        if (interfaceC73205SoD2 != null) {
            interfaceC73205SoD2.LIZJ(i);
        }
        LJ(c73202SoA);
        return c73202SoA;
    }

    @Override // X.InterfaceC73200So8
    public final void LIZJ(int i) {
        this.LIZLLL = i;
    }

    public C73183Snr(C73198So6 c73198So6, C73197So5 c73197So5) {
        this.LJIIIZ = c73198So6;
        this.LJIIJ = c73197So5;
    }
}
