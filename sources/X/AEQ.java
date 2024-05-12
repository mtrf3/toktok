package X;

import com.ss.android.ugc.aweme.cell.ExposeCell;
import kotlin.jvm.internal.AqS154S0100000_4;

/* loaded from: classes5.dex */
public final class AEQ extends AbstractC13940gg {
    public final AqS154S0100000_4 LJ;
    public InterfaceC65784Pro<String> LJFF;
    public final boolean LJI = true;
    public final /* synthetic */ ExposeCell LJII;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC13940gg
    public final java.util.Map<String, String> LJFF() {
        java.util.Map<String, String> map;
        String str;
        AEP aep = (AEP) this.LJII.getItem();
        String str2 = null;
        if (aep != null) {
            str2 = aep.LLII;
        }
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        OSZ osz = new OSZ("enter_from", str2);
        AEP aep2 = (AEP) this.LJII.getItem();
        if (aep2 != null && (str = aep2.LLIIII) != null) {
            str3 = str;
        }
        OSZ osz2 = new OSZ("action_type", str3);
        AEP aep3 = (AEP) this.LJII.getItem();
        if (aep3 == null || (map = aep3.LLIFFJFJJ) == null) {
            return C113554cx.LJJJLZIJ(osz, osz2);
        }
        return map;
    }

    @Override // X.AbstractC13940gg
    public final InterfaceC65784Pro<String> LIZ() {
        return this.LJ;
    }

    @Override // X.AbstractC13940gg
    public final InterfaceC65784Pro<String> LIZJ() {
        return this.LJFF;
    }

    @Override // X.AbstractC13940gg
    public final boolean LJII() {
        return this.LJI;
    }

    public AEQ(ExposeCell exposeCell) {
        this.LJII = exposeCell;
        this.LJ = new AqS154S0100000_4(exposeCell, 63);
        this.LJFF = new AqS154S0100000_4(exposeCell, 64);
    }

    @Override // X.AbstractC13940gg
    public final void LJIIJJI(InterfaceC65784Pro<String> interfaceC65784Pro) {
        this.LJFF = interfaceC65784Pro;
    }
}
