package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PromotePageModel implements Serializable {

    @InterfaceC65349Pkn("promote_lynx_schema_type")
    public final Integer promoteLynxSchemaType;

    public static /* synthetic */ PromotePageModel copy$default(PromotePageModel promotePageModel, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = promotePageModel.promoteLynxSchemaType;
        }
        return promotePageModel.copy(num);
    }

    public final PromotePageModel copy(Integer num) {
        return new PromotePageModel(num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PromotePageModel) && o.LJ(this.promoteLynxSchemaType, ((PromotePageModel) obj).promoteLynxSchemaType);
    }

    public int hashCode() {
        Integer num = this.promoteLynxSchemaType;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PromotePageModel(promoteLynxSchemaType=");
        return s0.LIZJ(LIZ, this.promoteLynxSchemaType, ')', LIZ);
    }

    public final Integer getPromoteLynxSchemaType() {
        return this.promoteLynxSchemaType;
    }

    public PromotePageModel(Integer num) {
        this.promoteLynxSchemaType = num;
    }
}
