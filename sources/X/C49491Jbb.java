package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;

/* renamed from: X.Jbb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49491Jbb {
    public static volatile AtomicInteger LJIIIZ = new AtomicInteger(0);
    public final ViewGroup LIZ;
    public final InterfaceC49498Jbi LIZIZ;
    public final C49497Jbh LIZJ;
    public final C49495Jbf LIZLLL;
    public final C49493Jbd LJ;
    public final C49494Jbe LJFF;
    public final C49492Jbc LJI;
    public final C49499Jbj LJII;
    public final HandlerThread LJIIIIZZ;

    public final RecyclerView.ViewHolder LIZ() {
        RecyclerView.ViewHolder viewHolder;
        C49492Jbc c49492Jbc = this.LJI;
        if (((ConcurrentLinkedQueue) c49492Jbc.LIZ).size() <= 0 || (viewHolder = (RecyclerView.ViewHolder) ((ConcurrentLinkedQueue) c49492Jbc.LIZ).poll()) == null) {
            viewHolder = this.LJI.LIZ();
        }
        o.LJIIIIZZ(viewHolder, "viewHolder");
        return viewHolder;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, android.os.Handler] */
    public C49491Jbb(ViewGroup viewGroup, InterfaceC49498Jbi interfaceC49498Jbi) {
        this.LIZ = viewGroup;
        this.LIZIZ = interfaceC49498Jbi;
        Handler handler = new Handler(C16880lQ.LLJJJJ());
        HandlerThread handlerThread = new HandlerThread("async-prefetch");
        this.LJIIIIZZ = handlerThread;
        handlerThread.start();
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = new Handler(handlerThread.getLooper());
        this.LIZLLL = new C49495Jbf(this, handler);
        this.LJ = new C49493Jbd(this, handler);
        this.LJFF = new C49494Jbe(c68322mC, this);
        this.LIZJ = new C49497Jbh(this, handler);
        this.LJI = new C49492Jbc(c68322mC, this);
        this.LJII = new C49499Jbj(this, handler);
    }
}
