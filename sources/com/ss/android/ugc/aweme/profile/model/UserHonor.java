package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* loaded from: classes14.dex */
public class UserHonor implements Serializable {

    @InterfaceC65349Pkn("now_diamond")
    public long currentDiamond;

    @InterfaceC65349Pkn("icon")
    public UrlModel currentHonorIcon;

    @InterfaceC65349Pkn("name")
    public String currentHonorName;

    @InterfaceC65349Pkn("diamond_icon")
    public UrlModel diamondIcon;

    @InterfaceC65349Pkn("im_icon")
    public UrlModel imIcon;

    @InterfaceC65349Pkn("level")
    public int level;

    @InterfaceC65349Pkn("live_icon")
    public UrlModel liveIcon;

    @InterfaceC65349Pkn("next_diamond")
    public long nextDiamond;

    @InterfaceC65349Pkn("next_icon")
    public UrlModel nextHonorIcon;

    @InterfaceC65349Pkn("next_name")
    public String nextHonorName;

    @InterfaceC65349Pkn("total_diamond_count")
    public long totalDiamond;

    public long getCurrentDiamond() {
        return this.currentDiamond;
    }

    public UrlModel getCurrentHonorIcon() {
        return this.currentHonorIcon;
    }

    public String getCurrentHonorName() {
        return this.currentHonorName;
    }

    public UrlModel getDiamondIcon() {
        return this.diamondIcon;
    }

    public UrlModel getImIcon() {
        return this.imIcon;
    }

    public int getLevel() {
        return this.level;
    }

    public UrlModel getLiveIcon() {
        return this.liveIcon;
    }

    public long getNextDiamond() {
        return this.nextDiamond;
    }

    public UrlModel getNextHonorIcon() {
        return this.nextHonorIcon;
    }

    public String getNextHonorName() {
        return this.nextHonorName;
    }

    public long getTotalDiamond() {
        return this.totalDiamond;
    }

    public void setCurrentDiamond(long j) {
        this.currentDiamond = j;
    }

    public void setCurrentHonorIcon(UrlModel urlModel) {
        this.currentHonorIcon = urlModel;
    }

    public void setCurrentHonorName(String str) {
        this.currentHonorName = str;
    }

    public void setDiamondIcon(UrlModel urlModel) {
        this.diamondIcon = urlModel;
    }

    public void setImIcon(UrlModel urlModel) {
        this.imIcon = urlModel;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public void setLiveIcon(UrlModel urlModel) {
        this.liveIcon = urlModel;
    }

    public void setNextDiamond(long j) {
        this.nextDiamond = j;
    }

    public void setNextHonorIcon(UrlModel urlModel) {
        this.nextHonorIcon = urlModel;
    }

    public void setNextHonorName(String str) {
        this.nextHonorName = str;
    }

    public void setTotalDiamond(long j) {
        this.totalDiamond = j;
    }
}
