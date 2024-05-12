package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewStickerHelper;
import com.bytedance.android.livesdk.dataChannel.BeforeStickerSelectedEvent;
import com.bytedance.android.livesdk.dataChannel.StickerCancelChannel;
import com.bytedance.android.livesdk.dataChannel.StickerDialogShowChannel;
import com.bytedance.android.livesdk.model.LiveEffectAutoRestoreConfig;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.BxV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30465BxV implements InterfaceC30494Bxy {
    public final /* synthetic */ PreviewStickerHelper LIZ;

    @Override // X.InterfaceC30494Bxy
    public final void onDestroy() {
        C0TW c0tw = this.LIZ.LJLLJ;
        if (c0tw != null) {
            c0tw.onDestroy();
        }
    }

    public C30465BxV(PreviewStickerHelper previewStickerHelper) {
        this.LIZ = previewStickerHelper;
        InterfaceC06390Mx LIZ = CN1.LIZ(IEffectService.class);
        o.LJIIIIZZ(LIZ, "getService(T::class.java)");
        if (((IEffectService) LIZ).getEcEffectHelper() != null) {
            C42691lx.LIZJ = new WeakReference<>(this);
        }
        ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalEffectHelper();
        if (!C31691Mf.LIZLLL()) {
            InterfaceC06390Mx LIZ2 = CN1.LIZ(IEffectService.class);
            o.LJIIIIZZ(LIZ2, "getService(T::class.java)");
            C1MY ecEffectHelper = ((IEffectService) LIZ2).getEcEffectHelper();
            if (ecEffectHelper != null) {
                C42691lx c42691lx = (C42691lx) ecEffectHelper;
                LiveEffectAutoRestoreConfig LIZJ = InterfaceC30442Bx8.f0.LIZJ();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("tryInitEffectWhenEnteringPreview currentSticker = ");
                LIZ3.append(LIZJ);
                C0NB.LIZIZ("LiveEcEffectHelper", X1D.LIZIZ(LIZ3));
                if (C29306Beo.LJIJJLI(LIZJ.resourceId)) {
                    c42691lx.LJ(LIZJ.effectPanel, LIZJ.resourceId, LIZJ.categoryKey, new IDqS416S0100000(LIZJ, 205));
                }
            }
        }
    }

    @Override // X.InterfaceC30494Bxy
    public final void LIZ(String panel) {
        o.LJIIIZ(panel, "panel");
        PreviewStickerHelper previewStickerHelper = this.LIZ;
        InterfaceC30359Bvn interfaceC30359Bvn = previewStickerHelper.LJLJJLL;
        C0TW c0tw = previewStickerHelper.LJLLJ;
        if (c0tw != null) {
            c0tw.LIZ(panel);
        }
        interfaceC30359Bvn.LIZ(panel);
        C0NA.LIZJ(C65352Pkq.LIZ(StickerDialogShowChannel.class));
    }

    @Override // X.InterfaceC30494Bxy
    public final void LIZIZ(LiveEffect liveEffect) {
        o.LJIIIZ(liveEffect, "liveEffect");
        this.LIZ.LIZJ(liveEffect);
        this.LIZ.LJLJLJ = null;
    }

    @Override // X.InterfaceC30494Bxy
    public final void LIZJ(String panel) {
        o.LJIIIZ(panel, "panel");
        PreviewStickerHelper previewStickerHelper = this.LIZ;
        InterfaceC30359Bvn interfaceC30359Bvn = previewStickerHelper.LJLJJLL;
        C0TW c0tw = previewStickerHelper.LJLLJ;
        if (c0tw != null) {
            c0tw.LJ(null, panel);
        }
        interfaceC30359Bvn.LIZJ(panel);
        C0NA.LIZIZ(C65352Pkq.LIZ(StickerDialogShowChannel.class));
    }

    @Override // X.InterfaceC30494Bxy
    public final void LIZLLL(LiveEffect liveEffect) {
        o.LJIIIZ(liveEffect, "liveEffect");
        PreviewStickerHelper previewStickerHelper = this.LIZ;
        previewStickerHelper.LJLILLLLZI.qv0(BeforeStickerSelectedEvent.class, new C19680pw(liveEffect, C0TY.LIZIZ, previewStickerHelper.LJLLLL, false));
    }

    @Override // X.InterfaceC30494Bxy
    public final void LJ(ViewGroup parentView) {
        o.LJIIIZ(parentView, "parentView");
        C0TW c0tw = this.LIZ.LJLLJ;
        if (c0tw != null) {
            c0tw.LJI(parentView, false);
        }
    }

    @Override // X.InterfaceC30494Bxy
    public final void LJFF(LiveEffect faceLiveEffect) {
        Boolean bool;
        C0TW c0tw;
        o.LJIIIZ(faceLiveEffect, "faceLiveEffect");
        PreviewStickerHelper previewStickerHelper = this.LIZ;
        InterfaceC30359Bvn interfaceC30359Bvn = previewStickerHelper.LJLJJLL;
        String str = C0TY.LIZIZ;
        interfaceC30359Bvn.LJIILL(faceLiveEffect, str);
        C30355Bvj.LIZJ().LIZLLL(str);
        C0TW c0tw2 = previewStickerHelper.LJLLJ;
        if (c0tw2 != null) {
            bool = Boolean.valueOf(c0tw2.LJFF(faceLiveEffect));
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool) && (c0tw = previewStickerHelper.LJLLJ) != null) {
            c0tw.LIZLLL();
        }
        View view = previewStickerHelper.LJLJJL;
        if (view != null) {
            C29306Beo.LJJLJLI(view);
        }
        B4U.LIZ().LJJII("sticker");
        previewStickerHelper.LJLILLLLZI.qv0(StickerCancelChannel.class, faceLiveEffect);
        C31014CFe.LJFF("");
        C31014CFe.LJI("");
    }

    @Override // X.InterfaceC30494Bxy
    public final int LJI(String key, String imagePath) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(imagePath, "imagePath");
        int LLIIIJ = this.LIZ.LJLJJLL.LLIIIJ(key, imagePath);
        C0WF LIZJ = C30355Bvj.LIZJ();
        LIZJ.LJIJJLI(key);
        LIZJ.LIZJ(imagePath);
        return LLIIIJ;
    }

    @Override // X.InterfaceC30494Bxy
    public final void LJII(String str, String str2) {
        this.LIZ.LJLLLL = str;
        BZI LIZ = C28787BRn.LIZ("livesdk_pm_live_sticker_tab_change");
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        LIZ.LJIJJ(dataChannelGlobal.mv0(C55012Dx.class), "enter_from");
        LIZ.LJIJJ(dataChannelGlobal.mv0(C2E4.class), "banner_id");
        LIZ.LJIJJ(dataChannelGlobal.mv0(C2E5.class), "banner_from");
        J9A.LIZJ(LIZ, this.LIZ.LJLILLLLZI, str2, "tab");
    }
}
