package X;

import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public abstract class GUX {
    public void onFinish(AbstractC41479GPr result, Object obj, PublishModel publishModel) {
        o.LJIIIZ(result, "result");
    }

    public void onProgress(int i, Object obj) {
    }

    public void onStageUpdate(String stage, AbstractC41758GaA state, Object obj) {
        o.LJIIIZ(stage, "stage");
        o.LJIIIZ(state, "state");
    }
}
