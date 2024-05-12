package X;

import android.os.SystemClock;
import com.bytedance.im.core.proto.MessageBody;
import java.util.PriorityQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;

/* renamed from: X.Oum, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63420Oum implements InterfaceC63396OuO {
    public static final /* synthetic */ int LJIIJJI = 0;
    public final int LIZ;
    public final long LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final InterfaceC63423Oup LJ;
    public final AtomicInteger LJFF = new AtomicInteger(0);
    public final PriorityQueue<C63424Ouq> LJI = new PriorityQueue<>(11, C63430Ouw.LJLIL);
    public final XJO LJII = XJR.LIZ();
    public final PriorityQueue<C63426Ous> LJIIIIZZ = new PriorityQueue<>(11, C63431Oux.LJLIL);
    public final XJO LJIIIZ = XJR.LIZ();
    public XKQ LJIIJ;

    public final boolean LJ() {
        if (this.LJIIIIZZ.size() + this.LJI.size() <= 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC63396OuO
    public final void clear() {
        this.LJI.clear();
        this.LJIIIIZZ.clear();
    }

    public final C76800UCe LJFF(int i) {
        XKQ xkq;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("moveToProcessingState, queue size ");
        LIZ.append(this.LJI.size());
        LIZ.append(' ');
        LIZ.append(this.LJIIIIZZ.size());
        C63322OtC.LJI("SingleInboxMessageReceiveBuffer", X1D.LIZIZ(LIZ), null);
        if (!this.LJFF.compareAndSet(i, 1)) {
            C63322OtC.LJI("SingleInboxMessageReceiveBuffer", "moveToProcessingState, duplicate call, return", null);
            return C76800UCe.LIZ;
        }
        XKQ xkq2 = this.LJIIJ;
        if (xkq2 != null && xkq2.isActive() && (xkq = this.LJIIJ) != null) {
            xkq.LIZIZ(new CancellationException("Duplicated processing job, cancelling"));
        }
        this.LJIIJ = XKX.LIZLLL(this.LJ.LJI(), this.LJ.LJIIIIZZ(), null, new C36120EFo(this, null), 2);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.InterfaceC67352kd<? super X.C76800UCe> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C63427Out
            if (r0 == 0) goto L2a
            r5 = r10
            X.Out r5 = (X.C63427Out) r5
            int r2 = r5.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2a
            int r2 = r2 - r1
            r5.LJLJJL = r2
        L12:
            java.lang.Object r8 = r5.LJLJI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJL
            r7 = 1
            r3 = 0
            r2 = 2
            if (r0 == 0) goto L3e
            if (r0 == r7) goto L38
            if (r0 != r2) goto L30
            X.XJO r1 = r5.LJLILLLLZI
            X.Oum r6 = r5.LJLIL
            X.C141335gf.LIZJ(r8)
            goto Lca
        L2a:
            X.Out r5 = new X.Out
            r5.<init>(r9, r10)
            goto L12
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L38:
            X.Oum r6 = r5.LJLIL
            X.C141335gf.LIZJ(r8)
            goto La9
        L3e:
            java.lang.String r0 = "moveToWaitingState, queue size "
            java.lang.StringBuilder r1 = X.C43881HKb.LIZIZ(r8, r0)
            java.util.PriorityQueue<X.Ouq> r0 = r9.LJI
            int r0 = r0.size()
            r1.append(r0)
            r0 = 32
            r1.append(r0)
            java.util.PriorityQueue<X.Ous> r0 = r9.LJIIIIZZ
            int r0 = r0.size()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            java.lang.String r6 = "SingleInboxMessageReceiveBuffer"
            X.C63322OtC.LJI(r6, r0, r3)
            java.util.concurrent.atomic.AtomicInteger r0 = r9.LJFF
            boolean r0 = r0.compareAndSet(r7, r2)
            if (r0 != 0) goto L8d
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "moveToWaitingState, set to waiting failed, current state is "
            r1.append(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r9.LJFF
            int r0 = r0.get()
            r1.append(r0)
            java.lang.String r0 = ", return"
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C63322OtC.LJI(r6, r0, r3)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L8d:
            boolean r0 = r9.LIZLLL
            if (r0 != 0) goto L9b
            X.Oup r1 = r9.LJ
            int r0 = r9.LIZ
            r1.LJIIJJI(r0, r2)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L9b:
            long r0 = r9.LIZIZ
            r5.LJLIL = r9
            r5.LJLJJL = r7
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r5)
            if (r0 != r4) goto La8
            return r4
        La8:
            r6 = r9
        La9:
            java.util.concurrent.atomic.AtomicInteger r0 = r6.LJFF
            int r0 = r0.get()
            if (r0 != r2) goto Ldf
            X.MBA r0 = r5.getContext()
            boolean r0 = X.C79146V4k.LJJJ(r0)
            if (r0 == 0) goto Ldf
            X.XJO r1 = r6.LJIIIZ
            r5.LJLIL = r6
            r5.LJLILLLLZI = r1
            r5.LJLJJL = r2
            java.lang.Object r0 = r1.LIZ(r3, r5)
            if (r0 != r4) goto Lca
            return r4
        Lca:
            java.util.PriorityQueue<X.Ous> r0 = r6.LJIIIIZZ     // Catch: java.lang.Throwable -> Ld0
            r0.clear()     // Catch: java.lang.Throwable -> Ld0
            goto Ld5
        Ld0:
            r0 = move-exception
            r1.LIZIZ(r3)
            throw r0
        Ld5:
            r1.LIZIZ(r3)
            X.Oup r1 = r6.LJ
            int r0 = r6.LIZ
            r1.LJIIJJI(r0, r2)
        Ldf:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63420Oum.LJI(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x03f3, code lost:
    
        if (r2.LIZIZ == 0) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00b3, code lost:
    
        r14 = 1;
        r13 = 0;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0020. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0427 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v16, types: [X.2kd, X.XJO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v18, types: [X.XJO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Throwable, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:169:0x010c -> B:12:0x010f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0068 -> B:17:0x00b3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(X.InterfaceC67352kd<? super X.C76800UCe> r36) {
        /*
            Method dump skipped, instructions count: 1276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63420Oum.LJIIIZ(X.2kd):java.lang.Object");
    }

    @Override // X.InterfaceC63396OuO
    public final Object LIZ(C63424Ouq c63424Ouq, C63369Otx c63369Otx) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enqueueGetMsgByUserResponse logId ");
        LIZ.append(c63424Ouq.LIZLLL);
        C63322OtC.LJI("SingleInboxMessageReceiveBuffer", X1D.LIZIZ(LIZ), null);
        Object LIZLLL = LIZLLL(new C63428Ouu(c63424Ouq), c63369Otx);
        if (LIZLLL == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LIZLLL;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC63396OuO
    public final Object LIZIZ(C63426Ous c63426Ous, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enqueueWsNotify logId ");
        LIZ.append(c63426Ous.LIZJ);
        C63322OtC.LJI("SingleInboxMessageReceiveBuffer", X1D.LIZIZ(LIZ), null);
        Object LIZLLL = LIZLLL(new C63429Ouv(c63426Ous), interfaceC67352kd);
        if (LIZLLL == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LIZLLL;
        }
        return C76800UCe.LIZ;
    }

    public final void LIZJ(int i, C109544Rq c109544Rq) {
        C63120Opw LJIIIZ = this.LJ.LJIIIZ().LJIIIZ(c109544Rq.getConversationId());
        if (LJIIIZ == null) {
            InterfaceC63423Oup interfaceC63423Oup = this.LJ;
            String conversationId = c109544Rq.getConversationId();
            o.LJIIIIZZ(conversationId, "savedMessage.conversationId");
            LJIIIZ = interfaceC63423Oup.LJIILIIL(conversationId);
        }
        if (LJIIIZ != null && !LJIIIZ.isWaitingInfo() && !LJIIIZ.isTemp()) {
            this.LJ.LIZ(LJIIIZ, c109544Rq, i);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("buildOrUpdateConversation, sync update. conv id: ");
            LIZ.append(LJIIIZ.getConversationId());
            C63322OtC.LJI("SingleInboxMessageReceiveBuffer", X1D.LIZIZ(LIZ), null);
            return;
        }
        this.LJ.LIZJ(this.LIZ, c109544Rq);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("buildOrUpdateConversation, add wait. conv id: ");
        LIZ2.append(c109544Rq.getConversationId());
        C63322OtC.LJI("SingleInboxMessageReceiveBuffer", X1D.LIZIZ(LIZ2), null);
        if (LJIIIZ != null) {
            return;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("buildOrUpdateConversation, sync build. conv id: ");
        LIZ3.append(c109544Rq.getConversationId());
        C63322OtC.LJI("SingleInboxMessageReceiveBuffer", X1D.LIZIZ(LIZ3), null);
        InterfaceC63423Oup interfaceC63423Oup2 = this.LJ;
        int i2 = this.LIZ;
        String conversationId2 = c109544Rq.getConversationId();
        o.LJIIIIZZ(conversationId2, "savedMessage.conversationId");
        c109544Rq.getConversationShortId();
        c109544Rq.getConversationType();
        c109544Rq.getCreatedAt();
        C63120Opw LJII = interfaceC63423Oup2.LJII(i2, conversationId2, i, c109544Rq);
        if (LJII == null) {
            return;
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("buildOrUpdateConversation, sync update. conv id: ");
        LIZ4.append(c109544Rq.getConversationId());
        C63322OtC.LJI("SingleInboxMessageReceiveBuffer", X1D.LIZIZ(LIZ4), null);
        this.LJ.LIZ(LJII, c109544Rq, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x001c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0207 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.AbstractC63432Ouy r12, X.InterfaceC67352kd<? super X.C76800UCe> r13) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63420Oum.LIZLLL(X.Ouy, X.2kd):java.lang.Object");
    }

    public final C63210OrO LJII(int i, MessageBody messageBody) {
        if (C115394fv.LJIIIIZZ(messageBody)) {
            C115394fv.LJII().LJI(this.LIZ, messageBody);
            if (i == 0) {
                this.LJ.LJIIJJI(this.LIZ, 12);
            }
            C63322OtC.LJI("SingleInboxMessageReceiveBuffer", "processMessageBody, stranger promotion", null);
            return new C63210OrO(true, null, false);
        }
        return this.LJ.LJFF().LIZ(messageBody, i, null);
    }

    public C63420Oum(int i, long j, boolean z, boolean z2, C63365Ott c63365Ott) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = c63365Ott;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r0v29, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(X.C63426Ous r32, long r33, java.util.List<X.C63403OuV> r35, java.util.List<X.C63403OuV> r36, X.InterfaceC67352kd<? super java.lang.Boolean> r37) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63420Oum.LJIIIIZZ(X.Ous, long, java.util.List, java.util.List, X.2kd):java.lang.Object");
    }

    public static void LJIIJ(boolean z, String str, MessageBody messageBody, long j, long j2, String str2, boolean z2) {
        long longValue;
        int intValue;
        long uptimeMillis = SystemClock.uptimeMillis();
        C63308Osy.LJI().getClass();
        long j3 = uptimeMillis - j2;
        long LJ = C63308Osy.LJ() - j;
        Long l = messageBody.server_message_id;
        if (l == null) {
            longValue = 0;
        } else {
            longValue = l.longValue();
        }
        Integer num = messageBody.message_type;
        if (num == null) {
            intValue = 0;
        } else {
            intValue = num.intValue();
        }
        String str3 = messageBody.conversation_id;
        if (str3 == null) {
            str3 = "";
        }
        C63198OrC.LJ(j3, LJ, str, longValue, intValue, str3, z2, z, str2, true);
    }
}
