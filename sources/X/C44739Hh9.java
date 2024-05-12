package X;

import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VESize;
import defpackage.e1;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.Hh9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44739Hh9 {
    public static volatile boolean LIZ;
    public static volatile boolean LIZIZ;

    public static String LJIIIIZZ() {
        int[] LJIIIZ = LJIIIZ(false);
        if (LJIIIZ != null && LJIIIZ.length >= 2) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LJIIIZ[0]);
            LIZ2.append("*");
            LIZ2.append(LJIIIZ[1]);
            return X1D.LIZIZ(LIZ2);
        }
        return "";
    }

    public static boolean LIZ() {
        if (Q7K.LIZIZ("use_hardcode", 0) != 1 || LIZIZ) {
            return false;
        }
        return true;
    }

    public static VESize LJ() {
        InterfaceC44798Hi6.LJFF.getClass();
        VESize LIZ2 = C44740HhA.LIZ();
        if (LIZ2 == null) {
            int[] LJIIIZ = LJIIIZ(true);
            if (LJIIIZ != null && LJIIIZ.length == 2) {
                int i = LJIIIZ[0];
                return new VESize(i, (int) (i / 0.75f));
            }
            return null;
        }
        int i2 = LIZ2.width;
        return new VESize(i2, (int) (i2 / 0.75f));
    }

    public static int LJII() {
        int intValue;
        int i = 18;
        int LIZIZ2 = Q7K.LIZIZ("video_quality", 18);
        if (LIZIZ2 >= 1 && LIZIZ2 <= 51) {
            i = LIZIZ2;
        }
        int LIZ2 = C00F.LIZ(31744, 0, "video_quality_category_index", true);
        List list = null;
        try {
            int[] iArr = (int[]) SettingsManager.LIZLLL().LJIIIIZZ("video_quality_category", int[].class, null);
            if (iArr != null) {
                list = ORY.LJJZ(iArr);
            }
        } catch (Throwable unused) {
        }
        if (C32151Nz.LJJIIZI(list) && LIZ2 < list.size() && (intValue = ((Integer) ListProtector.get(list, LIZ2)).intValue()) != 0) {
            return intValue;
        }
        return i;
    }

    public static boolean LIZIZ() {
        C60903NvH.LJIIJJI().getPublishService().LIZJ();
        boolean LIZ2 = C41610GUs.LIZ();
        boolean LIZ3 = e1.LIZ(31744, "upload_save_local", true, true);
        C41859Gbn LIZIZ2 = C1I0.LIZIZ();
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("hardEncodeConfig: ");
        LIZ4.append(LIZ2);
        LIZ4.append(", saveEnabled: ");
        LIZ4.append(LIZ3);
        LIZIZ2.LIZJ("post_save_local", X1D.LIZIZ(LIZ4));
        if (LIZ2 && LIZ3) {
            return true;
        }
        return false;
    }

    public static int[] LIZLLL() {
        int[] LJIIJ;
        int[] LJIIJ2 = LJIIJ(C44737Hh7.LIZ());
        int LIZ2 = C44757HhR.LIZ();
        List<String> LIZ3 = C44773Hhh.LIZ();
        if (C32151Nz.LJJIIZI(LIZ3) && LIZ2 < LIZ3.size() && (LJIIJ = LJIIJ((String) ListProtector.get(LIZ3, LIZ2))) != null) {
            LJIIJ2 = LJIIJ;
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("ImportResolution ; ");
        LIZ4.append(Arrays.toString(LJIIJ2));
        C5Z5.LIZ(X1D.LIZIZ(LIZ4));
        return LJIIJ2;
    }

    public static int[] LIZJ(int i) {
        List<String> LIZ2 = C44772Hhg.LIZ();
        if (C32151Nz.LJJIIZI(LIZ2) && i < LIZ2.size()) {
            return LJIIJ((String) ListProtector.get(LIZ2, i));
        }
        return null;
    }

    public static float LJFF(VideoPublishEditModel videoPublishEditModel) {
        return LJI(H7R.LJJJJI(videoPublishEditModel));
    }

    public static float LJI(boolean z) {
        float LIZ2;
        String LIZJ;
        String LIZJ2;
        if (C79234V7u.LJIIIIZZ(z)) {
            LIZ2 = InterfaceC44798Hi6.LJFF.sourceBitrateFactor();
        } else {
            LIZ2 = C44748HhI.LIZ();
        }
        Integer LIZIZ2 = C06540Nm.LIZIZ(31744, 0, "video_bitrate_category_index", true);
        Integer valueOf = Integer.valueOf(InterfaceC44780Hho.LIZ.videoBitrateCategoryIndex());
        if (C44797Hi5.LIZ()) {
            StringBuilder sb = new StringBuilder("key : video_bitrate_category_index , byteBenchValue : ");
            if (C30581Hy.LJJIFFI(Integer.class)) {
                LIZJ2 = String.valueOf(valueOf);
            } else {
                LIZJ2 = T28.LIZJ(valueOf);
            }
            C0DC.LIZLLL(sb, LIZJ2);
            LIZIZ2 = valueOf;
        } else {
            StringBuilder sb2 = new StringBuilder("key : video_bitrate_category_index , libraValue : ");
            if (C30581Hy.LJJIFFI(Integer.class)) {
                LIZJ = String.valueOf(LIZIZ2);
            } else {
                LIZJ = T28.LIZJ(LIZIZ2);
            }
            C0DC.LIZLLL(sb2, LIZJ);
        }
        int intValue = LIZIZ2.intValue();
        List list = null;
        try {
            float[] fArr = (float[]) SettingsManager.LIZLLL().LJIIIIZZ("video_bitrate_category", float[].class, null);
            if (fArr != null) {
                list = ORY.LJJLL(fArr);
            }
        } catch (Throwable unused) {
        }
        if (C32151Nz.LJJIIZI(list) && intValue < list.size()) {
            float floatValue = ((Float) ListProtector.get(list, intValue)).floatValue();
            if (floatValue != 0.0f) {
                LIZ2 = floatValue;
            }
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("RecordBitrate ; ");
        LIZ3.append(LIZ2);
        C5Z5.LIZ(X1D.LIZIZ(LIZ3));
        return LIZ2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] LJIIIZ(boolean r4) {
        /*
            java.lang.String r0 = X.C44737Hh7.LIZ()
            int[] r3 = LJIIJ(r0)
            if (r4 == 0) goto L41
            int r2 = X.C44742HhC.LIZIZ()
            java.util.List r1 = X.C44772Hhg.LIZ()
            boolean r0 = X.C32151Nz.LJJIIZI(r1)
            if (r0 == 0) goto L2b
            int r0 = r1.size()
            if (r2 >= r0) goto L2b
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            int[] r0 = LJIIJ(r0)
        L28:
            if (r0 == 0) goto L2b
            r3 = r0
        L2b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "RecordResolution ; "
            r1.<init>(r0)
            java.lang.String r0 = java.util.Arrays.toString(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.C5Z5.LIZ(r0)
            return r3
        L41:
            X.Ol8 r0 = X.C44989HlB.LIZJ
            java.lang.Object r1 = r0.getValue()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L56
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L56
            int[] r0 = LJIIJ(r1)
            goto L28
        L56:
            int r2 = X.C44742HhC.LIZ()
            java.util.List r1 = X.C44772Hhg.LIZ()
            boolean r0 = X.C32151Nz.LJJIIZI(r1)
            if (r0 == 0) goto L2b
            int r0 = r1.size()
            if (r2 >= r0) goto L2b
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            int[] r0 = LJIIJ(r0)
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44739Hh9.LJIIIZ(boolean):int[]");
    }

    public static int[] LJIIJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int[] iArr = new int[0];
        try {
            String[] split = str.split("x");
            int[] iArr2 = new int[split.length];
            for (int i = 0; i < split.length; i++) {
                iArr2[i] = CastIntegerProtector.parseInt(split[i]);
            }
            iArr = iArr2;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        if (iArr.length != 2) {
            return null;
        }
        return iArr;
    }
}
