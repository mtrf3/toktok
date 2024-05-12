package com.ss.android.ugc.aweme.tag.api;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class MentionCheckResponse extends BaseResponse {

    @InterfaceC65349Pkn("ba_uids")
    public ArrayList<String> baUidList;

    @InterfaceC65349Pkn("block_results")
    public ArrayList<MentionCheckResult> blockResults;
}
