package com.ss.android.ugc.aweme.notice.repo.list.uitemplate;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class NoticeUITemplateButton {

    @InterfaceC65349Pkn("actions")
    public final List<Integer> actions;

    @InterfaceC65349Pkn("content")
    public final String content;

    @InterfaceC65349Pkn("schema_url")
    public final String schemaUrl;

    @InterfaceC65349Pkn("type")
    public final Integer type;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeUITemplateButton)) {
            return false;
        }
        NoticeUITemplateButton noticeUITemplateButton = (NoticeUITemplateButton) obj;
        return o.LJ(this.content, noticeUITemplateButton.content) && o.LJ(this.type, noticeUITemplateButton.type) && o.LJ(this.schemaUrl, noticeUITemplateButton.schemaUrl) && o.LJ(this.actions, noticeUITemplateButton.actions);
    }

    public final int hashCode() {
        String str = this.content;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.type;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.schemaUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Integer> list = this.actions;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NoticeUITemplateButton(content=");
        LIZ.append(this.content);
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(", schemaUrl=");
        LIZ.append(this.schemaUrl);
        LIZ.append(", actions=");
        return C1NE.LIZIZ(LIZ, this.actions, ')', LIZ);
    }

    public NoticeUITemplateButton(String str, Integer num, String str2, List<Integer> list) {
        this.content = str;
        this.type = num;
        this.schemaUrl = str2;
        this.actions = list;
    }
}
