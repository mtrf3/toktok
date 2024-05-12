package X;

import Y.ARunnableS44S0100000_8;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import com.bytedance.mt.protector.impl.PatternProtector;
import defpackage.b1;
import java.text.Normalizer;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.regex.Pattern;

/* loaded from: classes12.dex */
public final class R2G {
    public static volatile long LJIIIIZZ;
    public static final Pattern LJIIIZ = PatternProtector.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
    public static final Pattern LJIIJ = PatternProtector.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");
    public final ExecutorService LIZ;
    public final R2E LIZIZ;
    public final Context LIZJ;
    public Future LIZLLL;
    public volatile boolean LJ;
    public String LJFF;
    public volatile R2F LJI;
    public volatile String LJII;

    public final String LIZ() {
        LJIIJJI();
        return this.LJII;
    }

    public final void LJIIJJI() {
        ExecutorService executorService;
        if (SystemClock.elapsedRealtime() - LJIIIIZZ < LivePreviewNetworkSpeedThresholdSetting.DEFAULT || (executorService = this.LIZ) == null || executorService.isShutdown()) {
            return;
        }
        this.LIZ.submit(new ARunnableS44S0100000_8(this, 111));
    }

    public static R2I LIZIZ(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        int indexOf = str.indexOf("://") + 3;
        int length = str.length();
        int i = indexOf;
        int i2 = -1;
        while (indexOf < length) {
            char charAt = str.charAt(indexOf);
            if (charAt == '#' || charAt == '/') {
                break;
            }
            if (charAt != ':') {
                if (charAt == '?') {
                    break;
                }
                if (charAt == '@') {
                    i = indexOf + 1;
                }
            } else {
                i2 = indexOf;
            }
            indexOf++;
        }
        if (i2 == -1) {
            i2 = indexOf;
        }
        return new R2I(i, i2, indexOf);
    }

    public static String LIZJ(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        R2I LIZIZ = LIZIZ(str);
        return str.substring(LIZIZ.LIZ, LIZIZ.LIZIZ);
    }

    public static boolean LJFF(String str) {
        if (str == null || str.length() < 7 || str.length() > 15 || "".equals(str)) {
            return false;
        }
        return PatternProtector.compile("([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}").matcher(str).find();
    }

    public static boolean LJI(String str) {
        Pattern compile = PatternProtector.compile("(([0-9])|([1-9]\\d)|(([1]\\d{2})|(([2][0-4]\\d)|([2][5][0-5]))))(.(([0-9])|([1-9]\\d)|(([1]\\d{2})|(([2][0-4]\\d)|([2][5][0-5]))))){3}");
        if (TextUtils.isEmpty(str)) {
            C46496IMq.LIZJ();
            return false;
        }
        return compile.matcher(Normalizer.normalize(str, Normalizer.Form.NFKC)).matches();
    }

    public static boolean LJII(String str) {
        if (TextUtils.isEmpty(str)) {
            C46496IMq.LIZ();
            return false;
        }
        String normalize = Normalizer.normalize(str, Normalizer.Form.NFKC);
        if (!LJIIIZ.matcher(normalize).matches() && !LJIIJ.matcher(normalize).matches()) {
            return false;
        }
        return true;
    }

    public static String LIZLLL(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            R2I LIZIZ = LIZIZ(str);
            boolean startsWith = str.startsWith("http");
            if (LJII(str2)) {
                str2 = C16880lQ.LLLZ("[%s]", new Object[]{str2});
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str.substring(0, LIZIZ.LIZ));
            LIZ.append(str2);
            String LIZIZ2 = X1D.LIZIZ(LIZ);
            int i = LIZIZ.LIZIZ;
            if (LIZIZ.LIZJ != -1) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(LIZIZ2);
                LIZ2.append(str.substring(LIZIZ.LIZIZ, LIZIZ.LIZJ));
                LIZIZ2 = X1D.LIZIZ(LIZ2);
                i = LIZIZ.LIZJ;
            }
            if (!startsWith) {
                StringBuilder LIZJ = b1.LIZJ(LIZIZ2, "/");
                LIZJ.append(LIZJ(str));
                LIZIZ2 = X1D.LIZIZ(LIZJ);
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(LIZIZ2);
            LIZ3.append(str.substring(i));
            return X1D.LIZIZ(LIZ3);
        }
        return null;
    }

    public R2G(Context context, ExecutorService executorService, R2E r2e) {
        this.LIZJ = context;
        this.LIZ = executorService;
        this.LIZIZ = r2e;
    }

    public static String LJ(String str, String str2, boolean z) {
        R2I r2i = null;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return null;
        }
        if (str != null && str.length() != 0) {
            int indexOf = str.indexOf("://") + 3;
            int length = str.length();
            int i = indexOf;
            int i2 = -1;
            while (indexOf < length) {
                char charAt = str.charAt(indexOf);
                if (charAt == '#' || charAt == '/') {
                    break;
                }
                if (charAt != ':') {
                    if (charAt != ']') {
                        if (charAt == '?') {
                            break;
                        }
                        if (charAt == '@') {
                            i = indexOf + 1;
                        }
                    } else if (!z) {
                    }
                    indexOf++;
                }
                i2 = indexOf;
                indexOf++;
            }
            if (i2 == -1) {
                i2 = indexOf;
            }
            r2i = new R2I(i, i2, indexOf);
        }
        str.startsWith("http");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str.substring(0, r2i.LIZ));
        LIZ.append(str2);
        String LIZIZ = X1D.LIZIZ(LIZ);
        int i3 = r2i.LIZIZ;
        if (r2i.LIZJ != -1) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LIZIZ);
            LIZ2.append(str.substring(r2i.LIZIZ, r2i.LIZJ));
            LIZIZ = X1D.LIZIZ(LIZ2);
            i3 = r2i.LIZJ;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(LIZIZ);
        LIZ3.append(str.substring(i3));
        return X1D.LIZIZ(LIZ3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r3 != r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(java.lang.String r16, java.util.List<java.lang.String> r17, X.R2F r18) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.R2G.LJIIJ(java.lang.String, java.util.List, X.R2F):void");
    }

    public final void LJIIIIZZ(boolean z, String str, String str2, C48315Ixj c48315Ixj, boolean z2) {
        LJIIIZ(z, str, str2, null, c48315Ixj, z2);
    }

    public final void LJIIIZ(boolean z, String str, String str2, List<String> list, C48315Ixj c48315Ixj, boolean z2) {
        R2F r2f;
        if (this.LJ != z || (r2f = this.LJI) == null) {
            return;
        }
        if (z2 && str2 != null) {
            R2J r2j = new R2J();
            r2j.LIZIZ = System.currentTimeMillis();
            r2j.LIZ = str2;
            r2j.LIZJ = false;
            ConcurrentHashMap<String, R2J> concurrentHashMap = R2H.LIZ().LIZ;
            if (concurrentHashMap != null) {
                concurrentHashMap.put(str, r2j);
            }
            ConcurrentHashMap<String, List<String>> concurrentHashMap2 = R2H.LIZ().LIZIZ;
            if (concurrentHashMap2 != null) {
                concurrentHashMap2.put(str, list);
            }
        }
        r2f.LIZ(str, str2, c48315Ixj, z2);
    }
}
