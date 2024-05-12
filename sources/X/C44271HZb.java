package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.port.in.ExitBackgroundActivityApi;
import com.ss.android.ugc.aweme.services.ExitBackgroundActivityImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.HZb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44271HZb implements ExitBackgroundActivityApi {
    public static final C44271HZb LIZIZ = new C44271HZb();
    public final /* synthetic */ ExitBackgroundActivityApi LIZ = ExitBackgroundActivityImpl.createExitBackgroundActivityApibyMonsterPlugin(false);

    @Override // com.ss.android.ugc.aweme.port.in.ExitBackgroundActivityApi
    public final String activityType(Activity activity) {
        o.LJIIIZ(activity, "activity");
        return this.LIZ.activityType(activity);
    }
}
