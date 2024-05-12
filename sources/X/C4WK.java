package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.4WK, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4WK {
    public static C4WK LJFF;
    public C4WQ LIZLLL;
    public final java.util.Map<String, Long> LIZ = new ConcurrentHashMap();
    public final java.util.Map<String, C78541Us5> LIZIZ = new ConcurrentHashMap();
    public final java.util.Map<String, Boolean> LIZJ = new ConcurrentHashMap();
    public final java.util.Set<InterfaceC83073Nv> LJ = new CopyOnWriteArraySet();

    public static C4WK LIZIZ() {
        if (LJFF == null) {
            synchronized (C4WK.class) {
                if (LJFF == null) {
                    LJFF = new C4WK();
                }
            }
        }
        return LJFF;
    }

    public final void LIZLLL() {
        if (!((CopyOnWriteArraySet) this.LJ).isEmpty()) {
            C63322OtC.LJFF("UnReadCountHelper notify unread map update");
            Iterator it = ((CopyOnWriteArraySet) this.LJ).iterator();
            while (it.hasNext()) {
                ((InterfaceC83073Nv) it.next()).LIZ(this.LIZ, this.LIZJ);
            }
            return;
        }
        C63322OtC.LJFF("UnReadCountHelper should add unread observer");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0074 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long LIZ(X.C63120Opw r7, X.C4WQ r8) {
        /*
            r5 = 0
            if (r8 == 0) goto L66
            long r2 = r8.LIZIZ(r7)
        L8:
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 <= 0) goto L37
            java.lang.StringBuilder r4 = X.X1D.LIZ()
            java.lang.String r0 = "UnReadCountHelper calculateUnreadCount by "
            r4.append(r0)
            if (r8 != 0) goto L55
            java.lang.String r0 = "default"
        L19:
            r4.append(r0)
            java.lang.String r0 = ", cid:"
            r4.append(r0)
            java.lang.String r0 = r7.getConversationId()
            r4.append(r0)
            java.lang.String r0 = ", unreadCount:"
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = X.X1D.LIZIZ(r4)
            X.C63322OtC.LIZ(r0)
        L37:
            boolean r0 = r7.isHide()
            if (r0 == 0) goto L74
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "UnReadCountHelper conversation is hide, cid:"
            r1.append(r0)
            java.lang.String r0 = r7.getConversationId()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C63322OtC.LIZ(r0)
            return r5
        L55:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "calculator:"
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            goto L19
        L66:
            boolean r0 = r7.isMute()
            if (r0 != 0) goto L71
            long r2 = r7.getUnreadCount()
            goto L8
        L71:
            r2 = 0
            goto L37
        L74:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4WK.LIZ(X.Opw, X.4WQ):long");
    }

    public final void LIZJ(List<C63120Opw> list, boolean z) {
        C78541Us5 LIZLLL;
        if (list == null || list.isEmpty()) {
            C63322OtC.LJFF("UnReadCountHelper conversationList is empty");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (C63120Opw c63120Opw : list) {
            if (c63120Opw != null) {
                C4WK LIZIZ = LIZIZ();
                C4WQ c4wq = this.LIZLLL;
                LIZIZ.getClass();
                long LIZ = LIZ(c63120Opw, c4wq);
                C4WQ c4wq2 = this.LIZLLL;
                if (c4wq2 != null && (LIZLLL = c4wq2.LIZLLL(c63120Opw)) != null) {
                    ((ConcurrentHashMap) this.LIZIZ).put(c63120Opw.getConversationId(), LIZLLL);
                }
                if (LIZ > 0) {
                    ((ConcurrentHashMap) this.LIZ).put(c63120Opw.getConversationId(), Long.valueOf(LIZ));
                } else {
                    ((ConcurrentHashMap) this.LIZ).remove(c63120Opw.getConversationId());
                }
                C4WQ c4wq3 = this.LIZLLL;
                if (c4wq3 != null) {
                    boolean LIZJ = c4wq3.LIZJ(c63120Opw);
                    sb.append("UnReadCountHelper notify, conversationID:");
                    sb.append(c63120Opw.getConversationId());
                    sb.append(", shouldNotify:");
                    sb.append(LIZJ);
                    sb.append("\n");
                    ((ConcurrentHashMap) this.LIZJ).put(c63120Opw.getConversationId(), Boolean.valueOf(LIZJ));
                    this.LIZLLL.LIZ();
                }
            }
        }
        String sb2 = sb.toString();
        if (!sb2.isEmpty()) {
            C63322OtC.LIZ(sb2);
        }
        if (z) {
            LIZLLL();
        }
    }
}
