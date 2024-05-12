package com.bytedance.android.livesdk.broadcast.interaction.widget.netspeed;

import X.BCX;
import X.C15380j0;
import X.C221108m2;
import X.C30587BzT;
import X.C30856C9c;
import X.C30858C9e;
import X.C30859C9f;
import X.C30922CBq;
import X.C48189Ivh;
import X.C62822Ol8;
import X.C7MY;
import X.C9O;
import X.C9Y;
import X.C9Z;
import X.EnumC48190Ivi;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.NetworkStatus;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class NetSpeedMonitorWidget extends LiveRecyclableWidget {
    public ImageView LJLIL;
    public TextView LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public LiveMode LJLJJL;
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 123));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 124));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(C30856C9c.INSTANCE);
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 121));
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(C30859C9f.LJLIL);
    public EnumC48190Ivi LJLLI = C48189Ivh.LJ(C15380j0.LIZLLL());
    public EnumC48190Ivi LJLLILLLL = C48189Ivh.LJ(C15380j0.LIZLLL());
    public final C62822Ol8 LJLLJ = C221108m2.LIZIZ(C30858C9e.LJLIL);
    public final C9Z LJLLL = new C9Z(this);

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dp2;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public void LJLZ() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.ov0(this, NetworkStatus.class, new AqS171S0100000_5(this, 161));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C9O c9o = (C9O) this.LJLLJ.getValue();
        c9o.LIZJ(this.LJLLL);
        c9o.LIZLLL();
        ((Handler) this.LJLJLJ.getValue()).removeCallbacksAndMessages(null);
    }

    public void LJZ(int i) {
        LiveMode liveMode = this.LJLJJL;
        if (liveMode == null || C30587BzT.LIZ[liveMode.ordinal()] != 1) {
            if (this.LJLLI == EnumC48190Ivi.NONE) {
                this.LJLJI = 3;
            } else if (i != 0) {
                this.LJLJI = i;
            }
        } else {
            this.LJLJI = i;
        }
        if (C30922CBq.LIZIZ) {
            StringBuilder LJ = C7MY.LJ("networkStatusFromLiveCore=", i, ", networkStatus=");
            b1.LJ(LJ, this.LJLJI, LJ, "NetSpeedMonitorWidget");
        }
        int i2 = this.LJLJJI;
        int i3 = this.LJLJI;
        if (i2 != i3) {
            this.LJLJJI = i3;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        LiveMode liveMode;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            liveMode = (LiveMode) dataChannel.kv0(BCX.class);
        } else {
            liveMode = null;
        }
        this.LJLJJL = liveMode;
        View findViewById = findViewById(R.id.kez);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.status_icon)");
        this.LJLIL = (ImageView) findViewById;
        View findViewById2 = findViewById(R.id.kf8);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.status_tip)");
        this.LJLILLLLZI = (TextView) findViewById2;
        LJLZ();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
        }
        C9O c9o = (C9O) this.LJLLJ.getValue();
        c9o.LIZ(this.context);
        C9Z c9z = this.LJLLL;
        ((ArrayList) c9o.LIZJ).add(new WeakReference(c9z));
        ((Handler) this.LJLJLJ.getValue()).postDelayed((C9Y) this.LJLJJLL.getValue(), 3000L);
    }
}
