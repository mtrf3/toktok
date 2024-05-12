package com.ss.android.ugc.aweme.commercialize.tcm.setting;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TcmBarSchemaSettingModel {

    @InterfaceC65349Pkn("tcm_appeal_schema")
    public final String tcmAppealSchema;

    @InterfaceC65349Pkn("tcm_official_schema")
    public final String tcmOfficialSchema;

    /* JADX WARN: Multi-variable type inference failed */
    public TcmBarSchemaSettingModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TcmBarSchemaSettingModel)) {
            return false;
        }
        TcmBarSchemaSettingModel tcmBarSchemaSettingModel = (TcmBarSchemaSettingModel) obj;
        return o.LJ(this.tcmOfficialSchema, tcmBarSchemaSettingModel.tcmOfficialSchema) && o.LJ(this.tcmAppealSchema, tcmBarSchemaSettingModel.tcmAppealSchema);
    }

    public final int hashCode() {
        String str = this.tcmOfficialSchema;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tcmAppealSchema;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TcmBarSchemaSettingModel(tcmOfficialSchema=");
        LIZ.append(this.tcmOfficialSchema);
        LIZ.append(", tcmAppealSchema=");
        return q.LIZIZ(LIZ, this.tcmAppealSchema, ')', LIZ);
    }

    public TcmBarSchemaSettingModel(String str, String str2) {
        this.tcmOfficialSchema = str;
        this.tcmAppealSchema = str2;
    }

    public /* synthetic */ TcmBarSchemaSettingModel(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
