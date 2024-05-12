package X;

import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HIT implements HXJ {
    public final List<String> LIZ = new ArrayList();

    @Override // X.HXJ
    public final void LIZ(C73343SqR c73343SqR) {
        if (!((ArrayList) this.LIZ).isEmpty()) {
            AVServiceImpl.LIZ().fetchResourcesNeededByRequirements((String[]) ((ArrayList) this.LIZ).toArray(new String[0]), new HJS(c73343SqR));
            return;
        }
        c73343SqR.onSuccess(new String[0]);
    }

    @Override // X.HXJ
    public final void LIZIZ(String[] modelNameArray, FetchResourcesListener fetchResourcesListener) {
        o.LJIIIZ(modelNameArray, "modelNameArray");
        if (modelNameArray.length == 0) {
            if (fetchResourcesListener != null) {
                fetchResourcesListener.onSuccess();
                return;
            }
            return;
        }
        DownloadableModelSupport.getInstance().fetchResourcesWithModelNames(0, modelNameArray, new C43568H8a(fetchResourcesListener));
    }
}
