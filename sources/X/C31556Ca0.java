package X;

import com.bytedance.android.live.wallet.model.CheckSubOrderResultStruct;
import com.bytedance.android.live.wallet.model.CreateSubOrderResult;
import com.bytedance.android.livesdk.wallet.Diamond;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ca0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31556Ca0 extends F9E {
    public final int LJLIL;
    public final List<? extends Diamond> LJLILLLLZI;
    public final C77612Ud6 LJLJI;
    public final C77613Ud7 LJLJJI;
    public final C68395Qsp LJLJJL;
    public final C77612Ud6 LJLJJLL;
    public final CheckSubOrderResultStruct LJLJL;
    public final CreateSubOrderResult LJLJLJ;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ};
    }

    public C31556Ca0(int i, List chargeQueryResult, C77612Ud6 chargePayResult, C77613Ud7 chargeCheckOrderResult, C68395Qsp subscribeQueryResult, C77612Ud6 subscribePayResult, CheckSubOrderResultStruct subscribeCheckOrderResult, CreateSubOrderResult subscribeCreateOrderResult, int i2) {
        chargeQueryResult = (i2 & 2) != 0 ? C61878OQg.INSTANCE : chargeQueryResult;
        int i3 = 15;
        int i4 = 0;
        String str = null;
        chargePayResult = (i2 & 4) != 0 ? new C77612Ud6(str, str, i4, i3) : chargePayResult;
        chargeCheckOrderResult = (i2 & 8) != 0 ? new C77613Ud7(0, null, null, 15) : chargeCheckOrderResult;
        subscribeQueryResult = (i2 & 16) != 0 ? new C68395Qsp(str, str) : subscribeQueryResult;
        subscribePayResult = (i2 & 32) != 0 ? new C77612Ud6(str, str, i4, i3) : subscribePayResult;
        subscribeCheckOrderResult = (i2 & 64) != 0 ? new CheckSubOrderResultStruct() : subscribeCheckOrderResult;
        subscribeCreateOrderResult = (i2 & 128) != 0 ? new CreateSubOrderResult() : subscribeCreateOrderResult;
        o.LJIIIZ(chargeQueryResult, "chargeQueryResult");
        o.LJIIIZ(chargePayResult, "chargePayResult");
        o.LJIIIZ(chargeCheckOrderResult, "chargeCheckOrderResult");
        o.LJIIIZ(subscribeQueryResult, "subscribeQueryResult");
        o.LJIIIZ(subscribePayResult, "subscribePayResult");
        o.LJIIIZ(subscribeCheckOrderResult, "subscribeCheckOrderResult");
        o.LJIIIZ(subscribeCreateOrderResult, "subscribeCreateOrderResult");
        this.LJLIL = i;
        this.LJLILLLLZI = chargeQueryResult;
        this.LJLJI = chargePayResult;
        this.LJLJJI = chargeCheckOrderResult;
        this.LJLJJL = subscribeQueryResult;
        this.LJLJJLL = subscribePayResult;
        this.LJLJL = subscribeCheckOrderResult;
        this.LJLJLJ = subscribeCreateOrderResult;
    }
}
