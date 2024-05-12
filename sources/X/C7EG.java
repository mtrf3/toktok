package X;

import X.ActivityC45651qj;
import X.C7EH;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModelStore;
import com.bytedance.assem.arch.core.Assembler;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.7EG, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7EG {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, androidx.lifecycle.ViewModel] */
    public static Assembler LIZ(final ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        if (C214368bA.LJIJ) {
            HashMap<ViewModelStore, Assembler> hashMap = C7EH.LIZ;
            final ViewModelStore viewModelStore = activity.getViewModelStore();
            o.LJIIIIZZ(viewModelStore, "activity.viewModelStore");
            C68322mC c68322mC = new C68322mC();
            ?? r0 = hashMap.get(viewModelStore);
            c68322mC.element = r0;
            if (r0 == 0) {
                synchronized (hashMap) {
                    ?? r02 = hashMap.get(viewModelStore);
                    c68322mC.element = r02;
                    if (r02 == 0) {
                        ?? r1 = ViewModelProviders.of(activity).get(Assembler.class);
                        hashMap.put(viewModelStore, (Assembler) r1);
                        c68322mC.element = r1;
                    }
                    activity.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.bytedance.assem.arch.reused.assemble.AssemblerHolder$getAssembler$1$2
                        @Override // androidx.lifecycle.LifecycleEventObserver
                        public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                            o.LJIIIZ(source, "source");
                            o.LJIIIZ(event, "event");
                            if (event == Lifecycle.Event.ON_DESTROY) {
                                ActivityC45651qj.this.getLifecycle().removeObserver(this);
                                Assembler remove = C7EH.LIZ.remove(viewModelStore);
                                if (remove != null) {
                                    remove.onCleared();
                                }
                            }
                        }
                    });
                }
            }
            T t = c68322mC.element;
            if (t != 0) {
                return (Assembler) t;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        return (Assembler) ViewModelProviders.of(activity).get(Assembler.class);
    }
}
