package com.ss.android.ugc.aweme.bnpl.network.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class StepItem implements Serializable {
    public static final int $stable = 8;

    @InterfaceC65349Pkn("error_content")
    public final String errorContent;

    @InterfaceC65349Pkn("step_code")
    public final String stepCode;

    @InterfaceC65349Pkn("url")
    public String url;

    public static /* synthetic */ StepItem copy$default(StepItem stepItem, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stepItem.stepCode;
        }
        if ((i & 2) != 0) {
            str2 = stepItem.url;
        }
        if ((i & 4) != 0) {
            str3 = stepItem.errorContent;
        }
        return stepItem.copy(str, str2, str3);
    }

    public final StepItem copy(String stepCode, String url, String str) {
        o.LJIIIZ(stepCode, "stepCode");
        o.LJIIIZ(url, "url");
        return new StepItem(stepCode, url, str);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StepItem(stepCode=");
        LIZ.append(this.stepCode);
        LIZ.append(", url=");
        LIZ.append(this.url);
        LIZ.append(", errorContent=");
        LIZ.append(this.errorContent);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public int hashCode() {
        return this.stepCode.hashCode();
    }

    public final String getErrorContent() {
        return this.errorContent;
    }

    public final String getStepCode() {
        return this.stepCode;
    }

    public final String getUrl() {
        return this.url;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!o.LJ(StepItem.class, cls)) {
            return false;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.bnpl.network.model.StepItem");
        if (o.LJ(this.stepCode, ((StepItem) obj).stepCode)) {
            return true;
        }
        return false;
    }

    public final void setUrl(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.url = str;
    }

    public StepItem(String stepCode, String url, String str) {
        o.LJIIIZ(stepCode, "stepCode");
        o.LJIIIZ(url, "url");
        this.stepCode = stepCode;
        this.url = url;
        this.errorContent = str;
    }
}
