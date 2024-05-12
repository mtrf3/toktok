package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class Content {
    public final Parser parser;
    public final List<Template> template;
    public final String tips;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Content copy$default(Content content, String str, List list, Parser parser, int i, Object obj) {
        if ((i & 1) != 0) {
            str = content.tips;
        }
        if ((i & 2) != 0) {
            list = content.template;
        }
        if ((i & 4) != 0) {
            parser = content.parser;
        }
        return content.copy(str, list, parser);
    }

    public final Content copy(String tips, List<Template> list, Parser parser) {
        o.LJIIIZ(tips, "tips");
        return new Content(tips, list, parser);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Content)) {
            return false;
        }
        Content content = (Content) obj;
        return o.LJ(this.tips, content.tips) && o.LJ(this.template, content.template) && o.LJ(this.parser, content.parser);
    }

    public int hashCode() {
        int hashCode = this.tips.hashCode() * 31;
        List<Template> list = this.template;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Parser parser = this.parser;
        return hashCode2 + (parser != null ? parser.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Content(tips=");
        LIZ.append(this.tips);
        LIZ.append(", template=");
        LIZ.append(this.template);
        LIZ.append(", parser=");
        LIZ.append(this.parser);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final Parser getParser() {
        return this.parser;
    }

    public final List<Template> getTemplate() {
        return this.template;
    }

    public final String getTips() {
        return this.tips;
    }

    public Content(String tips, List<Template> list, Parser parser) {
        o.LJIIIZ(tips, "tips");
        this.tips = tips;
        this.template = list;
        this.parser = parser;
    }
}
