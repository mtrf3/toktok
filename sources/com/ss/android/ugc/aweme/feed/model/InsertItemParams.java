package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class InsertItemParams {

    @InterfaceC65349Pkn("aweme_ids")
    public final String awemeId;

    @InterfaceC65349Pkn("infos")
    public final InfoParams infos;

    /* JADX WARN: Multi-variable type inference failed */
    public InsertItemParams() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ InsertItemParams copy$default(InsertItemParams insertItemParams, String str, InfoParams infoParams, int i, Object obj) {
        if ((i & 1) != 0) {
            str = insertItemParams.awemeId;
        }
        if ((i & 2) != 0) {
            infoParams = insertItemParams.infos;
        }
        return insertItemParams.copy(str, infoParams);
    }

    public final InsertItemParams copy(String str, InfoParams infoParams) {
        return new InsertItemParams(str, infoParams);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsertItemParams)) {
            return false;
        }
        InsertItemParams insertItemParams = (InsertItemParams) obj;
        return o.LJ(this.awemeId, insertItemParams.awemeId) && o.LJ(this.infos, insertItemParams.infos);
    }

    public int hashCode() {
        String str = this.awemeId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        InfoParams infoParams = this.infos;
        return hashCode + (infoParams != null ? infoParams.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InsertItemParams(awemeId=");
        LIZ.append(this.awemeId);
        LIZ.append(", infos=");
        LIZ.append(this.infos);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public InsertItemParams(String str, InfoParams infoParams) {
        this.awemeId = str;
        this.infos = infoParams;
    }

    public /* synthetic */ InsertItemParams(String str, InfoParams infoParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : infoParams);
    }
}
