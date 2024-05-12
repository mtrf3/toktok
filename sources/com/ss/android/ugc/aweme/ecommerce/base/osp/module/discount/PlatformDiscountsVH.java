package com.ss.android.ugc.aweme.ecommerce.base.osp.module.discount;

import X.ARV;
import X.C16880lQ;
import X.C221108m2;
import X.C26508Aam;
import X.C27162AlK;
import X.C27724AuO;
import X.C27725AuP;
import X.C27727AuR;
import X.C27728AuS;
import X.C27739Aud;
import X.C32151Nz;
import X.C62562cu;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70759Rpr;
import X.C70920RsS;
import X.C78685UuP;
import X.C78946Uyc;
import X.C7MY;
import X.EnumC72807Shn;
import X.O6R;
import X.ORS;
import X.OUP;
import X.SY9;
import X.W5F;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BonusInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ColorText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.HighLightPromotionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionDiscountBrief;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.ss.android.ugc.aweme.utils.Au2S10S0300000_4;
import com.ss.android.ugc.aweme.utils.Au2S3S0400000_4;
import com.ss.android.ugc.aweme.utils.Au2S6S0000000_4;
import com.zhiliaoapp.musically.R;
import defpackage.k1;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS151S0200000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PlatformDiscountsVH extends ECJediViewHolder {
    public final View LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final LinkedList<k1> LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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

    public final OrderSubmitViewModel M() {
        return (OrderSubmitViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        C26508Aam.LIZ(this.LJLIL, true);
    }

    public PlatformDiscountsVH(View view) {
        super(view);
        this.LJLIL = view;
        C65776Prg LIZ = C65352Pkq.LIZ(OrderSubmitViewModel.class);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 24));
        this.LJLJI = new LinkedList<>();
    }

    public static SpannableStringBuilder L(View view) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        SY9 sy9 = new SY9(context, R.raw.icon_info_circle);
        sy9.setBounds(C7MY.LIZIZ(4), C7MY.LIZIZ(0), C7MY.LIZIZ(16), O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
        Context context2 = view.getContext();
        o.LJIIIIZZ(context2, "view.context");
        sy9.LJFF(R.attr.gv, context2);
        spannableStringBuilder.setSpan(new ImageSpan(sy9, 1), 0, 1, 18);
        return spannableStringBuilder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        HashMap<String, Object> hashMap;
        String str;
        String str2;
        HashMap<String, Object> hashMap2;
        int i;
        HashMap<String, Object> hashMap3;
        int i2;
        int i3;
        String str3;
        Integer num;
        Integer num2;
        Image image;
        C62562cu thumbFirstImageUrlModel;
        Icon icon;
        Image image2;
        float f;
        float f2;
        C27724AuO item = (C27724AuO) obj;
        o.LJIIIZ(item, "item");
        View view = this.LJLIL;
        String str4 = ((C27724AuO) getItem()).LJIILIIL;
        if (str4 != null) {
            hashMap = C27739Aud.LJII(str4);
        } else {
            hashMap = null;
        }
        View order_submit_discount_layout = view.findViewById(R.id.hcu);
        o.LJIIIIZZ(order_submit_discount_layout, "order_submit_discount_layout");
        C16880lQ.LJIIJ(new Au2S10S0300000_4(this, view, hashMap, 15), order_submit_discount_layout);
        View order_submit_discount_layout2 = view.findViewById(R.id.hcu);
        o.LJIIIIZZ(order_submit_discount_layout2, "order_submit_discount_layout");
        C78946Uyc.LJJIIJZLJL(order_submit_discount_layout2, new C70920RsS(), C27727AuR.LJLIL, new AqS135S0200000_4(this, (PlatformDiscountsVH) hashMap, (HashMap<String, Object>) 260));
        ImageView order_submit_discount_high_light_icon = (ImageView) _$_findCachedViewById(R.id.hco);
        o.LJIIIIZZ(order_submit_discount_high_light_icon, "order_submit_discount_high_light_icon");
        order_submit_discount_high_light_icon.setVisibility(8);
        HighLightPromotionInfo highLightPromotionInfo = ((C27724AuO) getItem()).LJIIJ;
        if (highLightPromotionInfo != null && (icon = highLightPromotionInfo.discountIcon) != null && (image2 = icon.icon) != null) {
            ((SmartImageView) _$_findCachedViewById(R.id.hco)).setActualImageScaleType(EnumC72807Shn.FIT_CENTER);
            ImageView order_submit_discount_high_light_icon2 = (ImageView) _$_findCachedViewById(R.id.hco);
            o.LJIIIIZZ(order_submit_discount_high_light_icon2, "order_submit_discount_high_light_icon");
            order_submit_discount_high_light_icon2.setVisibility(0);
            Integer height = image2.getHeight();
            if (height != null) {
                f = height.intValue();
            } else {
                f = 0.0f;
            }
            Integer width = image2.getWidth();
            if (width != null) {
                f2 = width.intValue();
            } else {
                f2 = 0.0f;
            }
            ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.hco).getLayoutParams();
            if (f != 0.0f && f2 != 0.0f) {
                layoutParams.width = (int) ((f2 / f) * C7MY.LIZIZ(13));
                layoutParams.height = C7MY.LIZIZ(13);
            }
            _$_findCachedViewById(R.id.hco).setLayoutParams(layoutParams);
            W5F LIZLLL = C70759Rpr.LIZLLL(image2);
            LIZLLL.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.hco);
            C16880lQ.LLJJJ(LIZLLL);
        }
        TextView order_submit_discount_high_light_text = (TextView) view.findViewById(R.id.hcp);
        o.LJIIIIZZ(order_submit_discount_high_light_text, "order_submit_discount_high_light_text");
        HighLightPromotionInfo highLightPromotionInfo2 = ((C27724AuO) getItem()).LJIIJ;
        if (highLightPromotionInfo2 != null) {
            str = highLightPromotionInfo2.discountText;
        } else {
            str = null;
        }
        OUP.LJJLIIIJILLIZJL(order_submit_discount_high_light_text, str);
        TextView order_submit_discount_high_light_desc = (TextView) view.findViewById(R.id.hcn);
        o.LJIIIIZZ(order_submit_discount_high_light_desc, "order_submit_discount_high_light_desc");
        HighLightPromotionInfo highLightPromotionInfo3 = ((C27724AuO) getItem()).LJIIJ;
        if (highLightPromotionInfo3 != null) {
            str2 = highLightPromotionInfo3.discountDesc;
        } else {
            str2 = null;
        }
        OUP.LJJLIIIJILLIZJL(order_submit_discount_high_light_desc, str2);
        View view2 = this.LJLIL;
        if (((ViewGroup) view2.findViewById(R.id.hcr)).getChildCount() > 0) {
            ViewGroup order_submit_discount_item_list = (ViewGroup) view2.findViewById(R.id.hcr);
            o.LJIIIIZZ(order_submit_discount_item_list, "order_submit_discount_item_list");
            LinkedList<k1> linkedList = this.LJLJI;
            while (order_submit_discount_item_list.getChildCount() > 0) {
                View childAt = order_submit_discount_item_list.getChildAt(0);
                C16880lQ.LJLLL(childAt, order_submit_discount_item_list);
                if (childAt instanceof k1) {
                    linkedList.add(childAt);
                }
            }
        }
        String str5 = ((C27724AuO) getItem()).LJIILIIL;
        if (str5 != null) {
            hashMap2 = C27739Aud.LJII(str5);
        } else {
            hashMap2 = null;
        }
        List<PromotionDiscountBrief> list = ((C27724AuO) getItem()).LJIIJJI;
        if (list != null) {
            for (PromotionDiscountBrief promotionDiscountBrief : list) {
                k1 k1Var = (k1) ORS.LJJLJLI(this.LJLJI);
                if (k1Var == null) {
                    Context context = this.LJLIL.getContext();
                    o.LJIIIIZZ(context, "view.context");
                    k1Var = new k1(context, null, 0);
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(promotionDiscountBrief.discountTitle);
                if (promotionDiscountBrief.discountInfo != null) {
                    spannableStringBuilder.append((CharSequence) L(this.LJLIL));
                }
                ExceptionUX exceptionUX = promotionDiscountBrief.discountInfo;
                AqS151S0200000_4 aqS151S0200000_4 = new AqS151S0200000_4(k1Var, (k1) hashMap2, (HashMap<String, Object>) 50);
                TuxTextView setTitle$lambda$2 = (TuxTextView) k1Var._$_findCachedViewById(R.id.hct);
                o.LJIIIIZZ(setTitle$lambda$2, "setTitle$lambda$2");
                OUP.LJJLIIIJILLIZJL(setTitle$lambda$2, spannableStringBuilder);
                if (exceptionUX != null) {
                    C16880lQ.LJIIJ(new Au2S10S0300000_4(setTitle$lambda$2, exceptionUX, aqS151S0200000_4, 5), setTitle$lambda$2);
                } else {
                    C16880lQ.LJIIJ(new Au2S6S0000000_4(1), setTitle$lambda$2);
                }
                k1Var.setDesc(promotionDiscountBrief.discountText);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams2.topMargin = C27162AlK.LJJII;
                ((ViewGroup) view2.findViewById(R.id.hcr)).addView(k1Var, layoutParams2);
            }
        }
        BonusInfo bonusInfo = item.LJIIL;
        if (bonusInfo != null) {
            View view3 = this.LJLIL;
            String str6 = ((C27724AuO) getItem()).LJIILIIL;
            if (str6 != null) {
                hashMap3 = C27739Aud.LJII(str6);
            } else {
                hashMap3 = null;
            }
            View order_submit_redeem_bonus_layout = _$_findCachedViewById(R.id.hd0);
            o.LJIIIIZZ(order_submit_redeem_bonus_layout, "order_submit_redeem_bonus_layout");
            C78946Uyc.LJJIIJZLJL(order_submit_redeem_bonus_layout, new C70920RsS(), C27728AuS.LJLIL, new AqS135S0200000_4(this, (PlatformDiscountsVH) hashMap3, (HashMap<String, Object>) 261));
            Icon icon2 = bonusInfo.redeemIcon;
            if (icon2 != null && (image = icon2.icon) != null && (thumbFirstImageUrlModel = image.toThumbFirstImageUrlModel()) != null) {
                W5F LIZLLL2 = C70759Rpr.LIZLLL(thumbFirstImageUrlModel);
                LIZLLL2.LJJIIJ = (SmartImageView) view3.findViewById(R.id.hcz);
                C16880lQ.LLJJJ(LIZLLL2);
            }
            ImageView order_submit_redeem_bonus_icon = (ImageView) view3.findViewById(R.id.hcz);
            o.LJIIIIZZ(order_submit_redeem_bonus_icon, "order_submit_redeem_bonus_icon");
            Icon icon3 = bonusInfo.redeemIcon;
            if (icon3 != null && icon3.icon != null) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            order_submit_redeem_bonus_icon.setVisibility(i2);
            TextView view4 = (TextView) view3.findViewById(R.id.hd2);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(bonusInfo.redeemTitle);
            if (bonusInfo.redeemInfo != null) {
                o.LJIIIIZZ(view4, "view");
                spannableStringBuilder2.append((CharSequence) L(view4));
            }
            view4.setText(spannableStringBuilder2);
            if (bonusInfo.redeemInfo != null) {
                C16880lQ.LJIIJ(new Au2S3S0400000_4(view3, bonusInfo, this, hashMap3, 7), view4);
            } else {
                C16880lQ.LJIIJ(new Au2S6S0000000_4(2), view4);
            }
            TuxTextView bindRedeemBonusLayout$lambda$16$lambda$14 = (TuxTextView) view3.findViewById(R.id.hcy);
            o.LJIIIIZZ(bindRedeemBonusLayout$lambda$16$lambda$14, "bindRedeemBonusLayout$lambda$16$lambda$14");
            ColorText colorText = bonusInfo.redeemAmount;
            if (colorText != null && colorText.text != null) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            bindRedeemBonusLayout$lambda$16$lambda$14.setVisibility(i3);
            ColorText colorText2 = bonusInfo.redeemAmount;
            if (colorText2 != null) {
                str3 = colorText2.text;
            } else {
                str3 = null;
            }
            bindRedeemBonusLayout$lambda$16$lambda$14.setText(str3);
            ColorText colorText3 = bonusInfo.redeemAmount;
            if (colorText3 != null) {
                num = colorText3.textColor;
            } else {
                num = null;
            }
            bindRedeemBonusLayout$lambda$16$lambda$14.setTextColorRes(C78685UuP.LJLI(num, null));
            ColorText colorText4 = bonusInfo.redeemAmount;
            if (colorText4 != null) {
                num2 = colorText4.textFont;
            } else {
                num2 = null;
            }
            bindRedeemBonusLayout$lambda$16$lambda$14.setTuxFont(C78685UuP.LJLIIIL(num2, null));
            ARV arv = (ARV) view3.findViewById(R.id.hd1);
            arv.setChecked(o.LJ(bonusInfo.useBonusRedeem, Boolean.TRUE));
            M().LLJZ = arv.isChecked();
            arv.setOnCheckedChangeListener(new C27725AuP(bonusInfo, arv, this, hashMap3));
        }
        View order_submit_redeem_bonus_layout2 = _$_findCachedViewById(R.id.hd0);
        o.LJIIIIZZ(order_submit_redeem_bonus_layout2, "order_submit_redeem_bonus_layout");
        if (item.LJIIL != null) {
            i = 0;
        } else {
            i = 8;
        }
        order_submit_redeem_bonus_layout2.setVisibility(i);
    }
}
