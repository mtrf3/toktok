package androidx.navigation;

import X.C92122a5e;
import X.InterfaceC91691Zyh;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class NavControllerViewModel extends ViewModel implements InterfaceC91691Zyh {
    public static final ViewModelProvider.Factory LJLILLLLZI = new C92122a5e();
    public final Map<String, ViewModelStore> LJLIL = new LinkedHashMap();

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        Iterator it = ((LinkedHashMap) this.LJLIL).values().iterator();
        while (it.hasNext()) {
            ((ViewModelStore) it.next()).clear();
        }
        ((LinkedHashMap) this.LJLIL).clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator it = ((LinkedHashMap) this.LJLIL).keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sb.toString()");
        return sb2;
    }

    @Override // X.InterfaceC91691Zyh
    public final ViewModelStore Dc0(String backStackEntryId) {
        o.LJIIIZ(backStackEntryId, "backStackEntryId");
        ViewModelStore viewModelStore = (ViewModelStore) ((LinkedHashMap) this.LJLIL).get(backStackEntryId);
        if (viewModelStore == null) {
            ViewModelStore viewModelStore2 = new ViewModelStore();
            this.LJLIL.put(backStackEntryId, viewModelStore2);
            return viewModelStore2;
        }
        return viewModelStore;
    }
}
