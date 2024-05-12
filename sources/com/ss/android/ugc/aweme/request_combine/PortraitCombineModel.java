package com.ss.android.ugc.aweme.request_combine;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.google.gson.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PortraitCombineModel extends BaseCombineMode {

    @InterfaceC65349Pkn("body")
    public j portraitData;

    /* JADX WARN: Multi-variable type inference failed */
    public PortraitCombineModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PortraitCombineModel copy$default(PortraitCombineModel portraitCombineModel, j jVar, int i, Object obj) {
        if ((i & 1) != 0) {
            jVar = portraitCombineModel.portraitData;
        }
        return portraitCombineModel.copy(jVar);
    }

    public final PortraitCombineModel copy(j jVar) {
        return new PortraitCombineModel(jVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PortraitCombineModel) && o.LJ(this.portraitData, ((PortraitCombineModel) obj).portraitData);
    }

    public int hashCode() {
        j jVar = this.portraitData;
        if (jVar == null) {
            return 0;
        }
        return jVar.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PortraitCombineModel(portraitData=");
        LIZ.append(this.portraitData);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final j getPortraitData() {
        return this.portraitData;
    }

    public PortraitCombineModel(j jVar) {
        this.portraitData = jVar;
    }

    public final void setPortraitData(j jVar) {
        this.portraitData = jVar;
    }

    public /* synthetic */ PortraitCombineModel(j jVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : jVar);
    }
}
