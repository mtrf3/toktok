package X;

import com.bytedance.android.live.effect.api.EffectRelatedApi;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* renamed from: X.0Wk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC08860Wk implements Runnable {
    public DataChannel LJLIL;
    public C08870Wl LJLILLLLZI;
    public boolean LJLJI;

    public final void LIZ() {
        Boolean bool;
        ((EffectRelatedApi) C1A.LIZJ(EffectRelatedApi.class)).finishEffectTask(3).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.1Np
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                C0NB.LIZIZ("Effect", "finish task successful!");
            }
        }, new InterfaceC64592gB() { // from class: X.1Nq
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                C0NB.LJ("Effect", "finish task failed!");
            }
        });
        C32041No.LJIIIIZZ = true;
        BZI LIZ = C28787BRn.LIZ("live_take_sticker_effective_use");
        LIZ.LJIILLIIL(this.LJLIL);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        LIZ.LJIJJ(dataChannelGlobal.mv0(C55012Dx.class), "enter_from");
        LIZ.LJIJJ(dataChannelGlobal.mv0(C2E4.class), "banner_id");
        LIZ.LJIJJ(dataChannelGlobal.mv0(C2E5.class), "banner_from");
        LIZ.LJIIIZ("live_take");
        LIZ.LJIIL("click");
        LIZ.LJIIJJI("live_take_detail");
        LIZ.LJIJJ(Integer.valueOf(this.LJLJI ? 1 : 0), "is_new_anchor_guide");
        C32041No.LJIJJ(LIZ, this.LJLILLLLZI);
        C08870Wl c08870Wl = this.LJLILLLLZI;
        if (c08870Wl != null) {
            bool = Boolean.valueOf(c08870Wl.LJIILLIIL);
        } else {
            bool = null;
        }
        V10.LJ(bool, LIZ, "is_same_effect_scene");
        C32041No.LIZIZ(LIZ, this.LJLILLLLZI);
        C32041No.LJI(LIZ);
        LIZ.LJJIIZI();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
