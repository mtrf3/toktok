package X;

import java.io.Serializable;
import java.util.HashMap;

/* renamed from: X.OpQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63088OpQ implements Serializable {
    public String conversationId;
    public String desc;
    public java.util.Map<String, String> ext;
    public String icon;
    public int mode;
    public String name;
    public String notice;
    public long owner;
    public String secOwner;
    public int silent;
    public int silentNormalOnly;
    public long version;

    public synchronized java.util.Map<String, String> getExt() {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        return this.ext;
    }

    public String getExtStr() {
        return C63682Oz0.LIZ(this.ext);
    }

    public String getConversationId() {
        return this.conversationId;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getIcon() {
        return this.icon;
    }

    public int getMode() {
        return this.mode;
    }

    public String getName() {
        return this.name;
    }

    public String getNotice() {
        return this.notice;
    }

    public long getOwner() {
        return this.owner;
    }

    public String getSecOwner() {
        return this.secOwner;
    }

    public int getSilent() {
        return this.silent;
    }

    public int getSilentNormalOnly() {
        return this.silentNormalOnly;
    }

    public long getVersion() {
        return this.version;
    }

    public void setConversationId(String str) {
        this.conversationId = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setExt(java.util.Map<String, String> map) {
        this.ext = map;
    }

    public void setExtStr(String str) {
        this.ext = C63682Oz0.LIZIZ(str);
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setMode(int i) {
        this.mode = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNotice(String str) {
        this.notice = str;
    }

    public void setOwner(long j) {
        this.owner = j;
    }

    public void setSecOwner(String str) {
        this.secOwner = str;
    }

    public void setSilent(int i) {
        this.silent = i;
    }

    public void setSilentNormalOnly(int i) {
        this.silentNormalOnly = i;
    }

    public void setVersion(long j) {
        this.version = j;
    }
}
