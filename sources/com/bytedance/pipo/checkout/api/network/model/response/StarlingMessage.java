package com.bytedance.pipo.checkout.api.network.model.response;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class StarlingMessage {

    @InterfaceC65349Pkn("Data")
    public HashMap<String, String> data;

    /* JADX WARN: Multi-variable type inference failed */
    public StarlingMessage() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StarlingMessage copy$default(StarlingMessage starlingMessage, HashMap hashMap, int i, Object obj) {
        if ((i & 1) != 0) {
            hashMap = starlingMessage.data;
        }
        return starlingMessage.copy(hashMap);
    }

    public final StarlingMessage copy(HashMap<String, String> hashMap) {
        return new StarlingMessage(hashMap);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StarlingMessage) && o.LJ(this.data, ((StarlingMessage) obj).data);
    }

    public int hashCode() {
        HashMap<String, String> hashMap = this.data;
        if (hashMap == null) {
            return 0;
        }
        return hashMap.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StarlingMessage(data=");
        LIZ.append(this.data);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final HashMap<String, String> getData() {
        return this.data;
    }

    public StarlingMessage(HashMap<String, String> hashMap) {
        this.data = hashMap;
    }

    public final void setData(HashMap<String, String> hashMap) {
        this.data = hashMap;
    }

    public /* synthetic */ StarlingMessage(HashMap hashMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new HashMap() : hashMap);
    }
}
