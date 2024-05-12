package X;

import Y.ALAdapterS10S0100000_13;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.U5w, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76636U5w extends ConstraintLayout {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final long LJLJJL;
    public final long LJLJJLL;
    public final long LJLJL;
    public final InterpolatorC61445O9p LJLJLJ;

    public final void LJJLJLI() {
        C29306Beo.LJJLIIIJJI(this, true);
        animate().cancel();
        getViewTipBg().animate().cancel();
        getViewTipTop().animate().cancel();
        getViewTipBottom().animate().cancel();
        getViewTipText().animate().cancel();
        getViewTipBg().setAlpha(0.0f);
        getViewTipTop().setAlpha(0.0f);
        getViewTipBottom().setAlpha(0.0f);
        getViewTipText().setAlpha(0.0f);
        setAlpha(1.0f);
        getViewTipTop().setTranslationY(-getViewTipTop().getHeight());
        getViewTipBottom().setTranslationY(getViewTipBottom().getHeight());
        getViewTipBg().animate().setDuration(this.LJLJJL).setInterpolator(this.LJLJLJ).alpha(0.2f).start();
        getViewTipTop().animate().setDuration(this.LJLJJL).setInterpolator(this.LJLJLJ).translationY(0.0f).alpha(1.0f).start();
        getViewTipBottom().animate().setDuration(this.LJLJJL).setInterpolator(this.LJLJLJ).translationY(0.0f).alpha(1.0f).start();
        getViewTipText().animate().setDuration(this.LJLJJL).setInterpolator(this.LJLJLJ).alpha(1.0f).start();
        animate().setDuration(this.LJLJL).setInterpolator(this.LJLJLJ).alpha(0.0f).setStartDelay(this.LJLJJLL + this.LJLJJL).setListener(new ALAdapterS10S0100000_13(this, 10)).start();
    }

    private final View getViewTipBg() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-viewTipBg>(...)");
        return (View) value;
    }

    private final AppCompatImageView getViewTipBottom() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-viewTipBottom>(...)");
        return (AppCompatImageView) value;
    }

    private final C47121t6 getViewTipText() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-viewTipText>(...)");
        return (C47121t6) value;
    }

    private final AppCompatImageView getViewTipTop() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-viewTipTop>(...)");
        return (AppCompatImageView) value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76636U5w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLIL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 145));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 148));
        this.LJLJI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 146));
        this.LJLJJI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 147));
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.deo, this, true);
        this.LJLJJL = 300L;
        this.LJLJJLL = 3000L;
        this.LJLJL = 200L;
        this.LJLJLJ = new InterpolatorC61445O9p(0.65f, 0.35f);
    }
}
