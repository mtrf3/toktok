package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingService;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.AkN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27103AkN extends FrameLayout {
    public final java.util.Map<Integer, View> LJLIL;

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void setLegacyLogisticsIconStyle(boolean z) {
        int i;
        View legacy_logistic_container = LIZ(R.id.fpy);
        o.LJIIIIZZ(legacy_logistic_container, "legacy_logistic_container");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        legacy_logistic_container.setVisibility(i);
    }

    public final void setLogisticLeadTimeIconVisible(C62562cu urlModel) {
        o.LJIIIZ(urlModel, "urlModel");
        View iv_ship_from = LIZ(R.id.fa1);
        o.LJIIIIZZ(iv_ship_from, "iv_ship_from");
        OUP.LJJLIIIJ(iv_ship_from);
        W5F LJIIIZ = W5U.LJIIIZ(urlModel);
        LJIIIZ.LJIIJJI = R.drawable.adx;
        LJIIIZ.LJJIIJZLJL = (ImageView) LIZ(R.id.fa1);
        C16880lQ.LLJJJ(LJIIIZ);
    }

    public final void setLogisticLeadTimeText(String text) {
        o.LJIIIZ(text, "text");
        View shipping_source_group = LIZ(R.id.jxf);
        o.LJIIIIZZ(shipping_source_group, "shipping_source_group");
        OUP.LJIJJLI(shipping_source_group);
        View delivery_group = LIZ(R.id.c6s);
        o.LJIIIIZZ(delivery_group, "delivery_group");
        OUP.LJIJJLI(delivery_group);
        View tvLogisticLeadTime = LIZ(R.id.lwr);
        o.LJIIIIZZ(tvLogisticLeadTime, "tvLogisticLeadTime");
        OUP.LJJLIIIJ(tvLogisticLeadTime);
        ((TextView) LIZ(R.id.lwr)).setText(text);
    }

    public final void setLogisticThresholdText(String str) {
        View tvLogisticThreshold = LIZ(R.id.lws);
        o.LJIIIIZZ(tvLogisticThreshold, "tvLogisticThreshold");
        int i = 0;
        if (str == null || str.length() == 0) {
            i = 8;
        }
        tvLogisticThreshold.setVisibility(i);
        ((TextView) LIZ(R.id.lws)).setText(str);
    }

    public final void setOptDiscountLogisticsIconStyle(boolean z) {
        int i;
        View opt_shipping_discount_container = LIZ(R.id.hbw);
        o.LJIIIIZZ(opt_shipping_discount_container, "opt_shipping_discount_container");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        opt_shipping_discount_container.setVisibility(i);
    }

    public final void setOptLogisticsIconStyle(boolean z) {
        int i;
        View opt_freeshipping_container = LIZ(R.id.hbu);
        o.LJIIIIZZ(opt_freeshipping_container, "opt_freeshipping_container");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        opt_freeshipping_container.setVisibility(i);
    }

    public final void setOriginalShippingFeeColor(int i) {
        ((TextView) LIZ(R.id.lx0)).setTextColor(i);
    }

    public final void setOriginalShippingFeeText(String str) {
        int i;
        View tvOriginalShippingFee = LIZ(R.id.lx0);
        o.LJIIIIZZ(tvOriginalShippingFee, "tvOriginalShippingFee");
        if (C78685UuP.LJJJZ(str)) {
            i = 0;
        } else {
            i = 8;
        }
        tvOriginalShippingFee.setVisibility(i);
        ((TextView) LIZ(R.id.lx0)).getPaint().setFlags(16);
        ((TextView) LIZ(R.id.lx0)).setText(str);
    }

    public final void setShippingCouponApplied(String str) {
        if (C78685UuP.LJJJZ(str)) {
            View shipping_coupon_group = LIZ(R.id.jwv);
            o.LJIIIIZZ(shipping_coupon_group, "shipping_coupon_group");
            shipping_coupon_group.setVisibility(0);
            ImageView icon_coupon_shipping = (ImageView) LIZ(R.id.eb5);
            o.LJIIIIZZ(icon_coupon_shipping, "icon_coupon_shipping");
            icon_coupon_shipping.setVisibility(0);
            View tv_coupon_shipping = LIZ(R.id.m3q);
            o.LJIIIIZZ(tv_coupon_shipping, "tv_coupon_shipping");
            tv_coupon_shipping.setVisibility(0);
            ((TextView) LIZ(R.id.m3q)).setText(str);
            return;
        }
        View shipping_coupon_group2 = LIZ(R.id.jwv);
        o.LJIIIIZZ(shipping_coupon_group2, "shipping_coupon_group");
        shipping_coupon_group2.setVisibility(8);
    }

    public final void setShippingCouponText(String text) {
        o.LJIIIZ(text, "text");
        ((TextView) LIZ(R.id.bx7)).setText(text);
    }

    public final void setShippingDiscountFeeText(String text) {
        int i;
        o.LJIIIZ(text, "text");
        View tv_shipping_fee = LIZ(R.id.mk3);
        o.LJIIIIZZ(tv_shipping_fee, "tv_shipping_fee");
        if (C78685UuP.LJJJZ(text)) {
            i = 0;
        } else {
            i = 8;
        }
        tv_shipping_fee.setVisibility(i);
        ((TextView) LIZ(R.id.mk3)).setText(text);
    }

    public final void setShippingFeeColor(int i) {
        ((TextView) LIZ(R.id.lxy)).setTextColor(i);
    }

    public final void setShippingFeeText(String text) {
        o.LJIIIZ(text, "text");
        ((TextView) LIZ(R.id.lxy)).setText(text);
    }

    public final void setShippingOriginalPrice(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LIZ(R.id.jx6).setVisibility(4);
            return;
        }
        View shipping_original_price = LIZ(R.id.jx6);
        o.LJIIIIZZ(shipping_original_price, "shipping_original_price");
        shipping_original_price.setVisibility(0);
        ((TextView) LIZ(R.id.jx6)).setText(str);
        ((TextView) LIZ(R.id.jx6)).getPaint().setFlags(16);
        ((TextView) LIZ(R.id.jx6)).getPaint().setAntiAlias(true);
    }

    public final void setShippingService(ShippingService shippingService) {
        C62562cu c62562cu;
        Image image;
        if (shippingService == null) {
            View shipping_service_group = LIZ(R.id.jx_);
            o.LJIIIIZZ(shipping_service_group, "shipping_service_group");
            OUP.LJIJJLI(shipping_service_group);
            return;
        }
        View shipping_service_group2 = LIZ(R.id.jx_);
        o.LJIIIIZZ(shipping_service_group2, "shipping_service_group");
        OUP.LJJLIIIJ(shipping_service_group2);
        Icon icon = shippingService.icon;
        if (icon != null && (image = icon.icon) != null) {
            c62562cu = image.toThumbFirstImageUrlModel();
        } else {
            c62562cu = null;
        }
        W5F LIZLLL = C70759Rpr.LIZLLL(c62562cu);
        LIZLLL.LJIIJJI = R.drawable.adx;
        LIZLLL.LJJIIJZLJL = (ImageView) LIZ(R.id.e_c);
        C16880lQ.LLJJJ(LIZLLL);
        List<String> list = shippingService.serviceNames;
        String str = "";
        if (list != null) {
            int i = 0;
            String str2 = "";
            for (String str3 : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    String str4 = str3;
                    if (!ujb.o.LJJJJJL(str4)) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(str2);
                        if (i != 0 && !o.LJ(str2, "")) {
                            str4 = i0.LJFF(" · ", str4);
                        }
                        LIZ.append(str4);
                        str2 = X1D.LIZIZ(LIZ);
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            str = str2;
        }
        ((TextView) LIZ(R.id.mk4)).setText(str);
    }

    public final void setShippingTitleText(String text) {
        o.LJIIIZ(text, "text");
        ((TextView) LIZ(R.id.lxz)).setText(text);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27103AkN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLIL = C62850Ola.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a_0, this, true);
    }

    public final void LIZJ(int i, Integer num) {
        if (num == null) {
            View iconShippingFee = LIZ(R.id.eaf);
            o.LJIIIIZZ(iconShippingFee, "iconShippingFee");
            OUP.LJIJJLI(iconShippingFee);
        } else {
            View iconShippingFee2 = LIZ(R.id.eaf);
            o.LJIIIIZZ(iconShippingFee2, "iconShippingFee");
            OUP.LJJLIIIJ(iconShippingFee2);
            ((TuxIconView) LIZ(R.id.eaf)).setIconRes(num.intValue());
            ((TuxIconView) LIZ(R.id.eaf)).setTintColor(i);
        }
    }

    public final void LIZIZ(String str, String deliverPrefix, String str2) {
        o.LJIIIZ(deliverPrefix, "deliverPrefix");
        View iv_ship_from = LIZ(R.id.fa1);
        o.LJIIIIZZ(iv_ship_from, "iv_ship_from");
        OUP.LJIJJLI(iv_ship_from);
        View tvLogisticLeadTime = LIZ(R.id.lwr);
        o.LJIIIIZZ(tvLogisticLeadTime, "tvLogisticLeadTime");
        OUP.LJIJJLI(tvLogisticLeadTime);
        if (!ujb.o.LJJJJJL(str)) {
            View shipping_source_group = LIZ(R.id.jxf);
            o.LJIIIIZZ(shipping_source_group, "shipping_source_group");
            shipping_source_group.setVisibility(0);
            ((TextView) LIZ(R.id.mk5)).setText(str);
        }
        if (!ujb.o.LJJJJJL(deliverPrefix)) {
            View delivery_group = LIZ(R.id.c6s);
            o.LJIIIIZZ(delivery_group, "delivery_group");
            delivery_group.setVisibility(0);
            ((TextView) LIZ(R.id.m4l)).setText(deliverPrefix);
            if (!ujb.o.LJJJJJL(str2)) {
                ((TextView) LIZ(R.id.m4k)).setText(QZZ.LIZIZ(' ', str2));
            } else {
                View tv_delivery_date = LIZ(R.id.m4k);
                o.LJIIIIZZ(tv_delivery_date, "tv_delivery_date");
                OUP.LJIJJLI(tv_delivery_date);
            }
        }
    }
}
