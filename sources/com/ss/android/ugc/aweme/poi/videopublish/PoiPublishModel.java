package com.ss.android.ugc.aweme.poi.videopublish;

import X.X1D;
import com.ss.android.ugc.aweme.poi.PoiData;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiPublishModel {
    public final String enterMethod;
    public final String logId;
    public final PoiData poiItem;
    public final String searchId;

    /* JADX WARN: Multi-variable type inference failed */
    public PoiPublishModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PoiPublishModel copy$default(PoiPublishModel poiPublishModel, PoiData poiData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            poiData = poiPublishModel.poiItem;
        }
        if ((i & 2) != 0) {
            str = poiPublishModel.enterMethod;
        }
        if ((i & 4) != 0) {
            str2 = poiPublishModel.logId;
        }
        if ((i & 8) != 0) {
            str3 = poiPublishModel.searchId;
        }
        return poiPublishModel.copy(poiData, str, str2, str3);
    }

    public final PoiPublishModel copy(PoiData poiData, String str, String str2, String str3) {
        return new PoiPublishModel(poiData, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiPublishModel)) {
            return false;
        }
        PoiPublishModel poiPublishModel = (PoiPublishModel) obj;
        return o.LJ(this.poiItem, poiPublishModel.poiItem) && o.LJ(this.enterMethod, poiPublishModel.enterMethod) && o.LJ(this.logId, poiPublishModel.logId) && o.LJ(this.searchId, poiPublishModel.searchId);
    }

    public int hashCode() {
        PoiData poiData = this.poiItem;
        int hashCode = (poiData == null ? 0 : poiData.hashCode()) * 31;
        String str = this.enterMethod;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.logId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.searchId;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PoiPublishModel(poiItem=");
        LIZ.append(this.poiItem);
        LIZ.append(", enterMethod=");
        LIZ.append(this.enterMethod);
        LIZ.append(", logId=");
        LIZ.append(this.logId);
        LIZ.append(", searchId=");
        return q.LIZIZ(LIZ, this.searchId, ')', LIZ);
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final String getLogId() {
        return this.logId;
    }

    public final PoiData getPoiItem() {
        return this.poiItem;
    }

    public final String getSearchId() {
        return this.searchId;
    }

    public PoiPublishModel(PoiData poiData, String str, String str2, String str3) {
        this.poiItem = poiData;
        this.enterMethod = str;
        this.logId = str2;
        this.searchId = str3;
    }

    public /* synthetic */ PoiPublishModel(PoiData poiData, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : poiData, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
