package X;

import android.view.View;
import androidx.compose.ui.platform.g1;
import com.zhiliaoapp.musically.R;

/* renamed from: X.aFK, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92722aFK extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ C05P LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C92158a6E LJLJI;
    public final /* synthetic */ View LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92722aFK(C05P c05p, boolean z, C92158a6E c92158a6E, View view, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(2);
        this.LJLIL = c05p;
        this.LJLILLLLZI = z;
        this.LJLJI = c92158a6E;
        this.LJLJJI = view;
        this.LJLJJL = interfaceC65784Pro;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if (((num.intValue() & 11) ^ 2) != 0 || !interfaceC24520xk2.LIZ()) {
            AbstractC16010k1 LJJIIZ = C79081V1x.LJJIIZ(R.drawable.ii, interfaceC24520xk2);
            InterfaceC07790Sh LIZ = C92004a3k.LIZ(InterfaceC07790Sh.LJJJI);
            C05P c05p = this.LJLIL;
            boolean z = this.LJLILLLLZI;
            C92158a6E c92158a6E = this.LJLJI;
            View view = this.LJLJJI;
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJJL;
            C0SR.LIZ(LJJIIZ, null, C07770Sf.LIZ(LIZ, g1.LIZ, new C92656aEG(true, null, new C42191l9(), c05p, z, c92158a6E, view, interfaceC65784Pro)), null, null, 0.0f, C11860dK.LIZIZ(C91671ZyN.LIZ(interfaceC24520xk2).LIZJ), interfaceC24520xk2, 56, 56);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
