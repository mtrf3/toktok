package X;

import java.io.Serializable;
import java.util.HashMap;

/* renamed from: X.OpS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63090OpS implements Serializable {
    public static String TAG = "ConversationSettingInfo";
    public int category;
    public String conversationId;
    public java.util.Map<String, String> ext;
    public int favor;
    public int mute;
    public long setFavoriteTime;
    public long setTopTime;
    public int stickTop;
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

    public boolean isFavor() {
        if (this.favor == 1) {
            return true;
        }
        return false;
    }

    public boolean isMute() {
        if (this.mute == 1) {
            return true;
        }
        return false;
    }

    public boolean isStickTop() {
        if (this.stickTop == 1) {
            return true;
        }
        return false;
    }

    public int getCategory() {
        return this.category;
    }

    public String getConversationId() {
        return this.conversationId;
    }

    public int getFavor() {
        return this.favor;
    }

    public int getMute() {
        return this.mute;
    }

    public long getSetFavoriteTime() {
        return this.setFavoriteTime;
    }

    public long getSetTopTime() {
        return this.setTopTime;
    }

    public int getStickTop() {
        return this.stickTop;
    }

    public long getVersion() {
        return this.version;
    }

    public void setCategory(int i) {
        this.category = i;
    }

    public void setConversationId(String str) {
        this.conversationId = str;
    }

    public void setExt(java.util.Map<String, String> map) {
        this.ext = map;
    }

    public void setExtStr(String str) {
        this.ext = C63682Oz0.LIZIZ(str);
    }

    public void setFavor(int i) {
        this.favor = i;
    }

    public void setMute(int i) {
        this.mute = i;
    }

    public void setSetFavoriteTime(long j) {
        this.setFavoriteTime = j;
    }

    public void setSetTopTime(long j) {
        this.setTopTime = j;
    }

    public void setStickTop(int i) {
        this.stickTop = i;
    }

    public void setVersion(long j) {
        this.version = j;
    }
}
