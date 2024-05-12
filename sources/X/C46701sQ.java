package X;

import X.C29921Fk;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.InterfaceC88473Ynt;
import com.bytedance.pitaya.api.PTYPackageCallback;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.api.bean.PTYRequestConfig;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.IDqS425S0100000;
import kotlin.jvm.internal.IDqS443S0100000;

/* renamed from: X.1sQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46701sQ extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C29921Fk LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C22820v0 LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<C22830v1, C76800UCe> LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns<C22830v1, C76800UCe> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46701sQ(C29921Fk c29921Fk, String str, C22820v0 c22820v0, IDqS172S0200000 iDqS172S0200000, IDqS172S0200000 iDqS172S02000002) {
        super(0);
        this.LJLIL = c29921Fk;
        this.LJLILLLLZI = str;
        this.LJLJI = c22820v0;
        this.LJLJJI = iDqS172S0200000;
        this.LJLJJL = iDqS172S02000002;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        final C29921Fk c29921Fk = this.LJLIL;
        final String str = this.LJLILLLLZI;
        final C22820v0 c22820v0 = this.LJLJI;
        final C46691sP c46691sP = new C46691sP(c29921Fk, str, c22820v0, this.LJLJJI, this.LJLJJL);
        final IDqS425S0100000 iDqS425S0100000 = new IDqS425S0100000(this.LJLJJL, (InterfaceC88472Yns<? super C22830v1, C76800UCe>) 0);
        c29921Fk.LJI().queryPackage(str, new PTYPackageCallback() { // from class: com.bytedance.android.live.ai.impl.pitaya.LivePitayaTaskManager$checkPackageStatus$1
            @Override // com.bytedance.pitaya.api.PTYPackageCallback
            public void onResult(boolean z, PTYError pTYError, PTYPackageInfo pTYPackageInfo) {
                if (z) {
                    c46691sP.invoke();
                    return;
                }
                if (!c22820v0.LIZ) {
                    iDqS425S0100000.invoke(-3, pTYError, pTYPackageInfo);
                    return;
                }
                C29921Fk c29921Fk2 = c29921Fk;
                String str2 = str;
                final InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = c46691sP;
                final IDqS443S0100000 iDqS443S0100000 = new IDqS443S0100000(iDqS425S0100000, (InterfaceC88473Ynt<? super Integer, ? super PTYError, ? super PTYPackageInfo, C76800UCe>) 3);
                c29921Fk2.LJI().requestUpdate(str2, new PTYRequestConfig(true, null, 2, null), new PTYPackageCallback() { // from class: com.bytedance.android.live.ai.impl.pitaya.LivePitayaTaskManager$requestUpdateImmediately$1
                    @Override // com.bytedance.pitaya.api.PTYPackageCallback
                    public void onResult(boolean z2, PTYError pTYError2, PTYPackageInfo pTYPackageInfo2) {
                        if (z2) {
                            interfaceC65784Pro.invoke();
                        } else {
                            iDqS443S0100000.invoke(pTYError2, pTYPackageInfo2);
                        }
                    }
                });
            }
        });
        return C76800UCe.LIZ;
    }
}
