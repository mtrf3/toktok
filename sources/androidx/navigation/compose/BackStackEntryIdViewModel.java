package androidx.navigation.compose;

import X.C0MC;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class BackStackEntryIdViewModel extends ViewModel {
    public final UUID LJLIL;
    public C0MC LJLILLLLZI;

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C0MC c0mc = this.LJLILLLLZI;
        if (c0mc == null) {
            return;
        }
        c0mc.LJ(this.LJLIL);
    }

    public BackStackEntryIdViewModel(SavedStateHandle handle) {
        o.LJIIIZ(handle, "handle");
        UUID uuid = (UUID) handle.get("SaveableStateHolder_BackStackEntryKey");
        if (uuid == null) {
            uuid = UUID.randomUUID();
            handle.set("SaveableStateHolder_BackStackEntryKey", uuid);
            o.LJIIIIZZ(uuid, "randomUUID().also { handle.set(IdKey, it) }");
        }
        this.LJLIL = uuid;
    }
}
