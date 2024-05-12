package X;

import defpackage.b1;

/* loaded from: classes12.dex */
public final class Q6T {
    public static Q6T LIZIZ;
    public final int LIZ;

    public static synchronized Q6T LIZIZ() {
        Q6T q6t;
        synchronized (Q6T.class) {
            if (LIZIZ == null) {
                LIZIZ = new Q6T();
            }
            q6t = LIZIZ;
        }
        return q6t;
    }

    public Q6T() {
        int i = 7;
        while (Q6U.LIZ.LIZ(i) && i - 1 >= 2) {
        }
        this.LIZ = i + 1;
    }

    public static void LIZ(String str, Object... objArr) {
        LIZIZ().LIZJ(3, str, null, objArr);
    }

    public static void LIZLLL(String str, Object... objArr) {
        LIZIZ().LIZJ(5, str, null, objArr);
    }

    public final void LIZJ(int i, String str, Throwable th, Object... objArr) {
        if (this.LIZ > i) {
            return;
        }
        if (objArr.length >= 1) {
            str = C16880lQ.LLLZ(str, objArr);
        }
        if (th != null) {
            StringBuilder LIZJ = b1.LIZJ(str, "\n");
            LIZJ.append(android.util.Log.getStackTraceString(th));
            X1D.LIZIZ(LIZJ);
        }
    }
}
