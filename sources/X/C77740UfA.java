package X;

import tikcast.api.wallet.tiktok.QueryOrderResult;

/* renamed from: X.UfA, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77740UfA<T> implements InterfaceC64592gB {
    public static final C77740UfA<T> LJLIL = new C77740UfA<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        QueryOrderResult.ChargeOrderData chargeOrderData = ((QueryOrderResult) obj).data;
        if (chargeOrderData != null && chargeOrderData.status == 1) {
        } else {
            throw new Exception("server status is not 1");
        }
    }
}
