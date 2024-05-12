package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.PowerStub;
import com.bytedance.ies.powerlist.header.FixedViewCell;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public abstract class SIT implements InterfaceC94653nZ, InterfaceC93923mO, InterfaceC227588wU {
    public PowerStub LJLIL;
    public Context LJLJI;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1159));
    public final LifecycleRegistry LJLJJI = new LifecycleRegistry(this);
    public final C72808Sho<InterfaceC57784Mm4> LJLJJL = new C72808Sho<>();

    public AbstractC72278SYg<?> LJII() {
        return null;
    }

    public void onCreate() {
    }

    public void onDestroy() {
    }

    @Override // X.InterfaceC227608wW
    public final void onPause() {
    }

    @Override // X.InterfaceC227608wW
    public final void onResume(boolean z) {
    }

    @Override // X.InterfaceC227608wW
    public final void onStart() {
    }

    @Override // X.InterfaceC227608wW
    public final void onStop() {
    }

    public final PowerStub LJFF() {
        PowerStub powerStub = this.LJLIL;
        if (powerStub != null) {
            return powerStub;
        }
        o.LJIJI("stub");
        throw null;
    }

    public final boolean LJI() {
        if (this.LJLIL != null) {
            return true;
        }
        return false;
    }

    public final int LIZJ() {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        PowerStub LJFF = LJFF();
        PowerAdapter powerAdapter = LJFF.LJLIL;
        powerAdapter.getClass();
        if (powerAdapter.LJLIL.getLayoutManager() == null) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(powerAdapter.LLFII());
        if (valueOf.intValue() >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = valueOf.intValue();
        } else {
            i = -1;
        }
        Integer valueOf2 = Integer.valueOf(powerAdapter.LLFZ());
        if (valueOf2.intValue() >= 0) {
            i2 = valueOf2.intValue();
        } else {
            i2 = -1;
        }
        java.util.Map<C71855SHz, PowerStub> map = powerAdapter.LLF;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            if (o.LJ(entry.getValue(), LJFF)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        C71855SHz c71855SHz = (C71855SHz) ORZ.LJLLL(linkedHashMap.keySet());
        if (c71855SHz != null) {
            Integer num = (Integer) ORZ.LLFFF(C40658FxW.LJLI(ORZ.LJZI(new C40517FvF(i, i2), C78842Uww.LJJ(c71855SHz.LIZ, c71855SHz.LIZIZ))));
            if (num != null) {
                i4 = num.intValue();
            } else {
                i4 = LiveLayoutPreloadThreadPriority.DEFAULT;
            }
            i3 = i4 - c71855SHz.LIZ;
        } else {
            i3 = -1;
        }
        Integer valueOf3 = Integer.valueOf(i3);
        if (valueOf3.intValue() < 0) {
            return -1;
        }
        return valueOf3.intValue();
    }

    public final List<InterfaceC57784Mm4> LIZLLL() {
        return LJFF().LJZ;
    }

    @Override // X.InterfaceC93923mO
    public final LifecycleOwner getCurrentLifeCycleOwner() {
        return LJFF().LJLIL.LLIIIILZ();
    }

    public Lifecycle getLifecycle() {
        return getLifecycleRegistry();
    }

    @Override // X.InterfaceC93923mO
    public final Context getContext() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC227588wU
    public final LifecycleRegistry getLifecycleRegistry() {
        return this.LJLJJI;
    }

    public final void LIZ(View view) {
        int size = LJFF().LJLLLL.size();
        PowerStub LJFF = LJFF();
        if (view == null) {
            return;
        }
        int i = LJFF.LJLJLJ;
        LJFF.LJLJLJ = i + 1;
        LJFF.LJLLLL.add(size, new SIU(view, i));
        ((HashMap) LJFF.LJLJLLL).put(Integer.valueOf(i), FixedViewCell.class);
        LJFF.LIZJ();
    }

    public final void LJIIIIZZ(Class<? extends PowerCell<?>>... classes) {
        o.LJIIIZ(classes, "classes");
        LJFF().LJ(ORY.LJJZZIII(classes));
    }

    public final void LJIIIZ(View view) {
        PowerStub LJFF = LJFF();
        if (view == null) {
            return;
        }
        int size = LJFF.LJLLLL.size();
        for (int i = 0; i < size; i++) {
            if (LJFF.LJLLLL.get(i).LJLIL == view) {
                LJFF.LJLLLL.remove(i);
                LJFF.LIZJ();
                return;
            }
        }
    }

    public final void LIZIZ(int i, View view) {
        LJFF().LIZIZ(0, view);
    }

    @Override // X.InterfaceC94653nZ
    public final <T extends ViewModel> T getActivityViewModel(Class<T> cls, ViewModelProvider.Factory factory) {
        ActivityC45651qj LLIFFJFJJ = LJFF().LJLIL.LLIFFJFJJ();
        if (LLIFFJFJJ != null) {
            return (T) ViewModelProviders.of(LLIFFJFJJ, factory).get(cls);
        }
        return null;
    }

    @Override // X.InterfaceC94653nZ
    public final <T extends ViewModel> T getFragmentViewModel(Class<T> cls, ViewModelProvider.Factory factory) {
        Fragment LLIIII = LJFF().LJLIL.LLIIII();
        if (LLIIII != null) {
            return (T) ViewModelProviders.of(LLIIII, factory).get(cls);
        }
        return null;
    }
}
