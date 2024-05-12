package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.Challenge;

/* loaded from: classes10.dex */
public class AnnouncementNotice {

    @InterfaceC65349Pkn("challenge")
    public Challenge challenge;

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("image_url")
    public UrlModel imageUrl;

    @InterfaceC65349Pkn("object_id")
    public String objectId;

    @InterfaceC65349Pkn("schema_url")
    public String schemaUrl;

    @InterfaceC65349Pkn("search")
    public Search search;

    @InterfaceC65349Pkn("task_id")
    public long taskId;

    @InterfaceC65349Pkn("title")
    public String title;

    @InterfaceC65349Pkn("type")
    public int type;

    public Challenge getChallenge() {
        return this.challenge;
    }

    public String getContent() {
        return this.content;
    }

    public UrlModel getImageUrl() {
        return this.imageUrl;
    }

    public String getObjectId() {
        return this.objectId;
    }

    public String getSchemaUrl() {
        return this.schemaUrl;
    }

    public Search getSearch() {
        return this.search;
    }

    public long getTaskId() {
        return this.taskId;
    }

    public String getTitle() {
        return this.title;
    }

    public int getType() {
        return this.type;
    }

    public void setChallenge(Challenge challenge) {
        this.challenge = challenge;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setImageUrl(UrlModel urlModel) {
        this.imageUrl = urlModel;
    }

    public void setObjectId(String str) {
        this.objectId = str;
    }

    public void setSchemaUrl(String str) {
        this.schemaUrl = str;
    }

    public void setSearch(Search search) {
        this.search = search;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(int i) {
        this.type = i;
    }
}
