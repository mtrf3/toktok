package com.ss.android.ugc.aweme.ecommerce.video.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class RecommendVideoModel {

    @InterfaceC65349Pkn("aweme_struct")
    public final String awemeStruct;

    public static /* synthetic */ RecommendVideoModel copy$default(RecommendVideoModel recommendVideoModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recommendVideoModel.awemeStruct;
        }
        return recommendVideoModel.copy(str);
    }

    public final RecommendVideoModel copy(String str) {
        return new RecommendVideoModel(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecommendVideoModel) && o.LJ(this.awemeStruct, ((RecommendVideoModel) obj).awemeStruct);
    }

    public int hashCode() {
        String str = this.awemeStruct;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecommendVideoModel(awemeStruct=");
        return q.LIZIZ(LIZ, this.awemeStruct, ')', LIZ);
    }

    public final String getAwemeStruct() {
        return this.awemeStruct;
    }

    public RecommendVideoModel(String str) {
        this.awemeStruct = str;
    }
}
