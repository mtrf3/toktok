package com.ss.android.ugc.aweme.paidcontent.preload;

import X.AbstractC73672Svk;
import X.C16880lQ;
import X.C38827FLr;
import X.C74812wf;
import X.EFJ;
import X.InterfaceC88472Yns;
import X.X8M;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.model.PaidCollectionListResponse;
import com.ss.android.ugc.aweme.paidcontent.api.PaidCollectionApi;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PaidContentCollectionPreload implements X8M<PaidCollectionApi.GetPaidCollectionListApi, AbstractC73672Svk<PaidCollectionListResponse>> {
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
    public AbstractC73672Svk<PaidCollectionListResponse> preload(Bundle bundle, InterfaceC88472Yns<? super Class<PaidCollectionApi.GetPaidCollectionListApi>, ? extends PaidCollectionApi.GetPaidCollectionListApi> create) {
        long j;
        int i;
        String string;
        String string2;
        o.LJIIIZ(create, "create");
        if (bundle != null && (string2 = bundle.getString("creator_uid")) != null) {
            j = CastLongProtector.parseLong(string2);
        } else {
            j = 0;
        }
        if (bundle != null && (string = bundle.getString("list_source")) != null) {
            i = CastIntegerProtector.parseInt(string);
        } else {
            i = 1;
        }
        return C74812wf.LIZ(create.invoke(PaidCollectionApi.GetPaidCollectionListApi.class), j, i, null, 28);
    }
}
