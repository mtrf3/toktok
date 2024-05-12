package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public abstract class GQE<METADATA> {
    public final List<METADATA> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public GQE(CharSequence markupText, List<? extends METADATA> metadata) {
        o.LJIIIZ(markupText, "markupText");
        o.LJIIIZ(metadata, "metadata");
        this.LIZ = metadata;
    }
}
