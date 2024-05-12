package X;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.ERk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class HandlerThreadC36428ERk extends HandlerThread {
    public static volatile HandlerThreadC36428ERk LJLJJL;
    public volatile Handler LJLIL;
    public final Object LJLILLLLZI;
    public volatile boolean LJLJI;
    public final LinkedList<Runnable> LJLJJI;

    public HandlerThreadC36428ERk() {
        super("TeaThread");
        this.LJLILLLLZI = new Object();
        this.LJLJI = false;
        this.LJLJJI = new LinkedList<>();
    }

    public static HandlerThreadC36428ERk LIZIZ() {
        if (LJLJJL == null) {
            synchronized (HandlerThreadC36428ERk.class) {
                if (LJLJJL == null) {
                    LJLJJL = new HandlerThreadC36428ERk();
                    LJLJJL.start();
                }
            }
        }
        return LJLJJL;
    }

    public final Handler LIZJ() {
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
                    Runnable runnable = (Runnable) it.next();
                    if (runnable != null) {
                        LIZJ().post(runnable);
                    }
                }
            }
        }
    }

    public final void LIZ(Runnable runnable) {
        if (this.LJLJI) {
            LIZJ().postDelayed(runnable, 0L);
            return;
        }
        synchronized (this.LJLILLLLZI) {
            if (this.LJLJI) {
                LIZJ().postDelayed(runnable, 0L);
            } else {
                if (this.LJLJJI.size() > 1000) {
                    this.LJLJJI.poll();
                }
                this.LJLJJI.add(runnable);
            }
        }
    }
}
