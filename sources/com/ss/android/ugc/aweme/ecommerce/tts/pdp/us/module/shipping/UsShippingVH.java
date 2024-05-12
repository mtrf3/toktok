package com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.shipping;

import X.C0F1;
import X.C16880lQ;
import X.C221108m2;
import X.C26338AVi;
import X.C27127Akl;
import X.C27129Akn;
import X.C27146Al4;
import X.C27154AlC;
import X.C2RT;
import X.C32151Nz;
import X.C62562cu;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70414RkI;
import X.C72545SdZ;
import X.O6R;
import X.OUP;
import X.W5F;
import X.W5U;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShippingModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShippingModuleMeta;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS30S0301000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class UsShippingVH extends AbsFullSpanVH {
    public final C62822Ol8 LJLIL;
    public final Map<Integer, View> LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH
    public final boolean needDivider() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final PdpViewModel getVm() {
        return (PdpViewModel) this.LJLIL.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x013f, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.RkI] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBind(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.shipping.UsShippingVH.onBind(java.lang.Object):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsShippingVH(ViewGroup parent, ECBaseFragment fragment) {
        super(C72545SdZ.LIZJ(parent, "parent.context", R.layout.a9l, parent, false));
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(fragment, "fragment");
        this.LJLILLLLZI = new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.LJLIL = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, LiveTryModeCountDownThresholdSetting.DEFAULT));
    }

    public final void M(String str, Map<String, ? extends Object> map, C27129Akn c27129Akn) {
        String str2;
        PDPShippingModule pDPShippingModule;
        PDPShippingModuleMeta pDPShippingModuleMeta;
        PDPShippingModule pDPShippingModule2;
        PDPShippingModuleMeta pDPShippingModuleMeta2;
        String str3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        PDPLogisticModule pDPLogisticModule = c27129Akn.LJLJJI;
        if (pDPLogisticModule != null && (pDPShippingModule2 = pDPLogisticModule.pdpShippingModule) != null && (pDPShippingModuleMeta2 = pDPShippingModule2.meta) != null && (str3 = pDPShippingModuleMeta2.deliveryFlag) != null) {
            linkedHashMap.put("delivery_flag", str3);
        }
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        C70414RkI c70414RkI = getVm().LLFII;
        if (c70414RkI != null) {
            C27127Akl c27127Akl = new C27127Akl(c27129Akn.LJLIL, c27129Akn.LJLILLLLZI, 8);
            PDPLogisticModule pDPLogisticModule2 = c27129Akn.LJLJJI;
            if (pDPLogisticModule2 != null && (pDPShippingModule = pDPLogisticModule2.pdpShippingModule) != null && (pDPShippingModuleMeta = pDPShippingModule.meta) != null) {
                str2 = pDPShippingModuleMeta.deliveryInfo;
            } else {
                str2 = null;
            }
            c70414RkI.LJJJI("logistics", c27127Akl, str, linkedHashMap, str2);
        }
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [X.2RT, android.view.View] */
    public final C2RT L(LinkRichText linkRichText, boolean z, boolean z2, int i, int i2, int i3) {
        Image image;
        final AttributeSet attributeSet = null;
        if (linkRichText == null) {
            return null;
        }
        RichTextUtil richTextUtil = RichTextUtil.LIZ;
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        final int i4 = 0;
        SpannableStringBuilder LIZJ = RichTextUtil.LIZJ(richTextUtil, context, linkRichText, null, 0, false, null, C27154AlC.LJLIL, 60);
        if (LIZJ == null) {
            return null;
        }
        final Context context2 = this.itemView.getContext();
        o.LJIIIIZZ(context2, "itemView.context");
        ?? r8 = new ConstraintLayout(context2, attributeSet, i4) { // from class: X.2RT
            public final java.util.Map<Integer, View> LJLIL = new LinkedHashMap();

            public final View _$_findCachedViewById(int i5) {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
                View view = (View) linkedHashMap.get(Integer.valueOf(i5));
                if (view != null) {
                    return view;
                }
                View findViewById = findViewById(i5);
                if (findViewById == null) {
                    return null;
                }
                linkedHashMap.put(Integer.valueOf(i5), findViewById);
                return findViewById;
            }

            {
                super(context2, attributeSet, i4);
                C16880lQ.LLLLIILL(C16880lQ.LLZIL(context2), R.layout.anw, this, true);
            }
        };
        if (!z) {
            C26338AVi.LJIIIZ(r8, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0))), null, null, 29);
        } else if (z2) {
            C26338AVi.LJIIIZ(r8, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(i2)))), null, null, 29);
        } else {
            C26338AVi.LJIIIZ(r8, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(i)))), null, null, 29);
        }
        AqS30S0301000_4 aqS30S0301000_4 = new AqS30S0301000_4(i3, LIZJ, linkRichText, this, 1);
        View com_text = r8._$_findCachedViewById(R.id.biw);
        o.LJIIIIZZ(com_text, "com_text");
        aqS30S0301000_4.invoke(com_text);
        Icon icon = linkRichText.suffixIcon;
        if (icon != null) {
            if (C0F1.LIZIZ(this.itemView, "itemView.context")) {
                image = icon.iconDark;
            } else {
                image = icon.icon;
            }
            if (image != null) {
                C62562cu imageUrlModel = image.toImageUrlModel();
                View icon2 = r8._$_findCachedViewById(R.id.e_q);
                o.LJIIIIZZ(icon2, "icon");
                OUP.LJJLIIIJ(icon2);
                if (imageUrlModel != null) {
                    W5F LJIIIZ = W5U.LJIIIZ(imageUrlModel);
                    LJIIIZ.LJJIIJ = (SmartImageView) r8._$_findCachedViewById(R.id.e_q);
                    C16880lQ.LLJJJ(LJIIIZ);
                } else {
                    View icon3 = r8._$_findCachedViewById(R.id.e_q);
                    o.LJIIIIZZ(icon3, "icon");
                    OUP.LJIJJLI(icon3);
                }
                r8._$_findCachedViewById(R.id.e_q).setLayoutParams(r8._$_findCachedViewById(R.id.e_q).getLayoutParams());
            }
        }
        C16880lQ.LJIIJ(new C27146Al4(linkRichText, this), r8);
        return r8;
    }
}
