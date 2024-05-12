package X;

import Y.ACListenerS24S0100000_4;
import Y.ARunnableS40S0100000_4;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.text.NumberFormat;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import o3.h0;
import ujb.s;

/* loaded from: classes5.dex */
public final class A90 extends Dialog {
    public float LJLIL;
    public boolean LJLILLLLZI;
    public String LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public A91 LJLJJLL;
    public View LJLJL;
    public TuxIconView LJLJLJ;
    public C5GC LJLJLLL;
    public TuxTextView LJLL;
    public TuxTextView LJLLI;
    public final A92 LJLLILLLL;
    public final ARunnableS40S0100000_4 LJLLJ;
    public final String LJLLL;
    public final AqS170S0100000_4 LJLLLL;

    public final void LJFF() {
        View view = this.LJLJL;
        if (view != null) {
            view.setContentDescription(this.LJLJI);
            h0.LJJII(view, (CharSequence) this.LJLLLL.invoke(Float.valueOf(this.LJLIL)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A90(Context context) {
        super(context);
        String str;
        o.LJIIIZ(context, "context");
        this.LJLILLLLZI = true;
        this.LJLJJL = true;
        this.LJLLILLLL = new A92();
        this.LJLLJ = new ARunnableS40S0100000_4(this, 125);
        String format = NumberFormat.getPercentInstance().format(0L);
        o.LJIIIIZZ(format, "getPercentInstance().format(0)");
        if (s.LJJLIIIJJIZ(format, ' ', 0, false, 6) == -1) {
            str = "";
        } else {
            str = " ";
        }
        this.LJLLL = str;
        this.LJLLLL = new AqS170S0100000_4(this, 1120);
    }

    public final void LIZ(boolean z) {
        this.LJLILLLLZI = z;
        LIZLLL(this.LJLIL);
    }

    public final void LIZIZ(boolean z) {
        this.LJLJJI = z;
        if (z) {
            Window window = getWindow();
            if (window != null) {
                window.setDimAmount(0.5f);
                return;
            }
            return;
        }
        Window window2 = getWindow();
        if (window2 == null) {
            return;
        }
        window2.setDimAmount(0.0f);
    }

    public final void LIZJ(String str) {
        this.LJLJI = str;
        if (str == null || str.length() == 0) {
            TuxTextView tuxTextView = this.LJLLI;
            if (tuxTextView != null) {
                tuxTextView.setVisibility(8);
            }
        } else {
            TuxTextView tuxTextView2 = this.LJLLI;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(str);
            }
            TuxTextView tuxTextView3 = this.LJLLI;
            if (tuxTextView3 != null) {
                tuxTextView3.setVisibility(0);
            }
        }
        LJFF();
    }

    public final void LIZLLL(float f) {
        this.LJLIL = f;
        C5GC c5gc = this.LJLJLLL;
        if (c5gc != null) {
            c5gc.setProgress(f);
        }
        TuxTextView tuxTextView = this.LJLL;
        if (tuxTextView != null) {
            tuxTextView.setText((CharSequence) this.LJLLLL.invoke(Float.valueOf(f)));
        }
        LJFF();
        if (f == 100.0f && this.LJLILLLLZI) {
            dismiss();
        }
    }

    public final void LJ(boolean z) {
        this.LJLJJL = z;
        if (z) {
            TuxIconView tuxIconView = this.LJLJLJ;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(0);
            }
            this.LJLLILLLL.LIZIZ = this.LJLLJ;
            return;
        }
        TuxIconView tuxIconView2 = this.LJLJLJ;
        if (tuxIconView2 != null) {
            tuxIconView2.setVisibility(8);
        }
        this.LJLLILLLL.LIZIZ = null;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        WindowManager.LayoutParams attributes;
        super.onCreate(bundle);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, new int[]{R.attr.bsf, R.attr.bsg, R.attr.bsh, R.attr.bsi, R.attr.bsj, R.attr.bsk, R.attr.bsl}, R.attr.k7, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…adingProgressHUDStyle, 0)");
        int color = obtainStyledAttributes.getColor(0, 0);
        float dimension = obtainStyledAttributes.getDimension(1, 0.0f);
        String LLLZLZ = C16880lQ.LLLZLZ(obtainStyledAttributes, 2);
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        int color2 = obtainStyledAttributes.getColor(4, 0);
        int i = obtainStyledAttributes.getInt(6, 0);
        int color3 = obtainStyledAttributes.getColor(5, 0);
        obtainStyledAttributes.recycle();
        setCanceledOnTouchOutside(false);
        LIZIZ(this.LJLJJI);
        Window window = getWindow();
        if (window != null) {
            C28289B8j.LIZIZ(0, window);
        }
        Window window2 = getWindow();
        if (window2 != null && (attributes = window2.getAttributes()) != null) {
            attributes.y = C7MY.LIZIZ(-17);
        }
        setContentView(R.layout.ce);
        this.LJLJL = findViewById(R.id.gce);
        this.LJLJLJ = (TuxIconView) findViewById(R.id.bfr);
        this.LJLJLLL = (C5GC) findViewById(R.id.ib9);
        this.LJLL = (TuxTextView) findViewById(R.id.ib3);
        this.LJLLI = (TuxTextView) findViewById(R.id.gi3);
        View view = this.LJLJL;
        if (view != null) {
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZ = Integer.valueOf(color);
            c110614Vt.LIZJ = Float.valueOf(dimension);
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            view.setBackground(c110614Vt.LIZ(context));
            A92 a92 = this.LJLLILLLL;
            a92.LIZ = LLLZLZ;
            h0.LJIJI(view, a92);
        }
        TuxIconView tuxIconView = this.LJLJLJ;
        if (tuxIconView != null) {
            tuxIconView.setIconRes(resourceId);
            tuxIconView.setTintColor(color2);
            C16880lQ.LJJJ(tuxIconView, new ACListenerS24S0100000_4(this, 270));
        }
        TuxTextView tuxTextView = this.LJLL;
        if (tuxTextView != null) {
            tuxTextView.setTuxFont(i);
            tuxTextView.setTextColor(color3);
        }
        TuxTextView tuxTextView2 = this.LJLLI;
        if (tuxTextView2 != null) {
            tuxTextView2.setTuxFont(i);
            tuxTextView2.setTextColor(color3);
        }
        LIZLLL(this.LJLIL);
        LIZJ(this.LJLJI);
        LJ(this.LJLJJL);
    }
}
