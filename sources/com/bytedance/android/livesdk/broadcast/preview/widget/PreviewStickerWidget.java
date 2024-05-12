package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.BZI;
import X.C09;
import X.C0WZ;
import X.C28787BRn;
import X.C2E4;
import X.C2E5;
import X.C30355Bvj;
import X.C30496By0;
import X.C30770C5u;
import X.C55012Dx;
import X.C7N;
import X.C87277YNd;
import X.CN1;
import X.InterfaceC30359Bvn;
import X.InterfaceC30442Bx8;
import X.InterfaceC31781Cdd;
import X.InterfaceC31961Ng;
import X.UHR;
import X.V10;
import X.WM7;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.api.EffectRedDotStatusChangeEvent;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.broadcast.PreviewHideKeyboardEvent;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectDowngradeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.HideEffectEntrySetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreviewStickerWidget extends PreviewToolBaseWidget {
    public PreviewStickerHelper LJLJI;
    public FrameLayout LJLJJI;
    public final int LJLJJL = R.string.mgc;
    public final int LJLJJLL = R.drawable.cz4;

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        Fragment fragment;
        ImageView imageView;
        super.LJZL();
        InterfaceC31781Cdd interfaceC31781Cdd = this.widgetCallback;
        if (interfaceC31781Cdd != null && (fragment = interfaceC31781Cdd.getFragment()) != null) {
            FrameLayout frameLayout = this.LJLJJI;
            if (frameLayout == null) {
                return;
            }
            DataChannel dataChannel = this.dataChannel;
            o.LJIIIIZZ(dataChannel, "dataChannel");
            Context context = this.context;
            o.LJIIIIZZ(context, "context");
            View view = getView();
            if (view != null) {
                imageView = (ImageView) view.findViewById(R.id.nix);
            } else {
                imageView = null;
            }
            InterfaceC30359Bvn LJIILIIL = C87277YNd.LJIILIIL(this.dataChannel);
            if (LJIILIIL == null) {
                return;
            } else {
                this.LJLJI = new PreviewStickerHelper(fragment, frameLayout, dataChannel, context, imageView, LJIILIIL, this, new AqS171S0100000_5(this, 189));
            }
        }
        if (HideEffectEntrySetting.INSTANCE.shouldHide() || LiveEffectDowngradeSetting.INSTANCE.remove()) {
            hide();
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        if (!HideEffectEntrySetting.INSTANCE.shouldHide() && !LiveEffectDowngradeSetting.INSTANCE.remove()) {
            super.show();
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int LLFFF() {
        return this.LJLJJLL;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int LLFII() {
        return this.LJLJJL;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final void onClick(View view) {
        int i;
        C0WZ kZ;
        o.LJIIIZ(view, "view");
        C30770C5u.LIZIZ(C09.GUIDE_ENHANCE);
        PreviewStickerHelper previewStickerHelper = this.LJLJI;
        if (previewStickerHelper != null) {
            C30355Bvj.LJFF();
            DataChannel dataChannel = previewStickerHelper.LJLILLLLZI;
            InterfaceC30442Bx8.y.LIZ(Boolean.FALSE);
            if (dataChannel != null) {
                dataChannel.pv0(EffectRedDotStatusChangeEvent.class);
            }
            if (!UHR.LIZ) {
                InterfaceC31961Ng insertStickerManager = C7N.LJII().getInsertStickerManager();
                Boolean bool = null;
                if (insertStickerManager != null && (kZ = insertStickerManager.kZ()) != null && kZ.LIZ != null) {
                    previewStickerHelper.LIZIZ();
                }
                previewStickerHelper.LJLILLLLZI.pv0(PreviewHideKeyboardEvent.class);
                C7N.LJII().showStickerPanel(previewStickerHelper.LJLJI, previewStickerHelper.LJLILLLLZI, false, previewStickerHelper.LJLZ, false, false);
                BZI LIZ = C28787BRn.LIZ("pm_live_sticker_click");
                LIZ.LJIILLIIL(previewStickerHelper.LJLILLLLZI);
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
                LIZ.LJIJJ(dataChannelGlobal.mv0(C55012Dx.class), "enter_from");
                LIZ.LJIJJ(dataChannelGlobal.mv0(C2E4.class), "banner_id");
                LIZ.LJIJJ(dataChannelGlobal.mv0(C2E5.class), "banner_from");
                int i2 = 0;
                if (previewStickerHelper.LJLJLJ != null) {
                    i = 1;
                } else {
                    i = 0;
                }
                LIZ.LJIJJ(Integer.valueOf(i), "is_special_icon");
                if (previewStickerHelper.LJLJLJ != null && previewStickerHelper.LJLLILLLL) {
                    i2 = 1;
                }
                LIZ.LJIJJ(Integer.valueOf(i2), "is_animation");
                LIZ.LJIJJ(((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getBroadcastScene(), WM7.SCENE_SERVICE);
                LiveEffect liveEffect = previewStickerHelper.LJLJLJ;
                if (liveEffect != null) {
                    C30496By0 c30496By0 = liveEffect.logParams;
                    if (c30496By0 != null) {
                        bool = Boolean.valueOf(c30496By0.LIZLLL);
                    }
                    V10.LJ(bool, LIZ, "is_rec_pin");
                }
                LIZ.LJJIIJZLJL();
            }
        }
        PreviewStickerHelper previewStickerHelper2 = this.LJLJI;
        if (previewStickerHelper2 != null) {
            previewStickerHelper2.LIZ();
        }
        ((IUserManageService) CN1.LIZ(IUserManageService.class)).Ye0(0L, this.dataChannel, 7);
    }
}
