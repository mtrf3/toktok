package X;

import com.ss.android.ml.process.bl.MLConfigModel;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;

/* loaded from: classes9.dex */
public final class J31 extends J32 {
    @Override // X.J32
    public final boolean LIZLLL(MappedByteBuffer mappedByteBuffer, MLConfigModel mLConfigModel) {
        return false;
    }

    @Override // X.J32
    public final void LJI(ByteBuffer byteBuffer, float[][] fArr, MLConfigModel mLConfigModel) {
    }

    public J31() {
        if (C40507Fv5.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("-----TFEngine created.---TFLiteEnable: ");
            LIZ.append(false);
            X1D.LIZIZ(LIZ);
            new Throwable("not crash, only for debug!!");
        }
    }
}
