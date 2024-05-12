package X;

import Y.ACListenerS23S0100000_3;
import Y.AObserverS71S0100000_3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.comment.gift.model.GiftStruct;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.72W, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C72W extends RelativeLayout {
    public TuxIconView LJLIL;
    public SmartImageView LJLILLLLZI;
    public GiftViewModel LJLJI;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C72W(Context context) {
        this(context, null);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72W(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.pu, this, true);
        this.LJLIL = (TuxIconView) getRootView().findViewById(R.id.ivk);
        this.LJLILLLLZI = (SmartImageView) getRootView().findViewById(R.id.jmd);
        setVisibility(8);
        SmartImageView smartImageView = this.LJLILLLLZI;
        if (smartImageView == null) {
            return;
        }
        smartImageView.setVisibility(8);
    }

    public final void LIZ(GiftViewModel giftViewModel, LifecycleOwner lifecycleOwner, boolean z) {
        o.LJIIIZ(giftViewModel, "giftViewModel");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLJI = giftViewModel;
        MutableLiveData<GiftStruct> jv0 = giftViewModel.jv0();
        if (jv0 != null) {
            jv0.observe(lifecycleOwner, new AObserverS71S0100000_3(this, 8));
        }
        SmartImageView smartImageView = this.LJLILLLLZI;
        if (smartImageView != null) {
            if (z) {
                ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
                marginLayoutParams.topMargin = O6R.LJJIIZ(C32151Nz.LJIIZILJ(2));
                marginLayoutParams.width = C7MY.LIZIZ(35);
                marginLayoutParams.height = C7MY.LIZIZ(35);
            }
            C16880lQ.LJJIJLIJ(smartImageView, new ACListenerS23S0100000_3(this, 19));
        }
        TuxIconView tuxIconView = this.LJLIL;
        if (tuxIconView != null) {
            if (z) {
                ViewGroup.LayoutParams layoutParams2 = tuxIconView.getLayoutParams();
                o.LJII(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(39)));
                marginLayoutParams2.topMargin = O6R.LJJIIZ(C32151Nz.LJIIZILJ(3));
            }
            C16880lQ.LJJJ(tuxIconView, new ACListenerS23S0100000_3(this, 20));
        }
        if (z) {
            ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
            o.LJII(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams3).height = C7MY.LIZIZ(40);
        }
    }
}
