package X;

import com.ss.android.ugc.aweme.im.sdk.chat.data.model.IMNoticeMsgStruct;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.CommonChatNoticeViewModel;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.CommonChatNoticeViewModel$addRemoteTasks$1", f = "CommonChatNoticeViewModel.kt", l = {110, 113, 119, 123, 124, 126, 128}, m = "invokeSuspend")
/* renamed from: X.41H, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C41H extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public CommonChatNoticeViewModel LJLIL;
    public Object LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ List<IMNoticeMsgStruct> LJLJJI;
    public final /* synthetic */ CommonChatNoticeViewModel LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41H(List<IMNoticeMsgStruct> list, CommonChatNoticeViewModel commonChatNoticeViewModel, InterfaceC67352kd<? super C41H> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = list;
        this.LJLJJL = commonChatNoticeViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C41H(this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x003b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0024 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0181 A[SYNTHETIC] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41H.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
