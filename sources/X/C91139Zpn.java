package X;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Zpn, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91139Zpn extends FrameLayout {
    public final TuxIconView LJLIL;
    public final TuxTextView LJLILLLLZI;
    public Integer LJLJI;
    public Integer LJLJJI;
    public Integer LJLJJL;
    public Integer LJLJJLL;
    public Integer LJLJL;
    public Integer LJLJLJ;
    public Integer LJLJLLL;
    public Integer LJLL;
    public Animator LJLLI;
    public boolean LJLLILLLL;

    public final void LIZJ() {
        Integer num = this.LJLJL;
        if (num != null) {
            int intValue = num.intValue();
            TuxIconView tuxIconView = this.LJLIL;
            if (tuxIconView != null) {
                tuxIconView.setTintColor(intValue);
            }
        }
        Integer num2 = this.LJLJLLL;
        if (num2 != null) {
            int intValue2 = num2.intValue();
            TuxTextView tuxTextView = this.LJLILLLLZI;
            if (tuxTextView != null) {
                tuxTextView.setTextColor(intValue2);
            }
        }
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZ = this.LJLJI;
        c110614Vt.LIZJ = Float.valueOf(C32151Nz.LJIIZILJ(2));
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        Drawable LIZ = c110614Vt.LIZ(context);
        C110614Vt c110614Vt2 = new C110614Vt();
        c110614Vt2.LIZLLL = 1;
        c110614Vt2.LIZJ = Float.valueOf(C32151Nz.LJIIZILJ(2));
        c110614Vt2.LJ = this.LJLJJL;
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        setBackground(new LayerDrawable(new Drawable[]{LIZ, c110614Vt2.LIZ(context2)}));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91139Zpn.LJ():void");
    }

    public final void LIZIZ() {
        LIZJ();
        this.LJLLILLLL = false;
        setVisibility(8);
        Animator animator = this.LJLLI;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            r5 = this;
            android.graphics.drawable.Drawable r1 = r5.getBackground()
            boolean r0 = r1 instanceof android.graphics.drawable.LayerDrawable
            r4 = 0
            if (r0 == 0) goto L71
            android.graphics.drawable.LayerDrawable r1 = (android.graphics.drawable.LayerDrawable) r1
            if (r1 == 0) goto L72
            r0 = 0
            android.graphics.drawable.Drawable r3 = r1.getDrawable(r0)
        L12:
            boolean r0 = r3 instanceof android.graphics.drawable.GradientDrawable
            if (r0 == 0) goto L6f
            android.graphics.drawable.GradientDrawable r3 = (android.graphics.drawable.GradientDrawable) r3
        L18:
            r2 = 1
            if (r1 == 0) goto L6d
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
        L1f:
            boolean r0 = r1 instanceof android.graphics.drawable.GradientDrawable
            if (r0 == 0) goto L26
            r4 = r1
            android.graphics.drawable.GradientDrawable r4 = (android.graphics.drawable.GradientDrawable) r4
        L26:
            if (r3 == 0) goto L33
            java.lang.Integer r0 = r5.LJLJJI
            if (r0 == 0) goto L77
            int r0 = r0.intValue()
            r3.setColor(r0)
        L33:
            if (r4 == 0) goto L4c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            float r0 = X.C32151Nz.LJIIZILJ(r0)
            int r1 = X.O6R.LJJIIZ(r0)
            java.lang.Integer r0 = r5.LJLJJLL
            if (r0 == 0) goto L76
            int r0 = r0.intValue()
            r4.setStroke(r1, r0)
        L4c:
            com.bytedance.tux.icon.TuxIconView r1 = r5.LJLIL
            if (r1 == 0) goto L5b
            java.lang.Integer r0 = r5.LJLJLJ
            if (r0 == 0) goto L75
            int r0 = r0.intValue()
            r1.setTintColor(r0)
        L5b:
            com.bytedance.tux.input.TuxTextView r1 = r5.LJLILLLLZI
            if (r1 == 0) goto L6a
            java.lang.Integer r0 = r5.LJLL
            if (r0 == 0) goto L74
            int r0 = r0.intValue()
            r1.setTextColor(r0)
        L6a:
            r5.LJLLILLLL = r2
            return
        L6d:
            r1 = r4
            goto L1f
        L6f:
            r3 = r4
            goto L18
        L71:
            r1 = r4
        L72:
            r3 = r4
            goto L12
        L74:
            return
        L75:
            return
        L76:
            return
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91139Zpn.LIZLLL():void");
    }

    public final Integer LIZ(int i) {
        Context context = getContext();
        if (context != null) {
            return C79045V0n.LJI(i, context);
        }
        return null;
    }

    public final void setText(int i) {
        TuxTextView tuxTextView = this.LJLILLLLZI;
        if (tuxTextView != null) {
            tuxTextView.setText(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91139Zpn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
        new LinkedHashMap();
        boolean z = View.inflate(context, R.layout.bn, this) instanceof LinearLayout;
        this.LJLIL = (TuxIconView) findViewById(R.id.ia);
        this.LJLILLLLZI = (TuxTextView) findViewById(R.id.jm);
        this.LJLJI = LIZ(R.attr.db);
        this.LJLJJI = LIZ(R.attr.ct);
        this.LJLJJL = this.LJLJI;
        this.LJLJJLL = LIZ(R.attr.e0);
        this.LJLJL = LIZ(R.attr.dj);
        this.LJLJLJ = LIZ(R.attr.eb);
        this.LJLJLLL = LIZ(R.attr.dj);
        this.LJLL = LIZ(R.attr.go);
        LIZJ();
        C78897Uxp.LJJJJJL(this, 0.0f);
    }
}
