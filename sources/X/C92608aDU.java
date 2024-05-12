package X;

import android.content.Context;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.change.PinChangeViewAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS16S1100000_31;
import kotlin.jvm.internal.o;

/* renamed from: X.aDU, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92608aDU extends AbstractC65781Prl implements InterfaceC88472Yns<ARH, C76800UCe> {
    public final /* synthetic */ PinChangeViewAssem LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92608aDU(PinChangeViewAssem pinChangeViewAssem, String str, Context context) {
        super(1);
        this.LJLIL = pinChangeViewAssem;
        this.LJLILLLLZI = str;
        this.LJLJI = context;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARH arh) {
        ARH buttonGroup = arh;
        o.LJIIIZ(buttonGroup, "$this$buttonGroup");
        String LJFF = C86V.LJFF(R.string.jro);
        o.LJIIIIZZ(LJFF, "getString(R.string.pipo_…nge_pin_expired_upbutton)");
        buttonGroup.LJFF(LJFF, new C92612aDY(this.LJLIL, this.LJLILLLLZI, this.LJLJI));
        String LJFF2 = C86V.LJFF(R.string.jrm);
        o.LJIIIIZZ(LJFF2, "getString(R.string.pipo_…e_pin_expired_downbutton)");
        buttonGroup.LJII(LJFF2, new IDqS16S1100000_31(this.LJLIL, this.LJLILLLLZI, 1));
        return C76800UCe.LIZ;
    }
}
