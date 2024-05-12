package Y;

import X.C77798Ug6;
import X.C79663VOh;
import X.VNA;
import X.VNL;
import X.VRK;
import X.VZ9;
import X.VZA;
import X.VZM;
import X.VZS;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ies.xelement.viewpager.LynxTabBarView;
import com.bytedance.ies.xelement.viewpager.viewpager.BaseLynxViewPager;
import com.lynx.tasm.behavior.ui.swiper.XSwiperUI;
import com.lynx.tasm.behavior.ui.view.UIView;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class IDCListenerS248S0100000_14 implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;

    public static final void onViewDetachedFromWindow$1(IDCListenerS248S0100000_14 iDCListenerS248S0100000_14, View view) {
    }

    public static final void onViewDetachedFromWindow$3(IDCListenerS248S0100000_14 iDCListenerS248S0100000_14, View view) {
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
            case 4:
                onViewAttachedToWindow$4(this, view);
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
            case 4:
                onViewDetachedFromWindow$4(this, view);
                return;
            default:
                return;
        }
    }

    public IDCListenerS248S0100000_14(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onViewAttachedToWindow$0(IDCListenerS248S0100000_14 iDCListenerS248S0100000_14, View view) {
        Map<String, VNA> map;
        UIView uIView = (UIView) iDCListenerS248S0100000_14.l0;
        if (view == uIView.mView && (map = uIView.mEvents) != null && map.containsKey("attach")) {
            C79663VOh c79663VOh = new C79663VOh(((UIView) iDCListenerS248S0100000_14.l0).getSign(), "attach");
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("impression_id", ((VRK) ((UIView) iDCListenerS248S0100000_14.l0).mView).getImpressionId());
            c79663VOh.LIZLLL = "params";
            c79663VOh.LJ = hashMap;
            VNL vnl = ((UIView) iDCListenerS248S0100000_14.l0).mContext.LJLJJL;
            if (vnl != null) {
                vnl.LIZIZ(c79663VOh);
            }
        }
    }

    public static final void onViewAttachedToWindow$1(IDCListenerS248S0100000_14 iDCListenerS248S0100000_14, View view) {
        C77798Ug6 c77798Ug6 = ((LynxTabBarView) iDCListenerS248S0100000_14.l0).LJLILLLLZI;
        if (c77798Ug6 != null) {
            c77798Ug6.post(new ARunnableS50S0100000_14(iDCListenerS248S0100000_14, 142));
        } else {
            o.LJIJI("mTabLayout");
            throw null;
        }
    }

    public static final void onViewAttachedToWindow$2(IDCListenerS248S0100000_14 iDCListenerS248S0100000_14, View view) {
        VZS vzs;
        if (view != null && (vzs = ((VZM) iDCListenerS248S0100000_14.l0).LLFZ.get(view)) != null) {
            vzs.LIZIZ = true;
        }
    }

    public static final void onViewAttachedToWindow$3(IDCListenerS248S0100000_14 iDCListenerS248S0100000_14, View view) {
        ((BaseLynxViewPager) iDCListenerS248S0100000_14.l0).LJIL().post(new ARunnableS50S0100000_14(iDCListenerS248S0100000_14, 181));
    }

    public static final void onViewAttachedToWindow$4(IDCListenerS248S0100000_14 iDCListenerS248S0100000_14, View view) {
        XSwiperUI xSwiperUI = (XSwiperUI) iDCListenerS248S0100000_14.l0;
        xSwiperUI.LL = true;
        if (xSwiperUI.LJLLL) {
            xSwiperUI.LLI.removeCallbacks(xSwiperUI.LLII);
            XSwiperUI xSwiperUI2 = (XSwiperUI) iDCListenerS248S0100000_14.l0;
            xSwiperUI2.LLI.postDelayed(xSwiperUI2.LLII, xSwiperUI2.LJLZ);
        }
    }

    public static final void onViewDetachedFromWindow$0(IDCListenerS248S0100000_14 iDCListenerS248S0100000_14, View view) {
        Map<String, VNA> map;
        UIView uIView = (UIView) iDCListenerS248S0100000_14.l0;
        if (view == uIView.mView && (map = uIView.mEvents) != null && map.containsKey("detach")) {
            C79663VOh c79663VOh = new C79663VOh(((UIView) iDCListenerS248S0100000_14.l0).getSign(), "detach");
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("impression_id", ((VRK) ((UIView) iDCListenerS248S0100000_14.l0).mView).getImpressionId());
            c79663VOh.LIZLLL = "params";
            c79663VOh.LJ = hashMap;
            VNL vnl = ((UIView) iDCListenerS248S0100000_14.l0).mContext.LJLJJL;
            if (vnl != null) {
                vnl.LIZIZ(c79663VOh);
            }
        }
    }

    public static final void onViewDetachedFromWindow$2(IDCListenerS248S0100000_14 iDCListenerS248S0100000_14, View view) {
        VZS vzs;
        if (view != null && (vzs = ((VZM) iDCListenerS248S0100000_14.l0).LLFZ.get(view)) != null) {
            vzs.LIZIZ = false;
        }
    }

    public static final void onViewDetachedFromWindow$4(IDCListenerS248S0100000_14 iDCListenerS248S0100000_14, View view) {
        XSwiperUI xSwiperUI = (XSwiperUI) iDCListenerS248S0100000_14.l0;
        if (xSwiperUI.LLFFF && ((VZ9) xSwiperUI.mView).getViewPager().LJLL) {
            VZA viewPager = ((VZ9) ((XSwiperUI) iDCListenerS248S0100000_14.l0).mView).getViewPager();
            if (viewPager.LLJILJIL != Integer.MIN_VALUE) {
                if (viewPager.LJIIJJI()) {
                    viewPager.scrollTo(viewPager.LJLJLLL.getCurrX(), viewPager.LLJILJIL);
                } else {
                    viewPager.scrollTo(viewPager.LLJILJIL, viewPager.LJLJLLL.getCurrY());
                }
            }
            viewPager.LLJILJIL = LiveLayoutPreloadThreadPriority.DEFAULT;
        }
        XSwiperUI xSwiperUI2 = (XSwiperUI) iDCListenerS248S0100000_14.l0;
        xSwiperUI2.LL = false;
        xSwiperUI2.LLI.removeCallbacks(xSwiperUI2.LLII);
    }
}
