package X;

import Y.IDHandlerS22S0100000_10;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.OlC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62826OlC {
    public final Activity LIZ;
    public final int LIZIZ;
    public final IDHandlerS22S0100000_10 LIZJ;
    public final C62822Ol8 LIZLLL;
    public final C62822Ol8 LJ;
    public final C62822Ol8 LJFF;
    public final C62822Ol8 LJI;

    public final C57392Nb LIZ() {
        return (C57392Nb) this.LIZLLL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ() {
        C7XD.LIZ("NowDownloadBottomView", "register");
        LifecycleOwner LIZIZ = C57434MgQ.LIZIZ(this.LIZ);
        if (LIZIZ != null) {
            ((LiveData) this.LJ.getValue()).observe(LIZIZ, (Observer) this.LJFF.getValue());
        }
        C62828OlE.LJLLILLLL.add(this.LJI.getValue());
    }

    public final void LIZLLL() {
        C62828OlE.LJLLILLLL.remove(this.LJI.getValue());
        ((LiveData) this.LJ.getValue()).removeObserver((Observer) this.LJFF.getValue());
    }

    public final void LIZJ(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("showDownloadProgressBar isShow[");
        LIZ.append(z);
        LIZ.append(']');
        C7XD.LIZ("NowDownloadBottomView", X1D.LIZIZ(LIZ));
        if (z) {
            C57392Nb LIZ2 = LIZ();
            if (LIZ2 != null) {
                C62828OlE.LJIIIZ(LIZ2, 0, null, null, 6);
            }
            C57392Nb LIZ3 = LIZ();
            if (LIZ3 != null) {
                LIZ3.LJIIJJI();
                return;
            }
            return;
        }
        C57392Nb LIZ4 = LIZ();
        if (LIZ4 == null) {
            return;
        }
        C62828OlE.LJIIIZ(LIZ4, 8, null, null, 6);
    }

    public C62826OlC(ActivityC45651qj activityC45651qj, BaseFragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        this.LIZ = activityC45651qj;
        this.LIZIZ = 1;
        this.LIZJ = new IDHandlerS22S0100000_10(this, C16880lQ.LLJJJJ(), 2);
        this.LIZLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 599));
        this.LJ = C221108m2.LIZIZ(C62612Ohk.LJLIL);
        this.LJFF = C221108m2.LIZIZ(new AqS160S0100000_10(this, 598));
        this.LJI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 600));
    }
}
