package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.model.AutoExchangeData;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Ub1, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77483Ub1<T> implements InterfaceC64592gB {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    public C77483Ub1(String str, String str2, boolean z) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = z;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        BaseResponse response = (BaseResponse) obj;
        o.LJIIIZ(response, "response");
        WalletExchange walletExchange = WalletExchange.LJLIL;
        boolean after = ((AutoExchangeData) response.data).getAfter();
        walletExchange.getClass();
        WalletExchange.LJJIII(after);
        C77448UaS.LJI(this.LJLIL, "anchor_income", this.LJLILLLLZI, ((AutoExchangeData) response.data).getAfter());
        if (walletExchange.LJIILIIL() && this.LJLJI) {
            C30868C9o.LIZJ(R.string.kca);
        }
    }
}
