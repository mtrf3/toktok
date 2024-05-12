package com.ss.android.ugc.tiktok.security.csrf;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class CSRFSettingsBean extends F9E {

    @InterfaceC65349Pkn("csrf_get_api_block_list")
    public final List<BlockRuleBean> getApiBlockList;

    @InterfaceC65349Pkn("csrf_get_path_white_list")
    public final List<String> getPathWhiteList;

    @InterfaceC65349Pkn("csrf_get_white_list")
    public final List<String> getWhiteList;

    @InterfaceC65349Pkn("enable_get_apicall_report")
    public final boolean isApiCallReport;

    @InterfaceC65349Pkn("enable_csrf_cookie_block")
    public final boolean isBlockCookie;

    @InterfaceC65349Pkn("enable_csrf_token_block")
    public final boolean isBlockToken;

    @InterfaceC65349Pkn("enable_ttp_cookie_block")
    public final boolean isBlockTtnet;

    @InterfaceC65349Pkn("enable_crosssite_apicall_report")
    public final boolean isCrosssiteReport;

    @InterfaceC65349Pkn("enable_get_api_block")
    public final boolean isGetApiBlock;

    @InterfaceC65349Pkn("enable_csrf_navigation_block")
    public final boolean isNavigationBlock;

    @InterfaceC65349Pkn("csrf_post_api_block_list")
    public final List<BlockRuleBean> postApiBlockList;

    @InterfaceC65349Pkn("csrf_post_path_white_list")
    public final List<String> postPathWhiteList;

    @InterfaceC65349Pkn("csrf_post_white_list")
    public final List<String> postWhiteList;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CSRFSettingsBean() {
        /*
            r16 = this;
            r1 = 0
            r8 = 0
            r14 = 8191(0x1fff, float:1.1478E-41)
            r0 = r16
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r13 = r8
            r15 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.security.csrf.CSRFSettingsBean.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.isBlockCookie), Boolean.valueOf(this.isBlockToken), Boolean.valueOf(this.isBlockTtnet), Boolean.valueOf(this.isApiCallReport), Boolean.valueOf(this.isCrosssiteReport), Boolean.valueOf(this.isNavigationBlock), Boolean.valueOf(this.isGetApiBlock), this.getWhiteList, this.getPathWhiteList, this.postWhiteList, this.postPathWhiteList, this.getApiBlockList, this.postApiBlockList};
    }

    public CSRFSettingsBean(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, List<String> getWhiteList, List<String> getPathWhiteList, List<String> postWhiteList, List<String> postPathWhiteList, List<BlockRuleBean> getApiBlockList, List<BlockRuleBean> postApiBlockList) {
        o.LJIIIZ(getWhiteList, "getWhiteList");
        o.LJIIIZ(getPathWhiteList, "getPathWhiteList");
        o.LJIIIZ(postWhiteList, "postWhiteList");
        o.LJIIIZ(postPathWhiteList, "postPathWhiteList");
        o.LJIIIZ(getApiBlockList, "getApiBlockList");
        o.LJIIIZ(postApiBlockList, "postApiBlockList");
        this.isBlockCookie = z;
        this.isBlockToken = z2;
        this.isBlockTtnet = z3;
        this.isApiCallReport = z4;
        this.isCrosssiteReport = z5;
        this.isNavigationBlock = z6;
        this.isGetApiBlock = z7;
        this.getWhiteList = getWhiteList;
        this.getPathWhiteList = getPathWhiteList;
        this.postWhiteList = postWhiteList;
        this.postPathWhiteList = postPathWhiteList;
        this.getApiBlockList = getApiBlockList;
        this.postApiBlockList = postApiBlockList;
    }

    public /* synthetic */ CSRFSettingsBean(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, List list, List list2, List list3, List list4, List list5, List list6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? false : z6, (i & 64) == 0 ? z7 : false, (i & 128) != 0 ? new ArrayList() : list, (i & 256) != 0 ? new ArrayList() : list2, (i & 512) != 0 ? new ArrayList() : list3, (i & 1024) != 0 ? new ArrayList() : list4, (i & 2048) != 0 ? new ArrayList() : list5, (i & 4096) != 0 ? new ArrayList() : list6);
    }
}
