package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.AnonymousClass391;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SubmitQuitReasonRequest {

    @InterfaceC65349Pkn("extra")
    public final String extraInfo;

    @InterfaceC65349Pkn("input_reasons")
    public final List<InputReason> inputReasons;

    @InterfaceC65349Pkn("reason_show_type")
    public final int reasonShowType;

    @InterfaceC65349Pkn("select_reasons")
    public final List<SelectReason> selectReasons;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitQuitReasonRequest)) {
            return false;
        }
        SubmitQuitReasonRequest submitQuitReasonRequest = (SubmitQuitReasonRequest) obj;
        return this.reasonShowType == submitQuitReasonRequest.reasonShowType && o.LJ(this.selectReasons, submitQuitReasonRequest.selectReasons) && o.LJ(this.inputReasons, submitQuitReasonRequest.inputReasons) && o.LJ(this.extraInfo, submitQuitReasonRequest.extraInfo);
    }

    public final int hashCode() {
        int hashCode;
        int LIZIZ = AnonymousClass391.LIZIZ(this.inputReasons, AnonymousClass391.LIZIZ(this.selectReasons, this.reasonShowType * 31, 31), 31);
        String str = this.extraInfo;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return LIZIZ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SubmitQuitReasonRequest(reasonShowType=");
        LIZ.append(this.reasonShowType);
        LIZ.append(", selectReasons=");
        LIZ.append(this.selectReasons);
        LIZ.append(", inputReasons=");
        LIZ.append(this.inputReasons);
        LIZ.append(", extraInfo=");
        return q.LIZIZ(LIZ, this.extraInfo, ')', LIZ);
    }

    public SubmitQuitReasonRequest(int i, List<SelectReason> selectReasons, List<InputReason> inputReasons, String str) {
        o.LJIIIZ(selectReasons, "selectReasons");
        o.LJIIIZ(inputReasons, "inputReasons");
        this.reasonShowType = i;
        this.selectReasons = selectReasons;
        this.inputReasons = inputReasons;
        this.extraInfo = str;
    }

    public /* synthetic */ SubmitQuitReasonRequest(int i, List list, List list2, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, list2, (i2 & 8) != 0 ? null : str);
    }
}
