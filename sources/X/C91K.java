package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.service.IPaidContentPreviewTagService;
import com.ss.android.ugc.aweme.service.PaidContentPreviewTagServiceImpl;
import kotlin.jvm.internal.AqS170S0100000_4;

/* renamed from: X.91K, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C91K implements IPaidContentPreviewTagService {
    public static final C91K LIZIZ = new C91K();
    public final /* synthetic */ IPaidContentPreviewTagService LIZ;

    @Override // com.ss.android.ugc.aweme.service.IPaidContentPreviewTagService
    public final View LIZ(View view) {
        return this.LIZ.LIZ(view);
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentPreviewTagService
    public final boolean LIZIZ(Aweme aweme) {
        return this.LIZ.LIZIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentPreviewTagService
    public final void LIZJ(Aweme aweme, View view, View view2, AqS170S0100000_4 aqS170S0100000_4) {
        this.LIZ.LIZJ(aweme, view, view2, aqS170S0100000_4);
    }

    public C91K() {
        IPaidContentPreviewTagService iPaidContentPreviewTagService;
        Object LIZ = C58096Mr6.LIZ(IPaidContentPreviewTagService.class, false);
        if (LIZ != null) {
            iPaidContentPreviewTagService = (IPaidContentPreviewTagService) LIZ;
        } else {
            if (C58096Mr6.c5 == null) {
                synchronized (IPaidContentPreviewTagService.class) {
                    if (C58096Mr6.c5 == null) {
                        C58096Mr6.c5 = new PaidContentPreviewTagServiceImpl();
                    }
                }
            }
            iPaidContentPreviewTagService = C58096Mr6.c5;
        }
        this.LIZ = iPaidContentPreviewTagService;
    }
}
