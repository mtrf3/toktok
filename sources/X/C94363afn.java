package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.afn, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94363afn extends F9E {
    public final List<C94212adM> LJLIL;
    public final EnumC93697aV3 LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public C94363afn(List<C94212adM> normalizedTransformRectList, EnumC93697aV3 shape) {
        o.LJIIIZ(normalizedTransformRectList, "normalizedTransformRectList");
        o.LJIIIZ(shape, "shape");
        this.LJLIL = normalizedTransformRectList;
        this.LJLILLLLZI = shape;
    }
}
