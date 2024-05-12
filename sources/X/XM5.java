package X;

import java.util.List;

/* loaded from: classes16.dex */
public final class XM5 extends XM6 {
    @Override // X.XM6
    public final void LIZ(long j, Object obj) {
        ((XM7) C87167YIx.LJIIIZ(j, obj)).LIZ();
    }

    @Override // X.XM6
    public final void LIZIZ(long j, Object obj, Object obj2) {
        XM7 xm7 = (XM7) C87167YIx.LJIIIZ(j, obj);
        List list = (List) C87167YIx.LJIIIZ(j, obj2);
        int size = xm7.size();
        int size2 = list.size();
        if (size > 0) {
            if (size2 > 0) {
                if (!xm7.LIZIZ()) {
                    xm7 = xm7.LJIJI(size2 + size);
                }
                xm7.addAll(list);
            }
            list = xm7;
        }
        C87167YIx.LJIILIIL(j, obj, list);
    }
}
