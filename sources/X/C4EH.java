package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4EH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4EH extends FrameLayout {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public long LJLJI;
    public OSZ<Integer, Integer> LJLJJI;
    public C4EG LJLJJL;
    public final java.util.Map<Integer, View> LJLJJLL;

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLJJLL;
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

    private final ValueAnimator getContentAnimation() {
        return (ValueAnimator) this.LJLILLLLZI.getValue();
    }

    private final ValueAnimator getTipAnimation() {
        return (ValueAnimator) this.LJLIL.getValue();
    }

    public final OSZ<Integer, Integer> getAnchorViewCoordinate() {
        return this.LJLJJI;
    }

    public final long getLastShowTime() {
        return this.LJLJI;
    }

    public final C4EG getTipState() {
        return this.LJLJJL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4EH(Context context) {
        super(context, null, 0);
        this.LJLJJLL = C62850Ola.LJFF(context, "context");
        C16880lQ.LLLZIIL(R.layout.b7c, C16880lQ.LLZIL(context), this);
        LIZ(R.id.bst).setVisibility(0);
        LIZ(R.id.l8i).setVisibility(8);
        this.LJLIL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 865));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 864));
        this.LJLJJI = new OSZ<>(0, 0);
        this.LJLJJL = C4EG.DEFAULT;
    }

    public final void setAnchorViewCoordinate(OSZ<Integer, Integer> osz) {
        o.LJIIIZ(osz, "<set-?>");
        this.LJLJJI = osz;
    }

    public final void setLastShowTime(long j) {
        this.LJLJI = j;
    }

    public final void setTipState(C4EG value) {
        o.LJIIIZ(value, "value");
        if (value == this.LJLJJL) {
            return;
        }
        if (getTipAnimation().isRunning()) {
            getTipAnimation().cancel();
        }
        if (getContentAnimation().isRunning()) {
            getContentAnimation().cancel();
        }
        if (C4EL.LIZ[value.ordinal()] == 1) {
            CharSequence text = ((AppCompatTextView) LIZ(R.id.bst)).getText();
            if (text != null && text.length() != 0) {
                LIZ(R.id.bst).setVisibility(0);
                getContentAnimation().start();
                LIZ(R.id.l8i).setVisibility(8);
            }
        } else if (value != C4EG.DEFAULT) {
            LIZ(R.id.l8i).setVisibility(0);
            LIZ(R.id.bst).setVisibility(8);
            getTipAnimation().start();
            if (value.getIconRes() != null) {
                TuxIconView tuxIconView = (TuxIconView) LIZ(R.id.l8q);
                tuxIconView.setVisibility(0);
                tuxIconView.setTintColorRes(value.getColorAttrRes());
                tuxIconView.setIconRes(value.getIconRes().intValue());
            } else {
                ((ImageView) LIZ(R.id.l8q)).setVisibility(8);
            }
            TuxTextView tuxTextView = (TuxTextView) LIZ(R.id.l8u);
            tuxTextView.setText(tuxTextView.getContext().getString(value.getTextRes()));
            tuxTextView.setTextColorRes(value.getColorAttrRes());
        }
        this.LJLJJL = value;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        setX(0.0f);
        setY(this.LJLJJI.getSecond().floatValue() - i2);
        super.onSizeChanged(i, i2, i3, i4);
    }
}
