package com.bytedance.android.livesdk.hashtag;

import X.BZI;
import X.C15380j0;
import X.C16880lQ;
import X.C28420BDk;
import X.C28787BRn;
import X.C32537Cpp;
import X.CN1;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.dataChannel.RefreshMoreRedDotEvent;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.performance.EnableRecycleSingleWidgetSetting;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.Layer2PriorityManager;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class AudienceHashTagWidget extends BaseHashTagWidget {
    public boolean LJLJL;

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget
    public final boolean LJLZ() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget
    public final void LL(Hashtag hashtag) {
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget, com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget
    public final void LJZI() {
        String str;
        BZI LIZ = C28787BRn.LIZ("livesdk_viewer_topic_click");
        if (C15380j0.LJIILLIIL()) {
            str = "portrait";
        } else {
            str = "landscape";
        }
        LIZ.LJIJJ(str, "room_orientation");
        LIZ.LJIILLIIL(this.dataChannel);
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
            LIZ.LJJIIJZLJL();
        } else {
            LIZ.LJJIJ();
            LIZ.LJJIIZI();
        }
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget
    public final void LJZL() {
        if (this.LJLJL) {
            return;
        }
        this.LJLJL = true;
        if (UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_viewer_topic_show")) {
            BZI LIZ = C28787BRn.LIZ("livesdk_viewer_topic_show");
            LIZ.LJIILLIIL(this.dataChannel);
            LIZ.LJJIIJZLJL();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return EnableRecycleSingleWidgetSetting.INSTANCE.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceHashTagWidget(Layer2PriorityManager layer2PriorityManager) {
        super(layer2PriorityManager);
        o.LJIIIZ(layer2PriorityManager, "layer2PriorityManager");
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget
    public final void LJZ(FragmentManager fragmentManager) {
        new HashtagAudienceDialog().show(fragmentManager, C16880lQ.LJLLJ(BaseHashTagWidget.class));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void initConstructor(Object... args) {
        o.LJIIIZ(args, "args");
        super.initConstructor(Arrays.copyOf(args, args.length));
        Object obj = args[0];
        o.LJII(obj, "null cannot be cast to non-null type com.bytedance.ies.sdk.widgets.Layer2PriorityManager");
        this.LJLILLLLZI = (Layer2PriorityManager) obj;
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget, com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget
    public final void onGetRoomInfo(Room room) {
        LLFF();
        attach();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Boolean, O] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Boolean, java.lang.Object, O] */
    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget, com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Boolean bool;
        super.onLoad(objArr);
        this.LJLJL = false;
        IMicRoomService iMicRoomService = (IMicRoomService) CN1.LIZ(IMicRoomService.class);
        if (iMicRoomService != null) {
            bool = Boolean.valueOf(iMicRoomService.rk());
        } else {
            bool = null;
        }
        ?? r2 = Boolean.TRUE;
        if (o.LJ(bool, r2)) {
            ((C32537Cpp) this.dataChannel.gv0(C28420BDk.class)).LIZ = Boolean.FALSE;
            hideWidget();
        } else {
            ((C32537Cpp) this.dataChannel.gv0(C28420BDk.class)).LIZ = r2;
            LLF();
        }
        this.dataChannel.pv0(RefreshMoreRedDotEvent.class);
    }
}
