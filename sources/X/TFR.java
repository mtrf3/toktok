package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TFR extends TFX {
    public final List<Effect> LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public TFR(List<? extends Effect> result, String searchId, String searchKeyWord) {
        o.LJIIIZ(result, "result");
        o.LJIIIZ(searchId, "searchId");
        o.LJIIIZ(searchKeyWord, "searchKeyWord");
        this.LIZ = result;
        this.LIZIZ = searchId;
        this.LIZJ = searchKeyWord;
    }
}
