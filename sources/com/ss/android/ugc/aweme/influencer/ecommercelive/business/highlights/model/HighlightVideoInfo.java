package com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HighlightVideoInfo implements Serializable {

    @InterfaceC65349Pkn("cover_url")
    public final String coverUrl;

    @InterfaceC65349Pkn("fragment_id")
    public final String fragmentId;

    @InterfaceC65349Pkn("length")
    public final Long length;

    @InterfaceC65349Pkn("show_text")
    public final String text;

    @InterfaceC65349Pkn("url")
    public String url;

    public static /* synthetic */ HighlightVideoInfo copy$default(HighlightVideoInfo highlightVideoInfo, String str, String str2, Long l, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = highlightVideoInfo.fragmentId;
        }
        if ((i & 2) != 0) {
            str2 = highlightVideoInfo.coverUrl;
        }
        if ((i & 4) != 0) {
            l = highlightVideoInfo.length;
        }
        if ((i & 8) != 0) {
            str3 = highlightVideoInfo.url;
        }
        if ((i & 16) != 0) {
            str4 = highlightVideoInfo.text;
        }
        return highlightVideoInfo.copy(str, str2, l, str3, str4);
    }

    public final HighlightVideoInfo copy(String str, String str2, Long l, String str3, String str4) {
        return new HighlightVideoInfo(str, str2, l, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HighlightVideoInfo)) {
            return false;
        }
        HighlightVideoInfo highlightVideoInfo = (HighlightVideoInfo) obj;
        return o.LJ(this.fragmentId, highlightVideoInfo.fragmentId) && o.LJ(this.coverUrl, highlightVideoInfo.coverUrl) && o.LJ(this.length, highlightVideoInfo.length) && o.LJ(this.url, highlightVideoInfo.url) && o.LJ(this.text, highlightVideoInfo.text);
    }

    public int hashCode() {
        String str = this.fragmentId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.coverUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.length;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.url;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.text;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HighlightVideoInfo(fragmentId=");
        LIZ.append(this.fragmentId);
        LIZ.append(", coverUrl=");
        LIZ.append(this.coverUrl);
        LIZ.append(", length=");
        LIZ.append(this.length);
        LIZ.append(", url=");
        LIZ.append(this.url);
        LIZ.append(", text=");
        return q.LIZIZ(LIZ, this.text, ')', LIZ);
    }

    public final String getCoverUrl() {
        return this.coverUrl;
    }

    public final String getFragmentId() {
        return this.fragmentId;
    }

    public final Long getLength() {
        return this.length;
    }

    public final String getText() {
        return this.text;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public HighlightVideoInfo(String str, String str2, Long l, String str3, String str4) {
        this.fragmentId = str;
        this.coverUrl = str2;
        this.length = l;
        this.url = str3;
        this.text = str4;
    }
}
