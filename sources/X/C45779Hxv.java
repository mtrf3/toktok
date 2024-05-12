package X;

import com.ss.android.ugc.aweme.creative.model.music.StickPointMusicAlg;
import com.ss.android.ugc.aweme.music.model.StickPointBeanUtil;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.vesdk.clipparam.VEAlgorithmPath;
import kotlin.jvm.internal.o;

/* renamed from: X.Hxv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45779Hxv {
    public C5IN LIZ;
    public AVMusic LIZIZ;

    public static VEAlgorithmPath LIZ(VEAlgorithmPath vEAlgorithmPath) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        VEAlgorithmPath vEAlgorithmPath2 = new VEAlgorithmPath();
        Integer num = null;
        if (vEAlgorithmPath != null) {
            str = vEAlgorithmPath.getVeBeatsPath();
        } else {
            str = null;
        }
        vEAlgorithmPath2.setVeBeatsPath(str);
        if (vEAlgorithmPath != null) {
            str2 = vEAlgorithmPath.getDownBeatsPath();
        } else {
            str2 = null;
        }
        vEAlgorithmPath2.setDownBeatsPath(str2);
        if (vEAlgorithmPath != null) {
            str3 = vEAlgorithmPath.getNoStrengthBeatsPath();
        } else {
            str3 = null;
        }
        vEAlgorithmPath2.setNoStrengthBeatsPath(str3);
        if (vEAlgorithmPath != null) {
            str4 = vEAlgorithmPath.getManMadePath();
        } else {
            str4 = null;
        }
        vEAlgorithmPath2.setManMadePath(str4);
        if (vEAlgorithmPath != null) {
            str5 = vEAlgorithmPath.getOnlineBeatsPath();
        } else {
            str5 = null;
        }
        vEAlgorithmPath2.setOnlineBeatsPath(str5);
        if (vEAlgorithmPath != null) {
            num = Integer.valueOf(vEAlgorithmPath.getMode());
        }
        o.LJI(num);
        vEAlgorithmPath2.setMode(num.intValue());
        vEAlgorithmPath2.setType(vEAlgorithmPath.getType());
        return vEAlgorithmPath2;
    }

    public static VEAlgorithmPath LIZIZ(AVMusic aVMusic) {
        String defaultLocalPath;
        int i;
        if (aVMusic != null) {
            if (aVMusic.getStickPointMusicAlg() == null) {
                defaultLocalPath = "";
            } else {
                defaultLocalPath = aVMusic.getStickPointMusicAlg().getDefaultLocalPath();
            }
            String veBeatsPath = aVMusic.getStickPointMusicAlg().getVeBeatsPath();
            String downBeatsPath = aVMusic.getStickPointMusicAlg().getDownBeatsPath();
            String noStrengthBeatsPath = aVMusic.getStickPointMusicAlg().getNoStrengthBeatsPath();
            String manModeBeatsPath = aVMusic.getStickPointMusicAlg().getManModeBeatsPath();
            if (!C39579Fg7.LIZIZ(veBeatsPath)) {
                veBeatsPath = null;
            }
            if (!C39579Fg7.LIZIZ(downBeatsPath)) {
                downBeatsPath = null;
            }
            if (!C39579Fg7.LIZIZ(noStrengthBeatsPath)) {
                noStrengthBeatsPath = null;
            }
            if (!C39579Fg7.LIZIZ(manModeBeatsPath)) {
                manModeBeatsPath = null;
            }
            StickPointMusicAlg stickPointMusicAlg = aVMusic.getStickPointMusicAlg();
            o.LJIIIIZZ(stickPointMusicAlg, "musicModel.stickPointMusicAlg");
            if (StickPointBeanUtil.isSuccessivelyAlgType(stickPointMusicAlg)) {
                StickPointMusicAlg stickPointMusicAlg2 = aVMusic.getStickPointMusicAlg();
                o.LJIIIIZZ(stickPointMusicAlg2, "musicModel.stickPointMusicAlg");
                if (!StickPointBeanUtil.existSuccessivelyAlgFile(stickPointMusicAlg2)) {
                    aVMusic.getStickPointMusicAlg().setAlgType(VEAlgorithmPath.BEATES_FILE_DEFAULT);
                }
            }
            VEAlgorithmPath vEAlgorithmPath = new VEAlgorithmPath();
            vEAlgorithmPath.setVeBeatsPath(veBeatsPath);
            vEAlgorithmPath.setDownBeatsPath(downBeatsPath);
            StickPointMusicAlg stickPointMusicAlg3 = aVMusic.getStickPointMusicAlg();
            o.LJIIIIZZ(stickPointMusicAlg3, "musicModel.stickPointMusicAlg");
            if (!StickPointBeanUtil.isSuccessivelyAlgType(stickPointMusicAlg3)) {
                if (C39579Fg7.LIZIZ(downBeatsPath)) {
                    vEAlgorithmPath.setNoStrengthBeatsPath(null);
                } else {
                    vEAlgorithmPath.setNoStrengthBeatsPath(noStrengthBeatsPath);
                }
            }
            vEAlgorithmPath.setManMadePath(manModeBeatsPath);
            vEAlgorithmPath.setOnlineBeatsPath(defaultLocalPath);
            vEAlgorithmPath.setType(aVMusic.getStickPointMusicAlg().getAlgType());
            StickPointMusicAlg stickPointMusicAlg4 = aVMusic.getStickPointMusicAlg();
            o.LJIIIIZZ(stickPointMusicAlg4, "musicModel.stickPointMusicAlg");
            if (StickPointBeanUtil.isSuccessivelyAlgType(stickPointMusicAlg4)) {
                i = VEAlgorithmPath.MODE_SUCCESSIVELY;
            } else {
                i = VEAlgorithmPath.INTMODE_ONSET;
            }
            vEAlgorithmPath.setMode(i);
            return vEAlgorithmPath;
        }
        o.LJI(null);
        throw new C45784Hy0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x015d, code lost:
    
        if (r12 < 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01af, code lost:
    
        if (r2 != (-10007)) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C143235jj LIZJ(java.lang.String r23, com.ss.android.vesdk.clipparam.VEAlgorithmPath r24, int r25) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45779Hxv.LIZJ(java.lang.String, com.ss.android.vesdk.clipparam.VEAlgorithmPath, int):X.5jj");
    }
}
