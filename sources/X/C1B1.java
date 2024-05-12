package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

/* renamed from: X.1B1, reason: invalid class name */
/* loaded from: classes.dex */
public class C1B1 implements InterfaceC025308b {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final /* synthetic */ FragmentManager LIZLLL;

    @Override // X.InterfaceC025308b
    public final boolean LIZ(ArrayList<C1B3> arrayList, ArrayList<Boolean> arrayList2) {
        Fragment fragment = this.LIZLLL.mPrimaryNav;
        if (fragment != null && this.LIZIZ < 0 && this.LIZ == null && fragment.getChildFragmentManager().LJJLIIIJL()) {
            return false;
        }
        return this.LIZLLL.LJJLIIIJLLLLLLLZ(arrayList, arrayList2, this.LIZ, this.LIZIZ, this.LIZJ);
    }

    public C1B1(FragmentManager fragmentManager, String str, int i, int i2) {
        this.LIZLLL = fragmentManager;
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
