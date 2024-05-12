package X;

import Y.IDAListenerS82S0100000_15;
import android.content.Context;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.zhiliaoapp.musically.R;

/* loaded from: classes16.dex */
public class Y90 extends RelativeLayout {
    public View LJLIL;
    public View LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;

    public final void LIZ() {
        if (this.LJLJI || this.LJLJJI) {
            return;
        }
        if (CCJ.LIZ(getContext())) {
            this.LJLILLLLZI.setSelected(false);
            ((TransitionDrawable) this.LJLIL.getBackground()).reverseTransition(100);
            ((TransitionDrawable) this.LJLILLLLZI.getBackground()).reverseTransition(100);
            this.LJLILLLLZI.animate().setListener(new IDAListenerS82S0100000_15(this, 1)).translationXBy(KL2.LIZJ(getContext(), 22.0f)).setDuration(100L).start();
            return;
        }
        this.LJLILLLLZI.setSelected(false);
        ((TransitionDrawable) this.LJLIL.getBackground()).reverseTransition(100);
        ((TransitionDrawable) this.LJLILLLLZI.getBackground()).reverseTransition(100);
        this.LJLILLLLZI.animate().translationXBy(-KL2.LIZJ(getContext(), 22.0f)).setDuration(100L).start();
    }

    private int getLayoutId() {
        if (CCJ.LIZ(getContext())) {
            return R.layout.djo;
        }
        return R.layout.djn;
    }

    public View getDanmuContainer() {
        return this.LJLIL;
    }

    public View getDanmuInput() {
        return this.LJLILLLLZI;
    }

    public final void LIZIZ(boolean z) {
        if (this.LJLJI || this.LJLJJI) {
            return;
        }
        if (CCJ.LIZ(getContext())) {
            this.LJLILLLLZI.setSelected(true);
            if (z) {
                ((TransitionDrawable) this.LJLIL.getBackground()).startTransition(100);
                ((TransitionDrawable) this.LJLILLLLZI.getBackground()).startTransition(100);
                this.LJLILLLLZI.animate().setListener(new IDAListenerS82S0100000_15(this, 0)).translationXBy(KL2.LIZJ(getContext(), -22.0f)).setDuration(100L).start();
                return;
            } else {
                ((TransitionDrawable) this.LJLIL.getBackground()).startTransition(0);
                ((TransitionDrawable) this.LJLILLLLZI.getBackground()).startTransition(0);
                this.LJLILLLLZI.setTranslationX(KL2.LIZJ(getContext(), -22.0f));
                return;
            }
        }
        this.LJLILLLLZI.setSelected(true);
        if (z) {
            ((TransitionDrawable) this.LJLIL.getBackground()).startTransition(100);
            ((TransitionDrawable) this.LJLILLLLZI.getBackground()).startTransition(100);
            this.LJLILLLLZI.animate().translationXBy(KL2.LIZJ(getContext(), 22.0f)).setDuration(100L).start();
        } else {
            ((TransitionDrawable) this.LJLIL.getBackground()).startTransition(0);
            ((TransitionDrawable) this.LJLILLLLZI.getBackground()).startTransition(0);
            this.LJLILLLLZI.setTranslationX(KL2.LIZJ(getContext(), 22.0f));
        }
    }

    public Y90(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        RelativeLayout.inflate(getContext(), getLayoutId(), this);
        this.LJLIL = findViewById(R.id.c3g);
        this.LJLILLLLZI = findViewById(R.id.c3e);
    }
}
