package Y;

import X.B83;
import X.C29374Bfu;
import X.C31012CFc;
import X.C75525TkX;
import X.C76684U7s;
import X.InterfaceC64592gB;
import X.InterfaceC76622U5i;
import X.InterfaceC76688U7w;
import X.J7I;
import X.OSZ;
import X.U7T;
import X.U7W;
import X.UA9;
import X.UC0;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.model.message.ReserveInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes14.dex */
public class AfS1S0400200_13 implements InterfaceC64592gB {
    public final int $t;
    public long j4;
    public long j5;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS1S0400200_13 afS1S0400200_13, Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        U7T u7t = (U7T) afS1S0400200_13.l0;
        long j = ((C76684U7s) afS1S0400200_13.l1).LIZIZ;
        long longValue = ((Long) afS1S0400200_13.l2).longValue();
        long j2 = afS1S0400200_13.j4;
        Map map = (Map) afS1S0400200_13.l3;
        UA9.LJJIII(j, longValue, j2, afS1S0400200_13.j5, C31012CFc.LIZIZ(), u7t, baseResponse.LIZIZ, ((C76684U7s) afS1S0400200_13.l1).LJ, map, new OSZ(0L, ""));
        if (((C76684U7s) afS1S0400200_13.l1).LIZIZ == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            U7T u7t2 = (U7T) afS1S0400200_13.l0;
            U7W u7w = u7t2.LJJIII;
            long LIZIZ = C31012CFc.LIZIZ() - afS1S0400200_13.j5;
            String str = baseResponse.LIZIZ;
            if (str == null) {
                str = "";
            }
            J7I.LJIIIZ(u7w, u7t2, "leave", LIZIZ, str, 0, new OSZ("leave_reason", ((C76684U7s) afS1S0400200_13.l1).LJ), false, null, 192);
        } else {
            U7T u7t3 = (U7T) afS1S0400200_13.l0;
            U7W u7w2 = u7t3.LJJIII;
            long LIZIZ2 = C31012CFc.LIZIZ() - afS1S0400200_13.j5;
            String str2 = baseResponse.LIZIZ;
            if (str2 == null) {
                str2 = "";
            }
            J7I.LJIIIZ(u7w2, u7t3, "kick_out", LIZIZ2, str2, 0, new OSZ("kickout_reason", ((C76684U7s) afS1S0400200_13.l1).LJ), false, null, 192);
        }
        U7T u7t4 = (U7T) afS1S0400200_13.l0;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7t4.LJII;
        C76684U7s c76684U7s = (C76684U7s) afS1S0400200_13.l1;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            List<InterfaceC76688U7w> LLIIZ = it.next().LLIIZ(u7t4);
            if (LLIIZ != null) {
                for (InterfaceC76688U7w interfaceC76688U7w : LLIIZ) {
                    if (interfaceC76688U7w != null) {
                        String str3 = baseResponse.LIZIZ;
                        if (str3 == null) {
                            str3 = "";
                        }
                        interfaceC76688U7w.LJJII(c76684U7s, str3);
                    }
                }
            }
        }
    }

    public static final void accept$1(AfS1S0400200_13 afS1S0400200_13, Object obj) {
        Throwable th = (Throwable) obj;
        U7T u7t = (U7T) afS1S0400200_13.l0;
        long j = ((C76684U7s) afS1S0400200_13.l1).LIZIZ;
        long longValue = ((Long) afS1S0400200_13.l2).longValue();
        long j2 = afS1S0400200_13.j4;
        Map map = (Map) afS1S0400200_13.l3;
        UA9.LJJIII(j, longValue, j2, afS1S0400200_13.j5, C31012CFc.LIZIZ(), u7t, UC0.LJIJ(th), ((C76684U7s) afS1S0400200_13.l1).LJ, map, UC0.LJIILL(th));
        String str = "";
        if (((C76684U7s) afS1S0400200_13.l1).LIZIZ == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            U7T u7t2 = (U7T) afS1S0400200_13.l0;
            U7W u7w = u7t2.LJJIII;
            long LIZIZ = C31012CFc.LIZIZ() - afS1S0400200_13.j5;
            String LJIJ = UC0.LJIJ(th);
            if (LJIJ != null) {
                str = LJIJ;
            }
            J7I.LJIIIZ(u7w, u7t2, "leave", LIZIZ, str, UC0.LJIILJJIL(th), new OSZ("leave_reason", ((C76684U7s) afS1S0400200_13.l1).LJ), false, null, 192);
        } else {
            U7T u7t3 = (U7T) afS1S0400200_13.l0;
            U7W u7w2 = u7t3.LJJIII;
            long LIZIZ2 = C31012CFc.LIZIZ() - afS1S0400200_13.j5;
            String LJIJ2 = UC0.LJIJ(th);
            if (LJIJ2 != null) {
                str = LJIJ2;
            }
            J7I.LJIIIZ(u7w2, u7t3, "kick_out", LIZIZ2, str, UC0.LJIILJJIL(th), new OSZ("kickout_reason", ((C76684U7s) afS1S0400200_13.l1).LJ), false, null, 192);
        }
        U7T u7t4 = (U7T) afS1S0400200_13.l0;
        Iterator<InterfaceC76622U5i> it = u7t4.LJII.iterator();
        while (it.hasNext()) {
            List<InterfaceC76688U7w> LLIIZ = it.next().LLIIZ(u7t4);
            if (LLIIZ != null) {
                for (InterfaceC76688U7w interfaceC76688U7w : LLIIZ) {
                    if (interfaceC76688U7w != null) {
                        interfaceC76688U7w.LJIIIIZZ(th);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d5, code lost:
    
        if (r7 != null) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$2(Y.AfS1S0400200_13 r6, java.lang.Object r7) {
        /*
            com.bytedance.android.live.network.response.BaseResponse r7 = (com.bytedance.android.live.network.response.BaseResponse) r7
            r3 = 0
            if (r7 == 0) goto Ld4
            T r0 = r7.data
            com.bytedance.android.livesdk.chatroom.interact.model.MGetUserLinkmicStatusResponse$ResponseData r0 = (com.bytedance.android.livesdk.chatroom.interact.model.MGetUserLinkmicStatusResponse.ResponseData) r0
            if (r0 == 0) goto Ld4
            java.util.Map<java.lang.Long, com.bytedance.android.livesdk.chatroom.interact.model.MGetUserLinkmicStatusResponse$LinkmicStatus> r2 = r0.linkmicStatusMap
            if (r2 == 0) goto Ld4
            long r0 = r6.j4
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r2 = r2.get(r0)
            com.bytedance.android.livesdk.chatroom.interact.model.MGetUserLinkmicStatusResponse$LinkmicStatus r2 = (com.bytedance.android.livesdk.chatroom.interact.model.MGetUserLinkmicStatusResponse.LinkmicStatus) r2
        L1b:
            T r0 = r7.data
            com.bytedance.android.livesdk.chatroom.interact.model.MGetUserLinkmicStatusResponse$ResponseData r0 = (com.bytedance.android.livesdk.chatroom.interact.model.MGetUserLinkmicStatusResponse.ResponseData) r0
            if (r0 == 0) goto L31
            java.util.Map<java.lang.Long, com.bytedance.android.livesdkapi.depend.model.live.Room> r4 = r0.roomInfo
            if (r4 == 0) goto L31
            long r0 = r6.j4
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r3 = r4.get(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r3
        L31:
            java.lang.Object r0 = r6.l0
            X.TkX r0 = (X.C75525TkX) r0
            java.lang.String r4 = r0.LJLJJI
            java.lang.StringBuilder r5 = X.X1D.LIZ()
            java.lang.String r0 = "apply, currentRoomId="
            r5.append(r0)
            long r0 = r6.j5
            r5.append(r0)
            java.lang.String r0 = ", targetUid="
            r5.append(r0)
            java.lang.Object r0 = r6.l1
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            long r0 = r0.getOwnerUserId()
            r5.append(r0)
            java.lang.String r0 = ", targetRoomId="
            r5.append(r0)
            java.lang.Object r0 = r6.l1
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            long r0 = r0.getId()
            r5.append(r0)
            java.lang.String r0 = ", newTargetLinkmicStatus="
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = ", newTargetRoom="
            r5.append(r0)
            r5.append(r3)
            java.lang.String r0 = X.X1D.LIZIZ(r5)
            X.C0NB.LJ(r4, r0)
            if (r3 != 0) goto L9d
            java.lang.Object r0 = r6.l0
            X.TkX r0 = (X.C75525TkX) r0
            java.lang.String r1 = r0.LJLJJI
            java.lang.String r0 = "apply, return by , newTargetRoom=null"
            X.C0NB.LJ(r1, r0)
            java.lang.Object r3 = r6.l0
            X.TkX r3 = (X.C75525TkX) r3
            java.lang.Object r2 = r6.l1
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r2
            java.lang.Object r1 = r6.l2
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r0 = r6.l3
            com.bytedance.android.livesdk.model.message.ReserveInfo r0 = (com.bytedance.android.livesdk.model.message.ReserveInfo) r0
            r3.LIZLLL(r2, r1, r0)
        L9c:
            return
        L9d:
            if (r2 != 0) goto Laf
            java.lang.Object r2 = r6.l0
            X.TkX r2 = (X.C75525TkX) r2
            java.lang.Object r1 = r6.l2
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r0 = r6.l3
            com.bytedance.android.livesdk.model.message.ReserveInfo r0 = (com.bytedance.android.livesdk.model.message.ReserveInfo) r0
            r2.LIZLLL(r3, r1, r0)
            goto L9c
        Laf:
            int r1 = r2.blockReason
            if (r1 == 0) goto Lc4
            r0 = 1
            X.UuT r0 = X.C78688UuS.LJJIFFI(r1, r0)
            if (r0 == 0) goto L9c
            java.lang.String r0 = r0.getReason()
            if (r0 == 0) goto L9c
            X.C30868C9o.LJI(r0)
            goto L9c
        Lc4:
            java.lang.Object r2 = r6.l0
            X.TkX r2 = (X.C75525TkX) r2
            java.lang.Object r1 = r6.l2
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r0 = r6.l3
            com.bytedance.android.livesdk.model.message.ReserveInfo r0 = (com.bytedance.android.livesdk.model.message.ReserveInfo) r0
            r2.LIZLLL(r3, r1, r0)
            goto L9c
        Ld4:
            r2 = r3
            if (r7 == 0) goto L31
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS1S0400200_13.accept$2(Y.AfS1S0400200_13, java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0003: IPUT (r2 I:long), (r0 I:Y.AfS1S0400200_13) (LINE:117440515) Y.AfS1S0400200_13.j4 long, block:B:1:0x0000 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0005: IPUT (r4 I:java.lang.Object), (r0 I:Y.AfS1S0400200_13) (LINE:117440517) Y.AfS1S0400200_13.l0 java.lang.Object, block:B:1:0x0000 */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0009: IPUT (r7 I:java.lang.Object), (r0 I:Y.AfS1S0400200_13) (LINE:117440521) Y.AfS1S0400200_13.l1 java.lang.Object, block:B:1:0x0000 */
    /* JADX WARN: Type inference failed for: r1v0, types: [Y.AfS1S0400200_13, java.lang.Object] */
    public AfS1S0400200_13(long j, long j2, C75525TkX c75525TkX, long j3, Room room, HashMap<String, Object> hashMap, ReserveInfo reserveInfo) {
        long j4;
        Object obj;
        Object obj2;
        r1.$t = reserveInfo;
        r1.j4 = j4;
        r1.l0 = obj;
        r1.j5 = c75525TkX;
        r1.l1 = obj2;
        r1.l2 = room;
        r1.l3 = hashMap;
        ?? obj3 = new Object();
    }
}
