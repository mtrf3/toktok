package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.returnpolicies.IReturnPoliciesItemViewStyle;

/* loaded from: classes13.dex */
public abstract class SE8 extends ViewDataBinding {
    public static final /* synthetic */ int LLFII = 0;
    public final TuxTextView LL;
    public final ConstraintLayout LLD;
    public final TuxIconView LLF;
    public final TuxTextView LLFF;
    public IReturnPoliciesItemViewStyle LLFFF;

    public abstract void LJIILLIIL(IReturnPoliciesItemViewStyle iReturnPoliciesItemViewStyle);

    public SE8(Object obj, View view, TuxTextView tuxTextView, ConstraintLayout constraintLayout, TuxIconView tuxIconView, TuxTextView tuxTextView2) {
        super(0, view, obj);
        this.LL = tuxTextView;
        this.LLD = constraintLayout;
        this.LLF = tuxIconView;
        this.LLFF = tuxTextView2;
    }
}
