package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.BZI;
import X.C0N7;
import X.C0NB;
import X.C28509BGv;
import X.C28514BHa;
import X.C28787BRn;
import X.C30868C9o;
import X.C5H3;
import X.C78996UzQ;
import X.InterfaceC30442Bx8;
import X.X1D;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.livesdk.broadcast.GameLandScapeOrientationChannel;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.dataChannel.PreviewPagerSelectedGameItem;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreviewChangeOrientationWidget extends PreviewToolBaseWidget {
    public boolean LJLJI;
    public final C5H3 LJLJJI;
    public GameTag LJLJJL;
    public final int LJLJJLL;
    public final int LJLJL;

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LLIIIILZ() {
        TextView textView;
        ImageView imageView;
        TextView textView2;
        ImageView imageView2;
        if (this.LJLJI) {
            View view = getView();
            if (view != null && (imageView2 = (ImageView) view.findViewById(R.id.nix)) != null) {
                imageView2.setImageResource(R.drawable.cea);
            }
            View view2 = getView();
            if (view2 != null && (textView2 = (TextView) view2.findViewById(R.id.nj3)) != null) {
                textView2.setText(R.string.ntz);
            }
        } else {
            View view3 = getView();
            if (view3 != null && (imageView = (ImageView) view3.findViewById(R.id.nix)) != null) {
                imageView.setImageResource(R.drawable.ceb);
            }
            View view4 = getView();
            if (view4 != null && (textView = (TextView) view4.findViewById(R.id.nj3)) != null) {
                textView.setText(R.string.nu1);
            }
        }
        InterfaceC30442Bx8.LLJJLIIIJLLLLLLLZ.LIZ(Boolean.valueOf(this.LJLJI));
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(GameLandScapeOrientationChannel.class, Boolean.valueOf(this.LJLJI));
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        String str;
        LiveMode liveMode;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.kv0(LiveModeChannel.class)) != null) {
            str = C28509BGv.LIZ(liveMode);
        } else {
            str = "";
        }
        C0N7.LIZLLL("show", "landscape_tip_button", this.dataChannel, str);
    }

    public PreviewChangeOrientationWidget() {
        boolean booleanValue;
        Boolean LIZJ = InterfaceC30442Bx8.LLJJLIIIJLLLLLLLZ.LIZJ();
        if (LIZJ == null) {
            booleanValue = false;
        } else {
            booleanValue = LIZJ.booleanValue();
        }
        this.LJLJI = booleanValue;
        this.LJLJJI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 133));
        this.LJLJJLL = R.string.nty;
        this.LJLJL = R.drawable.cea;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        super.LJZL();
        LLIIIILZ();
        this.LJLJJL = C28514BHa.LIZIZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCreate() selectGameTag = ");
        LIZ.append(this.LJLJJL);
        C0NB.LJIIIZ("PreviewChangeOrientationWidget", X1D.LIZIZ(LIZ));
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.ov0(this, PreviewPagerSelectedGameItem.class, new AqS171S0100000_5(this, 171));
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int LLFFF() {
        return this.LJLJL;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int LLFII() {
        return this.LJLJJLL;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final void onClick(View view) {
        int i;
        GameTag gameTag;
        int i2;
        o.LJIIIZ(view, "view");
        if (!((Boolean) this.LJLJJI.getValue()).booleanValue() || (gameTag = this.LJLJJL) == null || (i2 = gameTag.landscape) == 0) {
            boolean z = !this.LJLJI;
            this.LJLJI = z;
            LLIIIJ(z, true);
            LLIIIILZ();
            if (this.LJLJI) {
                i = R.string.lff;
            } else {
                i = R.string.lfo;
            }
            C30868C9o.LIZJ(i);
            return;
        }
        Integer valueOf = Integer.valueOf(i2);
        if (valueOf == null) {
            return;
        }
        if (valueOf.intValue() == 1) {
            C30868C9o.LIZJ(R.string.lfg);
        } else {
            if (valueOf.intValue() != 2) {
                return;
            }
            C30868C9o.LIZJ(R.string.lfp);
        }
    }

    public final void LLIIIJ(boolean z, boolean z2) {
        String str;
        String str2;
        String str3;
        LiveMode liveMode;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.kv0(LiveModeChannel.class)) != null) {
            str = C28509BGv.LIZ(liveMode);
        } else {
            str = "";
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_live_takepage_orientation_click");
        LIZ.LJIILLIIL(this.dataChannel);
        LIZ.LJIJJ(str, "live_type");
        if (z) {
            str2 = "landscape";
        } else {
            str2 = "portrait";
        }
        LIZ.LJIJJ(str2, "action_result");
        if (z2) {
            str3 = "click";
        } else {
            str3 = "auto";
        }
        LIZ.LJIJJ(str3, "action_type");
        LIZ.LJJIIJZLJL();
    }
}
