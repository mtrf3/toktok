package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion;

import X.C16880lQ;
import X.C2068389v;
import X.C221108m2;
import X.C26430AYw;
import X.C26770Af0;
import X.C26771Af1;
import X.C27570Aru;
import X.C32151Nz;
import X.C44878HjO;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70445Rkn;
import X.C72545SdZ;
import X.C72704Sg8;
import X.C73156SnQ;
import X.C8FR;
import X.O6R;
import X.TBT;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.utils.Au2S14S0200000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PdpMallFlashSalePromotionViewHolder extends AbsFullSpanVH {
    public final C26770Af0 LJLIL;
    public final C26771Af1 LJLILLLLZI;
    public final TuxTextView LJLJI;
    public final TuxTextView LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final Map<Integer, View> LJLJJLL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        C73156SnQ.LJIIIIZZ(this, (JediViewModel) this.LJLJJL.getValue(), new TBT() { // from class: X.Aey
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((PdpMainState) obj).getFlashSaleCountDown();
            }
        }, new AqS186S0100000_4(this, 87));
        C73156SnQ.LJIIIIZZ(this, (JediViewModel) this.LJLJJL.getValue(), new TBT() { // from class: X.Aew
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((PdpMainState) obj).getFlashSaleState();
            }
        }, new AqS186S0100000_4(this, 88));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onResume() {
        super.onResume();
        trackTag(new C70445Rkn(getItem()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdpMallFlashSalePromotionViewHolder(ViewGroup viewGroup) {
        super(C72545SdZ.LIZJ(viewGroup, "parent.context", R.layout.a38, viewGroup, false));
        this.LJLJJLL = C44878HjO.LIZIZ(viewGroup, "parent");
        View findViewById = this.itemView.findViewById(R.id.i0o);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.…_flash_sale_on_countdown)");
        this.LJLIL = (C26770Af0) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.dis);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.flash_sale_start_time)");
        this.LJLILLLLZI = (C26771Af1) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.gcp);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.mall_flash_sale_title)");
        this.LJLJI = (TuxTextView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.dit);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.flash_sale_text)");
        this.LJLJJI = (TuxTextView) findViewById4;
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.LJLJJL = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 56));
    }

    public final void L(Integer num) {
        if (num == null || num.intValue() != 2) {
            this.LJLJJI.setVisibility(4);
            this.LJLIL.setVisibility(4);
            this.LJLILLLLZI.setVisibility(0);
        } else {
            this.LJLJJI.setVisibility(0);
            this.LJLIL.setVisibility(0);
            this.LJLILLLLZI.setVisibility(4);
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        C26430AYw item = (C26430AYw) obj;
        o.LJIIIZ(item, "item");
        TuxTextView tuxTextView = this.LJLJI;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_bolt_fill;
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(14));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(14));
        c2068389v.LJ = Integer.valueOf(R.attr.eb);
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        C8FR LIZIZ = c2068389v.LIZIZ(2, context);
        C8FR.LIZJ(LIZIZ, C72704Sg8.LIZIZ(this.itemView, "itemView.context"), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)), 2);
        C27570Aru.LIZ(spannableStringBuilder, " ", LIZIZ);
        spannableStringBuilder.append(this.itemView.getContext().getText(R.string.fek));
        spannableStringBuilder.append((CharSequence) " · ");
        tuxTextView.setText(spannableStringBuilder);
        this.LJLJJI.setText((CharSequence) null);
        this.LJLILLLLZI.setStartTime("");
        L(null);
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C16880lQ.LJIIJ(new Au2S14S0200000_4(this, item, 17), itemView);
    }
}
