package X;

import Y.ARunnableS18S0101000_14;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.VtD, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81159VtD {
    public final Handler LIZ = new Handler(C16880lQ.LLJJJJ());
    public final WeakReference<ImageView> LIZIZ;
    public final W4W<C81392Vwy<W5A>> LIZJ;
    public final W42 LIZLLL;
    public C81392Vwy<W5A> LJ;

    public final void LIZ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            interfaceC65784Pro.invoke();
        } else {
            this.LIZ.post(new ARunnableS18S0101000_14(3, interfaceC65784Pro, 0));
        }
    }

    public C81159VtD(android.net.Uri uri, C173656rh c173656rh) {
        int i;
        W4W<C81392Vwy<W5A>> LJ;
        W92 w92;
        this.LIZIZ = new WeakReference<>(c173656rh);
        W5P LIZLLL = W5P.LIZLLL(uri);
        if (c173656rh.getMeasuredWidth() != 0) {
            i = c173656rh.getMeasuredWidth();
        } else {
            i = 100;
        }
        LIZLLL.LIZJ = new C79238V7y(i, c173656rh.getMeasuredHeight() != 0 ? c173656rh.getMeasuredHeight() : 100);
        LIZLLL.LIZLLL = V85.LIZJ;
        W5O LIZ = LIZLLL.LIZ();
        if (W5I.LIZ().LJIIIIZZ(LIZ)) {
            W6J LIZ2 = W5I.LIZ();
            LIZ2.getClass();
            W50 w50 = W50.BITMAP_MEMORY_CACHE;
            if (LIZ != null) {
                w92 = LIZ.LJIIJJI;
            } else {
                w92 = W92.HIGH;
            }
            LJ = LIZ2.LIZLLL(LIZ, this, w50, null, w92);
        } else {
            LJ = W5I.LIZ().LJ(LIZ, this);
        }
        this.LIZJ = LJ;
        this.LIZLLL = new W42(this);
    }
}
