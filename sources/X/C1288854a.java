package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS103S0101000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.54a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1288854a extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C54Z LJLIL;
    public final /* synthetic */ C5DY LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1288854a(C54Z c54z, C5DY c5dy) {
        super(0);
        this.LJLIL = c54z;
        this.LJLILLLLZI = c5dy;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C54Z c54z = this.LJLIL;
        java.util.Map<NLETrackSlot, java.util.Set<C1290754t>> map = c54z.LIZIZ;
        C5DY c5dy = this.LJLILLLLZI;
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            Object key = entry.getKey();
            Iterator it = ((java.util.Set) entry.getValue()).iterator();
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    C1290754t c1290754t = (C1290754t) next;
                    if (o.LJ(c1290754t.LJLIL, c5dy.LIZ) && c1290754t.LJLILLLLZI == c5dy.LIZIZ) {
                        if (next != null) {
                            int indexOf = c54z.LIZLLL.indexOf(key);
                            C1297357h c1297357h = c54z.LIZ;
                            c1297357h.getClass();
                            C2ND.LIZIZ(new AqS103S0101000_2(indexOf, c1297357h, 1), 0L);
                        }
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
