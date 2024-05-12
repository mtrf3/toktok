package X;

import com.bytedance.android.livesdkapi.depend.model.live.match.PreviewPeriod;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UD4 extends F9E {
    public final List<PreviewPeriod> LJLIL;
    public final long LJLILLLLZI;
    public final long LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Long.valueOf(this.LJLILLLLZI), Long.valueOf(this.LJLJI)};
    }

    public /* synthetic */ UD4() {
        this(new ArrayList(), 0L, 0L);
    }

    public UD4(List<PreviewPeriod> previewPeriod, long j, long j2) {
        o.LJIIIZ(previewPeriod, "previewPeriod");
        this.LJLIL = previewPeriod;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
    }
}
