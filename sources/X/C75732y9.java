package X;

import com.ss.android.ugc.aweme.im.sdk.chat.experiment.FakeMessageConfig;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.2y9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75732y9 {
    public static final Object LIZ = new Object();
    public static final HashMap<String, Long> LIZIZ = new HashMap<>();

    public static void LIZ(int i, String str, boolean z) {
        if (str == null || !C90673h9.LIZ()) {
            return;
        }
        Object obj = LIZ;
        synchronized (obj) {
            HashMap<String, Long> hashMap = LIZIZ;
            Long l = hashMap.get(str);
            if (l == null) {
                l = -1L;
            }
            o.LJIIIIZZ(l, "loadingStatus[conversationId] ?: STATUS_IDLE");
            long longValue = l.longValue();
            if (longValue == -2) {
                return;
            }
            long j = ((FakeMessageConfig.Config) FakeMessageConfig.LIZIZ.getValue()).requestContentInterval;
            if (longValue > 0 && System.currentTimeMillis() - longValue < j) {
                return;
            }
            hashMap.put(str, -2L);
            C3Q9.LIZ.getClass();
            C75782yE.LIZ();
            C63120Opw LIZ2 = C4WC.LIZIZ.LIZ(str);
            if (LIZ2 == null) {
                C34B.LIZJ("ConversationContentHandler", "sendRequest: conv is null");
                if (!z) {
                    XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZ), null, null, new C75722y8(str, i, null), 3);
                }
                synchronized (obj) {
                    hashMap.put(str, -1L);
                }
                return;
            }
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C75712y7(i, LIZ2, null), 3);
        }
    }

    public static void LIZIZ(String conversationId, Object obj, InterfaceC86963bA interfaceC86963bA) {
        o.LJIIIZ(conversationId, "conversationId");
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZ), null, null, new C75702y6(obj, conversationId, 1, interfaceC86963bA, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x004e, code lost:
    
        if (r5 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(int r9, X.InterfaceC86963bA r10, java.lang.String r11, java.lang.String r12) {
        /*
            X.2yE r0 = X.C3Q9.LIZ
            r0.getClass()
            X.C75782yE.LIZ()
            X.4WC r0 = X.C4WC.LIZIZ
            X.Opw r8 = r0.LIZ(r11)
            java.lang.String r4 = "ConversationContentHandler"
            if (r8 != 0) goto L18
            java.lang.String r0 = "updateToLocalExt, conversation == null"
            X.C34B.LJI(r4, r0)
            return
        L18:
            java.util.Map r0 = r8.getLocalExt()
            if (r0 == 0) goto L2e
            java.util.Map r3 = X.C113554cx.LJJLIL(r0)
        L22:
            java.lang.String r7 = "s:conversation_card_data"
            java.lang.Object r0 = r3.get(r7)
            java.lang.String r0 = (java.lang.String) r0
            r6 = 0
            if (r0 == 0) goto L50
            goto L34
        L2e:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            goto L22
        L34:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3d
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L3d
            X.C3C5.m7constructorimpl(r5)     // Catch: java.lang.Throwable -> L3d
            goto L45
        L3d:
            r0 = move-exception
            X.3C4 r5 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r5)
        L45:
            boolean r0 = X.C3C5.m12isFailureimpl(r5)
            if (r0 == 0) goto L4c
            r5 = r6
        L4c:
            org.json.JSONObject r5 = (org.json.JSONObject) r5
            if (r5 != 0) goto L55
        L50:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
        L55:
            java.lang.String r0 = java.lang.String.valueOf(r9)
            java.lang.String r2 = r5.optString(r0)
            java.lang.String r1 = ""
            if (r12 != 0) goto L8b
            r0 = r1
        L62:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L8d
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "updateToLocalExt, content is same, is content empty="
            r1.append(r0)
            if (r12 == 0) goto L7e
            int r0 = r12.length()
            if (r0 != 0) goto L89
            r0 = 1
        L7a:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
        L7e:
            r1.append(r6)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C34B.LJI(r4, r0)
            return
        L89:
            r0 = 0
            goto L7a
        L8b:
            r0 = r12
            goto L62
        L8d:
            java.lang.String r0 = java.lang.String.valueOf(r9)
            if (r12 != 0) goto L94
            r12 = r1
        L94:
            r5.put(r0, r12)
            java.lang.String r0 = r5.toString()
            r3.put(r7, r0)
            java.lang.String r1 = r8.getConversationId()
            java.lang.String r0 = "conversation.conversationId"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            X.3hI r0 = X.C81273Gx.LIZ(r1)
            r0.LJIJJ(r3, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75732y9.LIZJ(int, X.3bA, java.lang.String, java.lang.String):void");
    }
}
