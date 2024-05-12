package X;

import java.io.Serializable;

/* renamed from: X.OpR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63089OpR implements Serializable {
    public String alias;
    public String conversationId;
    public int conversationType;
    public int role;
    public String secUid;
    public int silent;
    public long silentTime;
    public long sortOrder;
    public long uid;

    public int hashCode() {
        if (this.conversationId == null || this.uid == 0) {
            return 0;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.conversationId);
        LIZ.append("_");
        LIZ.append(this.uid);
        return X1D.LIZIZ(LIZ).hashCode();
    }

    public String getAlias() {
        return this.alias;
    }

    public String getConversationId() {
        return this.conversationId;
    }

    public int getConversationType() {
        return this.conversationType;
    }

    public int getRole() {
        return this.role;
    }

    public String getSecUid() {
        return this.secUid;
    }

    public int getSilent() {
        return this.silent;
    }

    public long getSilentTime() {
        return this.silentTime;
    }

    public long getSortOrder() {
        return this.sortOrder;
    }

    public long getUid() {
        return this.uid;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C63089OpR.class != obj.getClass()) {
            return false;
        }
        C63089OpR c63089OpR = (C63089OpR) obj;
        String str = this.conversationId;
        if (str == null ? c63089OpR.conversationId == null : str.equals(c63089OpR.conversationId)) {
            if (this.uid == c63089OpR.uid) {
                return true;
            }
        }
        return false;
    }

    public void setAlias(String str) {
        this.alias = str;
    }

    public void setConversationId(String str) {
        this.conversationId = str;
    }

    public void setConversationType(int i) {
        this.conversationType = i;
    }

    public void setRole(int i) {
        this.role = i;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }

    public void setSilent(int i) {
        this.silent = i;
    }

    public void setSilentTime(long j) {
        this.silentTime = j;
    }

    public void setSortOrder(long j) {
        this.sortOrder = j;
    }

    public void setUid(long j) {
        this.uid = j;
    }
}
