package X;

import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;

/* renamed from: X.U1s, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76528U1s<T> implements InterfaceC66992k3 {
    public final /* synthetic */ C74843TYx LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public C76528U1s(C74843TYx c74843TYx, String str, int i) {
        this.LJLIL = c74843TYx;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC66992k3
    public final void subscribe(InterfaceC65052gv<Bitmap> interfaceC65052gv) {
        ImageModel avatarThumb;
        AbstractC74727TUl LIZ;
        LinkPlayerInfo linkPlayerInfo;
        User user;
        InterfaceC31805Ce1 interfaceC31805Ce1 = this.LJLIL.LJLILLLLZI;
        if ((interfaceC31805Ce1 != null && (LIZ = interfaceC31805Ce1.LIZ()) != null && (linkPlayerInfo = (LinkPlayerInfo) LIZ.LJIIJJI(this.LJLILLLLZI)) != null && (user = linkPlayerInfo.mUser) != null && (avatarThumb = user.getAvatarThumb()) != null) || (this.LJLJI == 0 && (avatarThumb = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getAvatarThumb()) != null)) {
            ((IHostFrescoHelper) CN1.LIZ(IHostFrescoHelper.class)).nn0(avatarThumb, new C78738UvG(), new C76531U1v((C73578SuE) interfaceC65052gv));
        } else {
            ((C73578SuE) interfaceC65052gv).onError(new RuntimeException("Invalid bitmap"));
        }
    }
}
