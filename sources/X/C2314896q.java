package X;

import Y.AUListenerS93S0100000_4;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.96q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2314896q extends FrameLayout {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public AnimatorSet LJLJI;
    public final java.util.Map<Integer, View> LJLJJI;

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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

    private final TuxIconView getActivateIcon() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-activateIcon>(...)");
        return (TuxIconView) value;
    }

    private final TuxIconView getInactivateIcon() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-inactivateIcon>(...)");
        return (TuxIconView) value;
    }

    public final void LIZIZ(boolean z) {
        TuxIconView inactivateIcon;
        TuxIconView activateIcon;
        if (z) {
            inactivateIcon = getActivateIcon();
            activateIcon = getInactivateIcon();
        } else {
            inactivateIcon = getInactivateIcon();
            activateIcon = getActivateIcon();
        }
        inactivateIcon.setScaleX(1.0f);
        inactivateIcon.setScaleY(1.0f);
        activateIcon.setScaleX(0.0f);
        activateIcon.setScaleY(0.0f);
        AnimatorSet animatorSet = this.LJLJI;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void LIZJ(boolean z) {
        TuxIconView activateIcon;
        TuxIconView inactivateIcon;
        AnimatorSet animatorSet = this.LJLJI;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z) {
            activateIcon = getInactivateIcon();
            inactivateIcon = getActivateIcon();
        } else {
            activateIcon = getActivateIcon();
            inactivateIcon = getInactivateIcon();
        }
        ValueAnimator ofFloat = ObjectAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(new DecelerateInterpolator(1.5f));
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new AUListenerS93S0100000_4(inactivateIcon, 9));
        ValueAnimator ofFloat2 = ObjectAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(new DecelerateInterpolator(1.5f));
        ofFloat2.setDuration(200L);
        ofFloat2.addUpdateListener(new AUListenerS93S0100000_4(activateIcon, 10));
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ofFloat, ofFloat2);
        animatorSet2.start();
        this.LJLJI = animatorSet2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2314896q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJJI = C62850Ola.LJFF(context, "context");
        this.LJLIL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1243));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1242));
        C16880lQ.LLLZIIL(R.layout.aai, C16880lQ.LLZIL(context), this);
    }
}
