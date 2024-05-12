package X;

import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.audio.VEAudioSample;

/* renamed from: X.WxR, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83969WxR implements P4F {
    public final /* synthetic */ C83968WxQ LJLIL;

    @Override // X.P4F
    public final void onError(int i, int i2, String str) {
    }

    @Override // X.P4F
    public final void onReceive(VEAudioSample vEAudioSample) {
    }

    public C83969WxR(C83968WxQ c83968WxQ) {
        this.LJLIL = c83968WxQ;
    }

    @Override // X.P4F
    public final void onInfo(int i, int i2, double d, Object obj) {
        InterfaceC83970WxS interfaceC83970WxS;
        if (i == VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_INIT) {
            InterfaceC83970WxS interfaceC83970WxS2 = this.LJLIL.LIZJ;
            if (interfaceC83970WxS2 != null) {
                interfaceC83970WxS2.LJII();
                return;
            }
            return;
        }
        if (i == VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_START) {
            InterfaceC83970WxS interfaceC83970WxS3 = this.LJLIL.LIZJ;
            if (interfaceC83970WxS3 == null) {
                return;
            }
            interfaceC83970WxS3.LJIIZILJ();
            return;
        }
        if (i != VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_STOP || (interfaceC83970WxS = this.LJLIL.LIZJ) == null) {
            return;
        }
        interfaceC83970WxS.LJIJ();
    }
}
