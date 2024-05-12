package X;

import Y.ARunnableS40S0100000_4;
import Y.IDAListenerS73S0100000_4;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.95z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2313195z extends LinearLayout {
    public final Animator LJLIL;
    public final Animator LJLILLLLZI;
    public final long LJLJI;
    public final C62822Ol8 LJLJJI;
    public final ARunnableS40S0100000_4 LJLJJL;

    public final void LIZJ() {
        setVisibility(0);
        this.LJLIL.cancel();
        this.LJLILLLLZI.cancel();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(200L);
        ofFloat.addListener(new IDAListenerS73S0100000_4(this, 3));
        ofFloat.start();
    }

    public final TuxIconView LIZ() {
        float f;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        LinearLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.gravity = 16;
        tuxIconView.setLayoutParams(generateDefaultLayoutParams);
        tuxIconView.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
        tuxIconView.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
        tuxIconView.setIconRes(R.raw.icon_play_fill);
        tuxIconView.setTintColorRes(R.attr.dj);
        Context context2 = tuxIconView.getContext();
        o.LJIIIIZZ(context2, "context");
        if (C26338AVi.LIZJ(context2)) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        tuxIconView.setScaleX(f);
        return tuxIconView;
    }

    public final SafeHandler getUiHandler() {
        return (SafeHandler) this.LJLJJI.getValue();
    }

    public final void LIZLLL() {
        getUiHandler().removeCallbacks(this.LJLJJL);
        this.LJLIL.cancel();
        this.LJLILLLLZI.cancel();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(200L);
        ofFloat.start();
    }

    public final Animator LIZIZ(TuxIconView tuxIconView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tuxIconView, "alpha", 0.0f, 1.0f, 0.0f);
        ofFloat.setDuration(this.LJLJI);
        ofFloat.setRepeatCount(-1);
        ofFloat.addListener(new IDAListenerS73S0100000_4(tuxIconView, 0));
        return ofFloat;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2313195z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJI = 800L;
        this.LJLJJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 0));
        setOrientation(0);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTuxFont(32);
        tuxTextView.setTextColorRes(R.attr.dj);
        tuxTextView.setText(R.string.cka);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(6)));
        tuxTextView.setLayoutParams(marginLayoutParams);
        TuxIconView LIZ = LIZ();
        TuxIconView LIZ2 = LIZ();
        C45804HyK.LJJLIIIIJ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(-2)), LIZ2);
        addView(tuxTextView);
        addView(LIZ);
        addView(LIZ2);
        this.LJLIL = LIZIZ(LIZ);
        this.LJLILLLLZI = LIZIZ(LIZ2);
        this.LJLJJL = new ARunnableS40S0100000_4(this, 2);
    }
}
