package com.google.android.play.core.assetpacks;

import X.C13T;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/* loaded from: classes7.dex */
public final class e1 {
    public static final C13T LIZLLL = new C13T("ExtractorTaskFinder");
    public final c1 LIZ;
    public final y LIZIZ;
    public final f0 LIZJ;

    public e1(c1 c1Var, y yVar, f0 f0Var) {
        this.LIZ = c1Var;
        this.LIZIZ = yVar;
        this.LIZJ = f0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0201, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0202, code lost:
    
        com.google.android.play.core.assetpacks.e1.LIZLLL.LIZJ("Slice checkpoint corrupt, restarting extraction. %s", 6, new java.lang.Object[]{r4});
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x027d, code lost:
    
        r6 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0285, code lost:
    
        if (r6.hasNext() == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0287, code lost:
    
        r3 = (com.google.android.play.core.assetpacks.z0) r6.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0295, code lost:
    
        if (com.google.android.play.core.assetpacks.l1.LIZJ(r3.LIZJ.LIZJ) == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0297, code lost:
    
        r4 = r3.LIZJ.LJ.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02a3, code lost:
    
        if (r4.hasNext() == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02a5, code lost:
    
        r5 = r4.next();
        r1 = r5.LJFF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02ae, code lost:
    
        if (r1 == 1) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02b1, code lost:
    
        if (r1 != 2) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02be, code lost:
    
        if (r5.LIZLLL.get(0).LIZ == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02c4, code lost:
    
        if (LIZIZ(r3, r5) != false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02c6, code lost:
    
        com.google.android.play.core.assetpacks.e1.LIZLLL.LIZJ("Found patch slice task using patch format %s for session %s, pack %s, slice %s.", 3, new java.lang.Object[]{java.lang.Integer.valueOf(r5.LJFF), java.lang.Integer.valueOf(r3.LIZ), r3.LIZJ.LIZ, r5.LIZ});
        r22 = r23.LIZJ.LIZ(r3.LIZ, 0, r3.LIZJ.LIZ, r5.LIZ);
        r10 = r3.LIZ;
        r11 = r3.LIZJ.LIZ;
        r0 = r23.LIZIZ;
        r0.getClass();
        r12 = (int) com.google.android.play.core.assetpacks.y.LIZIZ(new java.io.File(r0.LJ(), r11), true);
        r8 = r23.LIZIZ;
        r7 = r3.LIZJ.LIZ;
        r8.getClass();
        r9 = new com.google.android.play.core.assetpacks.w1(r10, r11, r12, com.google.android.play.core.assetpacks.y.LIZIZ(new java.io.File(new java.io.File(r8.LJ(), r7), java.lang.String.valueOf((int) com.google.android.play.core.assetpacks.y.LIZIZ(new java.io.File(r8.LJ(), r7), true))), true), r3.LIZIZ, r3.LIZJ.LIZIZ, r5.LJFF, r5.LIZ, r5.LIZJ, r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0364, code lost:
    
        if (r9 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0366, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0367, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x035e, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x01a9, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
    
        r9 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b7, code lost:
    
        if (r9.hasNext() == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b9, code lost:
    
        r4 = (com.google.android.play.core.assetpacks.z0) r9.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c7, code lost:
    
        if (com.google.android.play.core.assetpacks.l1.LIZJ(r4.LIZJ.LIZJ) == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c9, code lost:
    
        r8 = r4.LIZJ.LJ.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d5, code lost:
    
        if (r8.hasNext() == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d7, code lost:
    
        r3 = r8.next();
        r13 = r23.LIZIZ;
        r0 = r4.LIZJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f5, code lost:
    
        if (r13.LJIIIZ(r4.LIZIZ, r0.LIZ, r3.LIZ, r0.LIZIZ).exists() == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f7, code lost:
    
        com.google.android.play.core.assetpacks.e1.LIZLLL.LIZJ("Found merge task for session %s with pack %s and slice %s.", 3, new java.lang.Object[]{java.lang.Integer.valueOf(r4.LIZ), r4.LIZJ.LIZ, r3.LIZ});
        r6 = r4.LIZ;
        r0 = r4.LIZJ;
        r5 = new com.google.android.play.core.assetpacks.o1(r6, r0.LIZIZ, r0.LIZ, r4.LIZIZ, r3.LIZ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0126, code lost:
    
        r9 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x012e, code lost:
    
        if (r9.hasNext() == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0130, code lost:
    
        r4 = (com.google.android.play.core.assetpacks.z0) r9.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013e, code lost:
    
        if (com.google.android.play.core.assetpacks.l1.LIZJ(r4.LIZJ.LIZJ) == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0140, code lost:
    
        r8 = r4.LIZJ.LJ.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014c, code lost:
    
        if (r8.hasNext() == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014e, code lost:
    
        r3 = r8.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0158, code lost:
    
        if (LIZIZ(r4, r3) == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015a, code lost:
    
        r13 = r23.LIZIZ;
        r0 = r4.LIZJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0172, code lost:
    
        if (r13.LJIIIIZZ(r4.LIZIZ, r0.LIZ, r3.LIZ, r0.LIZIZ).exists() == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0174, code lost:
    
        com.google.android.play.core.assetpacks.e1.LIZLLL.LIZJ("Found verify task for session %s with pack %s and slice %s.", 3, new java.lang.Object[]{java.lang.Integer.valueOf(r4.LIZ), r4.LIZJ.LIZ, r3.LIZ});
        r6 = r4.LIZ;
        r0 = r4.LIZJ;
        r5 = new com.google.android.play.core.assetpacks.c2(r6, r0.LIZ, r3.LIZ, r0.LIZIZ, r3.LIZIZ, r4.LIZIZ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01aa, code lost:
    
        r11 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b3, code lost:
    
        if (r11.hasNext() == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01b5, code lost:
    
        r0 = (com.google.android.play.core.assetpacks.z0) r11.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c3, code lost:
    
        if (com.google.android.play.core.assetpacks.l1.LIZJ(r0.LIZJ.LIZJ) == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01c5, code lost:
    
        r10 = r0.LIZJ.LJ.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01d1, code lost:
    
        if (r10.hasNext() == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01d3, code lost:
    
        r1 = r10.next();
        r4 = r1.LJFF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01dc, code lost:
    
        if (r4 == 1) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01df, code lost:
    
        if (r4 != 2) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01e2, code lost:
    
        r14 = r23.LIZIZ;
        r3 = r0.LIZJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01f9, code lost:
    
        r13 = new com.google.android.play.core.assetpacks.z1(r14, r3.LIZ, r0.LIZIZ, r3.LIZIZ, r1.LIZ).LJIIIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01fe, code lost:
    
        if (r13 == (-1)) goto L140;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.play.core.assetpacks.d1 LIZ() {
        /*
            Method dump skipped, instructions count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.e1.LIZ():com.google.android.play.core.assetpacks.d1");
    }

    public final boolean LIZIZ(z0 z0Var, a1 a1Var) {
        y yVar = this.LIZIZ;
        y0 y0Var = z0Var.LIZJ;
        String str = y0Var.LIZ;
        int i = z0Var.LIZIZ;
        long j = y0Var.LIZIZ;
        String str2 = a1Var.LIZ;
        yVar.getClass();
        File file = new File(new File(new File(new File(yVar.LIZLLL(i, j, str), "_slices"), "_metadata"), str2), "checkpoint.dat");
        if (!file.exists()) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") == null) {
                    z1.LJII.LIZJ("Slice checkpoint file corrupt while checking if extraction finished.", 6, new Object[0]);
                    return false;
                }
                if (CastIntegerProtector.parseInt(properties.getProperty("fileStatus")) != 4) {
                    return false;
                }
                return true;
            } finally {
            }
        } catch (IOException e) {
            z1.LJII.LIZJ("Could not read checkpoint while checking if extraction finished. %s", 6, new Object[]{e});
            return false;
        }
    }
}
