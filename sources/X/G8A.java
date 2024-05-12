package X;

import android.content.Context;
import com.bytedance.router.OnActivityResultCallback;
import com.ss.android.ugc.aweme.internal.AVTagServiceImpl;
import com.ss.android.ugc.aweme.internal.IAVTagService;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class G8A implements IAVTagService {
    public static final G8A LIZIZ = new G8A();
    public final /* synthetic */ IAVTagService LIZ;

    @Override // com.ss.android.ugc.aweme.internal.IAVTagService
    public final void LIZ() {
        this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVTagService
    public final int LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVTagService
    public final boolean LIZJ(boolean z) {
        return this.LIZ.LIZJ(z);
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVTagService
    public final void LIZLLL(Context context, String str, int i, List list, OnActivityResultCallback onActivityResultCallback) {
        o.LJIIIZ(context, "context");
        this.LIZ.LIZLLL(context, str, i, list, onActivityResultCallback);
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVTagService
    public final void LJ(ActivityC45651qj activityC45651qj, InterfaceC65784Pro interfaceC65784Pro) {
        this.LIZ.LJ(activityC45651qj, interfaceC65784Pro);
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVTagService
    public final void LJFF(ActivityC45651qj activityC45651qj, String str, int i, List list, InterfaceC88473Ynt interfaceC88473Ynt) {
        this.LIZ.LJFF(activityC45651qj, str, i, list, interfaceC88473Ynt);
    }

    public G8A() {
        IAVTagService iAVTagService;
        Object LIZ = C58096Mr6.LIZ(IAVTagService.class, false);
        if (LIZ != null) {
            iAVTagService = (IAVTagService) LIZ;
        } else {
            if (C58096Mr6.A1 == null) {
                synchronized (IAVTagService.class) {
                    if (C58096Mr6.A1 == null) {
                        C58096Mr6.A1 = new AVTagServiceImpl();
                    }
                }
            }
            iAVTagService = C58096Mr6.A1;
        }
        this.LIZ = iAVTagService;
    }
}
