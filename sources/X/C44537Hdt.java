package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IToolsVQEvaluationService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Hdt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C44537Hdt {
    public final VideoPublishEditModel LIZ;
    public final C44549He5 LIZIZ;
    public final C44530Hdm LIZJ;

    public final boolean LIZ() {
        IToolsVQEvaluationService iToolsVQEvaluationService = (IToolsVQEvaluationService) ServiceManager.get().getService(IToolsVQEvaluationService.class);
        if (iToolsVQEvaluationService != null) {
            iToolsVQEvaluationService.LJI();
        }
        if (this.LIZJ.LIZ && C78596Usy.LJJJI(this.LIZ)) {
            return true;
        }
        return false;
    }

    public C44537Hdt(VideoPublishEditModel model, C44549He5 c44549He5, C44530Hdm c44530Hdm) {
        o.LJIIIZ(model, "model");
        this.LIZ = model;
        this.LIZIZ = c44549He5;
        this.LIZJ = c44530Hdm;
    }
}
