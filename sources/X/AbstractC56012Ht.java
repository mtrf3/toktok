package X;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import com.bytedance.scene.group.UserVisibleHintGroupScene;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.2Ht */
/* loaded from: classes.dex */
public abstract class AbstractC56012Ht<STATE, ACTION> extends UserVisibleHintGroupScene {
    public boolean delayOnShow;
    public ACTION uiActions;
    public C08610Vl<STATE> uiStates;

    public final void dispatchHide$als_release() {
        this.delayOnShow = false;
        onHide();
    }

    public void onHide() {
    }

    public void onShow() {
    }

    public final ACTION getUiActions() {
        ACTION action = this.uiActions;
        if (action != null) {
            return action;
        }
        o.LJIJI("uiActions");
        throw null;
    }

    public final C08610Vl<STATE> getUiStates() {
        C08610Vl<STATE> c08610Vl = this.uiStates;
        if (c08610Vl != null) {
            return c08610Vl;
        }
        o.LJIJI("uiStates");
        throw null;
    }

    public final void dispatchShow$als_release() {
        Lifecycle lifecycle = getLifecycle();
        o.LJIIIIZZ(lifecycle, "lifecycle");
        if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            onShow();
        } else {
            this.delayOnShow = true;
        }
    }

    @Override // X.WM7
    public void onResume() {
        super.onResume();
        if (this.delayOnShow) {
            this.delayOnShow = false;
            onShow();
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        List<WM7> sceneList = getSceneList();
        o.LJIIIIZZ(sceneList, "sceneList");
        Iterator it = ORZ.LLJI(sceneList).iterator();
        while (it.hasNext()) {
            remove((WM7) it.next());
        }
    }

    public final void setUiActions(ACTION action) {
        o.LJIIIZ(action, "<set-?>");
        this.uiActions = action;
    }

    public final void setUiStates(C08610Vl<STATE> c08610Vl) {
        o.LJIIIZ(c08610Vl, "<set-?>");
        this.uiStates = c08610Vl;
    }

    public final <TYPE> void observe(C0IB<TYPE> observe, final InterfaceC88472Yns<? super TYPE, C76800UCe> observer) {
        o.LJIIIZ(observe, "$this$observe");
        o.LJIIIZ(observer, "observer");
        observe.LIZIZ(this, new InterfaceC29911Fj<TYPE>() { // from class: X.1jk
            @Override // androidx.lifecycle.Observer
            public final void onChanged(TYPE type) {
                InterfaceC88472Yns.this.invoke(type);
            }
        });
    }

    public final void observe(C08610Vl<STATE> observe, Lifecycle.State targetState, InterfaceC88472Yns<? super STATE, C76800UCe> observer) {
        o.LJIIIZ(observe, "$this$observe");
        o.LJIIIZ(targetState, "targetState");
        o.LJIIIZ(observer, "observer");
        C08610Vl<STATE> c08610Vl = this.uiStates;
        if (c08610Vl != null) {
            c08610Vl.LIZLLL.LJIIIIZZ(this, targetState, new IDqS416S0100000(observer, 126));
        } else {
            o.LJIJI("uiStates");
            throw null;
        }
    }

    public final <K, V> void observe(C08610Vl<K> observe, TBW<K, ? extends V> property, Lifecycle.State targetState, InterfaceC88472Yns<? super V, C76800UCe> observer) {
        o.LJIIIZ(observe, "$this$observe");
        o.LJIIIZ(property, "property");
        o.LJIIIZ(targetState, "targetState");
        o.LJIIIZ(observer, "observer");
        observe.LIZIZ(property).LJIIIIZZ(this, targetState, new IDqS416S0100000(observer, 127));
    }

    public final <K, V> void observeEvent(C08610Vl<K> observeEvent, TBW<K, C08630Vn<V>> property, Lifecycle.State targetState, InterfaceC88472Yns<? super V, C76800UCe> observer) {
        o.LJIIIZ(observeEvent, "$this$observeEvent");
        o.LJIIIZ(property, "property");
        o.LJIIIZ(targetState, "targetState");
        o.LJIIIZ(observer, "observer");
        observeEvent.LIZIZ(property).LJIIIIZZ(this, targetState, new IDqS416S0100000(observer, 128));
    }

    public static /* synthetic */ void observe$default(AbstractC56012Ht abstractC56012Ht, C08610Vl c08610Vl, Lifecycle.State state, InterfaceC88472Yns interfaceC88472Yns, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                state = Lifecycle.State.STARTED;
            }
            abstractC56012Ht.observe(c08610Vl, state, interfaceC88472Yns);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observe");
    }

    public static /* synthetic */ void observe$default(AbstractC56012Ht abstractC56012Ht, C08610Vl c08610Vl, TBW tbw, Lifecycle.State state, InterfaceC88472Yns interfaceC88472Yns, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                state = Lifecycle.State.STARTED;
            }
            abstractC56012Ht.observe(c08610Vl, tbw, state, interfaceC88472Yns);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observe");
    }

    public static /* synthetic */ void observeEvent$default(AbstractC56012Ht abstractC56012Ht, C08610Vl c08610Vl, TBW tbw, Lifecycle.State state, InterfaceC88472Yns interfaceC88472Yns, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                state = Lifecycle.State.STARTED;
            }
            abstractC56012Ht.observeEvent(c08610Vl, tbw, state, interfaceC88472Yns);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeEvent");
    }
}
