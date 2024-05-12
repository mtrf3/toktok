package com.ss.android.ugc.gamora.editor.sticker.nature.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class NatureSpeciesResponseBoolean extends BaseResponse {

    @InterfaceC65349Pkn("data")
    public final NatureSpeciesResponseStruct data;

    /* JADX WARN: Multi-variable type inference failed */
    public NatureSpeciesResponseBoolean() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NatureSpeciesResponseBoolean) && o.LJ(this.data, ((NatureSpeciesResponseBoolean) obj).data);
    }

    public final int hashCode() {
        NatureSpeciesResponseStruct natureSpeciesResponseStruct = this.data;
        if (natureSpeciesResponseStruct == null) {
            return 0;
        }
        return natureSpeciesResponseStruct.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NatureSpeciesResponseBoolean(data=");
        LIZ.append(this.data);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public NatureSpeciesResponseBoolean(NatureSpeciesResponseStruct natureSpeciesResponseStruct) {
        this.data = natureSpeciesResponseStruct;
    }

    public /* synthetic */ NatureSpeciesResponseBoolean(NatureSpeciesResponseStruct natureSpeciesResponseStruct, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : natureSpeciesResponseStruct);
    }
}
