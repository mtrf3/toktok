package X;

import Y.ACListenerS21S0100000_1;
import Y.IDAListenerS229S0100000_1;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.3uz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99253uz extends FrameLayout {
    public final RecyclerView LJLIL;
    public ValueAnimator LJLILLLLZI;
    public InterfaceC88472Yns<? super String, C76800UCe> LJLJI;

    public final void LIZ() {
        setClickable(false);
        AlphaAnimation alphaAnimation = new AlphaAnimation(getAlpha(), 0.0f);
        alphaAnimation.setDuration(50L);
        alphaAnimation.setAnimationListener(new IDAListenerS229S0100000_1(this, 3));
        startAnimation(alphaAnimation);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.LJLILLLLZI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final InterfaceC88472Yns<String, C76800UCe> getOnConfirm() {
        return this.LJLJI;
    }

    public final void setOnConfirm(InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        this.LJLJI = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C99253uz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        float f;
        a1.LJFF(context, "context");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.b8s, this, true);
        View findViewById = LLLLIILL.findViewById(R.id.anv);
        o.LJIIIIZZ(findViewById, "root.findViewById(R.id.bot_disclaimer_avatar)");
        ImageView imageView = (ImageView) findViewById;
        if (C90193gN.LIZ()) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        imageView.setScaleX(f);
        View findViewById2 = LLLLIILL.findViewById(R.id.any);
        o.LJIIIIZZ(findViewById2, "root.findViewById(R.id.bot_disclaimer_content)");
        TuxTextView tuxTextView = (TuxTextView) findViewById2;
        View findViewById3 = LLLLIILL.findViewById(R.id.anw);
        o.LJIIIIZZ(findViewById3, "root.findViewById(R.id.bot_disclaimer_close)");
        View findViewById4 = LLLLIILL.findViewById(R.id.anx);
        o.LJIIIIZZ(findViewById4, "root.findViewById(R.id.bot_disclaimer_confirm_btn)");
        View findViewById5 = LLLLIILL.findViewById(R.id.ao0);
        o.LJIIIIZZ(findViewById5, "root.findViewById(R.id.bot_disclaimer_title)");
        View findViewById6 = LLLLIILL.findViewById(R.id.anz);
        o.LJIIIIZZ(findViewById6, "root.findViewById(R.id.bot_disclaimer_prompt_list)");
        this.LJLIL = (RecyclerView) findViewById6;
        setBackgroundColor(C97343ru.LIZLLL(C49R.LIZ.LIZLLL));
        C96963rI.LJII().getClass();
        ((TextView) findViewById5).setText(C97343ru.LJI(R.string.cnd, C97353rv.LIZJ()));
        C96943rG LJFF = C96963rI.LJFF();
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(68));
        LJFF.getClass();
        C96943rG.LIZ(LJJIIZ, imageView);
        C96963rI.LJII().getClass();
        C96963rI.LJII().getClass();
        C96963rI.LJII().getClass();
        tuxTextView.setText(C97343ru.LJI(R.string.cmp, C97353rv.LIZJ(), C97353rv.LIZJ(), C97353rv.LIZJ()));
        C96963rI.LJIIIZ().getClass();
        C97223ri.LIZIZ(tuxTextView, true);
        C16880lQ.LJJJ((TuxIconView) findViewById3, new ACListenerS21S0100000_1(this, 127));
        C16880lQ.LJJIZ((SY4) findViewById4, new ACListenerS21S0100000_1(this, 128));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("init full screen view, sessionInfo: ");
        LIZ.append(C99033ud.Companion);
        V1B.LJIIZILJ(X1D.LIZIZ(LIZ));
    }
}
