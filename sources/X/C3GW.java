package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.jvm.internal.o;

/* renamed from: X.3GW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3GW {
    public static final C3GW LIZ = new C3GW();
    public static final Queue<C771931f> LIZIZ = new LinkedBlockingDeque();
    public static final List<C771931f> LIZJ = FII.LIZ();
    public static final List<InterfaceC75962yW> LIZLLL = new ArrayList();

    public final synchronized void LIZJ() {
        ((ArrayList) LIZLLL).clear();
    }

    public static boolean LJIIIIZZ() {
        if (LIZIZ.isEmpty() && LIZJ.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void LIZLLL() {
        List<InterfaceC75962yW> LLJI;
        List<C771931f> LLJI2;
        LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) LIZIZ;
        int size = linkedBlockingDeque.size();
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        if (C772631m.LIZ()) {
            onEventV3.LIZIZ("im_inner_push_queue_clear", C113554cx.LJJL(new OSZ("is_assemble", CardStruct.IStatusCode.DEFAULT), new OSZ("count", String.valueOf(size))));
        }
        C112464bC.LIZJ("cleared", linkedBlockingDeque.size());
        synchronized (this) {
            LLJI = ORZ.LLJI(LIZLLL);
        }
        if (!LLJI.isEmpty()) {
            for (InterfaceC75962yW interfaceC75962yW : LLJI) {
                Queue<C771931f> queue = LIZIZ;
                synchronized (queue) {
                    LLJI2 = ORZ.LLJI(queue);
                }
                interfaceC75962yW.LIZ(LLJI2);
            }
        }
        ((LinkedBlockingDeque) LIZIZ).clear();
    }

    public static C63120Opw LJFF(String str) {
        if (C3TX.LIZ()) {
            C3Q9.LIZ.getClass();
            C75782yE.LIZ();
            return C4WC.LIZIZ.LJII(str);
        }
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        return C4WC.LIZIZ.LIZ(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r26v0, types: [X.3GW] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Iterable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC67352kd<? super X.C112454bB> r27) {
        /*
            Method dump skipped, instructions count: 1051
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3GW.LIZ(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0267, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x026a, code lost:
    
        r3 = X.X1D.LIZ();
        r3.append("Notification is not group or single chat, notification type: ");
        r3.append(r0.LIZ);
        r3.append(" , message type: ");
        r3.append(r0.LIZJ.getConversationType());
        r2 = X.X1D.LIZIZ(r3);
        kotlin.jvm.internal.o.LJIIIZ(r2, "msg");
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0126, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0291, code lost:
    
        r1 = r2.LIZIZ(r0, r3, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0297, code lost:
    
        if (r1 != X.EnumC58928NAu.COROUTINE_SUSPENDED) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        r6 = X.C772231i.LIZ[r0.LIZ.ordinal()];
        r2 = X.C3GW.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        if (r6 == 1) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        r17 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        if (r6 == 2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r6 == 3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0083, code lost:
    
        r6 = r0.LJFF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0085, code lost:
    
        if (r6 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0087, code lost:
    
        r5 = LJFF((java.lang.String) r6.LJLILLLLZI);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008f, code lost:
    
        if (r5 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        r12 = java.lang.Integer.valueOf(r5.getConversationType());
        r2 = (java.lang.String) r6.LJLILLLLZI;
        X.C81093Gf.LIZ().getClass();
        r14 = X.C3IY.LIZJ(r5);
        r0 = r5.getCoreInfo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b3, code lost:
    
        if (r0 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b5, code lost:
    
        r0 = r0.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b9, code lost:
    
        if (r0 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e1, code lost:
    
        r17 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
    
        return new X.C112454bB(0, 1, r12, r2, r14, null, null, r17, (java.lang.String) r6.LJLJI, null, null, null, null, null, null, null, android.os.SystemClock.elapsedRealtime() - r3, 15727328);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e4, code lost:
    
        X.AnonymousClass325.LIZ.getClass();
        r2 = r0.LIZJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00eb, code lost:
    
        if (r2 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ef, code lost:
    
        r13 = r0.LJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f1, code lost:
    
        if (r13 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f3, code lost:
    
        r6 = r13.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f5, code lost:
    
        if (r6 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f7, code lost:
    
        r10 = r6.substring(2);
        kotlin.jvm.internal.o.LJIIIIZZ(r10, "this as java.lang.String).substring(startIndex)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0100, code lost:
    
        r6 = r2.getConversationType();
        r8 = X.AbstractC63505Ow9.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0107, code lost:
    
        if (r6 != r8) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0111, code lost:
    
        if (r0.LIZ == X.EnumC772331j.PROPERTY) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011b, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r2.getLocalExtValue("a:s_awe_msg_already_push_for_emoji"), "1") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011d, code lost:
    
        X.C34B.LJI("DmHelper", "return null cause single_chat already");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0128, code lost:
    
        r2.addLocalExt("a:s_awe_msg_already_push_for_emoji", "1");
        X.C106674Gp.LJIILJJIL(r2);
        r6 = X.EF7.LIZIZ().getString(com.zhiliaoapp.musically.R.string.pt_, r10);
        kotlin.jvm.internal.o.LJIIIIZZ(r6, "AppContextManager.getApp…react_private2, emojiStr)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0142, code lost:
    
        if (r13 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0144, code lost:
    
        r7 = r13.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0146, code lost:
    
        if (r7 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0148, code lost:
    
        r7 = r7.uid;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x014a, code lost:
    
        if (r7 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x014c, code lost:
    
        r7 = java.lang.String.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0150, code lost:
    
        r9 = X.C80533Eb.LJFF(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0154, code lost:
    
        if (r9 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0156, code lost:
    
        r12 = java.lang.Integer.valueOf(r8);
        r13 = r2.getConversationId();
        r14 = r9.getAvatarThumb();
        r17 = r9.getDisplayName();
        r22 = X.C47261Igj.LJJIJ(r0);
        r23 = java.lang.String.valueOf(r2.getSender());
        r0 = r9.getUid();
        kotlin.jvm.internal.o.LJIIIIZZ(r0, "uid");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return new X.C112454bB(0, 2, r12, r13, r14, null, null, r17, r6, null, 1, null, r22, r23, r0, r2.getScene(), android.os.SystemClock.elapsedRealtime() - r3, 785120);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a1, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01a3, code lost:
    
        r8 = X.AbstractC63505Ow9.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01a5, code lost:
    
        if (r6 != r8) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01a7, code lost:
    
        X.C3Q9.LIZ.getClass();
        X.C75782yE.LIZ();
        r16 = X.C4WC.LIZIZ.LIZ(r2.getConversationId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01b9, code lost:
    
        if (r16 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01bb, code lost:
    
        r6 = r16.getCoreInfo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01bf, code lost:
    
        if (r6 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01c1, code lost:
    
        r9 = r6.getIcon();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01c5, code lost:
    
        if (r9 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c7, code lost:
    
        r6 = new com.ss.android.ugc.aweme.base.model.UrlModel();
        r6.setUrlList(X.C47261Igj.LJJIJIIJI(r9, r9, r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01db, code lost:
    
        r15 = X.C81143Gk.LIZ;
        r14 = X.EnumC81073Gd.AT_MOST_DB;
        r9 = r2.getConversationId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01e5, code lost:
    
        if (r13 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01e7, code lost:
    
        r5 = r13.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01e9, code lost:
    
        if (r5 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01eb, code lost:
    
        r7 = r5.idempotent_id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ed, code lost:
    
        if (r7 != null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01f1, code lost:
    
        if (r13 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01f3, code lost:
    
        r5 = r13.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01f5, code lost:
    
        if (r5 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01f7, code lost:
    
        r5 = r5.sec_uid;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01f9, code lost:
    
        r12 = new X.C81183Go(r9, r7, r5);
        r15.getClass();
        r5 = X.C81143Gk.LIZ(r14, r12, null);
        r9 = X.EF7.LIZIZ();
        r7 = new java.lang.Object[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0209, code lost:
    
        if (r5 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x020b, code lost:
    
        r5 = r5.getDisplayName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x020f, code lost:
    
        if (r5 != null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0262, code lost:
    
        r17 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0211, code lost:
    
        r7[0] = r17;
        r7[1] = r10;
        r5 = r9.getString(com.zhiliaoapp.musically.R.string.pt8, r7);
        kotlin.jvm.internal.o.LJIIIIZZ(r5, "appContext.getString(R.s…playName ?: \"\", emojiStr)");
        r12 = java.lang.Integer.valueOf(r8);
        r13 = r2.getConversationId();
        r7 = r16.getCoreInfo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0234, code lost:
    
        if (r7 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0236, code lost:
    
        r1 = r7.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:?, code lost:
    
        return new X.C112454bB(0, 2, r12, r13, r6, null, null, r1, r5, null, null, null, X.C47261Igj.LJJIJ(r0), null, null, r2.getScene(), android.os.SystemClock.elapsedRealtime() - r3, 7338720);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0265, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ef, code lost:
    
        r7 = "";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(X.InterfaceC67352kd<? super X.C112454bB> r30) {
        /*
            Method dump skipped, instructions count: 667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3GW.LJII(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.C109544Rq r9, X.InterfaceC67352kd<? super java.lang.String> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C81043Ga
            if (r0 == 0) goto Ld7
            r4 = r10
            X.3Ga r4 = (X.C81043Ga) r4
            int r2 = r4.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Ld7
            int r2 = r2 - r1
            r4.LJLJJL = r2
        L12:
            java.lang.Object r1 = r4.LJLJI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJL
            r5 = 1
            if (r0 == 0) goto L2f
            if (r0 != r5) goto Lde
            java.lang.Object r6 = r4.LJLILLLLZI
            java.lang.StringBuilder r6 = (java.lang.StringBuilder) r6
            java.lang.Object r7 = r4.LJLIL
            java.lang.String r7 = (java.lang.String) r7
            X.C141335gf.LIZJ(r1)
        L28:
            java.lang.String r0 = "{\n                val bu….toString()\n            }"
            java.lang.String r6 = X.C0EH.LIZJ(r6, r7, r0)
        L2e:
            return r6
        L2f:
            X.C141335gf.LIZJ(r1)
            X.4Tx r0 = X.EnumC110124Tw.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent r2 = X.C110134Tx.LIZJ(r9)
            boolean r0 = X.C93793mB.LJIIZILJ(r9)
            java.lang.String r6 = ""
            if (r0 == 0) goto L56
            r1 = 2131831153(0x7f112971, float:1.9295324E38)
            java.lang.String r0 = "getApplicationContext().…Cell_ViolativeMsgRemoved)"
            java.lang.String r7 = X.C1DD.LIZLLL(r1, r0)
        L4c:
            int r1 = r9.getConversationType()
            int r0 = X.AbstractC63505Ow9.LIZ
            if (r1 != r0) goto Lb3
            r6 = r7
            goto L2e
        L56:
            if (r2 == 0) goto L95
            long r0 = r9.getSender()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r9.getSecSender()
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = X.C80533Eb.LJIIJ(r1, r0)
            if (r0 == 0) goto L93
            java.lang.String r1 = r0.getDisplayName()
        L6e:
            boolean r0 = r9.isSelf()
            if (r0 != 0) goto L86
            boolean r0 = r9.getHasMention()
            if (r0 == 0) goto L86
            android.content.Context r0 = X.EF7.LIZIZ()
            java.lang.String r7 = r2.wrapMentionMsgHint(r0, r5, r1)
            if (r7 != 0) goto L4c
        L84:
            r7 = r6
            goto L4c
        L86:
            boolean r0 = r9.isSelf()
            r0 = r0 ^ 1
            java.lang.String r7 = r2.wrapMsgHint(r0, r5, r1, r9)
            if (r7 != 0) goto L4c
            goto L84
        L93:
            r1 = r6
            goto L6e
        L95:
            com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate r1 = X.C1DJ.LJIILL(r9)
            if (r1 == 0) goto L84
            boolean r0 = r9.isSelf()
            if (r0 == 0) goto Laa
            com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent r0 = r1.LLZLL()
            com.ss.android.ugc.aweme.im.message.template.component.TextComponent r0 = r0.senderPreviewText
            java.lang.String r7 = r0.text
            goto L4c
        Laa:
            com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent r0 = r1.LLZLL()
            com.ss.android.ugc.aweme.im.message.template.component.TextComponent r0 = r0.receiverPreviewText
            java.lang.String r7 = r0.text
            goto L4c
        Lb3:
            int r0 = X.AbstractC63505Ow9.LIZIZ
            if (r1 != r0) goto L2e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r1 = r9.getMsgType()
            if (r1 == r5) goto L28
            r0 = 1030(0x406, float:1.443E-42)
            if (r1 == r0) goto L28
            r0 = 1031(0x407, float:1.445E-42)
            if (r1 == r0) goto L28
            r4.LJLIL = r7
            r4.LJLILLLLZI = r6
            r4.LJLJJL = r5
            java.lang.Object r0 = r8.LJIIIZ(r6, r9, r2, r4)
            if (r0 != r3) goto L28
            return r3
        Ld7:
            X.3Ga r4 = new X.3Ga
            r4.<init>(r8, r10)
            goto L12
        Lde:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3GW.LJI(X.4Rq, X.2kd):java.lang.Object");
    }

    public static void LJ(C31Z type, List list, int i) {
        o.LJIIIZ(type, "type");
        type.enqueueMsg(list, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f5, code lost:
    
        if (r4 != null) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0125 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C771931f r33, long r34, X.InterfaceC67352kd<? super X.C112454bB> r36) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3GW.LIZIZ(X.31f, long, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(java.lang.StringBuilder r12, X.C109544Rq r13, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent r14, X.InterfaceC67352kd<? super X.C76800UCe> r15) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3GW.LJIIIZ(java.lang.StringBuilder, X.4Rq, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent, X.2kd):java.lang.Object");
    }
}
