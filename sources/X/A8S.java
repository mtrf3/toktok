package X;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.paid.content.consumption.PaidContentAnchorExtraModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A8S<T> implements Observer {
    public final /* synthetic */ C25732A8a LJLIL;
    public final /* synthetic */ TuxTextView LJLILLLLZI;
    public final /* synthetic */ TuxTextView LJLJI;
    public final /* synthetic */ TuxTextView LJLJJI;
    public final /* synthetic */ ConstraintLayout LJLJJL;
    public final /* synthetic */ InterfaceC44105HSr LJLJJLL;
    public final /* synthetic */ SmartImageView LJLJL;
    public final /* synthetic */ SY4 LJLJLJ;

    public A8S(C25732A8a c25732A8a, TuxTextView tuxTextView, TuxTextView tuxTextView2, TuxTextView tuxTextView3, ConstraintLayout constraintLayout, InterfaceC44105HSr interfaceC44105HSr, SmartImageView smartImageView, SY4 sy4) {
        this.LJLIL = c25732A8a;
        this.LJLILLLLZI = tuxTextView;
        this.LJLJI = tuxTextView2;
        this.LJLJJI = tuxTextView3;
        this.LJLJJL = constraintLayout;
        this.LJLJJLL = interfaceC44105HSr;
        this.LJLJL = smartImageView;
        this.LJLJLJ = sy4;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        String str5;
        ViewTreeObserver viewTreeObserver;
        java.util.Map it = (java.util.Map) obj;
        C25732A8a c25732A8a = this.LJLIL;
        o.LJIIIIZZ(it, "it");
        c25732A8a.LIZIZ = (C254739zB) it.get(this.LJLIL.LIZ);
        PaidContentAnchorExtraModel paidContentAnchorExtraModel = this.LJLIL.LIZJ;
        String str6 = null;
        if (paidContentAnchorExtraModel != null) {
            str = paidContentAnchorExtraModel.discountedIapID;
        } else {
            str = null;
        }
        if (C78685UuP.LJJJZ(str)) {
            TuxTextView onChanged$lambda$0 = this.LJLILLLLZI;
            C25732A8a c25732A8a2 = this.LJLIL;
            o.LJIIIIZZ(onChanged$lambda$0, "onChanged$lambda$0");
            onChanged$lambda$0.setVisibility(0);
            onChanged$lambda$0.setPaintFlags(16);
            C254739zB c254739zB = c25732A8a2.LIZIZ;
            if (c254739zB == null || (str3 = c254739zB.LIZJ) == null) {
                PaidContentAnchorExtraModel paidContentAnchorExtraModel2 = c25732A8a2.LIZJ;
                if (paidContentAnchorExtraModel2 != null) {
                    str3 = paidContentAnchorExtraModel2.originalUSDPrice;
                } else {
                    str3 = null;
                }
            }
            onChanged$lambda$0.setText(str3);
            TuxTextView tuxTextView = this.LJLJI;
            InterfaceC44105HSr interfaceC44105HSr = this.LJLJJLL;
            C25732A8a c25732A8a3 = this.LJLIL;
            Integer LJI = C79045V0n.LJI(R.attr.eb, interfaceC44105HSr.LIZ());
            if (LJI != null) {
                i = LJI.intValue();
            } else {
                i = 0;
            }
            tuxTextView.setTextColor(i);
            tuxTextView.setBackground(C04270Et.LIZIZ(interfaceC44105HSr.LIZ(), R.drawable.oh));
            PaidContentAnchorExtraModel paidContentAnchorExtraModel3 = c25732A8a3.LIZJ;
            if (paidContentAnchorExtraModel3 != null) {
                str4 = paidContentAnchorExtraModel3.voucherTag;
            } else {
                str4 = null;
            }
            tuxTextView.setText(str4);
            TuxTextView tuxTextView2 = this.LJLJJI;
            C25732A8a c25732A8a4 = this.LJLIL;
            C254739zB c254739zB2 = c25732A8a4.LIZIZ;
            if (c254739zB2 == null || (str5 = c254739zB2.LIZLLL) == null) {
                PaidContentAnchorExtraModel paidContentAnchorExtraModel4 = c25732A8a4.LIZJ;
                if (paidContentAnchorExtraModel4 != null) {
                    str6 = paidContentAnchorExtraModel4.discountedUSDPrice;
                }
                str5 = str6;
            }
            tuxTextView2.setText(str5);
            ViewTreeObserver viewTreeObserver2 = this.LJLJJL.getViewTreeObserver();
            if (viewTreeObserver2 != null && viewTreeObserver2.isAlive() && (viewTreeObserver = this.LJLJJL.getViewTreeObserver()) != null) {
                final ConstraintLayout constraintLayout = this.LJLJJL;
                final SmartImageView smartImageView = this.LJLJL;
                final TuxTextView tuxTextView3 = this.LJLJJI;
                final TuxTextView tuxTextView4 = this.LJLJI;
                final SY4 sy4 = this.LJLJLJ;
                viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: X.5h5
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public final boolean onPreDraw() {
                        int i2;
                        int i3;
                        int i4;
                        int i5;
                        int i6;
                        int i7;
                        int i8;
                        int i9;
                        ConstraintLayout.this.getViewTreeObserver().removeOnPreDrawListener(this);
                        int width = smartImageView.getWidth();
                        SmartImageView imageView = smartImageView;
                        o.LJIIIIZZ(imageView, "imageView");
                        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                        ViewGroup.LayoutParams layoutParams2 = null;
                        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                            layoutParams = null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        if (marginLayoutParams != null) {
                            i2 = marginLayoutParams.leftMargin;
                        } else {
                            i2 = 0;
                        }
                        int i10 = width + i2;
                        SmartImageView imageView2 = smartImageView;
                        o.LJIIIIZZ(imageView2, "imageView");
                        ViewGroup.LayoutParams layoutParams3 = imageView2.getLayoutParams();
                        if (!(layoutParams3 instanceof ViewGroup.MarginLayoutParams)) {
                            layoutParams3 = null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
                        if (marginLayoutParams2 != null) {
                            i3 = marginLayoutParams2.rightMargin;
                        } else {
                            i3 = 0;
                        }
                        int i11 = i10 + i3;
                        int width2 = tuxTextView3.getWidth();
                        TuxTextView priceTV = tuxTextView3;
                        o.LJIIIIZZ(priceTV, "priceTV");
                        ViewGroup.LayoutParams layoutParams4 = priceTV.getLayoutParams();
                        if (!(layoutParams4 instanceof ViewGroup.MarginLayoutParams)) {
                            layoutParams4 = null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams4;
                        if (marginLayoutParams3 != null) {
                            i4 = marginLayoutParams3.leftMargin;
                        } else {
                            i4 = 0;
                        }
                        int i12 = width2 + i4;
                        TuxTextView priceTV2 = tuxTextView3;
                        o.LJIIIIZZ(priceTV2, "priceTV");
                        ViewGroup.LayoutParams layoutParams5 = priceTV2.getLayoutParams();
                        if (!(layoutParams5 instanceof ViewGroup.MarginLayoutParams)) {
                            layoutParams5 = null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams5;
                        if (marginLayoutParams4 != null) {
                            i5 = marginLayoutParams4.rightMargin;
                        } else {
                            i5 = 0;
                        }
                        int i13 = i12 + i5;
                        int width3 = tuxTextView4.getWidth();
                        TuxTextView voucherTagTV = tuxTextView4;
                        o.LJIIIIZZ(voucherTagTV, "voucherTagTV");
                        ViewGroup.LayoutParams layoutParams6 = voucherTagTV.getLayoutParams();
                        if (!(layoutParams6 instanceof ViewGroup.MarginLayoutParams)) {
                            layoutParams6 = null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams6;
                        if (marginLayoutParams5 != null) {
                            i6 = marginLayoutParams5.leftMargin;
                        } else {
                            i6 = 0;
                        }
                        int i14 = width3 + i6;
                        TuxTextView voucherTagTV2 = tuxTextView4;
                        o.LJIIIIZZ(voucherTagTV2, "voucherTagTV");
                        ViewGroup.LayoutParams layoutParams7 = voucherTagTV2.getLayoutParams();
                        if (!(layoutParams7 instanceof ViewGroup.MarginLayoutParams)) {
                            layoutParams7 = null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams7;
                        if (marginLayoutParams6 != null) {
                            i7 = marginLayoutParams6.rightMargin;
                        } else {
                            i7 = 0;
                        }
                        int i15 = i14 + i7;
                        int width4 = sy4.getWidth();
                        SY4 voucherBuyButton = sy4;
                        o.LJIIIIZZ(voucherBuyButton, "voucherBuyButton");
                        ViewGroup.LayoutParams layoutParams8 = voucherBuyButton.getLayoutParams();
                        if (!(layoutParams8 instanceof ViewGroup.MarginLayoutParams)) {
                            layoutParams8 = null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) layoutParams8;
                        if (marginLayoutParams7 != null) {
                            i8 = marginLayoutParams7.leftMargin;
                        } else {
                            i8 = 0;
                        }
                        int i16 = width4 + i8;
                        SY4 voucherBuyButton2 = sy4;
                        o.LJIIIIZZ(voucherBuyButton2, "voucherBuyButton");
                        ViewGroup.LayoutParams layoutParams9 = voucherBuyButton2.getLayoutParams();
                        if (layoutParams9 instanceof ViewGroup.MarginLayoutParams) {
                            layoutParams2 = layoutParams9;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams8 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        if (marginLayoutParams8 != null) {
                            i9 = marginLayoutParams8.rightMargin;
                        } else {
                            i9 = 0;
                        }
                        if (AnonymousClass036.LIZIZ(i11, i13, i15, i16 + i9) >= ConstraintLayout.this.getWidth()) {
                            tuxTextView4.setVisibility(8);
                            return true;
                        }
                        tuxTextView4.setVisibility(0);
                        return true;
                    }
                });
                return;
            }
            return;
        }
        TuxTextView tuxTextView5 = this.LJLJJI;
        C25732A8a c25732A8a5 = this.LJLIL;
        C254739zB c254739zB3 = c25732A8a5.LIZIZ;
        if (c254739zB3 == null || (str2 = c254739zB3.LIZJ) == null) {
            PaidContentAnchorExtraModel paidContentAnchorExtraModel5 = c25732A8a5.LIZJ;
            if (paidContentAnchorExtraModel5 != null) {
                str6 = paidContentAnchorExtraModel5.postTitle;
            }
            str2 = str6;
        }
        tuxTextView5.setText(str2);
    }
}
