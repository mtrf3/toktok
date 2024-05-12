package com.ss.android.ugc.aweme.commercialize.feed.assem.midad;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class MidAdResponse extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("aweme_v1")
    public final Aweme aweme;

    /* JADX WARN: Multi-variable type inference failed */
    public MidAdResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public MidAdResponse(Aweme aweme) {
        this.aweme = aweme;
    }

    public /* synthetic */ MidAdResponse(Aweme aweme, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : aweme);
    }
}
