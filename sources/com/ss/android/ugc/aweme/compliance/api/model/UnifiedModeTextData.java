package com.ss.android.ugc.aweme.compliance.api.model;

import X.C1NE;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class UnifiedModeTextData implements Serializable {

    @InterfaceC65349Pkn("unified_mode_detail")
    public final String description;

    @InterfaceC65349Pkn("item_link_list")
    public final List<String> itemLinkList;

    @InterfaceC65349Pkn("item_list")
    public final List<String> itemList;

    @InterfaceC65349Pkn("unified_mode_title")
    public final String title;

    public UnifiedModeTextData() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnifiedModeTextData copy$default(UnifiedModeTextData unifiedModeTextData, String str, String str2, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unifiedModeTextData.title;
        }
        if ((i & 2) != 0) {
            str2 = unifiedModeTextData.description;
        }
        if ((i & 4) != 0) {
            list = unifiedModeTextData.itemList;
        }
        if ((i & 8) != 0) {
            list2 = unifiedModeTextData.itemLinkList;
        }
        return unifiedModeTextData.copy(str, str2, list, list2);
    }

    public final UnifiedModeTextData copy(String str, String str2, List<String> list, List<String> list2) {
        return new UnifiedModeTextData(str, str2, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnifiedModeTextData)) {
            return false;
        }
        UnifiedModeTextData unifiedModeTextData = (UnifiedModeTextData) obj;
        return o.LJ(this.title, unifiedModeTextData.title) && o.LJ(this.description, unifiedModeTextData.description) && o.LJ(this.itemList, unifiedModeTextData.itemList) && o.LJ(this.itemLinkList, unifiedModeTextData.itemLinkList);
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.itemList;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.itemLinkList;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UnifiedModeTextData(title=");
        LIZ.append(this.title);
        LIZ.append(", description=");
        LIZ.append(this.description);
        LIZ.append(", itemList=");
        LIZ.append(this.itemList);
        LIZ.append(", itemLinkList=");
        return C1NE.LIZIZ(LIZ, this.itemLinkList, ')', LIZ);
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<String> getItemLinkList() {
        return this.itemLinkList;
    }

    public final List<String> getItemList() {
        return this.itemList;
    }

    public final String getTitle() {
        return this.title;
    }

    public UnifiedModeTextData(String str, String str2, List<String> list, List<String> list2) {
        this.title = str;
        this.description = str2;
        this.itemList = list;
        this.itemLinkList = list2;
    }

    public UnifiedModeTextData(String str, String str2, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? C61878OQg.INSTANCE : list, (i & 8) != 0 ? C61878OQg.INSTANCE : list2);
    }
}
