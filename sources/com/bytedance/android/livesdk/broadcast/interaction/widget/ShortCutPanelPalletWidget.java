package com.bytedance.android.livesdk.broadcast.interaction.widget;

import X.C0TW;
import X.C0TY;
import X.C0WF;
import X.C30355Bvj;
import X.C32537Cpp;
import X.C54542Cc;
import X.C54562Ce;
import X.ORZ;
import Y.ALAdapterS10S0200000_13;
import Y.IDTListenerS121S0100000_13;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.LiveBgDialogChannel;
import com.bytedance.android.live.broadcast.api.StickerShortcutPanelChannel;
import com.bytedance.android.live.effect.api.StickerPanelHideEvent;
import com.bytedance.android.live.effect.api.StickerPanelShowEvent;
import com.bytedance.android.live.effect.api.ToShowShortCutPanelPallet;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ShortCutPanelPalletWidget extends LiveWidget {
    public View LJLIL;
    public ViewGroup LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dqe;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, O] */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator interpolator;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            ((C32537Cpp) dataChannel.gv0(C54542Cc.class)).LIZ = Boolean.TRUE;
        }
        View view = getView();
        if (view != null && view.getVisibility() == 8) {
            return;
        }
        AqS163S0100000_13 aqS163S0100000_13 = new AqS163S0100000_13(this, 196);
        View view2 = getView();
        if (view2 != null && (animate = view2.animate()) != null && (alpha = animate.alpha(0.0f)) != null && (duration = alpha.setDuration(350L)) != null && (interpolator = duration.setInterpolator(new LinearInterpolator())) != null) {
            interpolator.setListener(new ALAdapterS10S0200000_13(aqS163S0100000_13, this, 13));
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Boolean, O] */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        if (this.LJLJI) {
            return;
        }
        C0WF LIZJ = C30355Bvj.LIZJ();
        String STICKER = C0TY.LIZIZ;
        List<LiveEffect> LIZ = LIZJ.LIZ(STICKER);
        o.LJIIIIZZ(LIZ, "getBaseComposerManager()…cker(EffectPanel.STICKER)");
        LiveEffect liveEffect = (LiveEffect) ORZ.LJLLLL(LIZ);
        C0TW c0tw = (C0TW) this.dataChannel.kv0(C54562Ce.class);
        if (c0tw != null && c0tw.LJFF(liveEffect)) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                ((C32537Cpp) dataChannel.gv0(C54542Cc.class)).LIZ = Boolean.FALSE;
            }
            super.show();
            o.LJIIIIZZ(STICKER, "STICKER");
            c0tw.LJ(null, STICKER);
            ViewGroup viewGroup = this.LJLILLLLZI;
            if (viewGroup != null) {
                c0tw.LJI(viewGroup, false);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Boolean, O] */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        View view;
        super.onCreate();
        View view2 = getView();
        ViewGroup viewGroup = null;
        if (view2 != null) {
            view = view2.findViewById(R.id.am2);
        } else {
            view = null;
        }
        this.LJLIL = view;
        View view3 = getView();
        if (view3 != null) {
            viewGroup = (ViewGroup) view3.findViewById(R.id.hhk);
        }
        this.LJLILLLLZI = viewGroup;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            ((C32537Cpp) dataChannel.gv0(C54542Cc.class)).LIZ = Boolean.TRUE;
        }
        super.hide();
        View view4 = this.LJLIL;
        if (view4 != null) {
            view4.setOnTouchListener(new IDTListenerS121S0100000_13(this, 1));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.ov0(this, StickerShortcutPanelChannel.class, new AqS179S0100000_13(this, 269));
            dataChannel2.ov0(this, StickerPanelShowEvent.class, new AqS179S0100000_13(this, 270));
            dataChannel2.ov0(this, StickerPanelHideEvent.class, new AqS179S0100000_13(this, 271));
            dataChannel2.ov0(this, LiveBgDialogChannel.class, new AqS179S0100000_13(this, 272));
            dataChannel2.ov0(this, ToShowShortCutPanelPallet.class, new AqS179S0100000_13(this, 273));
        }
    }

    public static final /* synthetic */ void LJLZ(ShortCutPanelPalletWidget shortCutPanelPalletWidget) {
        super.hide();
    }
}
