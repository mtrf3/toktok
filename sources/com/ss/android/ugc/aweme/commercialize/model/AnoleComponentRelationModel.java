package com.ss.android.ugc.aweme.commercialize.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AnoleComponentRelationModel implements Serializable {

    @InterfaceC65349Pkn("dependencies")
    public final List<String> dependencies;

    @InterfaceC65349Pkn("hide")
    public final List<AnoleComponentAppearModel> hideModels;

    @InterfaceC65349Pkn("show")
    public final List<AnoleComponentAppearModel> showModels;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnoleComponentRelationModel copy$default(AnoleComponentRelationModel anoleComponentRelationModel, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = anoleComponentRelationModel.showModels;
        }
        if ((i & 2) != 0) {
            list2 = anoleComponentRelationModel.hideModels;
        }
        if ((i & 4) != 0) {
            list3 = anoleComponentRelationModel.dependencies;
        }
        return anoleComponentRelationModel.copy(list, list2, list3);
    }

    public final AnoleComponentRelationModel copy(List<AnoleComponentAppearModel> list, List<AnoleComponentAppearModel> list2, List<String> list3) {
        return new AnoleComponentRelationModel(list, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnoleComponentRelationModel)) {
            return false;
        }
        AnoleComponentRelationModel anoleComponentRelationModel = (AnoleComponentRelationModel) obj;
        return o.LJ(this.showModels, anoleComponentRelationModel.showModels) && o.LJ(this.hideModels, anoleComponentRelationModel.hideModels) && o.LJ(this.dependencies, anoleComponentRelationModel.dependencies);
    }

    public int hashCode() {
        List<AnoleComponentAppearModel> list = this.showModels;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<AnoleComponentAppearModel> list2 = this.hideModels;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.dependencies;
        return hashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnoleComponentRelationModel(showModels=");
        LIZ.append(this.showModels);
        LIZ.append(", hideModels=");
        LIZ.append(this.hideModels);
        LIZ.append(", dependencies=");
        return C1NE.LIZIZ(LIZ, this.dependencies, ')', LIZ);
    }

    public final List<String> getDependencies() {
        return this.dependencies;
    }

    public final List<AnoleComponentAppearModel> getHideModels() {
        return this.hideModels;
    }

    public final List<AnoleComponentAppearModel> getShowModels() {
        return this.showModels;
    }

    public AnoleComponentRelationModel(List<AnoleComponentAppearModel> list, List<AnoleComponentAppearModel> list2, List<String> list3) {
        this.showModels = list;
        this.hideModels = list2;
        this.dependencies = list3;
    }
}
