package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MPL extends F9E {
    public final List<MusNotice> LJLIL;
    public final List<MusNotice> LJLILLLLZI;
    public final boolean LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Boolean.valueOf(this.LJLJI)};
    }

    public MPL(List<MusNotice> data, List<MusNotice> list, boolean z) {
        o.LJIIIZ(data, "data");
        this.LJLIL = data;
        this.LJLILLLLZI = list;
        this.LJLJI = z;
    }
}
