package com.ss.android.ugc.aweme.feed.model.live;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class RelatedLiveTagStruct implements Serializable {

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("related_tag")
    public String relatedLiveTag;

    @InterfaceC65349Pkn("tag_name")
    public String tagName;

    /* JADX WARN: Multi-variable type inference failed */
    public RelatedLiveTagStruct() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RelatedLiveTagStruct copy$default(RelatedLiveTagStruct relatedLiveTagStruct, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = relatedLiveTagStruct.tagName;
        }
        if ((i & 2) != 0) {
            str2 = relatedLiveTagStruct.content;
        }
        if ((i & 4) != 0) {
            str3 = relatedLiveTagStruct.relatedLiveTag;
        }
        return relatedLiveTagStruct.copy(str, str2, str3);
    }

    public final RelatedLiveTagStruct copy(String str, String str2, String str3) {
        return new RelatedLiveTagStruct(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelatedLiveTagStruct)) {
            return false;
        }
        RelatedLiveTagStruct relatedLiveTagStruct = (RelatedLiveTagStruct) obj;
        return o.LJ(this.tagName, relatedLiveTagStruct.tagName) && o.LJ(this.content, relatedLiveTagStruct.content) && o.LJ(this.relatedLiveTag, relatedLiveTagStruct.relatedLiveTag);
    }

    public int hashCode() {
        String str = this.tagName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.content;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.relatedLiveTag;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RelatedLiveTagStruct(tagName=");
        LIZ.append(this.tagName);
        LIZ.append(", content=");
        LIZ.append(this.content);
        LIZ.append(", relatedLiveTag=");
        return q.LIZIZ(LIZ, this.relatedLiveTag, ')', LIZ);
    }

    public final String getContent() {
        return this.content;
    }

    public final String getRelatedLiveTag() {
        return this.relatedLiveTag;
    }

    public final String getTagName() {
        return this.tagName;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setRelatedLiveTag(String str) {
        this.relatedLiveTag = str;
    }

    public final void setTagName(String str) {
        this.tagName = str;
    }

    public RelatedLiveTagStruct(String str, String str2, String str3) {
        this.tagName = str;
        this.content = str2;
        this.relatedLiveTag = str3;
    }

    public /* synthetic */ RelatedLiveTagStruct(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
