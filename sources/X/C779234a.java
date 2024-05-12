package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.34a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C779234a extends F9E {
    public final List<Aweme> LJLIL;
    public final String LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C779234a(List<? extends Aweme> list, String beforeId) {
        o.LJIIIZ(list, "list");
        o.LJIIIZ(beforeId, "beforeId");
        this.LJLIL = list;
        this.LJLILLLLZI = beforeId;
    }
}
