package com.bytedance.android.livesdk.broadcast.interaction.widget.pause;

import X.BZI;
import X.C16880lQ;
import X.C28401BCr;
import X.C28787BRn;
import X.C29306Beo;
import X.C2A7;
import X.C49;
import X.C4A;
import Y.ACListenerS25S0100000_5;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.PauseLiveChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PauseLiveWidget extends LiveWidget {
    public final View LJLIL;
    public long LJLILLLLZI;
    public final C49 LJLJI;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dpo;
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
        C2A7 c2a7;
        super.onCreate();
        View view = getView();
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 92), view);
        }
        View view2 = getView();
        if (view2 != null && (c2a7 = (C2A7) view2.findViewById(R.id.avr)) != null) {
            C16880lQ.LJJIII(c2a7, new ACListenerS25S0100000_5(this, 93));
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.mv0(PauseLiveChannel.class, this, new AqS171S0100000_5(this, 162));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        C29306Beo.LJJLJLI(this.LJLIL);
    }

    public PauseLiveWidget(View backGroundView) {
        o.LJIIIZ(backGroundView, "backGroundView");
        this.LJLIL = backGroundView;
        this.LJLJI = new C49(this);
    }

    public final void LJLZ(C4A c4a) {
        boolean z;
        long elapsedRealtime;
        int i = 0;
        if (c4a == C4A.ENTER_PAGE) {
            z = true;
            this.LJLILLLLZI = SystemClock.elapsedRealtime();
            elapsedRealtime = 0;
        } else {
            z = false;
            elapsedRealtime = (SystemClock.elapsedRealtime() - this.LJLILLLLZI) / 1000;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_live_pause_page");
        LIZ.LJIILLIIL(this.dataChannel);
        String str = c4a.toString();
        Locale ENGLISH = Locale.ENGLISH;
        o.LJIIIIZZ(ENGLISH, "ENGLISH");
        String lowerCase = str.toLowerCase(ENGLISH);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        LIZ.LJIJJ(lowerCase, "action_type");
        Integer num = (Integer) this.dataChannel.kv0(C28401BCr.class);
        if (num != null) {
            i = num.intValue();
        }
        LIZ.LJIJJ(Integer.valueOf(i), "viewers_cnt");
        if (!z) {
            LIZ.LJIJJ(Long.valueOf(elapsedRealtime), "pause_duration");
        }
        LIZ.LJJIIJZLJL();
    }
}
