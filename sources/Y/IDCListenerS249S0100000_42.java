package Y;

import X.C93651aUJ;
import X.C94418agg;
import android.view.View;
import com.bytedance.effectcreatormobile.assetEditor.base.BindingBaseFragment;
import com.bytedance.effectcreatormobile.behaviour.base.BehaviourBaseFragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes34.dex */
public class IDCListenerS249S0100000_42 implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;

    public static final void onViewAttachedToWindow$0(IDCListenerS249S0100000_42 iDCListenerS249S0100000_42, View view) {
    }

    public static final void onViewAttachedToWindow$1(IDCListenerS249S0100000_42 iDCListenerS249S0100000_42, View view) {
    }

    public static final void onViewAttachedToWindow$3(IDCListenerS249S0100000_42 iDCListenerS249S0100000_42, View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewAttachedToWindow$0(this, view);
                return;
            case 1:
                onViewAttachedToWindow$1(this, view);
                return;
            case 2:
                onViewAttachedToWindow$2(this, view);
                return;
            case 3:
                onViewAttachedToWindow$3(this, view);
                return;
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewDetachedFromWindow$0(this, view);
                return;
            case 1:
                onViewDetachedFromWindow$1(this, view);
                return;
            case 2:
                onViewDetachedFromWindow$2(this, view);
                return;
            case 3:
                onViewDetachedFromWindow$3(this, view);
                return;
            default:
                return;
        }
    }

    public IDCListenerS249S0100000_42(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onViewAttachedToWindow$2(IDCListenerS249S0100000_42 iDCListenerS249S0100000_42, View view) {
        View view2;
        C94418agg c94418agg = (C94418agg) iDCListenerS249S0100000_42.l0;
        if (view != null) {
            view2 = view.findViewById(R.id.nn_);
        } else {
            view2 = null;
        }
        c94418agg.LJLLL = view2;
    }

    public static final void onViewDetachedFromWindow$0(IDCListenerS249S0100000_42 iDCListenerS249S0100000_42, View view) {
        ((BindingBaseFragment) iDCListenerS249S0100000_42.l0).LJLILLLLZI = null;
    }

    public static final void onViewDetachedFromWindow$1(IDCListenerS249S0100000_42 iDCListenerS249S0100000_42, View view) {
        ((BehaviourBaseFragment) iDCListenerS249S0100000_42.l0).LJLILLLLZI = null;
    }

    public static final void onViewDetachedFromWindow$2(IDCListenerS249S0100000_42 iDCListenerS249S0100000_42, View view) {
        ((C94418agg) iDCListenerS249S0100000_42.l0).LJLLL = null;
    }

    public static final void onViewDetachedFromWindow$3(IDCListenerS249S0100000_42 iDCListenerS249S0100000_42, View view) {
        ((C93651aUJ) iDCListenerS249S0100000_42.l0).dismiss();
    }
}
