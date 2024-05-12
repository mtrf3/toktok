package X;

import Y.AUListenerS90S0100000_1;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.4hZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C116414hZ extends AppCompatImageView {
    public C116404hY LJLIL;
    public final Animator LJLILLLLZI;
    public boolean LJLJI;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C116414hZ(Context context) {
        this(context, null, 6, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C116414hZ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        o.LJIIIZ(context, "context");
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        Animator animator;
        super.onAttachedToWindow();
        if (getVisibility() != 0 || Looper.myLooper() == null || this.LJLJI || (animator = this.LJLILLLLZI) == null) {
            return;
        }
        animator.start();
        this.LJLJI = true;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Looper.myLooper() != null) {
            this.LJLJI = false;
            Animator animator = this.LJLILLLLZI;
            if (animator != null) {
                animator.cancel();
            }
        }
        C54339LUh.LIZ(this);
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        Animator animator;
        super.setVisibility(i);
        if (getVisibility() == 0) {
            if (Looper.myLooper() == null || this.LJLJI || (animator = this.LJLILLLLZI) == null) {
                return;
            }
            animator.start();
            this.LJLJI = true;
            return;
        }
        if (Looper.myLooper() == null) {
            return;
        }
        this.LJLJI = false;
        Animator animator2 = this.LJLILLLLZI;
        if (animator2 == null) {
            return;
        }
        animator2.cancel();
    }

    public final void LIZ(int i, int i2) {
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        C116404hY c116404hY = new C116404hY(context, i);
        this.LJLIL = c116404hY;
        c116404hY.LJ(i2);
        setImageDrawable(this.LJLIL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C116414hZ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.brm, R.attr.bue}, i, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…Spinner, defStyleAttr, 0)");
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        C116404hY c116404hY = new C116404hY(context, resourceId);
        this.LJLIL = c116404hY;
        c116404hY.LJ(color);
        setImageDrawable(this.LJLIL);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setRepeatCount(-1);
        ofFloat.setDuration(1000L);
        ofFloat.addUpdateListener(new AUListenerS90S0100000_1(this, 7));
        this.LJLILLLLZI = ofFloat;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C116414hZ(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5) {
        /*
            r1 = this;
            r0 = r4 & 2
            if (r0 == 0) goto L5
            r3 = 0
        L5:
            r0 = r4 & 4
            if (r0 == 0) goto L10
            r0 = 2130968901(0x7f040145, float:1.7546469E38)
        Lc:
            r1.<init>(r2, r3, r0)
            return
        L10:
            r0 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C116414hZ.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }
}
