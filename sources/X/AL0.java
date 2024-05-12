package X;

import android.content.Context;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.IWebCreationPromoteService;
import com.ss.android.ugc.aweme.web.creation.WebCreationPromoteServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AL0 implements IWebCreationPromoteService {
    public static final AL0 LIZIZ = new AL0();
    public final /* synthetic */ IWebCreationPromoteService LIZ;

    @Override // com.ss.android.ugc.aweme.IWebCreationPromoteService
    public final void LIZ() {
        this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.IWebCreationPromoteService
    public final boolean LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.IWebCreationPromoteService
    public final void LIZJ(ViewGroup parentView, C235769Nc c235769Nc) {
        o.LJIIIZ(parentView, "parentView");
        this.LIZ.LIZJ(parentView, c235769Nc);
    }

    @Override // com.ss.android.ugc.aweme.IWebCreationPromoteService
    public final void LIZLLL(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ.LIZLLL(context);
    }

    public AL0() {
        IWebCreationPromoteService iWebCreationPromoteService;
        Object LIZ = C58096Mr6.LIZ(IWebCreationPromoteService.class, false);
        if (LIZ != null) {
            iWebCreationPromoteService = (IWebCreationPromoteService) LIZ;
        } else {
            if (C58096Mr6.h8 == null) {
                synchronized (IWebCreationPromoteService.class) {
                    if (C58096Mr6.h8 == null) {
                        C58096Mr6.h8 = new WebCreationPromoteServiceImpl();
                    }
                }
            }
            iWebCreationPromoteService = C58096Mr6.h8;
        }
        this.LIZ = iWebCreationPromoteService;
    }
}
