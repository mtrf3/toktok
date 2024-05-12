package X;

import Y.IDAListenerS238S0100000_14;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.VoU, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80866VoU extends ConstraintLayout {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;

    public final void LJJLL() {
        setVisibility(0);
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.gd);
        loadAnimation.setInterpolator(C18950ol.LIZIZ(0.42f, 0.0f, 1.0f, 1.0f));
        getNewItemContainer().startAnimation(loadAnimation);
        getBgView().startAnimation(loadAnimation);
    }

    private final View getBgView() {
        return (View) this.LJLILLLLZI.getValue();
    }

    private final View getNewItemContainer() {
        return (View) this.LJLIL.getValue();
    }

    public final void LJJLJLI(boolean z) {
        if (z && getVisibility() == 0) {
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.ge);
            loadAnimation.setInterpolator(C18950ol.LIZIZ(0.42f, 0.0f, 1.0f, 1.0f));
            loadAnimation.setAnimationListener(new IDAListenerS238S0100000_14(this, 2));
            getNewItemContainer().startAnimation(loadAnimation);
            getBgView().startAnimation(loadAnimation);
            return;
        }
        setVisibility(4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C80866VoU(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80866VoU(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLIL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 117));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 116));
        C16880lQ.LLLZIIL(R.layout.lp, C16880lQ.LLZIL(context), this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bhk}, i, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…efStyleAttr, 0,\n        )");
        obtainStyledAttributes.recycle();
    }
}
