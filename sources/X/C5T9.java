package X;

import Y.AUListenerS10S0500000_2;
import android.animation.ValueAnimator;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.audiorecord.Point;
import java.util.Stack;
import kotlin.jvm.internal.o;

/* renamed from: X.5T9, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5T9 {
    public final InterfaceC143655kP LIZ;
    public final ValueAnimator LIZIZ;
    public boolean LIZJ;
    public final InterfaceC153045zY LIZLLL;
    public int LJ;
    public final MutableLiveData<C5MM> LJFF;
    public final C62822Ol8 LJI;
    public Point LJII;
    public C5TE LJIIIIZZ;
    public C5T8 LJIIIZ;
    public C5TF LJIIJ;
    public final C5TA LJIIJJI;

    public final void LIZ() {
        this.LJFF.setValue(C5MM.LIZJ());
        this.LIZIZ.cancel();
    }

    public final MutableLiveData<Long> LIZIZ() {
        return (MutableLiveData) this.LJI.getValue();
    }

    public final Stack<Point> LIZJ() {
        Stack<Point> stack;
        C5T8 c5t8 = this.LJIIIZ;
        if (c5t8 != null) {
            stack = c5t8.getStack();
        } else {
            stack = null;
        }
        o.LJI(stack);
        return stack;
    }

    public final void LJ() {
        this.LJIIJJI.LIZ(0.0f, true);
        C5T8 c5t8 = this.LJIIIZ;
        if (c5t8 != null) {
            c5t8.LJJIIJ(0.0f);
        }
        C5TF c5tf = this.LJIIJ;
        if (c5tf != null) {
            c5tf.LJJIIJ(0.0f);
        }
    }

    public final void LJI() {
        this.LJFF.setValue(C5MM.LIZ());
        this.LIZIZ.start();
    }

    public C5T9(InterfaceC142545ic editPreviewApi) {
        o.LJIIIZ(editPreviewApi, "editPreviewApi");
        this.LIZ = editPreviewApi;
        ValueAnimator ofInt = ValueAnimator.ofInt(1, 10);
        o.LJIIIIZZ(ofInt, "ofInt(1, 10)");
        this.LIZIZ = ofInt;
        this.LJ = 1;
        this.LJFF = editPreviewApi.DM();
        this.LJI = C221108m2.LIZIZ(C5TB.LJLIL);
        InterfaceC153045zY value = editPreviewApi.Kh().getValue();
        this.LIZLLL = value;
        if (value != null) {
            this.LJ = value.getDuration();
        }
        this.LJIIJJI = new C5TA(this);
    }

    public final void LJFF(Stack<Point> s) {
        o.LJIIIZ(s, "s");
        LJ();
        this.LJII = null;
        C5T8 c5t8 = this.LJIIIZ;
        if (c5t8 != null) {
            c5t8.setStack(s);
        }
        LIZIZ().setValue(0L);
    }

    public final void LIZLLL(InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro pauseRecordWhenEnd, InterfaceC65784Pro resetProgressUI, InterfaceC88472Yns pauseRecord) {
        o.LJIIIZ(pauseRecord, "pauseRecord");
        o.LJIIIZ(pauseRecordWhenEnd, "pauseRecordWhenEnd");
        o.LJIIIZ(resetProgressUI, "resetProgressUI");
        this.LIZIZ.removeAllUpdateListeners();
        this.LIZIZ.setDuration(1000L);
        this.LIZIZ.setRepeatCount(-1);
        this.LIZIZ.addUpdateListener(new AUListenerS10S0500000_2(this, interfaceC65784Pro, pauseRecord, pauseRecordWhenEnd, resetProgressUI, 0));
    }
}
