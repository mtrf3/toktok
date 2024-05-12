package X;

import android.content.Context;
import com.bytedance.android.live.wallet.model.ExchangeParams;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.Ub2, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC77484Ub2 implements Runnable {
    public final /* synthetic */ ExchangeParams LJLIL;
    public final /* synthetic */ Throwable LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ DataChannel LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ InterfaceC77468Uam LJLJL;

    public RunnableC77484Ub2(ExchangeParams exchangeParams, Throwable th, Context context, DataChannel dataChannel, long j, String str, InterfaceC77468Uam interfaceC77468Uam) {
        this.LJLIL = exchangeParams;
        this.LJLILLLLZI = th;
        this.LJLJI = context;
        this.LJLJJI = dataChannel;
        this.LJLJJL = j;
        this.LJLJJLL = str;
        this.LJLJL = interfaceC77468Uam;
    }

    public final void LIZ() {
        Exception exc;
        String penaltyWarningSkip;
        this.LJLIL.skipKycReminder = true;
        Throwable th = this.LJLILLLLZI;
        if (th instanceof C29401Dk) {
            exc = (Exception) th;
        } else {
            exc = null;
        }
        CustomErrorExtra customErrorExtra = CustomErrorExtra.getCustomErrorExtra(exc);
        ExchangeParams exchangeParams = this.LJLIL;
        if (customErrorExtra == null) {
            penaltyWarningSkip = "";
        } else {
            penaltyWarningSkip = customErrorExtra.getPenaltyWarningSkip();
        }
        exchangeParams.penaltyWarningSkip = penaltyWarningSkip;
        Context context = this.LJLJI;
        DataChannel dataChannel = this.LJLJJI;
        ExchangeParams exchangeParams2 = this.LJLIL;
        C77481Uaz.LIZIZ(this.LJLJJL, context, this.LJLJL, exchangeParams2, dataChannel, this.LJLJJLL, C77502UbK.LJLIL, C77499UbH.LJLIL);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
