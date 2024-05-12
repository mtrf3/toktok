package X;

import com.bytedance.im.core.proto.AckMessageRequestBody;
import kotlin.jvm.internal.o;

/* renamed from: X.OyB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63631OyB {
    public final InterfaceC117594jT LIZ;
    public final InterfaceC65784Pro<InterfaceC63292Osi> LIZIZ;
    public final InterfaceC65784Pro<C114444eO> LIZJ;

    public C63631OyB() {
        throw null;
    }

    public C63631OyB(InterfaceC117594jT remoteFetcher) {
        C63645OyP clientBridge = C63645OyP.LJLIL;
        C63646OyQ clientOptions = C63646OyQ.LJLIL;
        o.LJIIIZ(remoteFetcher, "remoteFetcher");
        o.LJIIIZ(clientBridge, "clientBridge");
        o.LJIIIZ(clientOptions, "clientOptions");
        this.LIZ = remoteFetcher;
        this.LIZIZ = clientBridge;
        this.LIZJ = clientOptions;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0132 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [com.bytedance.im.core.proto.Response, X.OyB] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.bytedance.im.core.proto.Response r27, X.InterfaceC67352kd<? super X.C76800UCe> r28) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63631OyB.LIZ(com.bytedance.im.core.proto.Response, X.2kd):java.lang.Object");
    }

    public static void LIZIZ(boolean z, long j, long j2, AckMessageRequestBody ackMessageRequestBody) {
        int i;
        C63323OtD LIZJ = C63144OqK.LIZJ("imsdk_message_ack");
        LIZJ.LIZ(Integer.valueOf(ackMessageRequestBody.push_type.getValue()), "push_type");
        LIZJ.LIZ(ackMessageRequestBody.id, "id");
        EnumC63506OwA enumC63506OwA = ackMessageRequestBody.conv_type;
        int i2 = 0;
        if (enumC63506OwA != null) {
            i = enumC63506OwA.getValue();
        } else {
            i = 0;
        }
        LIZJ.LIZ(Integer.valueOf(i), "conv_type");
        EnumC63179Oqt enumC63179Oqt = ackMessageRequestBody.msg_type;
        if (enumC63179Oqt != null) {
            i2 = enumC63179Oqt.getValue();
        }
        LIZJ.LIZ(Integer.valueOf(i2), "msg_type");
        LIZJ.LIZ(Long.valueOf(j2), "e2e_latency");
        LIZJ.LIZ(Long.valueOf(j), "request_duration");
        LIZJ.LIZ(Integer.valueOf(!z ? 1 : 0), "is_success");
        LIZJ.LIZLLL();
    }

    public final Object LIZJ(int i, long j, String str, int i2, int i3, int i4, EnumC63625Oy5 enumC63625Oy5, C63637OyH c63637OyH) {
        EnumC63641OyL fromValue = EnumC63641OyL.fromValue(i2);
        if (fromValue == null) {
            fromValue = EnumC63641OyL.Internal;
        }
        Object LIZLLL = LIZLLL(i, j, str, fromValue, EnumC63506OwA.fromValue(i3), EnumC63179Oqt.fromValue(i4), enumC63625Oy5, c63637OyH);
        if (LIZLLL == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LIZLLL;
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(int r14, long r15, java.lang.String r17, X.EnumC63641OyL r18, X.EnumC63506OwA r19, X.EnumC63179Oqt r20, X.EnumC63625Oy5 r21, X.InterfaceC67352kd<? super X.C76800UCe> r22) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63631OyB.LIZLLL(int, long, java.lang.String, X.OyL, X.OwA, X.Oqt, X.Oy5, X.2kd):java.lang.Object");
    }
}
