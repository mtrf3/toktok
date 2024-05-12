package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.nows.service.NowCommonFeedServiceImpl;
import com.ss.android.ugc.aweme.service.INowCommonFeedService;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8YL, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8YL implements INowCommonFeedService {
    public static final C8YL LIZIZ = new C8YL();
    public final /* synthetic */ INowCommonFeedService LIZ;

    @Override // com.ss.android.ugc.aweme.service.INowCommonFeedService
    public final List<Object> LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.INowCommonFeedService
    public final java.util.Map LIZIZ(Fragment fragment, AbstractC55082Lja adapter, String str) {
        o.LJIIIZ(adapter, "adapter");
        o.LJIIIZ(fragment, "fragment");
        return this.LIZ.LIZIZ(fragment, adapter, str);
    }

    public C8YL() {
        INowCommonFeedService iNowCommonFeedService;
        Object LIZ = C58096Mr6.LIZ(INowCommonFeedService.class, false);
        if (LIZ != null) {
            iNowCommonFeedService = (INowCommonFeedService) LIZ;
        } else {
            if (C58096Mr6.y3 == null) {
                synchronized (INowCommonFeedService.class) {
                    if (C58096Mr6.y3 == null) {
                        C58096Mr6.y3 = new NowCommonFeedServiceImpl();
                    }
                }
            }
            iNowCommonFeedService = C58096Mr6.y3;
        }
        this.LIZ = iNowCommonFeedService;
    }
}
