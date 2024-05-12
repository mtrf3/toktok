package X;

import Y.ARunnableS9S0101000_5;
import android.content.Context;
import android.util.ArrayMap;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2;
import com.bytedance.android.live.liveinteract.platform.core.message.LinkMessageCenter;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCreateChannelParams;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplyPermission;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TYW extends AbstractC31497CXt<TYZ> {
    public LinkMessageCenter LJLIL;
    public int LJLILLLLZI;
    public final TYY LJLJI = new TYY(this);
    public final TYT LJLJJI = new TYT(this);

    @InterfaceC75558Tl4(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder multiGuestDataHolder;

    public final MultiLiveAnchorPanelSettings LJJJJIZL() {
        MultiGuestDataHolder multiGuestDataHolder = this.multiGuestDataHolder;
        if (multiGuestDataHolder != null) {
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = multiGuestDataHolder.LJIIJ;
            if (multiLiveAnchorPanelSettings == null) {
                MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2 = C74838TYs.LJ().LJJI;
                if (multiLiveAnchorPanelSettings2 == null) {
                    return new MultiLiveAnchorPanelSettings(0, 0, 0, 0, null, 0, 0L, 127, null);
                }
                return multiLiveAnchorPanelSettings2;
            }
            return multiLiveAnchorPanelSettings;
        }
        o.LJIJI("multiGuestDataHolder");
        throw null;
    }

    @Override // X.AbstractC31497CXt, X.BY9
    public final void detachView() {
        C32014ChO.LJFF("VoiceChatControlPresenter", "detachView");
        C75017TcL.LJIIL(null);
        C8E.LJ().LJJIIJZLJL();
        LinkMessageCenter linkMessageCenter = this.LJLIL;
        if (linkMessageCenter != null) {
            linkMessageCenter.LIZJ();
        }
        this.LJLIL = null;
        C8E.LJ().X3(this.LJLJJI);
        super.detachView();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.TiW, O] */
    @Override // X.AbstractC31497CXt
    /* renamed from: LJJJJ, reason: merged with bridge method [inline-methods] */
    public final void attachView(TYZ tyz) {
        DataChannel dataChannel;
        Room room;
        boolean z;
        ArrayMap<Integer, Long> arrayMap;
        Long l;
        Room room2;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        MultiLiveUserApplyPermission multiLiveUserApplyPermission;
        TYZ tyz2;
        super.attachView((TYW) tyz);
        C75559Tl5 c75559Tl5 = C75559Tl5.LIZIZ;
        c75559Tl5.LIZLLL(this);
        C0NB.LIZIZ("VoiceChatControlPresenter", "loadVoiceChatContext");
        ?? c75400TiW = new C75400TiW();
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            ((C32537Cpp) dataChannel2.gv0(C74970Tba.class)).LIZ = c75400TiW;
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            ((C32537Cpp) dataChannel3.gv0(C74971Tbb.class)).LIZ = c75400TiW;
        }
        C0NB.LIZIZ("VoiceChatControlPresenter", "loadVoiceChatService");
        int i = 1;
        if (this.mView != 0 && (dataChannel = this.dataChannel) != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            if (room.getOwnerUserId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
                z = true;
            } else {
                z = false;
            }
            String str = null;
            if (z) {
                C0NB.LIZIZ("VoiceChatControlPresenter", "initMultiGuestForAnchor");
                IMultiGuestV3InternalServiceV2 LJ = C8E.LJ();
                Context context = ((InterfaceC31336CRo) this.mView).getContext();
                o.LJIIIIZZ(context, "viewInterface.context");
                LJ.tr0(context, room, this.dataChannel, null);
                LJJJJI(room);
            } else {
                MultiLiveUserSettings multiLiveUserSettings = room.multiLiveUserSettings;
                if (multiLiveUserSettings != null && (arrayMap = multiLiveUserSettings.channelMap) != null && (l = arrayMap.get(4)) != null) {
                    str = String.valueOf(l);
                }
                IMultiGuestV3InternalServiceV2 LJ2 = C8E.LJ();
                Context context2 = ((InterfaceC31336CRo) this.mView).getContext();
                o.LJIIIIZZ(context2, "viewInterface.context");
                LJ2.tr0(context2, room, this.dataChannel, str);
                C8E.LJ().e3(this.LJLJJI);
                if (str != null) {
                    T viewInterface = this.mView;
                    o.LJIIIIZZ(viewInterface, "viewInterface");
                    C74770TWc.LIZJ(room, (TYZ) viewInterface);
                    ((TYZ) this.mView).kr();
                }
            }
        }
        DataChannel dataChannel4 = this.dataChannel;
        o.LJIIIIZZ(dataChannel4, "dataChannel");
        LinkMessageCenter linkMessageCenter = new LinkMessageCenter(dataChannel4);
        linkMessageCenter.LIZIZ();
        c75559Tl5.LJI(linkMessageCenter, "LINK_MESSAGE_CENTER");
        this.LJLIL = linkMessageCenter;
        linkMessageCenter.LIZ(this.LJLJI);
        DataChannel dataChannel5 = this.dataChannel;
        if (dataChannel5 == null || (room2 = (Room) dataChannel5.kv0(RoomChannel.class)) == null || !room2.isWithLinkMic()) {
            return;
        }
        MultiLiveUserSettings multiLiveUserSettings2 = room2.multiLiveUserSettings;
        if (multiLiveUserSettings2 != null && (multiLiveUserApplySettings = multiLiveUserSettings2.multiLiveUserApplySettings) != null && (multiLiveUserApplyPermission = multiLiveUserApplySettings.multiLiveUserApplyPermission) != null) {
            MultiLiveAnchorPanelSettings LJJJJIZL = LJJJJIZL();
            int i2 = multiLiveUserApplyPermission.multiLiveApplyPermission;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        LJJJJIZL.allowViewerReq = 4;
                        LJJJJIZL.onlyAllowFollowerReq = 4;
                        C74838TYs.LJ().LJJI = LJJJJIZL;
                        if (C74776TWi.LJIIL() && (tyz2 = (TYZ) this.mView) != null) {
                            tyz2.G9(false);
                        }
                    }
                } else {
                    LJJJJIZL.allowViewerReq = 3;
                    LJJJJIZL.onlyAllowFollowerReq = 3;
                    C74838TYs.LJ().LJJI = LJJJJIZL;
                    TYZ tyz3 = (TYZ) this.mView;
                    if (tyz3 != null) {
                        tyz3.C8();
                    }
                }
            } else {
                LJJJJIZL.allowViewerReq = 3;
                LJJJJIZL.onlyAllowFollowerReq = 4;
                C74838TYs.LJ().LJJI = LJJJJIZL;
                TYZ tyz4 = (TYZ) this.mView;
                if (tyz4 != null) {
                    tyz4.C8();
                }
            }
            C74824TYe.LIZLLL(new ARunnableS9S0101000_5(i, room2, 3));
        }
        i = 3;
        C74824TYe.LIZLLL(new ARunnableS9S0101000_5(i, room2, 3));
    }

    public final void LJJJJI(Room room) {
        C74824TYe.LJIIJ = C31012CFc.LIZIZ();
        String LIZIZ = LAV.LIZIZ();
        BizCreateChannelParams bizCreateChannelParams = new BizCreateChannelParams();
        bizCreateChannelParams.displayId = 2;
        C76611U4x c76611U4x = new C76611U4x(9, LIZIZ, bizCreateChannelParams, 7L);
        C0NB.LIZIZ("VoiceChatControlPresenter", "createChannel");
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null) {
            R6.LLILL(c76611U4x, new TYX(room, this), null);
        }
    }
}
