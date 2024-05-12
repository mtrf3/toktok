package X;

import com.ss.android.ugc.aweme.property.SmartCompileBaseModel;

/* renamed from: X.Hem, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44592Hem implements J3D {
    public final SmartCompileBaseModel LIZ;

    @Override // X.J3D
    public final boolean enable() {
        return true;
    }

    @Override // X.J3D
    public final String getModelDirName() {
        String str = this.LIZ.scene;
        if (str.length() == 0) {
            return "default";
        }
        return str;
    }

    @Override // X.J3D
    public final String getModelType() {
        if (this.LIZ.type == 3) {
            return "bytenn";
        }
        return "tflite";
    }

    @Override // X.J3D
    public final String modelUrl() {
        return this.LIZ.packageUrl;
    }

    public C44592Hem(SmartCompileBaseModel smartCompileBaseModel) {
        this.LIZ = smartCompileBaseModel;
    }
}
