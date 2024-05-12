package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9bV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C240059bV extends F9E {
    public final List<Aweme> LJLIL;
    public final boolean LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C240059bV(List<? extends Aweme> list, boolean z) {
        o.LJIIIZ(list, "list");
        this.LJLIL = list;
        this.LJLILLLLZI = z;
    }
}
