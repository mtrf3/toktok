package com.bytedance.android.livesdk.broadcast.preview;

import X.ActivityC45651qj;
import X.C0NB;
import X.C15380j0;
import X.C16880lQ;
import X.C221108m2;
import X.C28956BYa;
import X.C29053Baj;
import X.C29180Bcm;
import X.C29218BdO;
import X.C29306Beo;
import X.C30868C9o;
import X.C62822Ol8;
import X.C78920UyC;
import X.C7N;
import X.EnumC38440F6u;
import X.X1D;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.dataChannel.LiveCastStateChannel;
import com.bytedance.android.livesdk.livesetting.game.GameMirrorCastEnableSetting;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreviewCastWidget extends PreviewToolBaseWidget {
    public static final /* synthetic */ int LJLJL = 0;
    public final int LJLJI = R.string.le1;
    public final int LJLJJI = R.drawable.cu0;
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 129));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 130));

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        boolean z;
        boolean z2;
        C29180Bcm c29180Bcm = (C29180Bcm) DataChannelGlobal.LJLJJI.mv0(C29053Baj.class);
        if (c29180Bcm != null) {
            z = c29180Bcm.LJLJJI;
        } else {
            z = false;
        }
        if (z && GameMirrorCastEnableSetting.INSTANCE.getValue()) {
            super.show();
            DataChannel dataChannel = this.dataChannel;
            View view = (View) this.LJLJJL.getValue();
            if (view != null && view.isSelected()) {
                z2 = true;
            } else {
                z2 = false;
            }
            C28956BYa.LIZ(dataChannel, "live_take_page_mobile", false, z2);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(true);
        LIZ.append(", ");
        LIZ.append(z);
        LIZ.append(", ");
        LIZ.append(GameMirrorCastEnableSetting.INSTANCE.getValue());
        C0NB.LIZIZ("PreviewCastWidget", X1D.LIZIZ(LIZ));
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        super.LJZL();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.nv0(this, this, LiveCastStateChannel.class, new AqS171S0100000_5(this, 163));
        LLIIIILZ(o.LJ(dataChannelGlobal.mv0(LiveCastStateChannel.class), Boolean.TRUE));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.getClass();
        dataChannelGlobal.jv0(this);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int LLFFF() {
        return this.LJLJJI;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int LLFII() {
        return this.LJLJI;
    }

    public final void LLIIIILZ(boolean z) {
        int i;
        View view = (View) this.LJLJJL.getValue();
        if (view != null && view.isSelected() == z) {
            return;
        }
        ImageView imageView = (ImageView) this.LJLJJL.getValue();
        if (imageView != null) {
            imageView.setSelected(z);
        }
        TextView textView = (TextView) this.LJLJJLL.getValue();
        if (textView == null) {
            return;
        }
        if (z) {
            i = R.string.lef;
        } else {
            i = this.LJLJI;
        }
        textView.setText(C15380j0.LJIILJJIL(i));
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final void onClick(View view) {
        ActivityC45651qj LIZIZ;
        o.LJIIIZ(view, "view");
        EnumC38440F6u enumC38440F6u = EnumC38440F6u.CAST;
        boolean z = false;
        if (!LiveAppBundleUtils.isPluginAvailable(enumC38440F6u)) {
            LiveAppBundleUtils.ensurePluginAvailable$default(enumC38440F6u, new C29218BdO(), false, 4, null);
            C30868C9o.LIZJ(R.string.nnu);
        } else {
            C78920UyC.LJI("livesdk_screencasting_livestudio_btn_click_plugin_result", "PluginInstalled", "result_type");
            Context context = this.context;
            if (context != null && (LIZIZ = C29306Beo.LIZIZ(context)) != null) {
                Intent createStartBroadcastIntent = C7N.LJIIJJI().createStartBroadcastIntent(LIZIZ, 4);
                Bundle bundle = new Bundle();
                bundle.putString("screen_cast_type_from", "live_take_page_screen_share");
                createStartBroadcastIntent.putExtras(bundle);
                C16880lQ.LIZJ(this.context, createStartBroadcastIntent);
            }
        }
        DataChannel dataChannel = this.dataChannel;
        View view2 = (View) this.LJLJJL.getValue();
        if (view2 != null && view2.isSelected()) {
            z = true;
        }
        C28956BYa.LIZ(dataChannel, "live_take_page_mobile", true, z);
    }
}
