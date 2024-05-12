package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.favorites.base.FavoriteTabItemV2;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.7Ta, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC186347Ta {
    public final MutableLiveData<Integer> LJLIL = new MutableLiveData<>(0);

    public abstract FavoriteTabItemV2 LIZ();

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ(MutableLiveData mutableLiveData) {
        o.LJIIIZ(mutableLiveData, "<this>");
        if (((Integer) mutableLiveData.getValue()) != null) {
            mutableLiveData.setValue(Integer.valueOf(r0.intValue() - 1));
        }
    }

    public void LIZJ(Lifecycle.Event event) {
        o.LJIIIZ(event, "event");
        int i = C186357Tb.LIZ[event.ordinal()];
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
    public final void LIZLLL(MutableLiveData mutableLiveData) {
        o.LJIIIZ(mutableLiveData, "<this>");
        Integer num = (Integer) mutableLiveData.getValue();
        if (num != null) {
            mutableLiveData.setValue(Integer.valueOf(num.intValue() + 1));
        }
    }
}
