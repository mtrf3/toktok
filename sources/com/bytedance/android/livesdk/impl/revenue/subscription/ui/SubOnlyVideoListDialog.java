package com.bytedance.android.livesdk.impl.revenue.subscription.ui;

import X.B83;
import X.BZI;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.C28507BGt;
import X.C28787BRn;
import X.C29374Bfu;
import X.CN1;
import Y.ACListenerS25S0100000_5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.BroadcastEndShowEvent;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.LiveEndDismissDialogEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class SubOnlyVideoListDialog extends LiveDialogFragment {
    public static final /* synthetic */ int LJLJJI = 0;
    public Room LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public String LJLIL = "";

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.d1_);
        c28507BGt.LIZJ = R.style.aap;
        c28507BGt.LJI = 0.0f;
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJJI = 60;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Room room;
        long id;
        String secUid;
        User owner;
        User owner2;
        super.onCreate(bundle);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LJLILLLLZI = room;
        FragmentManager childFragmentManager = getChildFragmentManager();
        C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
        IHostAction iHostAction = (IHostAction) CN1.LIZ(IHostAction.class);
        Room room2 = this.LJLILLLLZI;
        if (room2 != null && (owner2 = room2.getOwner()) != null) {
            id = owner2.getId();
        } else {
            id = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getId();
        }
        Room room3 = this.LJLILLLLZI;
        if (room3 == null || (owner = room3.getOwner()) == null || (secUid = owner.getSecUid()) == null) {
            secUid = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getSecUid();
        }
        LIZ.LJIIIIZZ(R.id.dm7, 1, iHostAction.getSubOnlyVideoContentFragment(false, id, secUid, this.LJLIL), null);
        LIZ.LJIILJJIL();
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.lv0(this, LiveEndDismissDialogEvent.class, new AqS171S0100000_5(this, 399));
            dataChannel2.lv0(this, BroadcastEndShowEvent.class, new AqS171S0100000_5(this, LiveChatShowDelayForHotLiveSetting.DEFAULT));
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater cloneInContext = super.onGetLayoutInflater(bundle).cloneInContext(mo49getActivity());
        o.LJIIIIZZ(cloneInContext, "super.onGetLayoutInflate…sureLiveDesign(activity))");
        return cloneInContext;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Long l;
        Long l2;
        User owner;
        FollowInfo followInfo;
        User owner2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.aeg);
        if (liveIconView != null) {
            C16880lQ.LJJII(liveIconView, new ACListenerS25S0100000_5(this, 172));
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_sub_only_video_page_show");
        LIZ.LJIJJ(this.LJLIL, "enter_from");
        Room room = this.LJLILLLLZI;
        Long l3 = null;
        if (room != null && (owner2 = room.getOwner()) != null) {
            l = Long.valueOf(owner2.getId());
        } else {
            l = null;
        }
        LIZ.LJIJJ(l, "anchor_id");
        Room room2 = this.LJLILLLLZI;
        if (room2 != null) {
            l2 = Long.valueOf(room2.getId());
        } else {
            l2 = null;
        }
        LIZ.LJIJJ(l2, "room_id");
        Room room3 = this.LJLILLLLZI;
        if (room3 != null && (owner = room3.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
            l3 = Long.valueOf(followInfo.getFollowStatus());
        }
        LIZ.LJIJJ(l3, "follow_status");
        LIZ.LJJIIJZLJL();
    }
}
