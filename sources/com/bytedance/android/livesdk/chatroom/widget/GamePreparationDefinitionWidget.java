package com.bytedance.android.livesdk.chatroom.widget;

import X.C0NB;
import X.C12770en;
import X.C16880lQ;
import X.C29023BaF;
import X.C29039BaV;
import X.C29494Bhq;
import X.C30922CBq;
import X.C32044Chs;
import X.C32537Cpp;
import X.InterfaceC30442Bx8;
import Y.ACListenerS25S0100000_5;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.broadcast.speeddetector.GamePreparationNetworkSpeedTipsDialog;
import com.bytedance.android.livesdk.dataChannel.BroadcastShareScreenDefinition;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GamePreparationDefinitionWidget extends LiveRecyclableWidget {
    public final boolean LJLIL;
    public ImageView LJLILLLLZI;

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        if (this.LJLIL) {
            return R.layout.cv5;
        }
        return R.layout.cv4;
    }

    public GamePreparationDefinitionWidget(boolean z) {
        this.LJLIL = z;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList, O] */
    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        ImageView imageView;
        Map<Long, PushStreamInfo> map;
        PushStreamInfo pushStreamInfo;
        boolean z;
        FragmentManager fragmentManager;
        FragmentManager fragmentManager2;
        FragmentManager fragmentManager3;
        View view = getView();
        if (view != null) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                fragmentManager3 = (FragmentManager) dataChannel.kv0(C29494Bhq.class);
            } else {
                fragmentManager3 = null;
            }
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(fragmentManager3, 137), view);
        }
        View view2 = getView();
        if (view2 != null) {
            imageView = (ImageView) view2.findViewById(R.id.eb9);
        } else {
            imageView = null;
        }
        this.LJLILLLLZI = imageView;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Object mv0 = dataChannelGlobal.mv0(BroadcastShareScreenDefinition.class);
        if (mv0 != null) {
            dataChannelGlobal.tv0(BroadcastShareScreenDefinition.class, mv0);
        } else {
            RoomCreateInfo roomCreateInfo = (RoomCreateInfo) dataChannelGlobal.mv0(C29039BaV.class);
            if (roomCreateInfo != null && (map = roomCreateInfo.pushStreamInfoMap) != null && (pushStreamInfo = map.get(4L)) != null) {
                List<PushStreamInfo.Quality> list = pushStreamInfo.qualityList;
                PushStreamInfo.Quality quality = pushStreamInfo.defaultQuality;
                if (list != null && !list.isEmpty()) {
                    ?? arrayList = new ArrayList();
                    Iterator<PushStreamInfo.Quality> it = list.iterator();
                    while (it.hasNext()) {
                        String str = it.next().sdkKey;
                        o.LJIIIIZZ(str, "item.sdkKey");
                        arrayList.add(str);
                    }
                    ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C29023BaF.class)).LIZ = arrayList;
                }
                if (quality != null) {
                    DataChannelGlobal.LJLJJI.tv0(BroadcastShareScreenDefinition.class, quality);
                }
            }
        }
        DataChannelGlobal.LJLJJI.qv0(this, this, BroadcastShareScreenDefinition.class, new AqS171S0100000_5(this, 658));
        long currentTimeMillis = System.currentTimeMillis();
        Long LIZJ = InterfaceC30442Bx8.LLLLJI.LIZJ();
        o.LJIIIIZZ(LIZJ, "LAST_GAME_LIVE_TIMESTAMP.value");
        long j = 108000 * 1000;
        long longValue = currentTimeMillis - LIZJ.longValue();
        if (longValue > j || longValue < (-j)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long currentTimeMillis2 = System.currentTimeMillis();
            Long LIZJ2 = InterfaceC30442Bx8.LLLLL.LIZJ();
            o.LJIIIIZZ(LIZJ2, "LAST_GAME_LIVE_PREPARATI…PEED_TEST_TIMESTAMP.value");
            long longValue2 = currentTimeMillis2 - LIZJ2.longValue();
            if (longValue2 > j || longValue2 < (-j)) {
                if (C30922CBq.LIZIZ) {
                    C0NB.LJIIIZ("GamePreparationDefinitionWidget", "checkShowNetworkSpeedTips(). new user and long time no speed test in preparation page.");
                }
                C12770en.LJ(1, "show", "");
                Bundle bundle = new Bundle();
                bundle.putInt("enter_from", 1);
                DataChannel dataChannel2 = this.dataChannel;
                if (dataChannel2 != null) {
                    fragmentManager2 = (FragmentManager) dataChannel2.kv0(C29494Bhq.class);
                } else {
                    fragmentManager2 = null;
                }
                C32044Chs.LJIIIZ(fragmentManager2, GamePreparationNetworkSpeedTipsDialog.class, "game_preparation_speed_test_tips", null, bundle);
                return;
            }
            return;
        }
        Float LIZJ3 = InterfaceC30442Bx8.LLLLJ.LIZJ();
        o.LJIIIIZZ(LIZJ3, "LAST_GAME_LIVE_HIGH_PING_PERCENT.value");
        if (LIZJ3.floatValue() < 0.1f) {
            return;
        }
        if (C30922CBq.LIZIZ) {
            C0NB.LJIIIZ("GamePreparationDefinitionWidget", "checkShowNetworkSpeedTips(). old user and had performance question in last game live.");
        }
        C12770en.LJ(2, "show", "");
        Bundle bundle2 = new Bundle();
        bundle2.putInt("enter_from", 2);
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            fragmentManager = (FragmentManager) dataChannel3.kv0(C29494Bhq.class);
        } else {
            fragmentManager = null;
        }
        C32044Chs.LJIIIZ(fragmentManager, GamePreparationNetworkSpeedTipsDialog.class, "game_preparation_speed_test_tips", null, bundle2);
    }
}
