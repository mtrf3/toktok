package X;

import Y.ARunnableS21S0200000_2;
import Y.AUListenerS91S0100000_2;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Handler;
import kotlin.jvm.internal.o;

/* renamed from: X.6rm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ProgressDialogC173706rm extends ProgressDialogC173686rk {
    public final Activity LJLJLJ;
    public final Handler LJLJLLL;
    public final ValueAnimator LJLL;

    @Override // X.ProgressDialogC173686rk, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        this.LJLJLLL.removeCallbacksAndMessages(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressDialogC173706rm(ActivityC45651qj activity) {
        super(activity);
        o.LJIIIZ(activity, "activity");
        this.LJLJLJ = activity;
        this.LJLJLLL = new Handler();
        setCancelable(false);
        setIndeterminate(false);
        setMax(100);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 83);
        ofInt.setDuration(5000L);
        ofInt.addUpdateListener(new AUListenerS91S0100000_2(this, 30));
        this.LJLL = ofInt;
    }

    public final void LIZLLL(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (this.LJLL.isRunning()) {
            this.LJLL.end();
        }
        setProgress(100);
        this.LJLJLLL.postDelayed(new ARunnableS21S0200000_2(interfaceC65784Pro, this, 39), 70L);
    }
}
