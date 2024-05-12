package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C27512Aqy;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ModelCard implements Parcelable {
    public static final Parcelable.Creator<ModelCard> CREATOR = new C27512Aqy();

    @InterfaceC65349Pkn("card_title")
    public final String cardTitle;

    @InterfaceC65349Pkn("color_property_id")
    public final String colorPropertyId;

    @InterfaceC65349Pkn("model_infos")
    public final List<ModelInfo> modelInfos;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModelCard)) {
            return false;
        }
        ModelCard modelCard = (ModelCard) obj;
        return o.LJ(this.colorPropertyId, modelCard.colorPropertyId) && o.LJ(this.modelInfos, modelCard.modelInfos) && o.LJ(this.cardTitle, modelCard.cardTitle) && o.LJ(this.schema, modelCard.schema);
    }

    public final int hashCode() {
        String str = this.colorPropertyId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<ModelInfo> list = this.modelInfos;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.cardTitle;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.schema;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ModelCard(colorPropertyId=");
        LIZ.append(this.colorPropertyId);
        LIZ.append(", modelInfos=");
        LIZ.append(this.modelInfos);
        LIZ.append(", cardTitle=");
        LIZ.append(this.cardTitle);
        LIZ.append(", schema=");
        return q.LIZIZ(LIZ, this.schema, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.colorPropertyId);
        List<ModelInfo> list = this.modelInfos;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((ModelInfo) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        out.writeString(this.cardTitle);
        out.writeString(this.schema);
    }

    public ModelCard(String str, List<ModelInfo> list, String str2, String str3) {
        this.colorPropertyId = str;
        this.modelInfos = list;
        this.cardTitle = str2;
        this.schema = str3;
    }
}
