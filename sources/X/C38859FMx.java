package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.main.ActivityResourceOptApiImpl;
import com.ss.android.ugc.aweme.performanceopt.api.ActivityResourceOptApi;
import kotlin.jvm.internal.o;

/* renamed from: X.FMx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38859FMx implements ActivityResourceOptApi {
    public static final C38859FMx LIZIZ = new C38859FMx();
    public final /* synthetic */ ActivityResourceOptApi LIZ;

    @Override // com.ss.android.ugc.aweme.performanceopt.api.ActivityResourceOptApi
    public final InterfaceC55373LoH LIZ(Activity activity) {
        o.LJIIIZ(activity, "activity");
        return this.LIZ.LIZ(activity);
    }

    public C38859FMx() {
        ActivityResourceOptApi activityResourceOptApi;
        Object LIZ = C58096Mr6.LIZ(ActivityResourceOptApi.class, false);
        if (LIZ != null) {
            activityResourceOptApi = (ActivityResourceOptApi) LIZ;
        } else {
            if (C58096Mr6.A2 == null) {
                synchronized (ActivityResourceOptApi.class) {
                    if (C58096Mr6.A2 == null) {
                        C58096Mr6.A2 = new ActivityResourceOptApiImpl();
                    }
                }
            }
            activityResourceOptApi = C58096Mr6.A2;
        }
        this.LIZ = activityResourceOptApi;
    }
}
