package X;

import Y.ALAdapterS3S0100000_4;
import Y.AUListenerS96S0200000_4;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.96l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2314396l extends LinearLayout {
    public boolean LJLIL;
    public final ValueAnimator LJLILLLLZI;
    public final java.util.Map<Integer, View> LJLJI;

    public final View LIZ() {
        java.util.Map<Integer, View> map = this.LJLJI;
        Integer valueOf = Integer.valueOf(R.id.fd2);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.fd2);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    public final void LIZIZ() {
        TuxIconView tuxIconView = (TuxIconView) LIZ();
        tuxIconView.setRotation(0.0f);
        tuxIconView.setIconRes(R.raw.icon_spinner_normal);
        tuxIconView.setIconHeight((int) C44384HbQ.LJJJLL(16));
        tuxIconView.setIconWidth((int) C44384HbQ.LJJJLL(16));
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 1080.0f, C44384HbQ.LJJJLL(8), C44384HbQ.LJJJLL(8));
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setRepeatMode(1);
        rotateAnimation.setDuration(3000L);
        LIZ().startAnimation(rotateAnimation);
    }

    public final void LIZJ() {
        LIZ().clearAnimation();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setDuration(500L);
        ofFloat.addUpdateListener(new AUListenerS96S0200000_4((RelativeLayout.LayoutParams) layoutParams, this, 4));
        ofFloat.addListener(new ALAdapterS3S0100000_4(this, 7));
        ofFloat.start();
    }

    public final void LIZLLL(boolean z) {
        TuxIconView tuxIconView = (TuxIconView) LIZ();
        tuxIconView.setRotation(0.0f);
        tuxIconView.setIconRes(R.raw.icon_chevron_down_double_fill);
        tuxIconView.setIconHeight((int) C44384HbQ.LJJJLL(12));
        tuxIconView.setIconWidth((int) C44384HbQ.LJJJLL(12));
        this.LJLIL = z;
        if (z) {
            LIZ().setRotation(180.0f);
            this.LJLIL = z;
        }
        setVisibility(0);
        if (!this.LJLILLLLZI.isRunning() && !this.LJLILLLLZI.isStarted()) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            this.LJLILLLLZI.setDuration(500L);
            this.LJLILLLLZI.addUpdateListener(new AUListenerS96S0200000_4((RelativeLayout.LayoutParams) layoutParams, this, 5));
            this.LJLILLLLZI.start();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2314396l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJI = C62850Ola.LJFF(context, "context");
        C16880lQ.LLLZIIL(R.layout.c87, C16880lQ.LLZIL(context), this);
        C78897Uxp.LJJJJJL(this, 0.0f);
        this.LJLILLLLZI = ValueAnimator.ofFloat(0.0f, 1.0f);
    }
}
