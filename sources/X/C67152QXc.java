package X;

import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.account.idv.model.IDVDecisionConf;
import com.google.android.play.core.appupdate.u;
import kotlin.jvm.internal.o;

/* renamed from: X.QXc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67152QXc implements InterfaceC72822Si2 {
    public SparkContext LJLIL;
    public final Context LJLILLLLZI;
    public final InterfaceC67153QXd LJLJI;
    public final IDVDecisionConf LJLJJI;

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        String str;
        InterfaceC40159FpT LJIILL;
        if (o.LJ(c199097rd.LJLIL, "idv_result_event")) {
            InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns != null) {
                str = u.LJJIJIL(interfaceC78280Uns, "result", "");
            } else {
                str = null;
            }
            EnumC58915NAh enumC58915NAh = EnumC58915NAh.SUCCESS;
            if (!o.LJ(str, enumC58915NAh.getStatus())) {
                enumC58915NAh = EnumC58915NAh.FAIL;
            }
            this.LJLJI.LIZIZ(enumC58915NAh);
            SparkContext sparkContext = this.LJLIL;
            if (sparkContext != null && (LJIILL = sparkContext.LJIILL()) != null) {
                LJIILL.close();
            }
        }
    }

    public C67152QXc(Context applicationContext, C67150QXa c67150QXa, IDVDecisionConf iDVDecisionConf) {
        o.LJIIJ(applicationContext, "applicationContext");
        this.LJLILLLLZI = applicationContext;
        this.LJLJI = c67150QXa;
        this.LJLJJI = iDVDecisionConf;
    }
}
