package com.bytedance.android.live.publicscreen.impl.displayfilter;

import X.BPY;
import X.BPZ;
import X.C28724BPc;
import X.C29306Beo;
import X.C5H3;
import X.C78996UzQ;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.ExtendedPublicScreenFilterTypeChannel;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;

/* loaded from: classes6.dex */
public final class ExtendedScreenRadioFilterWidget extends LiveRecyclableWidget {
    public long LJLJL;
    public boolean LJLJLJ;
    public final C5H3 LJLIL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 47));
    public final C5H3 LJLILLLLZI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 50));
    public final C5H3 LJLJI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 51));
    public final C5H3 LJLJJI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 52));
    public final C5H3 LJLJJL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 48));
    public final C5H3 LJLJJLL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 49));
    public final BPY LJLJLLL = new BPY(this);

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dan;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Boolean bool;
        User owner;
        ((C28724BPc) this.LJLJJLL.getValue()).setOnCheckChangeListener(new BPZ(this));
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(this, ExtendedPublicScreenFilterTypeChannel.class, new AqS171S0100000_5(this, 84));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.lv0(this, LiveExtendedScreenStatus.class, new AqS171S0100000_5(this, 85));
        }
        C29306Beo.LJJLJLI((View) this.LJLJI.getValue());
        C29306Beo.LJJLJLI((View) this.LJLJJL.getValue());
        C29306Beo.LJIIJ(this.dataChannel);
        Room room = (Room) this.dataChannel.kv0(RoomChannel.class);
        if (room != null && (owner = room.getOwner()) != null) {
            bool = Boolean.valueOf(owner.isAnchorHasSubQualification());
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            C29306Beo.LJJLJLI((View) this.LJLJJI.getValue());
        } else {
            C29306Beo.LJI((View) this.LJLJJI.getValue());
        }
    }
}
