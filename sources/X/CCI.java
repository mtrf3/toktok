package X;

import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CCI extends F9E {
    public final boolean LJLIL;
    public final int LJLILLLLZI;
    public final List<PollOptionInfo> LJLJI;
    public final long LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), this.LJLJI, Long.valueOf(this.LJLJJI)};
    }

    public CCI(int i, long j, List list, boolean z) {
        o.LJIIIZ(list, "list");
        this.LJLIL = z;
        this.LJLILLLLZI = i;
        this.LJLJI = list;
        this.LJLJJI = j;
    }
}
