package X;

import android.util.SparseArray;

/* renamed from: X.PxP, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC66131PxP {
    public final SparseArray<C66152Pxk> LIZ = new SparseArray<>();

    public abstract int[] LIZLLL();

    public abstract void LJFF(C66120PxE c66120PxE);

    static {
        C16880lQ.LJLLJ(AbstractC66131PxP.class);
    }

    public void LJ(C66120PxE c66120PxE, Throwable th) {
        C66152Pxk c66152Pxk = this.LIZ.get(c66120PxE.LJLJI);
        String LJLLILLLL = C16880lQ.LJLLILLLL(getClass());
        String str = c66120PxE.LJLJJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZJ(LJLLILLLL, str, JBR.LJFF(LIZ, c66152Pxk.LIZLLL, ".kt", LIZ), th);
        c66120PxE.LIZLLL(th);
        LJFF(c66120PxE);
    }

    public static void LIZJ(String str, String str2, String str3, Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        StackTraceElement stackTraceElement = new StackTraceElement(str, str2, str3, 0);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[stackTrace.length + 1];
        stackTraceElementArr[0] = stackTraceElement;
        System.arraycopy(stackTrace, 0, stackTraceElementArr, 1, stackTrace.length);
        th.setStackTrace(stackTraceElementArr);
    }
}
