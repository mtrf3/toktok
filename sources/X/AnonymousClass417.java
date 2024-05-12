package X;

import com.ss.android.ugc.aweme.im.sdk.chat.data.model.IMNoticeMsgStruct;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.single.SingleChatNoticeViewModel;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.single.SingleChatNoticeViewModel$addRemoteTasks$1", f = "SingleChatNoticeViewModel.kt", l = {79, 82}, m = "invokeSuspend")
/* renamed from: X.417, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass417 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public SingleChatNoticeViewModel LJLIL;
    public Object LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ List<IMNoticeMsgStruct> LJLJJI;
    public final /* synthetic */ SingleChatNoticeViewModel LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass417(List<IMNoticeMsgStruct> list, SingleChatNoticeViewModel singleChatNoticeViewModel, InterfaceC67352kd<? super AnonymousClass417> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = list;
        this.LJLJJL = singleChatNoticeViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new AnonymousClass417(this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0015, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x002b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0015 A[SYNTHETIC] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r9.LJLJI
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L7f
            if (r0 == r4) goto Lc
            if (r0 != r5) goto L8e
        Lc:
            java.lang.Object r7 = r9.LJLILLLLZI
            java.util.Iterator r7 = (java.util.Iterator) r7
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.single.SingleChatNoticeViewModel r3 = r9.LJLIL
            X.C141335gf.LIZJ(r10)
        L15:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L8b
            java.lang.Object r8 = r7.next()
            com.ss.android.ugc.aweme.im.sdk.chat.data.model.IMNoticeMsgStruct r8 = (com.ss.android.ugc.aweme.im.sdk.chat.data.model.IMNoticeMsgStruct) r8
            java.lang.String r1 = r8.getNoticeCode()
            if (r1 == 0) goto L15
            int r0 = r1.hashCode()
            switch(r0) {
                case -1890046276: goto L60;
                case -1449390893: goto L57;
                case 739114725: goto L38;
                case 1076472157: goto L2f;
                default: goto L2e;
            }
        L2e:
            goto L15
        L2f:
            java.lang.String r0 = "ice_breaking_say_hi"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L69
            goto L15
        L38:
            java.lang.String r0 = "chat_ec"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L41
            goto L15
        L41:
            X.45b r2 = r3.LJLIL
            X.41D r1 = new X.41D
            X.41X r0 = X.C41X.EC_SELLER
            r1.<init>(r0, r8)
            r9.LJLIL = r3
            r9.LJLILLLLZI = r7
            r9.LJLJI = r4
            java.lang.Object r0 = r2.LIZ(r1, r9)
            if (r0 != r6) goto L15
            return r6
        L57:
            java.lang.String r0 = "ice_breaking_say_hi_follow_back"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L69
            goto L15
        L60:
            java.lang.String r0 = "recommended_chat"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L69
            goto L15
        L69:
            X.45b r2 = r3.LJLIL
            X.41D r1 = new X.41D
            X.41X r0 = X.C41X.SAY_HI
            r1.<init>(r0, r8)
            r9.LJLIL = r3
            r9.LJLILLLLZI = r7
            r9.LJLJI = r5
            java.lang.Object r0 = r2.LIZ(r1, r9)
            if (r0 != r6) goto L15
            return r6
        L7f:
            X.C141335gf.LIZJ(r10)
            java.util.List<com.ss.android.ugc.aweme.im.sdk.chat.data.model.IMNoticeMsgStruct> r0 = r9.LJLJJI
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.single.SingleChatNoticeViewModel r3 = r9.LJLJJL
            java.util.Iterator r7 = r0.iterator()
            goto L15
        L8b:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L8e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass417.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
