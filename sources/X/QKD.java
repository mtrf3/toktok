package X;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.deviceregister.DeviceRegisterManager;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public abstract class QKD {
    public static QL3 LJIJ;
    public static volatile long LJJI;
    public volatile boolean LIZIZ;
    public int LIZJ;
    public volatile int LIZLLL;
    public final JFL LJ;
    public final Context LJFF;
    public final SharedPreferences LJI;
    public JSONObject LJII;
    public String LJIIJ;
    public String LJIIJJI;
    public QKA LJIIL;
    public volatile QJN LJIILIIL;
    public QKF LJIILJJIL;
    public final boolean LJIILL;
    public QKH LJIILLIIL;
    public static final Object LJIIZILJ = new Object();
    public static final Bundle LJIJI = new Bundle();
    public static volatile boolean LJIJJ = false;
    public static volatile boolean LJIJJLI = false;
    public static volatile boolean LJIL = false;
    public static long LJJ = 0;
    public static final List<WeakReference<QJ8>> LJJIFFI = FII.LIZ();
    public static final ThreadLocal<Boolean> LJJII = new ThreadLocal<>();
    public final Object LIZ = new Object();
    public long LJIIIIZZ = 0;
    public long LJIIIZ = 0;

    public final void LIZIZ() {
        if (this.LJIILJJIL == null) {
            this.LJIILJJIL = new QKF(this.LJFF);
        }
        QKH qkh = new QKH(this);
        this.LJIILLIIL = qkh;
        QKF qkf = this.LJIILJJIL;
        synchronized (qkf) {
            qkf.LIZ.add(new WeakReference<>(qkh));
            if (qkf.LIZIZ.compareAndSet(false, true)) {
                try {
                    C16880lQ.LJJLIIIJILLIZJL(new C41789Gaf(qkf), qkf.LIZJ, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
    }

    public final void LIZJ() {
        synchronized (this.LIZ) {
            this.LIZ.notifyAll();
        }
    }

    public QKD(Context context, boolean z) {
        boolean z2;
        this.LJFF = context;
        this.LJ = QKE.LIZ(context);
        this.LJI = C48841JEv.LJIIJ(context);
        this.LIZIZ = z;
        if (DeviceRegisterManager.getRetryCount() != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJIILL = z2;
    }

    public static void LIZ(boolean z, boolean z2) {
        QJ8 qj8;
        int size = LJJIFFI.size();
        for (int i = 0; i < size; i++) {
            Reference reference = (Reference) ListProtector.get(LJJIFFI, i);
            if (reference != null && (qj8 = (QJ8) reference.get()) != null) {
                try {
                    qj8.LIZJ(z, z2);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
    }

    public static void LIZLLL(long j, Context context) {
        String str;
        long j2;
        if (LJJII.get() != null) {
            return;
        }
        String str2 = null;
        try {
            str = ((JFK) QKE.LIZ(context)).LIZJ();
        } catch (Exception unused) {
            str = null;
        }
        if (!C38354F3m.LJ(str)) {
            return;
        }
        Object obj = LJIIZILJ;
        synchronized (obj) {
            if (LJIJJ) {
                return;
            }
            try {
                str2 = ((JFK) QKE.LIZ(context)).LIZJ();
            } catch (Exception unused2) {
            }
            if (!C38354F3m.LJ(str2)) {
                return;
            }
            if (LJIJJLI) {
                j2 = 4000;
            } else {
                j2 = 1500;
            }
            if (j != -1) {
                if (j > 120000) {
                    j = 120000;
                } else if (j < 0) {
                    j = 1000;
                }
                j2 = j;
            }
            try {
                obj.wait(j2);
            } catch (Exception unused3) {
            }
            LJIJJ = true;
        }
    }
}
