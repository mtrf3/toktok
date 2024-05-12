package com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AwemeToolFeedbackECode {
    public static final int $stable = 0;
    public final String code;
    public final String stage;

    /* JADX WARN: Multi-variable type inference failed */
    public AwemeToolFeedbackECode() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AwemeToolFeedbackECode copy$default(AwemeToolFeedbackECode awemeToolFeedbackECode, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = awemeToolFeedbackECode.code;
        }
        if ((i & 2) != 0) {
            str2 = awemeToolFeedbackECode.stage;
        }
        return awemeToolFeedbackECode.copy(str, str2);
    }

    public final AwemeToolFeedbackECode copy(String code, String str) {
        o.LJIIIZ(code, "code");
        return new AwemeToolFeedbackECode(code, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeToolFeedbackECode)) {
            return false;
        }
        AwemeToolFeedbackECode awemeToolFeedbackECode = (AwemeToolFeedbackECode) obj;
        return o.LJ(this.code, awemeToolFeedbackECode.code) && o.LJ(this.stage, awemeToolFeedbackECode.stage);
    }

    public int hashCode() {
        int hashCode = this.code.hashCode() * 31;
        String str = this.stage;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AwemeToolFeedbackECode(code=");
        LIZ.append(this.code);
        LIZ.append(", stage=");
        return q.LIZIZ(LIZ, this.stage, ')', LIZ);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getStage() {
        return this.stage;
    }

    public AwemeToolFeedbackECode(String code, String str) {
        o.LJIIIZ(code, "code");
        this.code = code;
        this.stage = str;
    }

    public /* synthetic */ AwemeToolFeedbackECode(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2);
    }
}
