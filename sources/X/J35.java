package X;

import android.text.TextUtils;
import com.ss.android.ml.process.bl.MLConfigModel;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;

/* loaded from: classes9.dex */
public final class J35 extends J32 {
    public String LJIIIIZZ;
    public J3A LJIIIZ;

    public J35(String str) {
        if (str != null) {
            this.LJIIIIZZ = str.toLowerCase();
        }
        if (C40507Fv5.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("-----MixMLEngine created---modelType:");
            LIZ.append(this.LJIIIIZZ);
            X1D.LIZIZ(LIZ);
            new Throwable("not crash, only for debug!!");
        }
    }

    @Override // X.J32
    public final boolean LIZLLL(MappedByteBuffer mappedByteBuffer, MLConfigModel mLConfigModel) {
        String str;
        if (TextUtils.isEmpty(this.LJIIIIZZ) && (str = mLConfigModel.model_type) != null) {
            this.LJIIIIZZ = str.toLowerCase();
        }
        if (this.LJIIIZ == null) {
            if (C40507Fv5.LIZ) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(" checkInit modelType: ");
                LIZ.append(this.LJIIIIZZ);
                X1D.LIZIZ(LIZ);
            }
            C48549J3p c48549J3p = null;
            if (!TextUtils.isEmpty(this.LJIIIIZZ) && this.LJIIIIZZ.startsWith("byte")) {
                J3E j3e = J3I.LIZIZ;
                if (j3e != null) {
                    c48549J3p = j3e.LIZ();
                }
                this.LJIIIZ = c48549J3p;
                if (c48549J3p == null && C40507Fv5.LIZ) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("bytenn disabled, please config bytenn. model type: ");
                    LIZ2.append(this.LJIIIIZZ);
                    throw new RuntimeException(X1D.LIZIZ(LIZ2));
                }
            } else if (!TextUtils.isEmpty(this.LJIIIIZZ) && this.LJIIIIZZ.startsWith("tf")) {
                this.LJIIIZ = null;
                if (C40507Fv5.LIZ) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("tensorflow lite disabled, please config tensorflow lite. model type: ");
                    LIZ3.append(this.LJIIIIZZ);
                    throw new RuntimeException(X1D.LIZIZ(LIZ3));
                }
            } else if (C40507Fv5.LIZ) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("invalid model type: ");
                LIZ4.append(this.LJIIIIZZ);
                throw new RuntimeException(X1D.LIZIZ(LIZ4));
            }
        }
        J3A j3a = this.LJIIIZ;
        if (j3a != null) {
            return j3a.LIZ(mappedByteBuffer, mLConfigModel);
        }
        return false;
    }

    @Override // X.J32
    public final void LJI(ByteBuffer byteBuffer, float[][] fArr, MLConfigModel mLConfigModel) {
        J3A j3a = this.LJIIIZ;
        if (j3a != null) {
            j3a.LIZIZ(byteBuffer, fArr, mLConfigModel);
        }
    }
}
