package com.ss.android.ugc.aweme.creatoredit;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class CreatorCaptionEditData implements Serializable {

    @InterfaceC65349Pkn("end_time")
    public final int endTime;

    @InterfaceC65349Pkn("gender")
    public final String gender;

    @InterfaceC65349Pkn("start_time")
    public final int startTime;

    @InterfaceC65349Pkn("text")
    public String text;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CreatorCaptionEditData() {
        /*
            r7 = this;
            r1 = 0
            r3 = 0
            r5 = 15
            r0 = r7
            r2 = r1
            r4 = r3
            r6 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditData.<init>():void");
    }

    public final int getEndTime() {
        return this.endTime;
    }

    public final String getGender() {
        return this.gender;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public final String getText() {
        return this.text;
    }

    public final void setText(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.text = str;
    }

    public CreatorCaptionEditData(int i, int i2, String text, String gender) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(gender, "gender");
        this.startTime = i;
        this.endTime = i2;
        this.text = text;
        this.gender = gender;
    }

    public /* synthetic */ CreatorCaptionEditData(int i, int i2, String str, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? "male" : str2);
    }
}
