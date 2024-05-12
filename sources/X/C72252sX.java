package X;

import android.app.Activity;
import android.content.Context;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.share.improve.action.GifShareAction$execute$videoStickerPanelShowed$1$1", f = "GifShareAction.kt", l = {106, 112}, m = "invokeSuspend")
/* renamed from: X.2sX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72252sX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C72242sW LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C62027OVz LJLJI;
    public final /* synthetic */ Activity LJLJJI;
    public final /* synthetic */ DialogC25756A8y LJLJJL;
    public final /* synthetic */ long LJLJJLL;
    public final /* synthetic */ Context LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72252sX(C62027OVz c62027OVz, Activity activity, DialogC25756A8y dialogC25756A8y, long j, Context context, InterfaceC67352kd<? super C72252sX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c62027OVz;
        this.LJLJJI = activity;
        this.LJLJJL = dialogC25756A8y;
        this.LJLJJLL = j;
        this.LJLJL = context;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C72252sX(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008b A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r9 = r19
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            r7 = r18
            int r0 = r7.LJLILLLLZI
            r5 = 0
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L17
            if (r0 != r4) goto L8c
            X.C141335gf.LIZJ(r9)
        L14:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L17:
            X.2sW r15 = r7.LJLIL
            goto L53
        L1a:
            X.C141335gf.LIZJ(r9)
            X.2sW r15 = new X.2sW
            r15.<init>()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r15.element = r0
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Exception -> L59
            r0 = 91
            r1.append(r0)     // Catch: java.lang.Exception -> L59
            X.OVz r0 = r7.LJLJI     // Catch: java.lang.Exception -> L59
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LJLIL     // Catch: java.lang.Exception -> L59
            java.lang.String r0 = r0.getAid()     // Catch: java.lang.Exception -> L59
            r1.append(r0)     // Catch: java.lang.Exception -> L59
            r0 = 93
            r1.append(r0)     // Catch: java.lang.Exception -> L59
            java.lang.String r1 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Exception -> L59
            java.lang.String r0 = ""
            r7.LJLIL = r15     // Catch: java.lang.Exception -> L59
            r7.LJLILLLLZI = r2     // Catch: java.lang.Exception -> L59
            java.lang.Object r9 = X.C30U.LIZIZ(r1, r0, r7)     // Catch: java.lang.Exception -> L59
            if (r9 != r6) goto L56
            goto L94
        L53:
            X.C141335gf.LIZJ(r9)     // Catch: java.lang.Exception -> L5b
        L56:
            com.ss.android.ugc.aweme.im.sdk.chat.data.model.AwemeDetailList r9 = (com.ss.android.ugc.aweme.im.sdk.chat.data.model.AwemeDetailList) r9     // Catch: java.lang.Exception -> L5b
            goto L62
        L59:
            r1 = move-exception
            goto L5c
        L5b:
            r1 = move-exception
        L5c:
            java.lang.String r0 = "GifShareAction"
            X.C34B.LJ(r0, r1)
            r9 = r5
        L62:
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r15.element
            long r2 = r2 - r0
            r15.element = r2
            X.UtN r1 = X.C36636EZk.LIZ
            X.3Vq r8 = new X.3Vq
            android.app.Activity r10 = r7.LJLJJI
            X.A8y r11 = r7.LJLJJL
            X.OVz r12 = r7.LJLJI
            long r13 = r7.LJLJJLL
            android.content.Context r0 = r7.LJLJL
            r17 = r5
            r16 = r0
            r8.<init>(r9, r10, r11, r12, r13, r15, r16, r17)
            r7.LJLIL = r5
            r7.LJLILLLLZI = r4
            java.lang.Object r0 = X.XKX.LJI(r1, r8, r7)
            if (r0 != r6) goto L14
            return r6
        L8c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L94:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72252sX.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
