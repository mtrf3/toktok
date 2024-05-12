package com.ss.android.ugc.aweme.wavepublish.story;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DescriptionDataWrapper implements Serializable {

    @InterfaceC65349Pkn("data")
    public DescriptionData data;

    /* JADX WARN: Multi-variable type inference failed */
    public DescriptionDataWrapper() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DescriptionDataWrapper copy$default(DescriptionDataWrapper descriptionDataWrapper, DescriptionData descriptionData, int i, Object obj) {
        if ((i & 1) != 0) {
            descriptionData = descriptionDataWrapper.data;
        }
        return descriptionDataWrapper.copy(descriptionData);
    }

    public final DescriptionDataWrapper copy(DescriptionData descriptionData) {
        return new DescriptionDataWrapper(descriptionData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DescriptionDataWrapper) && o.LJ(this.data, ((DescriptionDataWrapper) obj).data);
    }

    public int hashCode() {
        DescriptionData descriptionData = this.data;
        if (descriptionData == null) {
            return 0;
        }
        return descriptionData.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DescriptionDataWrapper(data=");
        LIZ.append(this.data);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final DescriptionData getData() {
        return this.data;
    }

    public DescriptionDataWrapper(DescriptionData descriptionData) {
        this.data = descriptionData;
    }

    public final void setData(DescriptionData descriptionData) {
        this.data = descriptionData;
    }

    public /* synthetic */ DescriptionDataWrapper(DescriptionData descriptionData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : descriptionData);
    }
}
