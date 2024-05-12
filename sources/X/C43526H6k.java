package X;

import Y.ARunnableS43S0100000_7;
import android.os.Handler;
import android.os.Looper;

/* renamed from: X.H6k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43526H6k implements InterfaceC43522H6g {
    public final Handler LIZ = new Handler(C16880lQ.LLJJJJ());

    @Override // X.InterfaceC43522H6g
    public final void execute(Runnable runnable) {
        C43527H6l c43527H6l = new C43527H6l(runnable);
        if (C16880lQ.LLJJJJ().equals(Looper.myLooper())) {
            c43527H6l.invoke();
        } else {
            this.LIZ.post(new ARunnableS43S0100000_7((Object) c43527H6l, 124));
        }
    }
}
