package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.service.usermanage.anchor.AnchorBusinessUserManager;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestCancelReservationMsgReceivedEvent;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestReservationMsgReceivedEvent;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.RequestFrequencyEndEvent;
import com.bytedance.android.livesdk.model.message.AudienceCancelContent;
import com.bytedance.android.livesdk.model.message.AudienceReserveContent;
import com.bytedance.android.livesdk.model.message.AudienceReserveUserInfo;
import com.bytedance.android.livesdk.model.message.AudienceReserveUserStateMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.List;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.TYz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74845TYz extends TZ8 implements OnMessageListener, TZU {
    public final C74661TRx LJLJI;
    public final C62822Ol8 LJLJJI;

    @InterfaceC75558Tl4(name = "MULTI_GUEST_V3_ANCHOR_USER_MANAGER")
    public InterfaceC31805Ce1 userManager;

    @Override // X.InterfaceC74852TZg
    public final boolean LJIJJLI(String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        return false;
    }

    @Override // X.InterfaceC74852TZg
    public final void LJJIFFI(TZK tzk) {
    }

    public final C76800UCe LJJJJLL() {
        List list;
        AbstractC74727TUl LIZ;
        TZC tzc = (TZC) this.mView;
        if (tzc != null) {
            InterfaceC31805Ce1 interfaceC31805Ce1 = this.userManager;
            if (interfaceC31805Ce1 != null && (LIZ = interfaceC31805Ce1.LIZ()) != null) {
                list = LIZ.LJIJI();
            } else {
                list = null;
            }
            tzc.tv(null, null, list);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.AbstractC75411Tih, X.AbstractC31497CXt, X.BY9
    public final void detachView() {
        C0NB.LIZIZ("MultiGuestV3AnchorReservationPresenter", "detachView");
        InterfaceC31805Ce1 interfaceC31805Ce1 = this.userManager;
        if (interfaceC31805Ce1 != null) {
            interfaceC31805Ce1.LIZLLL(this.LJLJI);
        }
        InterfaceC31805Ce1 interfaceC31805Ce12 = this.userManager;
        if (interfaceC31805Ce12 != null) {
            interfaceC31805Ce12.release();
        }
        IMessageManager iMessageManager = this.mMessageManager;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        super.detachView();
    }

    @Override // X.TZ8
    public final InterfaceC31805Ce1 LJJJJJ() {
        return this.userManager;
    }

    @Override // X.TZU
    public final void LJJJ(User user) {
        this.dataChannel.rv0(RequestFrequencyEndEvent.class, user);
    }

    @Override // X.AbstractC75411Tih, X.AbstractC31497CXt
    /* renamed from: LJJJJLI, reason: merged with bridge method [inline-methods] */
    public final void attachView(TZC tzc) {
        super.attachView((C74845TYz) tzc);
        C0NB.LIZIZ("MultiGuestV3AnchorReservationPresenter", "attachView");
        InterfaceC31805Ce1 interfaceC31805Ce1 = this.userManager;
        if (interfaceC31805Ce1 != null) {
            interfaceC31805Ce1.LJII(1);
            interfaceC31805Ce1.LJ(this.LJLJI);
        }
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.kv0(C29927Bop.class);
        this.mMessageManager = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.AUDIENCE_RESERVE_USER_STATE_MESSAGE.getIntType(), this);
        }
        ((TZR) this.LJLJJI.getValue()).LIZIZ();
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        User user;
        FollowInfo followInfo;
        AudienceCancelContent audienceCancelContent;
        User user2;
        String str;
        long j;
        String l;
        if (iMessage instanceof AudienceReserveUserStateMessage) {
            AudienceReserveUserStateMessage audienceReserveUserStateMessage = (AudienceReserveUserStateMessage) iMessage;
            C0NB.LIZIZ("MultiGuestV3AnchorReservationPresenter", "handleReservationMessage");
            if (audienceReserveUserStateMessage.type == 1) {
                AudienceReserveContent audienceReserveContent = audienceReserveUserStateMessage.audienceReserveContent;
                String str2 = "";
                if (audienceReserveContent == null || (str = Long.valueOf(audienceReserveContent.fromUserId).toString()) == null) {
                    str = "";
                }
                Room room = this.LJLIL;
                AudienceReserveUserInfo audienceReserveUserInfo = audienceReserveUserStateMessage.audienceReserveUserInfo;
                if (audienceReserveUserInfo != null && (l = Long.valueOf(audienceReserveUserInfo.reserveId).toString()) != null) {
                    str2 = l;
                }
                C75642TmQ.LJJIJLIJ(str, room, str2, false);
                TZC tzc = (TZC) this.mView;
                if (tzc != null && tzc.BG()) {
                    AudienceReserveUserInfo audienceReserveUserInfo2 = audienceReserveUserStateMessage.audienceReserveUserInfo;
                    if (audienceReserveUserInfo2 != null) {
                        j = audienceReserveUserInfo2.reserveId;
                    } else {
                        j = 0;
                    }
                    C74824TYe.LJJIIJ(j, "cohost", "not_response");
                }
            }
            TZC tzc2 = (TZC) this.mView;
            if (tzc2 != null && tzc2.BG()) {
                InterfaceC31805Ce1 interfaceC31805Ce1 = this.userManager;
                if (interfaceC31805Ce1 != null) {
                    TRT.LIZ(interfaceC31805Ce1, "reserve_message", 2, null, null, 12);
                    return;
                }
                return;
            }
            int i = audienceReserveUserStateMessage.type;
            if (i != 1) {
                if (i != 2 || (audienceCancelContent = audienceReserveUserStateMessage.audienceCancelContent) == null || (user2 = audienceCancelContent.user) == null) {
                    return;
                }
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null) {
                    dataChannel.qv0(MultiGuestCancelReservationMsgReceivedEvent.class, Long.valueOf(user2.getId()));
                }
                ((TZR) this.LJLJJI.getValue()).LIZJ(user2);
                return;
            }
            AudienceReserveContent audienceReserveContent2 = audienceReserveUserStateMessage.audienceReserveContent;
            if (audienceReserveContent2 == null || (user = audienceReserveContent2.user) == null) {
                return;
            }
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null) {
                dataChannel2.qv0(MultiGuestReservationMsgReceivedEvent.class, Long.valueOf(user.getId()));
            }
            DataChannel dataChannel3 = this.dataChannel;
            if ((dataChannel3 != null && o.LJ(dataChannel3.kv0(C74968TbY.class), Boolean.TRUE)) || (followInfo = user.getFollowInfo()) == null || ((int) followInfo.getFollowStatus()) != 2) {
                return;
            }
            ((TZR) this.LJLJJI.getValue()).LIZ(user);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74845TYz(Room room, DataChannel dataChannel, LifecycleOwner lifecycleOwner) {
        super(room, dataChannel, lifecycleOwner);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLJI = new C74661TRx(this);
        this.LJLJJI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 470));
        IMessageManager iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class);
        C75559Tl5 c75559Tl5 = C75559Tl5.LIZIZ;
        c75559Tl5.LJI(new AnchorBusinessUserManager(this.LJLIL, 0L, iMessageManager), "MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        c75559Tl5.LIZLLL(this);
    }
}
