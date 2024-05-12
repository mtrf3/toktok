package X;

import Y.AObserverS73S0100000_5;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BZR {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(ActivityC45651qj activity, DataChannel dataChannel, List list, IIconSlot.SlotViewModel viewModel) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(viewModel, "viewModel");
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                EnumC29188Bcu enumC29188Bcu = (EnumC29188Bcu) it.next();
                java.util.Map<EnumC29188Bcu, MutableLiveData<Object>> map = viewModel.LJLLLLLL;
                o.LJIIIIZZ(map, "viewModel.shareData");
                ((ConcurrentHashMap) map).put(enumC29188Bcu, new MutableLiveData());
                LiveData liveData = (LiveData) ((ConcurrentHashMap) viewModel.LJLLLLLL).get(enumC29188Bcu);
                if (liveData != null && BZS.LIZ[enumC29188Bcu.ordinal()] == 1) {
                    liveData.observe(activity, new AObserverS73S0100000_5(dataChannel, 57));
                }
            }
        }
    }
}
