package X;

import Y.ARunnableS29S0200000_10;
import Y.IDbS168S0200000_1;
import Y.IDcS133S0200000_1;
import com.bytedance.im.core.proto.BatchGetConversationParticipantsReadIndexResponseBody;
import com.bytedance.im.core.proto.Response;
import com.bytedance.im.core.proto.ResponseBody;

/* renamed from: X.4na, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C120144na extends AbstractC63515OwJ<C4WG> {
    public boolean LIZJ;

    public C120144na(C4WF c4wf) {
        super(EnumC63625Oy5.BATCH_GAT_CONVERSATION_PARTICIPANTS_READINDEX.getValue(), c4wf);
        this.LIZJ = false;
    }

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        Response response;
        ResponseBody responseBody;
        BatchGetConversationParticipantsReadIndexResponseBody batchGetConversationParticipantsReadIndexResponseBody;
        if (c63622Oy2 != null && (response = c63622Oy2.LJLJL) != null && (responseBody = response.body) != null && (batchGetConversationParticipantsReadIndexResponseBody = responseBody.batch_get_conversation_participants_readindex) != null && batchGetConversationParticipantsReadIndexResponseBody.conversationParticipantsReadIndex != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        boolean z;
        if (c63622Oy2.LJIIJ() && LJIIIZ(c63622Oy2)) {
            z = true;
            Object[] objArr = c63622Oy2.LJLJJL;
            if (objArr == null || objArr.length == 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("BatchGetReadIndexHandler");
                LIZ.append(", handleResponse, no params, return");
                C63322OtC.LJFF(X1D.LIZIZ(LIZ));
                return;
            }
            RunnableC63345OtZ.LJ(new IDcS133S0200000_1(this, c63622Oy2, 1), new IDbS168S0200000_1(this, c63622Oy2, 4), false);
        } else {
            z = false;
            LIZIZ(c63622Oy2);
        }
        C63337OtR.LJII(c63622Oy2, z).LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(java.lang.String r18, java.util.List r19, boolean r20) {
        /*
            r17 = this;
            r5 = r17
            r0 = r20
            r5.LIZJ = r0
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r8 = "BatchGetReadIndexHandler"
            r1.append(r8)
            java.lang.String r0 = " get, from + "
            r1.append(r0)
            r9 = r18
            r1.append(r9)
            java.lang.String r0 = ", messageListP = "
            r1.append(r0)
            r2 = r19
            r1.append(r2)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C63322OtC.LJFF(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r16 = r2.iterator()
            r15 = 0
            r3 = 0
        L3f:
            boolean r0 = r16.hasNext()
            r11 = 1
            if (r0 == 0) goto Lbd
            java.lang.Object r0 = r16.next()
            X.4Rq r0 = (X.C109544Rq) r0
            r4.add(r0)
            java.lang.String r12 = r0.getConversationId()
            if (r12 == 0) goto L3f
            X.4fk r0 = X.C115284fk.LJIILIIL()
            X.Opw r10 = r0.LJIIIZ(r12)
            X.Osy r0 = X.C63308Osy.LJI()
            X.4eO r0 = r0.LIZLLL()
            boolean r0 = r0.LJJZZI
            r13 = 0
            if (r0 == 0) goto Lba
            if (r10 == 0) goto L75
            long r1 = r10.getConversationShortId()
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 != 0) goto L94
        L75:
            X.4fk r1 = X.C115284fk.LJIILIIL()
            r1.getClass()
            java.lang.String r0 = "ConversationListModel getConversationFromDBSync"
            X.C63322OtC.LJFF(r0)
            X.Opw r10 = X.C63133Oq9.LJIIIZ(r12, r11)
            if (r10 == 0) goto L3f
            boolean r0 = r10.isStranger()
            if (r0 == 0) goto Laf
            X.4fv r0 = X.C115394fv.LJII()
            r0.LJIILL(r10)
        L94:
            long r1 = r10.getConversationShortId()
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 == 0) goto L3f
            int r3 = r10.getInboxType()
            r7.add(r12)
            long r0 = r10.getConversationShortId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.add(r0)
            goto L3f
        Laf:
            X.C47922IrO.LIZ()
            X.Opw[] r0 = new X.C63120Opw[r11]
            r0[r15] = r10
            r1.LJIIL(r0)
            goto L94
        Lba:
            if (r10 == 0) goto L3f
            goto L94
        Lbd:
            boolean r0 = X.V1B.LJJZZIII(r4)
            if (r0 == 0) goto Ld7
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r8)
            java.lang.String r0 = " get, messageList is null, return"
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C63322OtC.LJFF(r0)
            return
        Ld7:
            X.4o5 r1 = new X.4o5
            r1.<init>()
            X.C63685Oz3.LIZ(r7)
            r1.LIZLLL = r7
            X.C63685Oz3.LIZ(r6)
            r1.LJ = r6
            r1.LJFF = r9
            X.C47922IrO.LIZ()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.LJI = r0
            com.bytedance.im.core.proto.BatchGetConversationParticipantsReadIndexRequestBody r1 = r1.build()
            X.Z8v r0 = new X.Z8v
            r0.<init>()
            r0.LJJLIIIJLLLLLLLZ = r1
            com.bytedance.im.core.proto.RequestBody r2 = r0.build()
            java.lang.Object[] r1 = new java.lang.Object[r11]
            r1[r15] = r4
            r0 = 0
            r5.LJIIJJI(r3, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C120144na.LJIILIIL(java.lang.String, java.util.List, boolean):void");
    }
}
