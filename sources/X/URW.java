package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class URW extends AbstractC65781Prl implements InterfaceC88472Yns<Bundle, C76800UCe> {
    public final /* synthetic */ UR7 LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public URW(UR7 ur7) {
        super(1);
        this.LJLIL = ur7;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Bundle bundle) {
        Bundle bundle2 = bundle;
        o.LJIIIZ(bundle2, "$this$bundle");
        boolean z = true;
        bundle2.putBoolean("is_passive_pop_up", true);
        if (this.LJLIL != UR7.DEFAULT) {
            z = false;
        }
        bundle2.putBoolean("is_normal_freq_control", z);
        bundle2.putBoolean("is_followed_pop_up", false);
        C77177UQr.LIZ.getClass();
        bundle2.putParcelable("freq_data_before_pipeline", C77177UQr.LJII());
        return C76800UCe.LIZ;
    }
}
