package X;

import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.usercard.UserProfilePresenter;
import kotlin.jvm.internal.o;

/* renamed from: X.Bhx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C29501Bhx extends TBS implements InterfaceC88472Yns<UserProfileEvent, C76800UCe> {
    public C29501Bhx(Object obj) {
        super(1, obj, UserProfilePresenter.class, "onEvent", "onEvent(Lcom/bytedance/android/livesdk/event/UserProfileEvent;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(UserProfileEvent userProfileEvent) {
        UserProfileEvent p0 = userProfileEvent;
        o.LJIIIZ(p0, "p0");
        ((UserProfilePresenter) this.receiver).onEvent(p0);
        return C76800UCe.LIZ;
    }
}
