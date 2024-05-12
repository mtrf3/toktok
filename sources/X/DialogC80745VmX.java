package X;

import Y.ARunnableS50S0100000_14;
import Y.AUListenerS101S0100000_14;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.VmX */
/* loaded from: classes15.dex */
public final class DialogC80745VmX extends C18Z {
    public final C53879LCp LJLJI;

    @Override // android.app.Dialog
    public final void show() {
        try {
            if (!new C03880Dg(2).LIZJ(300000, "androidx/appcompat/app/AppCompatDialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "4280514778818829869")).LIZ) {
                super.show();
            }
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            if (!C63081OpJ.LJZI(context)) {
                Context context2 = getContext();
                o.LJIIIIZZ(context2, "context");
                if (!C63081OpJ.LJLLILLLL(context2)) {
                    C53879LCp c53879LCp = this.LJLJI;
                    View radius_layout = findViewById(R.id.ilw);
                    o.LJIIIIZZ(radius_layout, "radius_layout");
                    c53879LCp.getClass();
                    C53879LCp.LIZIZ(radius_layout).start();
                    return;
                }
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new AUListenerS101S0100000_14(this, 67));
            ofFloat.setDuration(300L);
            Context context3 = getContext();
            o.LJIIIIZZ(context3, "context");
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(C63081OpJ.LJJJJJL(context3), 0.0f);
            ofFloat2.addUpdateListener(new AUListenerS101S0100000_14(this, 68));
            ofFloat2.setDuration(300L);
            ofFloat2.setInterpolator(C55953Lxd.LJIIJ());
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.start();
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    @Override // X.C18Z, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        long j;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        if (!C63081OpJ.LJZI(context)) {
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            if (!C63081OpJ.LJLLILLLL(context2)) {
                C53879LCp c53879LCp = this.LJLJI;
                View radius_layout = findViewById(R.id.ilw);
                o.LJIIIIZZ(radius_layout, "radius_layout");
                c53879LCp.getClass();
                C53879LCp.LIZ(radius_layout).start();
                j = 50;
                new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS50S0100000_14(this, 259), j);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.addUpdateListener(new AUListenerS101S0100000_14(this, 65));
        ofFloat.setDuration(250L);
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "context");
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, C63081OpJ.LJJJJJL(context3));
        ofFloat2.addUpdateListener(new AUListenerS101S0100000_14(this, 66));
        ofFloat2.setDuration(250L);
        ofFloat2.setInterpolator(C55953Lxd.LIZLLL());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
        j = 250;
        new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS50S0100000_14(this, 259), j);
    }

    public static final /* synthetic */ void LJIJJ(DialogC80745VmX dialogC80745VmX) {
        super.dismiss();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DialogC80745VmX(android.content.Context r11, boolean r12, boolean r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC80745VmX.<init>(android.content.Context, boolean, boolean, boolean):void");
    }
}
