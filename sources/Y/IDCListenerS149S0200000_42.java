package Y;

import X.C93690aUw;
import X.C93691aUx;
import X.C93696aV2;
import X.C93970aZS;
import X.C93971aZT;
import X.C94010aa6;
import X.C94174ack;
import X.C94210adK;
import X.C94218adS;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.effectcreatormobile.behaviour.view.card.extra.ICardObjectOffset;
import com.bytedance.news.common.service.manager.IService;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public class IDCListenerS149S0200000_42 implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 3:
                onLayoutChange$3(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            default:
                return;
        }
    }

    public IDCListenerS149S0200000_42(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onLayoutChange$0(IDCListenerS149S0200000_42 iDCListenerS149S0200000_42, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        o.LJIIIZ(view, "view");
        view.removeOnLayoutChangeListener(iDCListenerS149S0200000_42);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(((View) iDCListenerS149S0200000_42.l1).getWidth(), 0.0f);
        ofFloat.setInterpolator(C94010aa6.LIZ());
        ofFloat.addUpdateListener(new IDUListenerS171S0200000_42(ofFloat, iDCListenerS149S0200000_42, 1));
        ofFloat.addListener(new C94174ack(iDCListenerS149S0200000_42));
        ofFloat.setDuration(400L);
        ofFloat.start();
    }

    public static final void onLayoutChange$1(IDCListenerS149S0200000_42 iDCListenerS149S0200000_42, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (((LinearLayout) iDCListenerS149S0200000_42.l1).getWidth() < ((C94210adK) ((IDqS419S0100000_42) ((IDqS419S0100000_42) iDCListenerS149S0200000_42.l0).l0).l0).getScrollIconContainer().getWidth()) {
            ((LinearLayout) iDCListenerS149S0200000_42.l1).setTranslationX((((C94210adK) ((IDqS419S0100000_42) ((IDqS419S0100000_42) iDCListenerS149S0200000_42.l0).l0).l0).getScrollIconContainer().getWidth() - ((LinearLayout) iDCListenerS149S0200000_42.l1).getWidth()) / 2.0f);
        }
    }

    public static final void onLayoutChange$2(IDCListenerS149S0200000_42 iDCListenerS149S0200000_42, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int left = ((C93691aUx) iDCListenerS149S0200000_42.l1).getLeft();
        C94210adK c94210adK = ((C93696aV2) ((IDqS419S0100000_42) iDCListenerS149S0200000_42.l0).l0).LJLILLLLZI;
        if (c94210adK != null) {
            if (left != c94210adK.getLeft()) {
                C93691aUx c93691aUx = (C93691aUx) iDCListenerS149S0200000_42.l1;
                int right = c93691aUx.getRight();
                C94210adK c94210adK2 = ((C93696aV2) ((IDqS419S0100000_42) iDCListenerS149S0200000_42.l0).l0).LJLILLLLZI;
                if (c94210adK2 != null) {
                    c93691aUx.measure(View.MeasureSpec.makeMeasureSpec(right - c94210adK2.getLeft(), 1073741824), View.MeasureSpec.makeMeasureSpec(((C93691aUx) iDCListenerS149S0200000_42.l1).getMeasuredHeight(), LiveLayoutPreloadThreadPriority.DEFAULT));
                    C93691aUx c93691aUx2 = (C93691aUx) iDCListenerS149S0200000_42.l1;
                    C94210adK c94210adK3 = ((C93696aV2) ((IDqS419S0100000_42) iDCListenerS149S0200000_42.l0).l0).LJLILLLLZI;
                    if (c94210adK3 != null) {
                        c93691aUx2.layout(c94210adK3.getLeft(), ((C93691aUx) iDCListenerS149S0200000_42.l1).getTop(), ((C93691aUx) iDCListenerS149S0200000_42.l1).getRight(), ((C93691aUx) iDCListenerS149S0200000_42.l1).getBottom());
                        return;
                    } else {
                        o.LJIJI("objectContainer");
                        throw null;
                    }
                }
                o.LJIJI("objectContainer");
                throw null;
            }
            return;
        }
        o.LJIJI("objectContainer");
        throw null;
    }

    public static final void onLayoutChange$3(IDCListenerS149S0200000_42 iDCListenerS149S0200000_42, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        IService iService;
        int i9;
        C93690aUw c93690aUw = (C93690aUw) iDCListenerS149S0200000_42.l0;
        C93970aZS LIZ = C93971aZT.LIZ();
        if (LIZ != null) {
            iService = (IService) LIZ.LIZ(ICardObjectOffset.class);
        } else {
            iService = null;
        }
        ICardObjectOffset iCardObjectOffset = (ICardObjectOffset) iService;
        if (iCardObjectOffset != null) {
            i9 = iCardObjectOffset.getScrollOffset(((C94218adS) iDCListenerS149S0200000_42.l1).LJLJL);
        } else {
            i9 = 0;
        }
        c93690aUw.scrollTo(i9, 0);
    }
}
