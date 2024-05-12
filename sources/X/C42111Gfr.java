package X;

import Y.AgS110S0200000_7;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import java.io.File;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Gfr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42111Gfr {
    public static final C42112Gfs LIZ = new C42112Gfs();
    public static final java.util.Map<String, String> LIZIZ = new LinkedHashMap();
    public static CreativeInfo LIZJ;

    public static void LIZIZ(int i, int i2) {
        JSONObject LIZLLL = C770830u.LIZLLL("duration", i);
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("pictureCount", Integer.valueOf(i2));
        C43882HKc.LIZ.LJIILIIL("aweme_photomv_generate_duration", LIZLLL, c6bk.LJ());
    }

    public static void LIZJ(CreativeInfo creativeInfo, MvCreateVideoData mvCreateVideoData, InterfaceC65784Pro interfaceC65784Pro) {
        LIZ.LIZIZ();
        int i = mvCreateVideoData.resFillMode;
        OSZ osz = new OSZ(Integer.valueOf(mvCreateVideoData.resDestWidth), Integer.valueOf(mvCreateVideoData.resDestHeight));
        if (!o.LJ(creativeInfo, LIZJ)) {
            LIZJ = creativeInfo;
            ((LinkedHashMap) LIZIZ).clear();
        }
        if (GWL.LIZ()) {
            XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C42109Gfp(creativeInfo, mvCreateVideoData, i, osz, interfaceC65784Pro, null), 2);
        } else {
            C10K.LIZJ(new CallableC42107Gfn(creativeInfo, mvCreateVideoData, i, osz)).LJ(new AgS110S0200000_7(mvCreateVideoData, interfaceC65784Pro, 4), C10K.LJIIIIZZ, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        if (r0 != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJ(java.lang.String r16, java.lang.String r17, java.lang.String r18) {
        /*
            r4 = r16
            r3 = r17
            r14 = r18
            if (r4 == 0) goto L6e
            boolean r0 = X.C42117Gfx.LIZLLL()
            if (r0 == 0) goto L6e
            int[] r12 = X.C42307Gj1.LIZJ(r4)
            r11 = 0
            if (r12 == 0) goto L6c
            r17 = 1
            r0 = r12[r17]
            double r5 = (double) r0
            r0 = r12[r11]
            double r0 = (double) r0
            r9 = 4612586738352862003(0x4003333333333333, double:2.4)
            double r7 = r0 * r9
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L50
            boolean r0 = kotlin.jvm.internal.o.LJ(r4, r3)
            if (r0 == 0) goto L4e
            r13 = r3
        L2f:
            r15 = r12[r11]
            double r1 = (double) r15
            double r1 = r1 * r9
            int r0 = (int) r1
            r17 = 1
            android.graphics.Bitmap$CompressFormat r18 = android.graphics.Bitmap.CompressFormat.JPEG
            r16 = r0
            boolean r0 = LIZLLL(r13, r14, r15, r16, r17, r18)
        L3e:
            if (r0 == 0) goto L6c
        L40:
            boolean r0 = X.C42113Gft.LIZ()
            if (r0 == 0) goto L4d
            if (r3 != 0) goto L4a
            java.lang.String r3 = ""
        L4a:
            X.C43133GwL.LIZLLL(r3, r14)
        L4d:
            return r14
        L4e:
            r13 = r14
            goto L2f
        L50:
            double r5 = r5 * r9
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 <= 0) goto L6c
            boolean r0 = kotlin.jvm.internal.o.LJ(r4, r3)
            if (r0 == 0) goto L6a
            r13 = r3
        L5c:
            r2 = r12[r17]
            double r0 = (double) r2
            double r0 = r0 * r9
            int r15 = (int) r0
            android.graphics.Bitmap$CompressFormat r18 = android.graphics.Bitmap.CompressFormat.JPEG
            r16 = r2
            boolean r0 = LIZLLL(r13, r14, r15, r16, r17, r18)
            goto L3e
        L6a:
            r13 = r14
            goto L5c
        L6c:
            r14 = r4
            goto L40
        L6e:
            r14 = r4
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42111Gfr.LJ(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public static String LIZ(int i, String str, String str2, OSZ osz) {
        if (C44687HgJ.LIZIZ(str)) {
            java.util.Map<String, String> map = LIZIZ;
            if (map.containsKey(str)) {
                return (String) ((LinkedHashMap) map).get(str);
            }
            if (C44760HhU.LIZ() == 2) {
                map.put(str, str);
                return str;
            }
            int[] LIZJ2 = C42307Gj1.LIZJ(str);
            if (LIZJ2 == null) {
                return str;
            }
            if (LIZJ2[0] > 1080 || LIZJ2[1] > 1920 || C44760HhU.LIZ() != 1) {
                if (!LIZLLL(str, str2, ((Number) osz.getFirst()).intValue(), ((Number) osz.getSecond()).intValue(), i, Bitmap.CompressFormat.JPEG)) {
                    return str;
                }
                map.put(str, str2);
                map.put(str2, str2);
                return str2;
            }
            map.put(str, str);
            return str;
        }
        return null;
    }

    public static boolean LIZLLL(String str, String destPath, int i, int i2, int i3, Bitmap.CompressFormat compressFormat) {
        Bitmap LJFF;
        o.LJIIIZ(destPath, "destPath");
        if (!C44687HgJ.LIZIZ(str) || (LJFF = C42307Gj1.LJFF(i, i2, C42307Gj1.LIZIZ(str), i3, str)) == null) {
            return false;
        }
        return C42307Gj1.LJ(LJFF, new File(destPath), 100, compressFormat);
    }
}
