package X;

import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.7ZP, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C7ZP implements SYX, C7ZQ {
    public final java.util.Map<String, LiveData<ActivityStatus>> LJLIL = new LinkedHashMap();
    public final java.util.Map<String, ActivityStatus> LJLILLLLZI = new LinkedHashMap();

    public final void LIZJ() {
        Iterator it = ((LinkedHashMap) this.LJLIL).values().iterator();
        while (it.hasNext()) {
            ((LiveData) it.next()).removeObservers(getLifecycleOwner());
        }
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // X.C7ZQ
    public final java.util.Map<String, ActivityStatus> LIZ() {
        return this.LJLILLLLZI;
    }

    @Override // X.C7ZQ
    public final java.util.Map<String, LiveData<ActivityStatus>> LIZIZ() {
        return this.LJLIL;
    }
}
