package X;

import Y.ARunnableS15S0201000_12;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.core.view.skc.SkuFlowLayoutManager;
import defpackage.a1;
import java.util.List;

/* renamed from: X.Rhp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70261Rhp extends FrameLayout {
    public int LJLIL;
    public int LJLILLLLZI;
    public List<? extends InterfaceC70269Rhx> LJLJI;
    public boolean LJLJJI;
    public InterfaceC70263Rhr<InterfaceC70269Rhx> LJLJJL;
    public int LJLJJLL;
    public final RecyclerView LJLJL;
    public final C70265Rht LJLJLJ;

    public final int getSelectIndex() {
        return this.LJLJJLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70261Rhp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLJI = C61878OQg.INSTANCE;
        this.LJLJJI = true;
        this.LJLJJLL = -1;
        setClipChildren(false);
        RecyclerView recyclerView = new RecyclerView(context, null);
        this.LJLJL = recyclerView;
        recyclerView.setClipChildren(false);
        recyclerView.setClipToPadding(false);
        recyclerView.setItemAnimator(null);
        C70265Rht c70265Rht = new C70265Rht(this);
        this.LJLJLJ = c70265Rht;
        recyclerView.setAdapter(c70265Rht);
        addView(recyclerView, -1, -2);
    }

    public final <D extends InterfaceC70269Rhx, V extends InterfaceC70267Rhv<D>> void LIZ(List<? extends D> list, int i, boolean z, InterfaceC70264Rhs<D, V> interfaceC70264Rhs, InterfaceC70263Rhr<D> interfaceC70263Rhr) {
        SkuFlowLayoutManager skuFlowLayoutManager;
        this.LJLJJLL = -1;
        this.LJLJI = list;
        this.LJLJJI = z;
        this.LJLJJL = interfaceC70263Rhr;
        C70265Rht c70265Rht = this.LJLJLJ;
        if (c70265Rht != null) {
            c70265Rht.LJLIL = interfaceC70264Rhs;
            c70265Rht.submitList(list, new ARunnableS15S0201000_12(i, this, list, 0));
        }
        if (this.LJLJL.getLayoutManager() == null) {
            if (i == 2) {
                RecyclerView recyclerView = this.LJLJL;
                getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
            } else {
                this.LJLJL.setLayoutManager(new SkuFlowLayoutManager());
            }
        }
        C0A2 layoutManager = this.LJLJL.getLayoutManager();
        if ((layoutManager instanceof SkuFlowLayoutManager) && (skuFlowLayoutManager = (SkuFlowLayoutManager) layoutManager) != null) {
            skuFlowLayoutManager.LJLZ = this.LJLIL;
            skuFlowLayoutManager.LJZ();
        }
    }
}
