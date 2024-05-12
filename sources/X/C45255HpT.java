package X;

import Y.ACListenerS27S0100000_7;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.HpT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45255HpT extends LinearLayout {
    public final View LJLIL;
    public TuxTextView LJLILLLLZI;
    public TuxTextView LJLJI;
    public TuxIconView LJLJJI;
    public W5G LJLJJL;
    public TuxIconView LJLJJLL;
    public TuxTextView LJLJL;
    public TuxIconView LJLJLJ;
    public ImageView LJLJLLL;
    public int LJLL;
    public final C62822Ol8 LJLLI;

    private final RotateAnimation getRotationAnim() {
        return (RotateAnimation) this.LJLLI.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45255HpT(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        this.LJLIL = C16880lQ.LLLZIIL(R.layout.i_, C16880lQ.LLZIL(context), this);
        this.LJLL = R.attr.cf;
        this.LJLLI = C221108m2.LIZIZ(C197287oi.LJLIL);
    }

    public final void LIZ(boolean z) {
        if (z) {
            TuxIconView tuxIconView = this.LJLJJLL;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(0);
            }
            TuxIconView tuxIconView2 = this.LJLJJLL;
            if (tuxIconView2 != null) {
                tuxIconView2.startAnimation(getRotationAnim());
                return;
            }
            return;
        }
        getRotationAnim().cancel();
        TuxIconView tuxIconView3 = this.LJLJJLL;
        if (tuxIconView3 == null) {
            return;
        }
        tuxIconView3.setVisibility(8);
    }

    public final void setExitListener(InterfaceC65784Pro<C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        TuxIconView tuxIconView = this.LJLJJI;
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS27S0100000_7(listener, 122));
        }
    }

    public final void setHintText(String text) {
        o.LJIIIZ(text, "text");
        TuxTextView tuxTextView = this.LJLJI;
        if (tuxTextView == null) {
            return;
        }
        tuxTextView.setText(text);
    }

    public final void setMediaCover(android.net.Uri uri) {
        if (uri != null) {
            C78764Uvg.LIZJ(this.LJLJJL, uri, -1, -1);
            return;
        }
        Drawable drawable = getContext().getDrawable(R.drawable.q0);
        if (drawable != null) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            Integer LJI = C79045V0n.LJI(this.LJLL, context);
            if (LJI != null) {
                drawable.setColorFilter(LJI.intValue(), PorterDuff.Mode.SRC);
            }
            W5G w5g = this.LJLJJL;
            if (w5g != null) {
                w5g.setImageDrawable(drawable);
            }
        }
    }

    public final void setProcessText(String text) {
        o.LJIIIZ(text, "text");
        TuxTextView tuxTextView = this.LJLILLLLZI;
        if (tuxTextView == null) {
            return;
        }
        tuxTextView.setText(text);
    }

    public final void setProgress(int i) {
        TuxTextView tuxTextView = this.LJLJL;
        if (tuxTextView == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(i);
        LIZ.append('%');
        tuxTextView.setText(X1D.LIZIZ(LIZ));
    }

    public final void setRetryListener(InterfaceC65784Pro<C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        TuxIconView tuxIconView = this.LJLJLJ;
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS27S0100000_7(listener, 123));
        }
    }
}
