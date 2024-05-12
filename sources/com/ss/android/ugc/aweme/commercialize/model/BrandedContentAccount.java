package com.ss.android.ugc.aweme.commercialize.model;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class BrandedContentAccount {

    @InterfaceC65349Pkn("nickname")
    public String nickname;

    @InterfaceC65349Pkn("uid")
    public String userId;

    /* JADX WARN: Multi-variable type inference failed */
    public BrandedContentAccount() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public BrandedContentAccount(String str, String str2) {
        this.userId = str;
        this.nickname = str2;
    }

    public /* synthetic */ BrandedContentAccount(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
