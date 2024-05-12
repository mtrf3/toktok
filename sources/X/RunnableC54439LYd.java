package X;

import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.recoverpanel.PublishFailureReason;
import java.util.List;

/* renamed from: X.LYd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class RunnableC54439LYd implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;
    public final /* synthetic */ Object LJLJJI;
    public final /* synthetic */ Object LJLJJL;
    public final /* synthetic */ Object LJLJJLL;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.LJLIL) {
            case 0:
                Object obj = this.LJLILLLLZI;
                IapPaymentMethod iapPaymentMethod = (IapPaymentMethod) this.LJLJI;
                C78368UpI c78368UpI = (C78368UpI) this.LJLJJI;
                List list = (List) this.LJLJJL;
                InterfaceC78395Upj interfaceC78395Upj = (InterfaceC78395Upj) this.LJLJJLL;
                obj.getClass();
                C78392Upg.LIZIZ(c78368UpI, interfaceC78395Upj, iapPaymentMethod, list);
                return;
            default:
                C54437LYb c54437LYb = (C54437LYb) this.LJLILLLLZI;
                c54437LYb.LIZIZ.showUploadRecoverIfNeed((PublishFailureReason) this.LJLJI, (ActivityC45651qj) this.LJLJJI, (PublishModel) this.LJLJJL, (String) this.LJLJJLL);
                return;
        }
    }

    public /* synthetic */ RunnableC54439LYd(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
        this.LJLJI = obj2;
        this.LJLJJI = obj3;
        this.LJLJJL = obj4;
        this.LJLJJLL = obj5;
    }
}
