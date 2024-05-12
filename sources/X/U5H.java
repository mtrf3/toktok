package X;

import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U5H {
    public static final C32822CuQ LIZ(User user) {
        long id = user.getId();
        String secUid = user.getSecUid();
        o.LJIIIIZZ(secUid, "this.secUid");
        String nickName = user.getNickName();
        o.LJIIIIZZ(nickName, "this.nickName");
        String displayId = user.getDisplayId();
        o.LJIIIIZZ(displayId, "this.displayId");
        return new C32822CuQ(id, secUid, nickName, displayId, user.getAvatarThumb());
    }
}
