package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.rank;

import X.C16880lQ;
import X.C221108m2;
import X.C26508Aam;
import X.C45804HyK;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78685UuP;
import X.EnumC26509Aan;
import X.T5U;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RankInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.utils.Au2S14S0200000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PdpRankHolder extends PdpHolder {
    public final C62822Ol8 LJLIL;
    public final Map<Integer, View> LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdpRankHolder(View view) {
        super(view, R.layout.a3y);
        o.LJIIIZ(view, "view");
        this.LJLILLLLZI = new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.LJLIL = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 60));
    }

    public final void L(RankInfo rankInfo) {
        boolean z;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString(String.valueOf(rankInfo.rankHint));
        SpannableString spannableString2 = new SpannableString(String.valueOf(rankInfo.rankLevelStr));
        int i = 0;
        if (spannableString2.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && spannableString.length() > 0) {
            spannableString.setSpan(new T5U(42, false), 0, spannableString.length(), 33);
            spannableString2.setSpan(new T5U(61, false), 0, spannableString2.length(), 33);
            SpannableString spannableString3 = new SpannableString(" · ");
            spannableString3.setSpan(new T5U(42, false), 0, spannableString3.length(), 33);
            CharSequence[] charSequenceArr = {spannableString, spannableString3, spannableString2};
            int i2 = 0;
            do {
                spannableStringBuilder.append(charSequenceArr[i2]);
                i2++;
            } while (i2 < 3);
            ((TextView) this.itemView.findViewById(R.id.im6)).setText(spannableStringBuilder);
            ImageView imageView = (ImageView) this.itemView.findViewById(R.id.cx8);
            o.LJIIIIZZ(imageView, "itemView.enter_rank_list_icon");
            String str = rankInfo.schema;
            if (str == null || ujb.o.LJJJJJL(str)) {
                i = 8;
            }
            imageView.setVisibility(i);
            return;
        }
        ImageView imageView2 = (ImageView) this.itemView.findViewById(R.id.cx8);
        o.LJIIIIZZ(imageView2, "itemView.enter_rank_list_icon");
        imageView2.setVisibility(8);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        RankInfo item = (RankInfo) obj;
        o.LJIIIZ(item, "item");
        Integer num = item.rankInfoStyle;
        if (num == null) {
            L(item);
        } else {
            if (num.intValue() == EnumC26509Aan.BASIC.getValue()) {
                L(item);
            } else {
                if (num.intValue() == EnumC26509Aan.NOSTYLE.getValue()) {
                    C45804HyK.LJJIJIIJIL(_$_findCachedViewById(R.id.imc));
                    C45804HyK.LJJLL(_$_findCachedViewById(R.id.imt));
                    int i = 8;
                    if (C78685UuP.LJJJZ(item.rankLevelStr) && C78685UuP.LJJJZ(item.rankHint)) {
                        ((TextView) _$_findCachedViewById(R.id.imp)).setText(item.rankHint);
                        ((TextView) _$_findCachedViewById(R.id.imr)).setText(item.rankLevelStr);
                        ImageView rank_arrow_no_style = (ImageView) _$_findCachedViewById(R.id.imb);
                        o.LJIIIIZZ(rank_arrow_no_style, "rank_arrow_no_style");
                        String str = item.schema;
                        if (str != null && !ujb.o.LJJJJJL(str)) {
                            i = 0;
                        }
                        rank_arrow_no_style.setVisibility(i);
                    } else {
                        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.imb);
                        o.LJIIIIZZ(imageView, "itemView.rank_arrow_no_style");
                        imageView.setVisibility(8);
                    }
                } else {
                    L(item);
                }
            }
        }
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C16880lQ.LJIIJ(new Au2S14S0200000_4(item, this, 19), itemView);
        View itemView2 = this.itemView;
        o.LJIIIIZZ(itemView2, "itemView");
        C26508Aam.LIZ(itemView2, false);
    }
}
