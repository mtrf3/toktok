package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder.CCDCDateElementViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;

/* loaded from: classes13.dex */
public final class SD8 implements View.OnFocusChangeListener {
    public final /* synthetic */ SD3 LJLIL;
    public final /* synthetic */ ElementDTO LJLILLLLZI;

    public SD8(SD3 sd3, ElementDTO elementDTO) {
        this.LJLIL = sd3;
        this.LJLILLLLZI = elementDTO;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        this.LJLIL.getFocusChange().invoke(Boolean.valueOf(z));
        this.LJLIL.setTextHasFocus(z);
        if (z) {
            this.LJLIL.LIZJ();
            this.LJLIL.getOnErrorClear().invoke();
            C28112B1o.LJFF(C28112B1o.LJIILIIL(this.LJLILLLLZI.paramName));
            C28112B1o.LJIILJJIL(C65352Pkq.LIZ(CCDCDateElementViewHolder.class).LJFF());
            return;
        }
        String invoke = this.LJLIL.getOnVerify().invoke(this.LJLIL.getValue());
        if (invoke == null) {
            return;
        }
        this.LJLIL.LJ(new C253009wO(invoke, null, false, 6));
    }
}
