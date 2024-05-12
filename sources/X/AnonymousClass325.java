package X;

import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.im.sdk.chatlist.data.LastMessageProperty;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.325, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass325 {
    public static final AnonymousClass325 LIZ = new AnonymousClass325();
    public static final Gson LIZIZ;
    public static final AnonymousClass326 LIZJ;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.326] */
    static {
        Gson LIZ2 = GsonHolder.LIZLLL().LIZ();
        if (LIZ2 == null) {
            LIZ2 = C62070OXq.LIZ;
        }
        LIZIZ = LIZ2;
        LIZJ = new Object() { // from class: X.326
            {
                C221108m2.LIZIZ(AnonymousClass327.LJLIL);
            }
        };
    }

    public static void LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C3E5.LIZLLL(str);
        C96093pt.LIZ(str);
    }

    public static String LIZJ(List list) {
        Object obj;
        long LIZIZ2 = C36L.LIZIZ();
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C109544Rq) obj).getSender() != LIZIZ2) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C109544Rq c109544Rq = (C109544Rq) obj;
        if (c109544Rq == null) {
            return null;
        }
        return c109544Rq.getUuid();
    }

    public static long LIZLLL(LastMessageProperty lastMessageProperty) {
        long j;
        Long create_at_in_seconds;
        if (lastMessageProperty != null && (create_at_in_seconds = lastMessageProperty.getCreate_at_in_seconds()) != null) {
            j = create_at_in_seconds.longValue();
        } else {
            j = 0;
        }
        return j * 1000;
    }

    public static LastMessageProperty LJ(C63120Opw c63120Opw) {
        java.util.Map<String, String> localExt;
        String str;
        LastMessageProperty lastMessageProperty = null;
        if (c63120Opw == null || (localExt = c63120Opw.getLocalExt()) == null || (str = localExt.get("a:s_latest_message_property")) == null) {
            return null;
        }
        try {
            lastMessageProperty = (LastMessageProperty) LIZIZ.LJI(str, LastMessageProperty.class);
            return lastMessageProperty;
        } catch (Exception e) {
            C36922EeM.LIZ(e);
            return lastMessageProperty;
        }
    }

    public static boolean LJFF(LastMessageProperty lastMessageProperty) {
        Integer mark_read;
        if (lastMessageProperty != null && ((mark_read = lastMessageProperty.getMark_read()) == null || mark_read.intValue() != 1)) {
            return true;
        }
        return false;
    }

    public static boolean LJI(LastMessageProperty lastMessageProperty) {
        long j;
        if (!LJFF(lastMessageProperty)) {
            return false;
        }
        if (lastMessageProperty != null && lastMessageProperty.getCreate_at_in_seconds() != null) {
            long currentTimeMillis = (System.currentTimeMillis() / 1000) - lastMessageProperty.getCreate_at_in_seconds().longValue();
            try {
                SettingsManager.LIZLLL().getClass();
                j = SettingsManager.LJFF("im_reaction_as_count_interval_in_seconds", 7L);
            } catch (Exception unused) {
                j = AnonymousClass328.LIZ;
            }
            if (currentTimeMillis > j) {
                return false;
            }
        }
        return true;
    }

    public static void LJII(String str) {
        if (str == null) {
            return;
        }
        XKX.LIZLLL(C48841JEv.LIZ(EXV.LIZ), null, null, new C770530r(str, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(java.util.Map r8, java.lang.String r9, X.InterfaceC67352kd r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C770730t
            if (r0 == 0) goto L60
            r4 = r10
            X.30t r4 = (X.C770730t) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L60
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r1 = 1
            if (r0 == 0) goto L48
            if (r0 != r1) goto La5
            java.lang.Object r8 = r4.LJLIL
            java.util.Map r8 = (java.util.Map) r8
            X.C141335gf.LIZJ(r3)
        L24:
            X.32H r3 = (X.C32H) r3
            if (r3 == 0) goto La2
            java.lang.Long r0 = r3.create_time_v2
            if (r0 == 0) goto La2
            long r2 = r0.longValue()
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "saveLastReadMessageReactionTimestamp create_time_v2: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            java.lang.String r6 = "DmHelper"
            X.C34B.LIZIZ(r6, r0)
            if (r8 == 0) goto L66
            goto L68
        L48:
            X.C141335gf.LIZJ(r3)
            X.32A r0 = X.AnonymousClass329.LIZ
            r0.getClass()
            X.3Km r0 = X.C96413qP.LIZ
            r0.LJIIIZ()
            r4.LJLIL = r8
            r4.LJLJJI = r1
            X.32H r3 = X.C63152OqS.LIZ(r9)
            if (r3 != r2) goto L24
            return r2
        L60:
            X.30t r4 = new X.30t
            r4.<init>(r7, r10)
            goto L12
        L66:
            r0 = 0
            goto L85
        L68:
            java.lang.String r5 = "a:s_last_read_message_reaction_timestamp"
            com.google.gson.Gson r4 = X.AnonymousClass325.LIZIZ     // Catch: java.lang.Throwable -> L89
            com.ss.android.ugc.aweme.im.sdk.chatlist.data.LastReadMessageReactionTimestamp r1 = new com.ss.android.ugc.aweme.im.sdk.chatlist.data.LastReadMessageReactionTimestamp     // Catch: java.lang.Throwable -> L89
            java.lang.Long r0 = new java.lang.Long     // Catch: java.lang.Throwable -> L89
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L89
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L89
            java.lang.String r1 = r4.LJIILL(r1)     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = "gson.toJson(LastReadMessageReactionTimestamp(it))"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Throwable -> L89
            java.lang.Object r0 = r8.put(r5, r1)     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L89
        L85:
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L89
            goto L91
        L89:
            r0 = move-exception
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
        L91:
            java.lang.Throwable r1 = X.C3C5.m10exceptionOrNullimpl(r0)
            if (r1 == 0) goto La2
            java.lang.String r0 = r1.getMessage()
            if (r0 != 0) goto L9f
            java.lang.String r0 = ""
        L9f:
            X.C34B.LIZLLL(r6, r0, r1)
        La2:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        La5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass325.LJIIIIZZ(java.util.Map, java.lang.String, X.2kd):java.lang.Object");
    }

    public static void LIZIZ(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C3E5.LIZLLL(str);
        C96093pt.LIZJ(str, str2, str3, str4, null);
    }
}
