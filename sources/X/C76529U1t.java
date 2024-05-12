package X;

import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;

/* renamed from: X.U1t, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76529U1t<T> implements InterfaceC66992k3 {
    public final /* synthetic */ C74842TYw LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    public C76529U1t(C74842TYw c74842TYw, String str) {
        this.LJLIL = c74842TYw;
        this.LJLILLLLZI = str;
    }

    @Override // X.InterfaceC66992k3
    public final void subscribe(InterfaceC65052gv<Bitmap> interfaceC65052gv) {
        AbstractC74727TUl LIZ;
        LinkPlayerInfo linkPlayerInfo;
        User user;
        ImageModel avatarThumb;
        InterfaceC31805Ce1 LJJJJJ = this.LJLIL.LJJJJJ();
        if (LJJJJJ == null || (LIZ = LJJJJJ.LIZ()) == null || (linkPlayerInfo = (LinkPlayerInfo) LIZ.LJIIJJI(this.LJLILLLLZI)) == null || (user = linkPlayerInfo.mUser) == null || (avatarThumb = user.getAvatarThumb()) == null) {
            ((C73578SuE) interfaceC65052gv).onError(new RuntimeException("Invalid bitmap"));
        } else {
            ((IHostFrescoHelper) CN1.LIZ(IHostFrescoHelper.class)).EM(avatarThumb, new C76530U1u((C73578SuE) interfaceC65052gv, avatarThumb));
        }
    }
}
