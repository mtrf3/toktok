package com.ss.android.ugc.aweme.im.service.model;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class IMContact implements Serializable {
    public boolean isAtLastInSharePanel;
    public int isRecentContact;
    public int isRecentTop5Contact;
    public transient boolean isShareSuccess;
    public boolean isStickTop;
    public int relationListItemType;
    public transient String shareRelationType;

    public abstract UrlModel getDisplayAvatar();

    public abstract String getDisplayName();

    public abstract String getNickName();

    public boolean getIsAtLastInSharePanel() {
        return this.isAtLastInSharePanel;
    }

    public int getIsRecentContact() {
        return this.isRecentContact;
    }

    public int getIsRecentTop5Contact() {
        return this.isRecentTop5Contact;
    }

    public String getShareRelationType() {
        return this.shareRelationType;
    }

    public int getType() {
        return this.relationListItemType;
    }

    public boolean isShareSuccess() {
        return this.isShareSuccess;
    }

    public boolean isStickTop() {
        return this.isStickTop;
    }

    public void setIsAtLastInSharePanel(boolean z) {
        this.isAtLastInSharePanel = z;
    }

    public void setIsRecentContact(int i) {
        this.isRecentContact = i;
    }

    public void setIsRecentTop5Contact(int i) {
        this.isRecentTop5Contact = i;
    }

    public void setShareRelationType(String str) {
        this.shareRelationType = str;
    }

    public void setShareSuccess(boolean z) {
        this.isShareSuccess = z;
    }

    public void setStickTop(boolean z) {
        this.isStickTop = z;
    }

    public void setType(int i) {
        this.relationListItemType = i;
    }
}
