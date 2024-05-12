package X;

import com.bytedance.keva.Keva;
import defpackage.m0;
import kotlin.jvm.internal.o;

/* renamed from: X.3es, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89263es {
    public static final /* synthetic */ int LIZ = 0;

    public static Keva LIZ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("message_button_text_repo");
        LIZ2.append(((RBX) HG3.LJIILL()).getCurUserId());
        Keva repo = Keva.getRepo(X1D.LIZIZ(LIZ2));
        o.LJIIIIZZ(repo, "getRepo(KEVA_REPO + curUid())");
        return repo;
    }

    public static boolean LIZIZ(String str) {
        if (str == null) {
            return false;
        }
        return m0.LIZLLL("key_has_chat_history", str, LIZ(), false);
    }

    public static boolean LIZJ(Keva keva, String userId) {
        o.LJIIIZ(userId, "userId");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("key_has_entered_chatroom");
        LIZ2.append(userId);
        return keva.contains(X1D.LIZIZ(LIZ2));
    }

    public static boolean LJ(Keva keva, String userId) {
        o.LJIIIZ(userId, "userId");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("key_double_follow_time_stamp");
        LIZ2.append(userId);
        if (keva.contains(X1D.LIZIZ(LIZ2)) && C78580Usi.LIZIZ("key_double_follow_time_stamp", userId, keva, -1L) != -1) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("key_double_follow_time_stamp");
            LIZ3.append(userId);
            keva.storeLong(X1D.LIZIZ(LIZ3), -1L);
            return true;
        }
        return false;
    }

    public static void LJFF(Keva keva, String str) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("key_has_entered_chatroom");
        LIZ2.append(str);
        if (!keva.contains(X1D.LIZIZ(LIZ2))) {
            C65429Pm5.LJ("key_has_entered_chatroom", str, keva, true);
        }
    }

    public static boolean LIZLLL(Keva keva, String userId, boolean z) {
        o.LJIIIZ(userId, "userId");
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("follow_action_tag");
        LIZ2.append(userId);
        boolean contains = keva.contains(X1D.LIZIZ(LIZ2));
        if (!z || contains) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("key_double_follow_time_stamp");
            LIZ3.append(userId);
            if (keva.contains(X1D.LIZIZ(LIZ3))) {
                long LIZIZ = C78580Usi.LIZIZ("key_double_follow_time_stamp", userId, keva, -1L);
                if (LIZIZ != -1 && currentTimeMillis - LIZIZ < ((Number) C89283eu.LIZ.getValue()).longValue()) {
                    return false;
                }
                return true;
            }
        }
        if (C3U6.LIZ) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("key_fake_double_follow_time_stamp");
            LIZ4.append(userId);
            if (keva.contains(X1D.LIZIZ(LIZ4))) {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("key_fake_double_follow_time_stamp");
                LIZ5.append(userId);
                if (currentTimeMillis - keva.getLong(X1D.LIZIZ(LIZ5), -1L) < ((Number) C89283eu.LIZ.getValue()).longValue()) {
                    return false;
                }
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("key_fake_double_follow_time_stamp");
                LIZ6.append(userId);
                keva.erase(X1D.LIZIZ(LIZ6));
                return true;
            }
        }
        return true;
    }

    public static void LJII(long j, Keva keva, String userId) {
        o.LJIIIZ(userId, "userId");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("key_double_follow_time_stamp");
        LIZ2.append(userId);
        if (keva.contains(X1D.LIZIZ(LIZ2))) {
            return;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("key_double_follow_time_stamp");
        LIZ3.append(userId);
        keva.storeLong(X1D.LIZIZ(LIZ3), j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r5 != 1) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(java.lang.String r3, boolean r4, int r5, com.bytedance.keva.Keva r6) {
        /*
            if (r4 == 0) goto L17
        L2:
            r2 = 2
        L3:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "follow_action_tag"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r6.storeInt(r0, r2)
            return
        L17:
            r0 = 4
            if (r5 == r0) goto L2
            r2 = 1
            if (r5 == r2) goto L2
            goto L3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89263es.LJI(java.lang.String, boolean, int, com.bytedance.keva.Keva):void");
    }
}
