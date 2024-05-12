package X;

import Y.ACListenerS29S0100000_9;
import Y.AUListenerS97S0100000_9;
import Y.IDAListenerS77S0100000_9;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.LBb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53839LBb extends FrameLayout {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public ValueAnimator LJLJI;
    public InterfaceC53841LBd LJLJJI;
    public final java.util.Map<Integer, View> LJLJJL;

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLJJL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void LIZIZ() {
        ValueAnimator valueAnimator = this.LJLJI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addListener(new IDAListenerS77S0100000_9(this, 0));
        ofFloat.addUpdateListener(new AUListenerS97S0100000_9(this, 4));
        ofFloat.setDuration(300L);
        ofFloat.start();
        this.LJLJI = ofFloat;
    }

    public final void LJ() {
        if ((!((Boolean) C52629Kl7.LIZ.getValue()).booleanValue() || this.LJLIL) && LIZ(R.id.g0h).getVisibility() == 0 && LIZ(R.id.fg0).getVisibility() == 0) {
            ((C29701Eo) LIZ(R.id.fg0)).resumeAnimation();
        }
    }

    public final boolean LIZJ() {
        if (LIZ(R.id.aag).getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void LIZLLL() {
        if (LIZ(R.id.aag).getVisibility() == 0) {
            LIZIZ();
        }
        if (LIZ(R.id.g0h).getVisibility() == 0 && LIZ(R.id.fg0).getVisibility() == 0) {
            ((C29701Eo) LIZ(R.id.fg0)).pauseAnimation();
        }
    }

    public final void setAutoEnterListener(InterfaceC53841LBd listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJJI = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53839LBb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Integer num;
        this.LJLJJL = C62850Ola.LJFF(context, "context");
        this.LJLIL = true;
        C53106Kso.LIZ.getClass();
        if (C53106Kso.LIZIZ()) {
            ConcurrentHashMap<String, Integer> concurrentHashMap = C38958FQs.LIZ;
            if (concurrentHashMap.containsKey("homepage_hot") && ((num = concurrentHashMap.get("homepage_hot")) == null || num.intValue() != 0)) {
                C38619FDr.LIZJ(context, R.layout.bqb, this);
                C16880lQ.LJJJJI((TuxTextView) LIZ(R.id.aah), new ACListenerS29S0100000_9(this, 194));
            }
        }
        View.inflate(context, R.layout.bqb, this);
        C16880lQ.LJJJJI((TuxTextView) LIZ(R.id.aah), new ACListenerS29S0100000_9(this, 194));
    }

    public final void LJFF(boolean z, boolean z2) {
        String LIZIZ;
        int i = 0;
        LIZ(R.id.g0h).setVisibility(0);
        LIZ(R.id.aag).setVisibility(8);
        ImageView imageView = (ImageView) LIZ(R.id.fg0);
        if (z2) {
            i = 8;
        }
        imageView.setVisibility(i);
        TextView textView = (TextView) LIZ(R.id.maj);
        if (z2) {
            if (z) {
                Context context = getContext();
                o.LJIIIIZZ(context, "context");
                LIZIZ = C38958FQs.LIZIZ(R.string.mgs, context);
            } else {
                Context context2 = getContext();
                o.LJIIIIZZ(context2, "context");
                LIZIZ = C38958FQs.LIZIZ(R.string.l_2, context2);
            }
        } else if (z) {
            Context context3 = getContext();
            o.LJIIIIZZ(context3, "context");
            LIZIZ = C38958FQs.LIZIZ(R.string.mgv, context3);
        } else {
            Context context4 = getContext();
            o.LJIIIIZZ(context4, "context");
            LIZIZ = C38958FQs.LIZIZ(R.string.l_7, context4);
        }
        textView.setText(LIZIZ);
        if (this.LJLILLLLZI) {
            C29306Beo.LJJJJJL(O6R.LJJIIZ(C32151Nz.LJIIZILJ(57)), LIZ(R.id.g0h));
        }
    }
}
