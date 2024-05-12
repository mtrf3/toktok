package com.bytedance.android.live.liveinteract.multiguestv3.main.reservation.guest;

import X.C03880Dg;
import X.C0NB;
import X.C15380j0;
import X.C28784BRk;
import X.C29494Bhq;
import X.C29556Biq;
import X.C34K;
import X.C47071t1;
import X.C65300Pk0;
import X.C74766TVy;
import X.C74769TWb;
import X.C74814TXu;
import X.C74983Tbn;
import X.C75027TcV;
import X.C79234V7u;
import X.InterfaceC30442Bx8;
import X.InterfaceC55235Lm3;
import X.InterfaceC74596TPk;
import X.TRU;
import X.TWR;
import X.TXF;
import X.TXL;
import X.UC0;
import Y.IDcS94S0200000_13;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestReserveFailedEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestReserveSucceedEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestReservationDiffPkEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.BaseMultiGuestV3GuestWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.MultiGuestUserInfoFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.guest.MultiLiveGuestUserInfoDialog;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicApplyLayoutOptSetting;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AqS175S0200000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.AqS9S0111000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MultiGuestV3GuestReservationWidget extends BaseMultiGuestV3GuestWidget {
    public final FrameLayout LJLIL;
    public TRU LJLILLLLZI;
    public MultiLiveGuestUserInfoDialog LJLJI;
    public C74814TXu LJLJJI;
    public TXF LJLJJL;
    public TWR LJLJJLL;

    @Override // X.InterfaceC75472Tjg
    public final void onMultiLivePermissionOff(boolean z, boolean z2) {
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.BaseMultiGuestV3GuestWidget, com.bytedance.android.live.liveinteract.api.LinkMicGuestWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC75472Tjg
    public final void setClickLinkHostFromInteractionDialog(boolean z) {
    }

    public final void LJLZ() {
        TWR twr;
        TXF txf;
        FragmentManager fragmentManager;
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog;
        if (this.LJLJI != null && !isApplyDialogShowing() && LinkMicApplyLayoutOptSetting.INSTANCE.getValue() == 2 && (twr = this.LJLJJLL) != null && twr.LIZJ == 1) {
            if (C75027TcV.LIZ()) {
                txf = TXF.RESERVING;
            } else {
                txf = TXF.SEND_RESERVATION;
            }
            this.LJLJJL = txf;
            MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog2 = this.LJLJI;
            if (multiLiveGuestUserInfoDialog2 != null) {
                TWR twr2 = this.LJLJJLL;
                multiLiveGuestUserInfoDialog2.LJLJJI = txf;
                multiLiveGuestUserInfoDialog2.LJLJJL = twr2;
            }
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class)) != null && (multiLiveGuestUserInfoDialog = this.LJLJI) != null) {
                multiLiveGuestUserInfoDialog.show(fragmentManager, "MultiLiveGuestUserInfoDialog");
            }
        }
    }

    public final void buildDialog() {
        TXF txf;
        MultiLiveGuestUserInfoDialog LIZ;
        TWR twr;
        if (this.LJLJJLL == null) {
            this.LJLJJLL = new TWR(-1, 1, 0, 0, 60);
        }
        if (LinkMicApplyLayoutOptSetting.INSTANCE.getValue() == 2 && (twr = this.LJLJJLL) != null) {
            twr.LIZJ = 1;
            twr.LJFF = true;
        }
        if (C75027TcV.LIZ()) {
            txf = TXF.RESERVING;
        } else {
            txf = TXF.SEND_RESERVATION;
        }
        this.LJLJJL = txf;
        DataChannel dataChannel = this.dataChannel;
        o.LJIIIIZZ(dataChannel, "dataChannel");
        LIZ = TXL.LIZ(dataChannel, this.LJLJJI, new WeakReference(this.LJLILLLLZI), this.LJLJJL, this.LJLJJLL, "invite", 1);
        this.LJLJI = LIZ;
    }

    @Override // X.InterfaceC74596TPk
    public final InterfaceC55235Lm3 linkScope() {
        FrameLayout frameLayout = this.LJLIL;
        if (frameLayout != null) {
            return UC0.LJJIL(frameLayout);
        }
        return null;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog;
        TRU tru = this.LJLILLLLZI;
        if (tru != null) {
            tru.detachView();
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog2 = this.LJLJI;
        if (multiLiveGuestUserInfoDialog2 != null && multiLiveGuestUserInfoDialog2.isShowing() && (multiLiveGuestUserInfoDialog = this.LJLJI) != null) {
            multiLiveGuestUserInfoDialog.dismiss();
        }
        this.LJLJI = null;
        super.onDestroy();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        Room room;
        super.onCreate();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            DataChannel dataChannel2 = this.dataChannel;
            o.LJIIIIZZ(dataChannel2, "dataChannel");
            this.LJLILLLLZI = new TRU(room, dataChannel2, this);
        }
        TRU tru = this.LJLILLLLZI;
        if (tru != null) {
            tru.attachView((InterfaceC74596TPk) this);
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.mv0(LinkInRoomGuestReserveSucceedEvent.class, this, new AqS179S0100000_13(this, 169));
            dataChannel3.mv0(LinkInRoomGuestReserveFailedEvent.class, this, new AqS179S0100000_13(this, 170));
            dataChannel3.mv0(MultiGuestReservationDiffPkEvent.class, this, new AqS179S0100000_13(this, 171));
        }
    }

    public MultiGuestV3GuestReservationWidget(FrameLayout guestContainer) {
        o.LJIIIZ(guestContainer, "guestContainer");
        this.LJLIL = guestContainer;
        this.LJLJJL = TXF.SEND_RESERVATION;
    }

    @Override // X.InterfaceC75472Tjg
    public final void onInteractIconClick(boolean z) {
        boolean z2;
        boolean z3;
        Integer valueOf;
        MultiGuestDataHolder multiGuestDataHolder;
        MultiGuestDataHolder multiGuestDataHolder2;
        MultiGuestDataHolder multiGuestDataHolder3;
        Long l;
        Long l2;
        TRU tru = this.LJLILLLLZI;
        if (tru != null) {
            boolean z4 = true;
            int i = 2;
            if (LinkMicApplyLayoutOptSetting.INSTANCE.getValue() != 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            AqS9S0111000_13 aqS9S0111000_13 = new AqS9S0111000_13(z2, tru, 2);
            MultiGuestDataHolder multiGuestDataHolder4 = tru.getMultiGuestDataHolder();
            if (multiGuestDataHolder4 == null || (l2 = multiGuestDataHolder4.LJJJ) == null || l2.longValue() != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            String str = null;
            if (!z3 && (((multiGuestDataHolder = tru.getMultiGuestDataHolder()) != null && multiGuestDataHolder.LJJIJLIJ == -1) || (((multiGuestDataHolder2 = tru.getMultiGuestDataHolder()) != null && multiGuestDataHolder2.LJJIJLIJ == 0) || (multiGuestDataHolder3 = tru.getMultiGuestDataHolder()) == null || Integer.valueOf(multiGuestDataHolder3.LJJIJLIJ) == null))) {
                MultiLiveUserSettings multiLiveUserSettings = tru.room.multiLiveUserSettings;
                if (multiLiveUserSettings == null || !multiLiveUserSettings.P()) {
                    z4 = false;
                }
                if (z4) {
                    C0NB.LIZIZ("MultiGuestV3GuestReservationPresenter", "handleHasNoPermission");
                    MultiGuestDataHolder multiGuestDataHolder5 = tru.getMultiGuestDataHolder();
                    if (multiGuestDataHolder5 != null) {
                        l = multiGuestDataHolder5.LJJJ;
                    } else {
                        l = null;
                    }
                    MultiGuestDataHolder multiGuestDataHolder6 = tru.getMultiGuestDataHolder();
                    if (multiGuestDataHolder6 != null) {
                        str = multiGuestDataHolder6.LJJJI;
                    }
                    C74766TVy c74766TVy = new C74766TVy(0, str, l);
                    InterfaceC74596TPk interfaceC74596TPk = (InterfaceC74596TPk) tru.mView;
                    if (interfaceC74596TPk != null) {
                        interfaceC74596TPk.onCheckPermissionFailedV3(c74766TVy);
                        return;
                    }
                    return;
                }
                C0NB.LIZIZ("MultiGuestV3GuestReservationPresenter", "handlePermissionInfoIsNullForSafe");
                C74769TWb.LIZJ(tru.room, tru.LJLIL, (InterfaceC74596TPk) tru.mView, 0, false, null, null, new AqS175S0200000_13(tru, aqS9S0111000_13, 12), null);
                return;
            }
            MultiGuestDataHolder multiGuestDataHolder7 = tru.getMultiGuestDataHolder();
            if (multiGuestDataHolder7 != null && (valueOf = Integer.valueOf(multiGuestDataHolder7.LJJIJLIJ)) != null) {
                i = valueOf.intValue();
            }
            aqS9S0111000_13.invoke(Integer.valueOf(i));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.BaseMultiGuestV3GuestWidget, X.InterfaceC74596TPk
    public final void showReservationDialog(long j) {
        Room room;
        FragmentManager fragmentManager;
        MultiGuestUserInfoFragment multiGuestUserInfoFragment;
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog = this.LJLJI;
        if (multiLiveGuestUserInfoDialog != null && multiLiveGuestUserInfoDialog.isShowing()) {
            return;
        }
        TRU tru = this.LJLILLLLZI;
        Fragment fragment = null;
        if (tru != null) {
            room = tru.room;
        } else {
            room = null;
        }
        this.LJLJJI = new C74814TXu(null, room, false, null, 0, this.dataChannel);
        buildDialog();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class)) != null) {
            C74983Tbn LIZ = C29556Biq.LIZ();
            TWR twr = this.LJLJJLL;
            LIZ.getClass();
            if (C74983Tbn.LJIIL(twr) && this.LJLJJL == TXF.SEND_RESERVATION) {
                if (!InterfaceC30442Bx8.A0.LIZJ().booleanValue()) {
                    C34K c34k = new C34K();
                    C47071t1 c47071t1 = new C47071t1(this.context);
                    c47071t1.LIZJ = C15380j0.LJIILJJIL(R.string.kl6);
                    c47071t1.LJII(C15380j0.LJIILJJIL(R.string.kl5));
                    c47071t1.LJIIL(R.string.klh, new IDcS94S0200000_13(c34k, this, 9));
                    c47071t1.LJIIIZ(R.string.khq, C79234V7u.LJLJI);
                    LiveDialog LIZ2 = c47071t1.LIZ();
                    LIZ2.setCanceledOnTouchOutside(false);
                    LIZ2.LJJ(new C28784BRk(c34k));
                    if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ2, new Object[0], "void", new C65300Pk0(false, "()V", "-4704036880921521939")).LIZ) {
                        return;
                    }
                    LIZ2.show();
                    return;
                }
                if (this.LJLJI == null || getContext() == null) {
                    return;
                }
                MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog2 = this.LJLJI;
                if (multiLiveGuestUserInfoDialog2 != null) {
                    fragment = multiLiveGuestUserInfoDialog2.wl();
                }
                if (!(fragment instanceof MultiGuestUserInfoFragment) || (multiGuestUserInfoFragment = (MultiGuestUserInfoFragment) fragment) == null) {
                    return;
                }
                Context context = getContext();
                o.LJIIIIZZ(context, "getContext()");
                multiGuestUserInfoFragment.Il(context);
                return;
            }
            MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog3 = this.LJLJI;
            if (multiLiveGuestUserInfoDialog3 != null) {
                multiLiveGuestUserInfoDialog3.show(fragmentManager, "MultiLiveGuestUserInfoDialog");
            }
        }
    }
}
