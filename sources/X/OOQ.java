package X;

import Y.ARunnableS46S0100000_10;
import android.app.Activity;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OOQ extends C18Z {
    public final View LJLJI;
    public final View LJLJJI;
    public boolean LJLJJL;
    public final C53879LCp LJLJJLL;

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.LJLJJL = false;
        AKZ.LIZ();
        super.onDetachedFromWindow();
    }

    @Override // X.C18Z, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        C53879LCp c53879LCp = this.LJLJJLL;
        View view = this.LJLJJI;
        c53879LCp.getClass();
        C53879LCp.LIZ(view).start();
        new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS46S0100000_10(this, 131), 50L);
    }

    @Override // android.app.Dialog
    public final void show() {
        try {
            if (!new C03880Dg(2).LIZJ(300000, "androidx/appcompat/app/AppCompatDialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "-6205491549583593653")).LIZ) {
                super.show();
            }
            this.LJLJI.post(new ARunnableS46S0100000_10(this, 132));
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    public static final /* synthetic */ void LJIJJ(OOQ ooq) {
        super.dismiss();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.LJLJJL != z) {
            if (z) {
                AKZ.LIZIZ(this);
            } else {
                AKZ.LIZ();
            }
            this.LJLJJL = z;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OOQ(C26231ARf dialog, View view, C74291TDr c74291TDr) {
        super(dialog.LJLILLLLZI, R.style.i9);
        ActivityC45651qj activityC45651qj;
        o.LJIIIZ(dialog, "dialog");
        this.LJLJI = view;
        this.LJLJJI = c74291TDr;
        this.LJLJJLL = new C53879LCp();
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
        }
        setContentView(view);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawableResource(android.R.color.transparent);
            window2.addFlags(2);
            Activity LJIJJ = C45804HyK.LJIJJ(dialog.LJLILLLLZI);
            if (LJIJJ instanceof ActivityC45651qj) {
                activityC45651qj = (ActivityC45651qj) LJIJJ;
            } else {
                activityC45651qj = null;
            }
            if (activityC45651qj == null) {
                window2.getAttributes().height = -2;
            } else {
                C61713OJx LIZLLL = C61712OJw.LIZLLL(activityC45651qj, this);
                LIZLLL.LJIIIZ();
                LIZLLL.LIZJ();
                window2.getAttributes().height = -1;
            }
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.dimAmount = 0.5f;
            attributes.gravity = 1;
            attributes.width = -1;
        }
    }
}
