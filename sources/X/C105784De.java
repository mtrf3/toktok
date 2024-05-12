package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.4De, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105784De extends FrameLayout {
    public int LJLIL;
    public boolean LJLILLLLZI;
    public int LJLJI;
    public C2068389v LJLJJI;
    public int LJLJJL;
    public C110614Vt LJLJJLL;
    public final java.util.Map<Integer, View> LJLJL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C105784De(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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

    public final C110614Vt getIconBackground() {
        return this.LJLJJLL;
    }

    public final int getIconBackgroundSize() {
        return this.LJLJJL;
    }

    public final int getIconRes() {
        return this.LJLJI;
    }

    public final int getIconSize() {
        return this.LJLIL;
    }

    public final C2068389v getTuxIcon() {
        return this.LJLJJI;
    }

    public final void setHollow(boolean z) {
        this.LJLILLLLZI = z;
        ((SJQ) LIZ(R.id.abh)).setHollow(this.LJLILLLLZI);
        invalidate();
    }

    public final void setIconBackground(C110614Vt c110614Vt) {
        Drawable drawable;
        this.LJLJJLL = c110614Vt;
        if (c110614Vt != null) {
            LIZ(R.id.eas).setVisibility(0);
        } else {
            LIZ(R.id.eas).setVisibility(8);
        }
        View LIZ = LIZ(R.id.eas);
        C110614Vt c110614Vt2 = this.LJLJJLL;
        if (c110614Vt2 != null) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            drawable = c110614Vt2.LIZ(context);
        } else {
            drawable = null;
        }
        LIZ.setBackground(drawable);
    }

    public final void setIconBackgroundSize(int i) {
        this.LJLJJL = i;
        ((SJQ) LIZ(R.id.abh)).setIconRadius(Math.max(this.LJLJJL, this.LJLIL) / 2.0f);
        View LIZ = LIZ(R.id.eas);
        ViewGroup.LayoutParams layoutParams = LIZ(R.id.eas).getLayoutParams();
        int i2 = this.LJLJJL;
        layoutParams.width = i2;
        layoutParams.height = i2;
        LIZ.setLayoutParams(layoutParams);
    }

    public final void setIconRes(int i) {
        this.LJLJI = i;
        ((TuxIconView) LIZ(R.id.e_q)).setIconRes(i);
    }

    public final void setIconSize(int i) {
        this.LJLIL = i;
        ((SJQ) LIZ(R.id.abh)).setIconRadius(Math.max(this.LJLIL, this.LJLJJL) / 2.0f);
        ((TuxIconView) LIZ(R.id.e_q)).setIconWidth(this.LJLIL);
        ((TuxIconView) LIZ(R.id.e_q)).setIconHeight(this.LJLIL);
    }

    public final void setTuxIcon(C2068389v c2068389v) {
        this.LJLJJI = c2068389v;
        ((TuxIconView) LIZ(R.id.e_q)).setTuxIcon(this.LJLJJI);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C105784De(android.content.Context r3, android.util.AttributeSet r4, int r5) {
        /*
            r2 = this;
            r0 = r5 & 2
            if (r0 == 0) goto L5
            r4 = 0
        L5:
            java.lang.String r0 = "context"
            java.util.LinkedHashMap r0 = X.C62850Ola.LJFF(r3, r0)
            r2.LJLJL = r0
            r0 = 0
            r2.<init>(r3, r4, r0)
            r0 = 18
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            float r0 = X.C32151Nz.LJIIZILJ(r1)
            int r0 = X.O6R.LJJIIZ(r0)
            r2.LJLIL = r0
            r0 = 1
            r2.LJLILLLLZI = r0
            float r0 = X.C32151Nz.LJIIZILJ(r1)
            int r0 = X.O6R.LJJIIZ(r0)
            r2.LJLJJL = r0
            android.view.LayoutInflater r1 = X.C16880lQ.LLZIL(r3)
            r0 = 2131561380(0x7f0d0ba4, float:1.8748159E38)
            X.C16880lQ.LLLZIIL(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105784De.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static void LIZIZ(C105784De c105784De, ImageUrlModel imageUrlModel, String str, int i) {
        boolean z;
        String str2 = str;
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            z = true;
        } else {
            z = false;
        }
        ((C71799SFv) c105784De.LIZ(R.id.abh)).LJIIIZ(imageUrlModel, true, null, str2, z, false, null);
    }
}
