package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Rgy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70208Rgy extends RecyclerView.ViewHolder {
    public final ViewGroup LJLIL;
    public final InterfaceC71003Rtn LJLILLLLZI;
    public final C70120RfY LJLJI;
    public final PdpViewModel LJLJJI;
    public final ECT LJLJJL;
    public final InterfaceC70119RfX LJLJJLL;
    public String LJLJL;
    public final C62822Ol8 LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70208Rgy(ViewGroup parent, InterfaceC71003Rtn trackNode, C70120RfY logger, PdpViewModel vm, ECT impressionUtil, InterfaceC70119RfX buyTogetherListener, boolean z) {
        super(C72545SdZ.LIZJ(parent, "parent.context", R.layout.a25, parent, false));
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(trackNode, "trackNode");
        o.LJIIIZ(logger, "logger");
        o.LJIIIZ(vm, "vm");
        o.LJIIIZ(impressionUtil, "impressionUtil");
        o.LJIIIZ(buyTogetherListener, "buyTogetherListener");
        this.LJLIL = parent;
        this.LJLILLLLZI = trackNode;
        this.LJLJI = logger;
        this.LJLJJI = vm;
        this.LJLJJL = impressionUtil;
        this.LJLJJLL = buyTogetherListener;
        this.LJLJLJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1194));
        if (z) {
            ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = C7MY.LIZIZ(152);
            marginLayoutParams.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
            this.itemView.setLayoutParams(marginLayoutParams);
            ViewGroup.LayoutParams layoutParams2 = this.itemView.findViewById(R.id.i5y).getLayoutParams();
            o.LJII(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            layoutParams2.width = O6R.LJJIIZ(C32151Nz.LJIIZILJ(152));
            layoutParams2.height = C7MY.LIZIZ(152);
            this.itemView.findViewById(R.id.i5y).setLayoutParams(layoutParams2);
        }
    }
}
