package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes11.dex */
public final class LiveEvent implements Serializable {

    @InterfaceC65349Pkn("customActionItems")
    public List<String> customActionItems;

    @InterfaceC65349Pkn("eventID")
    public String eventID;

    @InterfaceC65349Pkn("internalURL")
    public String internalURL;

    @InterfaceC65349Pkn("isAnchor")
    public String isAnchor;

    @InterfaceC65349Pkn("organizer")
    public User organizer;

    @InterfaceC65349Pkn("shareURL")
    public String shareURL;

    @InterfaceC65349Pkn("showsIMForActivity")
    public Boolean showsIMForActivity = Boolean.TRUE;

    @InterfaceC65349Pkn("startTime")
    public String startTime;

    @InterfaceC65349Pkn("title")
    public String title;

    @InterfaceC65349Pkn("track_info")
    public String trackInfo;

    public final List<String> getCustomActionItems() {
        return this.customActionItems;
    }

    public final String getEventID() {
        return this.eventID;
    }

    public final String getInternalURL() {
        return this.internalURL;
    }

    public final User getOrganizer() {
        return this.organizer;
    }

    public final String getShareURL() {
        return this.shareURL;
    }

    public final Boolean getShowsIMForActivity() {
        return this.showsIMForActivity;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTrackInfo() {
        return this.trackInfo;
    }

    public final String isAnchor() {
        return this.isAnchor;
    }

    public final void setAnchor(String str) {
        this.isAnchor = str;
    }

    public final void setCustomActionItems(List<String> list) {
        this.customActionItems = list;
    }

    public final void setEventID(String str) {
        this.eventID = str;
    }

    public final void setInternalURL(String str) {
        this.internalURL = str;
    }

    public final void setOrganizer(User user) {
        this.organizer = user;
    }

    public final void setShareURL(String str) {
        this.shareURL = str;
    }

    public final void setShowsIMForActivity(Boolean bool) {
        this.showsIMForActivity = bool;
    }

    public final void setStartTime(String str) {
        this.startTime = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setTrackInfo(String str) {
        this.trackInfo = str;
    }
}
