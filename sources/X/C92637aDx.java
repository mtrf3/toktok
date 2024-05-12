package X;

import androidx.compose.ui.platform.g1;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS0S1210000_31;

/* renamed from: X.aDx, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92637aDx extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92637aDx(boolean z, boolean z2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(2);
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = interfaceC65784Pro;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if (((num.intValue() & 11) ^ 2) != 0 || !interfaceC24520xk2.LIZ()) {
            if (this.LJLIL) {
                AbstractC16010k1 LJJIIZ = C79081V1x.LJJIIZ(R.drawable.im, interfaceC24520xk2);
                C11890dN LIZIZ = C11860dK.LIZIZ(C91671ZyN.LIZ(interfaceC24520xk2).LJ);
                C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
                boolean z = this.LJLILLLLZI;
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJI;
                C0SR.LIZ(LJJIIZ, null, C07770Sf.LIZ(c1m1, g1.LIZ, new IDqS0S1210000_31(z, (String) null, new C42191l9(), interfaceC65784Pro, 1)), null, null, 0.0f, LIZIZ, interfaceC24520xk2, 56, 56);
            }
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
