package androidx.fragment.app;

import Y.IDFactoryS59S0000000;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class FragmentManagerViewModel extends ViewModel {
    public static final IDFactoryS59S0000000 LJLJJLL = new IDFactoryS59S0000000(0);
    public final boolean LJLJJI;
    public final HashMap<String, Fragment> LJLIL = new HashMap<>();
    public final HashMap<String, FragmentManagerViewModel> LJLILLLLZI = new HashMap<>();
    public final HashMap<String, ViewModelStore> LJLJI = new HashMap<>();
    public boolean LJLJJL = false;

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.LJLJJL = true;
    }

    public final int hashCode() {
        return this.LJLJI.hashCode() + ((this.LJLILLLLZI.hashCode() + (this.LJLIL.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.LJLIL.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.LJLILLLLZI.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.LJLJI.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public FragmentManagerViewModel(boolean z) {
        this.LJLJJI = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FragmentManagerViewModel.class != obj.getClass()) {
            return false;
        }
        FragmentManagerViewModel fragmentManagerViewModel = (FragmentManagerViewModel) obj;
        if (this.LJLIL.equals(fragmentManagerViewModel.LJLIL) && this.LJLILLLLZI.equals(fragmentManagerViewModel.LJLILLLLZI) && this.LJLJI.equals(fragmentManagerViewModel.LJLJI)) {
            return true;
        }
        return false;
    }

    public final boolean gv0(Fragment fragment) {
        if (!this.LJLIL.containsKey(fragment.mWho) || !this.LJLJJI) {
            return true;
        }
        return this.LJLJJL;
    }
}
