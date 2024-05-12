package com.ss.android.ugc.aweme.account.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class CachedUserAgeInfo implements Serializable {
    public String birthday;

    public final String getBirthday() {
        return this.birthday;
    }

    public CachedUserAgeInfo(String str) {
        this.birthday = str;
    }

    public final void setBirthday(String str) {
        this.birthday = str;
    }
}
