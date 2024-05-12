package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.7Td, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC186377Td {
    public final MutableLiveData<Integer> LJLIL = new MutableLiveData<>(0);

    public abstract C213218Yj LIZ();

    public void LIZLLL(boolean z) {
    }

    public void LJ(boolean z) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ(MutableLiveData mutableLiveData) {
        o.LJIIIZ(mutableLiveData, "<this>");
        if (((Integer) mutableLiveData.getValue()) != null) {
            mutableLiveData.setValue(Integer.valueOf(r0.intValue() - 1));
        }
    }

    public void LIZJ(Lifecycle.Event event) {
        o.LJIIIZ(event, "event");
        int i = C186367Tc.LIZ[event.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            EventBus.LIZJ().LJIJ(this);
            return;
        }
        EventBus.LIZJ().LJIILJJIL(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJFF(MutableLiveData mutableLiveData) {
        o.LJIIIZ(mutableLiveData, "<this>");
        Integer num = (Integer) mutableLiveData.getValue();
        if (num != null) {
            mutableLiveData.setValue(Integer.valueOf(num.intValue() + 1));
        }
    }
}
