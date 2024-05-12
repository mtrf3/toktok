package X;

import com.bytedance.android.live.liveinteract.voicechat.main.userinfo.common.VoiceChatUserInfoFragment;
import com.bytedance.android.livesdk.LiveDialogFragment;

/* renamed from: X.Tap, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74923Tap extends AbstractC008101l {
    public final /* synthetic */ VoiceChatUserInfoFragment LIZJ;

    @Override // X.AbstractC008101l
    public final void LIZ() {
        C0NB.LIZIZ("VoiceChatUserInfoFragment", "handleOnBackPressed");
        LiveDialogFragment liveDialogFragment = this.LIZJ.LJLJI;
        if (liveDialogFragment != null) {
            liveDialogFragment.dismissAllowingStateLoss();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74923Tap(VoiceChatUserInfoFragment voiceChatUserInfoFragment) {
        super(true);
        this.LIZJ = voiceChatUserInfoFragment;
    }
}
