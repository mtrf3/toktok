package com.ss.android.ugc.aweme.sticker.data;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class NatureClassificationStickerStruct implements Serializable {

    @InterfaceC65349Pkn("nature_classification_info")
    public NatureClassificationStruct natureClassificationStruct;

    /* JADX WARN: Multi-variable type inference failed */
    public NatureClassificationStickerStruct() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ NatureClassificationStickerStruct copy$default(NatureClassificationStickerStruct natureClassificationStickerStruct, NatureClassificationStruct natureClassificationStruct, int i, Object obj) {
        if ((i & 1) != 0) {
            natureClassificationStruct = natureClassificationStickerStruct.natureClassificationStruct;
        }
        return natureClassificationStickerStruct.copy(natureClassificationStruct);
    }

    public final NatureClassificationStickerStruct copy(NatureClassificationStruct natureClassificationStruct) {
        return new NatureClassificationStickerStruct(natureClassificationStruct);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NatureClassificationStickerStruct) && o.LJ(this.natureClassificationStruct, ((NatureClassificationStickerStruct) obj).natureClassificationStruct);
    }

    public int hashCode() {
        NatureClassificationStruct natureClassificationStruct = this.natureClassificationStruct;
        if (natureClassificationStruct == null) {
            return 0;
        }
        return natureClassificationStruct.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NatureClassificationStickerStruct(natureClassificationStruct=");
        LIZ.append(this.natureClassificationStruct);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final NatureClassificationStruct getNatureClassificationStruct() {
        return this.natureClassificationStruct;
    }

    public NatureClassificationStickerStruct(NatureClassificationStruct natureClassificationStruct) {
        this.natureClassificationStruct = natureClassificationStruct;
    }

    public /* synthetic */ NatureClassificationStickerStruct(NatureClassificationStruct natureClassificationStruct, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : natureClassificationStruct);
    }
}
