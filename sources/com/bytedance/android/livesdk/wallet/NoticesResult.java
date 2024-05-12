package com.bytedance.android.livesdk.wallet;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes14.dex */
public final class NoticesResult extends F9E {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes14.dex */
    public static final class Data extends F9E {

        @InterfaceC65349Pkn("notices")
        public List<Notice> notices;

        @Override // X.F9E
        public final Object[] getObjects() {
            List<Notice> list = this.notices;
            return new Object[]{list, list, list};
        }
    }

    /* loaded from: classes14.dex */
    public static final class Notice extends F9E {

        @InterfaceC65349Pkn("closable")
        public Boolean closable;

        @InterfaceC65349Pkn("content")
        public String content;

        @InterfaceC65349Pkn("id")
        public String id;

        @InterfaceC65349Pkn("max_view_count")
        public int maxViewCount;

        @InterfaceC65349Pkn("priority")
        public int priority;

        @InterfaceC65349Pkn("schema_text")
        public String schemaText;

        @InterfaceC65349Pkn("schema_url")
        public String schemaUrl;

        @InterfaceC65349Pkn("style")
        public Style style;

        @InterfaceC65349Pkn("title")
        public String title;

        @Override // X.F9E
        public final Object[] getObjects() {
            String str = this.id;
            String str2 = this.title;
            String str3 = this.content;
            Style style = this.style;
            String str4 = this.schemaText;
            String str5 = this.schemaUrl;
            Boolean bool = this.closable;
            return new Object[]{str, str, str2, str2, str3, str3, Integer.valueOf(this.priority), style, style, str4, str4, str5, str5, bool, bool};
        }
    }

    /* loaded from: classes14.dex */
    public static final class Style extends F9E {

        @InterfaceC65349Pkn("background_color_code")
        public String backgroundColorCode;

        @InterfaceC65349Pkn("icon")
        public int icon;

        @InterfaceC65349Pkn("notification_style")
        public int notificationStyle;

        @Override // X.F9E
        public final Object[] getObjects() {
            String str = this.backgroundColorCode;
            return new Object[]{str, str, Integer.valueOf(this.icon)};
        }
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        Data data = this.data;
        return new Object[]{data, data};
    }
}
