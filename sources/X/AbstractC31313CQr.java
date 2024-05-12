package X;

import X.CR6;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenMessageDefaultPrioritySetting;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import kotlin.jvm.internal.o;

/* renamed from: X.CQr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31313CQr<T extends CR6> implements InterfaceC31317CQv<T> {
    public static final long LIZ = LivePublicScreenMessageDefaultPrioritySetting.getDefaultPriorityForAnchor();
    public static final long LIZIZ = LivePublicScreenMessageDefaultPrioritySetting.getDefaultPriorityForAudience();

    public boolean LJII(CR6 t, boolean z) {
        o.LJIIIZ(t, "t");
        return false;
    }

    public boolean LJIIIIZZ(T t) {
        o.LJIIIZ(t, "t");
        return false;
    }

    public boolean LIZLLL(CQQ publicScreenContext, CR6 cr6) {
        o.LJIIIZ(publicScreenContext, "publicScreenContext");
        return false;
    }

    public final boolean LJ(T t, User user) {
        long j;
        o.LJIIIZ(t, "t");
        User LIZ2 = LIZ(t, user);
        if (LIZ2 != null) {
            j = LIZ2.getId();
        } else {
            j = 0;
        }
        if (j == C025908h.LIZ()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJFF(CQQ context, CR6 t) {
        o.LJIIIZ(t, "t");
        o.LJIIIZ(context, "context");
        if (context.LJFF) {
            InterfaceC31318CQw<? extends CR6> LJII = context.LJIIJ.LJII(t);
            if ((LJII instanceof InterfaceC31318CQw) && LJII != null && LJII.LIZIZ(t)) {
                return false;
            }
        }
        if (LJ(t, context.LJII)) {
            return LJIIIIZZ(t);
        }
        return LJI(t, context.LJFF);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean LJI(X.CR6 r7, boolean r8) {
        /*
            r6 = this;
            java.lang.String r0 = "t"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            com.bytedance.android.livesdkapi.message.CommonMessageData r5 = r7.baseMessage
            r3 = 0
            if (r8 == 0) goto L1b
            if (r5 == 0) goto L11
            java.lang.Long r0 = r5.anchorFoldType
            if (r0 != 0) goto L16
        L11:
            boolean r0 = r6.LJII(r7, r8)
            return r0
        L16:
            long r1 = r0.longValue()
            goto L1f
        L1b:
            if (r5 == 0) goto L11
            long r1 = r5.foldType
        L1f:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L24
            goto L11
        L24:
            if (r8 == 0) goto L33
            if (r5 == 0) goto L2c
            java.lang.Long r0 = r5.anchorFoldType
            if (r0 != 0) goto L2e
        L2c:
            r0 = 0
        L2d:
            return r0
        L2e:
            long r3 = r0.longValue()
            goto L37
        L33:
            if (r5 == 0) goto L2c
            long r3 = r5.foldType
        L37:
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L2c
            r0 = 1
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC31313CQr.LJI(X.CR6, boolean):boolean");
    }

    public boolean LJIIIZ(CR6 t, boolean z) {
        o.LJIIIZ(t, "t");
        if (t.isHistoryMessage) {
            return false;
        }
        return true;
    }

    public boolean LIZJ(User user, boolean z, T t) {
        o.LJIIIZ(t, "t");
        if (t.isHistoryMessage || !z || !LJ(t, user)) {
            return false;
        }
        return true;
    }

    public long LIZIZ(T message, boolean z, boolean z2, CommonMessageData commonMessageData) {
        long j;
        o.LJIIIZ(message, "message");
        if (z2) {
            if (commonMessageData != null) {
                j = commonMessageData.anchorPriorityScore;
            }
            j = 0;
        } else {
            if (commonMessageData != null) {
                j = commonMessageData.priorityScore;
            }
            j = 0;
        }
        if (z && j == 0) {
            if (z2) {
                return LIZ;
            }
            return LIZIZ;
        }
        return j;
    }
}
