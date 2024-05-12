package Y;

import X.C16880lQ;
import X.C34K;
import X.C38576FCa;
import X.C68322mC;
import X.EnumC38440F6u;
import X.F6P;
import X.F6Q;
import X.F6U;
import android.net.Uri;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.common.jato.fastnative.FastNative;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class ARunnableS5S0310000_6 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        IHostPlugin iHostPlugin = (IHostPlugin) this.l0;
        F6Q f6q = new F6Q(((EnumC38440F6u) this.l1).getPackageName());
        EnumC38440F6u enumC38440F6u = (EnumC38440F6u) this.l1;
        if (enumC38440F6u.getDependPlugins().length != 0) {
            String[] dependPlugins = enumC38440F6u.getDependPlugins();
            ArrayList arrayList = new ArrayList(dependPlugins.length);
            for (String str : dependPlugins) {
                arrayList.add(str);
            }
            f6q.LJI = arrayList;
        }
        f6q.LIZIZ = this.z3;
        f6q.LIZJ = new F6U((EnumC38440F6u) this.l1, (WeakReference) this.l2);
        iHostPlugin.install(new F6P(f6q));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0074 A[Catch: Exception -> 0x0185, TryCatch #0 {Exception -> 0x0185, blocks: (B:12:0x0053, B:14:0x0074, B:15:0x007a, B:17:0x0096, B:19:0x00e5, B:21:0x00eb, B:23:0x00fd, B:24:0x0102, B:32:0x0121, B:34:0x0127, B:36:0x0130, B:37:0x0137, B:39:0x013d, B:41:0x0141, B:42:0x012d, B:43:0x0149, B:45:0x014f, B:47:0x0161, B:48:0x0172, B:50:0x0178, B:53:0x017d, B:58:0x0181, B:60:0x0155, B:62:0x015b, B:67:0x00a3, B:69:0x00ab, B:70:0x00da), top: B:11:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0096 A[Catch: Exception -> 0x0185, TryCatch #0 {Exception -> 0x0185, blocks: (B:12:0x0053, B:14:0x0074, B:15:0x007a, B:17:0x0096, B:19:0x00e5, B:21:0x00eb, B:23:0x00fd, B:24:0x0102, B:32:0x0121, B:34:0x0127, B:36:0x0130, B:37:0x0137, B:39:0x013d, B:41:0x0141, B:42:0x012d, B:43:0x0149, B:45:0x014f, B:47:0x0161, B:48:0x0172, B:50:0x0178, B:53:0x017d, B:58:0x0181, B:60:0x0155, B:62:0x015b, B:67:0x00a3, B:69:0x00ab, B:70:0x00da), top: B:11:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00fd A[Catch: Exception -> 0x0185, TryCatch #0 {Exception -> 0x0185, blocks: (B:12:0x0053, B:14:0x0074, B:15:0x007a, B:17:0x0096, B:19:0x00e5, B:21:0x00eb, B:23:0x00fd, B:24:0x0102, B:32:0x0121, B:34:0x0127, B:36:0x0130, B:37:0x0137, B:39:0x013d, B:41:0x0141, B:42:0x012d, B:43:0x0149, B:45:0x014f, B:47:0x0161, B:48:0x0172, B:50:0x0178, B:53:0x017d, B:58:0x0181, B:60:0x0155, B:62:0x015b, B:67:0x00a3, B:69:0x00ab, B:70:0x00da), top: B:11:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0121 A[Catch: Exception -> 0x0185, TryCatch #0 {Exception -> 0x0185, blocks: (B:12:0x0053, B:14:0x0074, B:15:0x007a, B:17:0x0096, B:19:0x00e5, B:21:0x00eb, B:23:0x00fd, B:24:0x0102, B:32:0x0121, B:34:0x0127, B:36:0x0130, B:37:0x0137, B:39:0x013d, B:41:0x0141, B:42:0x012d, B:43:0x0149, B:45:0x014f, B:47:0x0161, B:48:0x0172, B:50:0x0178, B:53:0x017d, B:58:0x0181, B:60:0x0155, B:62:0x015b, B:67:0x00a3, B:69:0x00ab, B:70:0x00da), top: B:11:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0149 A[Catch: Exception -> 0x0185, TryCatch #0 {Exception -> 0x0185, blocks: (B:12:0x0053, B:14:0x0074, B:15:0x007a, B:17:0x0096, B:19:0x00e5, B:21:0x00eb, B:23:0x00fd, B:24:0x0102, B:32:0x0121, B:34:0x0127, B:36:0x0130, B:37:0x0137, B:39:0x013d, B:41:0x0141, B:42:0x012d, B:43:0x0149, B:45:0x014f, B:47:0x0161, B:48:0x0172, B:50:0x0178, B:53:0x017d, B:58:0x0181, B:60:0x0155, B:62:0x015b, B:67:0x00a3, B:69:0x00ab, B:70:0x00da), top: B:11:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015b A[Catch: Exception -> 0x0185, TryCatch #0 {Exception -> 0x0185, blocks: (B:12:0x0053, B:14:0x0074, B:15:0x007a, B:17:0x0096, B:19:0x00e5, B:21:0x00eb, B:23:0x00fd, B:24:0x0102, B:32:0x0121, B:34:0x0127, B:36:0x0130, B:37:0x0137, B:39:0x013d, B:41:0x0141, B:42:0x012d, B:43:0x0149, B:45:0x014f, B:47:0x0161, B:48:0x0172, B:50:0x0178, B:53:0x017d, B:58:0x0181, B:60:0x0155, B:62:0x015b, B:67:0x00a3, B:69:0x00ab, B:70:0x00da), top: B:11:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a3 A[Catch: Exception -> 0x0185, TryCatch #0 {Exception -> 0x0185, blocks: (B:12:0x0053, B:14:0x0074, B:15:0x007a, B:17:0x0096, B:19:0x00e5, B:21:0x00eb, B:23:0x00fd, B:24:0x0102, B:32:0x0121, B:34:0x0127, B:36:0x0130, B:37:0x0137, B:39:0x013d, B:41:0x0141, B:42:0x012d, B:43:0x0149, B:45:0x014f, B:47:0x0161, B:48:0x0172, B:50:0x0178, B:53:0x017d, B:58:0x0181, B:60:0x0155, B:62:0x015b, B:67:0x00a3, B:69:0x00ab, B:70:0x00da), top: B:11:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$1() {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS5S0310000_6.LIZ$1():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006d A[Catch: Exception -> 0x016e, TryCatch #0 {Exception -> 0x016e, blocks: (B:12:0x0053, B:14:0x006d, B:16:0x0091, B:18:0x00dd, B:20:0x00e3, B:22:0x00f5, B:23:0x00f9, B:25:0x010b, B:27:0x0115, B:28:0x0119, B:31:0x0130, B:33:0x013a, B:34:0x013e, B:37:0x0167, B:38:0x0147, B:39:0x0155, B:41:0x015c, B:43:0x0160, B:45:0x0120, B:47:0x0126, B:51:0x009e, B:53:0x00a6, B:54:0x00cc, B:55:0x016a, B:56:0x016d), top: B:11:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016a A[Catch: Exception -> 0x016e, TryCatch #0 {Exception -> 0x016e, blocks: (B:12:0x0053, B:14:0x006d, B:16:0x0091, B:18:0x00dd, B:20:0x00e3, B:22:0x00f5, B:23:0x00f9, B:25:0x010b, B:27:0x0115, B:28:0x0119, B:31:0x0130, B:33:0x013a, B:34:0x013e, B:37:0x0167, B:38:0x0147, B:39:0x0155, B:41:0x015c, B:43:0x0160, B:45:0x0120, B:47:0x0126, B:51:0x009e, B:53:0x00a6, B:54:0x00cc, B:55:0x016a, B:56:0x016d), top: B:11:0x0053 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$2() {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS5S0310000_6.LIZ$2():void");
    }

    public static final void run$0(ARunnableS5S0310000_6 aRunnableS5S0310000_6) {
        boolean LIZ;
        try {
            aRunnableS5S0310000_6.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS5S0310000_6 aRunnableS5S0310000_6) {
        boolean LIZ;
        try {
            aRunnableS5S0310000_6.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$2(ARunnableS5S0310000_6 aRunnableS5S0310000_6) {
        boolean LIZ;
        try {
            C38576FCa.LIZ((Uri) aRunnableS5S0310000_6.l0, ((C34K) aRunnableS5S0310000_6.l1).element, (String) ((C68322mC) aRunnableS5S0310000_6.l2).element, aRunnableS5S0310000_6.z3);
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$3(ARunnableS5S0310000_6 aRunnableS5S0310000_6) {
        boolean LIZ;
        try {
            C38576FCa.LIZ((Uri) aRunnableS5S0310000_6.l0, ((C34K) aRunnableS5S0310000_6.l1).element, (String) ((C68322mC) aRunnableS5S0310000_6.l2).element, aRunnableS5S0310000_6.z3);
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$4(ARunnableS5S0310000_6 aRunnableS5S0310000_6) {
        boolean LIZ;
        try {
            C38576FCa.LIZ((Uri) aRunnableS5S0310000_6.l0, ((C34K) aRunnableS5S0310000_6.l1).element, (String) ((C68322mC) aRunnableS5S0310000_6.l2).element, aRunnableS5S0310000_6.z3);
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$5(ARunnableS5S0310000_6 aRunnableS5S0310000_6) {
        boolean LIZ;
        try {
            C38576FCa.LIZ((Uri) aRunnableS5S0310000_6.l0, ((C34K) aRunnableS5S0310000_6.l1).element, (String) ((C68322mC) aRunnableS5S0310000_6.l2).element, aRunnableS5S0310000_6.z3);
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$6(ARunnableS5S0310000_6 aRunnableS5S0310000_6) {
        boolean LIZ;
        try {
            C38576FCa.LIZ((Uri) aRunnableS5S0310000_6.l0, ((C34K) aRunnableS5S0310000_6.l1).element, (String) ((C68322mC) aRunnableS5S0310000_6.l2).element, aRunnableS5S0310000_6.z3);
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$7(ARunnableS5S0310000_6 aRunnableS5S0310000_6) {
        boolean LIZ;
        try {
            C38576FCa.LIZ((Uri) aRunnableS5S0310000_6.l0, ((C34K) aRunnableS5S0310000_6.l1).element, (String) ((C68322mC) aRunnableS5S0310000_6.l2).element, aRunnableS5S0310000_6.z3);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS5S0310000_6 aRunnableS5S0310000_6) {
        boolean LIZ;
        try {
            String[] strArr = (String[]) aRunnableS5S0310000_6.l0;
            String[] strArr2 = (String[]) aRunnableS5S0310000_6.l1;
            String[] strArr3 = (String[]) aRunnableS5S0310000_6.l2;
            boolean z = aRunnableS5S0310000_6.z3;
            Method[] methodsNative = FastNative.getMethodsNative(strArr, strArr2, strArr3);
            int i = 0;
            while (methodsNative != null) {
                if (methodsNative.length <= 0 || i == 3) {
                    return;
                }
                i++;
                methodsNative = FastNative.nativeModifyFastNativeInner(methodsNative, z);
                try {
                    Thread.sleep(10000L);
                } catch (InterruptedException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS5S0310000_6 aRunnableS5S0310000_6) {
        boolean LIZ;
        try {
            aRunnableS5S0310000_6.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS5S0310000_6(String[] strArr, String[] strArr2, String[] strArr3, int i) {
        this.$t = i;
        this.l0 = strArr;
        this.l1 = strArr2;
        this.l2 = strArr3;
        this.z3 = false;
    }

    public ARunnableS5S0310000_6(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.z3 = z;
    }
}
