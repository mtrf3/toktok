package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder;

import X.C16880lQ;
import X.C26338AVi;
import X.C26706Ady;
import X.C27594AsI;
import X.C27596AsK;
import X.C28112B1o;
import X.C45804HyK;
import X.C78685UuP;
import X.C79045V0n;
import X.EnumC27595AsJ;
import X.EnumC72807Shn;
import X.OSZ;
import X.W5F;
import X.W5U;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes5.dex */
public final class CCDCPromotionViewHolder extends PowerCell<C27596AsK> implements c {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public final C27594AsI delegate = new C27594AsI(EnumC27595AsJ.INDEPENDENT_CCDC_ADDITION_PAGE);
    public boolean shown;

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public View getContainerView() {
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        return itemView;
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onBindItemView(C27596AsK t) {
        o.LJIIIZ(t, "t");
        super.onBindItemView((CCDCPromotionViewHolder) t);
        C27594AsI c27594AsI = this.delegate;
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        PaymentMethod paymentMethod = t.LJLIL;
        c27594AsI.getClass();
        o.LJIIIZ(paymentMethod, "paymentMethod");
        ViewGroup viewGroup = (ViewGroup) itemView;
        viewGroup.removeAllViews();
        Context context = viewGroup.getContext();
        o.LJIIIIZZ(context, "context");
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C45804HyK.LJJI(2);
        tuxTextView.setLayoutParams(layoutParams);
        tuxTextView.setTuxFont(61);
        tuxTextView.setTextColorRes(R.attr.gu);
        tuxTextView.setText(tuxTextView.getContext().getString(R.string.fbk));
        viewGroup.addView(tuxTextView);
        Iterator it = ((ArrayList) paymentMethod.LJIILIIL()).iterator();
        while (it.hasNext()) {
            OSZ osz = (OSZ) it.next();
            LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.topMargin = C45804HyK.LJJI(14);
            linearLayout.setLayoutParams(layoutParams2);
            linearLayout.setOrientation(0);
            linearLayout.setGravity(16);
            SmartImageView smartImageView = new SmartImageView(viewGroup.getContext());
            smartImageView.setLayoutParams(new LinearLayout.LayoutParams(c27594AsI.LIZ, c27594AsI.LIZIZ));
            smartImageView.setBackgroundResource(R.drawable.abg);
            Object first = osz.getFirst();
            String str = (String) first;
            if (str == null || !C78685UuP.LJJJZ(str)) {
                first = null;
            }
            String str2 = (String) first;
            if (str2 == null) {
                str2 = " ";
            }
            W5F LJIIIIZZ = W5U.LJIIIIZZ(str2);
            Context context2 = smartImageView.getContext();
            o.LJIIIIZZ(context2, "context");
            LJIIIIZZ.LJIILIIL = C79045V0n.LJIIIIZZ(R.attr.cv, context2);
            LJIIIIZZ.LJIJJ = EnumC72807Shn.FIT_XY;
            LJIIIIZZ.LJJIIJZLJL = smartImageView;
            C16880lQ.LLJJJ(LJIIIIZZ);
            smartImageView.setCircleOptions(c27594AsI.LIZJ);
            linearLayout.addView(smartImageView);
            Context context3 = viewGroup.getContext();
            o.LJIIIIZZ(context3, "context");
            TuxTextView tuxTextView2 = new TuxTextView(context3, null, 6, 0);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.setMarginStart(C45804HyK.LJJI(4));
            tuxTextView2.setLayoutParams(layoutParams3);
            tuxTextView2.setTuxFont(81);
            tuxTextView2.setTextColorRes(R.attr.gv);
            String str3 = (String) osz.getSecond();
            if (str3 == null) {
                str3 = "";
            }
            tuxTextView2.setText(str3);
            linearLayout.addView(tuxTextView2);
            viewGroup.addView(linearLayout);
        }
        if (!this.shown) {
            this.shown = true;
            C28112B1o.LJIIIZ("partner_privileges");
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        LinearLayout linearLayout = new LinearLayout(context);
        int i = -1;
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(8388611);
        Integer LJI = C79045V0n.LJI(R.attr.c9, context);
        if (LJI != null) {
            i = LJI.intValue();
        }
        linearLayout.setBackgroundColor(i);
        C26338AVi.LJIIIZ(linearLayout, Integer.valueOf(C45804HyK.LJJI(16)), Integer.valueOf(C45804HyK.LJJI(16)), Integer.valueOf(C45804HyK.LJJI(16)), Integer.valueOf(C45804HyK.LJJI(16)), 16);
        return linearLayout;
    }
}
