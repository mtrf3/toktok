package X;

import com.ss.android.ugc.aweme.audiomode.vopclone.service.VopCloneServiceImpl;
import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.audio.VEAudioSample;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.o;

/* renamed from: X.QAv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66573QAv implements P4F {
    public final /* synthetic */ VopCloneServiceImpl LJLIL;

    @Override // X.P4F
    public final void onError(int i, int i2, String str) {
    }

    public C66573QAv(VopCloneServiceImpl vopCloneServiceImpl) {
        this.LJLIL = vopCloneServiceImpl;
    }

    @Override // X.P4F
    public final void onReceive(VEAudioSample vEAudioSample) {
        byte[] bArr;
        if (vEAudioSample == null) {
            return;
        }
        C63876P5c sampleBuffer = vEAudioSample.getSampleBuffer();
        if (sampleBuffer instanceof P5Z) {
            C63876P5c sampleBuffer2 = vEAudioSample.getSampleBuffer();
            o.LJII(sampleBuffer2, "null cannot be cast to non-null type com.ss.android.vesdk.audio.VEAudioSample.ByteArraySampleBuffer");
            bArr = ((P5Z) sampleBuffer2).LIZ;
        } else if (sampleBuffer instanceof C63874P5a) {
            C63876P5c sampleBuffer3 = vEAudioSample.getSampleBuffer();
            o.LJII(sampleBuffer3, "null cannot be cast to non-null type com.ss.android.vesdk.audio.VEAudioSample.ByteBufferSampleBuffer");
            ByteBuffer byteBuffer = ((C63874P5a) sampleBuffer3).LIZ;
            byteBuffer.limit();
            bArr = new byte[byteBuffer.remaining()];
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            byteBuffer.get(bArr);
            byteBuffer.clear();
        } else {
            bArr = null;
        }
        this.LJLIL.LJ.add(bArr);
    }

    @Override // X.P4F
    public final void onInfo(int i, int i2, double d, Object obj) {
        if (i == VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_INIT) {
            return;
        }
        if (i == VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_START) {
            VopCloneServiceImpl vopCloneServiceImpl = this.LJLIL;
            vopCloneServiceImpl.LJIIIIZZ = true;
            vopCloneServiceImpl.LJII = XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C67122kG(vopCloneServiceImpl, null), 3);
        } else {
            if (i != VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_STOP) {
                return;
            }
            this.LJLIL.LJIIIIZZ = false;
        }
    }
}
