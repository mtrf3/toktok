package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Nfs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59948Nfs extends RelativeLayout {
    public final Context LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C59948Nfs(Context mContext) {
        this(mContext, null, 6);
        o.LJIIIZ(mContext, "mContext");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C59948Nfs(Context mContext, AttributeSet attributeSet) {
        this(mContext, attributeSet, 4);
        o.LJIIIZ(mContext, "mContext");
    }

    public final int getDescId() {
        return R.id.j1q;
    }

    public final int getImageId() {
        return R.id.j1r;
    }

    private final RelativeLayout getMContentView() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-mContentView>(...)");
        return (RelativeLayout) value;
    }

    private final TuxTextView getMDescTextView() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-mDescTextView>(...)");
        return (TuxTextView) value;
    }

    private final ImageView getMImageView() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-mImageView>(...)");
        return (ImageView) value;
    }

    public final View getMRootView() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-mRootView>(...)");
        return (View) value;
    }

    public final ViewGroup.LayoutParams getDescViewParams() {
        ViewGroup.LayoutParams layoutParams = getMDescTextView().getLayoutParams();
        o.LJIIIIZZ(layoutParams, "mDescTextView.layoutParams");
        return layoutParams;
    }

    public final ViewGroup.LayoutParams getImageViewParams() {
        ViewGroup.LayoutParams layoutParams = getMImageView().getLayoutParams();
        o.LJIIIIZZ(layoutParams, "mImageView.layoutParams");
        return layoutParams;
    }

    public final ViewGroup.LayoutParams getTagViewParams() {
        ViewGroup.LayoutParams layoutParams = getMContentView().getLayoutParams();
        o.LJIIIIZZ(layoutParams, "mContentView.layoutParams");
        return layoutParams;
    }

    public final void LIZ(C59947Nfr c59947Nfr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (TextUtils.isEmpty(c59947Nfr.LIZ)) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = c59947Nfr.LJIILLIIL;
        if (layoutParams != null) {
            getMContentView().setLayoutParams(layoutParams);
        }
        RelativeLayout.LayoutParams layoutParams2 = c59947Nfr.LJIIZILJ;
        if (layoutParams2 != null) {
            getMImageView().setLayoutParams(layoutParams2);
        }
        Integer num = c59947Nfr.LJIJ;
        int i10 = 0;
        if (num != null) {
            int intValue = num.intValue();
            ViewGroup.LayoutParams descViewParams = getDescViewParams();
            o.LJII(descViewParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) descViewParams;
            ViewGroup.LayoutParams imageViewParams = getImageViewParams();
            o.LJII(imageViewParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) imageViewParams;
            layoutParams3.addRule(1, 0);
            if (intValue != 1 && intValue != 2) {
                layoutParams3.addRule(14);
                layoutParams4.addRule(14);
            } else {
                layoutParams3.addRule(15);
                layoutParams4.addRule(15);
            }
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue == 4) {
                            layoutParams4.addRule(3, getDescId());
                            Integer num2 = c59947Nfr.LJIJI;
                            if (num2 != null) {
                                i9 = num2.intValue();
                            } else {
                                i9 = 0;
                            }
                            layoutParams4.topMargin = i9;
                        }
                    } else {
                        layoutParams3.addRule(3, getImageId());
                        Integer num3 = c59947Nfr.LJIJI;
                        if (num3 != null) {
                            i8 = num3.intValue();
                        } else {
                            i8 = 0;
                        }
                        layoutParams3.topMargin = i8;
                    }
                } else {
                    Context context = getMImageView().getContext();
                    if (context != null && C26338AVi.LIZJ(context)) {
                        layoutParams4.addRule(0, getDescId());
                        Integer num4 = c59947Nfr.LJIJI;
                        if (num4 != null) {
                            i7 = num4.intValue();
                        } else {
                            i7 = 0;
                        }
                        layoutParams4.rightMargin = i7;
                    } else {
                        layoutParams4.addRule(1, getDescId());
                        Integer num5 = c59947Nfr.LJIJI;
                        if (num5 != null) {
                            i6 = num5.intValue();
                        } else {
                            i6 = 0;
                        }
                        layoutParams4.leftMargin = i6;
                    }
                }
            } else {
                Context context2 = getMDescTextView().getContext();
                if (context2 != null && C26338AVi.LIZJ(context2)) {
                    layoutParams3.addRule(0, getImageId());
                    Integer num6 = c59947Nfr.LJIJI;
                    if (num6 != null) {
                        i5 = num6.intValue();
                    } else {
                        i5 = 0;
                    }
                    layoutParams3.rightMargin = i5;
                } else {
                    layoutParams3.addRule(1, getImageId());
                    Integer num7 = c59947Nfr.LJIJI;
                    if (num7 != null) {
                        i4 = num7.intValue();
                    } else {
                        i4 = 0;
                    }
                    layoutParams3.leftMargin = i4;
                }
            }
            getMDescTextView().setLayoutParams(layoutParams3);
            getMImageView().setLayoutParams(layoutParams4);
        }
        if (c59947Nfr.LJIIIIZZ != null || c59947Nfr.LJIIIZ != null) {
            ViewGroup.LayoutParams tagViewParams = getTagViewParams();
            o.LJII(tagViewParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) tagViewParams;
            Integer num8 = c59947Nfr.LJIIIIZZ;
            if (num8 != null) {
                layoutParams5.width = num8.intValue();
            }
            Integer num9 = c59947Nfr.LJIIIZ;
            if (num9 != null) {
                layoutParams5.height = num9.intValue();
            }
            getMContentView().setLayoutParams(layoutParams5);
        }
        getMDescTextView().setText(c59947Nfr.LIZ);
        Integer num10 = c59947Nfr.LIZIZ;
        if (num10 != null) {
            getMDescTextView().setTextColor(num10.intValue());
        }
        Float f = c59947Nfr.LIZJ;
        if (f != null) {
            getMDescTextView().setTextSize(f.floatValue());
        }
        Integer num11 = c59947Nfr.LIZLLL;
        if (num11 != null) {
            getMDescTextView().setTuxFont(num11.intValue());
        }
        TextUtils.TruncateAt truncateAt = c59947Nfr.LJ;
        if (truncateAt != null) {
            getMDescTextView().setEllipsize(truncateAt);
        }
        Integer num12 = c59947Nfr.LJFF;
        if (num12 != null) {
            getMDescTextView().setMaxLines(num12.intValue());
        }
        Integer num13 = c59947Nfr.LJIILJJIL;
        if (num13 != null) {
            getMImageView().setImageResource(num13.intValue());
            getMImageView().setVisibility(0);
        }
        Drawable drawable = c59947Nfr.LJIILL;
        if (drawable != null) {
            getMImageView().setImageDrawable(drawable);
            getMImageView().setVisibility(0);
        }
        if (c59947Nfr.LJI != null) {
            GradientDrawable LIZIZ = T28.LIZIZ(0);
            Integer num14 = c59947Nfr.LJI;
            if (num14 != null) {
                LIZIZ.setColor(num14.intValue());
            }
            Float f2 = c59947Nfr.LJII;
            if (f2 != null) {
                LIZIZ.setCornerRadius(f2.floatValue());
            }
            getMContentView().setBackground(LIZIZ);
        }
        if (c59947Nfr.LJIIL == null && c59947Nfr.LJIILIIL == null && c59947Nfr.LJIIJ == null && c59947Nfr.LJIIJJI == null) {
            return;
        }
        RelativeLayout mContentView = getMContentView();
        Integer num15 = c59947Nfr.LJIIJ;
        if (num15 != null) {
            i = num15.intValue();
        } else {
            i = 0;
        }
        Integer num16 = c59947Nfr.LJIIL;
        if (num16 != null) {
            i2 = num16.intValue();
        } else {
            i2 = 0;
        }
        Integer num17 = c59947Nfr.LJIIJJI;
        if (num17 != null) {
            i3 = num17.intValue();
        } else {
            i3 = 0;
        }
        Integer num18 = c59947Nfr.LJIILIIL;
        if (num18 != null) {
            i10 = num18.intValue();
        }
        mContentView.setPaddingRelative(i, i2, i3, i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C59948Nfs(android.content.Context r3, android.util.AttributeSet r4, int r5) {
        /*
            r2 = this;
            r0 = r5 & 2
            if (r0 == 0) goto L5
            r4 = 0
        L5:
            java.lang.String r0 = "mContext"
            defpackage.a1.LJFF(r3, r0)
            r0 = 0
            r2.<init>(r3, r4, r0)
            r2.LJLIL = r3
            kotlin.jvm.internal.AqS160S0100000_10 r1 = new kotlin.jvm.internal.AqS160S0100000_10
            r0 = 56
            r1.<init>(r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r2.LJLILLLLZI = r0
            kotlin.jvm.internal.AqS160S0100000_10 r1 = new kotlin.jvm.internal.AqS160S0100000_10
            r0 = 53
            r1.<init>(r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r2.LJLJI = r0
            kotlin.jvm.internal.AqS160S0100000_10 r1 = new kotlin.jvm.internal.AqS160S0100000_10
            r0 = 54
            r1.<init>(r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r2.LJLJJI = r0
            kotlin.jvm.internal.AqS160S0100000_10 r1 = new kotlin.jvm.internal.AqS160S0100000_10
            r0 = 55
            r1.<init>(r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r2.LJLJJL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59948Nfs.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
