package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.jvm.internal.o;

/* renamed from: X.BnR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29841BnR {
    public static final String LIZ(User user, Room room) {
        Long l;
        UserAttr userAttr;
        Long l2 = null;
        if (user != null) {
            l = Long.valueOf(user.getId());
        } else {
            l = null;
        }
        if (room != null) {
            l2 = Long.valueOf(room.getOwnerUserId());
        }
        if (o.LJ(l, l2)) {
            return "anchor";
        }
        if (user != null && (userAttr = user.getUserAttr()) != null && userAttr.isAdmin) {
            return "admin";
        }
        return "viewer";
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZIZ(com.bytedance.android.livesdkapi.depend.model.live.Room r5, com.bytedance.ies.sdk.datachannel.DataChannel r6) {
        /*
            r4 = 0
            if (r6 == 0) goto L3b
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomUserChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomUserChannel.class
            java.lang.Object r3 = r6.kv0(r0)
            com.bytedance.android.live.base.model.user.User r3 = (com.bytedance.android.live.base.model.user.User) r3
            if (r3 == 0) goto L3c
            long r0 = r3.getId()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
        L15:
            if (r5 == 0) goto L1f
            long r0 = r5.getOwnerUserId()
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
        L1f:
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r4)
            if (r0 == 0) goto L28
            java.lang.String r0 = "anchor"
        L27:
            return r0
        L28:
            if (r3 == 0) goto L38
            com.bytedance.android.livesdk.model.UserAttr r0 = r3.getUserAttr()
            if (r0 == 0) goto L38
            boolean r1 = r0.isAdmin
            r0 = 1
            if (r1 != r0) goto L38
            java.lang.String r0 = "admin"
            goto L27
        L38:
            java.lang.String r0 = "viewer"
            goto L27
        L3b:
            r3 = r4
        L3c:
            r2 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29841BnR.LIZIZ(com.bytedance.android.livesdkapi.depend.model.live.Room, com.bytedance.ies.sdk.datachannel.DataChannel):java.lang.String");
    }
}
