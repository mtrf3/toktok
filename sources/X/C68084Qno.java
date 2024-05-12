package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Qno, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68084Qno extends AbstractC68050QnG {
    public volatile C68132Qoa LIZJ;
    public volatile C68132Qoa LIZLLL;
    public C68132Qoa LJ;
    public final java.util.Map LJFF;
    public Activity LJI;
    public volatile boolean LJII;
    public volatile C68132Qoa LJIIIIZZ;
    public C68132Qoa LJIIIZ;
    public boolean LJIIJ;
    public final Object LJIIJJI;
    public String LJIIL;

    @Override // X.AbstractC68050QnG
    public final boolean LJIIIIZZ() {
        return false;
    }

    public C68084Qno(C68033Qmz c68033Qmz) {
        super(c68033Qmz);
        this.LJIIJJI = new Object();
        this.LJFF = new ConcurrentHashMap();
    }

    public final C68132Qoa LJIIL(boolean z) {
        LJI();
        LJFF();
        if (!z) {
            return this.LJ;
        }
        C68132Qoa c68132Qoa = this.LJ;
        if (c68132Qoa != null) {
            return c68132Qoa;
        }
        return this.LJIIIZ;
    }

    public final String LJIILIIL(Class cls) {
        String str;
        String LJLLILLLL = C16880lQ.LJLLILLLL(cls);
        if (LJLLILLLL == null) {
            return "Activity";
        }
        String[] split = LJLLILLLL.split("\\.");
        int length = split.length;
        if (length > 0) {
            str = split[length - 1];
        } else {
            str = "";
        }
        if (str.length() > 100) {
            return str.substring(0, 100);
        }
        return str;
    }

    public final C68132Qoa LJIILLIIL(Activity activity) {
        QH7.LJIIIIZZ(activity);
        C68132Qoa c68132Qoa = (C68132Qoa) ((ConcurrentHashMap) this.LJFF).get(activity);
        if (c68132Qoa == null) {
            c68132Qoa = new C68132Qoa(null, LJIILIIL(activity.getClass()), this.LIZ.LJIL().LJJLIIIJ());
            ((ConcurrentHashMap) this.LJFF).put(activity, c68132Qoa);
        }
        if (this.LJIIIIZZ != null) {
            return this.LJIIIIZZ;
        }
        return c68132Qoa;
    }

    public final void LJIILJJIL(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.LIZ.LJI.LJIILL() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        ((ConcurrentHashMap) this.LJFF).put(activity, new C68132Qoa(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void LJIILL(String str, C68132Qoa c68132Qoa) {
        LJFF();
        synchronized (this) {
            String str2 = this.LJIIL;
            if (str2 == null || str2.equals(str) || c68132Qoa != null) {
                this.LJIIL = str;
            }
        }
    }

    public final void LJIIIZ(Activity activity, C68132Qoa c68132Qoa, boolean z) {
        C68132Qoa c68132Qoa2;
        C68132Qoa c68132Qoa3;
        String str;
        if (this.LIZJ == null) {
            c68132Qoa2 = this.LIZLLL;
        } else {
            c68132Qoa2 = this.LIZJ;
        }
        if (c68132Qoa.LIZIZ == null) {
            if (activity != null) {
                str = LJIILIIL(activity.getClass());
            } else {
                str = null;
            }
            String str2 = c68132Qoa.LIZ;
            c68132Qoa3 = new C68132Qoa(c68132Qoa.LIZJ, c68132Qoa.LJFF, c68132Qoa.LJ, str2, str);
        } else {
            c68132Qoa3 = c68132Qoa;
        }
        this.LIZLLL = this.LIZJ;
        this.LIZJ = c68132Qoa3;
        this.LIZ.LJIILIIL.getClass();
        this.LIZ.LIZIZ().LJIILIIL(new RunnableC68126QoU(this, c68132Qoa3, c68132Qoa2, SystemClock.elapsedRealtime(), z));
    }

    public final void LJIIJJI(C68132Qoa c68132Qoa, boolean z, long j) {
        boolean z2;
        C68089Qnt LJIIL = this.LIZ.LJIIL();
        this.LIZ.LJIILIIL.getClass();
        LJIIL.LJIIIIZZ(SystemClock.elapsedRealtime());
        if (c68132Qoa != null && c68132Qoa.LIZLLL) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.LIZ.LJIJJLI().LJ.LIZ(j, z2, z) && c68132Qoa != null) {
            c68132Qoa.LIZLLL = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a5, code lost:
    
        if (r15 == 0) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(X.C68132Qoa r21, X.C68132Qoa r22, long r23, boolean r25, android.os.Bundle r26) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68084Qno.LJIIJ(X.Qoa, X.Qoa, long, boolean, android.os.Bundle):void");
    }
}
