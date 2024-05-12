package com.ss.android.ugc.aweme.compliance.api.phl.model;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PrivacyHighlightsForTeens extends F9E {

    @InterfaceC65349Pkn("approve_info")
    public final PrivacyHighlightsForTeensApproveInfo approveInfo;

    @InterfaceC65349Pkn("page_button")
    public final String pageButton;

    @InterfaceC65349Pkn("page_description")
    public final PrivacyHighlightsForTeensDescription pageDesc;

    @InterfaceC65349Pkn("page_title")
    public final String pageTitle;

    @InterfaceC65349Pkn("video_list")
    public final List<PrivacyHighlightsForTeensVideo> videoList;

    public PrivacyHighlightsForTeens() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.pageTitle, this.pageDesc, this.pageButton, this.videoList, this.approveInfo};
    }

    public PrivacyHighlightsForTeens(String pageTitle, PrivacyHighlightsForTeensDescription pageDesc, String pageButton, List<PrivacyHighlightsForTeensVideo> videoList, PrivacyHighlightsForTeensApproveInfo approveInfo) {
        o.LJIIIZ(pageTitle, "pageTitle");
        o.LJIIIZ(pageDesc, "pageDesc");
        o.LJIIIZ(pageButton, "pageButton");
        o.LJIIIZ(videoList, "videoList");
        o.LJIIIZ(approveInfo, "approveInfo");
        this.pageTitle = pageTitle;
        this.pageDesc = pageDesc;
        this.pageButton = pageButton;
        this.videoList = videoList;
        this.approveInfo = approveInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PrivacyHighlightsForTeens(String str, PrivacyHighlightsForTeensDescription privacyHighlightsForTeensDescription, String str2, List list, PrivacyHighlightsForTeensApproveInfo privacyHighlightsForTeensApproveInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new PrivacyHighlightsForTeensDescription(null, null, null, 7, null) : privacyHighlightsForTeensDescription, (i & 4) == 0 ? str2 : "", (i & 8) != 0 ? C61878OQg.INSTANCE : list, (i & 16) != 0 ? new PrivacyHighlightsForTeensApproveInfo(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0) : privacyHighlightsForTeensApproveInfo);
    }
}
