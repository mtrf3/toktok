package X;

import com.ss.android.ttve.nativePort.NativeCallbacks;
import com.ss.android.vesdk.audio.VEAudioSample;
import java.nio.ByteBuffer;

/* renamed from: X.P5f, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63879P5f implements NativeCallbacks.IAudioCaptureCallback {
    public final /* synthetic */ P4F LIZ;

    public C63879P5f(P4F p4f) {
        this.LIZ = p4f;
    }

    @Override // com.ss.android.ttve.nativePort.NativeCallbacks.IAudioCaptureCallback
    public final void onReceive(ByteBuffer byteBuffer) {
        P4F p4f = this.LIZ;
        if (p4f != null) {
            p4f.onReceive(VEAudioSample.createByteBufferAudioSample(byteBuffer, byteBuffer.capacity()));
        }
    }
}
