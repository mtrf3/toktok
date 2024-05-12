package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.o;

/* renamed from: X.CuQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32822CuQ {
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final ImageModel LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32822CuQ)) {
            return false;
        }
        C32822CuQ c32822CuQ = (C32822CuQ) obj;
        return this.LIZ == c32822CuQ.LIZ && o.LJ(this.LIZIZ, c32822CuQ.LIZIZ) && o.LJ(this.LIZJ, c32822CuQ.LIZJ) && o.LJ(this.LIZLLL, c32822CuQ.LIZLLL) && o.LJ(this.LJ, c32822CuQ.LJ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GiftUser(userId=");
        LIZ.append(this.LIZ);
        LIZ.append(", secUid=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", nickname=");
        LIZ.append(this.LIZJ);
        LIZ.append(", displayId=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", avatarThumb=");
        LIZ.append(this.LJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final User LIZ() {
        User user = new User();
        user.setId(this.LIZ);
        user.setSecUid(this.LIZIZ);
        user.setNickName(this.LIZJ);
        user.setDisplayId(this.LIZLLL);
        user.setAvatarThumb(this.LJ);
        return user;
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZLLL, C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31), 31), 31);
        ImageModel imageModel = this.LJ;
        if (imageModel == null) {
            hashCode = 0;
        } else {
            hashCode = imageModel.hashCode();
        }
        return LJ + hashCode;
    }

    public C32822CuQ(long j, String secUid, String nickname, String str, ImageModel imageModel) {
        o.LJIIIZ(secUid, "secUid");
        o.LJIIIZ(nickname, "nickname");
        this.LIZ = j;
        this.LIZIZ = secUid;
        this.LIZJ = nickname;
        this.LIZLLL = str;
        this.LJ = imageModel;
    }
}
