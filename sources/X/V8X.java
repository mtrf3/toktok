package X;

import com.facebook.imagepipeline.nativecode.NativeJpegTranscoder;

/* loaded from: classes14.dex */
public final class V8X implements InterfaceC79240V8a {
    public final int LIZ;
    public final boolean LIZIZ;

    public V8X(int i, boolean z) {
        this.LIZ = i;
        this.LIZIZ = z;
    }

    @Override // X.InterfaceC79240V8a
    public final W98 LIZ(C81828W9o c81828W9o, boolean z) {
        if (c81828W9o != C81796W8i.LIZ) {
            return null;
        }
        return new NativeJpegTranscoder(z, this.LIZ, this.LIZIZ);
    }
}
