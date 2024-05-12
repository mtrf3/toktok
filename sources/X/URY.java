package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class URY extends AbstractC65781Prl implements InterfaceC88472Yns<Bundle, C76800UCe> {
    public final /* synthetic */ C77208URw LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public URY(C77208URw c77208URw) {
        super(1);
        this.LJLIL = c77208URw;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Bundle bundle) {
        Bundle bundle2 = bundle;
        o.LJIIIZ(bundle2, "$this$bundle");
        boolean z = true;
        bundle2.putBoolean("is_passive_pop_up", true);
        if (this.LJLIL.LJLIL.LJ.LIZ != URF.NORMAL) {
            z = false;
        }
        bundle2.putBoolean("is_normal_freq_control", z);
        bundle2.putBoolean("is_followed_pop_up", false);
        bundle2.putParcelable("freq_data_before_pipeline", this.LJLIL.LJLILLLLZI.LJLJJLL);
        return C76800UCe.LIZ;
    }
}
