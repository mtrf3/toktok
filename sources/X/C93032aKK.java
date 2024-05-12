package X;

import android.view.ViewGroup;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.aKK, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93032aKK extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ InterfaceC35811ar<Boolean> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ InterfaceC91781a09 LJLJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ ViewGroup LJLJL;
    public final /* synthetic */ ComposeView LJLJLJ;
    public final /* synthetic */ long LJLJJI = 3000;
    public final /* synthetic */ boolean LJLJJLL = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93032aKK(ParcelableSnapshotMutableState parcelableSnapshotMutableState, String str, AbstractC92319a8p abstractC92319a8p, int i, ViewGroup viewGroup, ComposeView composeView) {
        super(2);
        this.LJLIL = parcelableSnapshotMutableState;
        this.LJLILLLLZI = str;
        this.LJLJI = abstractC92319a8p;
        this.LJLJJL = i;
        this.LJLJL = viewGroup;
        this.LJLJLJ = composeView;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if (((num.intValue() & 11) ^ 2) != 0 || !interfaceC24520xk2.LIZ()) {
            C91673ZyP.LIZ(Boolean.valueOf(C91671ZyN.LIZ), null, Boolean.valueOf(C91671ZyN.LIZIZ), null, C1DJ.LJ(interfaceC24520xk2, -819889459, new C93031aKJ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ)), interfaceC24520xk2, 24576, 10);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
