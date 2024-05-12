package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Qic, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67762Qic implements Handler.Callback {
    public final InterfaceC67787Qj1 LJLIL;
    public final HandlerC67272Qai LJLJLJ;
    public final ArrayList<InterfaceC67706Qhi> LJLILLLLZI = new ArrayList<>();
    public final ArrayList<InterfaceC67706Qhi> LJLJI = new ArrayList<>();
    public final ArrayList<InterfaceC67707Qhj> LJLJJI = new ArrayList<>();
    public volatile boolean LJLJJL = false;
    public final AtomicInteger LJLJJLL = new AtomicInteger(0);
    public boolean LJLJL = false;
    public final Object LJLJLLL = new Object();

    public final void LIZ(InterfaceC67707Qhj interfaceC67707Qhj) {
        QH7.LJIIIIZZ(interfaceC67707Qhj);
        synchronized (this.LJLJLLL) {
            if (this.LJLJJI.contains(interfaceC67707Qhj)) {
                new StringBuilder(String.valueOf(interfaceC67707Qhj).length() + 67);
            } else {
                this.LJLJJI.add(interfaceC67707Qhj);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            InterfaceC67784Qiy interfaceC67784Qiy = (InterfaceC67784Qiy) message.obj;
            synchronized (this.LJLJLLL) {
                if (this.LJLJJL && this.LJLIL.isConnected() && this.LJLILLLLZI.contains(interfaceC67784Qiy)) {
                    interfaceC67784Qiy.H0(null);
                }
            }
            return true;
        }
        StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i);
        android.util.Log.wtf("GmsClientEvents", sb.toString(), new Exception());
        return false;
    }

    public C67762Qic(Looper looper, C30931Jh c30931Jh) {
        this.LJLIL = c30931Jh;
        this.LJLJLJ = new HandlerC67272Qai(looper, this);
    }
}
