package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.7Z1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7Z1 extends LinearLayout {
    public int LJLIL;
    public int LJLILLLLZI;

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final int getShowTagNum() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7Z1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        setOrientation(0);
    }

    public final boolean LIZ(int i, String text, int i2, String icon, int i3, int i4, int i5) {
        int LIZJ;
        int i6;
        o.LJIIIZ(text, "text");
        o.LJIIIZ(icon, "icon");
        C59946Nfq LIZ = NDH.LIZ();
        LIZ.LJIIJ(text);
        LIZ.LJIIL(62);
        LIZ.LIZ(i);
        LIZ.LJIIJJI(i2);
        LIZ.LJIIIZ(i5);
        LIZ.LJI(i5);
        LIZ.LJII(i4);
        LIZ.LJIIIIZZ(i4);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        C59947Nfr c59947Nfr = LIZ.LIZ;
        if (c59947Nfr != null) {
            c59947Nfr.LJIILLIIL = layoutParams;
        }
        LIZ.LIZIZ(KL2.LIZJ(getContext(), 2.0f));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) KL2.LIZJ(getContext(), 14.0f), (int) KL2.LIZJ(getContext(), 14.0f));
        C59947Nfr c59947Nfr2 = LIZ.LIZ;
        if (c59947Nfr2 != null) {
            c59947Nfr2.LJIIZILJ = layoutParams2;
        }
        LIZ.LJ();
        C59947Nfr c59947Nfr3 = LIZ.LIZ;
        if (c59947Nfr3 == null) {
            return false;
        }
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        C59948Nfs c59948Nfs = new C59948Nfs(context, null, 6);
        c59948Nfs.setVisibility(4);
        c59948Nfs.LIZ(c59947Nfr3);
        addView(c59948Nfs, getChildCount());
        if (getShowTagNum() != 0) {
            ViewGroup.LayoutParams layoutParams3 = c59948Nfs.getLayoutParams();
            o.LJII(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams.setMarginStart((int) KL2.LIZJ(getContext(), 8.0f));
            c59948Nfs.setLayoutParams(marginLayoutParams);
        }
        ImageView imageView = (ImageView) c59948Nfs.findViewById(c59948Nfs.getImageId());
        if ((!TextUtils.isEmpty(icon)) && icon != null) {
            W5F LJIIIIZZ = W5U.LJIIIIZZ(icon);
            LJIIIIZZ.LJJIIJZLJL = imageView;
            C16880lQ.LLJJJ(LJIIIIZZ);
            ViewGroup.LayoutParams layoutParams4 = imageView.getLayoutParams();
            o.LJII(layoutParams4, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) layoutParams4;
            layoutParams5.addRule(15);
            layoutParams5.setMarginEnd((int) KL2.LIZJ(getContext(), 4.0f));
            imageView.setLayoutParams(layoutParams5);
            imageView.setVisibility(0);
        }
        int measureText = (i4 * 2) + this.LJLIL + ((int) ((TextView) findViewById(c59948Nfs.getDescId())).getPaint().measureText(text));
        if (imageView.getVisibility() == 8) {
            i6 = 0;
        } else {
            int LIZJ2 = (int) KL2.LIZJ(getContext(), 18.0f);
            if (getShowTagNum() == 0) {
                LIZJ = 0;
            } else {
                LIZJ = (int) KL2.LIZJ(getContext(), 8.0f);
            }
            i6 = LIZJ2 + LIZJ;
        }
        int i7 = measureText + i6;
        if (i7 > i3) {
            return false;
        }
        this.LJLIL = i7;
        this.LJLILLLLZI++;
        c59948Nfs.setVisibility(0);
        return true;
    }
}
