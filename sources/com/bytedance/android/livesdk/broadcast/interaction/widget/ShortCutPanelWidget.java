package com.bytedance.android.livesdk.broadcast.interaction.widget;

import X.C221108m2;
import X.C29137Bc5;
import X.C29306Beo;
import X.C31979Cgp;
import X.C31980Cgq;
import X.C31981Cgr;
import X.C31982Cgs;
import X.C31983Cgt;
import X.C31984Cgu;
import X.C31985Cgv;
import X.C31986Cgw;
import X.C31987Cgx;
import X.C62822Ol8;
import X.C7N;
import X.EnumC06880Ou;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.shortcutpanel.BaseSubShortCutPanelWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.mutemic.MuteMicMiniWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAudioMuteTypeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBGMSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectShortcutPanelTypeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class ShortCutPanelWidget extends LiveWidget {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C31987Cgx.LJLIL);
    public EnumC06880Ou LJLILLLLZI;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dqd;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final Map<EnumC06880Ou, BaseSubShortCutPanelWidget> LJZI() {
        return (Map) this.LJLIL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        Boolean bool;
        super.onCreate();
        enableSubWidgetManager();
        RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
        LiveWidget liveSoundEffectMiniWidget = C7N.LJII().getLiveSoundEffectMiniWidget(new C31980Cgq(this), new C31984Cgu(this));
        Map<EnumC06880Ou, BaseSubShortCutPanelWidget> LJZI = LJZI();
        EnumC06880Ou enumC06880Ou = EnumC06880Ou.SOUND_EFFECT;
        o.LJII(liveSoundEffectMiniWidget, "null cannot be cast to non-null type com.bytedance.android.live.broadcast.shortcutpanel.BaseSubShortCutPanelWidget");
        LJZI.put(enumC06880Ou, liveSoundEffectMiniWidget);
        recyclableWidgetManager.load(R.id.k7f, liveSoundEffectMiniWidget);
        Room LJJIJLIJ = C29306Beo.LJJIJLIJ(this.dataChannel);
        if (LJJIJLIJ != null) {
            bool = Boolean.valueOf(C29137Bc5.LIZIZ(LJJIJLIJ));
        } else {
            bool = null;
        }
        if (C29306Beo.LJIILLIIL(bool) && LiveAudioMuteTypeSetting.INSTANCE.canShowMuteMicPanel()) {
            RecyclableWidgetManager recyclableWidgetManager2 = this.subWidgetManager;
            MuteMicMiniWidget muteMicMiniWidget = new MuteMicMiniWidget(new C31981Cgr(this), new C31985Cgv(this));
            LJZI().put(EnumC06880Ou.MUTE_MIC, muteMicMiniWidget);
            recyclableWidgetManager2.load(R.id.gur, muteMicMiniWidget);
        }
        if (LiveEffectShortcutPanelTypeSetting.INSTANCE.getValue() != 0) {
            RecyclableWidgetManager recyclableWidgetManager3 = this.subWidgetManager;
            LiveWidget liveStickerShortCutWidget = C7N.LJII().getLiveStickerShortCutWidget(new C31982Cgs(this), new C31986Cgw(this));
            Map<EnumC06880Ou, BaseSubShortCutPanelWidget> LJZI2 = LJZI();
            EnumC06880Ou enumC06880Ou2 = EnumC06880Ou.STICKER;
            o.LJII(liveStickerShortCutWidget, "null cannot be cast to non-null type com.bytedance.android.live.broadcast.shortcutpanel.BaseSubShortCutPanelWidget");
            LJZI2.put(enumC06880Ou2, liveStickerShortCutWidget);
            recyclableWidgetManager3.load(R.id.kgq, liveStickerShortCutWidget);
        }
        if (LiveBGMSetting.INSTANCE.inLiveBGMUpgrade()) {
            RecyclableWidgetManager recyclableWidgetManager4 = this.subWidgetManager;
            LiveWidget liveBGMMiniWidget = C7N.LJII().getLiveBGMMiniWidget(new C31979Cgp(this), new C31983Cgt(this));
            Map<EnumC06880Ou, BaseSubShortCutPanelWidget> LJZI3 = LJZI();
            EnumC06880Ou enumC06880Ou3 = EnumC06880Ou.BGM_MINI;
            o.LJII(liveBGMMiniWidget, "null cannot be cast to non-null type com.bytedance.android.live.broadcast.shortcutpanel.BaseSubShortCutPanelWidget");
            LJZI3.put(enumC06880Ou3, liveBGMMiniWidget);
            recyclableWidgetManager4.load(R.id.ak1, liveBGMMiniWidget);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        LJZI().clear();
    }

    public final boolean LJLZ(EnumC06880Ou enumC06880Ou) {
        if (enumC06880Ou == this.LJLILLLLZI) {
            this.LJLILLLLZI = null;
            return true;
        }
        return false;
    }

    public final boolean LJZ(EnumC06880Ou enumC06880Ou) {
        int i;
        int value = enumC06880Ou.getValue();
        EnumC06880Ou enumC06880Ou2 = this.LJLILLLLZI;
        boolean z = false;
        if (enumC06880Ou2 != null) {
            i = enumC06880Ou2.getValue();
        } else {
            i = 0;
        }
        if (value >= i) {
            z = true;
            if (enumC06880Ou != this.LJLILLLLZI) {
                BaseSubShortCutPanelWidget baseSubShortCutPanelWidget = LJZI().get(this.LJLILLLLZI);
                if (baseSubShortCutPanelWidget != null) {
                    baseSubShortCutPanelWidget.LJLJI = "shortcut_panel_sub";
                    baseSubShortCutPanelWidget.hide();
                }
                this.LJLILLLLZI = enumC06880Ou;
            }
        }
        return z;
    }
}
