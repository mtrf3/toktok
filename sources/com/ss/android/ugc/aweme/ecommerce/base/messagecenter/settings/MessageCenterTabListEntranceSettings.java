package com.ss.android.ugc.aweme.ecommerce.base.messagecenter.settings;

import X.C1NE;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class MessageCenterTabListEntranceSettings {
    public static final TabListEntranceConfigModel LIZ;

    /* loaded from: classes7.dex */
    public static final class TabEntranceItem {

        @InterfaceC65349Pkn("dark_icon_url")
        public final String darkIconUrl;

        @InterfaceC65349Pkn("icon_url")
        public final String iconUrl;

        @InterfaceC65349Pkn("schema")
        public final String schema;

        @InterfaceC65349Pkn("title")
        public final String title;

        @InterfaceC65349Pkn("type")
        public final Integer type;

        /* JADX WARN: Multi-variable type inference failed */
        public TabEntranceItem() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TabEntranceItem)) {
                return false;
            }
            TabEntranceItem tabEntranceItem = (TabEntranceItem) obj;
            return o.LJ(this.darkIconUrl, tabEntranceItem.darkIconUrl) && o.LJ(this.iconUrl, tabEntranceItem.iconUrl) && o.LJ(this.schema, tabEntranceItem.schema) && o.LJ(this.title, tabEntranceItem.title) && o.LJ(this.type, tabEntranceItem.type);
        }

        public final int hashCode() {
            String str = this.darkIconUrl;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.iconUrl;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.schema;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.title;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Integer num = this.type;
            return hashCode4 + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("TabEntranceItem(darkIconUrl=");
            LIZ.append(this.darkIconUrl);
            LIZ.append(", iconUrl=");
            LIZ.append(this.iconUrl);
            LIZ.append(", schema=");
            LIZ.append(this.schema);
            LIZ.append(", title=");
            LIZ.append(this.title);
            LIZ.append(", type=");
            return s0.LIZJ(LIZ, this.type, ')', LIZ);
        }

        public TabEntranceItem(String str, String str2, String str3, String str4, Integer num) {
            this.darkIconUrl = str;
            this.iconUrl = str2;
            this.schema = str3;
            this.title = str4;
            this.type = num;
        }

        public /* synthetic */ TabEntranceItem(String str, String str2, String str3, String str4, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) == 0 ? num : null);
        }
    }

    /* loaded from: classes7.dex */
    public static final class TabListEntranceConfigModel {

        @InterfaceC65349Pkn("function_entrance_items")
        public final List<TabEntranceItem> functionEntranceItems;

        @InterfaceC65349Pkn("function_entrance_items_dark")
        public final List<TabEntranceItem> functionEntranceItemsDark;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TabListEntranceConfigModel)) {
                return false;
            }
            TabListEntranceConfigModel tabListEntranceConfigModel = (TabListEntranceConfigModel) obj;
            return o.LJ(this.functionEntranceItems, tabListEntranceConfigModel.functionEntranceItems) && o.LJ(this.functionEntranceItemsDark, tabListEntranceConfigModel.functionEntranceItemsDark);
        }

        public final int hashCode() {
            int hashCode = this.functionEntranceItems.hashCode() * 31;
            List<TabEntranceItem> list = this.functionEntranceItemsDark;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("TabListEntranceConfigModel(functionEntranceItems=");
            LIZ.append(this.functionEntranceItems);
            LIZ.append(", functionEntranceItemsDark=");
            return C1NE.LIZIZ(LIZ, this.functionEntranceItemsDark, ')', LIZ);
        }

        public TabListEntranceConfigModel(List<TabEntranceItem> functionEntranceItems, List<TabEntranceItem> list) {
            o.LJIIIZ(functionEntranceItems, "functionEntranceItems");
            this.functionEntranceItems = functionEntranceItems;
            this.functionEntranceItemsDark = list;
        }
    }

    static {
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        LIZ = new TabListEntranceConfigModel(c61878OQg, c61878OQg);
    }
}
