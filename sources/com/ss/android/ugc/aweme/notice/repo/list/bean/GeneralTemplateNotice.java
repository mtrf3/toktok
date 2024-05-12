package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C07670Rv;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class GeneralTemplateNotice {
    public int LIZ;
    public final String LIZIZ;

    @InterfaceC65349Pkn("action_meta")
    public final String actionMeta;

    @InterfaceC65349Pkn("actions")
    public final ActionToReportStruct actions;

    @InterfaceC65349Pkn("create_time")
    public final Long createTime;

    @InterfaceC65349Pkn("extra_data")
    public final NoticeExtraData extraData;

    @InterfaceC65349Pkn("has_read")
    public final boolean hasRead;

    @InterfaceC65349Pkn("legacy_sub_type")
    public final Integer legacySubType;

    @InterfaceC65349Pkn("message_extra")
    public final String messageExtra;

    @InterfaceC65349Pkn("nid")
    public final Long nid;

    @InterfaceC65349Pkn("nid_str")
    public final String nidStr;

    @InterfaceC65349Pkn("schema_url")
    public final String schemaUrl;

    @InterfaceC65349Pkn("should_keep")
    public final boolean shouldKeep;

    @InterfaceC65349Pkn("type")
    public final Integer type;

    @InterfaceC65349Pkn("notice")
    public final NoticeUITemplate uiTemplate;

    @InterfaceC65349Pkn("user_id")
    public final Long userId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeneralTemplateNotice)) {
            return false;
        }
        GeneralTemplateNotice generalTemplateNotice = (GeneralTemplateNotice) obj;
        return o.LJ(this.nid, generalTemplateNotice.nid) && o.LJ(this.uiTemplate, generalTemplateNotice.uiTemplate) && o.LJ(this.extraData, generalTemplateNotice.extraData) && o.LJ(this.createTime, generalTemplateNotice.createTime) && o.LJ(this.userId, generalTemplateNotice.userId) && o.LJ(this.type, generalTemplateNotice.type) && o.LJ(this.legacySubType, generalTemplateNotice.legacySubType) && o.LJ(this.nidStr, generalTemplateNotice.nidStr) && this.hasRead == generalTemplateNotice.hasRead && o.LJ(this.schemaUrl, generalTemplateNotice.schemaUrl) && o.LJ(this.messageExtra, generalTemplateNotice.messageExtra) && this.shouldKeep == generalTemplateNotice.shouldKeep && o.LJ(this.actions, generalTemplateNotice.actions) && o.LJ(this.actionMeta, generalTemplateNotice.actionMeta) && this.LIZ == generalTemplateNotice.LIZ && o.LJ(this.LIZIZ, generalTemplateNotice.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Long l = this.nid;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        NoticeUITemplate noticeUITemplate = this.uiTemplate;
        int hashCode2 = (hashCode + (noticeUITemplate == null ? 0 : noticeUITemplate.hashCode())) * 31;
        NoticeExtraData noticeExtraData = this.extraData;
        int hashCode3 = (hashCode2 + (noticeExtraData == null ? 0 : noticeExtraData.hashCode())) * 31;
        Long l2 = this.createTime;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.userId;
        int hashCode5 = (hashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num = this.type;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.legacySubType;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.nidStr;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.hasRead;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode8 + i) * 31;
        String str2 = this.schemaUrl;
        int hashCode9 = (i2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.messageExtra;
        int hashCode10 = (((hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31) + (this.shouldKeep ? 1 : 0)) * 31;
        ActionToReportStruct actionToReportStruct = this.actions;
        int hashCode11 = (hashCode10 + (actionToReportStruct == null ? 0 : actionToReportStruct.hashCode())) * 31;
        String str4 = this.actionMeta;
        int hashCode12 = (((hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.LIZ) * 31;
        String str5 = this.LIZIZ;
        return hashCode12 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GeneralTemplateNotice(nid=");
        sb.append(this.nid);
        sb.append(", uiTemplate=");
        sb.append(this.uiTemplate);
        sb.append(", extraData=");
        sb.append(this.extraData);
        sb.append(", createTime=");
        sb.append(this.createTime);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", legacySubType=");
        sb.append(this.legacySubType);
        sb.append(", nidStr=");
        sb.append(this.nidStr);
        sb.append(", hasRead=");
        sb.append(this.hasRead);
        sb.append(", schemaUrl=");
        sb.append(this.schemaUrl);
        sb.append(", messageExtra=");
        sb.append(this.messageExtra);
        sb.append(", shouldKeep=");
        sb.append(this.shouldKeep);
        sb.append(", actions=");
        sb.append(this.actions);
        sb.append(", actionMeta=");
        sb.append(this.actionMeta);
        sb.append(", groupType=");
        sb.append(this.LIZ);
        sb.append(", accountType=");
        return C07670Rv.LIZIZ(sb, this.LIZIZ, ')');
    }

    public GeneralTemplateNotice(Long l, NoticeUITemplate noticeUITemplate, NoticeExtraData noticeExtraData, Long l2, Long l3, Integer num, Integer num2, String str, boolean z, String str2, String str3, boolean z2, ActionToReportStruct actionToReportStruct, String str4, int i, String str5) {
        this.nid = l;
        this.uiTemplate = noticeUITemplate;
        this.extraData = noticeExtraData;
        this.createTime = l2;
        this.userId = l3;
        this.type = num;
        this.legacySubType = num2;
        this.nidStr = str;
        this.hasRead = z;
        this.schemaUrl = str2;
        this.messageExtra = str3;
        this.shouldKeep = z2;
        this.actions = actionToReportStruct;
        this.actionMeta = str4;
        this.LIZ = i;
        this.LIZIZ = str5;
    }

    public /* synthetic */ GeneralTemplateNotice(Long l, NoticeUITemplate noticeUITemplate, NoticeExtraData noticeExtraData, Long l2, Long l3, Integer num, Integer num2, String str, boolean z, String str2, String str3, boolean z2, ActionToReportStruct actionToReportStruct, String str4, int i, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, noticeUITemplate, (i2 & 4) != 0 ? null : noticeExtraData, l2, l3, num, num2, str, (i2 & 256) != 0 ? false : z, str2, str3, (i2 & 2048) != 0 ? false : z2, actionToReportStruct, str4, (i2 & 16384) != 0 ? -1 : i, (i2 & 32768) == 0 ? str5 : null);
    }
}
