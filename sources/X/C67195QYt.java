package X;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Base64;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.QYt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67195QYt {
    public static final Object LJIIIZ = new Object();
    public static final E1U LJIIJ = new E1U();
    public static final C1HQ LJIIJJI = new C1HQ();
    public final Context LIZ;
    public final String LIZIZ;
    public final QH4 LIZJ;
    public final C67200QYy LIZLLL;
    public final QZ0<PMS> LJI;
    public final C6Y7<C67183QYh> LJII;
    public final AtomicBoolean LJ = new AtomicBoolean(false);
    public final AtomicBoolean LJFF = new AtomicBoolean();
    public final List<QZ7> LJIIIIZZ = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public static C67195QYt LIZIZ() {
        C67195QYt c67195QYt;
        synchronized (LJIIIZ) {
            c67195QYt = (C67195QYt) LJIIJJI.getOrDefault("[DEFAULT]", null);
            if (c67195QYt == null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Default FirebaseApp is not initialized in this process ");
                LIZ.append(C38768FJk.LIZ());
                LIZ.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                throw new IllegalStateException(X1D.LIZIZ(LIZ));
            }
        }
        return c67195QYt;
    }

    public final void LIZ() {
        QH7.LJIIJ("FirebaseApp was deleted", !this.LJFF.get());
    }

    public final void LIZLLL() {
        boolean z;
        HashMap hashMap;
        Context context = this.LIZ;
        if (Build.VERSION.SDK_INT >= 24) {
            z = C10730bV.LIZ(context);
        } else {
            z = true;
        }
        if (!z) {
            Context context2 = this.LIZ;
            AtomicReference<QBT> atomicReference = QBT.LIZIZ;
            if (atomicReference.get() == null) {
                QBT qbt = new QBT(context2);
                while (!atomicReference.compareAndSet(null, qbt)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                C16880lQ.LJJLIIIJILLIZJL(qbt, context2, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        C67200QYy c67200QYy = this.LIZLLL;
        LIZ();
        boolean equals = "[DEFAULT]".equals(this.LIZIZ);
        AtomicReference<Boolean> atomicReference2 = c67200QYy.LJFF;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (atomicReference2.compareAndSet(null, valueOf)) {
                synchronized (c67200QYy) {
                    hashMap = new HashMap(c67200QYy.LIZ);
                }
                c67200QYy.LJIJI(hashMap, equals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        this.LJII.get().LIZJ();
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        C64362PNu c64362PNu = new C64362PNu(this);
        c64362PNu.LIZ(this.LIZIZ, "name");
        c64362PNu.LIZ(this.LIZJ, "options");
        return c64362PNu.toString();
    }

    public final String LIZJ() {
        String encodeToString;
        StringBuilder LIZ = X1D.LIZ();
        LIZ();
        byte[] bytes = this.LIZIZ.getBytes(Charset.defaultCharset());
        String str = null;
        if (bytes == null) {
            encodeToString = null;
        } else {
            encodeToString = Base64.encodeToString(bytes, 11);
        }
        LIZ.append(encodeToString);
        LIZ.append("+");
        LIZ();
        byte[] bytes2 = this.LIZJ.LIZIZ.getBytes(Charset.defaultCharset());
        if (bytes2 != null) {
            str = Base64.encodeToString(bytes2, 11);
        }
        LIZ.append(str);
        return X1D.LIZIZ(LIZ);
    }

    public final boolean LJI() {
        boolean z;
        LIZ();
        PMS pms = this.LJI.get();
        synchronized (pms) {
            z = pms.LIZIZ;
        }
        return z;
    }

    public static void LJFF(Context context) {
        synchronized (LJIIIZ) {
            if (LJIIJJI.containsKey("[DEFAULT]")) {
                LIZIZ();
                return;
            }
            QH4 LIZ = QH4.LIZ(context);
            if (LIZ == null) {
                return;
            }
            LJ(context, LIZ);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C67195QYt)) {
            return false;
        }
        String str = this.LIZIZ;
        C67195QYt c67195QYt = (C67195QYt) obj;
        c67195QYt.LIZ();
        return str.equals(c67195QYt.LIZIZ);
    }

    public static C67195QYt LJ(Context context, QH4 qh4) {
        C67195QYt c67195QYt;
        if (C16880lQ.LLLLL(context) instanceof Application) {
            Application application = (Application) C16880lQ.LLLLL(context);
            AtomicReference<C67196QYu> atomicReference = C67196QYu.LIZ;
            if (atomicReference.get() == null) {
                C67196QYu c67196QYu = new C67196QYu();
                while (true) {
                    if (atomicReference.compareAndSet(null, c67196QYu)) {
                        ComponentCallbacks2C67197QYv.LIZJ(application);
                        ComponentCallbacks2C67197QYv.LJLJJL.LIZ(c67196QYu);
                        break;
                    }
                    if (atomicReference.get() != null) {
                        break;
                    }
                }
            }
        }
        if (C16880lQ.LLLLL(context) != null) {
            context = C16880lQ.LLLLL(context);
        }
        synchronized (LJIIIZ) {
            C1HQ c1hq = LJIIJJI;
            boolean containsKey = true ^ c1hq.containsKey("[DEFAULT]");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("FirebaseApp name ");
            LIZ.append("[DEFAULT]");
            LIZ.append(" already exists!");
            QH7.LJIIJ(X1D.LIZIZ(LIZ), containsKey);
            QH7.LJIIIZ(context, "Application context cannot be null.");
            c67195QYt = new C67195QYt(context, qh4, "[DEFAULT]");
            c1hq.put("[DEFAULT]", c67195QYt);
        }
        c67195QYt.LIZLLL();
        return c67195QYt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x008d A[LOOP:0: B:8:0x0087->B:10:0x008d, LOOP_END] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C67195QYt(final android.content.Context r9, X.QH4 r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67195QYt.<init>(android.content.Context, X.QH4, java.lang.String):void");
    }
}
