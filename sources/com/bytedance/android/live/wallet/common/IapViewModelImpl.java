package com.bytedance.android.live.wallet.common;

import X.A6G;
import X.A8I;
import X.ActivityC45651qj;
import X.C15380j0;
import X.C221108m2;
import X.C29306Beo;
import X.C29401Dk;
import X.C47261Igj;
import X.C62822Ol8;
import X.C77657Udp;
import X.C77766Ufa;
import X.C77769Ufd;
import X.CN1;
import X.InterfaceC31557Ca1;
import X.UI6;
import X.UI8;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.wallet.IWalletException;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.model.IapProductBuyParam;
import com.bytedance.android.live.wallet.model.IapProductBuyResult;
import com.bytedance.android.live.wallet.model.IapProductGetParam;
import com.bytedance.android.live.wallet.model.IapProductGetResult;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class IapViewModelImpl extends ViewModel implements A8I {
    public A6G LJLIL;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C77657Udp.LJLIL);
    public final C77766Ufa LJLJI = new C77766Ufa(this);
    public IapProductBuyParam LJLJJI;
    public Context LJLJJL;

    @Override // X.A8I
    public final void onDestroy() {
        this.LJLIL = null;
        this.LJLJJL = null;
    }

    public final InterfaceC31557Ca1 getPayManager() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-payManager>(...)");
        return (InterfaceC31557Ca1) value;
    }

    public IapViewModelImpl(A6G a6g) {
        this.LJLIL = a6g;
        getPayManager().init();
    }

    @Override // X.A8I
    public final void PD(Context context, IapProductGetParam params) {
        o.LJIIIZ(params, "params");
        this.LJLJJL = context;
        this.LJLJJI = null;
        A6G a6g = this.LJLIL;
        if (a6g != null) {
            a6g.LJII();
        }
        getPayManager().LJ(params.productIdList, this.LJLJI);
    }

    @Override // X.A8I
    public final void fW(Context context, IapProductBuyParam params) {
        o.LJIIIZ(params, "params");
        this.LJLJJL = context;
        this.LJLJJI = params;
        A6G a6g = this.LJLIL;
        if (a6g != null) {
            a6g.LLLLLJLJLL();
        }
        Diamond LIZ = C77769Ufd.LIZ(params.productId);
        if (LIZ != null) {
            LIZ.id = params.diamondId;
            getPayManager().LJII(params.way, params.source, params.tradeType, params.businessType, C29306Beo.LIZIZ(this.LJLJJL), this.LJLJI, LIZ, params.orderId);
            return;
        }
        getPayManager().LJ(C47261Igj.LJJIJ(params.productId), this.LJLJI);
    }

    public static IapProductGetResult gv0(int i, int i2, Exception exc) {
        String errorMsg;
        if (exc instanceof C29401Dk) {
            errorMsg = ((C29401Dk) exc).getPrompt();
            if (errorMsg == null) {
                errorMsg = C15380j0.LJIILJJIL(R.string.ot5);
            }
        } else {
            errorMsg = exc.getMessage();
            if (errorMsg == null) {
                errorMsg = C15380j0.LJIILJJIL(R.string.ot5);
            }
        }
        IapProductGetResult iapProductGetResult = new IapProductGetResult();
        iapProductGetResult.code = 0;
        iapProductGetResult.errorCode = i;
        iapProductGetResult.detailCode = i2;
        o.LJIIIIZZ(errorMsg, "errorMsg");
        iapProductGetResult.errorMsg = errorMsg;
        return iapProductGetResult;
    }

    public final void hv0(int i, int i2, int i3, Exception exc) {
        String errorMsg;
        int i4;
        String errorMsg2;
        A6G a6g = this.LJLIL;
        if (a6g != null) {
            C15380j0.LJIILJJIL(R.string.ot5);
            boolean z = exc instanceof C29401Dk;
            if (z) {
                errorMsg = ((C29401Dk) exc).getPrompt();
            } else {
                errorMsg = exc.getMessage();
            }
            o.LJIIIIZZ(errorMsg, "errorMsg");
            UI8 ui8 = new UI8(i, i2, i3, exc, false, errorMsg, 0, false);
            IapProductBuyParam iapProductBuyParam = this.LJLJJI;
            if (iapProductBuyParam != null) {
                i4 = iapProductBuyParam.tradeType;
            } else {
                i4 = 1;
            }
            ui8.LJIIIZ = i4;
            IWalletException walletException = ((IWalletService) CN1.LIZ(IWalletService.class)).walletException();
            ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(this.LJLJJL);
            walletException.getClass();
            UI6.LIZJ(LIZIZ, ui8);
            if (z) {
                errorMsg2 = ((C29401Dk) exc).getPrompt();
                if (errorMsg2 == null) {
                    errorMsg2 = C15380j0.LJIILJJIL(R.string.ot5);
                }
            } else {
                errorMsg2 = exc.getMessage();
                if (errorMsg2 == null) {
                    errorMsg2 = C15380j0.LJIILJJIL(R.string.ot5);
                }
            }
            IapProductBuyResult iapProductBuyResult = new IapProductBuyResult();
            iapProductBuyResult.code = 0;
            iapProductBuyResult.errorCode = i2;
            iapProductBuyResult.detailCode = i3;
            o.LJIIIIZZ(errorMsg2, "errorMsg");
            iapProductBuyResult.errorMsg = errorMsg2;
            a6g.LLLLLJIL(iapProductBuyResult);
        }
    }
}
