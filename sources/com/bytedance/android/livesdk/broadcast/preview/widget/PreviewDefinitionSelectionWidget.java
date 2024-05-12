package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C28509BGv;
import X.C29494Bhq;
import X.C7N;
import X.InterfaceC30442Bx8;
import X.JBR;
import X.X1D;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import com.bytedance.android.live.definition.IDefinitionService;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.dataChannel.BroadcastShareScreenDefinition;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.barrage.TtliveEnablePreparationPageSpeedtestOptimizeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreviewDefinitionSelectionWidget extends PreviewToolBaseWidget {
    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int LLFFF() {
        return R.drawable.cu5;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int LLFII() {
        return R.string.k10;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public static PushStreamInfo.Quality LLIIIILZ() {
        boolean z;
        PushStreamInfo.Quality quality;
        String str;
        Map<String, String> LIZJ = InterfaceC30442Bx8.LLLZI.LIZJ();
        if (LIZJ == null || LIZJ.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        String str2 = null;
        if (!z) {
            quality = new PushStreamInfo.Quality();
            quality.name = LIZJ.get("name");
            quality.sdkKey = LIZJ.get("sdk_key");
        } else {
            quality = null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getLastSpSelectedQuality. lastQuality.name=");
        if (quality != null) {
            str = quality.name;
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(", lastQuality.sdkKey=");
        if (quality != null) {
            str2 = quality.sdkKey;
        }
        JBR.LJIIJ(LIZ, str2, LIZ, "PreviewDefinitionSelectionWidget");
        return quality;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        String str;
        String str2;
        LiveMode liveMode;
        if (!TtliveEnablePreparationPageSpeedtestOptimizeSetting.INSTANCE.isExperimentGroup()) {
            super.show();
            PushStreamInfo.Quality quality = (PushStreamInfo.Quality) DataChannelGlobal.LJLJJI.mv0(BroadcastShareScreenDefinition.class);
            DataChannel dataChannel = this.dataChannel;
            String str3 = "";
            if (dataChannel == null || (liveMode = (LiveMode) dataChannel.kv0(LiveModeChannel.class)) == null) {
                str = "";
            } else {
                str = C28509BGv.LIZ(liveMode);
            }
            Object value = C7N.LJJIJLIJ.getValue();
            o.LJIIIIZZ(value, "<get-definitionService>(...)");
            IDefinitionService iDefinitionService = (IDefinitionService) value;
            if (quality != null && (str2 = quality.sdkKey) != null) {
                str3 = str2;
            }
            iDefinitionService.gV(str3, str);
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        super.LJZL();
        PushStreamInfo.Quality LLIIIILZ = LLIIIILZ();
        if (LLIIIILZ != null) {
            DataChannelGlobal.LJLJJI.tv0(BroadcastShareScreenDefinition.class, LLIIIILZ);
        }
        this.dataChannel.ov0(this, RoomCreateInfoChannel.class, new AqS171S0100000_5(this, 172));
        DataChannelGlobal.LJLJJI.qv0(this, this, BroadcastShareScreenDefinition.class, new AqS171S0100000_5(this, 173));
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final void onClick(View view) {
        FragmentManager fragmentManager;
        o.LJIIIZ(view, "view");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class)) != null) {
            Object value = C7N.LJJIJLIJ.getValue();
            o.LJIIIIZZ(value, "<get-definitionService>(...)");
            ((IDefinitionService) value).bT(fragmentManager, true);
        }
    }
}
