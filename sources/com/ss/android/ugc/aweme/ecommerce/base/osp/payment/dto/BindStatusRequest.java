package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class BindStatusRequest extends F9E {

    @InterfaceC65349Pkn("idempotency_keys")
    public final List<String> idempotencyKeys;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BindStatusRequest copy$default(BindStatusRequest bindStatusRequest, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bindStatusRequest.idempotencyKeys;
        }
        return bindStatusRequest.copy(list);
    }

    public final BindStatusRequest copy(List<String> idempotencyKeys) {
        o.LJIIIZ(idempotencyKeys, "idempotencyKeys");
        return new BindStatusRequest(idempotencyKeys);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.idempotencyKeys};
    }

    public final List<String> getIdempotencyKeys() {
        return this.idempotencyKeys;
    }

    public BindStatusRequest(List<String> idempotencyKeys) {
        o.LJIIIZ(idempotencyKeys, "idempotencyKeys");
        this.idempotencyKeys = idempotencyKeys;
    }
}
