package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.TOd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74563TOd<KEY, INFO> implements InterfaceC74566TOg<KEY, INFO> {
    public final List<InterfaceC74566TOg<KEY, INFO>> LIZ = new ArrayList();

    @Override // X.InterfaceC74566TOg
    public final void LIZ(Long l, Object obj, Object obj2) {
        Iterator<InterfaceC74566TOg<KEY, INFO>> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZ(l, obj, obj2);
        }
    }

    @Override // X.InterfaceC74566TOg
    public final void LIZIZ(int i, int i2, KEY key) {
        Iterator<InterfaceC74566TOg<KEY, INFO>> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(i, i2, key);
        }
    }

    @Override // X.InterfaceC74566TOg
    public final void LIZJ(KEY key, Long l, Exception exc, INFO info) {
        Iterator<InterfaceC74566TOg<KEY, INFO>> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZJ(key, l, exc, info);
        }
    }
}
