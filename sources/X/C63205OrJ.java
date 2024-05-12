package X;

import com.bytedance.im.core.internal.link.handler.CommandMessage;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.ReferenceInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.OrJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63205OrJ {
    public final InterfaceC63207OrL LIZ;
    public final InterfaceC88472Yns<MessageBody, Boolean> LIZIZ;
    public final InterfaceC65784Pro<InterfaceC63292Osi> LIZJ;

    public C63205OrJ(int i) {
        C63194Or8 c63194Or8 = new C63194Or8();
        C63206OrK hasHandledCommandMsg = C63206OrK.LJLIL;
        C63208OrM imClientBridge = C63208OrM.LJLIL;
        o.LJIIIZ(hasHandledCommandMsg, "hasHandledCommandMsg");
        o.LJIIIZ(imClientBridge, "imClientBridge");
        this.LIZ = c63194Or8;
        this.LIZIZ = hasHandledCommandMsg;
        this.LIZJ = imClientBridge;
    }

    public final C63210OrO LIZ(MessageBody originalBody, int i, java.util.Map<String, String> map) {
        String str;
        C109544Rq c109544Rq;
        long longValue;
        boolean LIZJ;
        boolean z;
        boolean z2;
        o.LJIIIZ(originalBody, "originalBody");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("save msg begin: body msgId ");
        LIZ.append(originalBody.server_message_id);
        LIZ.append(" msgSource ");
        LIZ.append(i);
        C63322OtC.LJI("SaveMessageBodyToDBUseCase", X1D.LIZIZ(LIZ), null);
        if (this.LIZJ.invoke().LJIJ() != null) {
            InterfaceC63163Oqd LJIJ = this.LIZJ.invoke().LJIJ();
            if (LJIJ != null) {
                originalBody = LJIJ.LIZJ(i, originalBody);
            } else {
                originalBody = null;
            }
        }
        boolean z3 = false;
        if (originalBody == null || !C63162Oqc.LIZIZ(originalBody)) {
            return new C63210OrO(true, null, false);
        }
        if (CommandMessage.LJIIIZ(originalBody) && this.LIZIZ.invoke(originalBody).booleanValue()) {
            return new C63210OrO(true, null, false);
        }
        java.util.Map<String, String> map2 = originalBody.ext;
        String refValue = "";
        if (map2 == null || (str = map2.get("s:client_message_id")) == null) {
            str = "";
        }
        if (str.length() > 0) {
            c109544Rq = this.LIZ.LIZ(str);
        } else {
            c109544Rq = null;
        }
        Long l = originalBody.server_message_id;
        if (l == null) {
            longValue = 0;
        } else {
            longValue = l.longValue();
        }
        if (c109544Rq == null && longValue > 0) {
            c109544Rq = this.LIZ.LJ(longValue);
        }
        C109544Rq LJIIL = C63081OpJ.LJIIL(str, c109544Rq, originalBody);
        if (C63308Osy.LJI().LIZLLL().LJJZZIII) {
            LJIIL.updateMentionLocalExt();
        }
        if (map != null && !map.isEmpty()) {
            LJIIL.putLocalExt(map);
        }
        if (c109544Rq == null) {
            LIZJ = this.LIZ.LIZLLL(LJIIL);
        } else {
            LIZJ = this.LIZ.LIZJ(!o.LJ(c109544Rq.getPropertyItemListMap(), LJIIL.getPropertyItemListMap()), LJIIL);
        }
        ReferenceInfo referenceInfo = LJIIL.getReferenceInfo();
        if (referenceInfo != null) {
            C63322OtC.LJI("SaveMessageBodyToDBUseCase", "converted msg ref info: " + referenceInfo.referenced_message_id, null);
            try {
                refValue = C63682Oz0.LIZ.LJIILL(referenceInfo);
            } catch (Exception e) {
                C63337OtR.LJ("SaveMessageBodyToDBUseCase", e);
            }
            InterfaceC63207OrL interfaceC63207OrL = this.LIZ;
            String uuid = LJIIL.getUuid();
            o.LJIIIIZZ(uuid, "convertedMsg.uuid");
            String str2 = "ref_" + referenceInfo.referenced_message_id;
            o.LJIIIIZZ(refValue, "refValue");
            interfaceC63207OrL.LIZIZ(uuid, str2, refValue);
        }
        if (!LIZJ) {
            StringBuilder sb = new StringBuilder("save message failed, svrId ");
            sb.append(LJIIL.getMsgId());
            sb.append(", isNew ");
            if (c109544Rq == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            sb.append(z2);
            sb.append(", source: ");
            sb.append(i);
            sb.append(' ');
            C63337OtR.LJ("SaveMessageBodyToDBUseCase", new IllegalStateException(sb.toString()));
        } else {
            StringBuilder sb2 = new StringBuilder("save message success, svrId ");
            sb2.append(LJIIL.getMsgId());
            sb2.append(", isNew ");
            if (c109544Rq == null) {
                z = true;
            } else {
                z = false;
            }
            sb2.append(z);
            C63322OtC.LJI("SaveMessageBodyToDBUseCase", sb2.toString(), null);
        }
        if (c109544Rq == null) {
            z3 = true;
        }
        return new C63210OrO(LIZJ, LJIIL, z3);
    }
}
