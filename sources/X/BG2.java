package X;

import com.bytedance.android.live.base.model.user.User;

/* loaded from: classes6.dex */
public final class BG2 implements InterfaceC73463SsN<User> {
    public final /* synthetic */ BG3 LJLIL;

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
    }

    public BG2(BG3 bg3) {
        this.LJLIL = bg3;
    }

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable th) {
        BG3 bg3 = this.LJLIL;
        if (bg3 != null) {
            bg3.getClass();
        }
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(User user) {
        User user2 = user;
        BG3 bg3 = this.LJLIL;
        if (bg3 != null) {
            BG1 bg1 = (BG1) bg3;
            if (user2 != null && user2.getFollowInfo() != null) {
                bg1.LIZ.wl((int) user2.getFollowInfo().getPushStatus());
            }
        }
    }
}
