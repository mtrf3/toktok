package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JL8 extends F9E {
    public final Aweme LJLIL;
    public int LJLILLLLZI;
    public final List<String> LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), this.LJLJI};
    }

    public JL8(Aweme aweme) {
        ArrayList arrayList = new ArrayList();
        o.LJIIIZ(aweme, "aweme");
        this.LJLIL = aweme;
        this.LJLILLLLZI = 0;
        this.LJLJI = arrayList;
    }
}
