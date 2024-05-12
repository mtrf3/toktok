package com.ss.android.ugc.aweme.ecommerce.anchor.settings;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class EcomGylSchemaModel {

    @InterfaceC65349Pkn("channel")
    public final String channel;

    @InterfaceC65349Pkn("default_track_params")
    public final HashMap<String, String> defaultTrackParams;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    /* JADX WARN: Multi-variable type inference failed */
    public EcomGylSchemaModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcomGylSchemaModel)) {
            return false;
        }
        EcomGylSchemaModel ecomGylSchemaModel = (EcomGylSchemaModel) obj;
        return o.LJ(this.schema, ecomGylSchemaModel.schema) && o.LJ(this.defaultTrackParams, ecomGylSchemaModel.defaultTrackParams) && o.LJ(this.channel, ecomGylSchemaModel.channel);
    }

    public final int hashCode() {
        String str = this.schema;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        HashMap<String, String> hashMap = this.defaultTrackParams;
        int hashCode2 = (hashCode + (hashMap == null ? 0 : hashMap.hashCode())) * 31;
        String str2 = this.channel;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EcomGylSchemaModel(schema=");
        LIZ.append(this.schema);
        LIZ.append(", defaultTrackParams=");
        LIZ.append(this.defaultTrackParams);
        LIZ.append(", channel=");
        return q.LIZIZ(LIZ, this.channel, ')', LIZ);
    }

    public EcomGylSchemaModel(String str, HashMap<String, String> hashMap, String str2) {
        this.schema = str;
        this.defaultTrackParams = hashMap;
        this.channel = str2;
    }

    public /* synthetic */ EcomGylSchemaModel(String str, HashMap hashMap, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : hashMap, (i & 4) != 0 ? null : str2);
    }
}
