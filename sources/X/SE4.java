package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.userright.IUserRightItemViewStyle;

/* loaded from: classes13.dex */
public abstract class SE4 extends ViewDataBinding {
    public static final /* synthetic */ int LLIFFJFJJ = 0;
    public final ConstraintLayout LL;
    public final TuxIconView LLD;
    public final TuxIconView LLF;
    public final TuxTextView LLFF;
    public final TuxIconView LLFFF;
    public final TuxTextView LLFII;
    public final ConstraintLayout LLFZ;
    public IUserRightItemViewStyle LLI;

    public abstract void LJIILLIIL(IUserRightItemViewStyle iUserRightItemViewStyle);

    public SE4(Object obj, View view, ConstraintLayout constraintLayout, TuxIconView tuxIconView, TuxIconView tuxIconView2, TuxTextView tuxTextView, TuxIconView tuxIconView3, TuxTextView tuxTextView2, ConstraintLayout constraintLayout2) {
        super(0, view, obj);
        this.LL = constraintLayout;
        this.LLD = tuxIconView;
        this.LLF = tuxIconView2;
        this.LLFF = tuxTextView;
        this.LLFFF = tuxIconView3;
        this.LLFII = tuxTextView2;
        this.LLFZ = constraintLayout2;
    }
}
