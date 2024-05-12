package X;

import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.Kxk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C53412Kxk extends TBS implements InterfaceC88472Yns<Integer, C76800UCe> {
    public C53412Kxk(User user) {
        super(1, user, User.class, "setFollowerCount", "setFollowerCount(I)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Integer num) {
        ((User) this.receiver).setFollowerCount(num.intValue());
        return C76800UCe.LIZ;
    }
}
