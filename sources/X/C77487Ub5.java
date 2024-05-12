package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import kotlin.jvm.internal.o;

/* renamed from: X.Ub5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77487Ub5<T> implements InterfaceC64592gB {
    public static final C77487Ub5<T> LJLIL = new C77487Ub5<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        BaseResponse response = (BaseResponse) obj;
        o.LJIIIZ(response, "response");
        C32355Cmt.LIZ.LJLIL.LIZ = (BalanceStructExtra) response.data;
    }
}
