package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import kotlin.jvm.internal.o;

/* renamed from: X.CmF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32315CmF<T> implements InterfaceC64592gB {
    public static final C32315CmF<T> LJLIL = new C32315CmF<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        BaseResponse response = (BaseResponse) obj;
        o.LJIIIZ(response, "response");
        C32355Cmt.LIZ.LJLJJL.setExchangeInfo((BalanceStructExtra) response.data);
    }
}
