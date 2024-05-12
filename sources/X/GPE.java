package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GPE extends F9E {
    public final CreativeInfo LJLIL;
    public final boolean LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI)};
    }

    public GPE(CreativeInfo creativeInfo, boolean z) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        this.LJLIL = creativeInfo;
        this.LJLILLLLZI = z;
    }
}
