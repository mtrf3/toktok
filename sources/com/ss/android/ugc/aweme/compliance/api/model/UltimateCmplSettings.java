package com.ss.android.ugc.aweme.compliance.api.model;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class UltimateCmplSettings extends BaseResponse {

    @InterfaceC65349Pkn("c_r")
    public final String country;

    @InterfaceC65349Pkn("postpone_af_tracking")
    public final boolean delayAFStart;

    @InterfaceC65349Pkn("set_anonymize_for_appsflyer")
    public final boolean setAnonymizeUserForAF;

    @InterfaceC65349Pkn("set_anonymize_for_firebase")
    public final boolean setAnonymizeUserForFireBase;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UltimateCmplSettings) {
            return C78966Uyw.LJIIIZ(((UltimateCmplSettings) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.setAnonymizeUserForAF), Boolean.valueOf(this.delayAFStart), this.country, Boolean.valueOf(this.setAnonymizeUserForFireBase)};
    }

    public final int hashCode() {
        return Objects.hash(getObjects());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return C78966Uyw.LJJJLL("UltimateCmplSettings:%s,%s,%s,%s", getObjects());
    }

    public UltimateCmplSettings(boolean z, boolean z2, String country, boolean z3) {
        o.LJIIIZ(country, "country");
        this.setAnonymizeUserForAF = z;
        this.delayAFStart = z2;
        this.country = country;
        this.setAnonymizeUserForFireBase = z3;
    }
}
