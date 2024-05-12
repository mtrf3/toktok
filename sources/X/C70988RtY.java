package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.RtY, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70988RtY extends AbstractC65781Prl implements InterfaceC88471Ynr<List<? extends String>, List<String>, List<? extends String>> {
    public static final C70988RtY LJLIL = new C70988RtY();

    public C70988RtY() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final List<? extends String> invoke(List<? extends String> self, List<String> list) {
        List<String> list2 = list;
        o.LJIIIZ(self, "self");
        o.LJIIIZ(list2, "list");
        QSQ qsq = new QSQ(3);
        qsq.LIZ("");
        qsq.LJ(list2.toArray(new String[0]));
        qsq.LIZ("");
        return C47261Igj.LJJIJIIJI(qsq.LJIIIZ(new String[qsq.LJFF()]));
    }
}
