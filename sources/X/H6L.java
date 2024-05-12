package X;

import com.ss.android.ugc.aweme.publish.core.upload.SmartSliceModel;

/* loaded from: classes8.dex */
public final class H6L implements J3D {
    public final SmartSliceModel LIZ;

    @Override // X.J3D
    public final boolean enable() {
        return true;
    }

    @Override // X.J3D
    public final String getModelDirName() {
        String scene = this.LIZ.getScene();
        if (scene == null || scene.length() == 0) {
            return "default";
        }
        return scene;
    }

    @Override // X.J3D
    public final String getModelType() {
        if (this.LIZ.getType() == 2 || this.LIZ.getType() != 3) {
            return "tflite";
        }
        return "bytenn";
    }

    @Override // X.J3D
    public final String modelUrl() {
        return this.LIZ.getPackageUrl();
    }

    public H6L(SmartSliceModel smartSliceModel) {
        this.LIZ = smartSliceModel;
    }
}
