package X;

import Y.ALAdapterS3S0100000_4;
import Y.AUListenerS93S0100000_4;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* renamed from: X.961, reason: invalid class name */
/* loaded from: classes5.dex */
public class AnonymousClass961 extends FrameLayout {
    public View LJLIL;
    public View LJLILLLLZI;
    public View LJLJI;
    public ValueAnimator LJLJJI;
    public ObjectAnimator LJLJJL;
    public ObjectAnimator LJLJJLL;
    public AUListenerS93S0100000_4 LJLJL;
    public AnonymousClass997 LJLJLJ;

    public final void LIZLLL() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        this.LJLJJLL = ofFloat;
        ofFloat.setDuration(300L);
        this.LJLJJLL.addListener(new ALAdapterS3S0100000_4(this, 4));
        this.LJLJJLL.start();
    }

    public final void LIZIZ() {
        ValueAnimator valueAnimator = this.LJLJJI;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.LJLJJI.cancel();
        }
        ObjectAnimator objectAnimator = this.LJLJJL;
        if (objectAnimator != null) {
            C16880lQ.LJLJJLL(objectAnimator);
            this.LJLJJL.cancel();
        }
        ObjectAnimator objectAnimator2 = this.LJLJJLL;
        if (objectAnimator2 != null) {
            C16880lQ.LJLJJLL(objectAnimator2);
            this.LJLJJLL.cancel();
        }
    }

    public final void LIZJ() {
        if (getVisibility() != 0) {
            setVisibility(0);
        }
        if (this.LJLJJI == null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 200);
            this.LJLJJI = ofInt;
            ofInt.setDuration(600L);
            this.LJLJJI.setRepeatCount(-1);
            this.LJLJJI.addUpdateListener(this.LJLJL);
        }
        if (this.LJLJJL == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJLILLLLZI, "alpha", 0.0f, 1.0f);
            this.LJLJJL = ofFloat;
            ofFloat.setDuration(300L);
            if (C79004UzY.LJJIFFI(this.LJLJJL.getListeners())) {
                this.LJLJJL.addListener(new ALAdapterS3S0100000_4(this, 38));
            }
        }
        ObjectAnimator objectAnimator = this.LJLJJLL;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.LJLJJLL.cancel();
            if (C79004UzY.LJJIFFI(this.LJLJJL.getListeners())) {
                this.LJLJJL.addListener(new ALAdapterS3S0100000_4(this, 38));
            }
            this.LJLJJL.start();
            return;
        }
        if (this.LJLJJL.isRunning() || this.LJLJJI.isRunning()) {
            return;
        }
        if (C79004UzY.LJJIFFI(this.LJLJJL.getListeners())) {
            this.LJLJJL.addListener(new ALAdapterS3S0100000_4(this, 38));
        }
        this.LJLJJL.start();
    }

    public AnonymousClass961(Context context) {
        super(context);
        this.LJLJLJ = AnonymousClass997.NORMAL;
        LIZ(context);
    }

    public final void LIZ(Context context) {
        if (((Boolean) AnonymousClass963.LIZIZ.getValue()).booleanValue() && (context instanceof Activity)) {
            this.LJLJI = C16970lZ.LIZJ(R.layout.dsv, C45804HyK.LJIJJ(context), this, true);
        } else {
            this.LJLJI = C16880lQ.LLLZIIL(R.layout.dsv, C16880lQ.LLZIL(context), this);
        }
        this.LJLIL = this.LJLJI.findViewById(R.id.fsb);
        this.LJLILLLLZI = this.LJLJI.findViewById(R.id.frz);
        this.LJLIL.setAlpha(0.0f);
        this.LJLILLLLZI.setAlpha(0.0f);
        KL2.LJIIJJI(getContext());
        KL2.LIZJ(getContext(), 30.0f);
        this.LJLJL = new AUListenerS93S0100000_4(this, 11);
    }

    public void setAnimationStage(AnonymousClass997 anonymousClass997) {
        this.LJLJLJ = anonymousClass997;
    }

    public AnonymousClass961(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJLJ = AnonymousClass997.NORMAL;
        LIZ(context);
    }
}
