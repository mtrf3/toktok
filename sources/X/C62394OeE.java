package X;

import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.OeE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62394OeE {
    public boolean LJFF;
    public AbstractC65550Po2<InterfaceC62486Ofi> LJII;
    public InterfaceC44918Hk2<InterfaceC62486Ofi> LJIIIIZZ;
    public AbstractC65550Po2<InterfaceC62225ObV> LJIIIZ;
    public Comparator<InterfaceC62225ObV> LJIIJ;
    public InterfaceC88472Yns<? super InterfaceC62225ObV, Boolean> LJIIJJI;
    public InterfaceC88472Yns<? super InterfaceC62486Ofi, Boolean> LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public float LJIILL;
    public int LJIILLIIL;
    public BaseSharePackage LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public long LJIJJLI;
    public View LJIL;
    public InterfaceC62474OfW LJJ;
    public C4RB LJJI;
    public InterfaceC65784Pro<Boolean> LJJIFFI;
    public boolean LJJII;
    public float LJJIII;
    public boolean LJJIIJ;
    public boolean LJJIIJZLJL;
    public boolean LJJIIZ;
    public int LJJIIZI;
    public boolean LJJIJ;
    public boolean LJJIJIIJI;
    public boolean LJJIJIIJIL;
    public InterfaceC88473Ynt<? super Integer, ? super Boolean, ? super Integer, ? extends OSZ<? extends View, ? extends FrameLayout.LayoutParams>> LJJIJIL;
    public String LJJIJL;
    public boolean LJJIJLIJ;
    public String LJJIL;
    public List<InterfaceC62225ObV> LIZ = new ArrayList();
    public EnumC62492Ofo LIZIZ = EnumC62492Ofo.EXPAND;
    public List<InterfaceC62486Ofi> LIZJ = new ArrayList();
    public List<Integer> LIZLLL = new ArrayList();
    public final List<String> LJ = new ArrayList();
    public boolean LJI = true;

    public final C62387Oe7 LJ() {
        return new C62387Oe7(this);
    }

    public C62394OeE() {
        AbstractC65550Po2<InterfaceC62486Ofi> LIZ = AbstractC65550Po2.LIZ(C62528OgO.LJLIL);
        o.LJIIIIZZ(LIZ, "Ordering.from { _, _ -> 0 }");
        this.LJII = LIZ;
        AbstractC65550Po2<InterfaceC62225ObV> LIZ2 = AbstractC65550Po2.LIZ(C62529OgP.LJLIL);
        o.LJIIIIZZ(LIZ2, "Ordering.from { _, _ -> 0 }");
        this.LJIIIZ = LIZ2;
        this.LJIIJJI = C62523OgJ.LJLIL;
        this.LJIIL = C62522OgI.LJLIL;
        this.LJIILJJIL = R.attr.g5;
        this.LJIILL = 1.0f;
        this.LJIJ = true;
        this.LJIJJLI = 100L;
        this.LJJIII = 0.7f;
        this.LJJIIJ = true;
        this.LJJIJ = true;
        this.LJJIJL = "";
        this.LJJIL = "";
    }

    public final void LIZ(Comparator comparator) {
        o.LJIIIZ(comparator, "comparator");
        AbstractC65550Po2<InterfaceC62486Ofi> LIZ = AbstractC65550Po2.LIZ(comparator);
        o.LJIIIIZZ(LIZ, "Ordering.from(comparator)");
        this.LJII = LIZ;
    }

    public final void LIZIZ(InterfaceC62225ObV channel) {
        o.LJIIIZ(channel, "channel");
        this.LIZ.add(channel);
    }

    public final void LIZJ(InterfaceC62486Ofi action) {
        o.LJIIIZ(action, "action");
        this.LIZJ.add(action);
    }

    public final void LIZLLL(String channelKey) {
        o.LJIIIZ(channelKey, "channelKey");
        ((ArrayList) this.LJ).add(channelKey);
    }

    public final void LJFF(Comparator comparator) {
        o.LJIIIZ(comparator, "comparator");
        this.LJIIJ = comparator;
        AbstractC65550Po2<InterfaceC62225ObV> LIZ = AbstractC65550Po2.LIZ(comparator);
        o.LJIIIIZZ(LIZ, "Ordering.from(comparator)");
        this.LJIIIZ = LIZ;
    }
}
