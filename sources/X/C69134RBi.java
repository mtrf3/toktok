package X;

import android.util.SparseArray;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.account.login.v2.timer.TimerHolder;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.RBi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69134RBi {
    public static C69135RBj LIZ(ActivityC45651qj activityC45651qj, String timerId, EnumC69116RAq scene) {
        SparseArray<java.util.Map<String, C69135RBj>> value;
        java.util.Map<String, C69135RBj> map;
        o.LJIIIZ(timerId, "timerId");
        o.LJIIIZ(scene, "scene");
        if (activityC45651qj == null || (value = ((TimerHolder) ViewModelProviders.of(activityC45651qj).get(TimerHolder.class)).LJLIL.getValue()) == null || (map = value.get(scene.getValue())) == null) {
            return null;
        }
        return map.get(timerId);
    }

    public static void LIZIZ(ActivityC45651qj activityC45651qj, String timerId, C69135RBj c69135RBj, EnumC69116RAq scene) {
        o.LJIIIZ(timerId, "timerId");
        o.LJIIIZ(scene, "scene");
        if (activityC45651qj == null) {
            return;
        }
        MediatorLiveData<SparseArray<java.util.Map<String, C69135RBj>>> mediatorLiveData = ((TimerHolder) ViewModelProviders.of(activityC45651qj).get(TimerHolder.class)).LJLIL;
        SparseArray<java.util.Map<String, C69135RBj>> value = mediatorLiveData.getValue();
        if (value == null) {
            value = new SparseArray<>();
        }
        java.util.Map<String, C69135RBj> map = value.get(scene.getValue());
        if (map == null) {
            map = new LinkedHashMap<>();
        }
        map.put(timerId, c69135RBj);
        value.put(scene.getValue(), map);
        mediatorLiveData.postValue(value);
    }
}
