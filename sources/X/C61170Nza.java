package X;

import Y.ACListenerS30S0100000_10;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdkapi.host.IHostHybrid;
import com.bytedance.hybrid.spark.SparkContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Nza, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C61170Nza extends AbstractC60796NtY {
    public InterfaceC60814Ntq LJLILLLLZI;
    public SparkContext LJLJI;

    public void LIZLLL(SparkContext sparkContext) {
        throw null;
    }

    @Override // X.InterfaceC60814Ntq
    public final View LJIJ() {
        InterfaceC60814Ntq interfaceC60814Ntq = this.LJLILLLLZI;
        if (interfaceC60814Ntq != null) {
            return interfaceC60814Ntq.LJIJ();
        }
        return null;
    }

    @Override // X.InterfaceC60814Ntq
    public final void LIZ(Context context) {
        InterfaceC60814Ntq interfaceC60814Ntq = this.LJLILLLLZI;
        if (interfaceC60814Ntq != null) {
            interfaceC60814Ntq.LIZ(context);
        }
    }

    @Override // X.AbstractC60796NtY
    public final void LIZIZ(SparkContext sparkContext) {
        C60788NtQ c60788NtQ;
        o.LJIIIZ(sparkContext, "sparkContext");
        this.LJLJI = sparkContext;
        IHostHybrid iHostHybrid = (IHostHybrid) CN1.LIZ(IHostHybrid.class);
        if (iHostHybrid != null) {
            c60788NtQ = iHostHybrid.Cz();
        } else {
            c60788NtQ = null;
        }
        if (c60788NtQ instanceof InterfaceC60814Ntq) {
            this.LJLILLLLZI = c60788NtQ;
        }
    }

    @Override // X.InterfaceC60814Ntq
    public final View LJIJJLI(NV7 refresher) {
        View view;
        o.LJIIIZ(refresher, "refresher");
        InterfaceC60814Ntq interfaceC60814Ntq = this.LJLILLLLZI;
        if (interfaceC60814Ntq != null) {
            view = interfaceC60814Ntq.LJIJJLI(refresher);
        } else {
            view = null;
        }
        if (view instanceof FrameLayout) {
            ViewGroup viewGroup = (ViewGroup) view;
            LiveIconView liveIconView = new LiveIconView(viewGroup.getContext(), null);
            liveIconView.setIconAttr(R.attr.aw0);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C15380j0.LIZ(30.0f), C15380j0.LIZ(30.0f));
            layoutParams.gravity = 8388661;
            layoutParams.setMarginEnd(C15380j0.LIZ(20.0f));
            layoutParams.topMargin = C15430j5.LIZ(viewGroup.getContext()) + C15380j0.LJIILIIL() + C15380j0.LIZ(20.0f);
            C16880lQ.LJJII(liveIconView, new ACListenerS30S0100000_10(this, 67));
            viewGroup.addView(liveIconView, layoutParams);
        }
        return view;
    }
}
