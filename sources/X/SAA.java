package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentResultProcess;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SAA extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ SA3 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SAA(SA3 sa3, String str, long j) {
        super(1);
        this.LJLIL = sa3;
        this.LJLILLLLZI = str;
        this.LJLJI = j;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        C27943Axv.LIZ(sendLog, this.LJLIL.LJII);
        sendLog.LIZJ("page_name", PaymentResultProcess.INSTANCE.sourceToPageName(this.LJLILLLLZI));
        sendLog.LIZJ("duration", Long.valueOf(SystemClock.elapsedRealtime() - this.LJLJI));
        return C76800UCe.LIZ;
    }
}
