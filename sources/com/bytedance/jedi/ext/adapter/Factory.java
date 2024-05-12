package com.bytedance.jedi.ext.adapter;

import X.C09L;
import X.C0VK;
import X.C76800UCe;
import X.InterfaceC61312at;
import X.X1D;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.jedi.arch.JediViewModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class Factory implements ViewModelProvider.Factory {

    /* loaded from: classes5.dex */
    public static final class ViewModel extends JediViewModel<SimpleViewHolderState> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.bytedance.jedi.arch.JediViewModel
        public final SimpleViewHolderState kv0() {
            return new SimpleViewHolderState(null, 1, 0 == true ? 1 : 0);
        }
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ androidx.lifecycle.ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    /* loaded from: classes5.dex */
    public static final class SimpleViewHolderState implements InterfaceC61312at {
        public final C76800UCe trigger;

        /* JADX WARN: Multi-variable type inference failed */
        public SimpleViewHolderState() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        private final void component1() {
        }

        public static /* synthetic */ SimpleViewHolderState copy$default(SimpleViewHolderState simpleViewHolderState, C76800UCe c76800UCe, int i, Object obj) {
            if ((i & 1) != 0) {
                c76800UCe = simpleViewHolderState.trigger;
            }
            return simpleViewHolderState.copy(c76800UCe);
        }

        public final SimpleViewHolderState copy(C76800UCe trigger) {
            o.LJIIJ(trigger, "trigger");
            return new SimpleViewHolderState(trigger);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof SimpleViewHolderState) && o.LJ(this.trigger, ((SimpleViewHolderState) obj).trigger);
            }
            return true;
        }

        public int hashCode() {
            C76800UCe c76800UCe = this.trigger;
            if (c76800UCe != null) {
                return c76800UCe.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SimpleViewHolderState(trigger=");
            LIZ.append(this.trigger);
            LIZ.append(")");
            return X1D.LIZIZ(LIZ);
        }

        public SimpleViewHolderState(C76800UCe trigger) {
            o.LJIIJ(trigger, "trigger");
            this.trigger = trigger;
        }

        public /* synthetic */ SimpleViewHolderState(C76800UCe c76800UCe, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C76800UCe.LIZ : c76800UCe);
        }
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends androidx.lifecycle.ViewModel> T create(Class<T> modelClass) {
        o.LJIIJ(modelClass, "modelClass");
        return new ViewModel();
    }
}
