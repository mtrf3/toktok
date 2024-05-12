package com.ss.android.ugc.aweme.im.service.model;

import X.Q89;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import defpackage.b0;

/* loaded from: classes2.dex */
public class IMConversation extends IMContact {
    public String initialLetter;
    public UrlModel mConversationAvatar;
    public String mConversationId;
    public int mConversationMemberCount;
    public String mConversationName;
    public long mConversationShortId;
    public int mConversationType;

    @Override // com.ss.android.ugc.aweme.im.service.model.IMContact
    public String getNickName() {
        return null;
    }

    public int hashCode() {
        if (getConversationId() != null) {
            return getConversationId().hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMConversation{mConversationType=");
        LIZ.append(this.mConversationType);
        LIZ.append(", mConversationId='");
        Q89.LIZIZ(LIZ, this.mConversationId, '\'', ", mConversationName='");
        Q89.LIZIZ(LIZ, this.mConversationName, '\'', ", mConversationMemberCount=");
        LIZ.append(this.mConversationMemberCount);
        LIZ.append(", mConversationAvatar=");
        LIZ.append(this.mConversationAvatar);
        LIZ.append(", relationListItemType=");
        return b0.LIZJ(LIZ, this.relationListItemType, '}', LIZ);
    }

    public UrlModel getConversationAvatar() {
        return this.mConversationAvatar;
    }

    public String getConversationId() {
        return this.mConversationId;
    }

    public int getConversationMemberCount() {
        return this.mConversationMemberCount;
    }

    public String getConversationName() {
        return this.mConversationName;
    }

    public long getConversationShortId() {
        return this.mConversationShortId;
    }

    public int getConversationType() {
        return this.mConversationType;
    }

    @Override // com.ss.android.ugc.aweme.im.service.model.IMContact
    public UrlModel getDisplayAvatar() {
        return this.mConversationAvatar;
    }

    @Override // com.ss.android.ugc.aweme.im.service.model.IMContact
    public String getDisplayName() {
        return this.mConversationName;
    }

    public String getInitialLetter() {
        return this.initialLetter;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMConversation)) {
            return false;
        }
        IMConversation iMConversation = (IMConversation) obj;
        if (getConversationId() != null) {
            return getConversationId().equals(iMConversation.getConversationId());
        }
        if (iMConversation.getConversationId() == null) {
            return true;
        }
        return false;
    }

    public void setConversationAvatar(UrlModel urlModel) {
        this.mConversationAvatar = urlModel;
    }

    public void setConversationId(String str) {
        this.mConversationId = str;
    }

    public void setConversationMemberCount(int i) {
        this.mConversationMemberCount = i;
    }

    public void setConversationName(String str) {
        this.mConversationName = str;
    }

    public void setConversationShortId(long j) {
        this.mConversationShortId = j;
    }

    public void setConversationType(int i) {
        this.mConversationType = i;
    }

    public void setInitialLetter(String str) {
        this.initialLetter = str;
    }
}
