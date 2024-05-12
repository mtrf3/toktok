package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.OLf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61747OLf extends FrameLayout {
    public C26773Af3 LJLIL;
    public TuxTextView LJLILLLLZI;
    public L3Y LJLJI;

    public final C26773Af3 getFlashCountDownView() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C61747OLf(Context context) {
        super(context, null);
        a1.LJFF(context, "context");
        this.LJLJI = L3Y.FlashSaleViewWithCountDown;
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    }

    public final void LIZ(L3Y style) {
        ViewGroup.LayoutParams layoutParams;
        o.LJIIIZ(style, "style");
        this.LJLJI = style;
        LayoutInflater LLZIL = C16880lQ.LLZIL(getContext());
        L3Y l3y = this.LJLJI;
        if (l3y == L3Y.FlashSaleViewWithCountDown) {
            C16880lQ.LLLLIILL(LLZIL, R.layout.ans, this, true);
            this.LJLILLLLZI = (TuxTextView) findViewById(R.id.dit);
            findViewById(R.id.di9);
            C26773Af3 c26773Af3 = (C26773Af3) findViewById(R.id.ckc);
            this.LJLIL = c26773Af3;
            if (c26773Af3 != null) {
                c26773Af3.setTimeEndListener(new AqS160S0100000_10(this, 430));
            }
            C26773Af3 c26773Af32 = this.LJLIL;
            if (c26773Af32 != null && (layoutParams = c26773Af32.getLayoutParams()) != null) {
                layoutParams.width = C79081V1x.LJII(58);
                return;
            }
            return;
        }
        if (l3y != L3Y.FlashSaleViewWithoutCountDown) {
            return;
        }
        C16880lQ.LLLLIILL(LLZIL, R.layout.ant, this, true);
        this.LJLILLLLZI = (TuxTextView) findViewById(R.id.dit);
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.di9);
        if (tuxIconView != null) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            tuxIconView.setTintColor(AnonymousClass636.LJIIIIZZ(R.attr.e2, context));
        }
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZ = Integer.valueOf(C04330Ez.LIZIZ(getContext(), R.color.ax));
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        c110614Vt.LJ = C79045V0n.LJI(R.attr.d0, context2);
        c110614Vt.LIZJ = C61328O5c.LIZJ(2);
        c110614Vt.LIZLLL = AnonymousClass391.LIZJ(1);
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "context");
        setBackground(c110614Vt.LIZ(context3));
    }

    public final void LIZIZ(L3Y style) {
        ViewGroup.LayoutParams layoutParams;
        o.LJIIIZ(style, "style");
        this.LJLJI = style;
        LayoutInflater LLZIL = C16880lQ.LLZIL(getContext());
        L3Y l3y = this.LJLJI;
        if (l3y == L3Y.FlashSaleViewWithCountDown) {
            C16880lQ.LLLLIILL(LLZIL, R.layout.ans, this, true);
            this.LJLILLLLZI = (TuxTextView) findViewById(R.id.dit);
            findViewById(R.id.di9);
            C26773Af3 c26773Af3 = (C26773Af3) findViewById(R.id.ckc);
            this.LJLIL = c26773Af3;
            if (c26773Af3 != null) {
                c26773Af3.setBackground(C04270Et.LIZIZ(getContext(), R.drawable.ao8));
            }
            C26773Af3 c26773Af32 = this.LJLIL;
            if (c26773Af32 != null) {
                c26773Af32.setTimeEndListener(new AqS160S0100000_10(this, 431));
            }
            C26773Af3 c26773Af33 = this.LJLIL;
            if (c26773Af33 != null && (layoutParams = c26773Af33.getLayoutParams()) != null) {
                layoutParams.width = C79081V1x.LJII(58);
                return;
            }
            return;
        }
        if (l3y != L3Y.FlashSaleViewWithoutCountDown) {
            return;
        }
        C16880lQ.LLLLIILL(LLZIL, R.layout.ant, this, true);
        this.LJLILLLLZI = (TuxTextView) findViewById(R.id.dit);
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.di9);
        if (tuxIconView != null) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            tuxIconView.setTintColor(AnonymousClass636.LJIIIIZZ(R.attr.e2, context));
        }
        setBackground(C04270Et.LIZIZ(getContext(), R.drawable.aoa));
    }

    public final void setFlashSaleText(String str) {
        if (!TextUtils.isEmpty(str)) {
            TuxTextView tuxTextView = this.LJLILLLLZI;
            if (tuxTextView == null) {
                return;
            }
            tuxTextView.setText(str);
            return;
        }
        TuxTextView tuxTextView2 = this.LJLILLLLZI;
        if (tuxTextView2 == null) {
            return;
        }
        tuxTextView2.setText(C16880lQ.LLLLL(getContext()).getString(R.string.htw));
    }
}
