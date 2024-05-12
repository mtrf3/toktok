package com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.model;

import X.C07670Rv;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ActionBarButtonConf {

    @InterfaceC65349Pkn("action_schema")
    public final String actionSchema;

    @InterfaceC65349Pkn("animate_type")
    public final String animateType;

    @InterfaceC65349Pkn("animate_url")
    public final String animateUrl;

    @InterfaceC65349Pkn("display_name")
    public final String displayName;

    @InterfaceC65349Pkn("display_name_lang")
    public final DisplayNameLang displayNameLang;
    public final boolean fromEnterPageQuery;

    @InterfaceC65349Pkn("height")
    public final Integer height;

    @InterfaceC65349Pkn("icon")
    public final String icon;

    @InterfaceC65349Pkn("icon_dark")
    public final String iconDark;

    @InterfaceC65349Pkn("id")
    public final Long id;
    public final boolean isShow;
    public final String queryMessageId;

    @InterfaceC65349Pkn("resource_id")
    public final Long resourceId;

    @InterfaceC65349Pkn("resource_name")
    public final String resourceName;

    @InterfaceC65349Pkn("static_type")
    public final String staticType;

    @InterfaceC65349Pkn("static_url")
    public final String staticUrl;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("type")
    public final Integer type;

    @InterfaceC65349Pkn("width")
    public final Integer width;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ActionBarButtonConf() {
        /*
            r22 = this;
            r1 = 0
            r17 = 0
            r20 = 524287(0x7ffff, float:7.34683E-40)
            r0 = r22
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            r9 = r1
            r10 = r1
            r11 = r1
            r12 = r1
            r13 = r1
            r14 = r1
            r15 = r1
            r16 = r1
            r18 = r17
            r19 = r1
            r21 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.model.ActionBarButtonConf.<init>():void");
    }

    public static /* synthetic */ ActionBarButtonConf copy$default(ActionBarButtonConf actionBarButtonConf, Integer num, String str, String str2, String str3, String str4, Long l, Long l2, String str5, Integer num2, Integer num3, String str6, String str7, String str8, String str9, DisplayNameLang displayNameLang, String str10, boolean z, boolean z2, String str11, int i, Object obj) {
        Integer num4 = num;
        String str12 = str;
        String str13 = str5;
        Long l3 = l2;
        Long l4 = l;
        String str14 = str4;
        String str15 = str2;
        String str16 = str3;
        String str17 = str9;
        String str18 = str8;
        String str19 = str7;
        String str20 = str6;
        Integer num5 = num2;
        Integer num6 = num3;
        String str21 = str11;
        boolean z3 = z2;
        boolean z4 = z;
        DisplayNameLang displayNameLang2 = displayNameLang;
        String str22 = str10;
        if ((i & 1) != 0) {
            num4 = actionBarButtonConf.type;
        }
        if ((i & 2) != 0) {
            str12 = actionBarButtonConf.actionSchema;
        }
        if ((i & 4) != 0) {
            str15 = actionBarButtonConf.title;
        }
        if ((i & 8) != 0) {
            str16 = actionBarButtonConf.icon;
        }
        if ((i & 16) != 0) {
            str14 = actionBarButtonConf.iconDark;
        }
        if ((i & 32) != 0) {
            l4 = actionBarButtonConf.id;
        }
        if ((i & 64) != 0) {
            l3 = actionBarButtonConf.resourceId;
        }
        if ((i & 128) != 0) {
            str13 = actionBarButtonConf.displayName;
        }
        if ((i & 256) != 0) {
            num5 = actionBarButtonConf.width;
        }
        if ((i & 512) != 0) {
            num6 = actionBarButtonConf.height;
        }
        if ((i & 1024) != 0) {
            str20 = actionBarButtonConf.staticUrl;
        }
        if ((i & 2048) != 0) {
            str19 = actionBarButtonConf.animateUrl;
        }
        if ((i & 4096) != 0) {
            str18 = actionBarButtonConf.staticType;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            str17 = actionBarButtonConf.animateType;
        }
        if ((i & 16384) != 0) {
            displayNameLang2 = actionBarButtonConf.displayNameLang;
        }
        if ((32768 & i) != 0) {
            str22 = actionBarButtonConf.resourceName;
        }
        if ((65536 & i) != 0) {
            z4 = actionBarButtonConf.isShow;
        }
        if ((131072 & i) != 0) {
            z3 = actionBarButtonConf.fromEnterPageQuery;
        }
        if ((i & 262144) != 0) {
            str21 = actionBarButtonConf.queryMessageId;
        }
        Long l5 = l3;
        return actionBarButtonConf.copy(num4, str12, str15, str16, str14, l4, l5, str13, num5, num6, str20, str19, str18, str17, displayNameLang2, str22, z4, z3, str21);
    }

    public final ActionBarButtonConf copy(Integer num, String str, String str2, String str3, String str4, Long l, Long l2, String str5, Integer num2, Integer num3, String str6, String str7, String str8, String str9, DisplayNameLang displayNameLang, String str10, boolean z, boolean z2, String queryMessageId) {
        o.LJIIIZ(queryMessageId, "queryMessageId");
        return new ActionBarButtonConf(num, str, str2, str3, str4, l, l2, str5, num2, num3, str6, str7, str8, str9, displayNameLang, str10, z, z2, queryMessageId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionBarButtonConf)) {
            return false;
        }
        ActionBarButtonConf actionBarButtonConf = (ActionBarButtonConf) obj;
        return o.LJ(this.type, actionBarButtonConf.type) && o.LJ(this.actionSchema, actionBarButtonConf.actionSchema) && o.LJ(this.title, actionBarButtonConf.title) && o.LJ(this.icon, actionBarButtonConf.icon) && o.LJ(this.iconDark, actionBarButtonConf.iconDark) && o.LJ(this.id, actionBarButtonConf.id) && o.LJ(this.resourceId, actionBarButtonConf.resourceId) && o.LJ(this.displayName, actionBarButtonConf.displayName) && o.LJ(this.width, actionBarButtonConf.width) && o.LJ(this.height, actionBarButtonConf.height) && o.LJ(this.staticUrl, actionBarButtonConf.staticUrl) && o.LJ(this.animateUrl, actionBarButtonConf.animateUrl) && o.LJ(this.staticType, actionBarButtonConf.staticType) && o.LJ(this.animateType, actionBarButtonConf.animateType) && o.LJ(this.displayNameLang, actionBarButtonConf.displayNameLang) && o.LJ(this.resourceName, actionBarButtonConf.resourceName) && this.isShow == actionBarButtonConf.isShow && this.fromEnterPageQuery == actionBarButtonConf.fromEnterPageQuery && o.LJ(this.queryMessageId, actionBarButtonConf.queryMessageId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        Integer num = this.type;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.actionSchema;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.icon;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.iconDark;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.id;
        int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.resourceId;
        int hashCode7 = (hashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str5 = this.displayName;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.width;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.height;
        int hashCode10 = (hashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str6 = this.staticUrl;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.animateUrl;
        int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.staticType;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.animateType;
        int hashCode14 = (hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        DisplayNameLang displayNameLang = this.displayNameLang;
        int hashCode15 = (hashCode14 + (displayNameLang == null ? 0 : displayNameLang.hashCode())) * 31;
        String str10 = this.resourceName;
        int hashCode16 = (hashCode15 + (str10 != null ? str10.hashCode() : 0)) * 31;
        boolean z = this.isShow;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return this.queryMessageId.hashCode() + ((((hashCode16 + i) * 31) + (this.fromEnterPageQuery ? 1 : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ActionBarButtonConf(type=");
        sb.append(this.type);
        sb.append(", actionSchema=");
        sb.append(this.actionSchema);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", iconDark=");
        sb.append(this.iconDark);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", resourceId=");
        sb.append(this.resourceId);
        sb.append(", displayName=");
        sb.append(this.displayName);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", staticUrl=");
        sb.append(this.staticUrl);
        sb.append(", animateUrl=");
        sb.append(this.animateUrl);
        sb.append(", staticType=");
        sb.append(this.staticType);
        sb.append(", animateType=");
        sb.append(this.animateType);
        sb.append(", displayNameLang=");
        sb.append(this.displayNameLang);
        sb.append(", resourceName=");
        sb.append(this.resourceName);
        sb.append(", isShow=");
        sb.append(this.isShow);
        sb.append(", fromEnterPageQuery=");
        sb.append(this.fromEnterPageQuery);
        sb.append(", queryMessageId=");
        return C07670Rv.LIZIZ(sb, this.queryMessageId, ')');
    }

    public final String getActionSchema() {
        return this.actionSchema;
    }

    public final String getAnimateType() {
        return this.animateType;
    }

    public final String getAnimateUrl() {
        return this.animateUrl;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final DisplayNameLang getDisplayNameLang() {
        return this.displayNameLang;
    }

    public final boolean getFromEnterPageQuery() {
        return this.fromEnterPageQuery;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getIconDark() {
        return this.iconDark;
    }

    public final Long getId() {
        return this.id;
    }

    public final String getQueryMessageId() {
        return this.queryMessageId;
    }

    public final Long getResourceId() {
        return this.resourceId;
    }

    public final String getResourceName() {
        return this.resourceName;
    }

    public final String getStaticType() {
        return this.staticType;
    }

    public final String getStaticUrl() {
        return this.staticUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Integer getType() {
        return this.type;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public final boolean isShow() {
        return this.isShow;
    }

    public ActionBarButtonConf(Integer num, String str, String str2, String str3, String str4, Long l, Long l2, String str5, Integer num2, Integer num3, String str6, String str7, String str8, String str9, DisplayNameLang displayNameLang, String str10, boolean z, boolean z2, String queryMessageId) {
        o.LJIIIZ(queryMessageId, "queryMessageId");
        this.type = num;
        this.actionSchema = str;
        this.title = str2;
        this.icon = str3;
        this.iconDark = str4;
        this.id = l;
        this.resourceId = l2;
        this.displayName = str5;
        this.width = num2;
        this.height = num3;
        this.staticUrl = str6;
        this.animateUrl = str7;
        this.staticType = str8;
        this.animateType = str9;
        this.displayNameLang = displayNameLang;
        this.resourceName = str10;
        this.isShow = z;
        this.fromEnterPageQuery = z2;
        this.queryMessageId = queryMessageId;
    }

    public /* synthetic */ ActionBarButtonConf(Integer num, String str, String str2, String str3, String str4, Long l, Long l2, String str5, Integer num2, Integer num3, String str6, String str7, String str8, String str9, DisplayNameLang displayNameLang, String str10, boolean z, boolean z2, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : l2, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : num2, (i & 512) != 0 ? null : num3, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : str7, (i & 4096) != 0 ? null : str8, (i & FileUtils.BUFFER_SIZE) != 0 ? null : str9, (i & 16384) != 0 ? null : displayNameLang, (32768 & i) != 0 ? null : str10, (65536 & i) != 0 ? true : z, (131072 & i) != 0 ? false : z2, (i & 262144) != 0 ? "" : str11);
    }
}
