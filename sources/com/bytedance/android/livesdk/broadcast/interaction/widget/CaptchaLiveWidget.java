package com.bytedance.android.livesdk.broadcast.interaction.widget;

import X.BB5;
import X.BZI;
import X.C1DH;
import X.C28289B8j;
import X.C28787BRn;
import X.C29306Beo;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.CaptchaLivePauseTimeChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;

/* loaded from: classes6.dex */
public final class CaptchaLiveWidget extends LiveWidget {
    public final View LJLIL;
    public long LJLILLLLZI;
    public BB5 LJLJI;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dno;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        C29306Beo.LJIIIZ(this.LJLIL);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        long j;
        super.onCreate();
        Room LJIILL = C1DH.LJIILL(this.dataChannel);
        if (LJIILL != null) {
            j = LJIILL.getCreateTime();
        } else {
            j = 0;
        }
        this.LJLILLLLZI = j;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.mv0(CaptchaLivePauseTimeChannel.class, this, new AqS171S0100000_5(this, 134));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        long j;
        super.show();
        C29306Beo.LJJLJLI(this.LJLIL);
        BZI LIZ = C28787BRn.LIZ("livesdk_captcha_popup_show");
        LIZ.LJIILLIIL(this.dataChannel);
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Room LJIILL = C1DH.LJIILL(this.dataChannel);
        if (LJIILL != null) {
            j = LJIILL.getCreateTime();
        } else {
            j = 0;
        }
        C28289B8j.LIZJ(currentTimeMillis, j, LIZ, "duration_after_live_take");
    }

    public CaptchaLiveWidget(View view) {
        this.LJLIL = view;
    }
}
