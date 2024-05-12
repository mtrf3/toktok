package X;

import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ttlivestreamer.core.effect.EffectImageInfo;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TfV, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75213TfV implements InterfaceC08020Te {
    public final InterfaceC75217TfZ LIZ;

    @Override // X.InterfaceC08020Te
    public final EffectImageInfo LIZJ() {
        InterfaceC75217TfZ interfaceC75217TfZ = this.LIZ;
        if (interfaceC75217TfZ != null) {
            return interfaceC75217TfZ.LIZJ();
        }
        return null;
    }

    public C75213TfV(InterfaceC75217TfZ interfaceC75217TfZ) {
        this.LIZ = interfaceC75217TfZ;
    }

    @Override // X.InterfaceC08020Te
    public final void LIZ(InterfaceC30516ByK messageListener) {
        o.LJIIIZ(messageListener, "messageListener");
        InterfaceC75217TfZ interfaceC75217TfZ = this.LIZ;
        if (interfaceC75217TfZ != null) {
            interfaceC75217TfZ.LIZ(messageListener);
        }
    }

    @Override // X.InterfaceC08020Te
    public final int LIZIZ(String str) {
        InterfaceC75217TfZ interfaceC75217TfZ = this.LIZ;
        if (interfaceC75217TfZ != null) {
            return interfaceC75217TfZ.LIZIZ(str);
        }
        return 0;
    }

    @Override // X.InterfaceC08020Te
    public final void LIZLLL(InterfaceC30516ByK messageListener) {
        o.LJIIIZ(messageListener, "messageListener");
        InterfaceC75217TfZ interfaceC75217TfZ = this.LIZ;
        if (interfaceC75217TfZ != null) {
            interfaceC75217TfZ.LIZLLL(messageListener);
        }
    }

    @Override // X.InterfaceC08020Te
    public final void LJ(DataChannel dataChannel) {
        C0WU liveMultiGuestStickerLogManager;
        o.LJIIIZ(dataChannel, "dataChannel");
        InterfaceC06390Mx LIZ = CN1.LIZ(IEffectService.class);
        o.LJIIIIZZ(LIZ, "getService(T::class.java)");
        IEffectService iEffectService = (IEffectService) LIZ;
        List<LiveEffect> LIZ2 = iEffectService.baseComposerManager().LIZ(C0TY.LIZJ);
        o.LJIIIIZZ(LIZ2, "baseComposerManager().ge…ctPanel.STICKER_INTERACT)");
        LiveEffect liveEffect = (LiveEffect) ORZ.LJLLLL(LIZ2);
        if (liveEffect != null && (liveMultiGuestStickerLogManager = iEffectService.getLiveMultiGuestStickerLogManager()) != null) {
            liveMultiGuestStickerLogManager.LIZ(liveEffect, dataChannel, 0, false);
        }
    }

    @Override // X.InterfaceC08020Te
    public final int setEffect(String str) {
        InterfaceC75217TfZ interfaceC75217TfZ = this.LIZ;
        if (interfaceC75217TfZ != null) {
            return interfaceC75217TfZ.setEffect(str);
        }
        return 0;
    }

    @Override // X.InterfaceC08020Te
    public final void LJJIJL(int i, long j, long j2, String msg) {
        o.LJIIIZ(msg, "msg");
        InterfaceC75217TfZ interfaceC75217TfZ = this.LIZ;
        if (interfaceC75217TfZ != null) {
            interfaceC75217TfZ.LJJIJL(i, j, j2, msg);
        }
    }
}
