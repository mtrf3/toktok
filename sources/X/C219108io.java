package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.tiktok.addyours.ui.fragment.AddYoursInviteFriendsFragment;

@InterfaceC65848Psq(c = "com.ss.android.ugc.tiktok.addyours.ui.fragment.AddYoursInviteFriendsFragment", f = "AddYoursInviteFriendsFragment.kt", l = {240, 241}, m = "onInviteBtnClicked")
/* renamed from: X.8io, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219108io extends C3CS {
    public AddYoursInviteFriendsFragment LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ AddYoursInviteFriendsFragment LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C219108io(AddYoursInviteFriendsFragment addYoursInviteFriendsFragment, InterfaceC67352kd<? super C219108io> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = addYoursInviteFriendsFragment;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.wl(null, this);
    }
}
