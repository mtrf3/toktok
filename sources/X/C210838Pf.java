package X;

import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.8Pf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210838Pf {
    public InterfaceC210978Pt LIZ;
    public ViewGroup LIZIZ;
    public final ConcurrentHashMap<String, C8PV> LIZJ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, String> LIZLLL = new ConcurrentHashMap<>();
    public final MutableLiveData<CopyOnWriteArrayList<PriorityProtocol>> LJ;

    public C210838Pf() {
        MutableLiveData<CopyOnWriteArrayList<PriorityProtocol>> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(new CopyOnWriteArrayList<>());
        this.LJ = mutableLiveData;
    }

    public final java.util.Map<String, java.util.Map<String, PriorityProtocol>> LIZ(EnumC210828Pe convertType) {
        o.LJIIIZ(convertType, "convertType");
        ConcurrentHashMap<String, C8PV> concurrentHashMap = this.LIZJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C51029K0z.LJJIIZ(concurrentHashMap.size()));
        for (Map.Entry<String, C8PV> entry : concurrentHashMap.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue().LJIIIZ(convertType));
        }
        return C113554cx.LJJLIIIJLLLLLLLZ(linkedHashMap);
    }
}
