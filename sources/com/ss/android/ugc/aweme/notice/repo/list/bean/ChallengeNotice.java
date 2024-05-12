package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.discover.model.Challenge;

/* loaded from: classes4.dex */
public class ChallengeNotice {

    @InterfaceC65349Pkn("challenge")
    public Challenge challenge;

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("schema")
    public String schema;

    @InterfaceC65349Pkn("title")
    public String title;

    public Challenge getChallenge() {
        return this.challenge;
    }

    public String getContent() {
        return this.content;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getTitle() {
        return this.title;
    }

    public void setChallenge(Challenge challenge) {
        this.challenge = challenge;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
