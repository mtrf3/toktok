package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class QuitReasonData {

    @InterfaceC65349Pkn("reasons")
    public final List<Reason> reasons;

    @InterfaceC65349Pkn("schema_info")
    public final DynamicSchema schemaInfo;

    @InterfaceC65349Pkn("submit_text")
    public final String submitText;

    @InterfaceC65349Pkn("title")
    public final String title;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuitReasonData)) {
            return false;
        }
        QuitReasonData quitReasonData = (QuitReasonData) obj;
        return o.LJ(this.title, quitReasonData.title) && o.LJ(this.submitText, quitReasonData.submitText) && o.LJ(this.reasons, quitReasonData.reasons) && o.LJ(this.schemaInfo, quitReasonData.schemaInfo);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.submitText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Reason> list = this.reasons;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        DynamicSchema dynamicSchema = this.schemaInfo;
        return hashCode3 + (dynamicSchema != null ? dynamicSchema.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("QuitReasonData(title=");
        LIZ.append(this.title);
        LIZ.append(", submitText=");
        LIZ.append(this.submitText);
        LIZ.append(", reasons=");
        LIZ.append(this.reasons);
        LIZ.append(", schemaInfo=");
        LIZ.append(this.schemaInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public QuitReasonData(String str, String str2, List<Reason> list, DynamicSchema dynamicSchema) {
        this.title = str;
        this.submitText = str2;
        this.reasons = list;
        this.schemaInfo = dynamicSchema;
    }
}
