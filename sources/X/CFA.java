package X;

import Y.ARunnableS24S0200000_5;
import com.bytedance.android.livesdk.model.message.BarrageMessage;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.geckox.model.UpdatePackage;

/* loaded from: classes6.dex */
public final class CFA extends AbstractC61537ODd {
    public final /* synthetic */ CF9 LIZ;
    public final /* synthetic */ IHostResource LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ BarrageMessage LIZLLL;

    @Override // X.AbstractC61537ODd
    public final void LJIIJ(UpdatePackage updatePackage, Throwable th) {
        String str;
        Integer num;
        String str2;
        String str3;
        IHostResource iHostResource = this.LIZIZ;
        String str4 = null;
        if (iHostResource != null) {
            str = iHostResource.getAccessKey();
        } else {
            str = null;
        }
        String str5 = this.LIZJ;
        Integer valueOf = Integer.valueOf(CF1.LIZLLL(this.LIZLLL));
        BarrageMessage barrageMessage = this.LIZLLL;
        if (barrageMessage != null) {
            num = Integer.valueOf(barrageMessage.msgType);
        } else {
            num = null;
        }
        Boolean bool = Boolean.FALSE;
        Boolean valueOf2 = Boolean.valueOf(this.LIZ.LIZLLL);
        if (th != null) {
            str2 = th.getMessage();
        } else {
            str2 = null;
        }
        CF4.LIZLLL(str, str5, valueOf, num, bool, valueOf2, str2);
        CF9 cf9 = this.LIZ;
        if (cf9.LJ != null) {
            BarrageMessage barrageMessage2 = this.LIZLLL;
            String str6 = this.LIZJ;
            boolean z = cf9.LIZLLL;
            if (th != null) {
                str3 = th.getMessage();
            } else {
                str3 = null;
            }
            CF5.LIZIZ(barrageMessage2, false, str6, z, str3);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUpdateFailed channel: ");
        LIZ.append(this.LIZJ);
        LIZ.append(", msg:");
        if (th != null) {
            str4 = th.getMessage();
        }
        LIZ.append(str4);
        LIZ.append(' ');
        C0NB.LJIIIZ("BarrageQueueController", X1D.LIZIZ(LIZ));
    }

    @Override // X.AbstractC61537ODd
    public final void LJIILL(UpdatePackage updatePackage, long j) {
        String str;
        CF9 cf9 = this.LIZ;
        cf9.LJFF.post(new ARunnableS24S0200000_5(cf9, this.LIZLLL, 84));
        IHostResource iHostResource = this.LIZIZ;
        Integer num = null;
        if (iHostResource != null) {
            str = iHostResource.getAccessKey();
        } else {
            str = null;
        }
        String str2 = this.LIZJ;
        Integer valueOf = Integer.valueOf(CF1.LIZLLL(this.LIZLLL));
        BarrageMessage barrageMessage = this.LIZLLL;
        if (barrageMessage != null) {
            num = Integer.valueOf(barrageMessage.msgType);
        }
        CF4.LIZLLL(str, str2, valueOf, num, Boolean.TRUE, Boolean.valueOf(this.LIZ.LIZLLL), "");
        CF9 cf92 = this.LIZ;
        if (cf92.LJ != null) {
            CF5.LIZIZ(this.LIZLLL, true, this.LIZJ, cf92.LIZLLL, "");
        }
    }

    public CFA(CF9 cf9, IHostResource iHostResource, String str, BarrageMessage barrageMessage) {
        this.LIZ = cf9;
        this.LIZIZ = iHostResource;
        this.LIZJ = str;
        this.LIZLLL = barrageMessage;
    }
}
