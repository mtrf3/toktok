package com.kakao.sdk.user.model;

import X.F9E;
import java.util.Date;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AppServiceTerms extends F9E {
    public final Date createdAt;
    public final String tag;
    public final Date updatedAt;

    public static /* synthetic */ AppServiceTerms copy$default(AppServiceTerms appServiceTerms, String str, Date date, Date date2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appServiceTerms.tag;
        }
        if ((i & 2) != 0) {
            date = appServiceTerms.createdAt;
        }
        if ((i & 4) != 0) {
            date2 = appServiceTerms.updatedAt;
        }
        return appServiceTerms.copy(str, date, date2);
    }

    public final AppServiceTerms copy(String tag, Date createdAt, Date updatedAt) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(createdAt, "createdAt");
        o.LJIIIZ(updatedAt, "updatedAt");
        return new AppServiceTerms(tag, createdAt, updatedAt);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.tag, this.createdAt, this.updatedAt};
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final String getTag() {
        return this.tag;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public AppServiceTerms(String tag, Date createdAt, Date updatedAt) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(createdAt, "createdAt");
        o.LJIIIZ(updatedAt, "updatedAt");
        this.tag = tag;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
