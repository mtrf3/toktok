package X;

import android.text.Layout;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Announcement;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.utils.Au2S11S0300000_12;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS65S1100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.RgR, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC70175RgR implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ C70085Rez LJLIL;
    public final /* synthetic */ Announcement LJLILLLLZI;
    public final /* synthetic */ PdpFragment LJLJI;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        String str;
        Layout layout = ((TextView) this.LJLIL.LIZ(R.id.hk7)).getLayout();
        if (layout != null) {
            C70085Rez c70085Rez = this.LJLIL;
            Announcement announcement = this.LJLILLLLZI;
            PdpFragment pdpFragment = this.LJLJI;
            if (layout.getEllipsisCount(layout.getLineCount() - 1) == 0) {
                ((ImageView) c70085Rez.LIZ(R.id.hk6)).setVisibility(8);
                str = "disable";
            } else {
                ((ImageView) c70085Rez.LIZ(R.id.hk6)).setVisibility(0);
                View pdp_announcement = c70085Rez.LIZ(R.id.hk5);
                o.LJIIIIZZ(pdp_announcement, "pdp_announcement");
                C16880lQ.LJIIJ(new Au2S11S0300000_12(pdpFragment, announcement, c70085Rez, 7), pdp_announcement);
                str = "normal";
            }
            if ((pdpFragment instanceof InterfaceC71003Rtn) && pdpFragment != null) {
                C78946Uyc.LJJII(pdpFragment, new C70890Rry(), new AqS65S1100000_12(announcement, str, 6));
            }
        }
        ViewTreeObserver viewTreeObserver = this.LJLIL.LIZ(R.id.hk7).getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC70175RgR(Announcement announcement, PdpFragment pdpFragment, PdpViewModel pdpViewModel, C70085Rez c70085Rez) {
        this.LJLIL = c70085Rez;
        this.LJLILLLLZI = announcement;
        this.LJLJI = pdpFragment;
    }
}
