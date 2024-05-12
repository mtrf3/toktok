package X;

import Y.AUListenerS95S0200000_3;
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
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.833, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass833 extends FrameLayout {
    public static SY9 LJLJJI;
    public static SY9 LJLJJL;
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final java.util.Map<Integer, View> LJLJI;

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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

    private final TuxIconView getActiveIcon() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-activeIcon>(...)");
        return (TuxIconView) value;
    }

    private final TuxIconView getInactiveIcon() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-inactiveIcon>(...)");
        return (TuxIconView) value;
    }

    public final void LIZIZ() {
        TuxIconView activeIcon;
        TuxIconView inactiveIcon;
        if (isSelected()) {
            activeIcon = getInactiveIcon();
        } else {
            activeIcon = getActiveIcon();
        }
        if (isSelected()) {
            inactiveIcon = getActiveIcon();
        } else {
            inactiveIcon = getInactiveIcon();
        }
        ValueAnimator ofFloat = ObjectAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(new DecelerateInterpolator(1.5f));
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new AUListenerS95S0200000_3(activeIcon, this, 1));
        ValueAnimator ofFloat2 = ObjectAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(new DecelerateInterpolator(1.5f));
        ofFloat2.setDuration(200L);
        ofFloat2.addUpdateListener(new AUListenerS95S0200000_3(inactiveIcon, this, 2));
        ofFloat.start();
        ofFloat2.start();
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        if (z) {
            getActiveIcon().setScaleX(1.0f);
            getActiveIcon().setScaleY(1.0f);
            getInactiveIcon().setScaleX(0.0f);
            getInactiveIcon().setScaleY(0.0f);
            return;
        }
        getActiveIcon().setScaleX(0.0f);
        getActiveIcon().setScaleY(0.0f);
        getInactiveIcon().setScaleX(1.0f);
        getInactiveIcon().setScaleY(1.0f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnonymousClass833(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass833(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LJLJI = C62850Ola.LJFF(context, "context");
        this.LJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1629));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1628));
        if (!AnonymousClass835.LIZ) {
            C16880lQ.LLLZIIL(R.layout.aum, C16880lQ.LLZIL(context), this);
        }
    }
}
