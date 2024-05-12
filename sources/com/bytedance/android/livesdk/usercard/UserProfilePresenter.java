package com.bytedance.android.livesdk.usercard;

import X.ActivityC45651qj;
import X.B83;
import X.C16880lQ;
import X.C19U;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29501Bhx;
import X.C73933Szx;
import X.C73943T0h;
import X.CN1;
import X.InterfaceC29502Bhy;
import X.InterfaceC29856Bng;
import Y.AfS57S0100000_5;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.ShowUserProfileEvent;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.room.DismissUserProfileEvent;
import com.bytedance.android.live.room.SubscribeSuccessEvent;
import com.bytedance.android.live.usercard.IUserCardService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveProfileV3Setting;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.usercard.profilev3.LiveProfileDialog;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class UserProfilePresenter implements GenericLifecycleObserver {
    public final BaseFragment LJLIL;
    public final DataChannel LJLILLLLZI;
    public final boolean LJLJI;
    public InterfaceC29502Bhy LJLJJI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            dismissDialog();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void dismissDialog() {
        InterfaceC29502Bhy interfaceC29502Bhy;
        InterfaceC29502Bhy interfaceC29502Bhy2 = this.LJLJJI;
        if (interfaceC29502Bhy2 != null && interfaceC29502Bhy2.isShowing() && (interfaceC29502Bhy = this.LJLJJI) != null) {
            interfaceC29502Bhy.dismiss();
        }
    }

    public final void onEvent(UserProfileEvent userProfileEvent) {
        Context context;
        FragmentManager fragmentManager;
        Room room;
        long j;
        if (this.LJLIL.isViewValid()) {
            InterfaceC29502Bhy interfaceC29502Bhy = this.LJLJJI;
            if ((interfaceC29502Bhy != null && interfaceC29502Bhy.isShowing()) || (context = this.LJLIL.getContext()) == null || (fragmentManager = this.LJLIL.getFragmentManager()) == null || (room = (Room) this.LJLILLLLZI.kv0(RoomChannel.class)) == null) {
                return;
            }
            LiveProfileDialog liveProfileDialog = null;
            if (room.isOfficial()) {
                return;
            }
            User user = userProfileEvent.user;
            if (user != null) {
                j = user.getId();
            } else {
                j = userProfileEvent.userId;
            }
            LiveProfileDialog k60 = ((IUserCardService) CN1.LIZ(IUserCardService.class)).k60(context, this.LJLJI, j, room, (User) this.LJLILLLLZI.kv0(RoomUserChannel.class), userProfileEvent.mSource, userProfileEvent, this.LJLILLLLZI);
            if (k60 != null) {
                k60.show(fragmentManager, C16880lQ.LJLLJ(LiveProfileDialog.class));
                liveProfileDialog = k60;
            }
            this.LJLJJI = liveProfileDialog;
        }
    }

    public static void LIZ(UserProfilePresenter userProfilePresenter, User user, int i) {
        Room room;
        ActivityC45651qj mo49getActivity;
        User user2 = user;
        if ((i & 1) != 0) {
            user2 = (User) userProfilePresenter.LJLILLLLZI.kv0(RoomUserChannel.class);
        }
        if ((i & 2) != 0) {
            room = (Room) userProfilePresenter.LJLILLLLZI.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        userProfilePresenter.getClass();
        if (user2 == null || room == null || user2.getId() == room.getOwnerUserId() || (mo49getActivity = userProfilePresenter.LJLIL.mo49getActivity()) == null) {
            return;
        }
        ((IUserCardService) CN1.LIZ(IUserCardService.class)).Ji0(mo49getActivity, room.getOwnerUserId(), room, user2, 0L);
    }

    public UserProfilePresenter(BaseFragment fragment, DataChannel dataChannel, boolean z, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = fragment;
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = z;
        lifecycleOwner.getLifecycle().addObserver(this);
        dataChannel.lv0(fragment, ShowUserProfileEvent.class, new C29501Bhx(this));
        dataChannel.lv0(fragment, DismissUserProfileEvent.class, new AqS171S0100000_5(this, 494));
        if (LiveProfileV3Setting.INSTANCE.isEnableAuthorPrefetch() && C29306Beo.LJIIL(dataChannel)) {
            dataChannel.lv0(fragment, RoomUserChannel.class, new AqS171S0100000_5(this, 495));
            dataChannel.lv0(fragment, SubscribeSuccessEvent.class, new AqS171S0100000_5(this, 496));
            ((InterfaceC29856Bng) ((C29374Bfu) B83.LIZ().LIZIZ()).LJIIIIZZ.LIZJ(C73933Szx.LIZLLL(fragment))).LIZIZ(new AfS57S0100000_5(this, 165));
        }
        C73943T0h LIZ = C73943T0h.LIZ();
        LIZ.getClass();
        LIZ.LIZLLL(fragment, UserProfileEvent.class, new C19U()).LIZIZ(new AfS57S0100000_5(this, 166));
    }
}
