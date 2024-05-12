package X;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.service.usermanage.guest.GuestBusinessUserManager;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestUpdateUserInfoFragmentForReservation;
import com.bytedance.android.livesdk.model.message.AudienceReserveUserStateMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TRU extends TQM implements OnMessageListener {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJI;
    public final DataChannel LJLIL;
    public final C31657Cbd LJLILLLLZI;

    @InterfaceC75558Tl4(name = "MULTI_GUEST_V3_GUEST_USER_MANAGER")
    public TQ8 userManager;

    static {
        TBT tbt = new TBT(TRU.class, "multiGuestDataHolder", "getMultiGuestDataHolder()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/common/MultiGuestDataHolder;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJI = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.TQM
    public final void checkPermissionRealTime$liveinteract_impl_release(int i, TWR twr) {
    }

    @Override // X.TQM
    public final void onEnterBackground() {
    }

    @Override // X.TQM
    public final void onEnterForeground() {
    }

    @Override // X.TQM
    public final void setDialogView(TQ7 tq7) {
    }

    @Override // X.AbstractC75411Tih, X.AbstractC31497CXt, X.BY9
    public final void detachView() {
        C0NB.LIZIZ("MultiGuestV3GuestReservationPresenter", "detachView");
        TQ8 tq8 = this.userManager;
        if (tq8 != null) {
            tq8.release();
        }
        IMessageManager iMessageManager = this.mMessageManager;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        super.detachView();
    }

    public final MultiGuestDataHolder getMultiGuestDataHolder() {
        return (MultiGuestDataHolder) this.LJLILLLLZI.LIZ(this, LJLJI[0]);
    }

    @Override // X.TQM
    public final TQ8 getUserManager() {
        return this.userManager;
    }

    @Override // X.TQM
    public final C76800UCe getWaitingList() {
        return C76800UCe.LIZ;
    }

    @Override // X.AbstractC75411Tih, X.AbstractC31497CXt
    public final void attachView(InterfaceC74596TPk interfaceC74596TPk) {
        super.attachView((TRU) interfaceC74596TPk);
        C0NB.LIZIZ("MultiGuestV3GuestReservationPresenter", "attachView");
        TQ8 tq8 = this.userManager;
        if (tq8 != null) {
            tq8.LJII(1);
        }
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.kv0(C29927Bop.class);
        this.mMessageManager = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.AUDIENCE_RESERVE_USER_STATE_MESSAGE.getIntType(), this);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        Context context;
        if ((iMessage instanceof AudienceReserveUserStateMessage) && ((AudienceReserveUserStateMessage) iMessage).type == 3) {
            C0NB.LIZIZ("MultiGuestV3GuestReservationPresenter", "handleReserveMessage");
            InterfaceC31336CRo interfaceC31336CRo = (InterfaceC31336CRo) this.mView;
            if (interfaceC31336CRo != null) {
                context = interfaceC31336CRo.getContext();
            } else {
                context = null;
            }
            Activity LJIILJJIL = g0.LJIILJJIL(context);
            if (LJIILJJIL == null) {
                return;
            }
            C30868C9o.LJIIIZ(R.drawable.cx3, LJIILJJIL, C15380j0.LJIILL(R.string.khh, C05170If.LIZ(this.room.getOwner())));
            C75027TcV.LIZIZ(3);
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.pv0(MultiGuestUpdateUserInfoFragmentForReservation.class);
            }
        }
    }

    @Override // X.TQM
    public final void setUserManager(TQ8 tq8) {
        this.userManager = tq8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TRU(Room room, DataChannel dataChannel, LifecycleOwner lifecycleOwner) {
        super(room, dataChannel, lifecycleOwner);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = dataChannel;
        this.LJLILLLLZI = new C31657Cbd("MULTI_GUEST_DATA_HOLDER");
        IMessageManager iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class);
        long LJJJLIIL = C78886Uxe.LJJJLIIL(C8E.LJ());
        C75559Tl5 c75559Tl5 = C75559Tl5.LIZIZ;
        c75559Tl5.LJI(new GuestBusinessUserManager(room, LJJJLIIL, iMessageManager, lifecycleOwner), "MULTI_GUEST_V3_GUEST_USER_MANAGER");
        c75559Tl5.LIZLLL(this);
    }
}
