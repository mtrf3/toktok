package com.ss.android.ugc.aweme.notice.repo.list.uitemplate;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class TitleTemplate {

    @InterfaceC65349Pkn("title_append_info")
    public final ExtraActionTemplate extraAction;

    @InterfaceC65349Pkn("extra_schema_url")
    public final String extraSchemaUrl;

    @InterfaceC65349Pkn("from_users")
    public final List<User> fromUsers;

    @InterfaceC65349Pkn("merge_count")
    public final int mergeCount;

    @InterfaceC65349Pkn("title")
    public final String title;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TitleTemplate)) {
            return false;
        }
        TitleTemplate titleTemplate = (TitleTemplate) obj;
        return o.LJ(this.fromUsers, titleTemplate.fromUsers) && this.mergeCount == titleTemplate.mergeCount && o.LJ(this.extraSchemaUrl, titleTemplate.extraSchemaUrl) && o.LJ(this.title, titleTemplate.title) && o.LJ(this.extraAction, titleTemplate.extraAction);
    }

    public final int hashCode() {
        int hashCode = ((this.fromUsers.hashCode() * 31) + this.mergeCount) * 31;
        String str = this.extraSchemaUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ExtraActionTemplate extraActionTemplate = this.extraAction;
        return hashCode3 + (extraActionTemplate != null ? extraActionTemplate.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TitleTemplate(fromUsers=");
        LIZ.append(this.fromUsers);
        LIZ.append(", mergeCount=");
        LIZ.append(this.mergeCount);
        LIZ.append(", extraSchemaUrl=");
        LIZ.append(this.extraSchemaUrl);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", extraAction=");
        LIZ.append(this.extraAction);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TitleTemplate(List<? extends User> fromUsers, int i, String str, String str2, ExtraActionTemplate extraActionTemplate) {
        o.LJIIIZ(fromUsers, "fromUsers");
        this.fromUsers = fromUsers;
        this.mergeCount = i;
        this.extraSchemaUrl = str;
        this.title = str2;
        this.extraAction = extraActionTemplate;
    }

    public /* synthetic */ TitleTemplate(List list, int i, String str, String str2, ExtraActionTemplate extraActionTemplate, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? 0 : i, str, str2, extraActionTemplate);
    }
}
