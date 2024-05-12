package Y;

import X.AnonymousClass906;
import X.C59316NPs;
import X.KL2;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.ss.android.ugc.aweme.live.notification.ui.NotificationLiveBottomDialog;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class IDDListenerS391S0100000_4 implements ViewTreeObserver.OnPreDrawListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.$t) {
            case 0:
                return onPreDraw$0(this);
            case 1:
                return onPreDraw$1(this);
            default:
                return false;
        }
    }

    public static final boolean onPreDraw$0(IDDListenerS391S0100000_4 iDDListenerS391S0100000_4) {
        View view;
        ViewTreeObserver viewTreeObserver;
        AnonymousClass906.LIZJ = System.currentTimeMillis();
        View view2 = ((C59316NPs) iDDListenerS391S0100000_4.l0).LLF;
        if (view2 != null && view2.getViewTreeObserver() != null && (view = ((C59316NPs) iDDListenerS391S0100000_4.l0).LLF) != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(iDDListenerS391S0100000_4);
            return true;
        }
        return true;
    }

    public static final boolean onPreDraw$1(IDDListenerS391S0100000_4 iDDListenerS391S0100000_4) {
        int i;
        int height = (((((NotificationLiveBottomDialog) iDDListenerS391S0100000_4.l0)._$_findCachedViewById(R.id.j71).getHeight() - ((NotificationLiveBottomDialog) iDDListenerS391S0100000_4.l0)._$_findCachedViewById(R.id.dk3).getHeight()) - (((NotificationLiveBottomDialog) iDDListenerS391S0100000_4.l0)._$_findCachedViewById(R.id.dk9).getBottom() - ((NotificationLiveBottomDialog) iDDListenerS391S0100000_4.l0)._$_findCachedViewById(R.id.dkd).getTop())) - ((NotificationLiveBottomDialog) iDDListenerS391S0100000_4.l0)._$_findCachedViewById(R.id.dkj).getBottom()) / 10;
        ViewGroup.LayoutParams layoutParams = ((NotificationLiveBottomDialog) iDDListenerS391S0100000_4.l0)._$_findCachedViewById(R.id.dkd).getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        ViewGroup.LayoutParams layoutParams2 = ((NotificationLiveBottomDialog) iDDListenerS391S0100000_4.l0)._$_findCachedViewById(R.id.dk3).getLayoutParams();
        o.LJII(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        ViewGroup.LayoutParams layoutParams3 = ((NotificationLiveBottomDialog) iDDListenerS391S0100000_4.l0)._$_findCachedViewById(R.id.j71).getLayoutParams();
        if (((NotificationLiveBottomDialog) iDDListenerS391S0100000_4.l0)._$_findCachedViewById(R.id.j71).getHeight() > ((int) (KL2.LJIIIZ(((NotificationLiveBottomDialog) iDDListenerS391S0100000_4.l0).getContext()) * 0.73d))) {
            layoutParams3.height = (int) (KL2.LJIIIZ(((NotificationLiveBottomDialog) iDDListenerS391S0100000_4.l0).getContext()) * 0.73d);
            ((NotificationLiveBottomDialog) iDDListenerS391S0100000_4.l0)._$_findCachedViewById(R.id.j71).setLayoutParams(layoutParams3);
            return false;
        }
        int i2 = height * 4;
        if (marginLayoutParams.topMargin != i2 || marginLayoutParams2.topMargin != (i = height * 3) || marginLayoutParams2.bottomMargin != i) {
            marginLayoutParams.topMargin = i2;
            int i3 = height * 3;
            marginLayoutParams2.topMargin = i3;
            marginLayoutParams2.bottomMargin = i3;
            ((NotificationLiveBottomDialog) iDDListenerS391S0100000_4.l0)._$_findCachedViewById(R.id.dkd).setLayoutParams(marginLayoutParams);
            ((NotificationLiveBottomDialog) iDDListenerS391S0100000_4.l0)._$_findCachedViewById(R.id.dk3).setLayoutParams(marginLayoutParams2);
            return false;
        }
        ((NotificationLiveBottomDialog) iDDListenerS391S0100000_4.l0)._$_findCachedViewById(R.id.dkh).getViewTreeObserver().removeOnPreDrawListener(iDDListenerS391S0100000_4);
        return true;
    }

    public IDDListenerS391S0100000_4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
