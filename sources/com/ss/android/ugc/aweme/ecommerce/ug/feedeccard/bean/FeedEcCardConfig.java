package com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import defpackage.q;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class FeedEcCardConfig {

    @InterfaceC65349Pkn("audience_id")
    public final String audienceId;

    @InterfaceC65349Pkn("buy_type")
    public final Integer buyType;

    @InterfaceC65349Pkn("card_info")
    public final FeedEcCardInfo cardInfo;

    @InterfaceC65349Pkn("card_subtype")
    public final Integer cardSubtype;

    @InterfaceC65349Pkn("content_type")
    public final Integer contentType;

    @InterfaceC65349Pkn("is_cold")
    public final Integer isCold;

    @InterfaceC65349Pkn("is_offline")
    public final Integer isOffline;

    @InterfaceC65349Pkn("price_type")
    public final String priceType;

    @InterfaceC65349Pkn("product_info_list")
    public final List<FeedEcCardProductInfo> productInfoList;

    @InterfaceC65349Pkn("product_show_num")
    public final Integer productShowNum;

    @InterfaceC65349Pkn("resource_key")
    public final String resourceKey;

    @InterfaceC65349Pkn("track_params")
    public final Map<String, Object> trackParams;

    @InterfaceC65349Pkn("trigger_condition")
    public final Integer triggerCondition;

    @InterfaceC65349Pkn("trigger_subcondition")
    public final Integer triggerSubCondition;

    @InterfaceC65349Pkn("user_status")
    public final Integer userStatus;

    @InterfaceC65349Pkn("voucher_info_list")
    public final List<FeedEcCardVoucherInfo> voucherInfoList;

    @InterfaceC65349Pkn("voucher_show_num")
    public final Integer voucherShowNum;

    /* JADX WARN: Multi-variable type inference failed */
    public FeedEcCardConfig() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 131071, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ FeedEcCardConfig copy$default(FeedEcCardConfig feedEcCardConfig, Integer num, String str, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Map map, Integer num7, String str2, String str3, Integer num8, Integer num9, List list, Integer num10, List list2, FeedEcCardInfo feedEcCardInfo, int i, Object obj) {
        Integer num11 = num;
        String str4 = str;
        Integer num12 = num5;
        Integer num13 = num4;
        Integer num14 = num2;
        Integer num15 = num3;
        String str5 = str2;
        Integer num16 = num7;
        Integer num17 = num6;
        Map map2 = map;
        Integer num18 = num9;
        String str6 = str3;
        List list3 = list;
        Integer num19 = num8;
        FeedEcCardInfo feedEcCardInfo2 = feedEcCardInfo;
        Integer num20 = num10;
        List list4 = list2;
        if ((i & 1) != 0) {
            num11 = feedEcCardConfig.isOffline;
        }
        if ((i & 2) != 0) {
            str4 = feedEcCardConfig.audienceId;
        }
        if ((i & 4) != 0) {
            num14 = feedEcCardConfig.cardSubtype;
        }
        if ((i & 8) != 0) {
            num15 = feedEcCardConfig.userStatus;
        }
        if ((i & 16) != 0) {
            num13 = feedEcCardConfig.triggerCondition;
        }
        if ((i & 32) != 0) {
            num12 = feedEcCardConfig.triggerSubCondition;
        }
        if ((i & 64) != 0) {
            num17 = feedEcCardConfig.contentType;
        }
        if ((i & 128) != 0) {
            map2 = feedEcCardConfig.trackParams;
        }
        if ((i & 256) != 0) {
            num16 = feedEcCardConfig.isCold;
        }
        if ((i & 512) != 0) {
            str5 = feedEcCardConfig.resourceKey;
        }
        if ((i & 1024) != 0) {
            str6 = feedEcCardConfig.priceType;
        }
        if ((i & 2048) != 0) {
            num19 = feedEcCardConfig.buyType;
        }
        if ((i & 4096) != 0) {
            num18 = feedEcCardConfig.productShowNum;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            list3 = feedEcCardConfig.productInfoList;
        }
        if ((i & 16384) != 0) {
            num20 = feedEcCardConfig.voucherShowNum;
        }
        if ((32768 & i) != 0) {
            list4 = feedEcCardConfig.voucherInfoList;
        }
        if ((i & 65536) != 0) {
            feedEcCardInfo2 = feedEcCardConfig.cardInfo;
        }
        Integer num21 = num13;
        return feedEcCardConfig.copy(num11, str4, num14, num15, num21, num12, num17, map2, num16, str5, str6, num19, num18, list3, num20, list4, feedEcCardInfo2);
    }

    public final FeedEcCardConfig copy(Integer num, String str, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Map<String, ? extends Object> map, Integer num7, String str2, String str3, Integer num8, Integer num9, List<FeedEcCardProductInfo> list, Integer num10, List<FeedEcCardVoucherInfo> list2, FeedEcCardInfo feedEcCardInfo) {
        return new FeedEcCardConfig(num, str, num2, num3, num4, num5, num6, map, num7, str2, str3, num8, num9, list, num10, list2, feedEcCardInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedEcCardConfig)) {
            return false;
        }
        FeedEcCardConfig feedEcCardConfig = (FeedEcCardConfig) obj;
        return o.LJ(this.isOffline, feedEcCardConfig.isOffline) && o.LJ(this.audienceId, feedEcCardConfig.audienceId) && o.LJ(this.cardSubtype, feedEcCardConfig.cardSubtype) && o.LJ(this.userStatus, feedEcCardConfig.userStatus) && o.LJ(this.triggerCondition, feedEcCardConfig.triggerCondition) && o.LJ(this.triggerSubCondition, feedEcCardConfig.triggerSubCondition) && o.LJ(this.contentType, feedEcCardConfig.contentType) && o.LJ(this.trackParams, feedEcCardConfig.trackParams) && o.LJ(this.isCold, feedEcCardConfig.isCold) && o.LJ(this.resourceKey, feedEcCardConfig.resourceKey) && o.LJ(this.priceType, feedEcCardConfig.priceType) && o.LJ(this.buyType, feedEcCardConfig.buyType) && o.LJ(this.productShowNum, feedEcCardConfig.productShowNum) && o.LJ(this.productInfoList, feedEcCardConfig.productInfoList) && o.LJ(this.voucherShowNum, feedEcCardConfig.voucherShowNum) && o.LJ(this.voucherInfoList, feedEcCardConfig.voucherInfoList) && o.LJ(this.cardInfo, feedEcCardConfig.cardInfo);
    }

    public int hashCode() {
        Integer num = this.isOffline;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.audienceId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.cardSubtype;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.userStatus;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.triggerCondition;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.triggerSubCondition;
        int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.contentType;
        int hashCode7 = (hashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Map<String, Object> map = this.trackParams;
        int hashCode8 = (hashCode7 + (map == null ? 0 : map.hashCode())) * 31;
        Integer num7 = this.isCold;
        int hashCode9 = (hashCode8 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str2 = this.resourceKey;
        int hashCode10 = (hashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.priceType;
        int hashCode11 = (hashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num8 = this.buyType;
        int hashCode12 = (hashCode11 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.productShowNum;
        int hashCode13 = (hashCode12 + (num9 == null ? 0 : num9.hashCode())) * 31;
        List<FeedEcCardProductInfo> list = this.productInfoList;
        int hashCode14 = (hashCode13 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num10 = this.voucherShowNum;
        int hashCode15 = (hashCode14 + (num10 == null ? 0 : num10.hashCode())) * 31;
        List<FeedEcCardVoucherInfo> list2 = this.voucherInfoList;
        int hashCode16 = (hashCode15 + (list2 == null ? 0 : list2.hashCode())) * 31;
        FeedEcCardInfo feedEcCardInfo = this.cardInfo;
        return hashCode16 + (feedEcCardInfo != null ? feedEcCardInfo.hashCode() : 0);
    }

    public String toString() {
        return "FeedEcCardConfig(isOffline=" + this.isOffline + ", audienceId=" + this.audienceId + ", cardSubtype=" + this.cardSubtype + ", userStatus=" + this.userStatus + ", triggerCondition=" + this.triggerCondition + ", triggerSubCondition=" + this.triggerSubCondition + ", contentType=" + this.contentType + ", trackParams=" + this.trackParams + ", isCold=" + this.isCold + ", resourceKey=" + this.resourceKey + ", priceType=" + this.priceType + ", buyType=" + this.buyType + ", productShowNum=" + this.productShowNum + ", productInfoList=" + this.productInfoList + ", voucherShowNum=" + this.voucherShowNum + ", voucherInfoList=" + this.voucherInfoList + ", cardInfo=" + this.cardInfo + ')';
    }

    /* loaded from: classes7.dex */
    public static final class FeedEcCardInfo {

        @InterfaceC65349Pkn("rec_scene")
        public final String recScene;

        @InterfaceC65349Pkn("recommend_info")
        public final String recommendInfo;

        @InterfaceC65349Pkn("session_id")
        public final String sessionId;

        /* JADX WARN: Multi-variable type inference failed */
        public FeedEcCardInfo() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ FeedEcCardInfo copy$default(FeedEcCardInfo feedEcCardInfo, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = feedEcCardInfo.sessionId;
            }
            if ((i & 2) != 0) {
                str2 = feedEcCardInfo.recommendInfo;
            }
            if ((i & 4) != 0) {
                str3 = feedEcCardInfo.recScene;
            }
            return feedEcCardInfo.copy(str, str2, str3);
        }

        public final FeedEcCardInfo copy(String str, String str2, String str3) {
            return new FeedEcCardInfo(str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FeedEcCardInfo)) {
                return false;
            }
            FeedEcCardInfo feedEcCardInfo = (FeedEcCardInfo) obj;
            return o.LJ(this.sessionId, feedEcCardInfo.sessionId) && o.LJ(this.recommendInfo, feedEcCardInfo.recommendInfo) && o.LJ(this.recScene, feedEcCardInfo.recScene);
        }

        public int hashCode() {
            String str = this.sessionId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.recommendInfo;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.recScene;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("FeedEcCardInfo(sessionId=");
            LIZ.append(this.sessionId);
            LIZ.append(", recommendInfo=");
            LIZ.append(this.recommendInfo);
            LIZ.append(", recScene=");
            return q.LIZIZ(LIZ, this.recScene, ')', LIZ);
        }

        public final String getRecScene() {
            return this.recScene;
        }

        public final String getRecommendInfo() {
            return this.recommendInfo;
        }

        public final String getSessionId() {
            return this.sessionId;
        }

        public FeedEcCardInfo(String str, String str2, String str3) {
            this.sessionId = str;
            this.recommendInfo = str2;
            this.recScene = str3;
        }

        public /* synthetic */ FeedEcCardInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }
    }

    /* loaded from: classes7.dex */
    public static final class FeedEcCardProductInfo {

        @InterfaceC65349Pkn("impression_info")
        public final String impressionInfo;

        @InterfaceC65349Pkn("product_id")
        public final String productId;

        @InterfaceC65349Pkn("recommend_info_str")
        public final String recommendInfo;

        @InterfaceC65349Pkn("type")
        public final Integer type;

        /* JADX WARN: Multi-variable type inference failed */
        public FeedEcCardProductInfo() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ FeedEcCardProductInfo copy$default(FeedEcCardProductInfo feedEcCardProductInfo, String str, Integer num, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = feedEcCardProductInfo.productId;
            }
            if ((i & 2) != 0) {
                num = feedEcCardProductInfo.type;
            }
            if ((i & 4) != 0) {
                str2 = feedEcCardProductInfo.recommendInfo;
            }
            if ((i & 8) != 0) {
                str3 = feedEcCardProductInfo.impressionInfo;
            }
            return feedEcCardProductInfo.copy(str, num, str2, str3);
        }

        public final FeedEcCardProductInfo copy(String str, Integer num, String str2, String str3) {
            return new FeedEcCardProductInfo(str, num, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FeedEcCardProductInfo)) {
                return false;
            }
            FeedEcCardProductInfo feedEcCardProductInfo = (FeedEcCardProductInfo) obj;
            return o.LJ(this.productId, feedEcCardProductInfo.productId) && o.LJ(this.type, feedEcCardProductInfo.type) && o.LJ(this.recommendInfo, feedEcCardProductInfo.recommendInfo) && o.LJ(this.impressionInfo, feedEcCardProductInfo.impressionInfo);
        }

        public int hashCode() {
            String str = this.productId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.type;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.recommendInfo;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.impressionInfo;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("FeedEcCardProductInfo(productId=");
            LIZ.append(this.productId);
            LIZ.append(", type=");
            LIZ.append(this.type);
            LIZ.append(", recommendInfo=");
            LIZ.append(this.recommendInfo);
            LIZ.append(", impressionInfo=");
            return q.LIZIZ(LIZ, this.impressionInfo, ')', LIZ);
        }

        public final String getImpressionInfo() {
            return this.impressionInfo;
        }

        public final String getProductId() {
            return this.productId;
        }

        public final String getRecommendInfo() {
            return this.recommendInfo;
        }

        public final Integer getType() {
            return this.type;
        }

        public FeedEcCardProductInfo(String str, Integer num, String str2, String str3) {
            this.productId = str;
            this.type = num;
            this.recommendInfo = str2;
            this.impressionInfo = str3;
        }

        public /* synthetic */ FeedEcCardProductInfo(String str, Integer num, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? 0 : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class FeedEcCardVoucherInfo {

        @InterfaceC65349Pkn("voucher_id")
        public final String voucherId;

        /* JADX WARN: Multi-variable type inference failed */
        public FeedEcCardVoucherInfo() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ FeedEcCardVoucherInfo copy$default(FeedEcCardVoucherInfo feedEcCardVoucherInfo, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = feedEcCardVoucherInfo.voucherId;
            }
            return feedEcCardVoucherInfo.copy(str);
        }

        public final FeedEcCardVoucherInfo copy(String str) {
            return new FeedEcCardVoucherInfo(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FeedEcCardVoucherInfo) && o.LJ(this.voucherId, ((FeedEcCardVoucherInfo) obj).voucherId);
        }

        public int hashCode() {
            String str = this.voucherId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("FeedEcCardVoucherInfo(voucherId=");
            return q.LIZIZ(LIZ, this.voucherId, ')', LIZ);
        }

        public final String getVoucherId() {
            return this.voucherId;
        }

        public FeedEcCardVoucherInfo(String str) {
            this.voucherId = str;
        }

        public /* synthetic */ FeedEcCardVoucherInfo(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    public final String getAudienceId() {
        return this.audienceId;
    }

    public final Integer getBuyType() {
        return this.buyType;
    }

    public final FeedEcCardInfo getCardInfo() {
        return this.cardInfo;
    }

    public final Integer getCardSubtype() {
        return this.cardSubtype;
    }

    public final Integer getContentType() {
        return this.contentType;
    }

    public final String getPriceType() {
        return this.priceType;
    }

    public final List<FeedEcCardProductInfo> getProductInfoList() {
        return this.productInfoList;
    }

    public final Integer getProductShowNum() {
        return this.productShowNum;
    }

    public final String getResourceKey() {
        return this.resourceKey;
    }

    public final Map<String, Object> getTrackParams() {
        return this.trackParams;
    }

    public final Integer getTriggerCondition() {
        return this.triggerCondition;
    }

    public final Integer getTriggerSubCondition() {
        return this.triggerSubCondition;
    }

    public final Integer getUserStatus() {
        return this.userStatus;
    }

    public final List<FeedEcCardVoucherInfo> getVoucherInfoList() {
        return this.voucherInfoList;
    }

    public final Integer getVoucherShowNum() {
        return this.voucherShowNum;
    }

    public final Integer isCold() {
        return this.isCold;
    }

    public final Integer isOffline() {
        return this.isOffline;
    }

    public FeedEcCardConfig(Integer num, String str, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Map<String, ? extends Object> map, Integer num7, String str2, String str3, Integer num8, Integer num9, List<FeedEcCardProductInfo> list, Integer num10, List<FeedEcCardVoucherInfo> list2, FeedEcCardInfo feedEcCardInfo) {
        this.isOffline = num;
        this.audienceId = str;
        this.cardSubtype = num2;
        this.userStatus = num3;
        this.triggerCondition = num4;
        this.triggerSubCondition = num5;
        this.contentType = num6;
        this.trackParams = map;
        this.isCold = num7;
        this.resourceKey = str2;
        this.priceType = str3;
        this.buyType = num8;
        this.productShowNum = num9;
        this.productInfoList = list;
        this.voucherShowNum = num10;
        this.voucherInfoList = list2;
        this.cardInfo = feedEcCardInfo;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ FeedEcCardConfig(java.lang.Integer r21, java.lang.String r22, java.lang.Integer r23, java.lang.Integer r24, java.lang.Integer r25, java.lang.Integer r26, java.lang.Integer r27, java.util.Map r28, java.lang.Integer r29, java.lang.String r30, java.lang.String r31, java.lang.Integer r32, java.lang.Integer r33, java.util.List r34, java.lang.Integer r35, java.util.List r36, com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardConfig.FeedEcCardInfo r37, int r38, kotlin.jvm.internal.DefaultConstructorMarker r39) {
        /*
            r20 = this;
            r19 = r37
            r8 = r26
            r7 = r25
            r6 = r24
            r5 = r23
            r3 = r21
            r1 = r38
            r4 = r22
            r9 = r27
            r10 = r28
            r11 = r29
            r12 = r30
            r13 = r31
            r14 = r32
            r15 = r33
            r16 = r34
            r18 = r36
            r2 = r1 & 1
            r0 = 0
            java.lang.Integer r17 = java.lang.Integer.valueOf(r0)
            if (r2 == 0) goto L2d
            r3 = r17
        L2d:
            r0 = r1 & 2
            if (r0 == 0) goto L32
            r4 = 0
        L32:
            r0 = r1 & 4
            if (r0 == 0) goto L3b
            r0 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        L3b:
            r0 = r1 & 8
            if (r0 == 0) goto L41
            r6 = r17
        L41:
            r0 = r1 & 16
            if (r0 == 0) goto L47
            r7 = r17
        L47:
            r0 = r1 & 32
            if (r0 == 0) goto L4d
            r8 = r17
        L4d:
            r0 = r1 & 64
            if (r0 == 0) goto L53
            r9 = r17
        L53:
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L58
            r10 = 0
        L58:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L5e
            r11 = r17
        L5e:
            r0 = r1 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L63
            r12 = 0
        L63:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L6d
            X.FqG r0 = X.EnumC40208FqG.VIDEO
            java.lang.String r13 = r0.getValue()
        L6d:
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L73
            r14 = r17
        L73:
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L79
            r15 = r17
        L79:
            r0 = r1 & 8192(0x2000, float:1.148E-41)
            if (r0 == 0) goto L7f
            r16 = 0
        L7f:
            r0 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L98
        L83:
            r0 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L8b
            r18 = 0
        L8b:
            r0 = 65536(0x10000, float:9.1835E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L92
            r19 = 0
        L92:
            r2 = r20
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        L98:
            r17 = r35
            goto L83
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardConfig.<init>(java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.util.Map, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.util.List, java.lang.Integer, java.util.List, com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardConfig$FeedEcCardInfo, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
