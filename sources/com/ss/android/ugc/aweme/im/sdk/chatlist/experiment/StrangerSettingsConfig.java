package com.ss.android.ugc.aweme.im.sdk.chatlist.experiment;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class StrangerSettingsConfig {

    @InterfaceC65349Pkn("default_pull_count")
    public final int defaultPullCount;

    @InterfaceC65349Pkn("stranger_page_async_init")
    public final boolean enableStrangerPageAsyncInit;

    @InterfaceC65349Pkn("enable_view_model_split")
    public final boolean enableViewModelSplit;

    @InterfaceC65349Pkn("pagination_count")
    public final int paginationCount;

    @InterfaceC65349Pkn("preview_pull_count")
    public final int previewPullCount;

    @InterfaceC65349Pkn("pull_msg_when_accept")
    public final boolean pullMsgWhenAccept;

    @InterfaceC65349Pkn("reset_is_filtered")
    public final boolean resetIsFilteredAfterTransfer;

    /* JADX WARN: Multi-variable type inference failed */
    public StrangerSettingsConfig() {
        this(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, null);
    }

    public StrangerSettingsConfig(int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.previewPullCount = i;
        this.defaultPullCount = i2;
        this.paginationCount = i3;
        this.resetIsFilteredAfterTransfer = z;
        this.pullMsgWhenAccept = z2;
        this.enableStrangerPageAsyncInit = z3;
        this.enableViewModelSplit = z4;
    }

    public /* synthetic */ StrangerSettingsConfig(int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 1 : i, (i4 & 2) != 0 ? 10 : i2, (i4 & 4) != 0 ? 100 : i3, (i4 & 8) == 0 ? z : true, (i4 & 16) != 0 ? false : z2, (i4 & 32) != 0 ? false : z3, (i4 & 64) != 0 ? false : z4);
    }
}
