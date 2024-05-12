package com.ss.android.ugc.aweme.compliance.business.search.feedback;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class QuestionData extends F9E implements Serializable {
    public static final int $stable = 8;

    @InterfaceC65349Pkn("content")
    public final List<QuestionContent> content;

    @InterfaceC65349Pkn("desc")
    public final String desc;

    @InterfaceC65349Pkn("hint")
    public final String hint;

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("placeholder")
    public final String placeholder;

    @InterfaceC65349Pkn("required")
    public final boolean required;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("type")
    public final int type;

    public QuestionData() {
        this(null, null, null, null, null, null, 0, false, 255, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QuestionData copy$default(QuestionData questionData, String str, String str2, String str3, String str4, List list, String str5, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = questionData.title;
        }
        if ((i2 & 2) != 0) {
            str2 = questionData.desc;
        }
        if ((i2 & 4) != 0) {
            str3 = questionData.hint;
        }
        if ((i2 & 8) != 0) {
            str4 = questionData.placeholder;
        }
        if ((i2 & 16) != 0) {
            list = questionData.content;
        }
        if ((i2 & 32) != 0) {
            str5 = questionData.id;
        }
        if ((i2 & 64) != 0) {
            i = questionData.type;
        }
        if ((i2 & 128) != 0) {
            z = questionData.required;
        }
        return questionData.copy(str, str2, str3, str4, list, str5, i, z);
    }

    public final QuestionData copy(String title, String desc, String hint, String placeholder, List<QuestionContent> content, String id, int i, boolean z) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(desc, "desc");
        o.LJIIIZ(hint, "hint");
        o.LJIIIZ(placeholder, "placeholder");
        o.LJIIIZ(content, "content");
        o.LJIIIZ(id, "id");
        return new QuestionData(title, desc, hint, placeholder, content, id, i, z);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.title, this.desc, this.hint, this.placeholder, this.content, this.id, Integer.valueOf(this.type), Boolean.valueOf(this.required)};
    }

    public final List<QuestionContent> getContent() {
        return this.content;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getHint() {
        return this.hint;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final boolean getRequired() {
        return this.required;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public QuestionData(String title, String desc, String hint, String placeholder, List<QuestionContent> content, String id, int i, boolean z) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(desc, "desc");
        o.LJIIIZ(hint, "hint");
        o.LJIIIZ(placeholder, "placeholder");
        o.LJIIIZ(content, "content");
        o.LJIIIZ(id, "id");
        this.title = title;
        this.desc = desc;
        this.hint = hint;
        this.placeholder = placeholder;
        this.content = content;
        this.id = id;
        this.type = i;
        this.required = z;
    }

    public QuestionData(String str, String str2, String str3, String str4, List list, String str5, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? C61878OQg.INSTANCE : list, (i2 & 32) == 0 ? str5 : "", (i2 & 64) != 0 ? 0 : i, (i2 & 128) == 0 ? z : false);
    }
}
