package X;

import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XBC implements InterfaceC84427XBn {
    public final XBD LIZ;
    public final C80005Vab LIZIZ;
    public final XCG LIZJ;
    public final C84397XAj LIZLLL;
    public final C84376X9o LJ;
    public final C84389XAb LJFF;

    @Override // X.InterfaceC84427XBn
    public final XBW<C84430XBq> LIZ(C84415XBb c84415XBb) {
        XBW<C84430XBq> LIZ = new XBU(this.LIZJ).LIZ(c84415XBb);
        c84415XBb.LJLJJLL = this.LIZIZ;
        return new XBD((XBG) LIZ, c84415XBb, this.LIZLLL, this.LJ, this.LJFF, this.LIZJ);
    }

    public static Collection LIZIZ(XBC xbc, String[] strArr) {
        Object LIZ;
        C84397XAj.LJIIJJI.getClass();
        int i = 0;
        XAS LIZIZ = C84397XAj.LIZIZ(C84398XAk.LIZ(), 0);
        if (LIZIZ != null) {
            try {
                XBD xbd = xbc.LIZ;
                xbd.getClass();
                LIZ = new XAR(xbd.LJIIJJI, xbd.LJIIIIZZ, xbd.LJIIIZ, xbd.LJIIJ, null, i, 2032).LJII(0, strArr, LIZIZ);
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            ArrayList arrayList = new ArrayList();
            if (C3C5.m12isFailureimpl(LIZ)) {
                LIZ = arrayList;
            }
            return (Collection) LIZ;
        }
        return new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a4, code lost:
    
        if (r0 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.util.List<java.lang.String> r68, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r69) {
        /*
            r67 = this;
            r0 = r67
            X.XBD r2 = r0.LIZ
            r2.getClass()
            com.ss.ugc.effectplatform.model.Effect r3 = new com.ss.ugc.effectplatform.model.Effect
            r4 = 0
            r1 = 0
            r3 = r3
            r14 = 0
            r38 = 0
            r64 = -1
            r65 = 33554431(0x1ffffff, float:9.403954E-38)
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r9 = r4
            r10 = r4
            r11 = r4
            r12 = r4
            r13 = r4
            r15 = r4
            r16 = r4
            r17 = r4
            r18 = r4
            r19 = r4
            r20 = r4
            r21 = r4
            r22 = r14
            r23 = r14
            r24 = r4
            r25 = r4
            r26 = r4
            r27 = r4
            r28 = r4
            r29 = r4
            r30 = r4
            r31 = r4
            r32 = r4
            r33 = r14
            r34 = r4
            r35 = r14
            r36 = r4
            r37 = r4
            r40 = r4
            r41 = r4
            r42 = r38
            r44 = r4
            r45 = r4
            r46 = r4
            r47 = r4
            r48 = r4
            r49 = r14
            r50 = r4
            r51 = r4
            r52 = r4
            r53 = r4
            r54 = r4
            r55 = r4
            r56 = r4
            r57 = r4
            r58 = r4
            r59 = r38
            r61 = r4
            r62 = r4
            r63 = r4
            r66 = r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r40, r41, r42, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r61, r62, r63, r64, r65, r66)
            java.lang.String r0 = "Stub"
            r3.setName(r0)
            r0 = r68
            if (r0 == 0) goto L87
            r3.setRequirements(r0)
        L87:
            r4 = r69
            if (r4 == 0) goto L91
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto Lb5
        L91:
            r0 = 1
        L92:
            if (r0 != 0) goto La9
            X.XCG r0 = r2.LJIIJJI
            X.G0J r0 = r0.LJIJ
            if (r0 == 0) goto Lb2
            if (r4 == 0) goto Lb7
            java.lang.Object r0 = r0.LIZ
            com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter r0 = (com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter) r0
            java.lang.String r0 = r0.convertObjToJson(r4)
            if (r0 == 0) goto Lb2
        La6:
            r3.setModel_names(r0)
        La9:
            X.XBb r0 = new X.XBb
            r0.<init>(r3, r1, r1)
            X.XBD.LJIIJ(r2, r0)
            return
        Lb2:
            java.lang.String r0 = ""
            goto La6
        Lb5:
            r0 = 0
            goto L92
        Lb7:
            kotlin.jvm.internal.o.LJIIZILJ()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XBC.LIZJ(java.util.List, java.util.Map):void");
    }

    public XBC(XCG algorithmConfig, C84397XAj c84397XAj, C84376X9o buildInAssetsManager, C84389XAb algorithmModelCache) {
        o.LJIIJ(algorithmConfig, "algorithmConfig");
        o.LJIIJ(buildInAssetsManager, "buildInAssetsManager");
        o.LJIIJ(algorithmModelCache, "algorithmModelCache");
        this.LIZJ = algorithmConfig;
        this.LIZLLL = c84397XAj;
        this.LJ = buildInAssetsManager;
        this.LJFF = algorithmModelCache;
        this.LIZ = new XBD(null, null, c84397XAj, buildInAssetsManager, algorithmModelCache, algorithmConfig);
        int i = algorithmConfig.LJJ + 8;
        C12310e3 c12310e3 = C12310e3.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[Init][ModelThreadPool][MaxSize:");
        LIZ.append(i);
        LIZ.append(']');
        String LIZIZ = X1D.LIZIZ(LIZ);
        c12310e3.getClass();
        C12310e3.LIZ("JKL", LIZIZ);
        this.LIZIZ = C79855VVr.LIZ(i, LivePlayEnforceIntervalSetting.DEFAULT);
    }
}
