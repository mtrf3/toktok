package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.URa, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77186URa extends AbstractC65781Prl implements InterfaceC88472Yns<Bundle, C76800UCe> {
    public final /* synthetic */ UR7 LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77186URa(UR7 ur7, boolean z) {
        super(1);
        this.LJLIL = ur7;
        this.LJLILLLLZI = z;
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
        bundle2.putBoolean("is_followed_pop_up", this.LJLILLLLZI);
        C77177UQr.LIZ.getClass();
        bundle2.putParcelable("freq_data_before_pipeline", C77177UQr.LJII());
        return C76800UCe.LIZ;
    }
}