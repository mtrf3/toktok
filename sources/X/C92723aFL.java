package X;

import android.view.View;
import androidx.compose.ui.platform.g1;
import com.zhiliaoapp.musically.R;

/* renamed from: X.aFL, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92723aFL extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ C92158a6E LJLILLLLZI;
    public final /* synthetic */ View LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92723aFL(boolean z, C92158a6E c92158a6E, View view, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(2);
        this.LJLIL = z;
        this.LJLILLLLZI = c92158a6E;
        this.LJLJI = view;
        this.LJLJJI = interfaceC65784Pro;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if (((num.intValue() & 11) ^ 2) != 0 || !interfaceC24520xk2.LIZ()) {
            AbstractC16010k1 LJJIIZ = C79081V1x.LJJIIZ(R.drawable.jl, interfaceC24520xk2);
            C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
            boolean z = this.LJLIL;
            C92158a6E c92158a6E = this.LJLILLLLZI;
            View view = this.LJLJI;
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJJI;
            C0SR.LIZ(LJJIIZ, null, C07770Sf.LIZ(c1m1, g1.LIZ, new C92659aEJ(true, null, new C42191l9(), z, c92158a6E, view, interfaceC65784Pro)), null, null, 0.0f, C11860dK.LIZIZ(C91671ZyN.LIZ(interfaceC24520xk2).LIZJ), interfaceC24520xk2, 56, 56);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
