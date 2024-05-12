package com.ss.android.ugc.gamora.editor.sticker.nature.model;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class NatureSpeciesResponseList extends BaseResponse {

    @InterfaceC65349Pkn("data")
    public final NatureSpeciesResponseListStruct data;

    public final int hashCode() {
        return Objects.hash(this.data);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return C78966Uyw.LJJJLL("NatureSpeciesResponseList:%s", this.data);
    }

    public NatureSpeciesResponseList(NatureSpeciesResponseListStruct data) {
        o.LJIIIZ(data, "data");
        this.data = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NatureSpeciesResponseList)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((NatureSpeciesResponseList) obj).data}, new Object[]{this.data});
    }
}
