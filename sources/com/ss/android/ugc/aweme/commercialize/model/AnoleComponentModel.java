package com.ss.android.ugc.aweme.commercialize.model;

import X.C141335gf;
import X.C15890jp;
import X.C16880lQ;
import X.C3C5;
import X.C69432nz;
import X.C79062V1e;
import X.HH1;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.google.gson.Gson;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AnoleComponentModel implements Serializable {

    @InterfaceC65349Pkn("component_id")
    public final long ID;

    @InterfaceC65349Pkn("container_type")
    public final String containerType;

    @InterfaceC65349Pkn("data")
    public final Map<String, Object> data;

    @InterfaceC65349Pkn("layout")
    public final AnoleComponentLayoutModel layout;

    @InterfaceC65349Pkn("size")
    public final AnoleComponentSizeModel size;

    @InterfaceC65349Pkn("slot_id")
    public final String slotID;

    @InterfaceC65349Pkn("component_type")
    public final String type;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnoleComponentModel copy$default(AnoleComponentModel anoleComponentModel, long j, String str, String str2, String str3, AnoleComponentSizeModel anoleComponentSizeModel, AnoleComponentLayoutModel anoleComponentLayoutModel, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            j = anoleComponentModel.ID;
        }
        if ((i & 2) != 0) {
            str = anoleComponentModel.type;
        }
        if ((i & 4) != 0) {
            str2 = anoleComponentModel.containerType;
        }
        if ((i & 8) != 0) {
            str3 = anoleComponentModel.slotID;
        }
        if ((i & 16) != 0) {
            anoleComponentSizeModel = anoleComponentModel.size;
        }
        if ((i & 32) != 0) {
            anoleComponentLayoutModel = anoleComponentModel.layout;
        }
        if ((i & 64) != 0) {
            map = anoleComponentModel.data;
        }
        return anoleComponentModel.copy(j, str, str2, str3, anoleComponentSizeModel, anoleComponentLayoutModel, map);
    }

    public final AnoleComponentModel copy(long j, String type, String containerType, String slotID, AnoleComponentSizeModel anoleComponentSizeModel, AnoleComponentLayoutModel anoleComponentLayoutModel, Map<String, ? extends Object> map) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(containerType, "containerType");
        o.LJIIIZ(slotID, "slotID");
        return new AnoleComponentModel(j, type, containerType, slotID, anoleComponentSizeModel, anoleComponentLayoutModel, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnoleComponentModel)) {
            return false;
        }
        AnoleComponentModel anoleComponentModel = (AnoleComponentModel) obj;
        return this.ID == anoleComponentModel.ID && o.LJ(this.type, anoleComponentModel.type) && o.LJ(this.containerType, anoleComponentModel.containerType) && o.LJ(this.slotID, anoleComponentModel.slotID) && o.LJ(this.size, anoleComponentModel.size) && o.LJ(this.layout, anoleComponentModel.layout) && o.LJ(this.data, anoleComponentModel.data);
    }

    public final String getFrontendData() {
        Object obj;
        Map<String, Object> map = this.data;
        if (map != null) {
            obj = map.get("frontend_data");
        } else {
            obj = null;
        }
        if (!(obj instanceof String)) {
            return null;
        }
        return (String) obj;
    }

    public final List<String> getGeckoChannels() {
        Object obj;
        List list;
        Map<String, Object> map = this.data;
        ArrayList arrayList = null;
        if (map != null) {
            obj = map.get("gecko_channel");
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

    public final AnoleLogInfo getLogInfo() {
        Object obj;
        Object LIZ;
        Map<String, Object> map = this.data;
        Object obj2 = null;
        if (map != null) {
            obj = map.get("log_info");
        } else {
            obj = null;
        }
        if (!(obj instanceof Map) || obj == null) {
            return null;
        }
        Gson LIZ2 = C69432nz.LIZ();
        o.LJIIIIZZ(LIZ2, "getGson()");
        try {
            LIZ = (AnoleLogInfo) LIZ2.LJI(LIZ2.LJIILL(obj), AnoleLogInfo.class);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (!C3C5.m12isFailureimpl(LIZ)) {
            obj2 = LIZ;
        }
        return (AnoleLogInfo) obj2;
    }

    public final String getLynxSchema() {
        Object obj;
        Map<String, Object> map = this.data;
        if (map != null) {
            obj = map.get("lynx_schema");
        } else {
            obj = null;
        }
        if (!(obj instanceof String)) {
            return null;
        }
        return (String) obj;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int LJ = C79062V1e.LJ(this.slotID, C79062V1e.LJ(this.containerType, C79062V1e.LJ(this.type, C16880lQ.LLJIJIL(this.ID) * 31, 31), 31), 31);
        AnoleComponentSizeModel anoleComponentSizeModel = this.size;
        int i = 0;
        if (anoleComponentSizeModel == null) {
            hashCode = 0;
        } else {
            hashCode = anoleComponentSizeModel.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        AnoleComponentLayoutModel anoleComponentLayoutModel = this.layout;
        if (anoleComponentLayoutModel == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = anoleComponentLayoutModel.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Map<String, Object> map = this.data;
        if (map != null) {
            i = map.hashCode();
        }
        return i3 + i;
    }

    public final String getRefer() {
        AnoleLogInfo logInfo = getLogInfo();
        if (logInfo != null) {
            return logInfo.getRefer();
        }
        return null;
    }

    public final String getTag() {
        AnoleLogInfo logInfo = getLogInfo();
        if (logInfo != null) {
            return logInfo.getTag();
        }
        return null;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnoleComponentModel(ID=");
        LIZ.append(this.ID);
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(", containerType=");
        LIZ.append(this.containerType);
        LIZ.append(", slotID=");
        LIZ.append(this.slotID);
        LIZ.append(", size=");
        LIZ.append(this.size);
        LIZ.append(", layout=");
        LIZ.append(this.layout);
        LIZ.append(", data=");
        return C15890jp.LIZ(LIZ, this.data, ')', LIZ);
    }

    public final String getContainerType() {
        return this.containerType;
    }

    public final Map<String, Object> getData() {
        return this.data;
    }

    public final long getID() {
        return this.ID;
    }

    public final AnoleComponentLayoutModel getLayout() {
        return this.layout;
    }

    public final AnoleComponentSizeModel getSize() {
        return this.size;
    }

    public final String getSlotID() {
        return this.slotID;
    }

    public final String getType() {
        return this.type;
    }

    public AnoleComponentModel(long j, String str, String str2, String str3, AnoleComponentSizeModel anoleComponentSizeModel, AnoleComponentLayoutModel anoleComponentLayoutModel, Map<String, ? extends Object> map) {
        HH1.LIZ(str, "type", str2, "containerType", str3, "slotID");
        this.ID = j;
        this.type = str;
        this.containerType = str2;
        this.slotID = str3;
        this.size = anoleComponentSizeModel;
        this.layout = anoleComponentLayoutModel;
        this.data = map;
    }
}
