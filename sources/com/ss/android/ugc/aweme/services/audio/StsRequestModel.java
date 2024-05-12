package com.ss.android.ugc.aweme.services.audio;

import X.C1NE;
import X.X1D;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class StsRequestModel {
    public List<? extends Effect> templateIds;

    /* JADX WARN: Multi-variable type inference failed */
    public StsRequestModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StsRequestModel copy$default(StsRequestModel stsRequestModel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = stsRequestModel.templateIds;
        }
        return stsRequestModel.copy(list);
    }

    public final StsRequestModel copy(List<? extends Effect> list) {
        return new StsRequestModel(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StsRequestModel) && o.LJ(this.templateIds, ((StsRequestModel) obj).templateIds);
    }

    public int hashCode() {
        List<? extends Effect> list = this.templateIds;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StsRequestModel(templateIds=");
        return C1NE.LIZIZ(LIZ, this.templateIds, ')', LIZ);
    }

    public final List<Effect> getTemplateIds() {
        return this.templateIds;
    }

    public StsRequestModel(List<? extends Effect> list) {
        this.templateIds = list;
    }

    public final void setTemplateIds(List<? extends Effect> list) {
        this.templateIds = list;
    }

    public /* synthetic */ StsRequestModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
