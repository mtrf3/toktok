package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import com.google.ar.core.v;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.aSH, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class RunnableC93525aSH implements Runnable {
    public final /* synthetic */ Activity LJLIL;
    public final /* synthetic */ C93538aSU LJLILLLLZI;
    public final /* synthetic */ v LJLJI;

    public RunnableC93525aSH(v vVar, Activity activity, C93538aSU c93538aSU) {
        this.LJLJI = vVar;
        this.LJLIL = activity;
        this.LJLILLLLZI = c93538aSU;
    }

    public final void LIZ() {
        InterfaceC93986aZi interfaceC93986aZi;
        try {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            interfaceC93986aZi = this.LJLJI.c;
            interfaceC93986aZi.LLILZLL(this.LJLIL.getApplicationInfo().packageName, Collections.singletonList(v.k()), new Bundle(), new BinderC94432agu(this, atomicBoolean));
            new Handler().postDelayed(new RunnableC93524aSG(this, atomicBoolean), 3000L);
        } catch (RemoteException unused) {
            v vVar = this.LJLJI;
            v.o(this.LJLIL, this.LJLILLLLZI);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
