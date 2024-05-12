package com.bytedance.android.livesdk.comp.impl.game.linkmic.widget;

import X.C15490jB;
import X.C16880lQ;
import X.C221108m2;
import X.C62822Ol8;
import X.CFX;
import Y.ACListenerS33S0100000_13;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.comp.api.game.linkmic.GameLinkGuestNumChannel;
import com.bytedance.android.livesdk.comp.api.game.linkmic.GameLinkMicViewSmallStyle;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class GameLinkMicStyleSwitchWidget extends LiveWidget {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 208));

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dp8;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final ImageView LJLZ() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-iconSwitch>(...)");
        return (ImageView) value;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        LJZ(true);
        C16880lQ.LJIILLIIL(LJLZ(), new ACListenerS33S0100000_13(this, 73));
        this.dataChannel.lv0(this, GameLinkGuestNumChannel.class, new AqS179S0100000_13(this, 312));
    }

    public final void LJZ(boolean z) {
        LJLZ().setSelected(z);
        if (z) {
            C15490jB.LJ(LJLZ(), CFX.LIZ("tiktok_live_link_mic", "tiktok_live_game_demand_1"), "ttlive_game_link_mic_switch2.png");
            ViewGroup.LayoutParams layoutParams = LJLZ().getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = 16;
            LJLZ().setLayoutParams(layoutParams2);
        } else {
            C15490jB.LJ(LJLZ(), CFX.LIZ("tiktok_live_link_mic", "tiktok_live_game_demand_1"), "ttlive_game_link_mic_switch1.png");
            ViewGroup.LayoutParams layoutParams3 = LJLZ().getLayoutParams();
            o.LJII(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
            layoutParams4.gravity = 48;
            LJLZ().setLayoutParams(layoutParams4);
        }
        this.dataChannel.rv0(GameLinkMicViewSmallStyle.class, Boolean.valueOf(z));
    }
}
