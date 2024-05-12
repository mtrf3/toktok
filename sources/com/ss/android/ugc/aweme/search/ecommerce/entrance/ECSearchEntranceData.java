package com.ss.android.ugc.aweme.search.ecommerce.entrance;

import X.C16880lQ;
import X.C50901JyL;
import X.C78983UzD;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class ECSearchEntranceData implements Serializable {
    public static final C50901JyL Companion = new C50901JyL();
    public static final String[] PARAM_LIST = {"enter_req_source", "enter_view_type", "disable_history_strategy", "disable_sug_strategy", "disable_guess_strategy", "enable_disk_guess_cache_strategy", "middle_sug_source", "middle_req_source", "guess_cache_strategy", "disable_vision_search", "default_hint_word", "ecom_user_actions", "result_source", "result_channel", "result_type", "result_bg_url", "history_isolate_strategy", "history_max_count", "expand_height", "history_max_count", "middle_expand_history", "middle_history_control_style", "result_disable_filter", "result_disable_bg", "order_search_region", "single_tab_type"};

    @InterfaceC65349Pkn("ec_entrance_data_generation_duration")
    public long dataGenerationDuration;

    @InterfaceC65349Pkn("default_hint_word")
    public String defaultHintWord;

    @InterfaceC65349Pkn("result_disable_bg")
    public final String disableBg;

    @InterfaceC65349Pkn("result_disable_filter")
    public final String disableFilterSearch;

    @InterfaceC65349Pkn("disable_vision_search")
    public String disableVisionSearch;

    @InterfaceC65349Pkn("ecom_user_actions")
    public String ecUserActions;

    @InterfaceC65349Pkn("enter_req_source")
    public final String enterReqSource;

    @InterfaceC65349Pkn("enter_view_type")
    public final String enterViewType;

    @InterfaceC65349Pkn("entrance_hint_word_in_top_once")
    public boolean entranceHintWordInTopOnce;

    @InterfaceC65349Pkn("history_isolate_strategy")
    public final String historyIsolateStrategy;

    @InterfaceC65349Pkn("history_max_count")
    public final String historyMaxCount;

    @InterfaceC65349Pkn("disable_guess_strategy")
    public final String middleDisableGuessStrategy;

    @InterfaceC65349Pkn("disable_history_strategy")
    public final String middleDisableHistoryStrategy;

    @InterfaceC65349Pkn("disable_sug_strategy")
    public final String middleDisableSugStrategy;

    @InterfaceC65349Pkn("enable_disk_guess_cache_strategy")
    public final String middleEnableDiskGuessCacheStrategy;

    @InterfaceC65349Pkn("guess_cache_strategy")
    public final String middleGuessCacheStrategy;

    @InterfaceC65349Pkn("middle_history_control_style")
    public final String middleHistoryControlStyle;

    @InterfaceC65349Pkn("middle_req_source")
    public final String middleReqSource;

    @InterfaceC65349Pkn("middle_search_position")
    public final String middleSearchPosition;

    @InterfaceC65349Pkn("middle_sug_source")
    public final String middleSugSource;

    @InterfaceC65349Pkn("order_search_region")
    public final String orderSearchRegion;

    @InterfaceC65349Pkn("result_bg_url")
    public String resultBgUrl;

    @InterfaceC65349Pkn("result_channel")
    public final String resultChannel;

    @InterfaceC65349Pkn("expand_height")
    public String resultExpandHeight;

    @InterfaceC65349Pkn("result_source")
    public final String resultSource;

    @InterfaceC65349Pkn("result_type")
    public final String resultType;

    @InterfaceC65349Pkn("root_enter_from_type")
    public final int rootEnterFromType;

    @InterfaceC65349Pkn("single_tab_type")
    public final String singleTabType;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ECSearchEntranceData() {
        /*
            r32 = this;
            r1 = 0
            r2 = 0
            r28 = 0
            r30 = 268435455(0xfffffff, float:2.5243547E-29)
            r0 = r32
            r3 = r2
            r4 = r2
            r5 = r2
            r6 = r2
            r7 = r2
            r8 = r2
            r9 = r2
            r10 = r2
            r11 = r2
            r12 = r2
            r13 = r2
            r14 = r1
            r15 = r2
            r16 = r2
            r17 = r2
            r18 = r2
            r19 = r2
            r20 = r2
            r21 = r2
            r22 = r2
            r23 = r2
            r24 = r2
            r25 = r2
            r26 = r2
            r27 = r2
            r31 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r31)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData.<init>():void");
    }

    public static /* synthetic */ ECSearchEntranceData copy$default(ECSearchEntranceData eCSearchEntranceData, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, long j, int i2, Object obj) {
        String str26 = str11;
        String str27 = str10;
        String str28 = str9;
        String str29 = str8;
        boolean z2 = z;
        String str30 = str7;
        String str31 = str6;
        String str32 = str;
        int i3 = i;
        String str33 = str2;
        String str34 = str3;
        String str35 = str4;
        String str36 = str12;
        String str37 = str5;
        String str38 = str25;
        String str39 = str24;
        String str40 = str23;
        String str41 = str22;
        String str42 = str21;
        String str43 = str20;
        String str44 = str19;
        String str45 = str14;
        long j2 = j;
        String str46 = str13;
        String str47 = str15;
        String str48 = str16;
        String str49 = str17;
        String str50 = str18;
        if ((i2 & 1) != 0) {
            i3 = eCSearchEntranceData.rootEnterFromType;
        }
        if ((i2 & 2) != 0) {
            str32 = eCSearchEntranceData.enterReqSource;
        }
        if ((i2 & 4) != 0) {
            str33 = eCSearchEntranceData.enterViewType;
        }
        if ((i2 & 8) != 0) {
            str34 = eCSearchEntranceData.middleDisableHistoryStrategy;
        }
        if ((i2 & 16) != 0) {
            str35 = eCSearchEntranceData.middleDisableSugStrategy;
        }
        if ((i2 & 32) != 0) {
            str37 = eCSearchEntranceData.middleDisableGuessStrategy;
        }
        if ((i2 & 64) != 0) {
            str31 = eCSearchEntranceData.middleEnableDiskGuessCacheStrategy;
        }
        if ((i2 & 128) != 0) {
            str30 = eCSearchEntranceData.middleSugSource;
        }
        if ((i2 & 256) != 0) {
            str29 = eCSearchEntranceData.middleReqSource;
        }
        if ((i2 & 512) != 0) {
            str28 = eCSearchEntranceData.middleSearchPosition;
        }
        if ((i2 & 1024) != 0) {
            str27 = eCSearchEntranceData.middleGuessCacheStrategy;
        }
        if ((i2 & 2048) != 0) {
            str26 = eCSearchEntranceData.disableVisionSearch;
        }
        if ((i2 & 4096) != 0) {
            str36 = eCSearchEntranceData.defaultHintWord;
        }
        if ((i2 & FileUtils.BUFFER_SIZE) != 0) {
            z2 = eCSearchEntranceData.entranceHintWordInTopOnce;
        }
        if ((i2 & 16384) != 0) {
            str46 = eCSearchEntranceData.middleHistoryControlStyle;
        }
        if ((32768 & i2) != 0) {
            str45 = eCSearchEntranceData.ecUserActions;
        }
        if ((65536 & i2) != 0) {
            str47 = eCSearchEntranceData.resultSource;
        }
        if ((131072 & i2) != 0) {
            str48 = eCSearchEntranceData.resultChannel;
        }
        if ((262144 & i2) != 0) {
            str49 = eCSearchEntranceData.singleTabType;
        }
        if ((524288 & i2) != 0) {
            str50 = eCSearchEntranceData.resultType;
        }
        if ((1048576 & i2) != 0) {
            str44 = eCSearchEntranceData.disableFilterSearch;
        }
        if ((2097152 & i2) != 0) {
            str43 = eCSearchEntranceData.resultBgUrl;
        }
        if ((4194304 & i2) != 0) {
            str42 = eCSearchEntranceData.resultExpandHeight;
        }
        if ((8388608 & i2) != 0) {
            str41 = eCSearchEntranceData.disableBg;
        }
        if ((16777216 & i2) != 0) {
            str40 = eCSearchEntranceData.orderSearchRegion;
        }
        if ((33554432 & i2) != 0) {
            str39 = eCSearchEntranceData.historyIsolateStrategy;
        }
        if ((67108864 & i2) != 0) {
            str38 = eCSearchEntranceData.historyMaxCount;
        }
        if ((i2 & 134217728) != 0) {
            j2 = eCSearchEntranceData.dataGenerationDuration;
        }
        long j3 = j2;
        return eCSearchEntranceData.copy(i3, str32, str33, str34, str35, str37, str31, str30, str29, str28, str27, str26, str36, z2, str46, str45, str47, str48, str49, str50, str44, str43, str42, str41, str40, str39, str38, j3);
    }

    public final ECSearchEntranceData copy(int i, String enterReqSource, String enterViewType, String middleDisableHistoryStrategy, String middleDisableSugStrategy, String middleDisableGuessStrategy, String middleEnableDiskGuessCacheStrategy, String middleSugSource, String middleReqSource, String str, String middleGuessCacheStrategy, String disableVisionSearch, String str2, boolean z, String str3, String str4, String resultSource, String resultChannel, String str5, String resultType, String disableFilterSearch, String str6, String str7, String disableBg, String str8, String historyIsolateStrategy, String historyMaxCount, long j) {
        o.LJIIIZ(enterReqSource, "enterReqSource");
        o.LJIIIZ(enterViewType, "enterViewType");
        o.LJIIIZ(middleDisableHistoryStrategy, "middleDisableHistoryStrategy");
        o.LJIIIZ(middleDisableSugStrategy, "middleDisableSugStrategy");
        o.LJIIIZ(middleDisableGuessStrategy, "middleDisableGuessStrategy");
        o.LJIIIZ(middleEnableDiskGuessCacheStrategy, "middleEnableDiskGuessCacheStrategy");
        o.LJIIIZ(middleSugSource, "middleSugSource");
        o.LJIIIZ(middleReqSource, "middleReqSource");
        o.LJIIIZ(middleGuessCacheStrategy, "middleGuessCacheStrategy");
        o.LJIIIZ(disableVisionSearch, "disableVisionSearch");
        o.LJIIIZ(resultSource, "resultSource");
        o.LJIIIZ(resultChannel, "resultChannel");
        o.LJIIIZ(resultType, "resultType");
        o.LJIIIZ(disableFilterSearch, "disableFilterSearch");
        o.LJIIIZ(disableBg, "disableBg");
        o.LJIIIZ(historyIsolateStrategy, "historyIsolateStrategy");
        o.LJIIIZ(historyMaxCount, "historyMaxCount");
        return new ECSearchEntranceData(i, enterReqSource, enterViewType, middleDisableHistoryStrategy, middleDisableSugStrategy, middleDisableGuessStrategy, middleEnableDiskGuessCacheStrategy, middleSugSource, middleReqSource, str, middleGuessCacheStrategy, disableVisionSearch, str2, z, str3, str4, resultSource, resultChannel, str5, resultType, disableFilterSearch, str6, str7, disableBg, str8, historyIsolateStrategy, historyMaxCount, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ECSearchEntranceData)) {
            return false;
        }
        ECSearchEntranceData eCSearchEntranceData = (ECSearchEntranceData) obj;
        return this.rootEnterFromType == eCSearchEntranceData.rootEnterFromType && o.LJ(this.enterReqSource, eCSearchEntranceData.enterReqSource) && o.LJ(this.enterViewType, eCSearchEntranceData.enterViewType) && o.LJ(this.middleDisableHistoryStrategy, eCSearchEntranceData.middleDisableHistoryStrategy) && o.LJ(this.middleDisableSugStrategy, eCSearchEntranceData.middleDisableSugStrategy) && o.LJ(this.middleDisableGuessStrategy, eCSearchEntranceData.middleDisableGuessStrategy) && o.LJ(this.middleEnableDiskGuessCacheStrategy, eCSearchEntranceData.middleEnableDiskGuessCacheStrategy) && o.LJ(this.middleSugSource, eCSearchEntranceData.middleSugSource) && o.LJ(this.middleReqSource, eCSearchEntranceData.middleReqSource) && o.LJ(this.middleSearchPosition, eCSearchEntranceData.middleSearchPosition) && o.LJ(this.middleGuessCacheStrategy, eCSearchEntranceData.middleGuessCacheStrategy) && o.LJ(this.disableVisionSearch, eCSearchEntranceData.disableVisionSearch) && o.LJ(this.defaultHintWord, eCSearchEntranceData.defaultHintWord) && this.entranceHintWordInTopOnce == eCSearchEntranceData.entranceHintWordInTopOnce && o.LJ(this.middleHistoryControlStyle, eCSearchEntranceData.middleHistoryControlStyle) && o.LJ(this.ecUserActions, eCSearchEntranceData.ecUserActions) && o.LJ(this.resultSource, eCSearchEntranceData.resultSource) && o.LJ(this.resultChannel, eCSearchEntranceData.resultChannel) && o.LJ(this.singleTabType, eCSearchEntranceData.singleTabType) && o.LJ(this.resultType, eCSearchEntranceData.resultType) && o.LJ(this.disableFilterSearch, eCSearchEntranceData.disableFilterSearch) && o.LJ(this.resultBgUrl, eCSearchEntranceData.resultBgUrl) && o.LJ(this.resultExpandHeight, eCSearchEntranceData.resultExpandHeight) && o.LJ(this.disableBg, eCSearchEntranceData.disableBg) && o.LJ(this.orderSearchRegion, eCSearchEntranceData.orderSearchRegion) && o.LJ(this.historyIsolateStrategy, eCSearchEntranceData.historyIsolateStrategy) && o.LJ(this.historyMaxCount, eCSearchEntranceData.historyMaxCount) && this.dataGenerationDuration == eCSearchEntranceData.dataGenerationDuration;
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
        int LJ = C79062V1e.LJ(this.middleReqSource, C79062V1e.LJ(this.middleSugSource, C79062V1e.LJ(this.middleEnableDiskGuessCacheStrategy, C79062V1e.LJ(this.middleDisableGuessStrategy, C79062V1e.LJ(this.middleDisableSugStrategy, C79062V1e.LJ(this.middleDisableHistoryStrategy, C79062V1e.LJ(this.enterViewType, C79062V1e.LJ(this.enterReqSource, this.rootEnterFromType * 31, 31), 31), 31), 31), 31), 31), 31), 31);
        String str = this.middleSearchPosition;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LJ2 = C79062V1e.LJ(this.disableVisionSearch, C79062V1e.LJ(this.middleGuessCacheStrategy, (LJ + hashCode) * 31, 31), 31);
        String str2 = this.defaultHintWord;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (LJ2 + hashCode2) * 31;
        boolean z = this.entranceHintWordInTopOnce;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        String str3 = this.middleHistoryControlStyle;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i5 = (i4 + hashCode3) * 31;
        String str4 = this.ecUserActions;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int LJ3 = C79062V1e.LJ(this.resultChannel, C79062V1e.LJ(this.resultSource, (i5 + hashCode4) * 31, 31), 31);
        String str5 = this.singleTabType;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int LJ4 = C79062V1e.LJ(this.disableFilterSearch, C79062V1e.LJ(this.resultType, (LJ3 + hashCode5) * 31, 31), 31);
        String str6 = this.resultBgUrl;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i6 = (LJ4 + hashCode6) * 31;
        String str7 = this.resultExpandHeight;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int LJ5 = C79062V1e.LJ(this.disableBg, (i6 + hashCode7) * 31, 31);
        String str8 = this.orderSearchRegion;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return C16880lQ.LLJIJIL(this.dataGenerationDuration) + C79062V1e.LJ(this.historyMaxCount, C79062V1e.LJ(this.historyIsolateStrategy, (LJ5 + i) * 31, 31), 31);
    }

    public final boolean isEC() {
        if (this.rootEnterFromType > 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        try {
            String LJIILL = GsonHolder.LIZLLL().LIZ().LJIILL(this);
            o.LJIIIIZZ(LJIILL, "{\n            GsonProvid…on.toJson(this)\n        }");
            return LJIILL;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            return "";
        }
    }

    public final long getDataGenerationDuration() {
        return this.dataGenerationDuration;
    }

    public final String getDefaultHintWord() {
        return this.defaultHintWord;
    }

    public final String getDisableBg() {
        return this.disableBg;
    }

    public final String getDisableFilterSearch() {
        return this.disableFilterSearch;
    }

    public final String getDisableVisionSearch() {
        return this.disableVisionSearch;
    }

    public final String getEcUserActions() {
        return this.ecUserActions;
    }

    public final String getEnterReqSource() {
        return this.enterReqSource;
    }

    public final String getEnterViewType() {
        return this.enterViewType;
    }

    public final boolean getEntranceHintWordInTopOnce() {
        return this.entranceHintWordInTopOnce;
    }

    public final String getHistoryIsolateStrategy() {
        return this.historyIsolateStrategy;
    }

    public final String getHistoryMaxCount() {
        return this.historyMaxCount;
    }

    public final String getMiddleDisableGuessStrategy() {
        return this.middleDisableGuessStrategy;
    }

    public final String getMiddleDisableHistoryStrategy() {
        return this.middleDisableHistoryStrategy;
    }

    public final String getMiddleDisableSugStrategy() {
        return this.middleDisableSugStrategy;
    }

    public final String getMiddleEnableDiskGuessCacheStrategy() {
        return this.middleEnableDiskGuessCacheStrategy;
    }

    public final String getMiddleGuessCacheStrategy() {
        return this.middleGuessCacheStrategy;
    }

    public final String getMiddleHistoryControlStyle() {
        return this.middleHistoryControlStyle;
    }

    public final String getMiddleReqSource() {
        return this.middleReqSource;
    }

    public final String getMiddleSearchPosition() {
        return this.middleSearchPosition;
    }

    public final String getMiddleSugSource() {
        return this.middleSugSource;
    }

    public final String getOrderSearchRegion() {
        return this.orderSearchRegion;
    }

    public final String getResultBgUrl() {
        return this.resultBgUrl;
    }

    public final String getResultChannel() {
        return this.resultChannel;
    }

    public final String getResultExpandHeight() {
        return this.resultExpandHeight;
    }

    public final String getResultSource() {
        return this.resultSource;
    }

    public final String getResultType() {
        return this.resultType;
    }

    public final int getRootEnterFromType() {
        return this.rootEnterFromType;
    }

    public final String getSingleTabType() {
        return this.singleTabType;
    }

    public final void setDataGenerationDuration(long j) {
        this.dataGenerationDuration = j;
    }

    public final void setDefaultHintWord(String str) {
        this.defaultHintWord = str;
    }

    public final void setDisableVisionSearch(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.disableVisionSearch = str;
    }

    public final void setEcUserActions(String str) {
        this.ecUserActions = str;
    }

    public final void setEntranceHintWordInTopOnce(boolean z) {
        this.entranceHintWordInTopOnce = z;
    }

    public final void setResultBgUrl(String str) {
        this.resultBgUrl = str;
    }

    public final void setResultExpandHeight(String str) {
        this.resultExpandHeight = str;
    }

    public ECSearchEntranceData(int i, String enterReqSource, String enterViewType, String middleDisableHistoryStrategy, String middleDisableSugStrategy, String middleDisableGuessStrategy, String middleEnableDiskGuessCacheStrategy, String middleSugSource, String middleReqSource, String str, String middleGuessCacheStrategy, String disableVisionSearch, String str2, boolean z, String str3, String str4, String resultSource, String resultChannel, String str5, String resultType, String disableFilterSearch, String str6, String str7, String disableBg, String str8, String historyIsolateStrategy, String historyMaxCount, long j) {
        o.LJIIIZ(enterReqSource, "enterReqSource");
        o.LJIIIZ(enterViewType, "enterViewType");
        o.LJIIIZ(middleDisableHistoryStrategy, "middleDisableHistoryStrategy");
        o.LJIIIZ(middleDisableSugStrategy, "middleDisableSugStrategy");
        o.LJIIIZ(middleDisableGuessStrategy, "middleDisableGuessStrategy");
        o.LJIIIZ(middleEnableDiskGuessCacheStrategy, "middleEnableDiskGuessCacheStrategy");
        o.LJIIIZ(middleSugSource, "middleSugSource");
        o.LJIIIZ(middleReqSource, "middleReqSource");
        o.LJIIIZ(middleGuessCacheStrategy, "middleGuessCacheStrategy");
        o.LJIIIZ(disableVisionSearch, "disableVisionSearch");
        o.LJIIIZ(resultSource, "resultSource");
        o.LJIIIZ(resultChannel, "resultChannel");
        o.LJIIIZ(resultType, "resultType");
        o.LJIIIZ(disableFilterSearch, "disableFilterSearch");
        o.LJIIIZ(disableBg, "disableBg");
        o.LJIIIZ(historyIsolateStrategy, "historyIsolateStrategy");
        o.LJIIIZ(historyMaxCount, "historyMaxCount");
        this.rootEnterFromType = i;
        this.enterReqSource = enterReqSource;
        this.enterViewType = enterViewType;
        this.middleDisableHistoryStrategy = middleDisableHistoryStrategy;
        this.middleDisableSugStrategy = middleDisableSugStrategy;
        this.middleDisableGuessStrategy = middleDisableGuessStrategy;
        this.middleEnableDiskGuessCacheStrategy = middleEnableDiskGuessCacheStrategy;
        this.middleSugSource = middleSugSource;
        this.middleReqSource = middleReqSource;
        this.middleSearchPosition = str;
        this.middleGuessCacheStrategy = middleGuessCacheStrategy;
        this.disableVisionSearch = disableVisionSearch;
        this.defaultHintWord = str2;
        this.entranceHintWordInTopOnce = z;
        this.middleHistoryControlStyle = str3;
        this.ecUserActions = str4;
        this.resultSource = resultSource;
        this.resultChannel = resultChannel;
        this.singleTabType = str5;
        this.resultType = resultType;
        this.disableFilterSearch = disableFilterSearch;
        this.resultBgUrl = str6;
        this.resultExpandHeight = str7;
        this.disableBg = disableBg;
        this.orderSearchRegion = str8;
        this.historyIsolateStrategy = historyIsolateStrategy;
        this.historyMaxCount = historyMaxCount;
        this.dataGenerationDuration = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ECSearchEntranceData(int r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, boolean r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, java.lang.String r57, java.lang.String r58, long r59, int r61, kotlin.jvm.internal.DefaultConstructorMarker r62) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
