package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.IPromotionStyle;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.RlB, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70469RlB extends FrameLayout {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final float LJLJI;
    public final float LJLJJI;
    public final C62822Ol8 LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public C70471RlD LJLJLJ;
    public final java.util.Map<Integer, View> LJLJLLL = new LinkedHashMap();

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLLL;
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

    private final Paint getArcPaint() {
        return (Paint) this.LJLJJL.getValue();
    }

    private final Paint getCirclePaint() {
        return (Paint) this.LJLILLLLZI.getValue();
    }

    private final ViewTreeObserverOnPreDrawListenerC70484RlQ getExposureHandler() {
        return (ViewTreeObserverOnPreDrawListenerC70484RlQ) this.LJLIL.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewTreeObserverOnPreDrawListenerC70484RlQ exposureHandler = getExposureHandler();
        exposureHandler.LJLILLLLZI = true;
        exposureHandler.LJLIL.getViewTreeObserver().addOnPreDrawListener(exposureHandler);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewTreeObserverOnPreDrawListenerC70484RlQ exposureHandler = getExposureHandler();
        exposureHandler.LJLILLLLZI = false;
        exposureHandler.LJLIL.getViewTreeObserver().removeOnPreDrawListener(exposureHandler);
    }

    public C70469RlB(Context context) {
        super(context, null, 0);
        this.LJLIL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1230));
        L9O.LIZ(R.layout.any, context, this, true);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS152S0100000_2(context, 1024));
        float f = 6;
        this.LJLJI = C45804HyK.LJJ(f);
        this.LJLJJI = C45804HyK.LJJ(f);
        this.LJLJJL = C221108m2.LIZIZ(DIP.LJLIL);
    }

    public final void LIZIZ(IPromotionStyle style) {
        o.LJIIIZ(style, "style");
        ((TuxTextView) LIZ(R.id.cat)).setTuxFont(style.getCouponTitleFont());
        ((TuxTextView) LIZ(R.id.cat)).setTextColorRes(style.getCouponTitleColor());
        ((TuxTextView) LIZ(R.id.lts)).setTuxFont(style.getCouponThresholdFont());
        ((TuxTextView) LIZ(R.id.lts)).setTextColorRes(style.getCouponThresholdColor());
        LIZ(R.id.b0d).getClass();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        double height;
        o.LJIIIZ(canvas, "canvas");
        if (this.LJLJJLL) {
            View LIZ = LIZ(R.id.cdn);
            if (!this.LJLJL || LIZ == null) {
                height = (getHeight() / 2.0d) - (this.LJLJJI / 2.0d);
            } else {
                height = (LIZ.getHeight() / 2.0d) + (LIZ.getY() - (this.LJLJJI / 2.0d));
            }
            float f = (float) height;
            Paint circlePaint = getCirclePaint();
            float f2 = 0;
            float f3 = 2;
            float f4 = this.LJLJI / f3;
            canvas.drawOval(f2 - f4, f, f4 + f2, f + this.LJLJJI, circlePaint);
            canvas.drawOval(getWidth() - (this.LJLJI / f3), f, (this.LJLJI / f3) + getWidth(), f + this.LJLJJI, getCirclePaint());
            Paint arcPaint = getArcPaint();
            float f5 = this.LJLJI / f3;
            canvas.drawArc(f2 - f5, f, f5 + f2, f + this.LJLJJI, 0.0f, 360.0f, false, arcPaint);
            canvas.drawArc(getWidth() - (this.LJLJI / f3), f, (this.LJLJI / f3) + getWidth(), f + this.LJLJJI, 0.0f, 360.0f, false, getArcPaint());
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        getExposureHandler().LJLJJI = z;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        getExposureHandler().LJLJI = z;
    }

    public final void setBackground(C70471RlD backgroundConfig) {
        int i;
        o.LJIIIZ(backgroundConfig, "backgroundConfig");
        this.LJLJJLL = true;
        this.LJLJLJ = backgroundConfig;
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LJ = Integer.valueOf(backgroundConfig.LIZJ);
        c110614Vt.LJFF = backgroundConfig.LIZLLL;
        c110614Vt.LIZLLL = Integer.valueOf(backgroundConfig.LJ);
        c110614Vt.LIZJ = Float.valueOf(backgroundConfig.LJFF);
        c110614Vt.LIZIZ = backgroundConfig.LIZIZ;
        c110614Vt.LIZ = Integer.valueOf(backgroundConfig.LIZ);
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        setBackground(c110614Vt.LIZ(context));
        Paint arcPaint = getArcPaint();
        Integer num = backgroundConfig.LIZLLL;
        if (num != null) {
            int intValue = num.intValue();
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            i = AnonymousClass636.LJIIIIZZ(intValue, context2);
        } else {
            i = backgroundConfig.LIZJ;
        }
        arcPaint.setColor(i);
        getArcPaint().setStrokeWidth(backgroundConfig.LJ);
    }

    public final void setBackgroundRes(int i) {
        LIZ(R.id.bx4).setBackgroundResource(i);
    }

    public final void setButtonBackgroundColor(int i) {
        LIZ(R.id.b0d).setBackgroundColor(i);
    }

    public final void setButtonBackgroundDrawable(Drawable drawable) {
        o.LJIIIZ(drawable, "drawable");
        LIZ(R.id.b0d).setBackground(drawable);
    }

    public final void setButtonBackgroundRes(int i) {
        ((AppCompatTextView) LIZ(R.id.b0d)).setBackgroundResource(i);
    }

    public final void setButtonContainerVisible(boolean z) {
        int i;
        View fr_btn_container = LIZ(R.id.dlz);
        o.LJIIIIZZ(fr_btn_container, "fr_btn_container");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        fr_btn_container.setVisibility(i);
    }

    public final void setButtonGravity(int i) {
        ((TextView) LIZ(R.id.b0d)).setGravity(i);
    }

    public final void setButtonNeedRedBorder(boolean z) {
        ((C2WL) LIZ(R.id.b0d)).setNeedCustomColor(z);
    }

    public final void setButtonText(String text) {
        o.LJIIIZ(text, "text");
        ((TextView) LIZ(R.id.b0d)).setText(text);
    }

    public final void setButtonTextColor(int i) {
        ((TextView) LIZ(R.id.b0d)).setTextColor(i);
    }

    public final void setButtonTextColorRes(int i) {
        ((TuxTextView) LIZ(R.id.b0d)).setTextColorRes(i);
    }

    public final void setButtonTextFont(int i) {
        ((TuxTextView) LIZ(R.id.b0d)).setTuxFont(i);
    }

    public final void setButtonTextSize(float f) {
        ((TextView) LIZ(R.id.b0d)).setTextSize(f);
    }

    public final void setButtonVariant(int i) {
        ((SY4) LIZ(R.id.b0d)).setButtonVariant(i);
    }

    public final void setButtonVisible(boolean z) {
        int i;
        View btn_voucher = LIZ(R.id.b0d);
        o.LJIIIIZZ(btn_voucher, "btn_voucher");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        btn_voucher.setVisibility(i);
    }

    public final void setCouponLabel(Image image) {
        int i;
        float f;
        float f2;
        ImageView coupon_label = (ImageView) LIZ(R.id.bx_);
        o.LJIIIIZZ(coupon_label, "coupon_label");
        if (image != null) {
            i = 0;
        } else {
            i = 8;
        }
        coupon_label.setVisibility(i);
        if (image != null) {
            ViewGroup.LayoutParams layoutParams = LIZ(R.id.bx_).getLayoutParams();
            Integer height = image.getHeight();
            if (height != null) {
                f = height.intValue();
            } else {
                f = 0.0f;
            }
            Integer width = image.getWidth();
            if (width != null) {
                f2 = width.intValue();
            } else {
                f2 = 0.0f;
            }
            if (f != 0.0f && f2 != 0.0f) {
                int i2 = C27162AlK.LJJIFFI;
                layoutParams.height = i2;
                layoutParams.width = (int) ((f2 / f) * i2);
            }
            LIZ(R.id.bx_).setLayoutParams(layoutParams);
            W5F LIZLLL = C70759Rpr.LIZLLL(image);
            LIZLLL.LJJIIJ = (SmartImageView) LIZ(R.id.bx_);
            C16880lQ.LLJJJ(LIZLLL);
        }
    }

    public final void setCouponStatusText(String status) {
        o.LJIIIZ(status, "status");
        ((TextView) LIZ(R.id.lta)).setText(status);
    }

    public final void setCouponStatusTextColor(int i) {
        ((TextView) LIZ(R.id.lta)).setTextColor(i);
    }

    public final void setCouponStatusTextColorRes(int i) {
        ((TuxTextView) LIZ(R.id.lta)).setTextColorRes(i);
    }

    public final void setCouponStatusTextFont(int i) {
        ((TuxTextView) LIZ(R.id.lta)).setTuxFont(i);
    }

    public final void setCouponStatusTextGravity(int i) {
        ((TextView) LIZ(R.id.lta)).setGravity(i);
    }

    public final void setCouponStatusTextSize(float f) {
        ((TextView) LIZ(R.id.lta)).setTextSize(f);
    }

    public final void setCouponStatusVisible(boolean z) {
        int i;
        View ttv_coupon_status = LIZ(R.id.lta);
        o.LJIIIIZZ(ttv_coupon_status, "ttv_coupon_status");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        ttv_coupon_status.setVisibility(i);
    }

    public final void setDiscountText(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View discount_text = LIZ(R.id.cat);
            o.LJIIIIZZ(discount_text, "discount_text");
            discount_text.setVisibility(8);
        } else {
            View discount_text2 = LIZ(R.id.cat);
            o.LJIIIIZZ(discount_text2, "discount_text");
            discount_text2.setVisibility(0);
            ((TextView) LIZ(R.id.cat)).setText(str);
        }
    }

    public final void setDiscountTextColor(int i) {
        ((TuxTextView) LIZ(R.id.cat)).setTextColorRes(i);
    }

    public final void setDiscountTextFont(int i) {
        ((TuxTextView) LIZ(R.id.cat)).setTuxFont(i);
    }

    public final void setDiscountTextSize(float f) {
        ((TextView) LIZ(R.id.cat)).setTextSize(f);
    }

    public final void setDiscountVisible(boolean z) {
        int i;
        View discount_text = LIZ(R.id.cat);
        o.LJIIIIZZ(discount_text, "discount_text");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        discount_text.setVisibility(i);
    }

    public final void setExposureCallback(InterfaceC70488RlU showCallback) {
        o.LJIIIZ(showCallback, "showCallback");
        getExposureHandler().getClass();
    }

    public final void setFollowerContainerVisible(boolean z) {
        int i;
        View fl_icon_container = LIZ(R.id.de_);
        o.LJIIIIZZ(fl_icon_container, "fl_icon_container");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        fl_icon_container.setVisibility(i);
    }

    public final void setFollowerInteractiveText(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View ttv_threshold_text = LIZ(R.id.lts);
            o.LJIIIIZZ(ttv_threshold_text, "ttv_threshold_text");
            ttv_threshold_text.setVisibility(8);
        } else {
            View ttv_threshold_text2 = LIZ(R.id.lts);
            o.LJIIIIZZ(ttv_threshold_text2, "ttv_threshold_text");
            ttv_threshold_text2.setVisibility(0);
            ((TextView) LIZ(R.id.lts)).setText(str);
        }
    }

    public final void setFollowerInteractiveTextColor(int i) {
        ((TextView) LIZ(R.id.lts)).setTextColor(i);
    }

    public final void setFollowerInteractiveTextFont(int i) {
        ((TuxTextView) LIZ(R.id.lts)).setTuxFont(i);
    }

    public final void setFollowerInteractiveTextSize(float f) {
        ((TextView) LIZ(R.id.lts)).setTextSize(f);
    }

    public final void setFollowerInteractiveTextVisible(boolean z) {
        int i;
        View ttv_threshold_text = LIZ(R.id.lts);
        o.LJIIIIZZ(ttv_threshold_text, "ttv_threshold_text");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        ttv_threshold_text.setVisibility(i);
    }

    public final void setFollowerPortrait(Image image) {
        W5F LJ = C70759Rpr.LJ(image);
        LJ.LJIIJJI = R.drawable.dds;
        LJ.LJJIIJ = (SmartImageView) LIZ(R.id.k15);
        C16880lQ.LLJJJ(LJ);
    }

    public final void setFollowerPortraitVisible(boolean z) {
        int i;
        ImageView siv_author_icon = (ImageView) LIZ(R.id.k15);
        o.LJIIIIZZ(siv_author_icon, "siv_author_icon");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        siv_author_icon.setVisibility(i);
    }

    public final void setFollowerStatusBackground(int i) {
        ((AppCompatImageView) LIZ(R.id.lb6)).setBackgroundResource(i);
    }

    public final void setFollowerStatusIcon(C2068389v tuxIcon) {
        o.LJIIIZ(tuxIcon, "tuxIcon");
        setFollowerStatusVisible(true);
        ((TuxIconView) LIZ(R.id.lb6)).setTuxIcon(tuxIcon);
    }

    public final void setFollowerStatusVisible(boolean z) {
        int i;
        ImageView tiv_status = (ImageView) LIZ(R.id.lb6);
        o.LJIIIIZZ(tiv_status, "tiv_status");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        tiv_status.setVisibility(i);
    }

    public final void setInfoContainerVisible(boolean z) {
        int i;
        View ll_info_container = LIZ(R.id.g41);
        o.LJIIIIZZ(ll_info_container, "ll_info_container");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        ll_info_container.setVisibility(i);
    }

    public final void setSubTitle(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View tv_sub_title = LIZ(R.id.mlr);
            o.LJIIIIZZ(tv_sub_title, "tv_sub_title");
            tv_sub_title.setVisibility(8);
        } else {
            View tv_sub_title2 = LIZ(R.id.mlr);
            o.LJIIIIZZ(tv_sub_title2, "tv_sub_title");
            tv_sub_title2.setVisibility(0);
            ((TextView) LIZ(R.id.mlr)).setText(str);
        }
    }

    public final void setSubTitleFont(int i) {
        ((TuxTextView) LIZ(R.id.mlr)).setTuxFont(i);
    }

    public final void setThresholdText(String str) {
        TextView textView = (TextView) LIZ(R.id.lts);
        if (str == null) {
            str = "";
        }
        textView.setText(str);
    }

    public final void setThresholdTextColor(int i) {
        ((TextView) LIZ(R.id.lts)).setTextColor(i);
    }

    public final void setThresholdTextFont(int i) {
        ((TuxTextView) LIZ(R.id.lts)).setTuxFont(i);
    }

    public final void setThresholdTextMaxLine(int i) {
        ((TextView) LIZ(R.id.lts)).setMaxLines(i);
    }

    public final void setThresholdTextSize(float f) {
        ((TextView) LIZ(R.id.lts)).setTextSize(f);
    }

    public final void setThresholdVisible(boolean z) {
        int i;
        View ttv_threshold_text = LIZ(R.id.lts);
        o.LJIIIIZZ(ttv_threshold_text, "ttv_threshold_text");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        ttv_threshold_text.setVisibility(i);
    }

    public final void LIZJ(Integer num, Integer num2) {
        int i;
        int i2 = -2;
        if (num != null) {
            i = num.intValue();
        } else {
            i = -2;
        }
        if (num2 != null) {
            i2 = num2.intValue();
        }
        LIZ(R.id.bx4).setLayoutParams(new FrameLayout.LayoutParams(i, i2));
    }
}
