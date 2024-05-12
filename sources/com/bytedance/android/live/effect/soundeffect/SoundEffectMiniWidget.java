package com.bytedance.android.live.effect.soundeffect;

import X.ActivityC45651qj;
import X.BZI;
import X.C08930Wr;
import X.C15380j0;
import X.C16880lQ;
import X.C28787BRn;
import X.C28K;
import X.C29306Beo;
import X.C2HE;
import X.C2HF;
import X.C37901eE;
import X.C37911eF;
import X.C37931eH;
import X.C37951eJ;
import X.C44351od;
import X.C76104Tts;
import X.C87277YNd;
import X.EnumC06880Ou;
import X.EnumC31066CHe;
import X.InterfaceC30442Bx8;
import X.InterfaceC88472Yns;
import X.RunnableC31065CHd;
import X.XKX;
import Y.IDCListenerS135S0100000;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.shortcutpanel.BaseSubShortCutPanelWidget;
import com.bytedance.android.live.effect.api.SoundEffectPanelCloseEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSlowFunctionOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSoundEffectShortcutPanelSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS443S0100000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class SoundEffectMiniWidget extends BaseSubShortCutPanelWidget {
    public SoundEffectViewModel LJLJJI;
    public C44351od LJLJJL;
    public RunnableC31065CHd LJLJJLL;
    public View LJLJL;
    public C76104Tts LJLJLJ;
    public long LJLJLLL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.d2f;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        ActivityC45651qj LIZIZ;
        long j;
        Room room;
        super.onCreate();
        Context context = this.context;
        if (context != null && (LIZIZ = C29306Beo.LIZIZ(context)) != null) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
                j = room.getId();
            } else {
                j = 0;
            }
            this.LJLJJI = (SoundEffectViewModel) ViewModelProviders.of(LIZIZ, new C37901eE(new C37931eH(j), new C37951eJ())).get(SoundEffectViewModel.class);
        }
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2HF(this, null), 3);
        View view = getView();
        if (view != null) {
            view.setEnabled(true);
        }
        if (C15380j0.LJIIZILJ()) {
            View initView$lambda$1 = findViewById(R.id.ajh);
            if (LiveSlowFunctionOptSetting.INSTANCE.inSlowFunctionOptNew()) {
                o.LJIIIIZZ(initView$lambda$1, "initView$lambda$1");
                C87277YNd.LJJIII(R.drawable.cll, initView$lambda$1);
            } else {
                initView$lambda$1.setBackgroundResource(R.drawable.cll);
            }
        } else {
            View initView$lambda$2 = findViewById(R.id.ajh);
            if (LiveSlowFunctionOptSetting.INSTANCE.inSlowFunctionOptNew()) {
                o.LJIIIIZZ(initView$lambda$2, "initView$lambda$2");
                C87277YNd.LJJIII(R.drawable.clk, initView$lambda$2);
            } else {
                initView$lambda$2.setBackgroundResource(R.drawable.clk);
            }
        }
        this.LJLJJLL = (RunnableC31065CHd) findViewById(R.id.j_m);
        this.LJLJL = findViewById(R.id.bfv);
        this.LJLJJL = new C44351od(this.dataChannel, true, this, this.LJLJJI, R.layout.d2p);
        RunnableC31065CHd runnableC31065CHd = this.LJLJJLL;
        if (runnableC31065CHd != null) {
            runnableC31065CHd.setItemAnimator(null);
            C44351od c44351od = this.LJLJJL;
            if (c44351od != null) {
                runnableC31065CHd.setAdapter(c44351od);
                runnableC31065CHd.getContext();
                runnableC31065CHd.setLayoutManager(new LinearLayoutManager(0, false));
                runnableC31065CHd.setHasFixedSize(true);
                runnableC31065CHd.LJII(new C37911eF(12.0f, 62.0f, 8.0f), -1);
                RecyclerView.RecycledViewPool LJLJL = runnableC31065CHd.LJLJL(EnumC31066CHe.EFFECT_SOUND_MINI_V1, true);
                if (LJLJL != null) {
                    LJLJL.setMaxRecycledViews(0, 7);
                }
                this.LJLJLJ = new C76104Tts(0, runnableC31065CHd, new IDqS443S0100000(this, 49));
            } else {
                o.LJIJI("soundEffectAdapter");
                throw null;
            }
        }
        Boolean LIZJ = InterfaceC30442Bx8.B1.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_SOUND_EFFECT_MINI_PANEL_SHOW.value");
        if (LIZJ.booleanValue() && LiveSoundEffectShortcutPanelSetting.INSTANCE.enable()) {
            LJZI(C28K.LJLIL);
        } else {
            LJZ("", null);
        }
        View view2 = this.LJLJL;
        if (view2 != null) {
            C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 95), view2);
        }
        this.dataChannel.lv0(this, SoundEffectPanelCloseEvent.class, new IDqS416S0100000(this, 80));
    }

    @Override // com.bytedance.android.live.broadcast.shortcutpanel.BaseSubShortCutPanelWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        if (LiveSoundEffectShortcutPanelSetting.INSTANCE.enable()) {
            InterfaceC30442Bx8.B1.LIZ(Boolean.FALSE);
        }
        C76104Tts c76104Tts = this.LJLJLJ;
        if (c76104Tts != null) {
            c76104Tts.LIZIZ();
        }
        DataChannel dataChannel = this.dataChannel;
        String closeMethod = this.LJLJI;
        o.LJIIIZ(closeMethod, "closeMethod");
        BZI LIZ = C28787BRn.LIZ("livesdk_live_sound_shortcut_panel_close");
        LIZ.LJIILLIIL(dataChannel);
        LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(C08930Wr.LIZ)) ? 1 : 0), "is_live_take_default");
        LIZ.LJIJJ(closeMethod, "close_method");
        LIZ.LJJIIJZLJL();
        C08930Wr.LIZIZ(this.LJLJLLL, this.dataChannel, true);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C08930Wr.LIZIZ(this.LJLJLLL, this.dataChannel, true);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        if (LiveSoundEffectShortcutPanelSetting.INSTANCE.enable()) {
            InterfaceC30442Bx8.B1.LIZ(Boolean.TRUE);
        }
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2HE(this, null), 3);
        C76104Tts c76104Tts = this.LJLJLJ;
        if (c76104Tts != null) {
            c76104Tts.LIZJ(true);
        }
        C08930Wr.LIZJ(this.dataChannel, true);
        this.LJLJLLL = System.currentTimeMillis();
    }

    @Override // com.bytedance.android.live.broadcast.shortcutpanel.BaseSubShortCutPanelWidget
    public final EnumC06880Ou LJLZ() {
        return EnumC06880Ou.SOUND_EFFECT;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SoundEffectMiniWidget(InterfaceC88472Yns<? super EnumC06880Ou, Boolean> canShowMethod, InterfaceC88472Yns<? super EnumC06880Ou, Boolean> canHideMethod) {
        super(canShowMethod, canHideMethod);
        o.LJIIIZ(canShowMethod, "canShowMethod");
        o.LJIIIZ(canHideMethod, "canHideMethod");
    }
}
