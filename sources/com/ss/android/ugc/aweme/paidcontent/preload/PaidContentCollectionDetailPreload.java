package com.ss.android.ugc.aweme.paidcontent.preload;

import X.AbstractC73672Svk;
import X.C16880lQ;
import X.C38827FLr;
import X.EFJ;
import X.InterfaceC88472Yns;
import X.X8M;
import android.os.Bundle;
import com.ss.android.ugc.aweme.model.PaidCollectionDetailResponse;
import com.ss.android.ugc.aweme.paidcontent.api.PaidCollectionApi;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PaidContentCollectionDetailPreload implements X8M<PaidCollectionApi.GetPaidCollectionDetailApi, AbstractC73672Svk<PaidCollectionDetailResponse>> {
    public static final int $stable = 0;

    @Override // X.X8D
    public boolean enable(Bundle bundle) {
        return true;
    }

    @Override // X.X8M
    public C38827FLr getPreloadStrategy(Bundle bundle) {
        return new C38827FLr(0, EFJ.LIZJ, false, 5);
    }

    @Override // X.X8M
    public boolean handleException(Exception exception) {
        o.LJIIIZ(exception, "exception");
        C16880lQ.LLLLIIL(exception);
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.X8M
    public AbstractC73672Svk<PaidCollectionDetailResponse> preload(Bundle bundle, InterfaceC88472Yns<? super Class<PaidCollectionApi.GetPaidCollectionDetailApi>, ? extends PaidCollectionApi.GetPaidCollectionDetailApi> create) {
        o.LJIIIZ(create, "create");
        long j = 0;
        if (bundle != null) {
            j = bundle.getLong("collection_id", 0L);
        }
        return create.invoke(PaidCollectionApi.GetPaidCollectionDetailApi.class).getPaidCollectionDetail(j, 1);
    }
}
