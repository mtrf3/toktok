package com.ss.android.ugc.aweme.ecommerce.ug.newinstall.bean;

import X.C47261Igj;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class EcUgApiAllowlistModel extends F9E {

    @InterfaceC65349Pkn("api")
    public final List<String> api;

    /* JADX WARN: Multi-variable type inference failed */
    public EcUgApiAllowlistModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EcUgApiAllowlistModel copy$default(EcUgApiAllowlistModel ecUgApiAllowlistModel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = ecUgApiAllowlistModel.api;
        }
        return ecUgApiAllowlistModel.copy(list);
    }

    public final EcUgApiAllowlistModel copy(List<String> api) {
        o.LJIIIZ(api, "api");
        return new EcUgApiAllowlistModel(api);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.api};
    }

    public final List<String> getApi() {
        return this.api;
    }

    public EcUgApiAllowlistModel(List<String> api) {
        o.LJIIIZ(api, "api");
        this.api = api;
    }

    public /* synthetic */ EcUgApiAllowlistModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C47261Igj.LJJIJIIJI("/api/v1/mall/", "/api/v1/shop/recommend/feed/") : list);
    }
}
