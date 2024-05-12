package X;

import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;

/* renamed from: X.3F5, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3F5 extends TBS implements InterfaceC88472Yns<InterfaceC67352kd<? super IMUser>, Object> {
    public C3F5(ChatRoomViewModel chatRoomViewModel) {
        super(1, chatRoomViewModel, ChatRoomViewModel.class, "getOtherUser", "getOtherUser(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super IMUser> interfaceC67352kd) {
        ChatRoomViewModel chatRoomViewModel = (ChatRoomViewModel) this.receiver;
        return XKX.LJI(chatRoomViewModel.LJLLJ, new C3F4(chatRoomViewModel, null), interfaceC67352kd);
    }
}
