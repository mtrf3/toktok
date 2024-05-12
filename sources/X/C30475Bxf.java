package X;

import com.bytedance.android.livesdk.dataChannel.StickerSelectedEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ttlivestreamer.core.effect.EffectImageInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.Bxf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30475Bxf implements InterfaceC08020Te {
    public final AbstractC30473Bxd LIZ;

    @Override // X.InterfaceC08020Te
    public final EffectImageInfo LIZJ() {
        AbstractC30473Bxd abstractC30473Bxd = this.LIZ;
        if (abstractC30473Bxd != null) {
            return abstractC30473Bxd.LIZLLL();
        }
        return null;
    }

    public C30475Bxf(AbstractC30473Bxd abstractC30473Bxd) {
        this.LIZ = abstractC30473Bxd;
    }

    @Override // X.InterfaceC08020Te
    public final void LIZ(InterfaceC30516ByK messageListener) {
        o.LJIIIZ(messageListener, "messageListener");
        AbstractC30473Bxd abstractC30473Bxd = this.LIZ;
        if (abstractC30473Bxd != null) {
            abstractC30473Bxd.LJIIIIZZ(messageListener);
        }
    }

    @Override // X.InterfaceC08020Te
    public final int LIZIZ(String str) {
        AbstractC30473Bxd abstractC30473Bxd = this.LIZ;
        if (abstractC30473Bxd != null) {
            return abstractC30473Bxd.LJII(str);
        }
        return 0;
    }

    @Override // X.InterfaceC08020Te
    public final void LIZLLL(InterfaceC30516ByK messageListener) {
        o.LJIIIZ(messageListener, "messageListener");
        AbstractC30473Bxd abstractC30473Bxd = this.LIZ;
        if (abstractC30473Bxd != null) {
            abstractC30473Bxd.LIZ(messageListener);
        }
    }

    @Override // X.InterfaceC08020Te
    public final void LJ(DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        dataChannel.qv0(StickerSelectedEvent.class, new C19680pw(null, C0TY.LIZIZ, "", false));
    }

    @Override // X.InterfaceC08020Te
    public final int setEffect(String str) {
        AbstractC30473Bxd abstractC30473Bxd = this.LIZ;
        if (abstractC30473Bxd != null) {
            return abstractC30473Bxd.LJIIJ(str);
        }
        return 0;
    }

    @Override // X.InterfaceC08020Te
    public final void LJJIJL(int i, long j, long j2, String msg) {
        o.LJIIIZ(msg, "msg");
        AbstractC30473Bxd abstractC30473Bxd = this.LIZ;
        if (abstractC30473Bxd != null) {
            abstractC30473Bxd.LJIIIZ(i, (int) j, (int) j2, msg);
        }
    }
}
