package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7r5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198757r5 extends RelativeLayout {
    public final Context LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C198757r5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "mContext");
        this.LJLIL = context;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1678));
        this.LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1675));
        this.LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1676));
        this.LJLJJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1677));
    }

    public final void LIZ(C1796873k c1796873k, Aweme aweme) {
        if (TextUtils.isEmpty(c1796873k.LIZ)) {
            return;
        }
        getMDescTextView().setText(c1796873k.LIZ);
        Integer num = c1796873k.LIZIZ;
        if (num != null) {
            getMDescTextView().setTextColor(num.intValue());
        }
        Integer num2 = c1796873k.LIZJ;
        if (num2 != null) {
            getMDescTextView().setTuxFont(num2.intValue());
        }
        if (c1796873k.LIZLLL != null) {
            GradientDrawable LIZIZ = T28.LIZIZ(0);
            Integer num3 = c1796873k.LIZLLL;
            if (num3 != null) {
                LIZIZ.setColor(num3.intValue());
            }
            Float f = c1796873k.LJ;
            if (f != null) {
                LIZIZ.setCornerRadius(f.floatValue());
            }
            getMContentView().setBackground(LIZIZ);
        }
    }
}
