package X;

import Y.IDuS81S0200000_12;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TJY extends R30<C76800UCe, PanelInfoModel, TPM, PanelInfoModel> {
    public final String LIZJ;
    public final InterfaceC84497XEf LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final int LJI;

    @Override // X.InterfaceC68907R2p
    public final Object LJFF(Object req) {
        o.LJIIIZ(req, "req");
        return C76800UCe.LIZ;
    }

    @Override // X.R30
    public final AbstractC73672Svk<PanelInfoModel> LJII(TPM tpm) {
        TPM req = tpm;
        o.LJIIIZ(req, "req");
        return AbstractC73672Svk.LJIIJ(new IDuS81S0200000_12(this, req, 4));
    }

    @Override // X.InterfaceC68907R2p
    public final Object LJI(Object req, Object resp) {
        o.LJIIIZ(req, "req");
        o.LJIIIZ(resp, "resp");
        return resp;
    }

    public TJY(String str, InterfaceC84497XEf interfaceC84497XEf, boolean z, boolean z2, int i) {
        this.LIZJ = str;
        this.LIZLLL = interfaceC84497XEf;
        this.LJ = z;
        this.LJFF = z2;
        this.LJI = i;
    }
}
