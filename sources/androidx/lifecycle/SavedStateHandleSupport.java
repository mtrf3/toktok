package androidx.lifecycle;

import X.AnonymousClass106;
import X.C0TS;
import X.C0VJ;
import X.C0VK;
import X.C0VL;
import X.C1NG;
import X.C39557Ffl;
import X.C65352Pkq;
import X.C65776Prg;
import X.InterfaceC36571c5;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class SavedStateHandleSupport {
    public static final C0VJ<InterfaceC36571c5> SAVED_STATE_REGISTRY_OWNER_KEY = new C0VJ<InterfaceC36571c5>() { // from class: androidx.lifecycle.SavedStateHandleSupport$SAVED_STATE_REGISTRY_OWNER_KEY$1
    };
    public static final C0VJ<ViewModelStoreOwner> VIEW_MODEL_STORE_OWNER_KEY = new C0VJ<ViewModelStoreOwner>() { // from class: androidx.lifecycle.SavedStateHandleSupport$VIEW_MODEL_STORE_OWNER_KEY$1
    };
    public static final C0VJ<Bundle> DEFAULT_ARGS_KEY = new C0VJ<Bundle>() { // from class: androidx.lifecycle.SavedStateHandleSupport$DEFAULT_ARGS_KEY$1
    };

    public static final SavedStateHandle createSavedStateHandle(C0VK c0vk) {
        o.LJIIIZ(c0vk, "<this>");
        InterfaceC36571c5 interfaceC36571c5 = (InterfaceC36571c5) c0vk.LIZ(SAVED_STATE_REGISTRY_OWNER_KEY);
        if (interfaceC36571c5 != null) {
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) c0vk.LIZ(VIEW_MODEL_STORE_OWNER_KEY);
            if (viewModelStoreOwner != null) {
                Bundle bundle = (Bundle) c0vk.LIZ(DEFAULT_ARGS_KEY);
                String str = (String) c0vk.LIZ(ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY);
                if (str != null) {
                    return createSavedStateHandle(interfaceC36571c5, viewModelStoreOwner, str, bundle);
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends InterfaceC36571c5 & ViewModelStoreOwner> void enableSavedStateHandles(T t) {
        o.LJIIIZ(t, "<this>");
        Lifecycle.State currentState = t.getLifecycle().getCurrentState();
        o.LJIIIIZZ(currentState, "lifecycle.currentState");
        if (currentState == Lifecycle.State.INITIALIZED || currentState == Lifecycle.State.CREATED) {
            if (t.getSavedStateRegistry().LIZIZ() == null) {
                SavedStateHandlesProvider savedStateHandlesProvider = new SavedStateHandlesProvider(t.getSavedStateRegistry(), t);
                t.getSavedStateRegistry().LIZJ("androidx.lifecycle.internal.SavedStateHandlesProvider", savedStateHandlesProvider);
                t.getLifecycle().addObserver(new SavedStateHandleAttacher(savedStateHandlesProvider));
                return;
            }
            return;
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final SavedStateHandlesProvider getSavedStateHandlesProvider(InterfaceC36571c5 interfaceC36571c5) {
        SavedStateHandlesProvider savedStateHandlesProvider;
        o.LJIIIZ(interfaceC36571c5, "<this>");
        AnonymousClass106 LIZIZ = interfaceC36571c5.getSavedStateRegistry().LIZIZ();
        if ((LIZIZ instanceof SavedStateHandlesProvider) && (savedStateHandlesProvider = (SavedStateHandlesProvider) LIZIZ) != null) {
            return savedStateHandlesProvider;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final SavedStateHandlesVM getSavedStateHandlesVM(ViewModelStoreOwner viewModelStoreOwner) {
        o.LJIIIZ(viewModelStoreOwner, "<this>");
        C0TS c0ts = new C0TS(0);
        SavedStateHandleSupport$savedStateHandlesVM$1$1 initializer = SavedStateHandleSupport$savedStateHandlesVM$1$1.INSTANCE;
        C65776Prg LIZ = C65352Pkq.LIZ(SavedStateHandlesVM.class);
        o.LJIIIZ(initializer, "initializer");
        ((List) c0ts.LIZ).add(new C0VL(C39557Ffl.LIZ(LIZ), initializer));
        Object[] array = ((List) c0ts.LIZ).toArray(new C0VL[0]);
        if (array != null) {
            C0VL[] c0vlArr = (C0VL[]) array;
            return (SavedStateHandlesVM) new ViewModelProvider(viewModelStoreOwner, new C1NG((C0VL[]) Arrays.copyOf(c0vlArr, c0vlArr.length))).get("androidx.lifecycle.internal.SavedStateHandlesVM", SavedStateHandlesVM.class);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final SavedStateHandle createSavedStateHandle(InterfaceC36571c5 interfaceC36571c5, ViewModelStoreOwner viewModelStoreOwner, String str, Bundle bundle) {
        SavedStateHandlesProvider savedStateHandlesProvider = getSavedStateHandlesProvider(interfaceC36571c5);
        SavedStateHandlesVM savedStateHandlesVM = getSavedStateHandlesVM(viewModelStoreOwner);
        SavedStateHandle savedStateHandle = savedStateHandlesVM.getHandles().get(str);
        if (savedStateHandle == null) {
            SavedStateHandle createHandle = SavedStateHandle.Companion.createHandle(savedStateHandlesProvider.consumeRestoredStateForKey(str), bundle);
            savedStateHandlesVM.getHandles().put(str, createHandle);
            return createHandle;
        }
        return savedStateHandle;
    }
}
