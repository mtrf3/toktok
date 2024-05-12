package X;

import Y.ARunnableS37S0100000_1;
import com.ss.android.ugc.aweme.im.sdk.common.controller.appsettings.RelationFetchFrequencyConfig;
import java.util.List;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.3YC, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3YC implements InterfaceC76442zI {
    public static final C3YC LJLIL;
    public static final C62822Ol8 LJLILLLLZI;
    public static XKQ LJLJI;
    public static final C62822Ol8 LJLJJI;

    static {
        C3YC c3yc = new C3YC();
        LJLIL = c3yc;
        LJLILLLLZI = C221108m2.LIZIZ(C3YS.LJLIL);
        LJLJJI = C221108m2.LIZIZ(C3G0.LJLIL);
        if (((Number) C3YZ.LIZ.getValue()).intValue() == 2) {
            C4ZL.LIZLLL();
            C76482zM.LIZ(c3yc);
        } else {
            EventBus.LIZJ().LJIILJJIL(c3yc);
        }
    }

    public static List LJIIJJI() {
        return (List) LJLJJI.getValue();
    }

    public static void LIZIZ() {
        C3YC c3yc;
        C3YM c3ym;
        synchronized (LJIIJJI()) {
            c3yc = LJLIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("bookNextFetchTask task=");
            c3yc.getClass();
            LIZ.append(LJIIJJI());
            LJIIL(X1D.LIZIZ(LIZ));
            if (LJIIJJI().isEmpty()) {
                c3ym = null;
            } else {
                List LJIIJJI = LJIIJJI();
                c3ym = C3YM.COLDUP_FULL;
                if (!LJIIJJI.contains(c3ym)) {
                    List LJIIJJI2 = LJIIJJI();
                    c3ym = C3YM.COLDUP_DIFF;
                    if (!LJIIJJI2.contains(c3ym)) {
                        c3ym = (C3YM) LJIIJJI().get(0);
                    }
                }
            }
            LJIIJJI().clear();
        }
        if (c3ym != null) {
            c3yc.LJIIIZ(c3ym, false);
        }
    }

    public static final void LJIIL(String str) {
        C34B.LJI("RelationFetchManager", str);
    }

    @Override // X.InterfaceC76442zI
    public final void LIZ(C76512zP c76512zP) {
        if (C78596Usy.LJJIJL(C3YQ.LJLIL, DPB.LIZJ())) {
            C38995FSd.LIZLLL().submit(new ARunnableS37S0100000_1(c76512zP, 90));
            return;
        }
        if (!C80763Ey.LIZLLL()) {
            return;
        }
        LJLIL.getClass();
        EF7.LIZIZ();
        try {
            if (!C2NU.LIZ.LIZIZ() || this == null) {
                return;
            }
            LIZIZ();
        } catch (Exception unused) {
        }
    }

    public final boolean LJ(C3YM c3ym) {
        long j;
        long j2;
        int i = C3YN.LIZ[c3ym.ordinal()];
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            j = Long.MAX_VALUE;
                        } else {
                            j = C80993Fv.LIZ().LIZ.getLong("last_relation_loader_diff_fetch_time", 0L);
                        }
                    } else {
                        j = C80993Fv.LIZ().LIZ.getLong("last_relation_font_diff_fetch_time", 0L);
                    }
                } else {
                    j = C80993Fv.LIZ().LIZ.getLong("last_relation_ws_diff_fetch_time", 0L);
                }
            } else {
                j = C80993Fv.LIZ().LIZ.getLong("last_relation_cold_up_diff_fetch_time", 0L);
            }
        } else {
            j = C80993Fv.LIZ().LIZ.getLong("last_relation_full_fetch_time", 0L);
        }
        RelationFetchFrequencyConfig relationFetchFrequencyConfig = (RelationFetchFrequencyConfig) LJLILLLLZI.getValue();
        relationFetchFrequencyConfig.getClass();
        int i2 = C3YL.LIZ[c3ym.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            j2 = relationFetchFrequencyConfig.LJLIL;
                        } else {
                            j2 = relationFetchFrequencyConfig.LJLIL;
                        }
                    } else {
                        j2 = relationFetchFrequencyConfig.fontDiffFreq;
                    }
                } else {
                    j2 = relationFetchFrequencyConfig.wsDiffUpdateFreq;
                }
            } else {
                j2 = relationFetchFrequencyConfig.coldUpDiffUpdateFreq;
            }
        } else {
            j2 = relationFetchFrequencyConfig.fullUpdateFreq;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - j < 1000 * j2) {
            z = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("checkFrequencyByFetchScene [");
        LIZ.append(c3ym);
        LIZ.append("] ");
        LIZ.append(z);
        LIZ.append(": [");
        LIZ.append(currentTimeMillis);
        C0MT.LIZLLL(LIZ, ", ", j, ", ");
        LIZ.append(j2);
        LIZ.append("] ");
        LJIIL(X1D.LIZIZ(LIZ));
        return z;
    }

    @QD3
    public final void onEvent(C76522zQ c76522zQ) {
        if (C78596Usy.LJJIJL(C3YQ.LJLIL, DPB.LIZJ())) {
            C38995FSd.LIZLLL().submit(new ARunnableS37S0100000_1(c76522zQ, 89));
            return;
        }
        if (!C80763Ey.LIZLLL()) {
            return;
        }
        LJLIL.getClass();
        EF7.LIZIZ();
        try {
            if (!C2NU.LIZ.LIZIZ() || this == null) {
                return;
            }
            LIZIZ();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0119, code lost:
    
        if (((X.C3YD) r0).LIZLLL != false) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0130 A[Catch: all -> 0x0156, TryCatch #1 {all -> 0x0156, blocks: (B:21:0x012a, B:23:0x0130, B:24:0x0134, B:26:0x013a, B:28:0x0148), top: B:20:0x012a }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x016d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0114 -> B:17:0x0115). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C3YD r22, X.InterfaceC67352kd<? super X.C76800UCe> r23) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3YC.LIZLLL(X.3YD, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x012a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(X.C3YM r21, X.InterfaceC67352kd<? super java.lang.Boolean> r22) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3YC.LJIIIIZZ(X.3YM, X.2kd):java.lang.Object");
    }

    public final void LJIIIZ(C3YM c3ym, boolean z) {
        if (AV1.LJIIJJI()) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fetchRelationAsync [");
        LIZ.append(c3ym);
        LIZ.append("] start: forceClear=");
        LIZ.append(z);
        LJIIL(X1D.LIZIZ(LIZ));
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZ), null, null, new C80913Fn(c3ym, z, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0186 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C3YM r12, boolean r13, X.InterfaceC67352kd<? super java.lang.Boolean> r14) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3YC.LIZJ(X.3YM, boolean, X.2kd):java.lang.Object");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:66:0x012f
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0103 A[Catch: all -> 0x0131, TryCatch #0 {all -> 0x0131, blocks: (B:15:0x00f6, B:16:0x00f9, B:17:0x00fd, B:19:0x0103, B:22:0x0113, B:25:0x0119, B:31:0x012c), top: B:14:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00d6 -> B:16:0x00f9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00f2 -> B:16:0x00f9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.C3YM r12, java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> r13, boolean r14, X.InterfaceC67352kd<? super java.lang.Boolean> r15) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3YC.LJFF(X.3YM, java.util.List, boolean, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        if (((java.lang.Boolean) r1).booleanValue() != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x03bb, code lost:
    
        if (r11 != 0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x0357 -> B:23:0x035d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:118:0x03eb -> B:13:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.C3YM r35, long r36, long r38, X.InterfaceC67352kd<? super X.C3YD> r40) {
        /*
            Method dump skipped, instructions count: 1022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3YC.LJI(X.3YM, long, long, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(X.C3YM r20, long r21, long r23, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.model.RelationFetchResponse> r25) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3YC.LJII(X.3YM, long, long, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(X.InterfaceC70422pa r6, X.C3YM r7, boolean r8, X.InterfaceC67352kd<? super X.C76800UCe> r9) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3YC.LJIIJ(X.2pa, X.3YM, boolean, X.2kd):java.lang.Object");
    }
}
