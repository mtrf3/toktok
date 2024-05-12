package X;

import com.bytedance.pipo.kyc.singpass.network.model.PersonInfo;
import com.ss.android.ugc.aweme.ecommerce.singpass.Error;
import com.ss.android.ugc.aweme.ecommerce.singpass.SingPassResponse;
import com.ss.android.ugc.aweme.ecommerce.singpass.TransparentSingPassHandleActivity;

/* loaded from: classes12.dex */
public final class QAF implements QAR {
    public final /* synthetic */ TransparentSingPassHandleActivity LIZ;

    public QAF(TransparentSingPassHandleActivity transparentSingPassHandleActivity) {
        this.LIZ = transparentSingPassHandleActivity;
    }

    @Override // X.QAR
    public final void LIZ(PersonInfo personInfo, QAE qae) {
        Integer num;
        InterfaceC88472Yns<? super SingPassResponse, C76800UCe> interfaceC88472Yns = SJ0.LIZ;
        String str = null;
        if (qae != null) {
            num = Integer.valueOf(qae.LJLIL);
            str = qae.LJLILLLLZI;
        } else {
            num = null;
        }
        interfaceC88472Yns.invoke(new SingPassResponse(personInfo, new Error(num, str)));
        this.LIZ.finish();
    }
}
