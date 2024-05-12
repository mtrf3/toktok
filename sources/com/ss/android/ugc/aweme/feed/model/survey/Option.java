package com.ss.android.ugc.aweme.feed.model.survey;

import X.C48339Iy7;
import X.C79062V1e;
import X.HH1;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class Option implements Serializable {
    public String additional_content;

    @InterfaceC65349Pkn("extra")
    public String extra;

    @InterfaceC65349Pkn("id")
    public int id;
    public boolean isSelected;

    @InterfaceC65349Pkn("name")
    public String name;

    @InterfaceC65349Pkn("questions")
    public Question[] questions;

    @InterfaceC65349Pkn("type")
    public int type;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Option() {
        /*
            r10 = this;
            r1 = 0
            r2 = 0
            r8 = 127(0x7f, float:1.78E-43)
            r0 = r10
            r3 = r2
            r4 = r1
            r5 = r2
            r6 = r2
            r7 = r1
            r9 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.model.survey.Option.<init>():void");
    }

    public static /* synthetic */ Option copy$default(Option option, int i, String str, Question[] questionArr, int i2, String str2, String str3, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = option.id;
        }
        if ((i3 & 2) != 0) {
            str = option.name;
        }
        if ((i3 & 4) != 0) {
            questionArr = option.questions;
        }
        if ((i3 & 8) != 0) {
            i2 = option.type;
        }
        if ((i3 & 16) != 0) {
            str2 = option.extra;
        }
        if ((i3 & 32) != 0) {
            str3 = option.additional_content;
        }
        if ((i3 & 64) != 0) {
            z = option.isSelected;
        }
        return option.copy(i, str, questionArr, i2, str2, str3, z);
    }

    public final Option copy(int i, String name, Question[] questionArr, int i2, String extra, String additional_content, boolean z) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(extra, "extra");
        o.LJIIIZ(additional_content, "additional_content");
        return new Option(i, name, questionArr, i2, extra, additional_content, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Option)) {
            return false;
        }
        Option option = (Option) obj;
        return this.id == option.id && o.LJ(this.name, option.name) && o.LJ(this.questions, option.questions) && this.type == option.type && o.LJ(this.extra, option.extra) && o.LJ(this.additional_content, option.additional_content) && this.isSelected == option.isSelected;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.name, this.id * 31, 31);
        Question[] questionArr = this.questions;
        if (questionArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(questionArr);
        }
        int LJ2 = C79062V1e.LJ(this.additional_content, C79062V1e.LJ(this.extra, (((LJ + hashCode) * 31) + this.type) * 31, 31), 31);
        boolean z = this.isSelected;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return LJ2 + i;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Option(id=");
        LIZ.append(this.id);
        LIZ.append(", name=");
        LIZ.append(this.name);
        LIZ.append(", questions=");
        LIZ.append(Arrays.toString(this.questions));
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(", extra=");
        LIZ.append(this.extra);
        LIZ.append(", additional_content=");
        LIZ.append(this.additional_content);
        LIZ.append(", isSelected=");
        return C48339Iy7.LIZJ(LIZ, this.isSelected, ')', LIZ);
    }

    public final String getAdditional_content() {
        return this.additional_content;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final Question[] getQuestions() {
        return this.questions;
    }

    public final int getType() {
        return this.type;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setAdditional_content(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.additional_content = str;
    }

    public final void setExtra(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.extra = str;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setName(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.name = str;
    }

    public final void setQuestions(Question[] questionArr) {
        this.questions = questionArr;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public Option(int i, String str, Question[] questionArr, int i2, String str2, String str3, boolean z) {
        HH1.LIZ(str, "name", str2, "extra", str3, "additional_content");
        this.id = i;
        this.name = str;
        this.questions = questionArr;
        this.type = i2;
        this.extra = str2;
        this.additional_content = str3;
        this.isSelected = z;
    }

    public /* synthetic */ Option(int i, String str, Question[] questionArr, int i2, String str2, String str3, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? null : questionArr, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? "" : str2, (i3 & 32) == 0 ? str3 : "", (i3 & 64) != 0 ? false : z);
    }
}
