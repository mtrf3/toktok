package X;

import android.view.ViewGroup;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.aJH, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92967aJH extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ InterfaceC35811ar<Boolean> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ long LJLJI = 3000;
    public final /* synthetic */ boolean LJLJJI = true;
    public final /* synthetic */ ViewGroup LJLJJL;
    public final /* synthetic */ ComposeView LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92967aJH(ParcelableSnapshotMutableState parcelableSnapshotMutableState, String str, ViewGroup viewGroup, ComposeView composeView) {
        super(2);
        this.LJLIL = parcelableSnapshotMutableState;
        this.LJLILLLLZI = str;
        this.LJLJJL = viewGroup;
        this.LJLJJLL = composeView;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if (((num.intValue() & 11) ^ 2) != 0 || !interfaceC24520xk2.LIZ()) {
            C91673ZyP.LIZ(Boolean.valueOf(C91671ZyN.LIZ), null, Boolean.valueOf(C91671ZyN.LIZIZ), null, C1DJ.LJ(interfaceC24520xk2, -819890941, new C92966aJG(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL)), interfaceC24520xk2, 24576, 10);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
