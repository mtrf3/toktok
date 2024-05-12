package com.ss.android.ugc.aweme.commercialize.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AnoleComponentBusinessAppearModel implements Serializable {

    @InterfaceC65349Pkn("animation")
    public final AnoleComponentAnimationModel animationModels;

    @InterfaceC65349Pkn("business_components")
    public final List<String> businessComponents;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnoleComponentBusinessAppearModel copy$default(AnoleComponentBusinessAppearModel anoleComponentBusinessAppearModel, List list, AnoleComponentAnimationModel anoleComponentAnimationModel, int i, Object obj) {
        if ((i & 1) != 0) {
            list = anoleComponentBusinessAppearModel.businessComponents;
        }
        if ((i & 2) != 0) {
            anoleComponentAnimationModel = anoleComponentBusinessAppearModel.animationModels;
        }
        return anoleComponentBusinessAppearModel.copy(list, anoleComponentAnimationModel);
    }

    public final AnoleComponentBusinessAppearModel copy(List<String> list, AnoleComponentAnimationModel anoleComponentAnimationModel) {
        return new AnoleComponentBusinessAppearModel(list, anoleComponentAnimationModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnoleComponentBusinessAppearModel)) {
            return false;
        }
        AnoleComponentBusinessAppearModel anoleComponentBusinessAppearModel = (AnoleComponentBusinessAppearModel) obj;
        return o.LJ(this.businessComponents, anoleComponentBusinessAppearModel.businessComponents) && o.LJ(this.animationModels, anoleComponentBusinessAppearModel.animationModels);
    }

    public int hashCode() {
        List<String> list = this.businessComponents;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        AnoleComponentAnimationModel anoleComponentAnimationModel = this.animationModels;
        return hashCode + (anoleComponentAnimationModel != null ? anoleComponentAnimationModel.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnoleComponentBusinessAppearModel(businessComponents=");
        LIZ.append(this.businessComponents);
        LIZ.append(", animationModels=");
        LIZ.append(this.animationModels);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final AnoleComponentAnimationModel getAnimationModels() {
        return this.animationModels;
    }

    public final List<String> getBusinessComponents() {
        return this.businessComponents;
    }

    public AnoleComponentBusinessAppearModel(List<String> list, AnoleComponentAnimationModel anoleComponentAnimationModel) {
        this.businessComponents = list;
        this.animationModels = anoleComponentAnimationModel;
    }
}
