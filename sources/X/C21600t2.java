package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;

/* renamed from: X.0t2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21600t2 {
    public static final C21600t2 LIZ = new C21600t2();
    public static final float LIZIZ = 56;
    public static final float LIZJ = 280;
    public static final float LIZLLL = 1;
    public static final float LJ = 2;

    public static C1ZM LJ(long j, long j2, long j3, long j4, InterfaceC24520xk interfaceC24520xk, int i) {
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22 = j4;
        long j23 = j3;
        long j24 = j;
        long j25 = j2;
        interfaceC24520xk.LJJIIJ(231892599);
        if ((i & 1) != 0) {
            j5 = C11850dJ.LIZIZ(((C11850dJ) interfaceC24520xk.LJIILLIIL(C21620t4.LIZ)).LIZ, ((Number) interfaceC24520xk.LJIILLIIL(C21610t3.LIZ)).floatValue());
        } else {
            j5 = 0;
        }
        if ((i & 2) != 0) {
            j6 = C11850dJ.LIZIZ(j5, C21590t1.LIZIZ(interfaceC24520xk));
        } else {
            j6 = 0;
        }
        if ((i & 4) != 0) {
            j24 = C11850dJ.LIZIZ(C21350sd.LIZ(interfaceC24520xk).LJ(), 0.12f);
        }
        if ((i & 8) != 0) {
            j7 = C21350sd.LIZ(interfaceC24520xk).LJFF();
        } else {
            j7 = 0;
        }
        if ((i & 16) != 0) {
            j8 = C21350sd.LIZ(interfaceC24520xk).LIZIZ();
        } else {
            j8 = 0;
        }
        if ((i & 32) != 0) {
            j25 = C11850dJ.LIZIZ(C21350sd.LIZ(interfaceC24520xk).LJFF(), C21590t1.LIZJ(interfaceC24520xk));
        }
        if ((i & 64) != 0) {
            j23 = C11850dJ.LIZIZ(C21350sd.LIZ(interfaceC24520xk).LJ(), 0.42f);
        }
        if ((i & 128) != 0) {
            j22 = C11850dJ.LIZIZ(j23, C21590t1.LIZIZ(interfaceC24520xk));
        }
        if ((i & 256) != 0) {
            j9 = C21350sd.LIZ(interfaceC24520xk).LIZIZ();
        } else {
            j9 = 0;
        }
        if ((i & 512) != 0) {
            j10 = C11850dJ.LIZIZ(C21350sd.LIZ(interfaceC24520xk).LJ(), 0.54f);
        } else {
            j10 = 0;
        }
        if ((i & 1024) != 0) {
            j11 = C11850dJ.LIZIZ(j10, C21590t1.LIZIZ(interfaceC24520xk));
        } else {
            j11 = 0;
        }
        if ((i & 2048) != 0) {
            j12 = j10;
        } else {
            j12 = 0;
        }
        if ((i & 4096) != 0) {
            j13 = C11850dJ.LIZIZ(C21350sd.LIZ(interfaceC24520xk).LJ(), 0.54f);
        } else {
            j13 = 0;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            j14 = C11850dJ.LIZIZ(j13, C21590t1.LIZIZ(interfaceC24520xk));
        } else {
            j14 = 0;
        }
        if ((i & 16384) != 0) {
            j15 = C21350sd.LIZ(interfaceC24520xk).LIZIZ();
        } else {
            j15 = 0;
        }
        if ((32768 & i) != 0) {
            j16 = C11850dJ.LIZIZ(C21350sd.LIZ(interfaceC24520xk).LJFF(), C21590t1.LIZJ(interfaceC24520xk));
        } else {
            j16 = 0;
        }
        if ((65536 & i) != 0) {
            j17 = C11850dJ.LIZIZ(C21350sd.LIZ(interfaceC24520xk).LJ(), C21590t1.LIZLLL(interfaceC24520xk));
        } else {
            j17 = 0;
        }
        if ((131072 & i) != 0) {
            j18 = C11850dJ.LIZIZ(j17, C21590t1.LIZIZ(interfaceC24520xk));
        } else {
            j18 = 0;
        }
        if ((262144 & i) != 0) {
            j19 = C21350sd.LIZ(interfaceC24520xk).LIZIZ();
        } else {
            j19 = 0;
        }
        if ((524288 & i) != 0) {
            j20 = C11850dJ.LIZIZ(C21350sd.LIZ(interfaceC24520xk).LJ(), C21590t1.LIZLLL(interfaceC24520xk));
        } else {
            j20 = 0;
        }
        if ((i & 1048576) != 0) {
            j21 = C11850dJ.LIZIZ(j20, C21590t1.LIZIZ(interfaceC24520xk));
        } else {
            j21 = 0;
        }
        C1ZM c1zm = new C1ZM(j5, j6, j7, j8, j25, j23, j9, j22, j10, j11, j12, j13, j14, j15, j24, j16, j17, j18, j19, j20, j21);
        interfaceC24520xk.LJJIJIIJIL();
        return c1zm;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0114, code lost:
    
        if ((r34 & 64) != 0) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fc A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(boolean r25, boolean r26, X.C0X9 r27, X.InterfaceC21550sx r28, X.InterfaceC11790dD r29, float r30, float r31, X.InterfaceC24520xk r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21600t2.LIZ(boolean, boolean, X.0X9, X.0sx, X.0dD, float, float, X.0xk, int, int):void");
    }

    public static C1ZM LIZLLL(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, InterfaceC24520xk interfaceC24520xk, int i) {
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22 = j13;
        long j23 = j11;
        long j24 = j9;
        long j25 = j8;
        long j26 = j7;
        long j27 = j2;
        long j28 = j12;
        long j29 = j;
        long j30 = j3;
        long j31 = j10;
        long j32 = j6;
        long j33 = j4;
        long j34 = j5;
        interfaceC24520xk.LJJIIJ(1762667317);
        if ((i & 1) != 0) {
            j29 = C11850dJ.LIZIZ(((C11850dJ) interfaceC24520xk.LJIILLIIL(C21620t4.LIZ)).LIZ, ((Number) interfaceC24520xk.LJIILLIIL(C21610t3.LIZ)).floatValue());
        }
        if ((i & 2) != 0) {
            j27 = C11850dJ.LIZIZ(j29, C21590t1.LIZIZ(interfaceC24520xk));
        }
        if ((i & 4) != 0) {
            j14 = C11850dJ.LJFF;
        } else {
            j14 = 0;
        }
        if ((i & 8) != 0) {
            j30 = C21350sd.LIZ(interfaceC24520xk).LJFF();
        }
        if ((i & 16) != 0) {
            j33 = C21350sd.LIZ(interfaceC24520xk).LIZIZ();
        }
        if ((i & 32) != 0) {
            j34 = C11850dJ.LIZIZ(C21350sd.LIZ(interfaceC24520xk).LJFF(), C21590t1.LIZJ(interfaceC24520xk));
        }
        if ((i & 64) != 0) {
            j32 = C11850dJ.LIZIZ(C21350sd.LIZ(interfaceC24520xk).LJ(), C21590t1.LIZIZ(interfaceC24520xk));
        }
        if ((i & 128) != 0) {
            j26 = C11850dJ.LIZIZ(j32, C21590t1.LIZIZ(interfaceC24520xk));
        }
        if ((i & 256) != 0) {
            j25 = C21350sd.LIZ(interfaceC24520xk).LIZIZ();
        }
        if ((i & 512) != 0) {
            j15 = C11850dJ.LIZIZ(C21350sd.LIZ(interfaceC24520xk).LJ(), 0.54f);
        } else {
            j15 = 0;
        }
        if ((i & 1024) != 0) {
            j16 = C11850dJ.LIZIZ(j15, C21590t1.LIZIZ(interfaceC24520xk));
        } else {
            j16 = 0;
        }
        if ((i & 2048) != 0) {
            j17 = j15;
        } else {
            j17 = 0;
        }
        if ((i & 4096) != 0) {
            j18 = C11850dJ.LIZIZ(C21350sd.LIZ(interfaceC24520xk).LJ(), 0.54f);
        } else {
            j18 = 0;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            j19 = C11850dJ.LIZIZ(j18, C21590t1.LIZIZ(interfaceC24520xk));
        } else {
            j19 = 0;
        }
        if ((i & 16384) != 0) {
            j20 = C21350sd.LIZ(interfaceC24520xk).LIZIZ();
        } else {
            j20 = 0;
        }
        if ((32768 & i) != 0) {
            j24 = C11850dJ.LIZIZ(C21350sd.LIZ(interfaceC24520xk).LJFF(), C21590t1.LIZJ(interfaceC24520xk));
        }
        if ((65536 & i) != 0) {
            j31 = C11850dJ.LIZIZ(C21350sd.LIZ(interfaceC24520xk).LJ(), C21590t1.LIZLLL(interfaceC24520xk));
        }
        if ((131072 & i) != 0) {
            j21 = C11850dJ.LIZIZ(j31, C21590t1.LIZIZ(interfaceC24520xk));
        } else {
            j21 = 0;
        }
        if ((262144 & i) != 0) {
            j23 = C21350sd.LIZ(interfaceC24520xk).LIZIZ();
        }
        if ((524288 & i) != 0) {
            j28 = C11850dJ.LIZIZ(C21350sd.LIZ(interfaceC24520xk).LJ(), C21590t1.LIZLLL(interfaceC24520xk));
        }
        if ((i & 1048576) != 0) {
            j22 = C11850dJ.LIZIZ(j28, C21590t1.LIZIZ(interfaceC24520xk));
        }
        long j35 = j29;
        C1ZM c1zm = new C1ZM(j35, j27, j30, j33, j34, j32, j25, j26, j15, j16, j17, j18, j19, j20, j14, j24, j31, j21, j23, j28, j22);
        interfaceC24520xk.LJJIJIIJIL();
        return c1zm;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.String r43, X.InterfaceC88471Ynr<? super X.InterfaceC24520xk, ? super java.lang.Integer, X.C76800UCe> r44, boolean r45, boolean r46, X.InterfaceC14810i5 r47, X.C0X9 r48, boolean r49, X.InterfaceC88471Ynr<? super X.InterfaceC24520xk, ? super java.lang.Integer, X.C76800UCe> r50, X.InterfaceC88471Ynr<? super X.InterfaceC24520xk, ? super java.lang.Integer, X.C76800UCe> r51, X.InterfaceC88471Ynr<? super X.InterfaceC24520xk, ? super java.lang.Integer, X.C76800UCe> r52, X.InterfaceC88471Ynr<? super X.InterfaceC24520xk, ? super java.lang.Integer, X.C76800UCe> r53, X.InterfaceC21550sx r54, X.InterfaceC09420Yo r55, X.InterfaceC24520xk r56, int r57, int r58, int r59) {
        /*
            Method dump skipped, instructions count: 725
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21600t2.LIZJ(java.lang.String, X.Ynr, boolean, boolean, X.0i5, X.0X9, boolean, X.Ynr, X.Ynr, X.Ynr, X.Ynr, X.0sx, X.0Yo, X.0xk, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c3 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.lang.String r62, X.InterfaceC88471Ynr<? super X.InterfaceC24520xk, ? super java.lang.Integer, X.C76800UCe> r63, boolean r64, boolean r65, X.InterfaceC14810i5 r66, X.C0X9 r67, boolean r68, X.InterfaceC88471Ynr<? super X.InterfaceC24520xk, ? super java.lang.Integer, X.C76800UCe> r69, X.InterfaceC88471Ynr<? super X.InterfaceC24520xk, ? super java.lang.Integer, X.C76800UCe> r70, X.InterfaceC88471Ynr<? super X.InterfaceC24520xk, ? super java.lang.Integer, X.C76800UCe> r71, X.InterfaceC88471Ynr<? super X.InterfaceC24520xk, ? super java.lang.Integer, X.C76800UCe> r72, X.InterfaceC21550sx r73, X.InterfaceC09420Yo r74, X.InterfaceC88471Ynr<? super X.InterfaceC24520xk, ? super java.lang.Integer, X.C76800UCe> r75, X.InterfaceC24520xk r76, int r77, int r78, int r79) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21600t2.LIZIZ(java.lang.String, X.Ynr, boolean, boolean, X.0i5, X.0X9, boolean, X.Ynr, X.Ynr, X.Ynr, X.Ynr, X.0sx, X.0Yo, X.Ynr, X.0xk, int, int, int):void");
    }
}
