package X;

import java.util.LinkedHashSet;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.3Yt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85913Yt {
    public static XKQ LIZJ;
    public static long LJFF;
    public static int LJI;
    public static InterfaceC73573Su9<Object> LJII;
    public static C73411SrX LJIIIIZZ;
    public static final C85913Yt LIZ = new C85913Yt();
    public static C64962gm LIZIZ = C48841JEv.LIZ(C78613UtF.LIZJ.plus(T2R.LJIIJJI()));
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C74392vz.LJLIL);
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C74372vx.LJLIL);
    public static final java.util.Set<String> LJIIIZ = new CopyOnWriteArraySet();
    public static final java.util.Set<String> LJIIJ = new LinkedHashSet();

    public static boolean LJII() {
        XKQ xkq = LIZJ;
        if (xkq != null) {
            return xkq.isCancelled();
        }
        return false;
    }

    public static void LJIIIIZZ(String str) {
        C34B.LJI("IMContactManager", str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0055, code lost:
    
        r13 = r15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0222  */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Integer] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x021c -> B:12:0x0048). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC67352kd<? super java.lang.Boolean> r23) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85913Yt.LIZJ(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.InterfaceC67352kd<? super java.lang.Boolean> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C3Z9
            if (r0 == 0) goto L5d
            r3 = r8
            X.3Z9 r3 = (X.C3Z9) r3
            int r2 = r3.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5d
            int r2 = r2 - r1
            r3.LJLJJI = r2
        L12:
            java.lang.Object r2 = r3.LJLILLLLZI
            X.NAu r1 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r3.LJLJJI
            r4 = 1
            if (r0 == 0) goto L35
            if (r0 != r4) goto L8b
            X.3Yt r1 = r3.LJLIL
            X.C141335gf.LIZJ(r2)
        L22:
            java.lang.Number r2 = (java.lang.Number) r2
            int r0 = r2.intValue()
            if (r0 != 0) goto L63
            r1.getClass()
            java.lang.String r0 = "enableFetchFullList: allow by DB empty"
            LJIIIIZZ(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L35:
            X.C141335gf.LIZJ(r2)
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            X.RBX r0 = (X.RBX) r0
            boolean r0 = r0.isLogin()
            if (r0 != 0) goto L4c
            java.lang.String r0 = "enableFetchFullList: limit by not login"
            LJIIIIZZ(r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L4c:
            X.3Z2 r0 = X.C3GK.LIZ()
            r3.LJLIL = r7
            r3.LJLJJI = r4
            java.lang.Object r2 = r0.LJFF(r3)
            if (r2 != r1) goto L5b
            return r1
        L5b:
            r1 = r7
            goto L22
        L5d:
            X.3Z9 r3 = new X.3Z9
            r3.<init>(r7, r8)
            goto L12
        L63:
            X.3ZG r0 = X.C3ZG.LIZ
            long r5 = java.lang.System.currentTimeMillis()
            com.bytedance.keva.Keva r3 = r0.LIZ()
            java.lang.String r2 = "key_contact_list_fetch_timestamp"
            r0 = 0
            long r0 = r3.getLong(r2, r0)
            long r5 = r5 - r0
            com.ss.android.ugc.aweme.contact.experiment.IMContactSetting$ContactUserListConfig r0 = com.ss.android.ugc.aweme.contact.experiment.IMContactSetting.LIZ()
            long r2 = r0.userListUpdateInterval
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r2 = r2 * r0
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 <= 0) goto L89
        L84:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L89:
            r4 = 0
            goto L84
        L8b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85913Yt.LJFF(X.2kd):java.lang.Object");
    }

    public static void LJIIIZ(int i, Throwable th) {
        StringBuilder LJ2 = C7MY.LJ("retryTimes= ", i, ", error=");
        String message = th.getMessage();
        if (message == null) {
            message = "null stack message";
        }
        LJ2.append(message);
        String LIZIZ2 = X1D.LIZIZ(LJ2);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("monitorDBUpdateError: errorStack=");
        LIZ2.append(LIZIZ2);
        LJIIIIZZ(X1D.LIZIZ(LIZ2));
        C34B.LJ("IMContactManager", th);
    }

    public static void LJIIJ(int i, long j) {
        C62822Ol8 c62822Ol8 = LJ;
        if (((Number) c62822Ol8.getValue()).longValue() == 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (j < ((Number) c62822Ol8.getValue()).longValue()) {
            LJI++;
            if (LJFF == 0) {
                LJFF = currentTimeMillis;
            }
            InterfaceC73573Su9<Object> interfaceC73573Su9 = LJII;
            if (interfaceC73573Su9 != null) {
                interfaceC73573Su9.onNext(new Object());
            }
            C3GS.LIZIZ(i, currentTimeMillis - j, currentTimeMillis - C3ZG.LIZ.LIZ().getLong("key_spotlight_relation_timestamp", 0L), true);
            return;
        }
        if (LJI > 0 && LJFF > 0) {
            C3GS.LIZ(currentTimeMillis - LJFF, 1, LJI);
            LJFF = 0L;
        }
        C73411SrX c73411SrX = LJIIIIZZ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        C3GS.LIZIZ(i, currentTimeMillis - j, currentTimeMillis - C3ZG.LIZ.LIZ().getLong("key_spotlight_relation_timestamp", 0L), false);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:28:0x0090
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0087 -> B:12:0x008d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.util.List<com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo> r8, X.InterfaceC67352kd<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C3Z7
            if (r0 == 0) goto L26
            r4 = r9
            X.3Z7 r4 = (X.C3Z7) r4
            int r2 = r4.LJLJJLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r4.LJLJJLL = r2
        L12:
            java.lang.Object r6 = r4.LJLJJI
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJLL
            r3 = 1
            if (r0 == 0) goto L34
            if (r0 != r3) goto L2c
            int r2 = r4.LJLJI
            java.lang.Object r8 = r4.LJLILLLLZI
            java.util.List r8 = (java.util.List) r8
            X.3Yt r1 = r4.LJLIL
            goto L8a
        L26:
            X.3Z7 r4 = new X.3Z7
            r4.<init>(r7, r9)
            goto L12
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            java.lang.String r0 = "doIMUserBaseInfoDBUpdate start: result="
            java.lang.StringBuilder r2 = X.C43881HKb.LIZIZ(r6, r0)
            if (r8 == 0) goto L6b
            r0 = r8
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
        L48:
            r2.append(r0)
            r0 = 32
            r2.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r2)
            LJIIIIZZ(r0)
            r2 = 0
            if (r8 == 0) goto L63
            r0 = r8
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L69
        L63:
            r0 = 1
        L64:
            if (r0 == 0) goto L6d
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L69:
            r0 = 0
            goto L64
        L6b:
            r0 = 0
            goto L48
        L6d:
            r1 = r7
        L6e:
            r0 = 2
            if (r2 >= r0) goto L9e
            boolean r0 = LJII()
            if (r0 != 0) goto L9e
            X.3Z2 r0 = X.C3GK.LIZ()     // Catch: java.lang.Throwable -> L90
            r4.LJLIL = r1     // Catch: java.lang.Throwable -> L90
            r4.LJLILLLLZI = r8     // Catch: java.lang.Throwable -> L90
            r4.LJLJI = r2     // Catch: java.lang.Throwable -> L90
            r4.LJLJJLL = r3     // Catch: java.lang.Throwable -> L90
            java.lang.Object r0 = r0.LIZJ(r8, r4)     // Catch: java.lang.Throwable -> L90
            if (r0 != r5) goto L8d
            goto L9d
        L8a:
            X.C141335gf.LIZJ(r6)     // Catch: java.lang.Throwable -> L92
        L8d:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L92
            goto L9c
        L90:
            r0 = move-exception
            goto L93
        L92:
            r0 = move-exception
        L93:
            r1.getClass()
            LJIIIZ(r2, r0)
            int r2 = r2 + 1
            goto L6e
        L9c:
            return r0
        L9d:
            return r5
        L9e:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85913Yt.LIZIZ(java.util.List, X.2kd):java.lang.Object");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:28:0x008a
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0081 -> B:12:0x0087). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.util.List<com.ss.android.ugc.aweme.contact.model.SharePermission> r8, X.InterfaceC67352kd<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C3Z8
            if (r0 == 0) goto L26
            r4 = r9
            X.3Z8 r4 = (X.C3Z8) r4
            int r2 = r4.LJLJJLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r4.LJLJJLL = r2
        L12:
            java.lang.Object r6 = r4.LJLJJI
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJLL
            r3 = 1
            if (r0 == 0) goto L34
            if (r0 != r3) goto L2c
            int r2 = r4.LJLJI
            java.lang.Object r8 = r4.LJLILLLLZI
            java.util.List r8 = (java.util.List) r8
            X.3Yt r1 = r4.LJLIL
            goto L84
        L26:
            X.3Z8 r4 = new X.3Z8
            r4.<init>(r7, r9)
            goto L12
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            java.lang.String r0 = "doSharePermissionDBUpdate start: result="
            java.lang.StringBuilder r2 = X.C43881HKb.LIZIZ(r6, r0)
            if (r8 == 0) goto L65
            int r1 = r8.size()
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
        L45:
            r2.append(r0)
            r0 = 32
            r2.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r2)
            LJIIIIZZ(r0)
            r2 = 0
            if (r8 == 0) goto L5d
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L63
        L5d:
            r0 = 1
        L5e:
            if (r0 == 0) goto L67
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L63:
            r0 = 0
            goto L5e
        L65:
            r0 = 0
            goto L45
        L67:
            r1 = r7
        L68:
            r0 = 2
            if (r2 >= r0) goto L98
            boolean r0 = LJII()
            if (r0 != 0) goto L98
            X.3ZA r0 = X.C3GL.LIZ()     // Catch: java.lang.Throwable -> L8a
            r4.LJLIL = r1     // Catch: java.lang.Throwable -> L8a
            r4.LJLILLLLZI = r8     // Catch: java.lang.Throwable -> L8a
            r4.LJLJI = r2     // Catch: java.lang.Throwable -> L8a
            r4.LJLJJLL = r3     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r0 = r0.LIZJ(r8, r4)     // Catch: java.lang.Throwable -> L8a
            if (r0 != r5) goto L87
            goto L97
        L84:
            X.C141335gf.LIZJ(r6)     // Catch: java.lang.Throwable -> L8c
        L87:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L8c
            goto L96
        L8a:
            r0 = move-exception
            goto L8d
        L8c:
            r0 = move-exception
        L8d:
            r1.getClass()
            LJIIIZ(r2, r0)
            int r2 = r2 + 1
            goto L68
        L96:
            return r0
        L97:
            return r5
        L98:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85913Yt.LJ(java.util.List, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.InterfaceC70422pa r6, X.InterfaceC67352kd<? super X.C76800UCe> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C3Z4
            if (r0 == 0) goto L49
            r4 = r7
            X.3Z4 r4 = (X.C3Z4) r4
            int r2 = r4.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L49
            int r2 = r2 - r1
            r4.LJLJJL = r2
        L12:
            java.lang.Object r3 = r4.LJLJI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r4.LJLJJL
            r0 = 1
            if (r1 == 0) goto L37
            if (r1 != r0) goto L5f
            X.2pa r6 = r4.LJLILLLLZI
            X.3Yt r1 = r4.LJLIL
            X.C141335gf.LIZJ(r3)
        L24:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r0 = r3.booleanValue()
            if (r0 != 0) goto L4f
            r1.getClass()
            java.lang.String r0 = "fetchRelationAsync: result=false"
            LJIIIIZZ(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L37:
            X.C141335gf.LIZJ(r3)
            r4.LJLIL = r5
            r4.LJLILLLLZI = r6
            r4.LJLJJL = r0
            java.lang.Object r3 = r5.LJFF(r4)
            if (r3 != r2) goto L47
            return r2
        L47:
            r1 = r5
            goto L24
        L49:
            X.3Z4 r4 = new X.3Z4
            r4.<init>(r5, r7)
            goto L12
        L4f:
            X.2vw r2 = new X.2vw
            r1 = 0
            r2.<init>(r1)
            r0 = 3
            X.XKQ r0 = X.XKX.LIZLLL(r6, r1, r1, r2, r0)
            X.C85913Yt.LIZJ = r0
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L5f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85913Yt.LJI(X.2pa, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJJI(com.ss.android.ugc.aweme.contact.model.IMUserProfileInfo r7, X.InterfaceC67352kd<? super X.C76800UCe> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C3Z5
            if (r0 == 0) goto L5f
            r5 = r8
            X.3Z5 r5 = (X.C3Z5) r5
            int r2 = r5.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5f
            int r2 = r2 - r1
            r5.LJLJJL = r2
        L12:
            java.lang.Object r1 = r5.LJLJI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJL
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 == r2) goto L26
            if (r0 != r3) goto L65
            X.C141335gf.LIZJ(r1)
        L23:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L26:
            com.ss.android.ugc.aweme.contact.model.IMUserProfileInfo r7 = r5.LJLILLLLZI
            com.ss.android.ugc.aweme.contact.model.IMUserProfileInfo r0 = r5.LJLIL
            X.C141335gf.LIZJ(r1)
            goto L49
        L2e:
            X.C141335gf.LIZJ(r1)
            if (r7 == 0) goto L23
            com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo r1 = r7.imUserBaseInfo
            if (r1 == 0) goto L48
            X.3Z2 r0 = X.C3GK.LIZ()
            r5.LJLIL = r7
            r5.LJLILLLLZI = r7
            r5.LJLJJL = r2
            java.lang.Object r0 = r0.LJIIJ(r1, r5)
            if (r0 != r4) goto L48
            return r4
        L48:
            r0 = r7
        L49:
            com.ss.android.ugc.aweme.contact.model.SharePermission r2 = r7.sharePermission
            if (r2 == 0) goto L23
            X.3ZA r1 = X.C3GL.LIZ()
            r5.LJLIL = r0
            r0 = 0
            r5.LJLILLLLZI = r0
            r5.LJLJJL = r3
            java.lang.Object r0 = r1.LJII(r2, r5)
            if (r0 != r4) goto L23
            return r4
        L5f:
            X.3Z5 r5 = new X.3Z5
            r5.<init>(r6, r8)
            goto L12
        L65:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85913Yt.LJIIJJI(com.ss.android.ugc.aweme.contact.model.IMUserProfileInfo, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|8))|71|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017e, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x017f, code lost:
    
        r2 = X.C85913Yt.LIZ;
        r0 = "updateIMUserBaseInfo user/profile: error=" + r3.getMessage();
        r2.getClass();
        LJIIIIZZ(r0);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x001b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031 A[Catch: Exception -> 0x017e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x017e, blocks: (B:15:0x0031, B:17:0x015c, B:18:0x015f, B:20:0x0163, B:22:0x0167, B:24:0x016f, B:51:0x0143), top: B:7:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x017c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(com.ss.android.ugc.aweme.contact.model.IMContactEvent r13, X.InterfaceC67352kd<? super X.C76800UCe> r14) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85913Yt.LJIIL(com.ss.android.ugc.aweme.contact.model.IMContactEvent, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(com.ss.android.ugc.aweme.contact.model.IMUserProfileInfo r11, X.InterfaceC67352kd<? super X.C76800UCe> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof X.C3Z3
            if (r0 == 0) goto L96
            r7 = r12
            X.3Z3 r7 = (X.C3Z3) r7
            int r2 = r7.LJLJJLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L96
            int r2 = r2 - r1
            r7.LJLJJLL = r2
        L12:
            java.lang.Object r3 = r7.LJLJJI
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJJLL
            r8 = 3
            r2 = 2
            r1 = 1
            r5 = 0
            if (r0 == 0) goto L38
            if (r0 == r1) goto L2a
            if (r0 == r2) goto L6a
            if (r0 != r8) goto L9d
            X.C141335gf.LIZJ(r3)
        L27:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L2a:
            java.lang.Object r4 = r7.LJLJI
            com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo r4 = (com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo) r4
            java.lang.Object r11 = r7.LJLILLLLZI
            com.ss.android.ugc.aweme.contact.model.IMUserProfileInfo r11 = (com.ss.android.ugc.aweme.contact.model.IMUserProfileInfo) r11
            com.ss.android.ugc.aweme.contact.model.IMUserProfileInfo r9 = r7.LJLIL
            X.C141335gf.LIZJ(r3)
            goto L53
        L38:
            X.C141335gf.LIZJ(r3)
            com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo r4 = r11.imUserBaseInfo
            if (r4 == 0) goto L27
            X.3Z2 r0 = X.C3GK.LIZ()
            r7.LJLIL = r11
            r7.LJLILLLLZI = r11
            r7.LJLJI = r4
            r7.LJLJJLL = r1
            java.lang.Object r0 = r0.LJIIJ(r4, r7)
            if (r0 != r6) goto L52
            return r6
        L52:
            r9 = r11
        L53:
            com.ss.android.ugc.aweme.contact.model.SharePermission r1 = r11.sharePermission
            if (r1 == 0) goto L7c
            X.3ZA r0 = X.C3GL.LIZ()
            r7.LJLIL = r9
            r7.LJLILLLLZI = r4
            r7.LJLJI = r1
            r7.LJLJJLL = r2
            java.lang.Object r0 = r0.LJII(r1, r7)
            if (r0 != r6) goto L77
            return r6
        L6a:
            java.lang.Object r1 = r7.LJLJI
            com.ss.android.ugc.aweme.contact.model.SharePermission r1 = (com.ss.android.ugc.aweme.contact.model.SharePermission) r1
            java.lang.Object r4 = r7.LJLILLLLZI
            com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo r4 = (com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo) r4
            com.ss.android.ugc.aweme.contact.model.IMUserProfileInfo r9 = r7.LJLIL
            X.C141335gf.LIZJ(r3)
        L77:
            java.lang.Integer r3 = r1.getUserShareStatus()
            goto L7d
        L7c:
            r3 = r5
        L7d:
            X.3Yt r2 = X.C85913Yt.LIZ
            long r0 = r4.getUserId()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.LJLIL = r9
            r7.LJLILLLLZI = r5
            r7.LJLJI = r5
            r7.LJLJJLL = r8
            java.lang.Object r0 = r2.LIZ(r0, r4, r3, r7)
            if (r0 != r6) goto L27
            return r6
        L96:
            X.3Z3 r7 = new X.3Z3
            r7.<init>(r10, r12)
            goto L12
        L9d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85913Yt.LJIILJJIL(com.ss.android.ugc.aweme.contact.model.IMUserProfileInfo, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c4, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILLIIL(com.ss.android.ugc.aweme.contact.model.SharePermission r18, X.InterfaceC67352kd<? super X.C76800UCe> r19) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85913Yt.LJIILLIIL(com.ss.android.ugc.aweme.contact.model.SharePermission, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILIIL(com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo r11, com.ss.android.ugc.aweme.contact.model.IMContactEvent r12, X.InterfaceC67352kd<? super X.C76800UCe> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof X.C3Z1
            if (r0 == 0) goto L7a
            r5 = r13
            X.3Z1 r5 = (X.C3Z1) r5
            int r2 = r5.LJLJJLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7a
            int r2 = r2 - r1
            r5.LJLJJLL = r2
        L12:
            java.lang.Object r1 = r5.LJLJJI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJLL
            r6 = 2
            r9 = 1
            if (r0 == 0) goto L30
            if (r0 == r9) goto L26
            if (r0 != r6) goto L80
            X.C141335gf.LIZJ(r1)
        L23:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L26:
            com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo r0 = r5.LJLJI
            com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo r3 = r5.LJLILLLLZI
            com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo r11 = r5.LJLIL
            X.C141335gf.LIZJ(r1)
            goto L60
        L30:
            X.C141335gf.LIZJ(r1)
            com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo r3 = r12.getBase()
            if (r3 == 0) goto L23
            long r7 = r11.getUpdateTime()
            long r1 = r3.getUpdateTime()
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 >= 0) goto L23
            long r0 = r3.getUpdateTime()
            r11.setUpdateTime(r0)
            X.3Z2 r0 = X.C3GK.LIZ()
            r5.LJLIL = r11
            r5.LJLILLLLZI = r3
            r5.LJLJI = r3
            r5.LJLJJLL = r9
            java.lang.Object r0 = r0.LJI(r11, r5)
            if (r0 != r4) goto L5f
            return r4
        L5f:
            r0 = r3
        L60:
            X.3Yt r2 = X.C85913Yt.LIZ
            long r0 = r0.getUserId()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r5.LJLIL = r3
            r0 = 0
            r5.LJLILLLLZI = r0
            r5.LJLJI = r0
            r5.LJLJJLL = r6
            java.lang.Object r0 = r2.LIZ(r1, r11, r0, r5)
            if (r0 != r4) goto L23
            return r4
        L7a:
            X.3Z1 r5 = new X.3Z1
            r5.<init>(r10, r13)
            goto L12
        L80:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85913Yt.LJIILIIL(com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo, com.ss.android.ugc.aweme.contact.model.IMContactEvent, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (r1.intValue() != r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r18, com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo r19, java.lang.Integer r20, X.InterfaceC67352kd<? super X.C76800UCe> r21) {
        /*
            r17 = this;
            r4 = r21
            r2 = r18
            r8 = r20
            r7 = r19
            boolean r0 = r4 instanceof X.C85973Yz
            if (r0 == 0) goto L99
            r10 = r4
            X.3Yz r10 = (X.C85973Yz) r10
            int r3 = r10.LJLJJLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L99
            int r3 = r3 - r1
            r10.LJLJJLL = r3
        L1a:
            java.lang.Object r1 = r10.LJLJJI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r10.LJLJJLL
            r15 = 0
            r4 = 2
            r9 = 1
            if (r0 == 0) goto L2f
            if (r0 == r9) goto L7b
            if (r0 != r4) goto La2
            X.C141335gf.LIZJ(r1)
        L2c:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L2f:
            X.C141335gf.LIZJ(r1)
            com.ss.android.ugc.aweme.im.service.IIMService r0 = com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService.createIIMServicebyMonsterPlugin(r15)
            X.3Zl r0 = r0.getImMafService()
            com.ss.android.ugc.aweme.social.model.MAFIMUser r6 = r0.LIZLLL(r2)
            if (r6 == 0) goto L57
            X.3Yt r5 = X.C85913Yt.LIZ
            r10.LJLIL = r2
            r10.LJLILLLLZI = r7
            r10.LJLJI = r8
            r10.LJLJJLL = r9
            java.lang.Object r0 = r5.LJIILL(r6, r7, r8, r9, r10)
            if (r0 != r3) goto L88
            return r3
        L51:
            int r1 = r1.intValue()
            if (r1 != r0) goto L96
        L57:
            com.ss.android.ugc.aweme.im.service.IIMService r0 = com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService.createIIMServicebyMonsterPlugin(r15)
            X.3GF r0 = r0.getImUserService()
            com.ss.android.ugc.aweme.im.service.model.IMUser r12 = r0.LJIIL(r2)
            if (r12 == 0) goto L2c
            X.3Yt r11 = X.C85913Yt.LIZ
            r0 = 0
            r10.LJLIL = r0
            r10.LJLILLLLZI = r0
            r10.LJLJI = r0
            r10.LJLJJLL = r4
            r13 = r7
            r14 = r8
            r16 = r10
            java.lang.Object r0 = r11.LJIILL(r12, r13, r14, r15, r16)
            if (r0 != r3) goto L2c
            return r3
        L7b:
            java.lang.Object r8 = r10.LJLJI
            java.lang.Integer r8 = (java.lang.Integer) r8
            com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo r7 = r10.LJLILLLLZI
            java.lang.Object r2 = r10.LJLIL
            java.lang.String r2 = (java.lang.String) r2
            X.C141335gf.LIZJ(r1)
        L88:
            if (r7 == 0) goto L96
            java.lang.Integer r1 = r7.getFollowStatus()
            X.3ZE r0 = X.C3ZE.FOLLOW_EACH_OTHER
            int r0 = r0.getStatus()
            if (r1 != 0) goto L51
        L96:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L99:
            X.3Yz r10 = new X.3Yz
            r0 = r17
            r10.<init>(r0, r4)
            goto L1a
        La2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85913Yt.LIZ(java.lang.String, com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo, java.lang.Integer, X.2kd):java.lang.Object");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:31:0x00bd
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.Integer r15, java.lang.Integer r16, int r17, int r18, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.contact.model.IMContactListResponse> r19) {
        /*
            r14 = this;
            r3 = r19
            r9 = r15
            r10 = r16
            r12 = r18
            r6 = r17
            boolean r0 = r3 instanceof X.C85953Yx
            if (r0 == 0) goto L37
            r13 = r3
            X.3Yx r13 = (X.C85953Yx) r13
            int r2 = r13.LJLJLLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L37
            int r2 = r2 - r1
            r13.LJLJLLL = r2
        L1b:
            java.lang.Object r1 = r13.LJLJL
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r13.LJLJLLL
            r4 = 1
            if (r0 == 0) goto L4a
            if (r0 != r4) goto L42
            int r2 = r13.LJLJJLL
            int r12 = r13.LJLJJL
            int r6 = r13.LJLJJI
            java.lang.Object r10 = r13.LJLJI
            java.lang.Integer r10 = (java.lang.Integer) r10
            java.lang.Object r9 = r13.LJLILLLLZI
            java.lang.Integer r9 = (java.lang.Integer) r9
            X.3Yt r3 = r13.LJLIL
            goto L3d
        L37:
            X.3Yx r13 = new X.3Yx
            r13.<init>(r14, r3)
            goto L1b
        L3d:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Throwable -> L50
            goto Lc4
        L42:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L4a:
            X.C141335gf.LIZJ(r1)
            r3 = r14
            r2 = 0
            goto L8e
        L50:
            r8 = move-exception
        L51:
            r3.getClass()
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "retryTimes= "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", error="
            r1.append(r0)
            java.lang.String r0 = r8.getMessage()
            if (r0 != 0) goto L6d
            java.lang.String r0 = "null stack message"
        L6d:
            r1.append(r0)
            java.lang.String r7 = X.X1D.LIZIZ(r1)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "monitorNetworkRequestError: errorStack="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            LJIIIIZZ(r0)
            java.lang.String r0 = "IMContactManager"
            X.C34B.LJ(r0, r8)
            int r2 = r2 + 1
        L8e:
            com.ss.android.ugc.aweme.contact.experiment.IMContactSetting$ContactUserListConfig r0 = com.ss.android.ugc.aweme.contact.experiment.IMContactSetting.LIZ()
            int r0 = r0.userListRequestRetryCount
            if (r2 >= r0) goto Lc5
            boolean r0 = LJII()
            if (r0 != 0) goto Lc5
            X.2wK r0 = com.ss.android.ugc.aweme.contact.data.api.IMContactApi.LIZ     // Catch: java.lang.Throwable -> Lbf
            r0.getClass()     // Catch: java.lang.Throwable -> Lbf
            com.ss.android.ugc.aweme.contact.data.api.IMContactApi r8 = X.C74602wK.LIZ()     // Catch: java.lang.Throwable -> Lbf
            java.lang.Integer r11 = new java.lang.Integer     // Catch: java.lang.Throwable -> Lbf
            r11.<init>(r6)     // Catch: java.lang.Throwable -> Lbf
            r13.LJLIL = r3     // Catch: java.lang.Throwable -> Lbf
            r13.LJLILLLLZI = r9     // Catch: java.lang.Throwable -> Lbf
            r13.LJLJI = r10     // Catch: java.lang.Throwable -> Lbf
            r13.LJLJJI = r6     // Catch: java.lang.Throwable -> Lbf
            r13.LJLJJL = r12     // Catch: java.lang.Throwable -> Lbf
            r13.LJLJJLL = r2     // Catch: java.lang.Throwable -> Lbf
            r13.LJLJLLL = r4     // Catch: java.lang.Throwable -> Lbf
            java.lang.Object r1 = r8.getUserList(r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> Lbd
            goto Lc1
        Lbd:
            r8 = move-exception
            goto L51
        Lbf:
            r8 = move-exception
            goto L51
        Lc1:
            if (r1 != r5) goto Lc4
            return r5
        Lc4:
            return r1
        Lc5:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85913Yt.LIZLLL(java.lang.Integer, java.lang.Integer, int, int, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:1|(2:3|(16:5|6|(1:(1:(1:(7:11|12|(4:15|(2:17|18)(1:20)|19|13)|21|22|23|24)(2:29|30))(12:31|32|(2:35|33)|36|37|(1:39)|12|(1:13)|21|22|23|24))(1:40))(9:44|(14:46|(1:48)(1:96)|49|(1:51)|52|(1:54)(1:95)|55|(3:57|(1:59)(1:61)|60)|62|(1:64)(1:94)|65|(3:67|(1:69)|70)|71|(2:73|(1:77)))(1:97)|(0)(1:83)|84|(1:86)(1:92)|87|(2:89|(1:91))|23|24)|41|(1:43)|32|(1:33)|36|37|(0)|12|(1:13)|21|22|23|24))|98|6|(0)(0)|41|(0)|32|(1:33)|36|37|(0)|12|(1:13)|21|22|23|24) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0206, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0207, code lost:
    
        X.C85913Yt.LIZ.getClass();
        X.C34B.LJ("IMContactManager", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x015c, code lost:
    
        if (r10 != false) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a5 A[LOOP:1: B:33:0x019f->B:35:0x01a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0188 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILL(com.ss.android.ugc.aweme.im.service.model.IMUser r14, com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo r15, java.lang.Integer r16, boolean r17, X.InterfaceC67352kd<? super X.C76800UCe> r18) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85913Yt.LJIILL(com.ss.android.ugc.aweme.im.service.model.IMUser, com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo, java.lang.Integer, boolean, X.2kd):java.lang.Object");
    }
}
