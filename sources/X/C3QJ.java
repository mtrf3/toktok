package X;

import Y.IDComparatorS29S0000000_1;
import com.google.gson.internal.h;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3QJ, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3QJ extends TBS implements InterfaceC88472Yns<List<? extends C3QL>, String> {
    public C3QJ(Object obj) {
        super(1, obj, C3QE.class, "getSearchContentMd5Key", "getSearchContentMd5Key(Ljava/util/List;)Ljava/lang/String;", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(List<? extends C3QL> list) {
        List<? extends C3QL> p0 = list;
        o.LJIIIZ(p0, "p0");
        this.receiver.getClass();
        String LJIIIIZZ = h.LJIIIIZZ(ORZ.LLD(ORZ.LLILII(new IDComparatorS29S0000000_1(17), p0), null, null, null, C3QK.LJLIL, 31));
        o.LJIIIIZZ(LJIIIIZZ, "hexDigest(\n            s…\n            },\n        )");
        return LJIIIIZZ;
    }
}
