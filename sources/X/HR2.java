package X;

import Y.AObjectS24S0000000_7;
import Y.AObjectS52S0101000_7;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HR2 extends AbstractC65781Prl implements InterfaceC88471Ynr<String[], int[], C76800UCe> {
    public final /* synthetic */ ActivityC45651qj LJLIL;
    public final /* synthetic */ String[] LJLILLLLZI;
    public final /* synthetic */ java.util.Map<String, String> LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HR2(ActivityC45651qj activityC45651qj, String[] strArr, java.util.Map map, AObjectS24S0000000_7 aObjectS24S0000000_7, AObjectS52S0101000_7 aObjectS52S0101000_7, AObjectS52S0101000_7 aObjectS52S0101000_72) {
        super(2);
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = strArr;
        this.LJLJI = map;
        this.LJLJJI = aObjectS24S0000000_7;
        this.LJLJJL = aObjectS52S0101000_7;
        this.LJLJJLL = aObjectS52S0101000_72;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(String[] strArr, int[] iArr) {
        String[] LJIIJJI = C78605Ut7.LJIIJJI(iArr, strArr);
        HVR hvr = HVR.LIZ;
        ActivityC45651qj activityC45651qj = this.LJLIL;
        String[] strArr2 = this.LJLILLLLZI;
        String string = activityC45651qj.getString(R.string.rtq);
        o.LJIIIIZZ(string, "activity.getString(R.str…zation_permissions_title)");
        HVR.LJIIL(hvr, activityC45651qj, strArr2, string, HVR.LIZ(this.LJLIL, this.LJLJI, LJIIJJI), this.LJLJJI, this.LJLJJL, this.LJLJJLL, 128);
        return C76800UCe.LIZ;
    }
}
