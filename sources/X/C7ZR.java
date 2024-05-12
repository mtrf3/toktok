package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import kotlin.jvm.internal.o;

/* renamed from: X.7ZR, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7ZR {
    public static LiveData<ActivityStatus> LIZ(final C7ZQ c7zq, final String str, final Observer<ActivityStatus> observer) {
        LiveData<ActivityStatus> remove = c7zq.LIZIZ().remove(str);
        if (remove != null) {
            remove.removeObservers(c7zq.getLifecycleOwner());
        }
        LiveData<ActivityStatus> LIZ = C3B3.LIZ(IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel(), str, C3BA.OTHERS, null, 10);
        final ActivityStatus activityStatus = c7zq.LIZ().get(str);
        LIZ.observe(c7zq.getLifecycleOwner(), new Observer() { // from class: X.7ZS
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                if (o.LJ(obj, ActivityStatus.this)) {
                    return;
                }
                c7zq.LIZ().put(str, obj);
                observer.onChanged(obj);
            }
        });
        c7zq.LIZIZ().put(str, LIZ);
        return LIZ;
    }
}
