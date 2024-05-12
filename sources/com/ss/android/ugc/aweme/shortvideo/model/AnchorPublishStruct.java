package com.ss.android.ugc.aweme.shortvideo.model;

import X.C07670Rv;
import X.C1JX;
import X.C76800UCe;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.InterfaceC65784Pro;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class AnchorPublishStruct {
    public static final Companion Companion = new Companion();

    @InterfaceC65349Pkn("added_icon")
    public final UrlModel addedIcon;

    @InterfaceC65349Pkn("anchor_tips")
    public String anchorTips;

    @InterfaceC65349Pkn("product_link_id")
    public String baProductLinkId;

    @InterfaceC65349Pkn("product_link_state")
    public int baProductLinkState;

    @InterfaceC65349Pkn("content")
    public final String content;

    @InterfaceC65349Pkn("desc")
    public final String desc;

    @InterfaceC65349Pkn("direct_add")
    public final boolean directAdd;

    @InterfaceC65349Pkn("display")
    public final boolean display;
    public transient boolean enable;
    public transient ExtensionMisc extensionMisc;

    @InterfaceC65349Pkn("leads_state")
    public int getLeadsAnchorState;

    @InterfaceC65349Pkn("leads_pageid")
    public String getLeadsPageId;
    public transient boolean hadNew;

    @InterfaceC65349Pkn("hashtag")
    public final String hashtag;

    @InterfaceC65349Pkn("icon")
    public final UrlModel icon;

    @InterfaceC65349Pkn("is_beta")
    public final boolean isBeta;
    public transient Boolean isEcIncrementalCreator;

    @InterfaceC65349Pkn("is_new")
    public boolean isNew;

    @InterfaceC65349Pkn("is_recommend")
    public boolean isRecommend;

    @InterfaceC65349Pkn("log_extra")
    public final String logExtra;
    public transient InterfaceC65784Pro<C76800UCe> onClickAction;

    @InterfaceC65349Pkn("schema_url")
    public final String scheme;

    @InterfaceC65349Pkn("scope")
    public final int scope;

    @InterfaceC65349Pkn("subtitle")
    public final String subtitle;

    @InterfaceC65349Pkn("subtype")
    public final String subtype;

    @InterfaceC65349Pkn("text_after_direct_add")
    public final String textAfterDirectAdd;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("type")
    public final int type;

    @InterfaceC65349Pkn("web_url")
    public final String webUrl;

    public static /* synthetic */ AnchorPublishStruct copy$default(AnchorPublishStruct anchorPublishStruct, int i, UrlModel urlModel, String str, String str2, UrlModel urlModel2, String str3, String str4, boolean z, boolean z2, String str5, String str6, int i2, InterfaceC65784Pro interfaceC65784Pro, ExtensionMisc extensionMisc, boolean z3, String str7, String str8, boolean z4, String str9, String str10, boolean z5, int i3, String str11, boolean z6, boolean z7, String str12, int i4, String str13, int i5, Object obj) {
        InterfaceC65784Pro interfaceC65784Pro2 = interfaceC65784Pro;
        int i6 = i2;
        String str14 = str6;
        String str15 = str5;
        boolean z8 = z2;
        boolean z9 = z;
        ExtensionMisc extensionMisc2 = extensionMisc;
        String str16 = str4;
        UrlModel urlModel3 = urlModel;
        int i7 = i;
        String str17 = str;
        String str18 = str2;
        UrlModel urlModel4 = urlModel2;
        String str19 = str3;
        String str20 = str13;
        String str21 = str12;
        boolean z10 = z7;
        boolean z11 = z6;
        String str22 = str11;
        int i8 = i3;
        boolean z12 = z5;
        String str23 = str7;
        int i9 = i4;
        boolean z13 = z3;
        String str24 = str8;
        boolean z14 = z4;
        String str25 = str9;
        String str26 = str10;
        if ((i5 & 1) != 0) {
            i7 = anchorPublishStruct.type;
        }
        if ((i5 & 2) != 0) {
            urlModel3 = anchorPublishStruct.icon;
        }
        if ((i5 & 4) != 0) {
            str17 = anchorPublishStruct.title;
        }
        if ((i5 & 8) != 0) {
            str18 = anchorPublishStruct.webUrl;
        }
        if ((i5 & 16) != 0) {
            urlModel4 = anchorPublishStruct.addedIcon;
        }
        if ((i5 & 32) != 0) {
            str19 = anchorPublishStruct.desc;
        }
        if ((i5 & 64) != 0) {
            str16 = anchorPublishStruct.content;
        }
        if ((i5 & 128) != 0) {
            z9 = anchorPublishStruct.isRecommend;
        }
        if ((i5 & 256) != 0) {
            z8 = anchorPublishStruct.isBeta;
        }
        if ((i5 & 512) != 0) {
            str15 = anchorPublishStruct.hashtag;
        }
        if ((i5 & 1024) != 0) {
            str14 = anchorPublishStruct.anchorTips;
        }
        if ((i5 & 2048) != 0) {
            i6 = anchorPublishStruct.scope;
        }
        if ((i5 & 4096) != 0) {
            interfaceC65784Pro2 = anchorPublishStruct.onClickAction;
        }
        if ((i5 & FileUtils.BUFFER_SIZE) != 0) {
            extensionMisc2 = anchorPublishStruct.extensionMisc;
        }
        if ((i5 & 16384) != 0) {
            z13 = anchorPublishStruct.enable;
        }
        if ((32768 & i5) != 0) {
            str23 = anchorPublishStruct.scheme;
        }
        if ((65536 & i5) != 0) {
            str24 = anchorPublishStruct.logExtra;
        }
        if ((131072 & i5) != 0) {
            z14 = anchorPublishStruct.isNew;
        }
        if ((262144 & i5) != 0) {
            str25 = anchorPublishStruct.subtitle;
        }
        if ((524288 & i5) != 0) {
            str26 = anchorPublishStruct.subtype;
        }
        if ((1048576 & i5) != 0) {
            z12 = anchorPublishStruct.hadNew;
        }
        if ((2097152 & i5) != 0) {
            i8 = anchorPublishStruct.getLeadsAnchorState;
        }
        if ((4194304 & i5) != 0) {
            str22 = anchorPublishStruct.getLeadsPageId;
        }
        if ((8388608 & i5) != 0) {
            z11 = anchorPublishStruct.display;
        }
        if ((16777216 & i5) != 0) {
            z10 = anchorPublishStruct.directAdd;
        }
        if ((33554432 & i5) != 0) {
            str21 = anchorPublishStruct.textAfterDirectAdd;
        }
        if ((67108864 & i5) != 0) {
            i9 = anchorPublishStruct.baProductLinkState;
        }
        if ((i5 & 134217728) != 0) {
            str20 = anchorPublishStruct.baProductLinkId;
        }
        int i10 = i9;
        String str27 = str20;
        return anchorPublishStruct.copy(i7, urlModel3, str17, str18, urlModel4, str19, str16, z9, z8, str15, str14, i6, interfaceC65784Pro2, extensionMisc2, z13, str23, str24, z14, str25, str26, z12, i8, str22, z11, z10, str21, i10, str27);
    }

    public final AnchorPublishStruct copy(int i, UrlModel icon, String title, String str, UrlModel addedIcon, String str2, String str3, boolean z, boolean z2, String str4, String str5, int i2, InterfaceC65784Pro<C76800UCe> onClickAction, ExtensionMisc extensionMisc, boolean z3, String str6, String str7, boolean z4, String str8, String str9, boolean z5, int i3, String str10, boolean z6, boolean z7, String textAfterDirectAdd, int i4, String str11) {
        o.LJIIIZ(icon, "icon");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(addedIcon, "addedIcon");
        o.LJIIIZ(onClickAction, "onClickAction");
        o.LJIIIZ(extensionMisc, "extensionMisc");
        o.LJIIIZ(textAfterDirectAdd, "textAfterDirectAdd");
        return new AnchorPublishStruct(i, icon, title, str, addedIcon, str2, str3, z, z2, str4, str5, i2, onClickAction, extensionMisc, z3, str6, str7, z4, str8, str9, z5, i3, str10, z6, z7, textAfterDirectAdd, i4, str11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchorPublishStruct)) {
            return false;
        }
        AnchorPublishStruct anchorPublishStruct = (AnchorPublishStruct) obj;
        return this.type == anchorPublishStruct.type && o.LJ(this.icon, anchorPublishStruct.icon) && o.LJ(this.title, anchorPublishStruct.title) && o.LJ(this.webUrl, anchorPublishStruct.webUrl) && o.LJ(this.addedIcon, anchorPublishStruct.addedIcon) && o.LJ(this.desc, anchorPublishStruct.desc) && o.LJ(this.content, anchorPublishStruct.content) && this.isRecommend == anchorPublishStruct.isRecommend && this.isBeta == anchorPublishStruct.isBeta && o.LJ(this.hashtag, anchorPublishStruct.hashtag) && o.LJ(this.anchorTips, anchorPublishStruct.anchorTips) && this.scope == anchorPublishStruct.scope && o.LJ(this.onClickAction, anchorPublishStruct.onClickAction) && o.LJ(this.extensionMisc, anchorPublishStruct.extensionMisc) && this.enable == anchorPublishStruct.enable && o.LJ(this.scheme, anchorPublishStruct.scheme) && o.LJ(this.logExtra, anchorPublishStruct.logExtra) && this.isNew == anchorPublishStruct.isNew && o.LJ(this.subtitle, anchorPublishStruct.subtitle) && o.LJ(this.subtype, anchorPublishStruct.subtype) && this.hadNew == anchorPublishStruct.hadNew && this.getLeadsAnchorState == anchorPublishStruct.getLeadsAnchorState && o.LJ(this.getLeadsPageId, anchorPublishStruct.getLeadsPageId) && this.display == anchorPublishStruct.display && this.directAdd == anchorPublishStruct.directAdd && o.LJ(this.textAfterDirectAdd, anchorPublishStruct.textAfterDirectAdd) && this.baProductLinkState == anchorPublishStruct.baProductLinkState && o.LJ(this.baProductLinkId, anchorPublishStruct.baProductLinkId);
    }

    public final boolean getEcIncrementalCreator() {
        boolean z;
        Boolean valueOf;
        if (this.isEcIncrementalCreator == null) {
            if (this.content != null) {
                try {
                    z = new JSONObject(this.content).optBoolean("is_incr_anchor_permission", false);
                } catch (JSONException unused) {
                    z = false;
                }
                valueOf = Boolean.valueOf(z);
            } else {
                valueOf = Boolean.FALSE;
            }
            this.isEcIncrementalCreator = valueOf;
        }
        Boolean bool = this.isEcIncrementalCreator;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int LJ = C79062V1e.LJ(this.title, (this.icon.hashCode() + (this.type * 31)) * 31, 31);
        String str = this.webUrl;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode11 = (this.addedIcon.hashCode() + ((LJ + hashCode) * 31)) * 31;
        String str2 = this.desc;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (hashCode11 + hashCode2) * 31;
        String str3 = this.content;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        boolean z = this.isRecommend;
        int i4 = 1;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        int i6 = (i3 + i5) * 31;
        boolean z2 = this.isBeta;
        int i7 = z2;
        if (z2 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        String str4 = this.hashtag;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i9 = (i8 + hashCode4) * 31;
        String str5 = this.anchorTips;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int hashCode12 = (this.extensionMisc.hashCode() + C1JX.LIZLLL(this.onClickAction, (((i9 + hashCode5) * 31) + this.scope) * 31, 31)) * 31;
        boolean z3 = this.enable;
        int i10 = z3;
        if (z3 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode12 + i10) * 31;
        String str6 = this.scheme;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i12 = (i11 + hashCode6) * 31;
        String str7 = this.logExtra;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i13 = (i12 + hashCode7) * 31;
        boolean z4 = this.isNew;
        int i14 = z4;
        if (z4 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        String str8 = this.subtitle;
        if (str8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str8.hashCode();
        }
        int i16 = (i15 + hashCode8) * 31;
        String str9 = this.subtype;
        if (str9 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str9.hashCode();
        }
        int i17 = (i16 + hashCode9) * 31;
        boolean z5 = this.hadNew;
        int i18 = z5;
        if (z5 != 0) {
            i18 = 1;
        }
        int i19 = (((i17 + i18) * 31) + this.getLeadsAnchorState) * 31;
        String str10 = this.getLeadsPageId;
        if (str10 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str10.hashCode();
        }
        int i20 = (i19 + hashCode10) * 31;
        boolean z6 = this.display;
        int i21 = z6;
        if (z6 != 0) {
            i21 = 1;
        }
        int i22 = (i20 + i21) * 31;
        if (!this.directAdd) {
            i4 = 0;
        }
        int LJ2 = (C79062V1e.LJ(this.textAfterDirectAdd, (i22 + i4) * 31, 31) + this.baProductLinkState) * 31;
        String str11 = this.baProductLinkId;
        if (str11 != null) {
            i = str11.hashCode();
        }
        return LJ2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AnchorPublishStruct(type=");
        sb.append(this.type);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", webUrl=");
        sb.append(this.webUrl);
        sb.append(", addedIcon=");
        sb.append(this.addedIcon);
        sb.append(", desc=");
        sb.append(this.desc);
        sb.append(", content=");
        sb.append(this.content);
        sb.append(", isRecommend=");
        sb.append(this.isRecommend);
        sb.append(", isBeta=");
        sb.append(this.isBeta);
        sb.append(", hashtag=");
        sb.append(this.hashtag);
        sb.append(", anchorTips=");
        sb.append(this.anchorTips);
        sb.append(", scope=");
        sb.append(this.scope);
        sb.append(", onClickAction=");
        sb.append(this.onClickAction);
        sb.append(", extensionMisc=");
        sb.append(this.extensionMisc);
        sb.append(", enable=");
        sb.append(this.enable);
        sb.append(", scheme=");
        sb.append(this.scheme);
        sb.append(", logExtra=");
        sb.append(this.logExtra);
        sb.append(", isNew=");
        sb.append(this.isNew);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", subtype=");
        sb.append(this.subtype);
        sb.append(", hadNew=");
        sb.append(this.hadNew);
        sb.append(", getLeadsAnchorState=");
        sb.append(this.getLeadsAnchorState);
        sb.append(", getLeadsPageId=");
        sb.append(this.getLeadsPageId);
        sb.append(", display=");
        sb.append(this.display);
        sb.append(", directAdd=");
        sb.append(this.directAdd);
        sb.append(", textAfterDirectAdd=");
        sb.append(this.textAfterDirectAdd);
        sb.append(", baProductLinkState=");
        sb.append(this.baProductLinkState);
        sb.append(", baProductLinkId=");
        return C07670Rv.LIZIZ(sb, this.baProductLinkId, ')');
    }

    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final void setExtensionMisc(ExtensionMisc extensionMisc) {
        o.LJIIIZ(extensionMisc, "<set-?>");
        this.extensionMisc = extensionMisc;
    }

    public final void setOnClickAction(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(interfaceC65784Pro, "<set-?>");
        this.onClickAction = interfaceC65784Pro;
    }

    public AnchorPublishStruct(int i, UrlModel icon, String title, String str, UrlModel addedIcon, String str2, String str3, boolean z, boolean z2, String str4, String str5, int i2, InterfaceC65784Pro<C76800UCe> onClickAction, ExtensionMisc extensionMisc, boolean z3, String str6, String str7, boolean z4, String str8, String str9, boolean z5, int i3, String str10, boolean z6, boolean z7, String textAfterDirectAdd, int i4, String str11) {
        o.LJIIIZ(icon, "icon");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(addedIcon, "addedIcon");
        o.LJIIIZ(onClickAction, "onClickAction");
        o.LJIIIZ(extensionMisc, "extensionMisc");
        o.LJIIIZ(textAfterDirectAdd, "textAfterDirectAdd");
        this.type = i;
        this.icon = icon;
        this.title = title;
        this.webUrl = str;
        this.addedIcon = addedIcon;
        this.desc = str2;
        this.content = str3;
        this.isRecommend = z;
        this.isBeta = z2;
        this.hashtag = str4;
        this.anchorTips = str5;
        this.scope = i2;
        this.onClickAction = onClickAction;
        this.extensionMisc = extensionMisc;
        this.enable = z3;
        this.scheme = str6;
        this.logExtra = str7;
        this.isNew = z4;
        this.subtitle = str8;
        this.subtype = str9;
        this.hadNew = z5;
        this.getLeadsAnchorState = i3;
        this.getLeadsPageId = str10;
        this.display = z6;
        this.directAdd = z7;
        this.textAfterDirectAdd = textAfterDirectAdd;
        this.baProductLinkState = i4;
        this.baProductLinkId = str11;
    }

    public /* synthetic */ AnchorPublishStruct(int i, UrlModel urlModel, String str, String str2, UrlModel urlModel2, String str3, String str4, boolean z, boolean z2, String str5, String str6, int i2, InterfaceC65784Pro interfaceC65784Pro, ExtensionMisc extensionMisc, boolean z3, String str7, String str8, boolean z4, String str9, String str10, boolean z5, int i3, String str11, boolean z6, boolean z7, String str12, int i4, String str13, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, urlModel, str, str2, urlModel2, str3, str4, (i5 & 128) != 0 ? false : z, (i5 & 256) != 0 ? false : z2, str5, str6, i2, interfaceC65784Pro, extensionMisc, (i5 & 16384) != 0 ? true : z3, (32768 & i5) != 0 ? "" : str7, (65536 & i5) != 0 ? null : str8, (131072 & i5) != 0 ? false : z4, (262144 & i5) != 0 ? "" : str9, (524288 & i5) == 0 ? str10 : null, (1048576 & i5) != 0 ? false : z5, (2097152 & i5) != 0 ? 1 : i3, (4194304 & i5) != 0 ? "" : str11, (8388608 & i5) != 0 ? true : z6, (16777216 & i5) != 0 ? false : z7, (33554432 & i5) != 0 ? "" : str12, (67108864 & i5) != 0 ? 0 : i4, (i5 & 134217728) == 0 ? str13 : "");
    }
}
