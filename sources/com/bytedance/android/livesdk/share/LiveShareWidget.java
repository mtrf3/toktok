package com.bytedance.android.livesdk.share;

import X.C73318Sq2;
import Y.AObjectS42S0101000_5;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.dataChannel.WannaShareLiveEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveWidget;

/* loaded from: classes6.dex */
public class LiveShareWidget extends LiveWidget {
    public final C73318Sq2 LJLIL = new C73318Sq2();
    public boolean LJLILLLLZI;
    public Room LJLJI;
    public User LJLJJI;

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        this.LJLILLLLZI = ((Boolean) this.dataChannel.kv0(UserIsAnchorChannel.class)).booleanValue();
        this.LJLJI = (Room) this.dataChannel.kv0(RoomChannel.class);
        this.LJLJJI = (User) this.dataChannel.kv0(RoomUserChannel.class);
        this.dataChannel.lv0(this, WannaShareLiveEvent.class, new AObjectS42S0101000_5(1, this, 4));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        this.LJLIL.LIZLLL();
    }
}
