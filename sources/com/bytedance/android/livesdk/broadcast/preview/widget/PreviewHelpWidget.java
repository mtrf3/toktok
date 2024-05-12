package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C0N7;
import X.C0NB;
import X.C15380j0;
import X.C28509BGv;
import X.C29682Bks;
import X.C29683Bkt;
import X.CN1;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveNewGameBroadcastBannerHelpPageScheme;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreviewHelpWidget extends PreviewToolBaseWidget {
    public final int LJLJI = R.string.lf_;
    public final int LJLJJI = R.drawable.d06;

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        LLIIIILZ("show");
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        View findViewById;
        float f;
        super.LJZL();
        View view = getView();
        if (view == null || (findViewById = view.findViewById(R.id.nix)) == null) {
            return;
        }
        if (C15380j0.LJIIZILJ()) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        findViewById.setScaleX(f);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int LLFFF() {
        return this.LJLJJI;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int LLFII() {
        return this.LJLJI;
    }

    public final void LLIIIILZ(String str) {
        String str2;
        LiveMode liveMode;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.kv0(LiveModeChannel.class)) != null) {
            str2 = C28509BGv.LIZ(liveMode);
        } else {
            str2 = "";
        }
        C0N7.LIZLLL(str, "help_tip_button", this.dataChannel, str2);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final void onClick(View view) {
        o.LJIIIZ(view, "view");
        String value = LiveNewGameBroadcastBannerHelpPageScheme.INSTANCE.getValue();
        if (value.length() > 0) {
            C29682Bks LIZ = C29683Bkt.LIZ(value);
            LIZ.LJIIIZ("bottom");
            LIZ.LJIJJ("bottom");
            LIZ.LJ(-16777216);
            String uri = LIZ.LIZ().toString();
            o.LJIIIIZZ(uri, "builder.build().toString()");
            IHybridContainerService iHybridContainerService = (IHybridContainerService) CN1.LIZ(IHybridContainerService.class);
            Context context = this.context;
            o.LJIIIIZZ(context, "context");
            iHybridContainerService.Vs0(context, uri, null);
        } else {
            C0NB.LJ("PreviewHelpWidget", "open LiveNewGameBroadcastBannerHelpPageScheme but scheme is empty!");
        }
        LLIIIILZ("click");
    }
}
