package X;

import Y.AfS31S0201000_5;
import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.ISharedBgAbility;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.o;

/* renamed from: X.Cag, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31598Cag extends AbstractC74908Taa implements InterfaceC75134TeE {
    public final InterfaceC31600Cai LJLILLLLZI;
    public final DataChannel LJLJI;
    public ISharedBgAbility LJLJJI;
    public final C73318Sq2 LJLJJL;

    @Override // X.InterfaceC75134TeE
    public final void LIZIZ() {
        boolean z;
        User user;
        String str;
        this.LJLILLLLZI.dismiss();
        DataChannel dataChannel = this.LJLJI;
        Context context = this.LJLILLLLZI.getContext();
        C29077Bb7 c29077Bb7 = new C29077Bb7();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room == null) {
            return;
        }
        String str2 = null;
        if (dataChannel != null) {
            str2 = (String) dataChannel.kv0(C28388BCe.class);
        }
        C29929Bor c29929Bor = new C29929Bor(room);
        if (room.getOwner() != null) {
            if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isInMusicallyRegion()) {
                str = "h5_m";
            } else {
                str = "h5_t";
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("www.tiktok.com/@");
            LIZ.append(C05170If.LJ(room.getOwner()));
            LIZ.append("/live");
            LIZ.append(str);
            LIZ.append("&_r=1");
            c29929Bor.LJIIJ = X1D.LIZIZ(LIZ);
        }
        C29374Bfu c29374Bfu = (C29374Bfu) B83.LIZ().LIZIZ();
        c29929Bor.LIZLLL = c29374Bfu.getCurrentUserId();
        room.getId();
        room.getOwnerUserId();
        c29929Bor.LJIIZILJ = BJM.LJIILIIL();
        if (dataChannel != null && (user = (User) dataChannel.kv0(RoomUserChannel.class)) != null && user.getUserAttr() != null && user.getUserAttr().isAdmin) {
            z = true;
        } else {
            z = false;
        }
        BNI un0 = ((IShareService) CN1.LIZ(IShareService.class)).un0();
        ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(context);
        c29929Bor.LJIIL = room.getAnchorShareText();
        c29929Bor.LJIILJJIL = C74947TbD.LJIIZILJ(Long.valueOf(c29374Bfu.getCurrentUserId()));
        c29929Bor.LJIILL = z;
        c29929Bor.LJIILLIIL = EnumC30204BtI.SHARE.isRedDotShowing(dataChannel);
        c29929Bor.LJIJ = str2;
        ((C29338BfK) un0).LIZ(LIZIZ, new C29930Bos(c29929Bor), c29077Bb7);
        C31951CgN.LIZIZ(context).LIZJ(room.getId(), room.getIdStr());
    }

    @Override // X.V8Q
    public final void LIZJ() {
        this.LJLJJL.LIZLLL();
    }

    public C31598Cag(InterfaceC31600Cai dialogAnchor) {
        o.LJIIIZ(dialogAnchor, "dialogAnchor");
        this.LJLILLLLZI = dialogAnchor;
        this.LJLJI = dialogAnchor.LJIIL();
        this.LJLJJL = new C73318Sq2();
        C221108m2.LIZIZ(C31599Cah.LJLIL);
    }

    public final void LJIIZILJ(int i, MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings) {
        InterfaceC55235Lm3 interfaceC55235Lm3;
        MultiGuestSharedBgAnchorViewModel Mb0;
        C75236Tfs state;
        if (multiLiveAnchorPanelSettings == null) {
            return;
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room != null || (room = (Room) dataChannelGlobal.mv0(C29108Bbc.class)) != null) {
            long id = room.getId();
            long liveId = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).liveId();
            DataChannel dataChannel = this.LJLJI;
            String str = null;
            if (dataChannel != null && (interfaceC55235Lm3 = (InterfaceC55235Lm3) dataChannel.kv0(C75415Til.class)) != null) {
                ISharedBgAbility iSharedBgAbility = (ISharedBgAbility) UC0.LJIIL(interfaceC55235Lm3, ISharedBgAbility.class, null);
                if (iSharedBgAbility != null && (Mb0 = iSharedBgAbility.Mb0()) != null && (state = Mb0.getState()) != null) {
                    str = state.LJLJJI;
                }
                str = C75283Tgd.LIZ(str);
            }
            C78999UzT.LJFF(C74716TUa.LIZIZ((MultiLiveApi) TTL.LIZ(MultiLiveApi.class, "get().getService(MultiLiveApi::class.java)"), id, C78886Uxe.LJJJLIIL(C8E.LJ()), liveId, multiLiveAnchorPanelSettings.layoutType, multiLiveAnchorPanelSettings.fixMicNumAction, multiLiveAnchorPanelSettings.allowViewerReq, multiLiveAnchorPanelSettings.onlyAllowFollowerReq, null, str, 0, i, 0L, 2560).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS31S0201000_5(i, multiLiveAnchorPanelSettings, this, 2), new AfS31S0201000_5(i, multiLiveAnchorPanelSettings, this, 3)), this.LJLJJL);
        }
    }
}
