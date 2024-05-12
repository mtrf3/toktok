package com.ss.android.ugc.aweme.notice.api.bean;

import X.C43588H8u;
import X.C78966Uyw;
import X.EnumC54358LVa;
import X.InterfaceC65349Pkn;
import X.LVZ;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class PushChallengeInfoMsg extends LVZ {

    @InterfaceC65349Pkn("extra_str")
    public String extra;

    @InterfaceC65349Pkn("text")
    public String text;

    @InterfaceC65349Pkn("title")
    public String title;

    @InterfaceC65349Pkn("open_url")
    public String url;

    public static /* synthetic */ PushChallengeInfoMsg copy$default(PushChallengeInfoMsg pushChallengeInfoMsg, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pushChallengeInfoMsg.url;
        }
        if ((i & 2) != 0) {
            str2 = pushChallengeInfoMsg.title;
        }
        if ((i & 4) != 0) {
            str3 = pushChallengeInfoMsg.text;
        }
        if ((i & 8) != 0) {
            str4 = pushChallengeInfoMsg.extra;
        }
        return pushChallengeInfoMsg.copy(str, str2, str3, str4);
    }

    private Object[] getObjects() {
        return new Object[]{this.url, this.title, this.text, this.extra};
    }

    public final PushChallengeInfoMsg copy(String url, String title, String text, String extra) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(text, "text");
        o.LJIIIZ(extra, "extra");
        return new PushChallengeInfoMsg(url, title, text, extra);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PushChallengeInfoMsg) {
            return C78966Uyw.LJIIIZ(((PushChallengeInfoMsg) obj).getObjects(), getObjects());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    public String toString() {
        return C78966Uyw.LJJJLL("PushChallengeInfoMsg:%s,%s,%s,%s", getObjects());
    }

    public final String getExtra() {
        return this.extra;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    @Override // X.LVZ
    public EnumC54358LVa getType() {
        return EnumC54358LVa.SYSTEM;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setExtra(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.extra = str;
    }

    public final void setText(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.text = str;
    }

    public final void setTitle(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.title = str;
    }

    public final void setUrl(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.url = str;
    }

    public PushChallengeInfoMsg(String str, String str2, String str3, String str4) {
        C43588H8u.LIZLLL(str, "url", str2, "title", str3, "text", str4, "extra");
        this.url = str;
        this.title = str2;
        this.text = str3;
        this.extra = str4;
    }
}
