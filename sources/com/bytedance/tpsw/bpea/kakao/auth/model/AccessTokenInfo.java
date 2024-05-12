package com.bytedance.tpsw.bpea.kakao.auth.model;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class AccessTokenInfo {
    public final Long LIZ;

    @InterfaceC65349Pkn("expiresInMillis")
    public final Long expiresInMillis;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccessTokenInfo(com.kakao.sdk.user.model.AccessTokenInfo delegate) {
        this(delegate.getId(), delegate.getExpiresIn(), delegate.getAppId(), delegate.getExpiresInMillis());
        o.LJIIIZ(delegate, "delegate");
    }

    public AccessTokenInfo(Long l, long j, int i, Long l2) {
        this.LIZ = l;
        this.expiresInMillis = l2;
    }
}
