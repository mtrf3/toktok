package com.ss.android.ugc.aweme.pns.agegate.network;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public final class DoBResponse extends BaseResponse {

    @InterfaceC65349Pkn("age")
    public final Integer age;

    /* JADX WARN: Multi-variable type inference failed */
    public DoBResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Integer getAge() {
        return this.age;
    }

    public DoBResponse(Integer num) {
        super(0, null, null, 7, null);
        this.age = num;
    }

    public /* synthetic */ DoBResponse(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num);
    }
}
