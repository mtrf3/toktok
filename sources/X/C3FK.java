package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.im.sdk.common.controller.abtest.SharePanelContactStrategyModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.social.model.MAFIMUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3FK, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3FK {
    public static final C3FK LIZ = new C3FK();
    public static long LIZIZ = -1;
    public static final int LIZJ;
    public static final int LIZLLL;
    public static final int LJ;

    static {
        int i;
        SharePanelContactStrategyModel LIZIZ2 = C80893Fl.LIZIZ();
        if (LIZIZ2 != null) {
            i = LIZIZ2.displayCount;
        } else {
            i = 15;
        }
        LIZJ = i;
        LIZLLL = Q7K.LIZIZ("im_multi_relation_uid_limit", 50);
        LJ = ((Number) C3FR.LIZ.getValue()).intValue();
    }

    public static List LIZJ(ArrayList arrayList, List list) {
        ArrayList LJ2 = AnonymousClass391.LJ(list, "rawList");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            IMContact iMContact = (IMContact) it.next();
            if (iMContact instanceof MAFIMUser) {
                IMUser iMUser = (IMUser) iMContact;
                if (!linkedHashSet.contains(iMUser.getUid())) {
                    String uid = iMUser.getUid();
                    o.LJIIIIZZ(uid, "imContact.uid");
                    linkedHashSet.add(uid);
                    LJ2.add(iMContact);
                } else if (arrayList != null) {
                    arrayList.add(iMContact);
                }
            } else if (iMContact instanceof IMUser) {
                String uid2 = ((IMUser) iMContact).getUid();
                o.LJIIIIZZ(uid2, "imContact.uid");
                linkedHashSet.add(uid2);
                LJ2.add(iMContact);
            } else {
                LJ2.add(iMContact);
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("filter MaFIMUser, after list size: ");
        LIZ2.append(LJ2.size());
        C34B.LJI("RelationModelFilterHelper", X1D.LIZIZ(LIZ2));
        return LJ2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0052 -> B:12:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(com.ss.android.ugc.aweme.im.sdk.common.data.model.ShareStateResponse r14, java.util.Map<java.lang.String, java.lang.String> r15, X.InterfaceC67352kd<? super X.C76800UCe> r16) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3FK.LJI(com.ss.android.ugc.aweme.im.sdk.common.data.model.ShareStateResponse, java.util.Map, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:1|(2:3|(14:5|6|7|(1:(1:(3:(1:(1:13)(2:17|18))(2:19|20)|14|15)(6:21|22|23|(2:25|26)|14|15))(2:27|28))(2:46|(3:48|14|15)(2:49|(2:51|52)(1:53)))|29|(1:45)(1:34)|35|(1:37)(1:44)|38|(2:40|(2:42|43))|23|(0)|14|15))|60|6|7|(0)(0)|29|(2:31|32)|45|35|(0)(0)|38|(0)|23|(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e6, code lost:
    
        X.C34B.LJ("RelationModelFilterHelper", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e9, code lost:
    
        if (r15 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00eb, code lost:
    
        r1 = X.EXV.LIZ;
        r0 = new X.C64222fa(r15, null);
        r6.LJLIL = null;
        r6.LJLILLLLZI = null;
        r6.LJLJI = null;
        r6.LJLJJI = null;
        r6.LJLJL = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0100, code lost:
    
        if (X.XKX.LJI(r1, r0, r6) == r4) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0102, code lost:
    
        return r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4 A[Catch: Exception -> 0x00e5, TryCatch #0 {Exception -> 0x00e5, blocks: (B:20:0x0035, B:22:0x00d1, B:23:0x00d4, B:28:0x007a, B:29:0x007d, B:32:0x008e, B:34:0x0092, B:35:0x0096, B:37:0x00a4, B:38:0x00aa, B:40:0x00b9, B:49:0x0065), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9 A[Catch: Exception -> 0x00e5, TryCatch #0 {Exception -> 0x00e5, blocks: (B:20:0x0035, B:22:0x00d1, B:23:0x00d4, B:28:0x007a, B:29:0x007d, B:32:0x008e, B:34:0x0092, B:35:0x0096, B:37:0x00a4, B:38:0x00aa, B:40:0x00b9, B:49:0x0065), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List r13, java.util.Map r14, X.InterfaceC88472Yns r15, X.InterfaceC67352kd r16) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3FK.LIZ(java.util.List, java.util.Map, X.Yns, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r10, java.util.List r11, java.util.List r12, X.InterfaceC67352kd r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof X.C3FP
            if (r0 == 0) goto L5f
            r8 = r13
            X.3FP r8 = (X.C3FP) r8
            int r2 = r8.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5f
            int r2 = r2 - r1
            r8.LJLJJI = r2
        L12:
            java.lang.Object r3 = r8.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r8.LJLJJI
            r0 = 1
            if (r1 == 0) goto L48
            if (r1 != r0) goto L68
            java.lang.Object r11 = r8.LJLIL
            java.util.List r11 = (java.util.List) r11
            X.C141335gf.LIZJ(r3)
        L24:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r2 = r3.iterator()
        L2a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L65
            java.lang.Object r0 = r2.next()
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = (com.ss.android.ugc.aweme.im.service.model.IMUser) r0
            java.lang.String r1 = r0.getSecUid()
            if (r1 == 0) goto L2a
            boolean r0 = r11.contains(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L2a
            r11.add(r1)
            goto L2a
        L48:
            X.C141335gf.LIZJ(r3)
            X.3Fk r3 = X.C80853Fh.LJ()
            r5 = 30
            r6 = 0
            r8.LJLIL = r11
            r8.LJLJJI = r0
            r7 = r10
            r4 = r12
            java.lang.Object r3 = r3.LJIIIZ(r4, r5, r6, r7, r8)
            if (r3 != r2) goto L24
            return r2
        L5f:
            X.3FP r8 = new X.3FP
            r8.<init>(r9, r13)
            goto L12
        L65:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L68:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3FK.LIZIZ(java.lang.String, java.util.List, java.util.List, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> r10, com.ss.android.ugc.aweme.im.sdk.common.data.model.ShareStateResponse.ShareUserStruct r11, java.lang.StringBuilder r12, X.InterfaceC67352kd<? super X.C76800UCe> r13) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3FK.LIZLLL(java.util.List, com.ss.android.ugc.aweme.im.sdk.common.data.model.ShareStateResponse$ShareUserStruct, java.lang.StringBuilder, X.2kd):java.lang.Object");
    }

    public static void LJFF(String str, String str2, boolean z, java.util.Map map, boolean z2, int i) {
        boolean z3 = z2;
        boolean z4 = z;
        java.util.Map map2 = map;
        if ((i & 8) != 0) {
            z4 = false;
        }
        if ((i & 16) != 0) {
            map2 = null;
        }
        if ((i & 32) != 0) {
            z3 = false;
        }
        LIZ.getClass();
        if (!AV1.LJIILLIIL()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - LIZIZ >= 30000) {
                LIZIZ = elapsedRealtime;
                XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C66012iT(map2, str, str2, z4, z3, null, null), 3);
            }
        }
        if (map2 == null) {
            return;
        }
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C66012iT(map2, str, str2, z4, z3, null, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0166 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.lang.String r18, java.lang.String r19, boolean r20, java.util.Map<java.lang.String, java.lang.String> r21, boolean r22, X.InterfaceC67352kd<? super java.util.List<java.lang.String>> r23) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3FK.LJ(java.lang.String, java.lang.String, boolean, java.util.Map, boolean, X.2kd):java.lang.Object");
    }
}
