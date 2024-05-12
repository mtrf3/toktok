package X;

import com.bytedance.android.livesdk.chatroom.viewmodule.QuickCommentWidget;

/* loaded from: classes6.dex */
public final class CJU<T> implements InterfaceC64592gB {
    public final /* synthetic */ QuickCommentWidget LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    public CJU(QuickCommentWidget quickCommentWidget, boolean z, String str) {
        this.LJLIL = quickCommentWidget;
        this.LJLILLLLZI = z;
        this.LJLJI = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d8, code lost:
    
        if (r15 != null) goto L19;
     */
    @Override // X.InterfaceC64592gB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void accept(java.lang.Object r15) {
        /*
            r14 = this;
            com.bytedance.android.live.network.response.BaseResponse r15 = (com.bytedance.android.live.network.response.BaseResponse) r15
            com.bytedance.android.livesdk.chatroom.viewmodule.QuickCommentWidget r1 = r14.LJLIL
            boolean r0 = r1.LJLJJI
            r6 = 0
            r5 = 1
            if (r0 != 0) goto L1c
            boolean r0 = r1.LJLJJL
            if (r0 == 0) goto L12
            boolean r0 = r14.LJLILLLLZI
            if (r0 != 0) goto L1c
        L12:
            java.lang.String r1 = r14.LJLJI
            java.lang.String r0 = "3"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L5e
        L1c:
            com.bytedance.android.livesdk.chatroom.viewmodule.QuickCommentWidget r0 = r14.LJLIL
            boolean r0 = r0.LJLJL
            if (r0 != 0) goto L5e
            r2 = 0
            if (r15 == 0) goto L55
            T r0 = r15.data
            com.bytedance.android.livesdk.chatroom.model.QuickComment r0 = (com.bytedance.android.livesdk.chatroom.model.QuickComment) r0
            if (r0 == 0) goto Ld7
            java.util.List r0 = r0.getQuickComments()
            if (r0 == 0) goto Ld7
            java.util.List r1 = X.ORZ.LJLL(r0)
        L35:
            T r0 = r15.data
            com.bytedance.android.livesdk.chatroom.model.QuickComment r0 = (com.bytedance.android.livesdk.chatroom.model.QuickComment) r0
            if (r0 == 0) goto L45
            java.util.List r0 = r0.getEmoteList()
            if (r0 == 0) goto L45
            java.util.List r2 = X.ORZ.LJLL(r0)
        L45:
            if (r1 == 0) goto L4d
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L5f
        L4d:
            if (r2 == 0) goto L55
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L5f
        L55:
            com.bytedance.android.livesdk.chatroom.viewmodule.QuickCommentWidget r1 = r14.LJLIL
            X.CJW r0 = r1.LJLLJ
            if (r0 != 0) goto L5e
            r1.LJLZ()
        L5e:
            return
        L5f:
            com.bytedance.android.livesdk.chatroom.viewmodule.QuickCommentWidget r3 = r14.LJLIL
            T r4 = r15.data
            java.lang.String r0 = "response.data"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)
            com.bytedance.android.livesdk.chatroom.model.QuickComment r4 = (com.bytedance.android.livesdk.chatroom.model.QuickComment) r4
            java.lang.String r13 = r14.LJLJI
            java.lang.String r0 = "scene"
            kotlin.jvm.internal.o.LJIIIZ(r13, r0)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.List r0 = r4.getQuickComments()
            java.util.List r0 = X.ORZ.LJLL(r0)
            java.util.Iterator r2 = r0.iterator()
        L82:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L9b
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            com.bytedance.android.livesdk.model.message.QuickChatContent r0 = new com.bytedance.android.livesdk.model.message.QuickChatContent
            r0.<init>()
            r0.type = r6
            r0.text = r1
            r7.add(r0)
            goto L82
        L9b:
            java.util.List r0 = r4.getEmoteList()
            java.util.List r1 = X.ORZ.LJLL(r0)
            boolean r0 = r1.isEmpty()
            r10 = r0 ^ 1
            java.util.Iterator r2 = r1.iterator()
        Lad:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lc6
            java.lang.Object r1 = r2.next()
            com.bytedance.android.live.base.model.emoji.EmoteModel r1 = (com.bytedance.android.live.base.model.emoji.EmoteModel) r1
            com.bytedance.android.livesdk.model.message.QuickChatContent r0 = new com.bytedance.android.livesdk.model.message.QuickChatContent
            r0.<init>()
            r0.type = r5
            r0.emote = r1
            r7.add(r0)
            goto Lad
        Lc6:
            X.CJW r6 = new X.CJW
            long r8 = r4.getDuration()
            long r11 = r4.getPriority()
            r6.<init>(r7, r8, r10, r11, r13)
            r3.LJZI(r6)
            goto L5e
        Ld7:
            r1 = r2
            if (r15 == 0) goto L45
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CJU.accept(java.lang.Object):void");
    }
}
