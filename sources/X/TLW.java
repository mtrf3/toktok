package X;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public final class TLW {
    public final ViewPager LIZLLL;
    public final C80695Vlj LJ;
    public final View LJFF;
    public final boolean LJI;
    public final boolean LJII = false;
    public final boolean LJIIIIZZ = false;
    public final List<OSZ<RTV, InterfaceC65784Pro<View>>> LIZ = new ArrayList();
    public final TLU LIZIZ = new TLU(this);
    public final C73893SzJ<OSZ<RTV, Integer>> LIZJ = new C73893SzJ<>();

    public TLW(ViewPager viewPager, C80695Vlj c80695Vlj, View view, boolean z) {
        this.LIZLLL = viewPager;
        this.LJ = c80695Vlj;
        this.LJFF = view;
        this.LJI = z;
        viewPager.addOnPageChangeListener(new C80697Vll(c80695Vlj));
        c80695Vlj.LIZIZ(new TLV(this));
    }
}
