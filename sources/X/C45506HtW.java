package X;

import android.app.Activity;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.HtW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45506HtW extends TAT {
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ C45498HtO LJLJJL;

    @Override // X.TAT
    public final void LIZ(View view) {
        if (this.LJLJJL.LJLLI.LIZIZ()) {
            Activity LJIJJ = C45804HyK.LJIJJ(this.LJLJJL.LJLJJL);
            if (LJIJJ != null) {
                C26045AKb c26045AKb = new C26045AKb(LJIJJ);
                c26045AKb.LJIIIZ(this.LJLJJL.LJLJJI);
                c26045AKb.LJIIJ();
                return;
            } else {
                C5S1 c5s1 = new C5S1(this.LJLJJL.LJLJJL);
                c5s1.LIZLLL(this.LJLJJL.LJLJJI);
                c5s1.LJ();
                return;
            }
        }
        List<InterfaceC45547HuB> list = this.LJLJJL.LLIIIILZ;
        if (list == null) {
            return;
        }
        int size = list.size();
        int i = this.LJLJJI;
        if (size <= i) {
            return;
        }
        ((InterfaceC45547HuB) ListProtector.get(this.LJLJJL.LLIIIILZ, i)).getClickListener().onClick(view);
    }

    public C45506HtW(C45498HtO c45498HtO, int i) {
        this.LJLJJL = c45498HtO;
        this.LJLJJI = i;
    }
}
