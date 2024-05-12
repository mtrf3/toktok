package X;

import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.CommonChatNoticeViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.CommonChatNoticeViewModel$triggerRemoteTasks$1", f = "CommonChatNoticeViewModel.kt", l = {UserLevelGeckoUpdateSetting.DEFAULT}, m = "invokeSuspend")
/* renamed from: X.41J, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C41J extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public final /* synthetic */ InterfaceC79150V4o[] LJLJJL;
    public final /* synthetic */ CommonChatNoticeViewModel LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41J(InterfaceC79150V4o[] interfaceC79150V4oArr, CommonChatNoticeViewModel commonChatNoticeViewModel, InterfaceC67352kd<? super C41J> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJL = interfaceC79150V4oArr;
        this.LJLJJLL = commonChatNoticeViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C41J(this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0026 -> B:5:0x0014). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJI
            r4 = 1
            if (r0 == 0) goto L29
            if (r0 != r4) goto L3b
            int r3 = r6.LJLJI
            int r2 = r6.LJLILLLLZI
            java.lang.Object r1 = r6.LJLIL
            X.V4o[] r1 = (X.InterfaceC79150V4o[]) r1
            X.C141335gf.LIZJ(r7)
        L14:
            int r2 = r2 + 1
        L16:
            if (r2 >= r3) goto L31
            r0 = r1[r2]
            r6.LJLIL = r1
            r6.LJLILLLLZI = r2
            r6.LJLJI = r3
            r6.LJLJJI = r4
            java.lang.Object r0 = r0.LJJJJ(r6)
            if (r0 != r5) goto L14
            return r5
        L29:
            X.C141335gf.LIZJ(r7)
            X.V4o[] r1 = r6.LJLJJL
            int r3 = r1.length
            r2 = 0
            goto L16
        L31:
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.CommonChatNoticeViewModel r0 = r6.LJLJJLL
            X.45b r0 = r0.LJLIL
            r0.LJIILIIL()
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L3b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41J.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
