package X;

import com.ss.android.ttve.nativePort.HwFrameExtractorWrapper;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public final class P59 implements P5A {
    public final /* synthetic */ long LIZ;
    public final /* synthetic */ HwFrameExtractorWrapper LIZIZ;

    public P59(HwFrameExtractorWrapper hwFrameExtractorWrapper, long j) {
        this.LIZIZ = hwFrameExtractorWrapper;
        this.LIZ = j;
    }

    @Override // X.P5A
    public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
        return this.LIZIZ.nativeOnFrameAvailable(this.LIZ, byteBuffer, i, i2, i3);
    }
}
