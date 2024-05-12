package X;

import com.bytedance.im.core.internal.link.handler.CommandMessage;
import com.bytedance.im.core.proto.AckMessage;
import com.bytedance.im.core.proto.BatchAckMessageRequestBody;
import com.bytedance.im.core.proto.MessageBody;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.OyA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63630OyA {
    public final InterfaceC117594jT LIZ;
    public final InterfaceC70422pa LIZIZ;
    public final InterfaceC65784Pro<InterfaceC63292Osi> LIZJ;
    public final InterfaceC65784Pro<C114444eO> LIZLLL;

    public C63630OyA(C63589OxV c63589OxV, C64962gm c64962gm) {
        C63647OyR clientBridge = C63647OyR.LJLIL;
        C63648OyS clientOptions = C63648OyS.LJLIL;
        o.LJIIIZ(clientBridge, "clientBridge");
        o.LJIIIZ(clientOptions, "clientOptions");
        this.LIZ = c63589OxV;
        this.LIZIZ = c64962gm;
        this.LIZJ = clientBridge;
        this.LIZLLL = clientOptions;
    }

    public static void LIZLLL(long j, BatchAckMessageRequestBody batchAckMessageRequestBody, String str) {
        int intValue;
        for (AckMessage ackMessage : batchAckMessageRequestBody.ack_msgs) {
            C63323OtD LIZJ = C63144OqK.LIZJ("imsdk_message_batch_ack");
            LIZJ.LIZ(ackMessage.server_msg_id, "server_msg_id");
            Integer num = ackMessage.inbox_type;
            if (num == null) {
                intValue = 0;
            } else {
                intValue = num.intValue();
            }
            LIZJ.LIZ(Integer.valueOf(intValue), "inbox_type");
            LIZJ.LIZ(Integer.valueOf(ackMessage.msg_type.getValue()), "msg_type");
            LIZJ.LIZ(Long.valueOf(j), "client_ack_cost");
            LIZJ.LIZ(ackMessage.scene, WM7.SCENE_SERVICE);
            LIZJ.LIZ(str, "log_id");
            LIZJ.LIZ(Integer.valueOf(ackMessage.cmd_type.getValue()), "cmd_type");
            LIZJ.LIZ(String.valueOf(ackMessage.first_save_to_db), "first_save_to_db");
            LIZJ.LIZLLL();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22)(1:23))|12|13|14))|26|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bf, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c0, code lost:
    
        X.C63322OtC.LJI("MessageBatchAckUseCase", "send batch ack error: ", r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(int r11, java.util.List r12, X.InterfaceC67352kd r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof X.C63638OyI
            if (r0 == 0) goto L24
            r8 = r13
            X.OyI r8 = (X.C63638OyI) r8
            int r2 = r8.LJLJJLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r8.LJLJJLL = r2
        L12:
            java.lang.Object r6 = r8.LJLJJI
            X.NAu r9 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r8.LJLJJLL
            r7 = 1
            if (r0 == 0) goto L32
            if (r0 != r7) goto L2a
            long r0 = r8.LJLJI
            com.bytedance.im.core.proto.BatchAckMessageRequestBody r4 = r8.LJLILLLLZI
            X.OyA r5 = r8.LJLIL
            goto L86
        L24:
            X.OyI r8 = new X.OyI
            r8.<init>(r10, r13)
            goto L12
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C141335gf.LIZJ(r6)
            X.OyK r0 = new X.OyK
            r0.<init>()
            X.C63685Oz3.LIZ(r12)
            r0.LIZLLL = r12
            com.bytedance.im.core.proto.BatchAckMessageRequestBody r4 = r0.build()
            X.Z8v r0 = new X.Z8v
            r0.<init>()
            r0.LJJIJLIJ = r4
            com.bytedance.im.core.proto.RequestBody r3 = r0.build()
            X.Oy5 r0 = X.EnumC63625Oy5.BATCH_ACK_MESSAGE
            int r2 = r0.getValue()
            X.Pro<X.Osi> r0 = r10.LIZJ
            java.lang.Object r1 = r0.invoke()
            X.Osi r1 = (X.InterfaceC63292Osi) r1
            X.Pro<X.4eO> r0 = r10.LIZLLL
            java.lang.Object r0 = r0.invoke()
            X.4eO r0 = (X.C114444eO) r0
            com.bytedance.im.core.proto.Request r6 = X.C32151Nz.LJ(r11, r2, r3, r1, r0)
            long r0 = android.os.SystemClock.uptimeMillis()
            X.4jT r5 = r10.LIZ     // Catch: X.C63599Oxf -> Lbf
            X.OxU r3 = new X.OxU     // Catch: X.C63599Oxf -> Lbf
            r2 = 506(0x1fa, float:7.09E-43)
            r3.<init>(r6, r2)     // Catch: X.C63599Oxf -> Lbf
            r8.LJLIL = r10     // Catch: X.C63599Oxf -> Lbf
            r8.LJLILLLLZI = r4     // Catch: X.C63599Oxf -> Lbf
            r8.LJLJI = r0     // Catch: X.C63599Oxf -> Lbf
            r8.LJLJJLL = r7     // Catch: X.C63599Oxf -> Lbf
            java.lang.Object r6 = r5.LIZIZ(r3, r7, r8)     // Catch: X.C63599Oxf -> Lbf
            if (r6 != r9) goto L84
            return r9
        L84:
            r5 = r10
            goto L89
        L86:
            X.C141335gf.LIZJ(r6)     // Catch: X.C63599Oxf -> Lbf
        L89:
            X.Oyt r6 = (X.C63675Oyt) r6     // Catch: X.C63599Oxf -> Lbf
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch: X.C63599Oxf -> Lbf
            long r2 = r2 - r0
            com.bytedance.im.core.proto.Response r0 = r6.LJLIL     // Catch: X.C63599Oxf -> Lbf
            java.lang.Long r0 = r0.server_execution_end_time     // Catch: X.C63599Oxf -> Lbf
            long r7 = r0.longValue()     // Catch: X.C63599Oxf -> Lbf
            com.bytedance.im.core.proto.Response r0 = r6.LJLIL     // Catch: X.C63599Oxf -> Lbf
            java.lang.Long r1 = r0.request_arrived_time     // Catch: X.C63599Oxf -> Lbf
            java.lang.String r0 = "response.response.request_arrived_time"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: X.C63599Oxf -> Lbf
            long r0 = r1.longValue()     // Catch: X.C63599Oxf -> Lbf
            long r7 = r7 - r0
            long r2 = r2 - r7
            r0 = 2
            long r0 = (long) r0     // Catch: X.C63599Oxf -> Lbf
            long r2 = r2 / r0
            java.lang.String r0 = "ackBody"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)     // Catch: X.C63599Oxf -> Lbf
            com.bytedance.im.core.proto.Response r0 = r6.LJLIL     // Catch: X.C63599Oxf -> Lbf
            java.lang.String r1 = r0.log_id     // Catch: X.C63599Oxf -> Lbf
            java.lang.String r0 = "response.response.log_id"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: X.C63599Oxf -> Lbf
            r5.getClass()     // Catch: X.C63599Oxf -> Lbf
            LIZLLL(r2, r4, r1)     // Catch: X.C63599Oxf -> Lbf
            goto Lc7
        Lbf:
            r2 = move-exception
            java.lang.String r1 = "MessageBatchAckUseCase"
            java.lang.String r0 = "send batch ack error: "
            X.C63322OtC.LJI(r1, r0, r2)
        Lc7:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63630OyA.LJFF(int, java.util.List, X.2kd):java.lang.Object");
    }

    public static final AckMessage LIZ(MessageBody messageBody, int i, boolean z, boolean z2) {
        List<Integer> list = C63308Osy.LJI().LIZLLL().LJLJLJ;
        List<Integer> list2 = C63308Osy.LJI().LIZLLL().LJLJLLL;
        List<Integer> list3 = C63308Osy.LJI().LIZLLL().LJLL;
        Integer message_type = messageBody.message_type;
        o.LJIIIIZZ(message_type, "message_type");
        int intValue = message_type.intValue();
        EnumC63179Oqt enumC63179Oqt = EnumC63179Oqt.MESSAGE_TYPE_COMMAND;
        if (intValue < enumC63179Oqt.getValue()) {
            if (list.contains(messageBody.message_type)) {
                return LJ(messageBody, i, z, z2, EnumC63642OyM.CmdTypeUnknown);
            }
            return LIZJ(messageBody, i, z, z2, EnumC63642OyM.CmdTypeUnknown);
        }
        Integer num = messageBody.message_type;
        int value = enumC63179Oqt.getValue();
        if (num == null || num.intValue() != value) {
            Integer message_type2 = messageBody.message_type;
            o.LJIIIIZZ(message_type2, "message_type");
            if (message_type2.intValue() > enumC63179Oqt.getValue()) {
                if (list2.contains(messageBody.message_type)) {
                    return LIZJ(messageBody, i, z, z2, EnumC63642OyM.CmdTypeUnknown);
                }
                return LJ(messageBody, i, z, z2, EnumC63642OyM.CmdTypeUnknown);
            }
            return null;
        }
        int i2 = CommandMessage.LIZJ(messageBody).type;
        EnumC63642OyM fromValue = EnumC63642OyM.fromValue(i2);
        if (list3.contains(Integer.valueOf(i2))) {
            if (fromValue == null) {
                fromValue = EnumC63642OyM.CmdTypeUnknown;
            }
            return LIZJ(messageBody, i, z, z2, fromValue);
        }
        if (fromValue == null) {
            fromValue = EnumC63642OyM.CmdTypeUnknown;
        }
        return LJ(messageBody, i, z, z2, fromValue);
    }

    public static void LIZIZ(C63630OyA c63630OyA, List list, int i, boolean z) {
        XIC dispatcher = C78613UtF.LIZ;
        c63630OyA.getClass();
        o.LJIIIZ(dispatcher, "dispatcher");
        if ((!list.isEmpty()) && c63630OyA.LIZLLL.invoke().LJJLIIJ) {
            XKX.LIZLLL(c63630OyA.LIZIZ, dispatcher, null, new C63434Ov0(list, c63630OyA, i, z, null), 2);
        }
    }

    public static AckMessage LIZJ(MessageBody messageBody, int i, boolean z, boolean z2, EnumC63642OyM enumC63642OyM) {
        Integer conversation_type = messageBody.conversation_type;
        o.LJIIIIZZ(conversation_type, "conversation_type");
        EnumC63506OwA fromValue = EnumC63506OwA.fromValue(conversation_type.intValue());
        Integer message_type = messageBody.message_type;
        o.LJIIIIZZ(message_type, "message_type");
        EnumC63179Oqt fromValue2 = EnumC63179Oqt.fromValue(message_type.intValue());
        C63634OyE c63634OyE = new C63634OyE();
        c63634OyE.LJFF = fromValue2;
        c63634OyE.LJIIIIZZ = fromValue;
        c63634OyE.LJII = Integer.valueOf(i);
        c63634OyE.LJ = Boolean.valueOf(z);
        c63634OyE.LIZLLL = String.valueOf(messageBody.server_message_id);
        String str = messageBody.scene;
        if (str == null) {
            str = "";
        }
        c63634OyE.LJI = str;
        c63634OyE.LJIIIZ = enumC63642OyM;
        c63634OyE.LJIIJ = Boolean.valueOf(z2);
        return c63634OyE.build();
    }

    public static AckMessage LJ(MessageBody messageBody, int i, boolean z, boolean z2, EnumC63642OyM enumC63642OyM) {
        if (messageBody.server_message_id.longValue() % C63308Osy.LJI().LIZLLL().LJLJL == 0) {
            return LIZJ(messageBody, i, z, z2, enumC63642OyM);
        }
        return null;
    }
}
