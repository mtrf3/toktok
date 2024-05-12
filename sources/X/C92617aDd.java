package X;

import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.set.PinConfirmFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS16S1100000_31;
import kotlin.jvm.internal.o;

/* renamed from: X.aDd, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92617aDd extends AbstractC65781Prl implements InterfaceC88472Yns<ARH, C76800UCe> {
    public final /* synthetic */ PinConfirmFragment LJLIL;
    public final /* synthetic */ EnumC92072a4q LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92617aDd(PinConfirmFragment pinConfirmFragment, EnumC92072a4q enumC92072a4q, String str) {
        super(1);
        this.LJLIL = pinConfirmFragment;
        this.LJLILLLLZI = enumC92072a4q;
        this.LJLJI = str;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARH arh) {
        int i;
        int i2;
        ARH buttonGroup = arh;
        o.LJIIIZ(buttonGroup, "$this$buttonGroup");
        PinConfirmFragment pinConfirmFragment = this.LJLIL;
        EnumC92072a4q enumC92072a4q = this.LJLILLLLZI;
        EnumC92072a4q enumC92072a4q2 = EnumC92072a4q.REGISTER;
        if (enumC92072a4q == enumC92072a4q2) {
            i = R.string.jse;
        } else {
            i = R.string.jsi;
        }
        String string = pinConfirmFragment.getString(i);
        o.LJIIIIZZ(string, "getString(if (it == PinS…set_pin_retrieve_ybutton)");
        buttonGroup.LJFF(string, new IDqS16S1100000_31(this.LJLIL, this.LJLJI, 4));
        PinConfirmFragment pinConfirmFragment2 = this.LJLIL;
        if (this.LJLILLLLZI == enumC92072a4q2) {
            i2 = R.string.jsd;
        } else {
            i2 = R.string.jsh;
        }
        String string2 = pinConfirmFragment2.getString(i2);
        o.LJIIIIZZ(string2, "getString(if (it == PinS…set_pin_retrieve_nbutton)");
        buttonGroup.LJII(string2, new IDqS16S1100000_31(this.LJLIL, this.LJLJI, 5));
        return C76800UCe.LIZ;
    }
}
