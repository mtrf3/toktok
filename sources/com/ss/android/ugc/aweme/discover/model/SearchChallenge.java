package com.ss.android.ugc.aweme.discover.model;

import X.InterfaceC65349Pkn;
import X.InterfaceC65404Plg;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.commercialize.model.SearchChallengeAdData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public class SearchChallenge implements Serializable {

    @InterfaceC65349Pkn("ad_data")
    @InterfaceC65404Plg(StringJsonAdapterFactory.class)
    public SearchChallengeAdData adData;

    @InterfaceC65349Pkn("items")
    public List<Aweme> awemes;

    @InterfaceC65349Pkn("challenge_info")
    public Challenge challenge;
    public LogPbBean logPbBean;

    @InterfaceC65349Pkn("position")
    public List<Position> position;
    public String requestId;

    public boolean hasAwemeList() {
        List<Aweme> list = this.awemes;
        if (list != null && list.size() >= 3) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.challenge.getCid().hashCode();
    }

    public SearchChallengeAdData getAdData() {
        return this.adData;
    }

    public List<Aweme> getAwemes() {
        return this.awemes;
    }

    public Challenge getChallenge() {
        return this.challenge;
    }

    public List<Position> getPosition() {
        return this.position;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchChallenge)) {
            return false;
        }
        return TextUtils.equals(this.challenge.getCid(), ((SearchChallenge) obj).challenge.getCid());
    }

    public void setAwemes(List<Aweme> list) {
        this.awemes = list;
    }

    public void setRequestId(String str) {
        this.requestId = str;
        Challenge challenge = this.challenge;
        if (challenge != null) {
            challenge.setRequestId(str);
        }
    }
}
