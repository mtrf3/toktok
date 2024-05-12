package com.bytedance.android.livesdk.broadcast.preview.widget.livepro;

import X.C0NA;
import X.C28503BGp;
import X.C29306Beo;
import X.C41081jM;
import X.C47121t6;
import X.C65352Pkq;
import X.InterfaceC30442Bx8;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.dataChannel.LiveProNotifyBannerChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;

/* loaded from: classes6.dex */
public final class PreviewLiveProNotifyWidget extends PreviewWidget {
    public C47121t6 LJLJI;
    public C41081jM LJLJJI;
    public int LJLJJL;
    public String LJLJJLL = "";
    public boolean LJLJL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dbg;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onHide() {
        C0NA.LIZJ(C65352Pkq.LIZ(LiveProNotifyBannerChannel.class));
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        C0NA.LIZIZ(C65352Pkq.LIZ(LiveProNotifyBannerChannel.class));
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        C47121t6 c47121t6;
        int i;
        int i2;
        super.LJZL();
        hide();
        View view = getView();
        C41081jM c41081jM = null;
        if (view != null) {
            c47121t6 = (C47121t6) view.findViewById(R.id.i3_);
        } else {
            c47121t6 = null;
        }
        this.LJLJI = c47121t6;
        View view2 = getView();
        if (view2 != null) {
            c41081jM = (C41081jM) view2.findViewById(R.id.i39);
        }
        this.LJLJJI = c41081jM;
        Double LIZ = InterfaceC30442Bx8.A2.LIZ();
        if (LIZ != null) {
            i = (int) LIZ.doubleValue();
        } else {
            i = 0;
        }
        this.LJLJJL = i;
        if (C28503BGp.LIZ()) {
            View view3 = getView();
            if (view3 != null) {
                if (C28503BGp.LIZ()) {
                    i2 = R.drawable.cav;
                } else {
                    i2 = R.drawable.cmm;
                }
                view3.setBackgroundResource(i2);
            }
            ImageView imageView = (ImageView) findViewById(R.id.age);
            if (imageView != null) {
                imageView.setVisibility(0);
                C29306Beo.LJJJLL(imageView, 500L, new AqS171S0100000_5(this, 205));
            }
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.ov0(this, RoomCreateInfoChannel.class, new AqS171S0100000_5(this, 206));
            dataChannel.lv0(this, LiveModeChannel.class, new AqS171S0100000_5(this, 207));
        }
    }
}
