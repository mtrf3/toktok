package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS94S0101000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.Aos, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27382Aos implements InterfaceC025208a {
    public final /* synthetic */ DistrictFragment LJLIL;

    public C27382Aos(DistrictFragment districtFragment) {
        this.LJLIL = districtFragment;
    }

    @Override // X.InterfaceC025208a
    public final void onBackStackChanged() {
        List<Fragment> LJJJJLI = this.LJLIL.getChildFragmentManager().LJJJJLI();
        o.LJIIIIZZ(LJJJJLI, "childFragmentManager.fragments");
        int LJJI = C47261Igj.LJJI(LJJJJLI);
        this.LJLIL.Al().gv0().LJZ(LJJI);
        ((C252709vu) this.LJLIL._$_findCachedViewById(R.id.l9j)).LJIJ(C76800UCe.LIZ, new AqS94S0101000_4(LJJI, this.LJLIL, 8));
    }
}
