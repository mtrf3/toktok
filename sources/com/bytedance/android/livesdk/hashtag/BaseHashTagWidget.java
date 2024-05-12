package com.bytedance.android.livesdk.hashtag;

import X.B76;
import X.C16880lQ;
import X.C28420BDk;
import X.C29047Bad;
import X.C32537Cpp;
import X.C78977Uz7;
import Y.ACListenerS25S0100000_5;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget;
import com.bytedance.android.livesdk.dataChannel.HashtagChangedChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.ILayer2PriorityWidget;
import com.bytedance.ies.sdk.widgets.Layer2PriorityManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public abstract class BaseHashTagWidget extends RoomRecycleFunctionWidget implements ILayer2PriorityWidget {
    public Layer2PriorityManager LJLILLLLZI;
    public TextView LJLJI;
    public ImageView LJLJJI;
    public long LJLJJL;
    public boolean LJLJJLL;

    public abstract boolean LJLZ();

    public abstract void LJZ(FragmentManager fragmentManager);

    public abstract void LJZI();

    public abstract void LJZL();

    public abstract void LL(Hashtag hashtag);

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.d6d;
    }

    @Override // com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LLF() {
        Hashtag hashtag = (Hashtag) this.dataChannel.kv0(HashtagChangedChannel.class);
        if (hashtag != null) {
            if (C78977Uz7.LJJJLL(hashtag) && o.LJ(this.dataChannel.kv0(C28420BDk.class), Boolean.TRUE)) {
                if (!isShowing()) {
                    showWidget();
                    LJZL();
                    return;
                }
                return;
            }
            if (!isShowing()) {
                return;
            }
            hideWidget();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, com.bytedance.android.livesdk.model.Hashtag, O] */
    public final void LLFF() {
        ?? r3;
        Room room = (Room) this.dataChannel.kv0(RoomChannel.class);
        Long l = null;
        if (room == null || (r3 = room.hashtag) == 0) {
            hideWidget();
            return;
        }
        Hashtag hashtag = (Hashtag) this.dataChannel.kv0(HashtagChangedChannel.class);
        this.dataChannel.rv0(HashtagChangedChannel.class, r3);
        ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C29047Bad.class)).LIZ = r3;
        Long l2 = r3.id;
        if (hashtag != null) {
            l = hashtag.id;
        }
        if (!o.LJ(l2, l)) {
            return;
        }
        LL(r3);
    }

    @Override // com.bytedance.ies.sdk.widgets.ILayer2PriorityWidget
    public final void hideWidget() {
        this.LJLILLLLZI.hideWidget(this);
    }

    @Override // com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        this.LJLILLLLZI.getHashTag().setWidget(null);
        this.LJLIL = false;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
        this.LJLJJLL = false;
    }

    @Override // com.bytedance.ies.sdk.widgets.ILayer2PriorityWidget
    public final void showWidget() {
        Room room;
        this.LJLILLLLZI.showWidget(this);
        if (!this.LJLJJLL) {
            this.LJLJJLL = true;
            if (!LJLZ() && (room = (Room) this.dataChannel.kv0(RoomChannel.class)) != null) {
                B76.LIZJ(room, "topic");
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.ILayer2PriorityWidget
    public final View rootView() {
        return getView();
    }

    public BaseHashTagWidget(Layer2PriorityManager layer2PriorityManager) {
        o.LJIIIZ(layer2PriorityManager, "layer2PriorityManager");
        this.LJLILLLLZI = layer2PriorityManager;
    }

    @Override // com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget
    public void onGetRoomInfo(Room room) {
        LLFF();
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LJLJI = (TextView) findViewById(R.id.l07);
        this.LJLJJI = (ImageView) findViewById(R.id.l01);
        View view = getView();
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 161), view);
        }
    }

    @Override // com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onLoad(Object[] objArr) {
        this.LJLILLLLZI.getHashTag().setWidget(this);
        super.onLoad(objArr);
        View view = getView();
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 162), view);
        }
        hideWidget();
        this.dataChannel.mv0(HashtagChangedChannel.class, this, new AqS171S0100000_5(this, 382));
        LLFF();
    }
}
