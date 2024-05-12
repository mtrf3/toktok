package X;

import com.ss.android.ml.process.bl.MLConfigModel;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;

/* loaded from: classes9.dex */
public final class J36 extends J32 {
    public J3A LJIIIIZZ;

    public J36() {
        if (C40507Fv5.LIZ) {
            new Throwable("not crash, only for debug!!");
        }
    }

    @Override // X.J32
    public final boolean LIZLLL(MappedByteBuffer mappedByteBuffer, MLConfigModel mLConfigModel) {
        C48549J3p c48549J3p;
        J3E j3e = J3I.LIZIZ;
        if (j3e != null) {
            c48549J3p = j3e.LIZ();
        } else {
            c48549J3p = null;
        }
        this.LJIIIIZZ = c48549J3p;
        if (c48549J3p != null) {
            return c48549J3p.LIZ(mappedByteBuffer, mLConfigModel);
        }
        return false;
    }

    @Override // X.J32
    public final void LJI(ByteBuffer byteBuffer, float[][] fArr, MLConfigModel mLConfigModel) {
        J3A j3a = this.LJIIIIZZ;
        if (j3a != null) {
            j3a.LIZIZ(byteBuffer, fArr, mLConfigModel);
        }
    }
}
