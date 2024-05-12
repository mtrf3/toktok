package X;

import com.bytedance.android.livesdk.dataChannel.StickerSelectedEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ttlivestreamer.core.effect.EffectImageInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.Bxg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30476Bxg implements InterfaceC08020Te {
    public final InterfaceC30359Bvn LIZ;

    @Override // X.InterfaceC08020Te
    public final int LIZIZ(String str) {
        return 0;
    }

    @Override // X.InterfaceC08020Te
    public final EffectImageInfo LIZJ() {
        return null;
    }

    @Override // X.InterfaceC08020Te
    public final int setEffect(String str) {
        return 0;
    }

    public C30476Bxg(InterfaceC30359Bvn interfaceC30359Bvn) {
        this.LIZ = interfaceC30359Bvn;
    }

    @Override // X.InterfaceC08020Te
    public final void LIZ(InterfaceC30516ByK messageListener) {
        o.LJIIIZ(messageListener, "messageListener");
        this.LIZ.LJIIJJI(messageListener);
    }

    @Override // X.InterfaceC08020Te
    public final void LIZLLL(InterfaceC30516ByK messageListener) {
        o.LJIIIZ(messageListener, "messageListener");
        this.LIZ.LJIILJJIL(messageListener);
    }

    @Override // X.InterfaceC08020Te
    public final void LJ(DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        dataChannel.qv0(StickerSelectedEvent.class, new C19680pw(null, C0TY.LIZIZ, "", false));
    }

    @Override // X.InterfaceC08020Te
    public final void LJJIJL(int i, long j, long j2, String msg) {
        o.LJIIIZ(msg, "msg");
        this.LIZ.LJJIJL(i, j, j2, msg);
    }
}
