package com.bytedance.android.livesdk.survey.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SurveySecondQuestion extends F9E {

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("is_other")
    public boolean isOther;

    @InterfaceC65349Pkn("option_id")
    public int optionId;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SurveySecondQuestion() {
        /*
            r6 = this;
            r1 = 0
            r2 = 0
            r4 = 7
            r0 = r6
            r3 = r2
            r5 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.survey.model.SurveySecondQuestion.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.content, Integer.valueOf(this.optionId), Boolean.valueOf(this.isOther)};
    }

    public SurveySecondQuestion(String content, int i, boolean z) {
        o.LJIIIZ(content, "content");
        this.content = content;
        this.optionId = i;
        this.isOther = z;
    }

    public /* synthetic */ SurveySecondQuestion(String str, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? false : z);
    }
}
