package com.ss.android.ugc.aweme.ecommerce.anchor.settings;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class EcomGylSchemaMapModel {

    @InterfaceC65349Pkn("video_anchor_landing_page_guess_like")
    public final EcomGylSchemaModel videoAnchorGuessYouLike;

    /* JADX WARN: Multi-variable type inference failed */
    public EcomGylSchemaMapModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EcomGylSchemaMapModel) && o.LJ(this.videoAnchorGuessYouLike, ((EcomGylSchemaMapModel) obj).videoAnchorGuessYouLike);
    }

    public final int hashCode() {
        EcomGylSchemaModel ecomGylSchemaModel = this.videoAnchorGuessYouLike;
        if (ecomGylSchemaModel == null) {
            return 0;
        }
        return ecomGylSchemaModel.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EcomGylSchemaMapModel(videoAnchorGuessYouLike=");
        LIZ.append(this.videoAnchorGuessYouLike);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public EcomGylSchemaMapModel(EcomGylSchemaModel ecomGylSchemaModel) {
        this.videoAnchorGuessYouLike = ecomGylSchemaModel;
    }

    public /* synthetic */ EcomGylSchemaMapModel(EcomGylSchemaModel ecomGylSchemaModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new EcomGylSchemaModel(null, null, null, 7, null) : ecomGylSchemaModel);
    }
}
