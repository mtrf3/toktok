package com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AwemeToolFeedbackInfo extends F9E {
    public static final int $stable = 8;

    @InterfaceC65349Pkn("cancel_count")
    public final int cancelCount;
    public final int count;

    @InterfaceC65349Pkn("e_code")
    public final List<AwemeToolFeedbackECode> eCode;
    public final String name;

    @InterfaceC65349Pkn("success_count")
    public final int successCount;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AwemeToolFeedbackInfo() {
        /*
            r8 = this;
            r1 = 0
            r2 = 0
            r6 = 31
            r0 = r8
            r3 = r2
            r4 = r2
            r5 = r1
            r7 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AwemeToolFeedbackInfo.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AwemeToolFeedbackInfo copy$default(AwemeToolFeedbackInfo awemeToolFeedbackInfo, String str, int i, int i2, int i3, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = awemeToolFeedbackInfo.name;
        }
        if ((i4 & 2) != 0) {
            i = awemeToolFeedbackInfo.count;
        }
        if ((i4 & 4) != 0) {
            i2 = awemeToolFeedbackInfo.successCount;
        }
        if ((i4 & 8) != 0) {
            i3 = awemeToolFeedbackInfo.cancelCount;
        }
        if ((i4 & 16) != 0) {
            list = awemeToolFeedbackInfo.eCode;
        }
        return awemeToolFeedbackInfo.copy(str, i, i2, i3, list);
    }

    public final AwemeToolFeedbackInfo copy(String name, int i, int i2, int i3, List<AwemeToolFeedbackECode> eCode) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(eCode, "eCode");
        return new AwemeToolFeedbackInfo(name, i, i2, i3, eCode);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.name, Integer.valueOf(this.count), Integer.valueOf(this.successCount), Integer.valueOf(this.cancelCount), this.eCode};
    }

    public final int getCancelCount() {
        return this.cancelCount;
    }

    public final int getCount() {
        return this.count;
    }

    public final List<AwemeToolFeedbackECode> getECode() {
        return this.eCode;
    }

    public final String getName() {
        return this.name;
    }

    public final int getSuccessCount() {
        return this.successCount;
    }

    public AwemeToolFeedbackInfo(String name, int i, int i2, int i3, List<AwemeToolFeedbackECode> eCode) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(eCode, "eCode");
        this.name = name;
        this.count = i;
        this.successCount = i2;
        this.cancelCount = i3;
        this.eCode = eCode;
    }

    public /* synthetic */ AwemeToolFeedbackInfo(String str, int i, int i2, int i3, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) == 0 ? i3 : 0, (i4 & 16) != 0 ? new ArrayList() : list);
    }
}
