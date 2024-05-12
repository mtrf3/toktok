package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.AwemeStatusBean;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.controller.utils.AwemeCoverManager$queryAweme$2$2", f = "AwemeCoverManager.kt", l = {505}, m = "invokeSuspend")
/* renamed from: X.2ol, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69912ol extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C69962oq>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ AwemeStatusBean LJLJI;
    public final /* synthetic */ View LJLJJI;
    public final /* synthetic */ C109544Rq LJLJJL;
    public final /* synthetic */ ShareAwemeContent LJLJJLL;
    public final /* synthetic */ boolean LJLJL;
    public final /* synthetic */ Aweme LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69912ol(AwemeStatusBean awemeStatusBean, View view, C109544Rq c109544Rq, ShareAwemeContent shareAwemeContent, boolean z, Aweme aweme, InterfaceC67352kd<? super C69912ol> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = awemeStatusBean;
        this.LJLJJI = view;
        this.LJLJJL = c109544Rq;
        this.LJLJJLL = shareAwemeContent;
        this.LJLJL = z;
        this.LJLJLJ = aweme;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69912ol(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r9, r15.LJLJJL.getLocalExt().get("feed_video_status_text")) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c1, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r9, ((androidx.appcompat.widget.AppCompatTextView) r5.findViewById(com.zhiliaoapp.musically.R.id.btn)).getText()) == false) goto L16;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r15.LJLILLLLZI
            r14 = 0
            java.lang.String r2 = "0"
            r1 = 1
            if (r0 == 0) goto L27
            if (r0 != r1) goto Lc4
            java.lang.Object r8 = r15.LJLIL
            X.C141335gf.LIZJ(r16)
        L11:
            boolean r0 = kotlin.jvm.internal.o.LJ(r8, r2)
            if (r0 != 0) goto L1f
            java.lang.String r0 = "1027"
            boolean r0 = kotlin.jvm.internal.o.LJ(r8, r0)
            if (r0 == 0) goto L26
        L1f:
            X.2oq r14 = new X.2oq
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r15.LJLJLJ
            r14.<init>(r0)
        L26:
            return r14
        L27:
            X.C141335gf.LIZJ(r16)
            com.ss.android.ugc.aweme.im.sdk.chat.data.model.AwemeStatusBean r0 = r15.LJLJI
            java.lang.Integer r0 = r0.getStatus()
            java.lang.String r8 = java.lang.String.valueOf(r0)
            com.ss.android.ugc.aweme.im.sdk.chat.data.model.AwemeStatusBean r0 = r15.LJLJI
            java.lang.String r9 = r0.getStatusText()
            android.view.View r5 = r15.LJLJJI
            boolean r0 = kotlin.jvm.internal.o.LJ(r8, r2)
            r6 = 8
            r4 = 2131364904(0x7f0a0c28, float:1.8349658E38)
            if (r0 == 0) goto L99
            android.view.View r0 = r5.findViewById(r4)
            int r0 = r0.getVisibility()
            if (r0 == r6) goto L99
        L52:
            android.view.View r10 = r15.LJLJJI
            X.4Rq r11 = r15.LJLJJL
            com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent r12 = r15.LJLJJLL
            boolean r13 = r15.LJLJL
            X.C84973Vd.LIZIZ(r8, r9, r10, r11, r12, r13, r14)
            X.4Rq r0 = r15.LJLJJL
            java.util.Map r4 = r0.getLocalExt()
            java.lang.String r0 = "feed_video_status_flag"
            java.lang.Object r0 = r4.get(r0)
            boolean r0 = kotlin.jvm.internal.o.LJ(r8, r0)
            if (r0 == 0) goto L81
            X.4Rq r0 = r15.LJLJJL
            java.util.Map r4 = r0.getLocalExt()
            java.lang.String r0 = "feed_video_status_text"
            java.lang.Object r0 = r4.get(r0)
            boolean r0 = kotlin.jvm.internal.o.LJ(r9, r0)
            if (r0 != 0) goto L11
        L81:
            X.XIC r7 = X.C78613UtF.LIZ
            X.2ok r6 = new X.2ok
            X.4Rq r5 = r15.LJLJJL
            com.ss.android.ugc.aweme.im.sdk.chat.data.model.AwemeStatusBean r4 = r15.LJLJI
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r15.LJLJLJ
            r6.<init>(r5, r4, r0, r14)
            r15.LJLIL = r8
            r15.LJLILLLLZI = r1
            java.lang.Object r0 = X.XKX.LJI(r7, r6, r15)
            if (r0 != r3) goto L11
            return r3
        L99:
            boolean r0 = kotlin.jvm.internal.o.LJ(r8, r2)
            if (r0 != 0) goto Laa
            android.view.View r0 = r5.findViewById(r4)
            int r0 = r0.getVisibility()
            if (r0 != r6) goto Laa
            goto L52
        Laa:
            boolean r0 = kotlin.jvm.internal.o.LJ(r8, r2)
            if (r0 != 0) goto L11
            r0 = 2131364903(0x7f0a0c27, float:1.8349656E38)
            android.view.View r0 = r5.findViewById(r0)
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            java.lang.CharSequence r0 = r0.getText()
            boolean r0 = kotlin.jvm.internal.o.LJ(r9, r0)
            if (r0 != 0) goto L11
            goto L52
        Lc4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69912ol.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C69962oq> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
