package X;

import Y.ACListenerS24S0100000_4;
import Y.ARunnableS40S0100000_4;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.A8y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogC25756A8y extends Dialog {
    public boolean LJLIL;
    public TuxIconView LJLILLLLZI;
    public C8IC LJLJI;
    public String LJLJJI;
    public boolean LJLJJL;
    public C41440GOe LJLJJLL;
    public final ARunnableS40S0100000_4 LJLJL;

    @Override // android.app.Dialog
    public final void show() {
        if (!new C03880Dg(2).LIZJ(300000, "android/app/Dialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "424872835687718788")).LIZ) {
            super.show();
        }
        C8IC c8ic = this.LJLJI;
        if (c8ic == null) {
            return;
        }
        c8ic.setVisibility(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC25756A8y(Context context) {
        super(context);
        o.LJIIIZ(context, "context");
        this.LJLJL = new ARunnableS40S0100000_4(this, 124);
    }

    public final void LIZ(boolean z) {
        this.LJLIL = z;
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

    public final void LIZIZ(int i) {
        this.LJLJJI = getContext().getResources().getString(i);
        C8IC c8ic = this.LJLJI;
        if (c8ic != null) {
            c8ic.setMessage(i);
        }
    }

    public final void LIZJ(String str) {
        this.LJLJJI = str;
        C8IC c8ic = this.LJLJI;
        if (c8ic != null) {
            c8ic.setMessage(str);
        }
    }

    public final void LIZLLL(boolean z) {
        this.LJLJJL = z;
        if (z) {
            TuxIconView tuxIconView = this.LJLILLLLZI;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(0);
            }
            C8IC c8ic = this.LJLJI;
            if (c8ic != null) {
                c8ic.setAccessibilityClickActionRunnable(this.LJLJL);
                return;
            }
            return;
        }
        TuxIconView tuxIconView2 = this.LJLILLLLZI;
        if (tuxIconView2 != null) {
            tuxIconView2.setVisibility(8);
        }
        C8IC c8ic2 = this.LJLJI;
        if (c8ic2 == null) {
            return;
        }
        c8ic2.setAccessibilityClickActionRunnable(null);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        WindowManager.LayoutParams attributes;
        super.onCreate(bundle);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, new int[]{R.attr.bsb, R.attr.bsc, R.attr.bsd}, R.attr.k5, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…LoadingDialogHUDStyle, 0)");
        String LLLZLZ = C16880lQ.LLLZLZ(obtainStyledAttributes, 0);
        int resourceId = obtainStyledAttributes.getResourceId(1, 0);
        int color = obtainStyledAttributes.getColor(2, 0);
        obtainStyledAttributes.recycle();
        setCanceledOnTouchOutside(false);
        LIZ(this.LJLIL);
        Window window = getWindow();
        if (window != null) {
            C28289B8j.LIZIZ(0, window);
        }
        Window window2 = getWindow();
        if (window2 != null && (attributes = window2.getAttributes()) != null) {
            attributes.y = C7MY.LIZIZ(-17);
        }
        setContentView(R.layout.cc);
        C8IC c8ic = (C8IC) findViewById(R.id.luv);
        this.LJLJI = c8ic;
        if (c8ic != null) {
            c8ic.setAccessibilityClickActionLabel(LLLZLZ);
        }
        this.LJLILLLLZI = (TuxIconView) findViewById(R.id.bfr);
        LIZJ(this.LJLJJI);
        TuxIconView tuxIconView = this.LJLILLLLZI;
        if (tuxIconView != null) {
            tuxIconView.setIconRes(resourceId);
            tuxIconView.setTintColor(color);
            C16880lQ.LJJJ(tuxIconView, new ACListenerS24S0100000_4(this, 269));
        }
        LIZLLL(this.LJLJJL);
    }
}
