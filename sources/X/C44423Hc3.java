package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.Hc3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44423Hc3 implements InterfaceC45930I0w {
    public final User LIZ;

    public final void LJIILJJIL() {
        this.LIZ.setAdAuthorization(true);
    }

    @Override // X.InterfaceC45930I0w
    public final boolean LIZ() {
        return this.LIZ.isBlock;
    }

    @Override // X.InterfaceC45930I0w
    public final int LIZIZ() {
        return this.LIZ.getFollowStatus();
    }

    @Override // X.InterfaceC45930I0w
    public final boolean LIZJ() {
        return this.LIZ.isBlocked();
    }

    @Override // X.InterfaceC45930I0w
    public final int LIZLLL() {
        return this.LIZ.getFollowerStatus();
    }

    @Override // X.InterfaceC45930I0w
    public final String LJ() {
        return AV1.LJI(this.LIZ);
    }

    @Override // X.InterfaceC45930I0w
    public final int LJFF() {
        return this.LIZ.getFollowerCount();
    }

    public final int LJI() {
        return this.LIZ.getAccountType();
    }

    public final boolean LJII() {
        return this.LIZ.getAdAuthorization();
    }

    public final UrlModel LJIIIIZZ() {
        return this.LIZ.getAvatarVideoUri();
    }

    public final boolean LJIIIZ() {
        return this.LIZ.isEnableSubscription();
    }

    public final int LJIIJ() {
        return this.LIZ.getMusicComplianceAccount();
    }

    public final boolean LJIIJJI() {
        return this.LIZ.isAccuratePrivateAccount();
    }

    public final boolean LJIIL() {
        if (this.LIZ.roomId > 0) {
            return true;
        }
        return false;
    }

    public final boolean LJIILIIL() {
        return this.LIZ.isSecret();
    }

    @Override // X.InterfaceC45930I0w
    public final UrlModel getAvatarMedium() {
        return this.LIZ.getAvatarMedium();
    }

    @Override // X.InterfaceC45930I0w
    public final UrlModel getAvatarThumb() {
        return this.LIZ.getAvatarThumb();
    }

    @Override // X.InterfaceC45930I0w
    public final String getNickname() {
        return this.LIZ.getNickname();
    }

    @Override // X.InterfaceC45930I0w
    public final String getSecUid() {
        return this.LIZ.getSecUid();
    }

    @Override // X.InterfaceC45930I0w
    public final String getShortId() {
        return this.LIZ.getShortId();
    }

    @Override // X.InterfaceC45930I0w
    public final String getUid() {
        return this.LIZ.getUid();
    }

    @Override // X.InterfaceC45930I0w
    public final String getUniqueId() {
        return this.LIZ.getUniqueId();
    }

    public C44423Hc3(User user) {
        this.LIZ = user;
    }
}
