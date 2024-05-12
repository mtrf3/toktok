package com.bytedance.android.livesdk.chatroom.model.multilive;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class MultiLiveAnchorPanelSettings extends F9E {

    @InterfaceC65349Pkn("allow_request_from_user")
    public int allowViewerReq;

    @InterfaceC65349Pkn("applier_sort_gift_score_threshold")
    public long applierSortGiftScoreThreshold;

    @InterfaceC65349Pkn("applier_sort_setting")
    public int applierSortSetting;

    @InterfaceC65349Pkn("fix_mic_num")
    public int fixMicNumAction;

    @InterfaceC65349Pkn("layout")
    public int layoutType;

    @InterfaceC65349Pkn("allow_request_from_follower_only")
    public int onlyAllowFollowerReq;

    @InterfaceC65349Pkn("user_id")
    public Long userId;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MultiLiveAnchorPanelSettings() {
        /*
            r11 = this;
            r1 = 0
            r5 = 0
            r7 = 0
            r9 = 127(0x7f, float:1.78E-43)
            r0 = r11
            r2 = r1
            r3 = r1
            r4 = r1
            r6 = r1
            r10 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.layoutType), Integer.valueOf(this.fixMicNumAction), Integer.valueOf(this.allowViewerReq), Integer.valueOf(this.onlyAllowFollowerReq), this.userId, Integer.valueOf(this.applierSortSetting), Long.valueOf(this.applierSortGiftScoreThreshold)};
    }

    public static MultiLiveAnchorPanelSettings L(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings) {
        int i = multiLiveAnchorPanelSettings.layoutType;
        int i2 = multiLiveAnchorPanelSettings.fixMicNumAction;
        int i3 = multiLiveAnchorPanelSettings.allowViewerReq;
        int i4 = multiLiveAnchorPanelSettings.onlyAllowFollowerReq;
        Long l = multiLiveAnchorPanelSettings.userId;
        int i5 = multiLiveAnchorPanelSettings.applierSortSetting;
        long j = multiLiveAnchorPanelSettings.applierSortGiftScoreThreshold;
        multiLiveAnchorPanelSettings.getClass();
        return new MultiLiveAnchorPanelSettings(i, i2, i3, i4, l, i5, j);
    }

    public MultiLiveAnchorPanelSettings(int i, int i2, int i3, int i4, Long l, int i5, long j) {
        this.layoutType = i;
        this.fixMicNumAction = i2;
        this.allowViewerReq = i3;
        this.onlyAllowFollowerReq = i4;
        this.userId = l;
        this.applierSortSetting = i5;
        this.applierSortGiftScoreThreshold = j;
    }

    public /* synthetic */ MultiLiveAnchorPanelSettings(int i, int i2, int i3, int i4, Long l, int i5, long j, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) != 0 ? null : l, (i6 & 32) == 0 ? i5 : 0, (i6 & 64) != 0 ? 0L : j);
    }
}
