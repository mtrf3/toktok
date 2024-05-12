package X;

import android.content.Context;
import android.os.RemoteException;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.v;

/* renamed from: X.aSb, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class RunnableC93545aSb implements Runnable {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ InterfaceC93523aSF LJLILLLLZI;
    public final /* synthetic */ v LJLJI;

    public RunnableC93545aSb(v vVar, Context context, InterfaceC93523aSF interfaceC93523aSF) {
        this.LJLJI = vVar;
        this.LJLIL = context;
        this.LJLILLLLZI = interfaceC93523aSF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        InterfaceC93986aZi interfaceC93986aZi;
        try {
            try {
                interfaceC93986aZi = this.LJLJI.c;
                interfaceC93986aZi.LLLIIII(this.LJLIL.getApplicationInfo().packageName, v.k(), new BinderC94433agv(this));
            } catch (RemoteException unused) {
                this.LJLILLLLZI.LIZ(ArCoreApk.Availability.UNKNOWN_ERROR);
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
