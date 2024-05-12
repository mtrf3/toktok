package com.ss.android.ugc.aweme.share.core.ui.campaign;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes11.dex */
public final class SharingOperationConfig extends F9E {

    @InterfaceC65349Pkn("block_aweme_list")
    public final List<String> blockAwemeList;

    @InterfaceC65349Pkn("operation_copy_list")
    public final List<String> operationCopyList;

    @InterfaceC65349Pkn("operation_desc_filter_list")
    public final List<OperationFilterItem> operationDescFilterList;

    @InterfaceC65349Pkn("operation_end_time")
    public final Long operationEndTime;

    @InterfaceC65349Pkn("operation_hashtag_filter_list")
    public final List<OperationFilterItem> operationHashtagFilterList;

    @InterfaceC65349Pkn("operation_icon_max_swap_times")
    public final Integer operationIconMaxSwapTimes;

    @InterfaceC65349Pkn("operation_icon_resource_name")
    public final String operationIconResourceName;

    @InterfaceC65349Pkn("operation_id")
    public final String operationId;

    @InterfaceC65349Pkn("operation_name")
    public final String operationName;

    @InterfaceC65349Pkn("operation_channel_config")
    public final OperationPlatform operationPlatform;

    @InterfaceC65349Pkn("operation_start_time")
    public final Long operationStartTime;

    @InterfaceC65349Pkn("operation_template_list")
    public final List<String> operationTemplateList;

    @InterfaceC65349Pkn("operation_template_resource_prefix")
    public final String operationTemplateResourcePrefix;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.operationId, this.operationName, this.operationStartTime, this.operationEndTime, this.operationHashtagFilterList, this.operationDescFilterList, this.operationIconMaxSwapTimes, this.operationTemplateList, this.operationTemplateResourcePrefix, this.blockAwemeList, this.operationCopyList, this.operationPlatform, this.operationIconResourceName};
    }

    public SharingOperationConfig(String str, String str2, Long l, Long l2, List<OperationFilterItem> list, List<OperationFilterItem> list2, Integer num, List<String> list3, String str3, List<String> list4, List<String> list5, OperationPlatform operationPlatform, String str4) {
        this.operationId = str;
        this.operationName = str2;
        this.operationStartTime = l;
        this.operationEndTime = l2;
        this.operationHashtagFilterList = list;
        this.operationDescFilterList = list2;
        this.operationIconMaxSwapTimes = num;
        this.operationTemplateList = list3;
        this.operationTemplateResourcePrefix = str3;
        this.blockAwemeList = list4;
        this.operationCopyList = list5;
        this.operationPlatform = operationPlatform;
        this.operationIconResourceName = str4;
    }
}
