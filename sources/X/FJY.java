package X;

import android.app.Dialog;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FJY extends AbstractC65781Prl implements InterfaceC88472Yns<Dialog, C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FJY(long j, long j2, long j3) {
        super(1);
        this.LJLIL = j;
        this.LJLILLLLZI = j2;
        this.LJLJI = j3;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Dialog dialog) {
        Dialog it = dialog;
        o.LJIIIZ(it, "it");
        it.dismiss();
        C37284EkC.LIZ = false;
        C37284EkC.LIZJ(EnumC36113EFh.CLICK_CANCEL_CLEAN_LOADING, this.LJLIL, this.LJLILLLLZI, this.LJLJI, 0L, 0L, false, false);
        return C76800UCe.LIZ;
    }
}
