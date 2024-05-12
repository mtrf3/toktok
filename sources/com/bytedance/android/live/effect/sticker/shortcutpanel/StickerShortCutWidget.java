package com.bytedance.android.live.effect.sticker.shortcutpanel;

import X.C0K4;
import X.C0K5;
import X.C0TY;
import X.C0WZ;
import X.C12890ez;
import X.C15380j0;
import X.C20780ri;
import X.C221108m2;
import X.C259710f;
import X.C259910h;
import X.C29306Beo;
import X.C2BW;
import X.C30686C2o;
import X.C32041No;
import X.C38991fz;
import X.C39011g1;
import X.C44821pO;
import X.C47651tx;
import X.C48459J0d;
import X.C49531wz;
import X.C54592Ch;
import X.C62822Ol8;
import X.C76104Tts;
import X.C77412UZs;
import X.CN1;
import X.EnumC06880Ou;
import X.InterfaceC30442Bx8;
import X.InterfaceC30494Bxy;
import X.InterfaceC31961Ng;
import X.InterfaceC88472Yns;
import X.ORZ;
import X.XKX;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.api.StickerShortcutPanelChannel;
import com.bytedance.android.live.broadcast.shortcutpanel.BaseSubShortCutPanelWidget;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.LiveGoalEffectEvent;
import com.bytedance.android.live.effect.api.NewInsertStickerEvent;
import com.bytedance.android.live.effect.api.RemoveCoHostSameInsertStickerEvent;
import com.bytedance.android.live.effect.api.ScrollToInsertStickerEvent;
import com.bytedance.android.live.effect.api.ShowStickerShortCutPanelEvent;
import com.bytedance.android.live.effect.api.StickerPanelHideEvent;
import com.bytedance.android.live.effect.api.StickerPanelShowEvent;
import com.bytedance.android.live.effect.api.ToShowSpecialIconEvent;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.live.effect.sticker.shortcutpanel.StickerShortCutWidget;
import com.bytedance.android.livesdk.livesetting.performance.LiveUltimateInflateSwitchSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.IDqS443S0100000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class StickerShortCutWidget extends BaseSubShortCutPanelWidget {
    public final int LJLJJI;
    public final StickerEffectViewModel LJLJJL;
    public List<LiveEffect> LJLJJLL;
    public LiveEffect LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final LinearLayoutManager LJLJLLL;
    public C76104Tts LJLL;
    public InterfaceC30494Bxy LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public LiveEffect LJLLLL;
    public long LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public LiveEffect LJZL;
    public boolean LL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dqh;
    }

    @Override // com.bytedance.android.live.broadcast.shortcutpanel.BaseSubShortCutPanelWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final C0K5 LL() {
        Object value = this.LJLLJ.getValue();
        o.LJIIIIZZ(value, "<get-stateLayout>(...)");
        return (C0K5) value;
    }

    public final C49531wz LLF() {
        return (C49531wz) this.LJLJLJ.getValue();
    }

    public final void LLFF() {
        C0WZ kZ;
        LiveEffect liveEffect;
        InterfaceC31961Ng insertStickerManager = ((IEffectService) CN1.LIZ(IEffectService.class)).getInsertStickerManager();
        if (insertStickerManager == null || (kZ = insertStickerManager.kZ()) == null || (liveEffect = kZ.LIZ) == null) {
            return;
        }
        int indexOf = this.LJLJJLL.indexOf(liveEffect);
        if (indexOf >= 0) {
            LinearLayoutManager linearLayoutManager = this.LJLJLLL;
            Object value = this.LJLLILLLL.getValue();
            o.LJIIIIZZ(value, "<get-contentContainer>(...)");
            int width = (((View) value).getWidth() - this.LJLJJI) / 2;
            if (width < 0) {
                width = 0;
            }
            linearLayoutManager.LJFF(indexOf, width);
        }
        this.LJZ = false;
    }

    public final void LLFFF() {
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(2000L);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        Object value = this.LJLLL.getValue();
        o.LJIIIIZZ(value, "<get-loadingIcon>(...)");
        ((View) value).startAnimation(rotateAnimation);
    }

    public final void LLFII() {
        this.LJLJJL.pv0();
    }

    public static LiveEffect LJZL() {
        Boolean bool;
        List<LiveEffect> LIZ = C12890ez.LIZ().LIZ(C0TY.LIZIZ);
        o.LJIIIIZZ(LIZ, "LiveComposerManagerProvi…cker(EffectPanel.STICKER)");
        LiveEffect liveEffect = (LiveEffect) ORZ.LJLLLL(LIZ);
        if (liveEffect != null) {
            bool = Boolean.valueOf(C77412UZs.LJJ(liveEffect));
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            return (LiveEffect) DataChannelGlobal.LJLJJI.mv0(C2BW.class);
        }
        return liveEffect;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        LLF().LLJL();
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.C1;
        Boolean bool = Boolean.FALSE;
        c48459J0d.LIZ(bool);
        LLF().LJLLLLLL = false;
        C76104Tts c76104Tts = this.LJLL;
        if (c76104Tts != null) {
            c76104Tts.LIZIZ();
        }
        C32041No.LJIILIIL(SystemClock.elapsedRealtime() - this.LJLLLLLL, this.dataChannel, this.LJLJI, true, this.LJLZ);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(StickerShortcutPanelChannel.class, bool);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        DataChannel dataChannel = this.dataChannel;
        dataChannel.ov0(this, ScrollToInsertStickerEvent.class, new IDqS416S0100000(this, 87));
        dataChannel.ov0(this, ShowStickerShortCutPanelEvent.class, new C47651tx(this));
        dataChannel.ov0(this, StickerPanelShowEvent.class, new IDqS416S0100000(this, 88));
        dataChannel.ov0(this, StickerPanelHideEvent.class, new IDqS416S0100000(this, 89));
        dataChannel.ov0(this, NewInsertStickerEvent.class, new IDqS416S0100000(this, 90));
        dataChannel.ov0(this, LiveGoalEffectEvent.class, new IDqS416S0100000(this, 91));
        dataChannel.mv0(RemoveCoHostSameInsertStickerEvent.class, this, new IDqS416S0100000(this, 92));
        dataChannel.ov0(this, ToShowSpecialIconEvent.class, new IDqS416S0100000(this, 93));
        LiveIconView liveIconView = (LiveIconView) findViewById(R.id.bfj);
        if (liveIconView != null) {
            liveIconView.setCheckColorFilter(true);
            liveIconView.setIconTint(C259910h.LIZIZ(R.attr.ar8, liveIconView.getContext()));
            C29306Beo.LJJJLL(liveIconView, 500L, new IDqS416S0100000(this, 168));
        }
        LiveIconView liveIconView2 = (LiveIconView) findViewById(R.id.hbh);
        if (liveIconView2 != null) {
            liveIconView2.setCheckColorFilter(true);
            liveIconView2.setIconTint(C259910h.LIZIZ(R.attr.ar8, liveIconView2.getContext()));
            C29306Beo.LJJJLL(liveIconView2, 500L, new IDqS416S0100000(this, 169));
        }
        if (C15380j0.LJIIZILJ()) {
            findViewById(R.id.kcw).setBackgroundResource(R.drawable.cmk);
            findViewById(R.id.cwe).setBackgroundResource(R.drawable.cml);
        } else {
            findViewById(R.id.kcw).setBackgroundResource(R.drawable.cml);
            findViewById(R.id.cwe).setBackgroundResource(R.drawable.cmk);
        }
        Object value = this.LJLLILLLL.getValue();
        o.LJIIIIZZ(value, "<get-contentContainer>(...)");
        RecyclerView recyclerView = (RecyclerView) value;
        recyclerView.setAdapter(LLF());
        recyclerView.setLayoutManager(this.LJLJLLL);
        recyclerView.setItemAnimator(null);
        recyclerView.setHasFixedSize(true);
        this.LJLL = new C76104Tts(0, recyclerView, new IDqS443S0100000(this, 15));
        LLF().LLJILJIL();
        LLF().LJLJLLL = new IDqS416S0100000(this, 167);
        LL().setErrorClickListener(new C0K4() { // from class: X.1Mh
            @Override // X.C0K4
            public final void LIZIZ() {
                StickerShortCutWidget.this.LL().LJFF();
                StickerShortCutWidget.this.LLFFF();
                StickerShortCutWidget.this.LLFII();
            }
        });
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C54592Ch(this, null), 3);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        if (isShowing()) {
            C32041No.LJIILIIL(SystemClock.elapsedRealtime() - this.LJLLLLLL, this.dataChannel, "other", true, this.LJLZ);
        }
        LLF().LLJILJILJ();
        this.LL = false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        if (LiveUltimateInflateSwitchSetting.INSTANCE.getValue() && !this.LL) {
            this.LL = true;
            int i = 0;
            do {
                C20780ri.LIZLLL(R.layout.d2z, this.context);
                i++;
            } while (i < 7);
        }
        this.LJLLLLLL = SystemClock.elapsedRealtime();
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.C1;
        Boolean bool = Boolean.TRUE;
        c48459J0d.LIZ(bool);
        C76104Tts c76104Tts = this.LJLL;
        if (c76104Tts != null) {
            c76104Tts.LIZJ(true);
        }
        this.LJLLLL = LJZL();
        C49531wz LLF = LLF();
        LLF.LJLLLLLL = true;
        LiveEffect liveEffect = LLF.LJLJJLL;
        if (liveEffect != null) {
            LLF.LLIL(liveEffect);
        }
        if (LLF.LJLJL) {
            LLF.LLFZ(LLF.LJLJJL);
            LLF.LJLJJL = null;
        }
        LL().LJFF();
        LLFFF();
        LLFII();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(StickerShortcutPanelChannel.class, bool);
        }
    }

    @Override // com.bytedance.android.live.broadcast.shortcutpanel.BaseSubShortCutPanelWidget
    public final EnumC06880Ou LJLZ() {
        return EnumC06880Ou.STICKER;
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getThemeOverlay(Context context) {
        o.LJIIIZ(context, "context");
        return C259710f.LIZ.LIZJ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerShortCutWidget(InterfaceC88472Yns<? super EnumC06880Ou, Boolean> canShowMethod, InterfaceC88472Yns<? super EnumC06880Ou, Boolean> canHideMethod) {
        super(canShowMethod, canHideMethod);
        o.LJIIIZ(canShowMethod, "canShowMethod");
        o.LJIIIZ(canHideMethod, "canHideMethod");
        this.LJLJJI = C15380j0.LIZ(50.0f);
        String STICKER = C0TY.LIZIZ;
        o.LJIIIIZZ(STICKER, "STICKER");
        this.LJLJJL = (StickerEffectViewModel) new ViewModelProvider(C30686C2o.LJLIL, new C38991fz(new C39011g1(STICKER), new C44821pO())).get(StickerEffectViewModel.class);
        this.LJLJJLL = new ArrayList();
        new ArrayList();
        this.LJLJLJ = C221108m2.LIZIZ(new IDqS420S0100000(this, 63));
        getContext();
        this.LJLJLLL = new LinearLayoutManager(0, false);
        this.LJLLILLLL = C221108m2.LIZIZ(new IDqS420S0100000(this, 60));
        this.LJLLJ = C221108m2.LIZIZ(new IDqS420S0100000(this, 62));
        this.LJLLL = C221108m2.LIZIZ(new IDqS420S0100000(this, 61));
    }
}
