package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.AqS163S0100000_13;

/* loaded from: classes14.dex */
public final class U19 implements C0GM {
    public final /* synthetic */ U18 LIZ;

    public U19(U18 u18) {
        this.LIZ = u18;
    }

    @Override // X.C0GM
    public final void LIZ(C0GY c0gy) {
        ImageModel imageModel;
        User user;
        U18 u18 = this.LIZ;
        LinkPlayerInfo anchorInfo = u18.getAnchorInfo();
        ImageModel imageModel2 = null;
        if (anchorInfo != null && (user = anchorInfo.mUser) != null) {
            imageModel = user.getAvatarThumb();
        } else {
            imageModel = null;
        }
        User LIZIZ = C05200Ii.LIZIZ();
        if (LIZIZ != null) {
            imageModel2 = LIZIZ.getAvatarThumb();
        }
        AqS163S0100000_13 aqS163S0100000_13 = new AqS163S0100000_13(this.LIZ, 206);
        u18.LIZIZ(imageModel, "image_0", new AqS160S0200000_13(u18, aqS163S0100000_13, 21));
        u18.LIZIZ(imageModel2, "image_1", new AqS160S0200000_13(u18, aqS163S0100000_13, 22));
    }
}
