package X;

import Y.ARunnableS47S0100000_11;
import android.content.Context;
import android.content.Intent;
import android.os.DeadObjectException;
import android.os.Message;
import android.os.Messenger;
import com.bytedance.common.utility.Logger;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.QOx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C66939QOx implements InterfaceC66869QMf {
    public final Context LIZ;
    public Messenger LIZIZ;
    public ServiceConnectionC66940QOy LIZLLL;
    public final /* synthetic */ C66870QMg LJIIIZ;
    public final LinkedBlockingDeque<Intent> LIZJ = new LinkedBlockingDeque<>();
    public boolean LJ = false;
    public final Object LJFF = new Object();
    public final ARunnableS47S0100000_11 LJI = new ARunnableS47S0100000_11(this, 104);
    public final ARunnableS47S0100000_11 LJII = new ARunnableS47S0100000_11(this, 105);
    public final AtomicInteger LJIIIIZZ = new AtomicInteger(0);

    @Override // X.InterfaceC66869QMf
    public final void LIZ() {
        if (this.LIZJ.size() > 0 && this.LIZIZ == null) {
            synchronized (this.LJFF) {
                if (this.LIZJ.size() > 0 && this.LIZIZ == null) {
                    LIZJ();
                }
            }
        }
    }

    public final void LIZLLL() {
        while (this.LIZJ.peek() != null) {
            try {
                Intent poll = this.LIZJ.poll();
                if (poll != null) {
                    try {
                        LJI(poll);
                    } catch (DeadObjectException unused) {
                        this.LIZIZ = null;
                        this.LIZJ.offerFirst(poll);
                    } catch (Throwable unused2) {
                    }
                } else {
                    return;
                }
            } catch (Throwable unused3) {
                return;
            }
        }
        synchronized (this) {
            LJFF();
            C66941QOz.LIZ().getClass();
            C66941QOz.LJLILLLLZI.postDelayed(this.LJII, TimeUnit.SECONDS.toMillis(10L));
        }
    }

    public final void LIZJ() {
        Logger.debug();
        try {
            C16880lQ.LLLL(this.LIZ, new Intent(this.LIZ, this.LJIIIZ.LIZIZ));
        } catch (Throwable unused) {
        }
        try {
            this.LIZLLL = new ServiceConnectionC66940QOy(this);
            C16880lQ.LLLJL(this.LIZ, new Intent(this.LIZ, this.LJIIIZ.LIZIZ), this.LIZLLL, 1);
            LJ();
            C66941QOz.LIZ().getClass();
            C66941QOz.LJLILLLLZI.postDelayed(this.LJI, TimeUnit.SECONDS.toMillis(7L));
            this.LJ = true;
        } catch (Throwable unused2) {
            LJ();
            this.LJ = false;
        }
    }

    public final void LJ() {
        C66941QOz.LIZ().getClass();
        C66941QOz.LJLILLLLZI.removeCallbacks(this.LJI);
    }

    public final void LJFF() {
        try {
            C66941QOz.LIZ().getClass();
            C66941QOz.LJLILLLLZI.removeCallbacks(this.LJII);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.InterfaceC66869QMf
    public final void LIZIZ(Intent intent) {
        if (Logger.debug()) {
            intent.putExtra("msg_count", this.LJIIIIZZ.addAndGet(1));
        }
        synchronized (this.LJFF) {
            LJFF();
            this.LIZJ.offer(intent);
            if (this.LIZIZ == null) {
                if (this.LJ) {
                } else {
                    LIZJ();
                }
            } else {
                LIZLLL();
            }
        }
    }

    public final void LJI(Intent intent) {
        Logger.debug();
        Messenger messenger = this.LIZIZ;
        Message message = new Message();
        message.what = 10123;
        message.getData().putParcelable("DATA_INTENT", intent);
        if (messenger == null) {
            return;
        }
        messenger.send(message);
    }

    public C66939QOx(C66870QMg c66870QMg, Context context) {
        this.LJIIIZ = c66870QMg;
        this.LIZ = context;
    }
}
