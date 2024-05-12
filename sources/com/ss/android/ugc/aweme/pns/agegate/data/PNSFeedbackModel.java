package com.ss.android.ugc.aweme.pns.agegate.data;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class PNSFeedbackModel implements Serializable {

    /* renamed from: case, reason: not valid java name */
    @InterfaceC65349Pkn("case")
    public final Integer f30case;

    @InterfaceC65349Pkn("dialog")
    public final PNSDialogModel dialogModel;

    @InterfaceC65349Pkn("error")
    public final PNSErrorModel errorModel;

    /* JADX WARN: Multi-variable type inference failed */
    public PNSFeedbackModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PNSFeedbackModel copy$default(PNSFeedbackModel pNSFeedbackModel, PNSErrorModel pNSErrorModel, PNSDialogModel pNSDialogModel, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            pNSErrorModel = pNSFeedbackModel.errorModel;
        }
        if ((i & 2) != 0) {
            pNSDialogModel = pNSFeedbackModel.dialogModel;
        }
        if ((i & 4) != 0) {
            num = pNSFeedbackModel.f30case;
        }
        return pNSFeedbackModel.copy(pNSErrorModel, pNSDialogModel, num);
    }

    public final PNSFeedbackModel copy(PNSErrorModel pNSErrorModel, PNSDialogModel pNSDialogModel, Integer num) {
        return new PNSFeedbackModel(pNSErrorModel, pNSDialogModel, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PNSFeedbackModel)) {
            return false;
        }
        PNSFeedbackModel pNSFeedbackModel = (PNSFeedbackModel) obj;
        return o.LJ(this.errorModel, pNSFeedbackModel.errorModel) && o.LJ(this.dialogModel, pNSFeedbackModel.dialogModel) && o.LJ(this.f30case, pNSFeedbackModel.f30case);
    }

    public int hashCode() {
        PNSErrorModel pNSErrorModel = this.errorModel;
        int hashCode = (pNSErrorModel == null ? 0 : pNSErrorModel.hashCode()) * 31;
        PNSDialogModel pNSDialogModel = this.dialogModel;
        int hashCode2 = (hashCode + (pNSDialogModel == null ? 0 : pNSDialogModel.hashCode())) * 31;
        Integer num = this.f30case;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PNSFeedbackModel(errorModel=");
        LIZ.append(this.errorModel);
        LIZ.append(", dialogModel=");
        LIZ.append(this.dialogModel);
        LIZ.append(", case=");
        return s0.LIZJ(LIZ, this.f30case, ')', LIZ);
    }

    public final Integer getCase() {
        return this.f30case;
    }

    public final PNSDialogModel getDialogModel() {
        return this.dialogModel;
    }

    public final PNSErrorModel getErrorModel() {
        return this.errorModel;
    }

    public PNSFeedbackModel(PNSErrorModel pNSErrorModel, PNSDialogModel pNSDialogModel, Integer num) {
        this.errorModel = pNSErrorModel;
        this.dialogModel = pNSDialogModel;
        this.f30case = num;
    }

    public /* synthetic */ PNSFeedbackModel(PNSErrorModel pNSErrorModel, PNSDialogModel pNSDialogModel, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : pNSErrorModel, (i & 2) != 0 ? null : pNSDialogModel, (i & 4) != 0 ? -1 : num);
    }
}
