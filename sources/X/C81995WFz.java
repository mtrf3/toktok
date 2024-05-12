package X;

import Y.ACallableS6S1000000_7;
import Y.AgS130S0100000_14;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ttve.model.VEMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import kotlin.jvm.internal.o;

/* renamed from: X.WFz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81995WFz {
    public static void LIZ(VEMusicWaveBean vEMusicWaveBean) {
        float[] waveBean;
        if (vEMusicWaveBean != null && (waveBean = vEMusicWaveBean.getWaveBean()) != null) {
            if (waveBean.length == 0) {
                return;
            }
            int length = waveBean.length;
            for (int i = 0; i < length; i++) {
                if (Float.isNaN(waveBean[i])) {
                    waveBean[i] = 0.0f;
                }
            }
        }
    }

    public static C80969Vq9 LIZJ(Context context) {
        C80969Vq9 c80969Vq9 = new C80969Vq9();
        if (context == null) {
            return c80969Vq9;
        }
        c80969Vq9.LIZJ = (int) KL2.LIZJ(context, 16.0f);
        c80969Vq9.LIZIZ = (int) KL2.LIZJ(context, 6.0f);
        c80969Vq9.LIZ = (int) KL2.LIZJ(context, 10.0f);
        c80969Vq9.LJII = -1073741824;
        c80969Vq9.LJI = -1;
        c80969Vq9.LJ = (int) KL2.LIZJ(context, 4.0f);
        c80969Vq9.LJFF = (int) KL2.LIZJ(context, 2.0f);
        c80969Vq9.LJIIIIZZ = (int) KL2.LIZJ(context, 11.0f);
        c80969Vq9.LIZLLL = (int) KL2.LIZJ(context, 8.0f);
        return c80969Vq9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (r0 <= 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean LIZLLL(java.lang.String r5) {
        /*
            java.lang.String r0 = "path"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean> r4 = X.WG0.LJII
            java.lang.Object r0 = r4.get(r5)
            com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean r0 = (com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean) r0
            if (r0 == 0) goto L14
            com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean r0 = X.WG0.LIZIZ(r0)
            return r0
        L14:
            X.HEa r0 = X.C78934UyQ.LJLIL
            com.ss.android.ugc.aweme.port.in.IAnotherMusicService r0 = r0.getMusicService()
            int r3 = r0.getMusicDuration(r5)
            r0 = -1
            r1 = 0
            if (r3 > r0) goto L23
            return r1
        L23:
            r0 = 90000(0x15f90, float:1.26117E-40)
            if (r3 <= r0) goto L29
            return r1
        L29:
            r2 = 2000(0x7d0, float:2.803E-42)
            if (r3 <= 0) goto L47
            X.WG0 r1 = X.WG0.LJI
            r0 = 1
            int r0 = r1.LJII(r3, r0)
            if (r0 > 0) goto L49
        L36:
            r0 = 0
            com.ss.android.ttve.model.VEMusicWaveBean r0 = com.ss.android.vesdk.VEUtils.getMusicWaveData(r5, r0, r2)
            com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean r1 = X.WG0.LIZJ(r0)
            com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean r0 = X.WG0.LIZIZ(r1)
            r4.put(r5, r0)
            return r1
        L47:
            r0 = 2000(0x7d0, float:2.803E-42)
        L49:
            r2 = r0
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81995WFz.LIZLLL(java.lang.String):com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean");
    }

    public static boolean LJ(float[] fArr) {
        if (fArr == null || fArr.length == 0) {
            return false;
        }
        return true;
    }

    public static AVMusicWaveBean LIZIZ(String str, boolean z, WG1 wg1) {
        if (z) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            o.LJI(str);
            return LIZLLL(str);
        }
        C10K.LIZJ(new ACallableS6S1000000_7(str, 7)).LJ(new AgS130S0100000_14(wg1, 5), C10K.LJIIIIZZ, null);
        return null;
    }
}
