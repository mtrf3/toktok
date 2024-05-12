package X;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.ERf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class HandlerThreadC36423ERf extends HandlerThread {
    public static volatile HandlerThreadC36423ERf LJLJJL;
    public Handler LJLIL;
    public final Object LJLILLLLZI;
    public volatile boolean LJLJI;
    public final LinkedList<Runnable> LJLJJI;

    public HandlerThreadC36423ERf() {
        super("TeaThread");
        this.LJLILLLLZI = new Object();
        this.LJLJI = false;
        this.LJLJJI = new LinkedList<>();
    }

    public static HandlerThreadC36423ERf LIZJ() {
        if (LJLJJL == null) {
            synchronized (HandlerThreadC36423ERf.class) {
                if (LJLJJL == null) {
                    LJLJJL = new HandlerThreadC36423ERf();
                    LJLJJL.start();
                }
            }
        }
        return LJLJJL;
    }

    public final Handler LIZLLL() {
        if (this.LJLIL == null) {
            synchronized (this) {
                if (this.LJLIL == null) {
                    this.LJLIL = new Handler(getLooper());
                }
            }
        }
        return this.LJLIL;
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        super.onLooperPrepared();
        synchronized (this.LJLILLLLZI) {
            this.LJLJI = true;
            ArrayList arrayList = new ArrayList(this.LJLJJI);
            this.LJLJJI.clear();
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    LJ((Runnable) it.next());
                }
            }
        }
    }

    public final void LIZ(Runnable runnable) {
        LIZIZ(0L, runnable);
    }

    public final void LJ(Runnable runnable) {
        if (runnable != null) {
            LIZLLL().post(runnable);
        }
    }

    public final void LIZIZ(long j, Runnable runnable) {
        if (this.LJLJI) {
            LIZLLL().postDelayed(runnable, j);
            return;
        }
        synchronized (this.LJLILLLLZI) {
            if (this.LJLJI) {
                LIZLLL().postDelayed(runnable, j);
            } else {
                if (this.LJLJJI.size() > 1000) {
                    this.LJLJJI.poll();
                }
                this.LJLJJI.add(runnable);
            }
        }
    }
}
