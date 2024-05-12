package com.ss.android.ugc.aweme.commercialize.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AnoleComponentAppearModel implements Serializable {

    @InterfaceC65349Pkn("animations")
    public final List<AnoleComponentAnimationModel> animations;

    @InterfaceC65349Pkn("hide_business_components")
    public final List<AnoleComponentBusinessAppearModel> hideBusinessComponents;

    @InterfaceC65349Pkn("params")
    public final Map<String, Object> params;

    @InterfaceC65349Pkn("show_business_components")
    public final List<AnoleComponentBusinessAppearModel> showBusinessComponents;

    @InterfaceC65349Pkn("type")
    public final String type;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnoleComponentAppearModel copy$default(AnoleComponentAppearModel anoleComponentAppearModel, String str, Map map, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = anoleComponentAppearModel.type;
        }
        if ((i & 2) != 0) {
            map = anoleComponentAppearModel.params;
        }
        if ((i & 4) != 0) {
            list = anoleComponentAppearModel.animations;
        }
        if ((i & 8) != 0) {
            list2 = anoleComponentAppearModel.showBusinessComponents;
        }
        if ((i & 16) != 0) {
            list3 = anoleComponentAppearModel.hideBusinessComponents;
        }
        return anoleComponentAppearModel.copy(str, map, list, list2, list3);
    }

    public final AnoleComponentAppearModel copy(String str, Map<String, ? extends Object> map, List<AnoleComponentAnimationModel> list, List<AnoleComponentBusinessAppearModel> list2, List<AnoleComponentBusinessAppearModel> list3) {
        return new AnoleComponentAppearModel(str, map, list, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnoleComponentAppearModel)) {
            return false;
        }
        AnoleComponentAppearModel anoleComponentAppearModel = (AnoleComponentAppearModel) obj;
        return o.LJ(this.type, anoleComponentAppearModel.type) && o.LJ(this.params, anoleComponentAppearModel.params) && o.LJ(this.animations, anoleComponentAppearModel.animations) && o.LJ(this.showBusinessComponents, anoleComponentAppearModel.showBusinessComponents) && o.LJ(this.hideBusinessComponents, anoleComponentAppearModel.hideBusinessComponents);
    }

    public int hashCode() {
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, Object> map = this.params;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        List<AnoleComponentAnimationModel> list = this.animations;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<AnoleComponentBusinessAppearModel> list2 = this.showBusinessComponents;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<AnoleComponentBusinessAppearModel> list3 = this.hideBusinessComponents;
        return hashCode4 + (list3 != null ? list3.hashCode() : 0);
    }

    public final Double getPlayProgress() {
        Object obj;
        Map<String, Object> map = this.params;
        if (map != null) {
            obj = map.get("progress");
        } else {
            obj = null;
        }
        if (!(obj instanceof Double)) {
            return null;
        }
        return (Double) obj;
    }

    public final Integer getRepeatCount() {
        Object obj;
        Double d;
        Map<String, Object> map = this.params;
        if (map != null) {
            obj = map.get("repeat_count");
        } else {
            obj = null;
        }
        if (!(obj instanceof Double) || (d = (Double) obj) == null) {
            return null;
        }
        return Integer.valueOf((int) d.doubleValue());
    }

    public final List<String> getSourceComponents() {
        Object obj;
        List list;
        Map<String, Object> map = this.params;
        ArrayList arrayList = null;
        if (map != null) {
            obj = map.get("source_components");
        } else {
            obj = null;
        }
        if ((obj instanceof List) && (list = (List) obj) != null) {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                if ((obj2 instanceof String) && obj2 != null) {
                    arrayList.add(obj2);
                }
            }
        }
        return arrayList;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnoleComponentAppearModel(type=");
        LIZ.append(this.type);
        LIZ.append(", params=");
        LIZ.append(this.params);
        LIZ.append(", animations=");
        LIZ.append(this.animations);
        LIZ.append(", showBusinessComponents=");
        LIZ.append(this.showBusinessComponents);
        LIZ.append(", hideBusinessComponents=");
        return C1NE.LIZIZ(LIZ, this.hideBusinessComponents, ')', LIZ);
    }

    public final List<AnoleComponentAnimationModel> getAnimations() {
        return this.animations;
    }

    public final List<AnoleComponentBusinessAppearModel> getHideBusinessComponents() {
        return this.hideBusinessComponents;
    }

    public final Map<String, Object> getParams() {
        return this.params;
    }

    public final List<AnoleComponentBusinessAppearModel> getShowBusinessComponents() {
        return this.showBusinessComponents;
    }

    public final String getType() {
        return this.type;
    }

    public AnoleComponentAppearModel(String str, Map<String, ? extends Object> map, List<AnoleComponentAnimationModel> list, List<AnoleComponentBusinessAppearModel> list2, List<AnoleComponentBusinessAppearModel> list3) {
        this.type = str;
        this.params = map;
        this.animations = list;
        this.showBusinessComponents = list2;
        this.hideBusinessComponents = list3;
    }
}
