package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import defpackage.i0;
import java.net.MalformedURLException;
import java.net.URLConnection;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.QcM, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67374QcM implements InterfaceC67412Qcy {
    public final C67482Qe6 LIZ;
    public final ConnectivityManager LIZIZ;
    public final Context LIZJ;
    public final java.net.URL LIZLLL;
    public final InterfaceC67370QcI LJ;
    public final InterfaceC67370QcI LJFF;
    public final int LJI;

    public static URLConnection LIZJ(java.net.URL url) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "3864362938623667276"));
        return LIZJ.LIZ ? (URLConnection) LIZJ.LIZIZ : url.openConnection();
    }

    public static java.net.URL LIZLLL(String str) {
        try {
            return new java.net.URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(i0.LJFF("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x04e1, code lost:
    
        r1 = r7.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x04e5, code lost:
    
        if (r1 != 200) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x04f0, code lost:
    
        return new X.C67389Qcb(X.EnumC67392Qce.OK, r7.LIZJ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x04f3, code lost:
    
        if (r1 >= 500) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x04f7, code lost:
    
        if (r1 != 404) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x04fc, code lost:
    
        if (r1 != 400) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0507, code lost:
    
        return new X.C67389Qcb(X.EnumC67392Qce.INVALID_PAYLOAD, -1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0511, code lost:
    
        return new X.C67389Qcb(X.EnumC67392Qce.FATAL_ERROR, -1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x051b, code lost:
    
        return new X.C67389Qcb(X.EnumC67392Qce.TRANSIENT_ERROR, -1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0264, code lost:
    
        r2.LJFF = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0268, code lost:
    
        if (r2.LIZ != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x026a, code lost:
    
        r5 = defpackage.i0.LJFF("", " requestTimeMs");
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0272, code lost:
    
        if (r2.LIZIZ != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0274, code lost:
    
        r5 = defpackage.i0.LJFF(r5, " requestUptimeMs");
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x027e, code lost:
    
        if (r5.isEmpty() == false) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02bf, code lost:
    
        throw new java.lang.IllegalStateException(defpackage.i0.LJFF("Missing required properties:", r5));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0453 A[Catch: IOException -> 0x051d, TryCatch #14 {IOException -> 0x051d, blocks: (B:79:0x02e9, B:80:0x02f4, B:82:0x0307, B:84:0x046b, B:86:0x0482, B:88:0x0486, B:90:0x048c, B:92:0x0313, B:94:0x0353, B:110:0x03a0, B:119:0x03c4, B:120:0x044f, B:122:0x0453, B:127:0x04e1, B:129:0x04e7, B:138:0x04fe, B:140:0x0508, B:142:0x0512, B:145:0x03ce, B:156:0x044c, B:170:0x04e0, B:175:0x04dd, B:176:0x0401, B:203:0x0430, B:202:0x043e, B:204:0x0494, B:206:0x0498, B:207:0x04a0, B:209:0x04a4, B:212:0x051c, B:213:0x04a8, B:215:0x04b0, B:216:0x04b9, B:218:0x04bd, B:219:0x030f, B:147:0x03d2, B:149:0x03dc, B:153:0x03fb, B:160:0x04d4, B:166:0x04d1, B:151:0x03e3, B:163:0x04cc, B:172:0x04d8, B:96:0x0358, B:109:0x039d, B:179:0x042f, B:186:0x042c), top: B:78:0x02e9, inners: #9, #13, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04e1 A[EDGE_INSN: B:144:0x04e1->B:127:0x04e1 BREAK  A[LOOP:3: B:80:0x02f4->B:124:0x0468], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // X.InterfaceC67412Qcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C67389Qcb LIZ(X.C67382QcU r32) {
        /*
            Method dump skipped, instructions count: 1322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67374QcM.LIZ(X.QcU):X.Qcb");
    }

    @Override // X.InterfaceC67412Qcy
    public final C67376QcO LIZIZ(AbstractC67375QcN abstractC67375QcN) {
        int type;
        int subtype;
        String simOperator;
        NetworkInfo LJJLI = C16880lQ.LJJLI(this.LIZIZ);
        C67362QcA LJIIIIZZ = abstractC67375QcN.LJIIIIZZ();
        int i = Build.VERSION.SDK_INT;
        java.util.Map<String, String> map = LJIIIIZZ.LJFF;
        if (map != null) {
            map.put("sdk-version", String.valueOf(i));
            LJIIIIZZ.LIZ("model", Build.MODEL);
            LJIIIIZZ.LIZ("hardware", Build.HARDWARE);
            LJIIIIZZ.LIZ("device", Build.DEVICE);
            LJIIIIZZ.LIZ("product", Build.PRODUCT);
            LJIIIIZZ.LIZ("os-uild", Build.ID);
            LJIIIIZZ.LIZ("manufacturer", Build.MANUFACTURER);
            LJIIIIZZ.LIZ("fingerprint", Build.FINGERPRINT);
            Calendar.getInstance();
            long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
            java.util.Map<String, String> map2 = LJIIIIZZ.LJFF;
            if (map2 != null) {
                map2.put("tz-offset", String.valueOf(offset));
                if (LJJLI == null) {
                    type = EnumC48209Iw1.NONE.getValue();
                } else {
                    type = LJJLI.getType();
                }
                java.util.Map<String, String> map3 = LJIIIIZZ.LJFF;
                if (map3 != null) {
                    map3.put("net-type", String.valueOf(type));
                    int i2 = -1;
                    if (LJJLI == null) {
                        subtype = EnumC47968Is8.UNKNOWN_MOBILE_SUBTYPE.getValue();
                    } else {
                        subtype = LJJLI.getSubtype();
                        if (subtype == -1) {
                            subtype = EnumC47968Is8.COMBINED.getValue();
                        } else if (EnumC47968Is8.forNumber(subtype) == null) {
                            subtype = 0;
                        }
                    }
                    java.util.Map<String, String> map4 = LJIIIIZZ.LJFF;
                    if (map4 != null) {
                        map4.put("mobile-subtype", String.valueOf(subtype));
                        LJIIIIZZ.LIZ("country", Locale.getDefault().getCountry());
                        LJIIIIZZ.LIZ("locale", Locale.getDefault().getLanguage());
                        TelephonyManager telephonyManager = (TelephonyManager) C16880lQ.LLILL(this.LIZJ, "phone");
                        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(100917, "android/telephony/TelephonyManager", "getSimOperator", telephonyManager, new Object[0], "java.lang.String", new C65300Pk0(false, "()Ljava/lang/String;", "3864362938623667276"));
                        if (LIZJ.LIZ) {
                            simOperator = (String) LIZJ.LIZIZ;
                        } else {
                            simOperator = telephonyManager.getSimOperator();
                        }
                        LJIIIIZZ.LIZ("mcc_mnc", simOperator);
                        Context context = this.LIZJ;
                        try {
                            i2 = C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 0).versionCode;
                        } catch (PackageManager.NameNotFoundException unused) {
                            C46617IRh.LIZ("CctTransportBackend");
                        }
                        LJIIIIZZ.LIZ("application_build", Integer.toString(i2));
                        return LJIIIIZZ.LIZIZ();
                    }
                    throw new IllegalStateException("Property \"autoMetadata\" has not been set");
                }
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }

    public C67374QcM(Context context, InterfaceC67370QcI interfaceC67370QcI, InterfaceC67370QcI interfaceC67370QcI2) {
        C67492QeG c67492QeG = new C67492QeG();
        C67493QeH.LIZ(c67492QeG);
        c67492QeG.LIZLLL = true;
        this.LIZ = new C67482Qe6(c67492QeG);
        this.LIZJ = context;
        this.LIZIZ = (ConnectivityManager) C16880lQ.LLILL(context, "connectivity");
        this.LIZLLL = LIZLLL(C67220QZs.LIZJ);
        this.LJ = interfaceC67370QcI2;
        this.LJFF = interfaceC67370QcI;
        this.LJI = 40000;
    }
}
