package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EcomSchemaBizTypeDetectionModel {

    @InterfaceC65349Pkn("check_path")
    public final List<String> checkPath;

    @InterfaceC65349Pkn("enable_debug_dialog")
    public final Boolean enableDebugDialog;

    @InterfaceC65349Pkn("enable_report")
    public final Boolean enableReport;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcomSchemaBizTypeDetectionModel)) {
            return false;
        }
        EcomSchemaBizTypeDetectionModel ecomSchemaBizTypeDetectionModel = (EcomSchemaBizTypeDetectionModel) obj;
        return o.LJ(this.checkPath, ecomSchemaBizTypeDetectionModel.checkPath) && o.LJ(this.enableReport, ecomSchemaBizTypeDetectionModel.enableReport) && o.LJ(this.enableDebugDialog, ecomSchemaBizTypeDetectionModel.enableDebugDialog);
    }

    public final int hashCode() {
        List<String> list = this.checkPath;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.enableReport;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.enableDebugDialog;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EcomSchemaBizTypeDetectionModel(checkPath=");
        LIZ.append(this.checkPath);
        LIZ.append(", enableReport=");
        LIZ.append(this.enableReport);
        LIZ.append(", enableDebugDialog=");
        return C78920UyC.LIZIZ(LIZ, this.enableDebugDialog, ')', LIZ);
    }

    public EcomSchemaBizTypeDetectionModel(List<String> list, Boolean bool, Boolean bool2) {
        this.checkPath = list;
        this.enableReport = bool;
        this.enableDebugDialog = bool2;
    }
}
