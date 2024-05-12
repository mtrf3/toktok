package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WnP, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83347WnP implements C0A3 {
    public final /* synthetic */ C83332WnA LJLIL;

    public C83347WnP(C83332WnA c83332WnA) {
        this.LJLIL = c83332WnA;
    }

    @Override // X.C0A3
    public final void LJIILIIL(View view) {
        List<? extends AbstractC83320Wmy> list;
        o.LJIIIZ(view, "view");
        this.LJLIL.N().getClass();
        int LJJJJIZL = RecyclerView.LJJJJIZL(view);
        C83351WnT c83351WnT = this.LJLIL.LJLLLL;
        if (c83351WnT == null || (list = c83351WnT.LJI) == null || LJJJJIZL == -1 || LJJJJIZL >= list.size()) {
            return;
        }
        this.LJLIL.LJLZ.remove(ListProtector.get(list, LJJJJIZL).toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f2, code lost:
    
        if (r1 != null) goto L48;
     */
    @Override // X.C0A3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIFFI(android.view.View r18) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83347WnP.LJJIFFI(android.view.View):void");
    }
}
