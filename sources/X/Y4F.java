package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y4F extends LBE {
    public TuxIconView LJLJJI;
    public Y4H LJLJJL;

    public final void setMainIconOnClickListener(View.OnClickListener onClickListener) {
        o.LJIIIZ(onClickListener, "onClickListener");
    }

    @Override // X.LBE, android.view.View
    public final void onFinishInflate() {
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.wr);
        this.LJLJJI = tuxIconView;
        if (tuxIconView != null) {
            getAnimatingViews().add(tuxIconView);
        }
        super.onFinishInflate();
    }

    public final Y4H getButtonState() {
        return this.LJLJJL;
    }

    public final void setAdditionViewVisibility(int i) {
        findViewById(R.id.ku3).setVisibility(i);
    }

    public final void setAdditionalSupportImageResource(int i) {
        setAdditionViewVisibility(0);
        TuxIconView tuxIconView = this.LJLJJI;
        if (tuxIconView != null) {
            tuxIconView.setIconRes(i);
        }
    }

    public final void setButtonState(Y4H y4h) {
        o.LJIIIZ(y4h, "<set-?>");
        this.LJLJJL = y4h;
    }

    public final void setSupportIconOnClickListener(View.OnClickListener onClickListener) {
        o.LJIIIZ(onClickListener, "onClickListener");
        C16880lQ.LJIIJ(onClickListener, findViewById(R.id.ku3));
    }

    public final void setSupportIconState(Y4H supportButtonState) {
        o.LJIIIZ(supportButtonState, "supportButtonState");
        TuxIconView tuxIconView = this.LJLJJI;
        if (tuxIconView != null) {
            int i = Y4G.LIZ[supportButtonState.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                this.LJLJJL = Y4H.TOGGLED;
                ViewPropertyAnimator animate = tuxIconView.animate();
                animate.rotation(180.0f);
                animate.setDuration(0L);
                return;
            }
            this.LJLJJL = Y4H.INITIAL;
            ViewPropertyAnimator animate2 = tuxIconView.animate();
            animate2.rotation(0.0f);
            animate2.setDuration(0L);
        }
    }

    public final void setVideoNumber(String number) {
        o.LJIIIZ(number, "number");
        View findViewById = findViewById(R.id.n6x);
        o.LJIIIIZZ(findViewById, "findViewById<TuxTextView>(R.id.video_number)");
        TextView textView = (TextView) findViewById;
        textView.setVisibility(0);
        textView.setText(number);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y4F(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLJJL = Y4H.INITIAL;
    }
}
