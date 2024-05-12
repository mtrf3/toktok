package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerCell;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KOW extends C0CJ implements C0A3 {
    public final C0CM LJLIL;
    public final RecyclerView LJLILLLLZI;
    public PowerCell<?> LJLJI;

    @Override // X.C0CJ
    public final void LIZJ(int i) {
        LIZLLL(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL(int i) {
        PowerCell<?> powerCell;
        RecyclerView.ViewHolder LJJIZ = this.LJLILLLLZI.LJJIZ(i);
        if (!(LJJIZ instanceof PowerCell) || (powerCell = (PowerCell) LJJIZ) == 0 || o.LJ(powerCell, this.LJLJI)) {
            return;
        }
        InterfaceC93923mO interfaceC93923mO = this.LJLJI;
        if (interfaceC93923mO instanceof KOZ) {
            o.LJII(interfaceC93923mO, "null cannot be cast to non-null type com.bytedance.tiktok.sdk.powerviewpager.cell.PowerViewPagerCallback");
            ((KOZ) interfaceC93923mO).k2();
        }
        if (powerCell instanceof KOZ) {
            ((KOZ) powerCell).onPageSelected(i);
        }
        this.LJLJI = powerCell;
    }

    @Override // X.C0A3
    public final void LJIILIIL(View view) {
        InterfaceC93923mO interfaceC93923mO;
        o.LJIIIZ(view, "view");
        RecyclerView.ViewHolder LJJJJJL = this.LJLILLLLZI.LJJJJJL(view);
        if ((LJJJJJL instanceof PowerCell) && (interfaceC93923mO = (PowerCell) LJJJJJL) != null && o.LJ(interfaceC93923mO, this.LJLJI)) {
            if (interfaceC93923mO instanceof KOZ) {
                ((KOZ) interfaceC93923mO).k2();
            }
            this.LJLJI = null;
        }
    }

    @Override // X.C0A3
    public final void LJJIFFI(View view) {
        o.LJIIIZ(view, "view");
        LIZLLL(this.LJLIL.getCurrentItem());
    }

    public KOW(C0CM viewPager2, RecyclerView recyclerView) {
        o.LJIIIZ(viewPager2, "viewPager2");
        this.LJLIL = viewPager2;
        this.LJLILLLLZI = recyclerView;
    }
}
