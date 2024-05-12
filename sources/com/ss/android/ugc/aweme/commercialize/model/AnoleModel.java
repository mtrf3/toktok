package com.ss.android.ugc.aweme.commercialize.model;

import X.C15890jp;
import X.C16880lQ;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AnoleModel implements Serializable {

    @InterfaceC65349Pkn("component_relation")
    public final Map<String, AnoleComponentRelationModel> componentRelations;

    @InterfaceC65349Pkn("component_data")
    public final Map<String, AnoleComponentModel> components;

    @InterfaceC65349Pkn("template_id")
    public final long templateID;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnoleModel copy$default(AnoleModel anoleModel, long j, Map map, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = anoleModel.templateID;
        }
        if ((i & 2) != 0) {
            map = anoleModel.componentRelations;
        }
        if ((i & 4) != 0) {
            map2 = anoleModel.components;
        }
        return anoleModel.copy(j, map, map2);
    }

    public final AnoleModel copy(long j, Map<String, AnoleComponentRelationModel> map, Map<String, AnoleComponentModel> map2) {
        return new AnoleModel(j, map, map2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnoleModel)) {
            return false;
        }
        AnoleModel anoleModel = (AnoleModel) obj;
        return this.templateID == anoleModel.templateID && o.LJ(this.componentRelations, anoleModel.componentRelations) && o.LJ(this.components, anoleModel.components);
    }

    public int hashCode() {
        int LLJIJIL = C16880lQ.LLJIJIL(this.templateID) * 31;
        Map<String, AnoleComponentRelationModel> map = this.componentRelations;
        int hashCode = (LLJIJIL + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, AnoleComponentModel> map2 = this.components;
        return hashCode + (map2 != null ? map2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnoleModel(templateID=");
        LIZ.append(this.templateID);
        LIZ.append(", componentRelations=");
        LIZ.append(this.componentRelations);
        LIZ.append(", components=");
        return C15890jp.LIZ(LIZ, this.components, ')', LIZ);
    }

    public final Map<String, AnoleComponentRelationModel> getComponentRelations() {
        return this.componentRelations;
    }

    public final Map<String, AnoleComponentModel> getComponents() {
        return this.components;
    }

    public final long getTemplateID() {
        return this.templateID;
    }

    public AnoleModel(long j, Map<String, AnoleComponentRelationModel> map, Map<String, AnoleComponentModel> map2) {
        this.templateID = j;
        this.componentRelations = map;
        this.components = map2;
    }
}
