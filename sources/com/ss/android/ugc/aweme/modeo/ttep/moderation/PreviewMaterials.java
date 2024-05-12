package com.ss.android.ugc.aweme.modeo.ttep.moderation;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PreviewMaterials {

    @InterfaceC65349Pkn("previewMaterials")
    public final PreviewMaterialsModel materials;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PreviewMaterials) && o.LJ(this.materials, ((PreviewMaterials) obj).materials);
    }

    public final int hashCode() {
        PreviewMaterialsModel previewMaterialsModel = this.materials;
        if (previewMaterialsModel == null) {
            return 0;
        }
        return previewMaterialsModel.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PreviewMaterials(materials=");
        LIZ.append(this.materials);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public PreviewMaterials(PreviewMaterialsModel previewMaterialsModel) {
        this.materials = previewMaterialsModel;
    }
}
