package com.ss.android.ugc.aweme.notice.repo.list.uitemplate;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LabelInfoTemplate {

    @InterfaceC65349Pkn("action_type")
    public final int actionType;

    @InterfaceC65349Pkn("text_content")
    public final String content;

    @InterfaceC65349Pkn("matched_friend")
    public final MatchedFriendStruct matchedFriendStruct;

    @InterfaceC65349Pkn("schema_url")
    public final String schema;

    @InterfaceC65349Pkn("view_type")
    public final int viewType;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LabelInfoTemplate)) {
            return false;
        }
        LabelInfoTemplate labelInfoTemplate = (LabelInfoTemplate) obj;
        return this.viewType == labelInfoTemplate.viewType && o.LJ(this.content, labelInfoTemplate.content) && this.actionType == labelInfoTemplate.actionType && o.LJ(this.schema, labelInfoTemplate.schema) && o.LJ(this.matchedFriendStruct, labelInfoTemplate.matchedFriendStruct);
    }

    public final int hashCode() {
        int i = this.viewType * 31;
        String str = this.content;
        int hashCode = (((i + (str == null ? 0 : str.hashCode())) * 31) + this.actionType) * 31;
        String str2 = this.schema;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        MatchedFriendStruct matchedFriendStruct = this.matchedFriendStruct;
        return hashCode2 + (matchedFriendStruct != null ? matchedFriendStruct.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LabelInfoTemplate(viewType=");
        LIZ.append(this.viewType);
        LIZ.append(", content=");
        LIZ.append(this.content);
        LIZ.append(", actionType=");
        LIZ.append(this.actionType);
        LIZ.append(", schema=");
        LIZ.append(this.schema);
        LIZ.append(", matchedFriendStruct=");
        LIZ.append(this.matchedFriendStruct);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public LabelInfoTemplate(int i, String str, int i2, String str2, MatchedFriendStruct matchedFriendStruct) {
        this.viewType = i;
        this.content = str;
        this.actionType = i2;
        this.schema = str2;
        this.matchedFriendStruct = matchedFriendStruct;
    }
}
