package com.ss.android.ugc.aweme.feed.model.survey;

import X.C79062V1e;
import X.HH1;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class Question implements Serializable {

    @InterfaceC65349Pkn("id")
    public String id;

    @InterfaceC65349Pkn("options")
    public Option[] options;

    @InterfaceC65349Pkn("subtitle")
    public String subtitle;

    @InterfaceC65349Pkn("title")
    public String title;

    @InterfaceC65349Pkn("type")
    public int type;

    /* JADX WARN: Multi-variable type inference failed */
    public Question() {
        this(null, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Question copy$default(Question question, String str, int i, String str2, String str3, Option[] optionArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = question.id;
        }
        if ((i2 & 2) != 0) {
            i = question.type;
        }
        if ((i2 & 4) != 0) {
            str2 = question.title;
        }
        if ((i2 & 8) != 0) {
            str3 = question.subtitle;
        }
        if ((i2 & 16) != 0) {
            optionArr = question.options;
        }
        return question.copy(str, i, str2, str3, optionArr);
    }

    public final Question copy(String id, int i, String title, String subtitle, Option[] optionArr) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(subtitle, "subtitle");
        return new Question(id, i, title, subtitle, optionArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Question)) {
            return false;
        }
        Question question = (Question) obj;
        return o.LJ(this.id, question.id) && this.type == question.type && o.LJ(this.title, question.title) && o.LJ(this.subtitle, question.subtitle) && o.LJ(this.options, question.options);
    }

    public int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.subtitle, C79062V1e.LJ(this.title, ((this.id.hashCode() * 31) + this.type) * 31, 31), 31);
        Option[] optionArr = this.options;
        if (optionArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(optionArr);
        }
        return LJ + hashCode;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Question(id=");
        LIZ.append(this.id);
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", subtitle=");
        LIZ.append(this.subtitle);
        LIZ.append(", options=");
        return q.LIZIZ(LIZ, Arrays.toString(this.options), ')', LIZ);
    }

    public final String getId() {
        return this.id;
    }

    public final Option[] getOptions() {
        return this.options;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public final void setId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.id = str;
    }

    public final void setOptions(Option[] optionArr) {
        this.options = optionArr;
    }

    public final void setSubtitle(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.subtitle = str;
    }

    public final void setTitle(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.title = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public Question(String str, int i, String str2, String str3, Option[] optionArr) {
        HH1.LIZ(str, "id", str2, "title", str3, "subtitle");
        this.id = str;
        this.type = i;
        this.title = str2;
        this.subtitle = str3;
        this.options = optionArr;
    }

    public /* synthetic */ Question(String str, int i, String str2, String str3, Option[] optionArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str2, (i2 & 8) == 0 ? str3 : "", (i2 & 16) != 0 ? null : optionArr);
    }
}
