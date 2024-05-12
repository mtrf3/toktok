package X;

import android.content.Context;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewStickerHelper;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BxX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30467BxX implements InterfaceC30516ByK {
    public final /* synthetic */ PreviewStickerHelper LJLIL;

    public C30467BxX(PreviewStickerHelper previewStickerHelper) {
        this.LJLIL = previewStickerHelper;
    }

    @Override // X.InterfaceC30516ByK
    public final void onMessageReceived(int i, int i2, int i3, String arg3) {
        List<LiveEffect> LIZ;
        LiveEffect liveEffect;
        if (i != 32) {
            if (i != 33) {
                if (i != 67) {
                    if (i != 112) {
                        C30527ByV.LIZ(i, Integer.valueOf(i2), arg3);
                        return;
                    }
                    C30476Bxg c30476Bxg = this.LJLIL.LJLLL;
                    if (c30476Bxg == null) {
                        return;
                    }
                    c30476Bxg.LJJIJL(112, 2L, 2L, "");
                    return;
                }
                if (i2 != 1) {
                    if (i2 != 2 || (LIZ = C30355Bvj.LIZJ().LIZ(C0TY.LIZIZ)) == null || (liveEffect = (LiveEffect) ORZ.LJLLLL(LIZ)) == null) {
                        return;
                    }
                    PreviewStickerHelper previewStickerHelper = this.LJLIL;
                    InterfaceC06390Mx LIZ2 = CN1.LIZ(IEffectService.class);
                    o.LJIIIIZZ(LIZ2, "getService(T::class.java)");
                    if (((IEffectService) LIZ2).getEcEffectHelper() == null) {
                        return;
                    }
                    Context context = previewStickerHelper.LJLJI;
                    o.LJIIIIZZ(arg3, "arg3");
                    C42691lx.LJII(liveEffect, context, arg3, (Long) previewStickerHelper.LJLILLLLZI.kv0(BCN.class));
                    return;
                }
                if (i3 != 0) {
                    if (i3 != 1) {
                        return;
                    }
                    ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalEffectHelper();
                    o.LJIIIIZZ(arg3, "arg3");
                    C31691Mf.LJIIJ(arg3);
                    return;
                }
                ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalEffectHelper();
                o.LJIIIIZZ(arg3, "arg3");
                C31691Mf.LJIJJLI(arg3);
                return;
            }
            return;
        }
        C7N.LJII().showEffectTextInputDialog(this.LJLIL.LJLILLLLZI, new C0YJ(i2, i3, arg3), C30478Bxi.LJLIL);
    }
}
