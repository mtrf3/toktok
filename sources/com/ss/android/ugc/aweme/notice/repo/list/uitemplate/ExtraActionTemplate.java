package com.ss.android.ugc.aweme.notice.repo.list.uitemplate;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ExtraActionTemplate {

    @InterfaceC65349Pkn("action_type")
    public final int actionType;

    @InterfaceC65349Pkn("text_content")
    public final String content;

    @InterfaceC65349Pkn("schema_url")
    public final String schema;

    @InterfaceC65349Pkn("view_type")
    public final int viewType;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtraActionTemplate)) {
            return false;
        }
        ExtraActionTemplate extraActionTemplate = (ExtraActionTemplate) obj;
        return this.actionType == extraActionTemplate.actionType && this.viewType == extraActionTemplate.viewType && o.LJ(this.content, extraActionTemplate.content) && o.LJ(this.schema, extraActionTemplate.schema);
    }

    public final int hashCode() {
        int i = ((this.actionType * 31) + this.viewType) * 31;
        String str = this.content;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.schema;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ExtraActionTemplate(actionType=");
        LIZ.append(this.actionType);
        LIZ.append(", viewType=");
        LIZ.append(this.viewType);
        LIZ.append(", content=");
        LIZ.append(this.content);
        LIZ.append(", schema=");
        return q.LIZIZ(LIZ, this.schema, ')', LIZ);
    }

    public ExtraActionTemplate(int i, int i2, String str, String str2) {
        this.actionType = i;
        this.viewType = i2;
        this.content = str;
        this.schema = str2;
    }
}
