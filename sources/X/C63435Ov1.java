package X;

import Y.ARunnableS29S0200000_10;
import Y.IDbS168S0200000_1;
import Y.IDcS407S0100000_10;
import com.bytedance.im.core.model.DeleteConversationRequest;
import com.bytedance.im.core.proto.DeleteConversationRequestBody;
import com.bytedance.im.core.proto.DeleteStrangerConversationRequestBody;
import com.bytedance.im.core.proto.RequestBody;

/* renamed from: X.Ov1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63435Ov1 extends AbstractC63515OwJ<String> {
    public boolean LIZJ;
    public boolean LIZLLL;
    public long LJ;
    public int LJFF;
    public int LJI;
    public RequestBody LJII;
    public volatile boolean LJIIIIZZ;

    public C63435Ov1() {
        this(null, false);
    }

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        return true;
    }

    public final void LJIILJJIL(C63120Opw c63120Opw) {
        RequestBody build;
        int inboxType = c63120Opw.getInboxType();
        String conversationId = c63120Opw.getConversationId();
        C63269OsL.LJIIJJI(inboxType, conversationId);
        this.LJI = inboxType;
        this.LJ = System.currentTimeMillis();
        if (this.LIZJ) {
            C63492Ovw c63492Ovw = new C63492Ovw();
            c63492Ovw.LIZLLL = Long.valueOf(c63120Opw.getConversationShortId());
            DeleteStrangerConversationRequestBody build2 = c63492Ovw.build();
            C89453Z8v c89453Z8v = new C89453Z8v();
            c89453Z8v.LJJJJIZL = build2;
            build = c89453Z8v.build();
        } else {
            C63459OvP c63459OvP = new C63459OvP();
            c63459OvP.LIZLLL = conversationId;
            c63459OvP.LJ = Long.valueOf(c63120Opw.getConversationShortId());
            c63459OvP.LJFF = Integer.valueOf(c63120Opw.getConversationType());
            c63459OvP.LJI = Long.valueOf(c63120Opw.getLastMessageIndex());
            c63459OvP.LJII = Long.valueOf(c63120Opw.getMaxIndexV2());
            c63459OvP.LJIIIIZZ = Integer.valueOf(c63120Opw.getBadgeCount());
            DeleteConversationRequestBody build3 = c63459OvP.build();
            C89453Z8v c89453Z8v2 = new C89453Z8v();
            c89453Z8v2.LJIILL = build3;
            build = c89453Z8v2.build();
            this.LJII = build;
        }
        if (this.LJIIIIZZ) {
            LJIIL(inboxType, build, null, C03660Ck.LIZJ("retry", "refresh_conv"), conversationId);
        } else {
            LJIIJJI(inboxType, build, null, conversationId);
        }
    }

    public final void LJIILL(DeleteConversationRequest deleteConversationRequest) {
        if (deleteConversationRequest == null) {
            C63322OtC.LIZLLL("DeleteConversationHandler retryDeleteReq, request invalid");
            return;
        }
        this.LIZLLL = true;
        this.LIZJ = false;
        this.LJFF = deleteConversationRequest.retryTimes;
        this.LJ = deleteConversationRequest.userDelTime;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DeleteConversationHandler retryDeleteReq, cid:");
        LIZ.append(deleteConversationRequest.conversationId);
        LIZ.append(", retryTimes:");
        LIZ.append(this.LJFF);
        LIZ.append(", userDelTime:");
        LIZ.append(this.LJ);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LJIILL = deleteConversationRequest.toReqBody();
        RequestBody build = c89453Z8v.build();
        if (this.LJIIIIZZ) {
            LJIIL(deleteConversationRequest.inboxType, build, null, C03660Ck.LIZJ("retry", "refresh_conv"), deleteConversationRequest.conversationId);
        } else {
            LJIIJJI(deleteConversationRequest.inboxType, build, null, deleteConversationRequest.conversationId);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C63435Ov1(X.InterfaceC86963bA r2, boolean r3) {
        /*
            r1 = this;
            if (r3 == 0) goto L11
            X.Oy5 r0 = X.EnumC63625Oy5.DELETE_STRANGER_CONVERSATION
        L4:
            int r0 = r0.getValue()
            r1.<init>(r0, r2)
            r0 = 0
            r1.LJIIIIZZ = r0
            r1.LIZJ = r3
            return
        L11:
            X.Oy5 r0 = X.EnumC63625Oy5.MARK_CONVERSATION_DELETE
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63435Ov1.<init>(X.3bA, boolean):void");
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        RequestBody requestBody;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DeleteConversationHandler handleResponse, isSuccess:");
        LIZ.append(c63622Oy2.LJIIJ());
        LIZ.append(", mStranger:");
        LIZ.append(this.LIZJ);
        LIZ.append(", mIsRetry:");
        LIZ.append(this.LIZLLL);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        String str = (String) c63622Oy2.LJLJJL[0];
        if (!this.LJIIIIZZ) {
            C115284fk LJIILIIL = C115284fk.LJIILIIL();
            Integer num = c63622Oy2.LJLJL.status_code;
            LJIILIIL.getClass();
            if (C115284fk.LIZJ(num)) {
                C115284fk LJIILIIL2 = C115284fk.LJIILIIL();
                int LJFF = c63622Oy2.LJFF();
                C63436Ov2 c63436Ov2 = new C63436Ov2(this, str);
                LJIILIIL2.getClass();
                C115284fk.LJIL(LJFF, c63436Ov2, str);
                return;
            }
        }
        if (!this.LIZJ) {
            if (c63622Oy2.LJIIJ()) {
                InterfaceC63330OtK interfaceC63330OtK = C63324OtE.LIZJ;
                if (interfaceC63330OtK != null) {
                    interfaceC63330OtK.remove(str);
                }
            } else if (!this.LIZLLL && (requestBody = this.LJII) != null) {
                int i = this.LJI;
                DeleteConversationRequestBody deleteConversationRequestBody = requestBody.delete_conversation_body;
                InterfaceC63330OtK interfaceC63330OtK2 = C63324OtE.LIZJ;
                if (interfaceC63330OtK2 != null) {
                    interfaceC63330OtK2.LIZ(i, str, deleteConversationRequestBody);
                }
            }
        } else if (c63622Oy2.LJIIJ()) {
            C63120Opw LJIIIZ = C115284fk.LJIILIIL().LJIIIZ(str);
            if (LJIIIZ == null || LJIIIZ.isTemp()) {
                LIZIZ(C63622Oy2.LIZJ(-1017));
                return;
            }
            RunnableC63345OtZ.LJ(new IDcS407S0100000_10(LJIIIZ, 8), new IDbS168S0200000_1(this, LJIIIZ, 3), false);
        } else {
            LIZIZ(C63622Oy2.LIZJ(-9999));
        }
        C63272OsO.LJI(str, this.LIZJ, this.LIZLLL, this.LJFF, this.LJ, c63622Oy2.LJIIJ(), C63623Oy3.LIZ(c63622Oy2));
    }

    public final void LJIILIIL(String str, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DeleteConversationHandler delete, cid:");
        LIZ.append(str);
        LIZ.append(", isLocal:");
        LIZ.append(z);
        LIZ.append(", isStranger:");
        LIZ.append(this.LIZJ);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        C63120Opw LJIIIZ = C115284fk.LJIILIIL().LJIIIZ(str);
        if (LJIIIZ == null) {
            LIZIZ(C63622Oy2.LIZJ(-1017));
            return;
        }
        if (!this.LIZJ) {
            RunnableC63345OtZ.LJ(new IDcS407S0100000_10(LJIIIZ, 8), new IDbS168S0200000_1(this, LJIIIZ, 3), false);
            if (!z && !LJIIIZ.isTemp()) {
                LJIILJJIL(LJIIIZ);
                return;
            }
            return;
        }
        if (!z) {
            LJIILJJIL(LJIIIZ);
        } else {
            RunnableC63345OtZ.LJ(new IDcS407S0100000_10(LJIIIZ, 8), new IDbS168S0200000_1(this, LJIIIZ, 3), false);
        }
    }
}
