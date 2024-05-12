package com.ss.android.ugc.aweme.ecommerce.base.osp.module.extrafee;

import X.C1DD;
import X.C221108m2;
import X.C26508Aam;
import X.C26848AgG;
import X.C26849AgH;
import X.C26851AgJ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70918RsQ;
import X.C73156SnQ;
import X.C78857UxB;
import X.C78946Uyc;
import X.C78983UzD;
import X.TBV;
import Y.IDCSpanS2S0200000_4;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaymentExtraFeeVH extends ECJediViewHolder {
    public final View LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
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
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        C26508Aam.LIZ(this.LJLIL, false);
        C78946Uyc.LJJIIJZLJL(this.LJLIL, new C70918RsQ(0), C26849AgH.LJLIL, C26848AgG.LJLIL);
        C73156SnQ.LJIIIIZZ(this, (JediViewModel) this.LJLILLLLZI.getValue(), new TBV() { // from class: X.Avb
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return ((OrderSubmitState) obj).getUserPaymentInfo();
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((OrderSubmitState) obj).setUserPaymentInfo((PaymentInfo) obj2);
            }
        }, new AqS186S0100000_4(this, 36));
    }

    public PaymentExtraFeeVH(View view) {
        super(view);
        this.LJLIL = view;
        C65776Prg LIZ = C65352Pkq.LIZ(OrderSubmitViewModel.class);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 25));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void onBind(C26851AgJ item) {
        String str;
        String str2;
        String str3;
        o.LJIIIZ(item, "item");
        try {
            ExtraFeeStatement extraFeeStatement = item.LIZ;
            if (extraFeeStatement == null || (str = extraFeeStatement.template) == null) {
                return;
            }
            StringBuilder sb = new StringBuilder(str);
            Map<String, ExtraFeeRichText> map = extraFeeStatement.arguments;
            LinkedHashMap linkedHashMap = null;
            if (map != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<String, ExtraFeeRichText> entry : map.entrySet()) {
                    ExtraFeeRichText value = entry.getValue();
                    if (value != null) {
                        str3 = value.text;
                    } else {
                        str3 = null;
                    }
                    if (C78857UxB.LJJJIL(str3)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                linkedHashMap = linkedHashMap2;
            }
            M(sb, linkedHashMap);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb);
            if (linkedHashMap != null && (!linkedHashMap.isEmpty())) {
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    ExtraFeeRichText extraFeeRichText = (ExtraFeeRichText) entry2.getValue();
                    if (extraFeeRichText != null && (str2 = extraFeeRichText.text) != null) {
                        int indexOf = sb.indexOf(str2);
                        int length = extraFeeRichText.text.length() + indexOf;
                        if (indexOf >= 0 && length < sb.length()) {
                            spannableStringBuilder.setSpan(new StyleSpan(1), indexOf, length, 17);
                            spannableStringBuilder.setSpan(new IDCSpanS2S0200000_4(extraFeeRichText, this, 0), indexOf, length, 17);
                        }
                        return;
                    }
                }
            }
            ((TuxTextView) this.LJLIL.findViewById(R.id.d2j)).setText(spannableStringBuilder);
            ((TuxTextView) this.LJLIL.findViewById(R.id.d2j)).setClickable(true);
            ((TuxTextView) this.LJLIL.findViewById(R.id.d2j)).setMovementMethod(LinkMovementMethod.getInstance());
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(new RuntimeException(C1DD.LJ("PaymentExtraFeeVH onbind exception: ", e)));
        }
    }

    public static void M(StringBuilder sb, Map map) {
        String str;
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            ExtraFeeRichText extraFeeRichText = (ExtraFeeRichText) entry.getValue();
            int indexOf = sb.indexOf(str2);
            if (indexOf >= 0) {
                int length = str2.length() + indexOf;
                if (extraFeeRichText == null || (str = extraFeeRichText.text) == null) {
                    str = "these banks";
                }
                sb.replace(indexOf, length, str);
            } else {
                C78983UzD.LJIIZILJ(new RuntimeException(a1.LJ("PaymentExtraFeeVH ", str2, " starling key not found")));
            }
        }
    }
}
