package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WW2 implements Runnable {
    public final /* synthetic */ WW1 LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ AbstractC77369UYb LJLJJI;
    public final /* synthetic */ Effect LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ String LJLJL;

    public WW2(WW1 ww1, int i, boolean z, AbstractC77369UYb abstractC77369UYb, Effect effect, boolean z2, String str) {
        this.LJLIL = ww1;
        this.LJLILLLLZI = i;
        this.LJLJI = z;
        this.LJLJJI = abstractC77369UYb;
        this.LJLJJL = effect;
        this.LJLJJLL = z2;
        this.LJLJL = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ() {
        List<String> children;
        Object tag;
        WW1 ww1 = this.LJLIL;
        int i = this.LJLILLLLZI;
        boolean z = this.LJLJI;
        AbstractC77369UYb abstractC77369UYb = this.LJLJJI;
        Effect effect = this.LJLJJL;
        boolean z2 = this.LJLJJLL;
        String str = this.LJLJL;
        if (z) {
            ww1.LLJJJJ(i);
            ww1.LLJJIJIIJIL(abstractC77369UYb, effect, str);
            return;
        }
        if (!ww1.LLIIZ) {
            ww1.LLILIL = true;
        }
        ww1.LLILII = str;
        if (ww1.LJLILLLLZI.LJ.invoke().booleanValue() && z2 && (abstractC77369UYb instanceof InterfaceC47392Iiq) && (children = ((InterfaceC47392Iiq) abstractC77369UYb).LIZ().getChildren()) != null && !children.isEmpty()) {
            AbstractC28951Br abstractC28951Br = (AbstractC28951Br) ww1.LLILLJJLI.getValue();
            RecyclerView recyclerView = ww1.LJLL;
            if (recyclerView != null) {
                View LJFF = abstractC28951Br.LJFF(recyclerView.getLayoutManager());
                if (LJFF != null && (tag = LJFF.getTag()) != null && (tag instanceof AbstractC77369UYb) && ww1.LLJJJ().LJLLLLLL((AbstractC77369UYb) tag, false) == i) {
                    ww1.LLJJIJIIJIL(abstractC77369UYb, null, "");
                }
            } else {
                o.LJIJI("rvSlideSlip");
                throw null;
            }
        }
        RecyclerView recyclerView2 = ww1.LJLL;
        if (recyclerView2 != null) {
            recyclerView2.LJLIL(i);
            if (!ww1.LJLILLLLZI.LJFF.invoke().booleanValue() || !o.LJ(ww1.LLIIL, abstractC77369UYb)) {
                return;
            }
            ww1.LJLIL.LIZ();
            return;
        }
        o.LJIJI("rvSlideSlip");
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
