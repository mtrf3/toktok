package com.ss.android.ugc.aweme.qna.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class QuestionCategoryStruct {

    @InterfaceC65349Pkn("category_display_name")
    public final String categoryName;

    @InterfaceC65349Pkn("category_id")
    public final String id;

    /* JADX WARN: Multi-variable type inference failed */
    public QuestionCategoryStruct() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestionCategoryStruct)) {
            return false;
        }
        QuestionCategoryStruct questionCategoryStruct = (QuestionCategoryStruct) obj;
        return o.LJ(this.categoryName, questionCategoryStruct.categoryName) && o.LJ(this.id, questionCategoryStruct.id);
    }

    public final int hashCode() {
        String str = this.categoryName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.id;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("QuestionCategoryStruct(categoryName=");
        LIZ.append(this.categoryName);
        LIZ.append(", id=");
        return q.LIZIZ(LIZ, this.id, ')', LIZ);
    }

    public QuestionCategoryStruct(String str, String str2) {
        this.categoryName = str;
        this.id = str2;
    }

    public /* synthetic */ QuestionCategoryStruct(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
