package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AQV implements InterfaceC236979Rt, LEA {
    public static final AQV LJLIL;
    public static final C26222AQw LJLILLLLZI;
    public static long LJLJI;
    public static final CopyOnWriteArrayList<AQP> LJLJJI;
    public static C64962gm LJLJJL;
    public static XKQ LJLJJLL;
    public static final IAccountUserService LJLJL;
    public static volatile EnumC237029Ry LJLJLJ;
    public static volatile boolean LJLJLLL;

    static {
        AQV aqv = new AQV();
        LJLIL = aqv;
        C26222AQw c26222AQw = new C26222AQw("OfflineModeManager");
        LJLILLLLZI = c26222AQw;
        LJLJI = System.currentTimeMillis();
        LJLJJI = new CopyOnWriteArrayList<>();
        C64962gm LIZ = C48841JEv.LIZ(C78613UtF.LIZJ);
        LJLJJL = LIZ;
        LJLJJLL = XKX.LIZLLL(LIZ, null, XKY.LAZY, new C9TQ(null), 1);
        LJLJL = HG3.LJIILL();
        LJLJLJ = EnumC237029Ry.SYSTEM_RESUME;
        c26222AQw.LJIIIIZZ("OfflineMoManager init");
        if (C26212AQm.LIZ()) {
            AQO.LIZ();
            HG3.LJIIL();
            HG3.LJLJL.LJIILJJIL(aqv);
            LLIIIILZ();
        }
    }

    @Override // X.InterfaceC236979Rt
    public final void LJJZZI() {
        if (LJLJLLL) {
            return;
        }
        LJLJLLL = true;
        AQW.LIZ.getClass();
        AQW.LIZJ();
        new C2YK().LIZ(C26204AQe.LJLIL);
    }

    @Override // X.InterfaceC236979Rt
    public final void LJZL() {
        LJLILLLLZI.LJIIIIZZ("pauseDownload()");
        LJLJJLL.LIZIZ(null);
        AQW.LIZ.getClass();
        AQW.LJIIJJI(true);
    }

    @Override // X.InterfaceC236979Rt
    public final C9SO LLF() {
        AQW.LIZ.getClass();
        return AQW.LIZIZ();
    }

    @Override // X.InterfaceC236979Rt
    public final boolean LLIFFJFJJ() {
        if (LJLJI - AQO.LIZLLL().getLong("key_last_update_cache_time", 0L) > 172800000) {
            return true;
        }
        return false;
    }

    public static void LLIIIILZ() {
        C9SN c9sn;
        int i = C9SR.LIZ[AQO.LIZJ().ordinal()];
        if ((i == 1 || i == 2 || i == 3) && AQO.LIZIZ() < AQO.LIZ()) {
            if (!C48203Ivv.LJ(EF7.LIZIZ())) {
                c9sn = C9SN.PAUSE_NO_NETWORK;
            } else if (AQO.LJ() && !C48203Ivv.LJFF(EF7.LIZIZ())) {
                c9sn = C9SN.PAUSE_NOT_WIFI;
            } else {
                c9sn = C9SN.DOWNLOADING;
            }
            AQO.LJIIIIZZ(c9sn);
        }
        XKX.LIZLLL(LJLJJL, null, null, new AQQ(null), 3);
    }

    @Override // X.InterfaceC236979Rt
    public final int LIZIZ() {
        return AQO.LIZ();
    }

    @Override // X.InterfaceC236979Rt
    public final boolean LJIIIZ() {
        return AQO.LIZLLL().getBoolean("key_first_enter_setting_panel", true);
    }

    @Override // X.InterfaceC236979Rt
    public final boolean LJJIIJZLJL() {
        return AQO.LIZLLL().getBoolean("key_first_enter_panel", true);
    }

    @Override // X.InterfaceC236979Rt
    public final void LJJIJ() {
        AQO.LIZLLL().LJI("key_first_enter_setting_panel", false);
    }

    @Override // X.InterfaceC236979Rt
    public final boolean LJJIZ() {
        return AQO.LJ();
    }

    @Override // X.InterfaceC236979Rt
    public final void LJJJJIZL() {
        AQO.LIZLLL().LJI("key_first_enter_panel", false);
    }

    @Override // X.InterfaceC236979Rt
    public final C9SN LJJLIIIJLJLI() {
        return AQO.LIZJ();
    }

    @Override // X.InterfaceC236979Rt
    public final int LJJLIIIJLLLLLLLZ() {
        return AQO.LIZIZ();
    }

    @Override // X.InterfaceC236979Rt
    public final Object LJZ() {
        InterfaceC26200AQa LIZJ = AQY.LIZJ();
        String curSecUserId = AQY.LIZ.getCurSecUserId();
        if (curSecUserId == null) {
            return C61878OQg.INSTANCE;
        }
        LJLIL.getClass();
        return LIZJ.LJFF(LJLJI, curSecUserId);
    }

    @Override // X.InterfaceC236979Rt
    public final double LLFF() {
        return AQO.LIZLLL().getDouble("key_cached_size", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
    }

    public static void LJJJIL(List aidList) {
        List<String> LJ;
        Object obj;
        o.LJIIIZ(aidList, "aidList");
        Iterator<AQP> it = LJLJJI.iterator();
        while (it.hasNext()) {
            it.next().Xk0(aidList);
        }
        AQW.LIZ.getClass();
        C26222AQw c26222AQw = AQW.LIZLLL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("clear cache videos: ");
        LIZ.append(aidList);
        c26222AQw.LJIIIIZZ(X1D.LIZIZ(LIZ));
        if (!aidList.isEmpty()) {
            Iterator it2 = aidList.iterator();
            while (it2.hasNext()) {
                C47242IgQ.LIZ().removePriorityTaskByContextKey((String) it2.next());
            }
            InterfaceC26200AQa LIZJ = AQY.LIZJ();
            String curSecUserId = AQY.LIZ.getCurSecUserId();
            if (curSecUserId == null) {
                LJ = C61878OQg.INSTANCE;
            } else {
                LJ = LIZJ.LJ(curSecUserId, aidList);
            }
            try {
                AQW.LIZLLL.LJIIIIZZ("in clearOfflineFileByUrlKeys()");
                File file = new File(AQW.LJII());
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    long j = 0;
                    for (File file2 : listFiles) {
                        ArrayList arrayList = new ArrayList();
                        for (String str : LJ) {
                            if (C78685UuP.LJJJZ(str)) {
                                arrayList.add(str);
                            }
                        }
                        Iterator it3 = arrayList.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj = it3.next();
                                o.LJIIIIZZ(file2, "file");
                                if (ujb.o.LJJJLIIL(OR7.LLLIL(file2), (String) obj, false)) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        String str2 = (String) obj;
                        if (C78685UuP.LJJJZ(str2)) {
                            linkedHashSet.add(str2);
                            j += file2.length();
                            C16880lQ.LLLZZIL(file2);
                        }
                    }
                    if (j > 0) {
                        AQW.LJIIIIZZ(linkedHashSet.size(), j, AQU.AUTO_CLEAR);
                    }
                }
            } catch (Exception e) {
                C26222AQw c26222AQw2 = AQW.LIZLLL;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("clearOfflineFileByUrlKeys file failed ");
                LIZ2.append(e);
                c26222AQw2.LIZLLL(X1D.LIZIZ(LIZ2));
            }
        }
        String curSecUserId2 = AQY.LIZ.getCurSecUserId();
        if (curSecUserId2 != null) {
            AQY.LIZJ().LIZLLL(curSecUserId2, aidList);
        }
        AQW.LIZ.getClass();
        AQO.LJI(AQW.LJI() / 1024.0d);
        AQO.LJII(AQY.LIZIZ());
        if (AQO.LIZIZ() < AQO.LIZ() && AQO.LIZJ() == C9SN.DOWNLOADED) {
            AQO.LJIIIIZZ(C9SN.DOWNLOADING);
        }
    }

    @Override // X.InterfaceC236979Rt
    public final void LJJIL(AQP listener) {
        o.LJIIIZ(listener, "listener");
        LJLJJI.remove(listener);
    }

    @Override // X.InterfaceC236979Rt
    public final void LJJJJL(boolean z) {
        AQO.LJIIIZ(z);
        if (!C48203Ivv.LJ(EF7.LIZIZ())) {
            if (AQO.LIZJ() == C9SN.DOWNLOADING) {
                LJLILLLLZI.LJIIIIZZ("no network show pause_no_network");
                AQW.LIZ.getClass();
                AQW.LJIIJJI(false);
                AQW.LJIIIZ(C9SO.NO_NET.getValue());
                AQO.LJIIIIZZ(C9SN.PAUSE_NO_NETWORK);
                return;
            }
            return;
        }
        if (C48203Ivv.LJFF(EF7.LIZIZ())) {
            return;
        }
        C9SN LIZJ = AQO.LIZJ();
        C9SN c9sn = C9SN.DOWNLOADING;
        if (LIZJ == c9sn && AQO.LJ()) {
            LJLILLLLZI.LJIIIIZZ("not wifi show pause_not_wifi");
            AQW.LIZ.getClass();
            AQW.LJIIJJI(false);
            AQW.LJIIIZ(C9SO.NOT_WIFI.getValue());
            AQO.LJIIIIZZ(C9SN.PAUSE_NOT_WIFI);
            return;
        }
        if (!AQO.LIZJ().isPauseByNet() || AQO.LJ()) {
            return;
        }
        LJLILLLLZI.LJIIIIZZ("mobile show downloading");
        LJLLLL(EnumC237029Ry.SYSTEM_RESUME);
        AQW aqw = AQW.LIZ;
        EnumC237029Ry enumC237029Ry = EnumC237029Ry.USER_RESUME;
        aqw.getClass();
        AQW.LJIIJ(enumC237029Ry);
        AQO.LJIIIIZZ(c9sn);
    }

    @Override // X.InterfaceC236979Rt
    public final Object LJJLIIIJ(String str) {
        Integer num;
        InterfaceC26200AQa LIZJ = AQY.LIZJ();
        String curSecUserId = AQY.LIZ.getCurSecUserId();
        if (curSecUserId == null) {
            num = new Integer(0);
        } else {
            num = new Integer(LIZJ.LJIILJJIL(curSecUserId, str));
        }
        if (num == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return num;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC236979Rt
    public final void LJJLJLI(AQP listener) {
        o.LJIIIZ(listener, "listener");
        LJLJJI.add(listener);
    }

    @Override // X.InterfaceC236979Rt
    public final void LJLJLJ(int i) {
        C26222AQw c26222AQw = LJLILLLLZI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setCacheCount: ");
        LIZ.append(i);
        c26222AQw.LJIIIIZZ(X1D.LIZIZ(LIZ));
        if (i > AQO.LIZ() && AQO.LIZJ() == C9SN.DOWNLOADED) {
            AQW.LIZ.getClass();
            AQW.LJIIJJI(true);
            AQO.LJFF(i);
            return;
        }
        if (i <= AQO.LIZ() && AQO.LIZIZ() >= i) {
            AQO.LJIIIIZZ(C9SN.DOWNLOADED);
            AQO.LJFF(i);
            AQW.LIZ.getClass();
            AQW.LJIIJJI(false);
            if (AQO.LIZIZ() > i) {
                XKX.LIZLLL(LJLJJL, null, null, new C238559Xv(i, null), 3);
                return;
            }
        }
        AQW.LIZ.getClass();
        AQW.LJIIJJI(false);
        AQO.LJFF(i);
    }

    @Override // X.InterfaceC236979Rt
    public final void LJLLLL(EnumC237029Ry startReason) {
        o.LJIIIZ(startReason, "startReason");
        if (LJLJJLL.isActive() || LJLJJLL.isCompleted() || LJLJJLL.isCancelled()) {
            LJLJJLL.LIZIZ(null);
            AQW.LIZ.getClass();
            AQW.LJIIJJI(false);
            LJLJJLL = XKX.LIZLLL(LJLJJL, null, XKY.LAZY, new C9TQ(null), 1);
        }
        LJLJLJ = startReason;
        LJLJJLL.LJIILL();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    @Override // X.InterfaceC236979Rt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLFFF(X.InterfaceC67352kd<? super X.C76800UCe> r14) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AQV.LLFFF(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v4, types: [X.OQg] */
    @Override // X.InterfaceC236979Rt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(int r9, X.InterfaceC67352kd<? super X.C240059bV> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C26201AQb
            if (r0 == 0) goto L8a
            r7 = r10
            X.AQb r7 = (X.C26201AQb) r7
            int r2 = r7.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8a
            int r2 = r2 - r1
            r7.LJLJJL = r2
        L12:
            java.lang.Object r6 = r7.LJLJI
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJJL
            r4 = 1
            if (r0 == 0) goto L3f
            if (r0 != r4) goto L90
            int r3 = r7.LJLILLLLZI
            int r9 = r7.LJLIL
            X.C141335gf.LIZJ(r6)
        L24:
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            int r0 = r0 + r9
            if (r0 >= r3) goto L33
            X.9bV r2 = new X.9bV
            r2.<init>(r6, r4)
        L32:
            return r2
        L33:
            X.9bV r2 = new X.9bV
            int r3 = r3 - r9
            r1 = 0
            java.util.List r0 = r6.subList(r1, r3)
            r2.<init>(r0, r1)
            goto L32
        L3f:
            X.C141335gf.LIZJ(r6)
            int r3 = X.AQO.LIZ()
            r7.LJLIL = r9
            r7.LJLILLLLZI = r3
            r7.LJLJJL = r4
            X.AQa r6 = X.AQY.LIZJ()
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.AQY.LIZ
            java.lang.String r2 = r0.getCurSecUserId()
            if (r2 != 0) goto L5d
            X.OQg r6 = X.C61878OQg.INSTANCE
        L5a:
            if (r6 != r5) goto L24
            return r5
        L5d:
            X.AQV r0 = X.AQV.LJLIL
            r0.getClass()
            long r0 = X.AQV.LJLJI
            java.util.List r0 = r6.LJIILL(r0, r9, r2)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r2 = r0.iterator()
        L71:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L5a
            java.lang.Object r0 = r2.next()
            X.YWs r0 = (X.C87526YWs) r0
            X.RCZ r1 = r0.LJLJI
            r0 = 0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = com.ss.android.ugc.tiktok.ConvertHelper.com$ss$ugc$aweme$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme(r1, r0)
            if (r0 == 0) goto L71
            r6.add(r0)
            goto L71
        L8a:
            X.AQb r7 = new X.AQb
            r7.<init>(r8, r10)
            goto L12
        L90:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AQV.LJIIJ(int, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:67|(1:69)(1:86)|70|71|72|(2:74|75)|76|77|78|79|37|(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(4:5|6|7|8))|114|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x014d, code lost:
    
        r12 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02d1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02d2, code lost:
    
        X.AQV.LJLILLLLZI.LIZLLL(java.lang.String.valueOf(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x029e, code lost:
    
        r12 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02a1, code lost:
    
        r12 = e;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0021. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00af A[Catch: Exception -> 0x02d1, TryCatch #4 {Exception -> 0x02d1, blocks: (B:13:0x0035, B:15:0x003d, B:17:0x0040, B:19:0x006b, B:23:0x00a1, B:24:0x00a9, B:26:0x00af, B:28:0x00ba, B:30:0x00c2, B:32:0x00c6, B:33:0x00c9, B:36:0x00fc, B:39:0x016a, B:82:0x014e, B:92:0x02aa, B:95:0x02c8, B:100:0x009e, B:102:0x00f9, B:110:0x02c5), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ba A[Catch: Exception -> 0x02d1, TryCatch #4 {Exception -> 0x02d1, blocks: (B:13:0x0035, B:15:0x003d, B:17:0x0040, B:19:0x006b, B:23:0x00a1, B:24:0x00a9, B:26:0x00af, B:28:0x00ba, B:30:0x00c2, B:32:0x00c6, B:33:0x00c9, B:36:0x00fc, B:39:0x016a, B:82:0x014e, B:92:0x02aa, B:95:0x02c8, B:100:0x009e, B:102:0x00f9, B:110:0x02c5), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016a A[Catch: Exception -> 0x02d1, TryCatch #4 {Exception -> 0x02d1, blocks: (B:13:0x0035, B:15:0x003d, B:17:0x0040, B:19:0x006b, B:23:0x00a1, B:24:0x00a9, B:26:0x00af, B:28:0x00ba, B:30:0x00c2, B:32:0x00c6, B:33:0x00c9, B:36:0x00fc, B:39:0x016a, B:82:0x014e, B:92:0x02aa, B:95:0x02c8, B:100:0x009e, B:102:0x00f9, B:110:0x02c5), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0202 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0203 A[Catch: Exception -> 0x014d, TryCatch #1 {Exception -> 0x014d, blocks: (B:53:0x01be, B:57:0x01fe, B:61:0x0203, B:64:0x020a, B:66:0x0210, B:67:0x021c, B:69:0x0223, B:70:0x022a, B:86:0x0226, B:104:0x0117, B:106:0x01fb, B:108:0x0148), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0210 A[Catch: Exception -> 0x014d, TryCatch #1 {Exception -> 0x014d, blocks: (B:53:0x01be, B:57:0x01fe, B:61:0x0203, B:64:0x020a, B:66:0x0210, B:67:0x021c, B:69:0x0223, B:70:0x022a, B:86:0x0226, B:104:0x0117, B:106:0x01fb, B:108:0x0148), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x021c A[Catch: Exception -> 0x014d, TryCatch #1 {Exception -> 0x014d, blocks: (B:53:0x01be, B:57:0x01fe, B:61:0x0203, B:64:0x020a, B:66:0x0210, B:67:0x021c, B:69:0x0223, B:70:0x022a, B:86:0x0226, B:104:0x0117, B:106:0x01fb, B:108:0x0148), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.2kd] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0219 -> B:37:0x0167). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJLL(X.EnumC237029Ry r17, X.InterfaceC67352kd<? super X.C76800UCe> r18) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AQV.LJJJLL(X.9Ry, X.2kd):java.lang.Object");
    }

    @Override // X.LEA
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (z) {
            LJLJI = System.currentTimeMillis();
            C48841JEv.LIZJ(LJLJJL, null);
            LJLJJLL.LIZIZ(null);
            XIA xia = C78613UtF.LIZJ;
            LJLJJL = C48841JEv.LIZ(xia);
            LJLJJI.clear();
            LJLJLJ = EnumC237029Ry.SYSTEM_RESUME;
            AQW.LIZ.getClass();
            try {
                C48841JEv.LIZJ(AQW.LIZIZ, null);
                AQW.LIZIZ = C48841JEv.LIZ(xia);
                AQW.LIZJ = false;
            } catch (Exception e) {
                C26222AQw c26222AQw = AQW.LIZLLL;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onLoginOrLogoutSuccess failed ");
                LIZ.append(e);
                c26222AQw.LIZLLL(X1D.LIZIZ(LIZ));
            }
            AQW.LIZ.getClass();
            AQW.LIZJ();
            new C2YK().LIZ(C26203AQd.LJLIL);
            LLIIIILZ();
        }
    }
}
