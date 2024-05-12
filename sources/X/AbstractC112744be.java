package X;

import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import java.util.LinkedHashMap;

/* renamed from: X.4be, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC112744be extends AbstractC029609s implements C7ZQ {
    public final java.util.Map<String, LiveData<ActivityStatus>> LJLIL = new LinkedHashMap();
    public final java.util.Map<String, ActivityStatus> LJLILLLLZI = new LinkedHashMap();

    @Override // X.C7ZQ
    public final java.util.Map<String, ActivityStatus> LIZ() {
        return this.LJLILLLLZI;
    }

    @Override // X.C7ZQ
    public final java.util.Map<String, LiveData<ActivityStatus>> LIZIZ() {
        return this.LJLIL;
    }
}
