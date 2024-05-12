package X;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.G3c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40892G3c extends G46 {
    public final ConcurrentHashMap<Integer, InterfaceC56322M8o> LIZJ = new ConcurrentHashMap<>();

    @Override // X.G46, X.G48, X.InterfaceC86124Xr6
    public final void onActivityDestroyed(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
        this.LIZIZ = null;
        if (this.LIZJ.containsKey(Integer.valueOf(activity.hashCode()))) {
            this.LIZJ.remove(Integer.valueOf(activity.hashCode()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.G48, X.InterfaceC86124Xr6
    public final void onActivityPostResumed(ActivityC86117Xqz activity) {
        InterfaceC56322M8o interfaceC56322M8o;
        String name;
        o.LJIIIZ(activity, "activity");
        if (activity instanceof InterfaceC40895G3f) {
            ((InterfaceC40895G3f) activity).LJJI();
            return;
        }
        String str = null;
        if (activity instanceof InterfaceC56322M8o) {
            interfaceC56322M8o = (InterfaceC56322M8o) activity;
        } else if (this.LIZJ.containsKey(Integer.valueOf(activity.hashCode()))) {
            interfaceC56322M8o = this.LIZJ.get(Integer.valueOf(activity.hashCode()));
        } else {
            interfaceC56322M8o = null;
        }
        String valueOf = String.valueOf(activity.hashCode());
        C18080nM.LIZ.getClass();
        C18090nN LJFF = C18080nM.LJFF(valueOf);
        if (LJFF != null) {
            str = LJFF.LIZIZ();
        }
        if (str == null || str.length() == 0) {
            name = activity.getClass().getName();
        } else {
            name = str.substring(1);
            o.LJIIIIZZ(name, "this as java.lang.String).substring(startIndex)");
        }
        if (interfaceC56322M8o != null) {
            ISpecActService.LIZ.getClass();
            C40894G3e.LIZ().LJIIJ(interfaceC56322M8o, name, 1000, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.G46, X.G48, X.InterfaceC86124Xr6
    public final void onActivityCreated(ActivityC86117Xqz activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        super.onActivityCreated(activity, bundle);
        if (activity instanceof InterfaceC40895G3f) {
            ((InterfaceC40895G3f) activity).LJJI();
            return;
        }
        if (!(activity instanceof InterfaceC55643Lsd) && !this.LIZJ.contains(Integer.valueOf(activity.hashCode()))) {
            ConcurrentHashMap<Integer, InterfaceC56322M8o> concurrentHashMap = this.LIZJ;
            Integer valueOf = Integer.valueOf(activity.hashCode());
            final WeakReference weakReference = new WeakReference(activity);
            concurrentHashMap.put(valueOf, new InterfaceC56322M8o(weakReference) { // from class: X.7Ur
                public final WeakReference<ActivityC45651qj> LJLIL;

                @Override // X.InterfaceC55643Lsd
                public final String getSceneId() {
                    return "dynamic_popup";
                }

                @Override // X.InterfaceC56322M8o
                public final boolean needConflictWithParent() {
                    return true;
                }

                @Override // X.InterfaceC55643Lsd
                public final C54082LKk getPopupContext() {
                    ActivityC45651qj activityC45651qj = this.LJLIL.get();
                    if (activityC45651qj == null) {
                        return null;
                    }
                    return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
                }

                @Override // X.InterfaceC55643Lsd
                public final boolean isSceneActive() {
                    Lifecycle lifecycle;
                    Lifecycle.State currentState;
                    ActivityC45651qj activityC45651qj = this.LJLIL.get();
                    if (activityC45651qj == null || (lifecycle = activityC45651qj.getLifecycle()) == null || (currentState = lifecycle.getCurrentState()) == null || !currentState.isAtLeast(Lifecycle.State.CREATED)) {
                        return false;
                    }
                    return true;
                }

                {
                    this.LJLIL = weakReference;
                }
            });
        }
    }
}
