package X;

import Y.AfS57S0100000_5;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.usermanage.BanCapabilityParams;
import com.bytedance.android.live.usermanage.ILiveBanCapabilityApi;
import com.bytedance.android.livesdk.dataChannel.BanTalkEvent;
import com.bytedance.android.livesdk.dataChannel.LoadUserAttrSuccess;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.BIx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28563BIx implements InterfaceC73463SsN<InterfaceC05190Ih> {
    public final /* synthetic */ C28565BIz LJLIL;

    public C28563BIx(C28565BIz c28565BIz) {
        this.LJLIL = c28565BIz;
    }

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable e) {
        C29401Dk c29401Dk;
        o.LJIIIZ(e, "e");
        if ((e instanceof C29401Dk) && (c29401Dk = (C29401Dk) e) != null) {
            this.LJLIL.LJ(c29401Dk);
        }
    }

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
        this.LJLIL.LIZJ.LIZ(d);
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(InterfaceC05190Ih interfaceC05190Ih) {
        boolean z;
        boolean z2;
        boolean z3;
        InterfaceC29405BgP LIZIZ;
        InterfaceC05190Ih interfaceC05190Ih2;
        InterfaceC05190Ih iUser = interfaceC05190Ih;
        o.LJIIIZ(iUser, "iUser");
        if (!this.LJLIL.LIZ.isViewValid()) {
            return;
        }
        C28565BIz c28565BIz = this.LJLIL;
        User user = (User) iUser;
        c28565BIz.getClass();
        if (user.getUserAttr() != null && (LIZIZ = B83.LIZ().LIZIZ()) != null && (interfaceC05190Ih2 = ((C29374Bfu) LIZIZ).LIZIZ) != null) {
            interfaceC05190Ih2.setUserAttr(user.getUserAttr());
        }
        c28565BIz.LIZIZ.rv0(RoomUserChannel.class, user);
        BJ4.LIZ.setValue(iUser);
        InterfaceC30442Bx8.LJJIIZI.LIZ(Boolean.FALSE);
        UserAttr userAttr = user.getUserAttr();
        if (userAttr != null) {
            DataChannel dataChannel = this.LJLIL.LIZIZ;
            boolean z4 = userAttr.isMuted;
            if (userAttr.muteDuration == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            dataChannel.qv0(BanTalkEvent.class, new C28854BUc(z4, z2));
            this.LJLIL.LIZIZ.qv0(LoadUserAttrSuccess.class, userAttr);
            DataChannel dataChannel2 = this.LJLIL.LIZIZ;
            boolean z5 = userAttr.isMuted;
            if (userAttr.muteDuration == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            dataChannel2.qv0(BanTalkEvent.class, new C28854BUc(z5, z3));
        }
        IBrowserService iBrowserService = (IBrowserService) CN1.LIZ(IBrowserService.class);
        if (userAttr != null && userAttr.isMuted) {
            z = true;
        } else {
            z = false;
        }
        iBrowserService.Qd0(z);
        if (userAttr == null || !userAttr.isAdmin) {
            return;
        }
        C28565BIz c28565BIz2 = this.LJLIL;
        Room room = (Room) c28565BIz2.LIZIZ.kv0(RoomChannel.class);
        if (room == null) {
            return;
        }
        ((ILiveBanCapabilityApi) Q7L.LIZIZ(ILiveBanCapabilityApi.class)).getLiveBanCapability(new BanCapabilityParams(C47261Igj.LJJIJIIJI(14, 15), room.getId(), room.getOwnerUserId())).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS57S0100000_5(c28565BIz2, 176), new AfS57S0100000_5(c28565BIz2, 177));
    }
}
