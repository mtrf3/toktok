package X;

import com.bytedance.android.livesdk.envelope.model.RedEnvelopeMessage4FE;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BSI {
    public final String LIZ;
    public final List<RedEnvelopeMessage4FE> LIZIZ;
    public final boolean LIZJ;

    public BSI(String dataFrom, List<RedEnvelopeMessage4FE> envelopList, boolean z) {
        o.LJIIIZ(dataFrom, "dataFrom");
        o.LJIIIZ(envelopList, "envelopList");
        this.LIZ = dataFrom;
        this.LIZIZ = envelopList;
        this.LIZJ = z;
    }
}
