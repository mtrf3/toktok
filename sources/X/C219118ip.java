package X;

import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import com.ss.android.ugc.tiktok.addyours.ui.fragment.AddYoursInviteFriendsFragment;
import java.util.List;

/* renamed from: X.8ip, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C219118ip extends TBS implements InterfaceC88471Ynr<List<? extends UserInvitee>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C219118ip(AddYoursInviteFriendsFragment addYoursInviteFriendsFragment) {
        super(2, addYoursInviteFriendsFragment, AddYoursInviteFriendsFragment.class, "onInviteBtnClicked", "onInviteBtnClicked(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final Object invoke(List<? extends UserInvitee> list, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((AddYoursInviteFriendsFragment) this.receiver).wl(list, interfaceC67352kd);
    }
}
