package androidx.navigation;

import X.AnonymousClass107;
import X.AnonymousClass108;
import X.AnonymousClass109;
import X.C09I;
import X.C0VK;
import X.C16880lQ;
import X.C221108m2;
import X.C62822Ol8;
import X.C91677ZyT;
import X.C91720ZzA;
import X.InterfaceC36571c5;
import X.InterfaceC91691Zyh;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.IDqS422S0100000_31;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class NavBackStackEntry implements LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, InterfaceC36571c5 {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public final Context LJLIL;
    public C91720ZzA LJLILLLLZI;
    public final Bundle LJLJI;
    public Lifecycle.State LJLJJI;
    public final InterfaceC91691Zyh LJLJJL;
    public final String LJLJJLL;
    public final Bundle LJLJL;
    public final LifecycleRegistry LJLJLJ = new LifecycleRegistry(this);
    public final AnonymousClass109 LJLJLLL = AnonymousClass108.LIZ(this);
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new IDqS422S0100000_31(this, 0));
    public Lifecycle.State LJLLI;

    static {
        new C91677ZyT();
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final /* synthetic */ C0VK getDefaultViewModelCreationExtras() {
        return C09I.LIZ(this);
    }

    public final void LIZIZ() {
        if (this.LJLJJI.ordinal() < this.LJLLI.ordinal()) {
            this.LJLJLJ.setCurrentState(this.LJLJJI);
        } else {
            this.LJLJLJ.setCurrentState(this.LJLLI);
        }
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return (SavedStateViewModelFactory) this.LJLL.getValue();
    }

    @Override // X.InterfaceC36571c5
    public final AnonymousClass107 getSavedStateRegistry() {
        AnonymousClass107 anonymousClass107 = this.LJLJLLL.LIZIZ;
        o.LJIIIIZZ(anonymousClass107, "savedStateRegistryController.savedStateRegistry");
        return anonymousClass107;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        if (this.LJLJLJ.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            InterfaceC91691Zyh interfaceC91691Zyh = this.LJLJJL;
            if (interfaceC91691Zyh != null) {
                return interfaceC91691Zyh.Dc0(this.LJLJJLL);
            }
            "You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.".toString();
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        }
        "You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString();
        throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
    }

    public final int hashCode() {
        Set<String> keySet;
        int hashCode;
        int hashCode2 = (this.LJLJJLL.hashCode() * 31) + this.LJLILLLLZI.hashCode();
        Bundle bundle = this.LJLJI;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<String> it = keySet.iterator();
            while (it.hasNext()) {
                int i = hashCode2 * 31;
                Object LLJJIII = C16880lQ.LLJJIII(this.LJLJI, it.next());
                if (LLJJIII == null) {
                    hashCode = 0;
                } else {
                    hashCode = LLJJIII.hashCode();
                }
                hashCode2 = i + hashCode;
            }
        }
        return (((hashCode2 * 31) + this.LJLJLJ.hashCode()) * 31) + getSavedStateRegistry().hashCode();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LJLJLJ;
    }

    /* loaded from: classes20.dex */
    public static final class SavedStateViewModel extends ViewModel {
        public final SavedStateHandle LJLIL;

        public SavedStateViewModel(SavedStateHandle handle) {
            o.LJIIIZ(handle, "handle");
            this.LJLIL = handle;
        }
    }

    public final void LIZ(Lifecycle.State maxState) {
        o.LJIIIZ(maxState, "maxState");
        if (this.LJLLI == Lifecycle.State.INITIALIZED) {
            this.LJLJLLL.LIZIZ(this.LJLJL);
        }
        this.LJLLI = maxState;
        LIZIZ();
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        Object LLJJIII;
        if (obj == null || !(obj instanceof NavBackStackEntry)) {
            return false;
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
        if (!o.LJ(this.LJLJJLL, navBackStackEntry.LJLJJLL) || !o.LJ(this.LJLILLLLZI, navBackStackEntry.LJLILLLLZI) || !o.LJ(this.LJLJLJ, navBackStackEntry.LJLJLJ) || !o.LJ(getSavedStateRegistry(), navBackStackEntry.getSavedStateRegistry())) {
            return false;
        }
        if (!o.LJ(this.LJLJI, navBackStackEntry.LJLJI)) {
            Bundle bundle = this.LJLJI;
            if (bundle == null || (keySet = bundle.keySet()) == null) {
                return false;
            }
            if (!keySet.isEmpty()) {
                for (String str : keySet) {
                    Object LLJJIII2 = C16880lQ.LLJJIII(this.LJLJI, str);
                    Bundle bundle2 = navBackStackEntry.LJLJI;
                    if (bundle2 == null) {
                        LLJJIII = null;
                    } else {
                        LLJJIII = C16880lQ.LLJJIII(bundle2, str);
                    }
                    if (!o.LJ(LLJJIII2, LLJJIII)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public NavBackStackEntry(Context context, C91720ZzA c91720ZzA, Bundle bundle, Lifecycle.State state, InterfaceC91691Zyh interfaceC91691Zyh, String str, Bundle bundle2) {
        this.LJLIL = context;
        this.LJLILLLLZI = c91720ZzA;
        this.LJLJI = bundle;
        this.LJLJJI = state;
        this.LJLJJL = interfaceC91691Zyh;
        this.LJLJJLL = str;
        this.LJLJL = bundle2;
        C221108m2.LIZIZ(new IDqS422S0100000_31(this, 1));
        this.LJLLI = Lifecycle.State.INITIALIZED;
    }
}
