package X;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.audio.VEAudioSample;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WYa, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82464WYa implements P4F {
    public boolean LJLIL;
    public C82492WZc LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ WYR LJLJJI;

    public C82464WYa(WYR wyr) {
        this.LJLJJI = wyr;
    }

    @Override // X.P4F
    public final void onReceive(VEAudioSample vEAudioSample) {
        byte[] bArr;
        C82492WZc c82492WZc;
        StringBuilder sb;
        List<Byte> subList;
        if (vEAudioSample == null) {
            return;
        }
        if (vEAudioSample.getSampleBuffer() instanceof P5Z) {
            C63876P5c sampleBuffer = vEAudioSample.getSampleBuffer();
            o.LJII(sampleBuffer, "null cannot be cast to non-null type com.ss.android.vesdk.audio.VEAudioSample.ByteArraySampleBuffer");
            bArr = ((P5Z) sampleBuffer).LIZ;
            if (bArr == null) {
                return;
            }
        } else {
            if (!(vEAudioSample.getSampleBuffer() instanceof C63874P5a)) {
                return;
            }
            C63876P5c sampleBuffer2 = vEAudioSample.getSampleBuffer();
            o.LJII(sampleBuffer2, "null cannot be cast to non-null type com.ss.android.vesdk.audio.VEAudioSample.ByteBufferSampleBuffer");
            ByteBuffer byteBuffer = ((C63874P5a) sampleBuffer2).LIZ;
            byteBuffer.limit();
            bArr = new byte[byteBuffer.remaining()];
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            byteBuffer.get(bArr);
            byteBuffer.clear();
        }
        int i = this.LJLJI;
        this.LJLJI = i + 1;
        if (i % 60 == 0) {
            vEAudioSample.getByteSize();
            int i2 = 6;
            if (vEAudioSample.getSampleBuffer() instanceof P5Z) {
                sb = new StringBuilder("(ByteArray): ");
                C61897OQz c61897OQz = new C61897OQz(bArr);
                if (c61897OQz.LIZJ() <= 6) {
                    i2 = c61897OQz.LIZJ() - 1;
                }
                subList = c61897OQz.subList(0, i2);
            } else if (vEAudioSample.getSampleBuffer() instanceof C63874P5a) {
                sb = new StringBuilder("(ByteBuffer): ");
                C61897OQz c61897OQz2 = new C61897OQz(bArr);
                if (c61897OQz2.LIZJ() <= 6) {
                    if (c61897OQz2.LIZJ() > 0) {
                        i2 = c61897OQz2.LIZJ() - 1;
                    } else {
                        i2 = 0;
                    }
                }
                subList = c61897OQz2.subList(0, i2);
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("VEAudioSample = ");
                LIZ.append(vEAudioSample);
                X1D.LIZIZ(LIZ);
            }
            sb.append(subList);
        }
        if (this.LJLIL && C78685UuP.LJJJZ(OUP.LJJJLZIJ(this.LJLJJI.LJJLIIIJILLIZJL().KK())) && (c82492WZc = this.LJLILLLLZI) != null) {
            c82492WZc.LJI(3, bArr);
        }
    }

    @Override // X.P4F
    public final void onError(int i, int i2, String str) {
        C145995oB LIZIZ = GFJ.LIZIZ(3, "calling_event_index");
        LIZIZ.LJI("error_code", String.valueOf(i2 + LiveNetAdaptiveHurryTimeSetting.DEFAULT));
        LIZIZ.LJI("error_msg", "mic_failed");
        StringBuilder LIZ = X1D.LIZ();
        C1EU.LIZJ(LIZ, "errType=", i, ", ret=", i2);
        LIZ.append(", msg=");
        LIZ.append(str);
        LIZIZ.LJI("net_error_msg", X1D.LIZIZ(LIZ));
        LIZIZ.LJI("debug_vc_scene", "shoot_vc");
        FMX.LJIIL("audio_vc_stream_event", LIZIZ.LIZ);
    }

    @Override // X.P4F
    public final void onInfo(int i, int i2, double d, Object obj) {
        if (i == VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_INIT) {
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.vesdk.VEAudioCaptureSettings");
        } else if (i == VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_START) {
            this.LJLIL = true;
        } else {
            if (i != VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_STOP) {
                return;
            }
            this.LJLIL = false;
        }
    }
}
