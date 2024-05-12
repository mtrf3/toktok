package com.bytedance.ies.ugc.aweme.commercialize.compliance.model;

import X.C1NE;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class Description implements Serializable {

    @InterfaceC65349Pkn("description")
    public final String description;

    @InterfaceC65349Pkn("hyper_links")
    public final List<String> hyperLink;

    @InterfaceC65349Pkn("hyper_texts")
    public final List<String> hyperText;

    @InterfaceC65349Pkn("title")
    public final String title;

    public Description() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Description copy$default(Description description, String str, String str2, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = description.title;
        }
        if ((i & 2) != 0) {
            str2 = description.description;
        }
        if ((i & 4) != 0) {
            list = description.hyperText;
        }
        if ((i & 8) != 0) {
            list2 = description.hyperLink;
        }
        return description.copy(str, str2, list, list2);
    }

    public final Description copy(String str, String str2, List<String> list, List<String> list2) {
        return new Description(str, str2, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Description)) {
            return false;
        }
        Description description = (Description) obj;
        return o.LJ(this.title, description.title) && o.LJ(this.description, description.description) && o.LJ(this.hyperText, description.hyperText) && o.LJ(this.hyperLink, description.hyperLink);
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.hyperText;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.hyperLink;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Description(title=");
        LIZ.append(this.title);
        LIZ.append(", description=");
        LIZ.append(this.description);
        LIZ.append(", hyperText=");
        LIZ.append(this.hyperText);
        LIZ.append(", hyperLink=");
        return C1NE.LIZIZ(LIZ, this.hyperLink, ')', LIZ);
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<String> getHyperLink() {
        return this.hyperLink;
    }

    public final List<String> getHyperText() {
        return this.hyperText;
    }

    public final String getTitle() {
        return this.title;
    }

    public Description(String str, String str2, List<String> list, List<String> list2) {
        this.title = str;
        this.description = str2;
        this.hyperText = list;
        this.hyperLink = list2;
    }

    public Description(String str, String str2, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? C61878OQg.INSTANCE : list, (i & 8) != 0 ? C61878OQg.INSTANCE : list2);
    }
}
