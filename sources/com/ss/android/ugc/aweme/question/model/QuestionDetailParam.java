package com.ss.android.ugc.aweme.question.model;

import X.C221108m2;
import X.C5H3;
import X.GHK;
import X.X1D;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class QuestionDetailParam implements Serializable, IRouteArg {
    public static final Parcelable.Creator<QuestionDetailParam> CREATOR = new GHK();
    public String awemeId;
    public final C5H3 enterFrom$delegate;
    public String enterMethod;
    public String from;
    public final C5H3 id$delegate;
    public String processId;
    public String qaOrigin;
    public String questionCategory;
    public String questionId;
    public String questionType;

    /* JADX WARN: Multi-variable type inference failed */
    public QuestionDetailParam() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QuestionDetailParam(String str) {
        this(str, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 254, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QuestionDetailParam(String str, String str2) {
        this(str, str2, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 252, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QuestionDetailParam(String str, String str2, String str3) {
        this(str, str2, str3, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 248, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QuestionDetailParam(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 240, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QuestionDetailParam(String str, String str2, String str3, String str4, String str5) {
        this(str, str2, str3, str4, str5, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 224, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QuestionDetailParam(String str, String str2, String str3, String str4, String str5, String str6) {
        this(str, str2, str3, str4, str5, str6, null, 0 == true ? 1 : 0, 192, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QuestionDetailParam(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(str, str2, str3, str4, str5, str6, str7, null, 128, 0 == true ? 1 : 0);
    }

    public static QuestionDetailParam __fromBundle(Bundle bundle) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8 = null;
        if (bundle == null) {
            return null;
        }
        if (bundle.containsKey("id")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("id"), String.class);
            i = 0;
        } else {
            i = 1;
            str = null;
        }
        if (bundle.containsKey("aweme_id")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("aweme_id"), String.class);
        } else {
            i += 2;
            str2 = null;
        }
        if (bundle.containsKey("enter_from")) {
            str3 = (String) RouteParser.INSTANCE.parse(bundle.get("enter_from"), String.class);
        } else {
            i += 4;
            str3 = null;
        }
        if (bundle.containsKey("enter_method")) {
            str4 = (String) RouteParser.INSTANCE.parse(bundle.get("enter_method"), String.class);
        } else {
            i += 8;
            str4 = null;
        }
        if (bundle.containsKey("question_type")) {
            str5 = (String) RouteParser.INSTANCE.parse(bundle.get("question_type"), String.class);
        } else {
            i += 16;
            str5 = null;
        }
        if (bundle.containsKey("process_id")) {
            str6 = (String) RouteParser.INSTANCE.parse(bundle.get("process_id"), String.class);
        } else {
            i += 32;
            str6 = null;
        }
        if (bundle.containsKey("qa_origin")) {
            str7 = (String) RouteParser.INSTANCE.parse(bundle.get("qa_origin"), String.class);
        } else {
            i += 64;
            str7 = null;
        }
        if (bundle.containsKey("question_category")) {
            str8 = (String) RouteParser.INSTANCE.parse(bundle.get("question_category"), String.class);
        } else {
            i += 128;
        }
        return new QuestionDetailParam(str, str2, str3, str4, str5, str6, str7, str8, i, null);
    }

    public static /* synthetic */ QuestionDetailParam copy$default(QuestionDetailParam questionDetailParam, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = questionDetailParam.questionId;
        }
        if ((i & 2) != 0) {
            str2 = questionDetailParam.awemeId;
        }
        if ((i & 4) != 0) {
            str3 = questionDetailParam.from;
        }
        if ((i & 8) != 0) {
            str4 = questionDetailParam.enterMethod;
        }
        if ((i & 16) != 0) {
            str5 = questionDetailParam.questionType;
        }
        if ((i & 32) != 0) {
            str6 = questionDetailParam.processId;
        }
        if ((i & 64) != 0) {
            str7 = questionDetailParam.qaOrigin;
        }
        if ((i & 128) != 0) {
            str8 = questionDetailParam.questionCategory;
        }
        return questionDetailParam.copy(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public static /* synthetic */ void getEnterFrom$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public final QuestionDetailParam copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return new QuestionDetailParam(str, str2, str3, str4, str5, str6, str7, str8);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestionDetailParam)) {
            return false;
        }
        QuestionDetailParam questionDetailParam = (QuestionDetailParam) obj;
        return o.LJ(this.questionId, questionDetailParam.questionId) && o.LJ(this.awemeId, questionDetailParam.awemeId) && o.LJ(this.from, questionDetailParam.from) && o.LJ(this.enterMethod, questionDetailParam.enterMethod) && o.LJ(this.questionType, questionDetailParam.questionType) && o.LJ(this.processId, questionDetailParam.processId) && o.LJ(this.qaOrigin, questionDetailParam.qaOrigin) && o.LJ(this.questionCategory, questionDetailParam.questionCategory);
    }

    public int hashCode() {
        String str = this.questionId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.awemeId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.from;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.enterMethod;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.questionType;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.processId;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.qaOrigin;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.questionCategory;
        return hashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.questionId);
        out.writeString(this.awemeId);
        out.writeString(this.from);
        out.writeString(this.enterMethod);
        out.writeString(this.questionType);
        out.writeString(this.processId);
        out.writeString(this.qaOrigin);
        out.writeString(this.questionCategory);
    }

    public final String getEnterFrom() {
        return (String) this.enterFrom$delegate.getValue();
    }

    public final String getId() {
        return (String) this.id$delegate.getValue();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("QuestionDetailParam(questionId=");
        LIZ.append(this.questionId);
        LIZ.append(", awemeId=");
        LIZ.append(this.awemeId);
        LIZ.append(", from=");
        LIZ.append(this.from);
        LIZ.append(", enterMethod=");
        LIZ.append(this.enterMethod);
        LIZ.append(", questionType=");
        LIZ.append(this.questionType);
        LIZ.append(", processId=");
        LIZ.append(this.processId);
        LIZ.append(", qaOrigin=");
        LIZ.append(this.qaOrigin);
        LIZ.append(", questionCategory=");
        return q.LIZIZ(LIZ, this.questionCategory, ')', LIZ);
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final String getFrom() {
        return this.from;
    }

    public final String getProcessId() {
        return this.processId;
    }

    public final String getQaOrigin() {
        return this.qaOrigin;
    }

    public final String getQuestionCategory() {
        return this.questionCategory;
    }

    public final String getQuestionId() {
        return this.questionId;
    }

    public final String getQuestionType() {
        return this.questionType;
    }

    public final void setAwemeId(String str) {
        this.awemeId = str;
    }

    public final void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public final void setFrom(String str) {
        this.from = str;
    }

    public final void setProcessId(String str) {
        this.processId = str;
    }

    public final void setQaOrigin(String str) {
        this.qaOrigin = str;
    }

    public final void setQuestionCategory(String str) {
        this.questionCategory = str;
    }

    public final void setQuestionId(String str) {
        this.questionId = str;
    }

    public final void setQuestionType(String str) {
        this.questionType = str;
    }

    public QuestionDetailParam(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.questionId = str;
        this.awemeId = str2;
        this.from = str3;
        this.enterMethod = str4;
        this.questionType = str5;
        this.processId = str6;
        this.qaOrigin = str7;
        this.questionCategory = str8;
        this.id$delegate = C221108m2.LIZIZ(new AqS157S0100000_7(this, 161));
        this.enterFrom$delegate = C221108m2.LIZIZ(new AqS157S0100000_7(this, 160));
    }

    public /* synthetic */ QuestionDetailParam(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) == 0 ? str8 : "");
    }
}
