package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JOM extends ViewGroup {
    public final C2068389v LJLIL;
    public final TuxIconView LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    private final RotateAnimation getRotateAnim() {
        return (RotateAnimation) this.LJLJI.getValue();
    }

    public final JOK getState() {
        int i = this.LJLIL.LIZ;
        if (i == R.raw.icon_play_fill) {
            return JOK.PLAY;
        }
        if (i == R.raw.icon_pause_fill) {
            return JOK.PAUSE;
        }
        if (i == R.raw.icon_spinner_normal) {
            return JOK.LOADING;
        }
        return null;
    }

    public static int LIZ(JOK jok) {
        int i = JOJ.LIZ[jok.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return R.raw.icon_spinner_normal;
                }
                throw new C162476Zf();
            }
            return R.raw.icon_pause_fill;
        }
        return R.raw.icon_play_fill;
    }

    public final void setState(JOK state) {
        o.LJIIIZ(state, "state");
        this.LJLIL.LIZ = LIZ(state);
        this.LJLILLLLZI.setTuxIcon(this.LJLIL);
        if (state == JOK.LOADING) {
            this.LJLILLLLZI.startAnimation(getRotateAnim());
        } else {
            this.LJLILLLLZI.clearAnimation();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JOM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJI = C221108m2.LIZIZ(C197347oo.LJLIL);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a9q, R.attr.bep});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…tyleable.PlayerStateIcon)");
        JOL jol = JOK.Companion;
        JOK jok = JOK.PLAY;
        int i = obtainStyledAttributes.getInt(0, jok.getValue());
        jol.getClass();
        JOK jok2 = JOK.stateValueMap.get(Integer.valueOf(i));
        jok = jok2 != null ? jok2 : jok;
        int color = obtainStyledAttributes.getColor(1, -16777216);
        obtainStyledAttributes.recycle();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = LIZ(jok);
        c2068389v.LIZLLL = Integer.valueOf(color);
        this.LJLIL = c2068389v;
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setLayoutParams(generateDefaultLayoutParams());
        tuxIconView.setTuxIcon(c2068389v);
        this.LJLILLLLZI = tuxIconView;
        addView(tuxIconView);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        this.LJLILLLLZI.measure(View.MeasureSpec.makeMeasureSpec((size - paddingLeft) - paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - getPaddingTop()) - getPaddingBottom(), 1073741824));
        setMeasuredDimension(ViewGroup.resolveSize(this.LJLILLLLZI.getMeasuredWidth() + paddingLeft + paddingRight, i), ViewGroup.resolveSize(this.LJLILLLLZI.getMeasuredHeight() + paddingLeft + paddingRight, i2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.LJLILLLLZI.layout(paddingLeft, paddingTop, this.LJLILLLLZI.getMeasuredWidth() + paddingLeft, this.LJLILLLLZI.getMeasuredHeight() + paddingTop);
    }
}
