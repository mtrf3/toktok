package X;

import android.text.TextUtils;

/* renamed from: X.Qaq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67280Qaq extends AbstractC68049QnF {
    public char LIZJ;
    public long LIZLLL;
    public String LJ;
    public final C67281Qar LJFF;
    public final C67281Qar LJI;
    public final C67281Qar LJII;
    public final C67281Qar LJIIIIZZ;
    public final C67281Qar LJIIIZ;
    public final C67281Qar LJIIJ;
    public final C67281Qar LJIIJJI;
    public final C67281Qar LJIIL;
    public final C67281Qar LJIILIIL;

    public static C67282Qas LJIIIZ(String str) {
        if (str == null) {
            return null;
        }
        return new C67282Qas(str);
    }

    @Override // X.AbstractC68049QnF
    public final boolean LJI() {
        return false;
    }

    public final String LJIIL() {
        String str;
        synchronized (this) {
            if (this.LJ == null) {
                C68033Qmz c68033Qmz = this.LIZ;
                String str2 = c68033Qmz.LIZLLL;
                if (str2 != null) {
                    this.LJ = str2;
                } else {
                    c68033Qmz.LJI.LIZ.getClass();
                    this.LJ = "FA";
                }
            }
            QH7.LJIIIIZZ(this.LJ);
            str = this.LJ;
        }
        return str;
    }

    public C67280Qaq(C68033Qmz c68033Qmz) {
        super(c68033Qmz);
        this.LIZLLL = -1L;
        this.LJFF = new C67281Qar(this, 6, false, false);
        this.LJI = new C67281Qar(this, 6, true, false);
        this.LJII = new C67281Qar(this, 6, false, true);
        this.LJIIIIZZ = new C67281Qar(this, 5, false, false);
        this.LJIIIZ = new C67281Qar(this, 5, true, false);
        this.LJIIJ = new C67281Qar(this, 5, false, true);
        this.LJIIJJI = new C67281Qar(this, 4, false, false);
        this.LJIIL = new C67281Qar(this, 3, false, false);
        this.LJIILIIL = new C67281Qar(this, 2, false, false);
    }

    public static String LJIIJJI(Object obj, boolean z) {
        String th;
        String className;
        String str = "";
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            if (obj.toString().charAt(0) == '-') {
                str = "-";
            }
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            return str + Math.round(Math.pow(10.0d, valueOf.length() - 1)) + "..." + str + Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            if (z) {
                th = th2.getClass().getName();
            } else {
                th = th2.toString();
            }
            StringBuilder sb = new StringBuilder(th);
            String LJLLILLLL = C16880lQ.LJLLILLLL(C68033Qmz.class);
            if (TextUtils.isEmpty(LJLLILLLL)) {
                LJLLILLLL = "";
            } else {
                int lastIndexOf = LJLLILLLL.lastIndexOf(46);
                if (lastIndexOf != -1) {
                    LJLLILLLL = LJLLILLLL.substring(0, lastIndexOf);
                }
            }
            StackTraceElement[] stackTrace = th2.getStackTrace();
            int length = stackTrace.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                    if (TextUtils.isEmpty(className)) {
                        className = "";
                    } else {
                        int lastIndexOf2 = className.lastIndexOf(46);
                        if (lastIndexOf2 != -1) {
                            className = className.substring(0, lastIndexOf2);
                        }
                    }
                    if (className.equals(LJLLILLLL)) {
                        sb.append(": ");
                        sb.append(stackTraceElement);
                        break;
                    }
                }
                i++;
            }
            return sb.toString();
        }
        if (obj instanceof C67282Qas) {
            return ((C67282Qas) obj).LIZ;
        }
        if (z) {
            return "-";
        }
        return obj.toString();
    }

    public static String LJIIJ(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String LJIIJJI = LJIIJJI(obj, z);
        String LJIIJJI2 = LJIIJJI(obj2, z);
        String LJIIJJI3 = LJIIJJI(obj3, z);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(LJIIJJI)) {
            sb.append(str2);
            sb.append(LJIIJJI);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(LJIIJJI2)) {
            sb.append(str2);
            sb.append(LJIIJJI2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(LJIIJJI3)) {
            sb.append(str3);
            sb.append(LJIIJJI3);
        }
        return sb.toString();
    }

    public final void LJIILIIL(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        int i2 = i;
        if (!z && android.util.Log.isLoggable(LJIIL(), i2)) {
            LJIIJ(false, str, obj, obj2, obj3);
        }
        if (!z2 && i2 >= 5) {
            QH7.LJIIIIZZ(str);
            C67284Qau c67284Qau = this.LIZ.LJIIIZ;
            if (c67284Qau == null || !c67284Qau.LIZIZ) {
                return;
            }
            if (i2 >= 9) {
                i2 = 8;
            }
            c67284Qau.LJIILIIL(new RunnableC67278Qao(this, i2, str, obj, obj2, obj3));
        }
    }
}
