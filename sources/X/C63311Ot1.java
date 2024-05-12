package X;

import Y.IDbS168S0200000_1;
import android.text.TextUtils;
import com.bytedance.im.core.proto.DeleteMessageRequestBody;
import com.bytedance.im.core.proto.DeleteStrangerMessageRequestBody;
import com.bytedance.im.core.proto.RequestBody;

/* renamed from: X.Ot1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63311Ot1 implements InterfaceC86963bA<C63120Opw> {
    public final /* synthetic */ InterfaceC86963bA LIZ;
    public final /* synthetic */ C109544Rq LIZIZ;
    public final /* synthetic */ boolean LIZJ;

    @Override // X.InterfaceC86963bA
    public final void LIZIZ(C63623Oy3 c63623Oy3) {
    }

    @Override // X.InterfaceC86963bA
    public final void onSuccess(C63120Opw c63120Opw) {
        boolean z;
        C63120Opw c63120Opw2 = c63120Opw;
        if (c63120Opw2 != null && c63120Opw2.isStranger()) {
            z = true;
        } else {
            z = false;
        }
        C63320OtA c63320OtA = new C63320OtA(this.LIZ, z);
        C109544Rq c109544Rq = this.LIZIZ;
        boolean z2 = this.LIZJ;
        StringBuilder LJI = JBR.LJI("DeleteMsgHandler delete, isLocal:", z2, ", stranger:");
        LJI.append(c63320OtA.LIZJ);
        C63322OtC.LJFF(X1D.LIZIZ(LJI));
        if (c109544Rq == null) {
            c63320OtA.LIZIZ(C63622Oy2.LIZJ(-1015));
            return;
        }
        c63320OtA.LIZLLL = c109544Rq;
        String uuid = c109544Rq.getUuid();
        String conversationId = c109544Rq.getConversationId();
        if (TextUtils.isEmpty(uuid) || TextUtils.isEmpty(conversationId)) {
            c63320OtA.LIZIZ(C63622Oy2.LIZJ(-1015));
            return;
        }
        C63120Opw LJIIIZ = C115284fk.LJIILIIL().LJIIIZ(conversationId);
        if (LJIIIZ != null && c109544Rq.getMsgId() > 0 && !z2) {
            int inboxType = LJIIIZ.getInboxType();
            long conversationShortId = c109544Rq.getConversationShortId();
            int conversationType = c109544Rq.getConversationType();
            long msgId = c109544Rq.getMsgId();
            if (c63320OtA.LIZJ) {
                C63490Ovu c63490Ovu = new C63490Ovu();
                c63490Ovu.LJ = Long.valueOf(conversationShortId);
                c63490Ovu.LIZLLL = Long.valueOf(msgId);
                DeleteStrangerMessageRequestBody build = c63490Ovu.build();
                C89453Z8v c89453Z8v = new C89453Z8v();
                c89453Z8v.LJJJJI = build;
                RequestBody build2 = c89453Z8v.build();
                c63320OtA.LJII = build2;
                c63320OtA.LJIIJJI(inboxType, build2, null, new Object[0]);
            } else {
                C63468OvY c63468OvY = new C63468OvY();
                c63468OvY.LIZLLL = conversationId;
                c63468OvY.LJ = Long.valueOf(conversationShortId);
                c63468OvY.LJFF = Integer.valueOf(conversationType);
                c63468OvY.LJI = Long.valueOf(msgId);
                DeleteMessageRequestBody build3 = c63468OvY.build();
                C89453Z8v c89453Z8v2 = new C89453Z8v();
                c89453Z8v2.LJJIJIIJI = build3;
                RequestBody build4 = c89453Z8v2.build();
                c63320OtA.LJII = build4;
                c63320OtA.LJIIJJI(inboxType, build4, null, new Object[0]);
            }
        }
        RunnableC63345OtZ.LJ(new C63161Oqb(c63320OtA, uuid, conversationId, c109544Rq), new IDbS168S0200000_1(c63320OtA, c109544Rq, 5), false);
        C63309Osz LIZLLL = C63309Osz.LIZLLL();
        LIZLLL.getClass();
        if (TextUtils.isEmpty(c109544Rq.getConversationId())) {
            return;
        }
        LIZLLL.LIZJ(c109544Rq.getConversationId(), new C63252Os4(c109544Rq));
    }

    public C63311Ot1(InterfaceC86963bA interfaceC86963bA, C109544Rq c109544Rq, boolean z) {
        this.LIZ = interfaceC86963bA;
        this.LIZIZ = c109544Rq;
        this.LIZJ = z;
    }
}
