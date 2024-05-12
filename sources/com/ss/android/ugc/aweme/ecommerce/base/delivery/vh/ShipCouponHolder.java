package com.ss.android.ugc.aweme.ecommerce.base.delivery.vh;

import X.AnonymousClass636;
import X.C1FL;
import X.C26508Aam;
import X.C26824Afs;
import X.C26937Ahh;
import X.C27157AlF;
import X.C32151Nz;
import X.C44878HjO;
import X.C47261Igj;
import X.C70649Ro5;
import X.C76542zS;
import X.C7MY;
import X.O6R;
import X.RU7;
import X.RUH;
import X.RUP;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS29S1000000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ShipCouponHolder extends ECJediViewHolder {
    public final Map<Integer, View> LJLIL;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C26508Aam.LIZ(itemView, true);
        C70649Ro5 c70649Ro5 = (C70649Ro5) this.itemView.findViewById(R.id.l0l);
        C27157AlF block = C27157AlF.LJLIL;
        c70649Ro5.getClass();
        o.LJIIIZ(block, "block");
        block.invoke(c70649Ro5);
        c70649Ro5.setTagUi(new RUP(new RUH(0, null, null, new RU7(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), Integer.valueOf(R.drawable.b80)), 6), new RUH(4, null, null, null, 14), new RUH(2, c70649Ro5.getContext().getString(R.string.f44), null, null, 12)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShipCouponHolder(ViewGroup viewGroup) {
        super(C1FL.LIZIZ(viewGroup, R.layout.yf, viewGroup, false, "from(parent.context).inf…_shipping, parent, false)"));
        this.LJLIL = C44878HjO.LIZIZ(viewGroup, "parent");
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        C26824Afs item = (C26824Afs) obj;
        o.LJIIIZ(item, "item");
        String str = item.LIZIZ;
        if (str != null) {
            C76542zS.LIZIZ("tiktokec_coupon_show", C26937Ahh.LIZ, new AqS29S1000000_4(str, 35));
        }
        ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.fhk);
        int i = 0;
        for (String str2 : item.LIZ) {
            int i2 = i + 1;
            if (i >= 0) {
                String str3 = str2;
                Context context = this.itemView.getContext();
                o.LJIIIIZZ(context, "itemView.context");
                TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                if (i != 0) {
                    layoutParams.topMargin = C7MY.LIZIZ(1);
                }
                tuxTextView.setLayoutParams(layoutParams);
                Context context2 = this.itemView.getContext();
                o.LJIIIIZZ(context2, "itemView.context");
                tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gu, context2));
                tuxTextView.setTuxFont(61);
                tuxTextView.setText(str3);
                viewGroup.addView(tuxTextView);
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }
}
