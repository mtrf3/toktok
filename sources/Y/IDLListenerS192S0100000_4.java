package Y;

import X.AKM;
import X.AOX;
import X.C32151Nz;
import X.C9G0;
import X.InterfaceC65784Pro;
import X.O6R;
import X.OUP;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.us.osp.module.shop.USShopInfoVH;
import com.ss.android.ugc.aweme.music.assem.list.cell.v2.MusicCellHighlightAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class IDLListenerS192S0100000_4 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ void onGlobalLayout$3(IDLListenerS192S0100000_4 iDLListenerS192S0100000_4) {
        ((InterfaceC65784Pro) iDLListenerS192S0100000_4.l0).invoke();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                return;
            case 1:
                onGlobalLayout$1(this);
                return;
            case 2:
                onGlobalLayout$2(this);
                return;
            case 3:
                onGlobalLayout$3(this);
                return;
            case 4:
                onGlobalLayout$4(this);
                return;
            case 5:
                onGlobalLayout$5(this);
                return;
            case 6:
                onGlobalLayout$6(this);
                return;
            default:
                return;
        }
    }

    public static final void onGlobalLayout$0(IDLListenerS192S0100000_4 iDLListenerS192S0100000_4) {
        View view = ((AKM) iDLListenerS192S0100000_4.l0).LIZLLL;
        if (view != null) {
            int height = view.getHeight();
            Integer num = ((AKM) iDLListenerS192S0100000_4.l0).LJII;
            if (num == null || num.intValue() != height) {
                ((AKM) iDLListenerS192S0100000_4.l0).LJII = Integer.valueOf(height);
                BottomSheetBehavior<LinearLayout> bottomSheetBehavior = ((AKM) iDLListenerS192S0100000_4.l0).LJ;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.setPeekHeight(height);
                    return;
                } else {
                    o.LJIJI("bottomSheetBehavior");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("root");
        throw null;
    }

    public static final void onGlobalLayout$1(IDLListenerS192S0100000_4 iDLListenerS192S0100000_4) {
        OrderSubmitFragment orderSubmitFragment = (OrderSubmitFragment) iDLListenerS192S0100000_4.l0;
        orderSubmitFragment.withState(orderSubmitFragment.getViewModel(), new AqS135S0200000_4((OrderSubmitFragment) iDLListenerS192S0100000_4.l0, iDLListenerS192S0100000_4, 33));
    }

    public static final void onGlobalLayout$2(IDLListenerS192S0100000_4 iDLListenerS192S0100000_4) {
        ((AOX) iDLListenerS192S0100000_4.l0).LIZJ();
    }

    public static final void onGlobalLayout$4(IDLListenerS192S0100000_4 iDLListenerS192S0100000_4) {
        ViewTreeObserver viewTreeObserver;
        Layout layout;
        TextView textView = (TextView) ((USShopInfoVH) iDLListenerS192S0100000_4.l0)._$_findCachedViewById(R.id.mx8);
        if (textView != null && (layout = textView.getLayout()) != null) {
            USShopInfoVH uSShopInfoVH = (USShopInfoVH) iDLListenerS192S0100000_4.l0;
            if (layout.getEllipsisCount(layout.getLineCount() - 1) == 0) {
                View us_order_submit_shop_official_logo = uSShopInfoVH._$_findCachedViewById(R.id.mx_);
                o.LJIIIIZZ(us_order_submit_shop_official_logo, "us_order_submit_shop_official_logo");
                if (us_order_submit_shop_official_logo.getVisibility() == 0) {
                    View us_order_submit_shop_name = uSShopInfoVH._$_findCachedViewById(R.id.mx8);
                    o.LJIIIIZZ(us_order_submit_shop_name, "us_order_submit_shop_name");
                    OUP.LJJJJJ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), us_order_submit_shop_name);
                }
            }
            View us_order_submit_shop_name2 = uSShopInfoVH._$_findCachedViewById(R.id.mx8);
            o.LJIIIIZZ(us_order_submit_shop_name2, "us_order_submit_shop_name");
            OUP.LJJJJJ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0)), us_order_submit_shop_name2);
        }
        View _$_findCachedViewById = ((USShopInfoVH) iDLListenerS192S0100000_4.l0)._$_findCachedViewById(R.id.mx8);
        if (_$_findCachedViewById != null && (viewTreeObserver = _$_findCachedViewById.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(iDLListenerS192S0100000_4);
        }
    }

    public static final void onGlobalLayout$5(IDLListenerS192S0100000_4 iDLListenerS192S0100000_4) {
        ((MusicCellHighlightAssem) iDLListenerS192S0100000_4.l0).Y3().getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS192S0100000_4);
        int width = ((MusicCellHighlightAssem) iDLListenerS192S0100000_4.l0).Y3().getWidth();
        TuxTextView tuxTextView = ((MusicCellHighlightAssem) iDLListenerS192S0100000_4.l0).LLFII;
        if (tuxTextView != null) {
            int width2 = tuxTextView.getWidth();
            LinearLayout linearLayout = ((MusicCellHighlightAssem) iDLListenerS192S0100000_4.l0).LLFZ;
            if (linearLayout != null && linearLayout.getWidth() + width2 > width) {
                int i = width - width2;
                if (i < 0) {
                    i = 0;
                }
                LinearLayout linearLayout2 = ((MusicCellHighlightAssem) iDLListenerS192S0100000_4.l0).LLFZ;
                if (linearLayout2 != null) {
                    ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = i;
                        linearLayout2.setLayoutParams(layoutParams);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
        }
    }

    public static final void onGlobalLayout$6(IDLListenerS192S0100000_4 iDLListenerS192S0100000_4) {
        ((C9G0) iDLListenerS192S0100000_4.l0).LIZ(R.id.dbp).getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS192S0100000_4);
        ViewGroup.LayoutParams layoutParams = ((C9G0) iDLListenerS192S0100000_4.l0).LIZ(R.id.dbp).getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.height = layoutParams2.width;
        ((C9G0) iDLListenerS192S0100000_4.l0).LIZ(R.id.dbp).setLayoutParams(layoutParams2);
    }

    public IDLListenerS192S0100000_4(InterfaceC65784Pro function, int i) {
        this.$t = i;
        o.LJIIIZ(function, "function");
        this.l0 = function;
    }

    public IDLListenerS192S0100000_4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
