package X;

import com.bytedance.pitaya.api.IPitayaCore;
import com.bytedance.pitaya.api.PTYPackageCallback;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.api.bean.PTYRequestConfig;
import kotlin.jvm.internal.AqS155S0100000_5;

/* renamed from: X.1sR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46711sR extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C29921Fk LJLIL;
    public final /* synthetic */ String LJLILLLLZI = "live_cohost_friend_notice_optimize_strategy";
    public final /* synthetic */ boolean LJLJI = true;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46711sR(C29921Fk c29921Fk, AqS155S0100000_5 aqS155S0100000_5, AqS155S0100000_5 aqS155S0100000_52) {
        super(0);
        this.LJLIL = c29921Fk;
        this.LJLJJI = aqS155S0100000_5;
        this.LJLJJL = aqS155S0100000_52;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        IPitayaCore LJI = this.LJLIL.LJI();
        String str = this.LJLILLLLZI;
        PTYRequestConfig pTYRequestConfig = new PTYRequestConfig(this.LJLJI, null, 2, null);
        final InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJJI;
        final InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = this.LJLJJL;
        LJI.requestUpdate(str, pTYRequestConfig, new PTYPackageCallback() { // from class: com.bytedance.android.live.ai.impl.pitaya.LivePitayaTaskManager$requestPkgByBusinessName$1$1
            @Override // com.bytedance.pitaya.api.PTYPackageCallback
            public void onResult(boolean z, PTYError pTYError, PTYPackageInfo pTYPackageInfo) {
                if (z) {
                    interfaceC65784Pro.invoke();
                } else {
                    interfaceC65784Pro2.invoke();
                }
            }
        });
        return C76800UCe.LIZ;
    }
}
