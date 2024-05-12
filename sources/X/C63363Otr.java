package X;

import android.os.SystemClock;
import com.bytedance.im.core.internal.link.handler.CommandMessage;
import com.bytedance.im.core.proto.MessageBody;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Otr */
/* loaded from: classes11.dex */
public final class C63363Otr {
    public final InterfaceC117594jT LIZ;
    public final C63205OrJ LIZIZ;
    public final C63630OyA LIZJ;
    public final InterfaceC70422pa LIZLLL;
    public final int LJ = EnumC63625Oy5.GET_MESSAGES_BY_USER.getValue();

    public static C76800UCe LIZ(int i, java.util.Map map, C63370Oty c63370Oty) {
        for (Map.Entry entry : map.entrySet()) {
            C79146V4k.LJJIIJ(c63370Oty.getContext());
            String str = (String) entry.getKey();
            C109544Rq c109544Rq = (C109544Rq) ORZ.LLFF((List) entry.getValue());
            C63120Opw LJIIIZ = C63133Oq9.LJIIIZ(str, true);
            if (LJIIIZ != null) {
                if (!LJIIIZ.isWaitingInfo()) {
                    C63192Or6.LJIJI(LJIIIZ, c109544Rq, new Integer(0));
                }
            } else {
                C63120Opw LJIJI = C63217OrV.LJIJI(i, c109544Rq.getConversationId(), c109544Rq.getConversationShortId(), c109544Rq.getConversationType(), c109544Rq.getCreatedAt(), 0, c109544Rq);
                if (LJIJI != null) {
                    C115284fk.LJIILIIL().LJJII(LJIJI);
                }
            }
            C63269OsL.LIZ(i, c109544Rq);
        }
        return C76800UCe.LIZ;
    }

    public static void LJFF(int i, C109544Rq c109544Rq, C63373Ou1 c63373Ou1) {
        if (i == 0) {
            return;
        }
        C63323OtD LIZJ = C63144OqK.LIZJ("imsdk_load_msg");
        LIZJ.LIZ(c109544Rq.getConversationId(), "conversation_id");
        LIZJ.LIZ(c109544Rq.getUuid(), "msg_uuid");
        LIZJ.LIZ(1, "result");
        LIZJ.LIZ(Integer.valueOf(c109544Rq.getMsgType()), "msg_type");
        LIZJ.LIZ(Boolean.valueOf(C63308Osy.LJI().LIZIZ().isAppBackground()), "is_background");
        LIZJ.LIZ(Boolean.valueOf(C63308Osy.LJI().LIZIZ().LJIL()), "net_connected");
        LIZJ.LIZ(Boolean.valueOf(C63308Osy.LJI().LIZIZ().isWsConnected()), "is_ws_connected");
        LIZJ.LIZ(Long.valueOf(c63373Ou1.LJIIJ), "load_cost_time");
        LIZJ.LIZ(Long.valueOf(SystemClock.uptimeMillis() - c109544Rq.getCreatedAt()), "total_cost_time");
        LIZJ.LIZ(0, "is_discontinuous");
        LIZJ.LIZ(0, "is_ws");
        C63308Osy.LJI().LIZLLL().getClass();
        LIZJ.LIZ(0, "ntp_ready");
        LIZJ.LIZ(c63373Ou1.LJ, "logid");
        LIZJ.LIZ(CardStruct.IStatusCode.DEFAULT, "WITH_RECEIVE_BUFFER");
        LIZJ.LIZLLL();
    }

    public C63363Otr(C63589OxV c63589OxV, C63205OrJ c63205OrJ, C63630OyA c63630OyA, C64962gm c64962gm) {
        this.LIZ = c63589OxV;
        this.LIZIZ = c63205OrJ;
        this.LIZJ = c63630OyA;
        this.LIZLLL = c64962gm;
    }

    public final E0P LJI(int i, List list, C63373Ou1 c63373Ou1, C63370Oty c63370Oty) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            MessageBody messageBody = (MessageBody) it.next();
            C79146V4k.LJJIIJ(c63370Oty.getContext());
            if (C115394fv.LJIIIIZZ(messageBody)) {
                c63373Ou1.LIZ++;
                C115394fv.LJII().LJI(i, messageBody);
            } else if (CommandMessage.LJIIIZ(messageBody)) {
                c63373Ou1.LIZ++;
                CommandMessage.LJI(messageBody);
            } else {
                c63373Ou1.LIZIZ++;
                C63210OrO LIZ = this.LIZIZ.LIZ(messageBody, 3, C113554cx.LJJL(new OSZ("s:msg_get_by_pull", "1"), new OSZ("s:get_msg_log_id", c63373Ou1.LJ)));
                C109544Rq c109544Rq = LIZ.LIZIZ;
                if (c109544Rq != null) {
                    if (LIZ.LIZJ && !LIZ.LIZ && !c109544Rq.invalid()) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("saveMsg new msg failed, uuid: ");
                        LIZ2.append(c109544Rq.getUuid());
                        LIZ2.append(" , svrId: ");
                        LIZ2.append(c109544Rq.getMsgId());
                        C63322OtC.LJI("GetMsgByUserUseCase", X1D.LIZIZ(LIZ2), null);
                        i2++;
                    }
                    arrayList.add(LIZ);
                }
            }
        }
        return new E0P(arrayList, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(int r42, int r43, boolean r44, X.C63373Ou1 r45, java.util.Map<java.lang.String, ? extends java.lang.Object> r46, X.InterfaceC67352kd<? super X.C76800UCe> r47) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63363Otr.LIZIZ(int, int, boolean, X.Ou1, java.util.Map, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(2:3|(4:5|6|7|8))|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x03e0, code lost:
    
        r4 = e;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0461 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0323 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0371 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03b3 A[Catch: Exception -> 0x03dc, TryCatch #19 {Exception -> 0x03dc, blocks: (B:192:0x039d, B:194:0x03b3, B:197:0x03be, B:200:0x03cc, B:203:0x03ba), top: B:191:0x039d }] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0131 A[Catch: Exception -> 0x0134, Oxf -> 0x0136, CancellationException -> 0x0253, all -> 0x0255, TRY_LEAVE, TryCatch #12 {CancellationException -> 0x0253, blocks: (B:24:0x00e9, B:26:0x00f4, B:31:0x0121, B:34:0x012b, B:36:0x0131, B:241:0x011e), top: B:7:0x002c, outer: #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13, types: [X.Otr] */
    /* JADX WARN: Type inference failed for: r13v14, types: [X.Otr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v15, types: [X.Otr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.Ou1] */
    /* JADX WARN: Type inference failed for: r3v12, types: [X.Ou1] */
    /* JADX WARN: Type inference failed for: r3v13, types: [X.Ou1] */
    /* JADX WARN: Type inference failed for: r3v15, types: [X.Ou1] */
    /* JADX WARN: Type inference failed for: r3v16, types: [X.Ou1] */
    /* JADX WARN: Type inference failed for: r3v17, types: [X.Ou1] */
    /* JADX WARN: Type inference failed for: r3v18, types: [X.Ou1] */
    /* JADX WARN: Type inference failed for: r3v19, types: [X.Ou1] */
    /* JADX WARN: Type inference failed for: r3v24, types: [X.Ou1] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v8, types: [X.Ou1] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.2kd] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13, types: [com.bytedance.im.core.proto.MessagesPerUserResponseBody] */
    /* JADX WARN: Type inference failed for: r6v14, types: [com.bytedance.im.core.proto.MessagesPerUserResponseBody] */
    /* JADX WARN: Type inference failed for: r6v15, types: [com.bytedance.im.core.proto.MessagesPerUserResponseBody] */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v6, types: [com.bytedance.im.core.proto.MessagesPerUserResponseBody] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.Otr] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.util.LinkedHashMap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(int r29, int r30, long r31, boolean r33, java.util.Map<java.lang.String, ? extends java.lang.Object> r34, X.InterfaceC67352kd<? super X.C76800UCe> r35) {
        /*
            Method dump skipped, instructions count: 1298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63363Otr.LIZJ(int, int, long, boolean, java.util.Map, X.2kd):java.lang.Object");
    }

    public static /* synthetic */ Object LIZLLL(C63363Otr c63363Otr, int i, int i2, long j, java.util.Map map, InterfaceC67352kd interfaceC67352kd, int i3) {
        long j2 = j;
        java.util.Map map2 = map;
        if ((i3 & 4) != 0) {
            C63291Osh.LIZ().getClass();
            j2 = C63291Osh.LIZLLL(i);
        }
        if ((i3 & 16) != 0) {
            map2 = null;
        }
        return c63363Otr.LIZJ(i, i2, j2, false, map2, interfaceC67352kd);
    }

    public final void LJ(int i, String str, boolean z, String str2, int i2, long j, int i3) {
        XKX.LIZLLL(this.LIZLLL, null, null, new C115254fh(j, i2, i3, z, str, str2, i, null), 3);
    }
}
