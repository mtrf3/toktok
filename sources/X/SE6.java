package X;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.IPaymentViewStyle;

/* loaded from: classes13.dex */
public abstract class SE6 extends ViewDataBinding {
    public static final /* synthetic */ int LLFZ = 0;
    public final FrameLayout LL;
    public final TuxIconView LLD;
    public final SmartImageView LLF;
    public final TuxTextView LLFF;
    public final ConstraintLayout LLFFF;
    public IPaymentViewStyle LLFII;

    public abstract void LJIILLIIL(IPaymentViewStyle iPaymentViewStyle);

    public SE6(Object obj, View view, FrameLayout frameLayout, TuxIconView tuxIconView, SmartImageView smartImageView, TuxTextView tuxTextView, ConstraintLayout constraintLayout) {
        super(0, view, obj);
        this.LL = frameLayout;
        this.LLD = tuxIconView;
        this.LLF = smartImageView;
        this.LLFF = tuxTextView;
        this.LLFFF = constraintLayout;
    }
}
