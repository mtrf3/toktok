package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.setting.model.MLModel;

/* renamed from: X.Ikm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47512Ikm implements J3D {
    public final MLModel LIZ;

    @Override // X.J3D
    public final boolean enable() {
        if (this.LIZ != null) {
            return true;
        }
        return false;
    }

    @Override // X.J3D
    public final String getModelDirName() {
        MLModel mLModel = this.LIZ;
        if (mLModel == null || TextUtils.isEmpty(mLModel.scene)) {
            return "default";
        }
        return this.LIZ.scene;
    }

    @Override // X.J3D
    public final String getModelType() {
        MLModel mLModel = this.LIZ;
        if (mLModel == null) {
            return "";
        }
        int i = mLModel.type;
        if (i == 2 || i != 3) {
            return "tflite";
        }
        return "bytenn";
    }

    @Override // X.J3D
    public final String modelUrl() {
        MLModel mLModel = this.LIZ;
        if (mLModel == null) {
            return "";
        }
        return mLModel.packageUrl;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AppMLModelConfig{model=");
        LIZ.append(this.LIZ);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public C47512Ikm(MLModel mLModel) {
        this.LIZ = mLModel;
    }
}
