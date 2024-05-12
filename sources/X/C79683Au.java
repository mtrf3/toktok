package X;

import Y.AObserverS69S0100000_1;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import kotlin.jvm.internal.o;

/* renamed from: X.3Au, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79683Au {
    public final long LIZ;
    public final LiveData<ActivityStatus> LIZIZ;
    public final InterfaceC88472Yns<ActivityStatus, C76800UCe> LIZJ;
    public final AObserverS69S0100000_1 LIZLLL;

    public C79683Au(long j, LiveData asLiveData, C79573Aj asChangeHandler) {
        o.LJIIIZ(asLiveData, "asLiveData");
        o.LJIIIZ(asChangeHandler, "asChangeHandler");
        this.LIZ = j;
        this.LIZIZ = asLiveData;
        this.LIZJ = asChangeHandler;
        this.LIZLLL = new AObserverS69S0100000_1(this, 1);
    }
}
