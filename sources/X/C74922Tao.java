package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.MultiGuestUserInfoFragment;
import com.bytedance.android.livesdk.LiveDialogFragment;

/* renamed from: X.Tao, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74922Tao extends AbstractC008101l {
    public final /* synthetic */ MultiGuestUserInfoFragment LIZJ;

    @Override // X.AbstractC008101l
    public final void LIZ() {
        C0NB.LIZIZ("MultiGuestUserInfoFragment", "handleOnBackPressed");
        LiveDialogFragment liveDialogFragment = this.LIZJ.LJLJJLL;
        if (liveDialogFragment != null) {
            liveDialogFragment.dismissAllowingStateLoss();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74922Tao(MultiGuestUserInfoFragment multiGuestUserInfoFragment) {
        super(true);
        this.LIZJ = multiGuestUserInfoFragment;
    }
}
