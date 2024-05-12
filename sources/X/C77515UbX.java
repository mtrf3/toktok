package X;

import Y.ARunnableS13S0301000_13;
import android.app.Activity;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletException;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import com.bytedance.android.livesdk.wallet.Diamond;
import kotlin.jvm.internal.o;

/* renamed from: X.UbX, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77515UbX extends AbstractC65781Prl implements InterfaceC88472Yns<Throwable, Boolean> {
    public final /* synthetic */ Activity LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ Diamond LJLJI;
    public final /* synthetic */ InterfaceC77737Uf7 LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ int LJLJL;
    public final /* synthetic */ int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77515UbX(int i, int i2, int i3, int i4, ActivityC45651qj activityC45651qj, C77766Ufa c77766Ufa, Diamond diamond, String str) {
        super(1);
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = i;
        this.LJLJI = diamond;
        this.LJLJJI = c77766Ufa;
        this.LJLJJL = str;
        this.LJLJJLL = i2;
        this.LJLJL = i3;
        this.LJLJLJ = i4;
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(Throwable th) {
        int i;
        Exception exc;
        Throwable throwable = th;
        o.LJIIIZ(throwable, "throwable");
        boolean z = throwable instanceof C29401Dk;
        if (z) {
            i = ((C276516r) throwable).getErrorCode();
        } else {
            i = -1;
        }
        InterfaceC06390Mx LIZ = CN1.LIZ(IWalletService.class);
        o.LJIIIIZZ(LIZ, "getService(IWalletService::class.java)");
        IWalletService iWalletService = (IWalletService) LIZ;
        if (z) {
            exc = (Exception) throwable;
        } else {
            exc = null;
        }
        CustomErrorExtra customErrorExtra = CustomErrorExtra.getCustomErrorExtra(exc);
        Boolean LIZLLL = ((WalletException) iWalletService.walletException()).LIZLLL(customErrorExtra, i);
        o.LJIIIIZZ(LIZLLL, "walletService.walletExce…e(customError, errorCode)");
        boolean booleanValue = LIZLLL.booleanValue();
        if (booleanValue) {
            Activity activity = this.LJLIL;
            Diamond diamond = this.LJLJI;
            InterfaceC77737Uf7 interfaceC77737Uf7 = this.LJLJJI;
            String str = this.LJLJJL;
            int i2 = this.LJLJJLL;
            int i3 = this.LJLILLLLZI;
            C76950UHy.LJFF(activity, throwable, new RunnableC77517UbZ(activity, diamond, interfaceC77737Uf7, str, i2, i3, this.LJLJL, this.LJLJLJ, customErrorExtra), new ARunnableS13S0301000_13(interfaceC77737Uf7, throwable, diamond, i, 1), i3, 1001, true);
        } else {
            booleanValue = false;
        }
        return Boolean.valueOf(booleanValue);
    }
}
