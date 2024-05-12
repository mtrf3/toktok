package com.bytedance.ies.im.core.api.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class IMReadReceiptOptimizationSettingModel extends F9E {

    @InterfaceC65349Pkn("batch_request_common_page_size")
    public final int batRequestCommonPageSize;

    @InterfaceC65349Pkn("batch_request_first_page_size")
    public final int batchRequestFirstPageSize;

    @InterfaceC65349Pkn("enable_batch_request_paging")
    public final boolean enableBatchRequestPaging;

    @InterfaceC65349Pkn("enable_direct_push_read_from_content")
    public final boolean enableDirectPushReadFromContent;

    @InterfaceC65349Pkn("enable_read_receipt_polling")
    public final boolean enableReadReceiptPolling;

    @InterfaceC65349Pkn("read_receipt_polling_max_count")
    public final int readReceiptPollingMaxCount;

    @InterfaceC65349Pkn("read_receipt_polling_time_interval")
    public final int readReceiptPollingTimeInterval;

    /* JADX WARN: Multi-variable type inference failed */
    public IMReadReceiptOptimizationSettingModel() {
        this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enableReadReceiptPolling), Integer.valueOf(this.readReceiptPollingTimeInterval), Integer.valueOf(this.readReceiptPollingMaxCount), Boolean.valueOf(this.enableBatchRequestPaging), Integer.valueOf(this.batchRequestFirstPageSize), Integer.valueOf(this.batRequestCommonPageSize), Boolean.valueOf(this.enableDirectPushReadFromContent)};
    }

    public IMReadReceiptOptimizationSettingModel(boolean z, int i, int i2, boolean z2, int i3, int i4, boolean z3) {
        this.enableReadReceiptPolling = z;
        this.readReceiptPollingTimeInterval = i;
        this.readReceiptPollingMaxCount = i2;
        this.enableBatchRequestPaging = z2;
        this.batchRequestFirstPageSize = i3;
        this.batRequestCommonPageSize = i4;
        this.enableDirectPushReadFromContent = z3;
    }

    public /* synthetic */ IMReadReceiptOptimizationSettingModel(boolean z, int i, int i2, boolean z2, int i3, int i4, boolean z3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? false : z, (i5 & 2) != 0 ? 3 : i, (i5 & 4) != 0 ? 20 : i2, (i5 & 8) != 0 ? true : z2, (i5 & 16) == 0 ? i3 : 20, (i5 & 32) != 0 ? 10 : i4, (i5 & 64) != 0 ? true : z3);
    }
}
