package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TFS extends TFX {
    public final List<Effect> LIZ;
    public final String LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public TFS(List<? extends Effect> result, String searchId) {
        o.LJIIIZ(result, "result");
        o.LJIIIZ(searchId, "searchId");
        this.LIZ = result;
        this.LIZIZ = searchId;
    }
}
