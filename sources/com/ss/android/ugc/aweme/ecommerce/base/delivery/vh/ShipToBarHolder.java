package com.ss.android.ugc.aweme.ecommerce.base.delivery.vh;

import X.C16880lQ;
import X.C26508Aam;
import X.C26817Afl;
import X.C26943Ahn;
import X.C45804HyK;
import X.C62562cu;
import X.C62822Ol8;
import X.C68322mC;
import X.C88913eJ;
import X.EnumC72807Shn;
import X.V0N;
import X.W5F;
import X.W5U;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DispatchTo;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.Icon;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class ShipToBarHolder extends ECJediViewHolder {
    public final boolean LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final Map<Integer, View> LJLJI;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.String] */
    public final String L() {
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = C88913eJ.LIZ(this.itemView, R.string.f3b, "itemView.context.getStri…g.ec_pdp_delivery_select)");
        ((C26817Afl) getItem()).LIZJ(new AqS135S0200000_4(c68322mC, (C68322mC<String>) this, (ShipToBarHolder) 26));
        C26817Afl c26817Afl = (C26817Afl) getItem();
        AqS170S0100000_4 aqS170S0100000_4 = new AqS170S0100000_4(c68322mC, (C68322mC<List<Object>>) 239);
        List<Region> LIZIZ = c26817Afl.LIZIZ();
        if (LIZIZ != null) {
            aqS170S0100000_4.invoke(LIZIZ);
        }
        if (((CharSequence) c68322mC.element).length() == 0) {
            c68322mC.element = C88913eJ.LIZ(this.itemView, R.string.f3b, "itemView.context.getStri…g.ec_pdp_delivery_select)");
        }
        return (String) c68322mC.element;
    }

    public void P() {
        C26943Ahn.LIZ.getClass();
        if (C26943Ahn.LIZ()) {
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C26508Aam.LIZ(itemView, false);
        } else {
            View itemView2 = this.itemView;
            o.LJIIIIZZ(itemView2, "itemView");
            C26508Aam.LIZ(itemView2, true);
        }
    }

    public void Q() {
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 32, 42), itemView);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        P();
    }

    public void M(C26817Afl item) {
        int i;
        C62562cu thumbFirstImageUrlModel;
        View findViewById;
        String str;
        o.LJIIIZ(item, "item");
        C26943Ahn.LIZ.getClass();
        Icon icon = null;
        if (C26943Ahn.LIZ()) {
            C45804HyK.LJJIJIIJIL(this.itemView.findViewById(R.id.fa2));
            C45804HyK.LJJLL(this.itemView.findViewById(R.id.emy));
            TextView textView = (TextView) this.itemView.findViewById(R.id.fa4);
            DispatchTo dispatchTo = item.LIZIZ;
            if (dispatchTo != null) {
                str = dispatchTo.title;
            } else {
                str = null;
            }
            textView.setText(str);
            C45804HyK.LJJLL(this.itemView.findViewById(R.id.fa4));
        }
        C45804HyK.LJJLL(this.itemView.findViewById(R.id.gzn));
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        DispatchTo dispatchTo2 = item.LIZIZ;
        if (dispatchTo2 != null) {
            icon = dispatchTo2.iconTo;
        }
        Image LJIJJLI = V0N.LJIJJLI(context, icon);
        if (LJIJJLI != null && (thumbFirstImageUrlModel = LJIJJLI.toThumbFirstImageUrlModel()) != null) {
            W5F LJIIIZ = W5U.LJIIIZ(thumbFirstImageUrlModel);
            LJIIIZ.LJIIJJI = R.drawable.adx;
            LJIIIZ.LJIJJ = EnumC72807Shn.FIT_XY;
            if (C26943Ahn.LIZ()) {
                findViewById = this.itemView.findViewById(R.id.emy);
            } else {
                findViewById = this.itemView.findViewById(R.id.gzn).findViewById(R.id.fa2);
            }
            LJIIIZ.LJJIIJZLJL = (ImageView) findViewById;
            C16880lQ.LLJJJ(LJIIIZ);
        }
        ((TextView) this.itemView.findViewById(R.id.exw)).setText(L());
        Q();
        this.itemView.setClickable(this.LJLIL);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.f3b);
        if (this.LJLIL) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public void onBind(C26817Afl item) {
        o.LJIIIZ(item, "item");
        M(item);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ShipToBarHolder(android.view.ViewGroup r4, int r5, int r6) {
        /*
            r3 = this;
            r0 = r6 & 2
            r2 = 0
            if (r0 == 0) goto L34
            r1 = 1
        L6:
            r0 = r6 & 4
            if (r0 == 0) goto Ld
            r5 = 2131559245(0x7f0d034d, float:1.8743829E38)
        Ld:
            java.lang.String r0 = "parent"
            java.util.LinkedHashMap r0 = X.C44878HjO.LIZIZ(r4, r0)
            r3.LJLJI = r0
            java.lang.String r0 = "from(parent.context)\n   …te(layout, parent, false)"
            android.view.View r0 = X.C1FL.LIZIZ(r4, r5, r4, r2, r0)
            r3.<init>(r0)
            r3.LJLIL = r1
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel.class
            X.Prg r2 = X.C65352Pkq.LIZ(r0)
            kotlin.jvm.internal.AqS93S0300000_4 r1 = new kotlin.jvm.internal.AqS93S0300000_4
            r0 = 196(0xc4, float:2.75E-43)
            r1.<init>(r3, r2, r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r3.LJLILLLLZI = r0
            return
        L34:
            r1 = 0
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ShipToBarHolder.<init>(android.view.ViewGroup, int, int):void");
    }
}
