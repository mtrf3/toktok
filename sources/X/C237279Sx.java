package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.UserResponse;
import com.ss.android.ugc.aweme.profile.widgets.common.UserProfileInfoVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.profile.widgets.common.UserProfileInfoVM", f = "UserProfileInfoVM.kt", l = {153}, m = "onSuccess")
/* renamed from: X.9Sx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C237279Sx extends C3CS {
    public UserProfileInfoVM LJLIL;
    public UserResponse LJLILLLLZI;
    public EnumC235129Kq LJLJI;
    public User LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ UserProfileInfoVM LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C237279Sx(UserProfileInfoVM userProfileInfoVM, InterfaceC67352kd<? super C237279Sx> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = userProfileInfoVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.lv0(null, null, this);
    }
}
