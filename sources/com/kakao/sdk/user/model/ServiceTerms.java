package com.kakao.sdk.user.model;

import X.F9E;
import java.util.Date;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ServiceTerms extends F9E {
    public final Date agreedAt;
    public final String tag;

    public static /* synthetic */ ServiceTerms copy$default(ServiceTerms serviceTerms, String str, Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serviceTerms.tag;
        }
        if ((i & 2) != 0) {
            date = serviceTerms.agreedAt;
        }
        return serviceTerms.copy(str, date);
    }

    public final ServiceTerms copy(String tag, Date agreedAt) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(agreedAt, "agreedAt");
        return new ServiceTerms(tag, agreedAt);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.tag, this.agreedAt};
    }

    public final Date getAgreedAt() {
        return this.agreedAt;
    }

    public final String getTag() {
        return this.tag;
    }

    public ServiceTerms(String tag, Date agreedAt) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(agreedAt, "agreedAt");
        this.tag = tag;
        this.agreedAt = agreedAt;
    }
}
