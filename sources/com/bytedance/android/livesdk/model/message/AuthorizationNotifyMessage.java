package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.DIX;
import X.EnumC31509CYf;
import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes17.dex */
public final class AuthorizationNotifyMessage extends CR6 {

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("from")
    public String from;

    @InterfaceC65349Pkn("style")
    public String style;

    @InterfaceC65349Pkn("user_content")
    public ContentBlock userContent;

    @InterfaceC65349Pkn("user_relation")
    public RelationBlock userRelation;

    /* loaded from: classes17.dex */
    public static final class ContentBlock extends F9E {

        @InterfaceC65349Pkn("content")
        public String content;

        @InterfaceC65349Pkn("detail")
        public String detail;

        @InterfaceC65349Pkn("is_authorized")
        public Boolean isAuthorized;

        @InterfaceC65349Pkn("show")
        public Boolean show;

        @InterfaceC65349Pkn("title")
        public String title;

        @Override // X.F9E
        public final Object[] getObjects() {
            Boolean bool = this.show;
            Boolean bool2 = this.isAuthorized;
            String str = this.title;
            String str2 = this.content;
            String str3 = this.detail;
            return new Object[]{bool, bool, bool2, bool2, str, str, str2, str2, str3, str3};
        }
    }

    /* loaded from: classes17.dex */
    public static final class RelationBlock extends F9E {

        @InterfaceC65349Pkn("content")
        public String content;

        @InterfaceC65349Pkn("detail")
        public String detail;

        @InterfaceC65349Pkn("is_authorized")
        public Boolean isAuthorized;

        @InterfaceC65349Pkn("show")
        public Boolean show;

        @InterfaceC65349Pkn("title")
        public String title;

        @Override // X.F9E
        public final Object[] getObjects() {
            Boolean bool = this.show;
            Boolean bool2 = this.isAuthorized;
            String str = this.title;
            String str2 = this.content;
            String str3 = this.detail;
            return new Object[]{bool, bool, bool2, bool2, str, str, str2, str2, str3, str3};
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.from != null) {
            sb.append(", from=");
            sb.append(this.from);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (this.style != null) {
            sb.append(", style=");
            sb.append(this.style);
        }
        if (this.userContent != null) {
            sb.append(", user_content=");
            sb.append(this.userContent);
        }
        if (this.userRelation != null) {
            sb.append(", user_relation=");
            sb.append(this.userRelation);
        }
        return DIX.LIZLLL(sb, 0, 2, "AuthorizationNotifyMessage{", '}');
    }

    public AuthorizationNotifyMessage() {
        this.type = EnumC31509CYf.AUTHORIZATION_NOTIFY_MESSAGE;
    }
}
