package com.ss.android.ugc.aweme.challenge.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* loaded from: classes13.dex */
public class ChallengeDetail extends BaseResponse {

    @InterfaceC65349Pkn("ch_info")
    public Challenge challenge;

    @InterfaceC65349Pkn("dynamic_list")
    public List<ChallengeMixFeed> dynamicList;

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPb;

    @InterfaceC65349Pkn("preview_status")
    public int previewStatus;

    @InterfaceC65349Pkn("preview_toast_text")
    public String previewToastText;

    @InterfaceC65349Pkn("rec_list")
    public List<RelatedChallengeMusic> relatedChallengeMusicList;

    @InterfaceC65349Pkn("slide_list")
    public List<Aweme> slideList;

    @InterfaceC65349Pkn("slide_title")
    public String slideTitle;

    public ChallengeDetail setDynamicList(List<ChallengeMixFeed> list) {
        this.dynamicList = list;
        return this;
    }

    public ChallengeDetail setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
        return this;
    }
}
