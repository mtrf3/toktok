package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.TreeMap;

/* renamed from: X.QsE, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68358QsE extends AbstractC68364QsK {
    public final C68341Qrx LJLJI;

    public C68358QsE(C68341Qrx c68341Qrx) {
        super("internal.registerCallback");
        this.LJLJI = c68341Qrx;
    }

    @Override // X.AbstractC68364QsK
    public final InterfaceC68379QsZ LIZ(C68377QsX c68377QsX, List list) {
        int i;
        TreeMap treeMap;
        C68368QsO.LJII(3, this.LJLIL, list);
        c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 0)).LJII();
        InterfaceC68379QsZ LIZIZ = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1));
        if (LIZIZ instanceof C68378QsY) {
            InterfaceC68379QsZ LIZIZ2 = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 2));
            if (LIZIZ2 instanceof C68363QsJ) {
                C68363QsJ c68363QsJ = (C68363QsJ) LIZIZ2;
                if (c68363QsJ.LJFF("type")) {
                    String LJII = c68363QsJ.LJIIIZ("type").LJII();
                    if (c68363QsJ.LJFF("priority")) {
                        i = C68368QsO.LIZIZ(c68363QsJ.LJIIIZ("priority").LJI().doubleValue());
                    } else {
                        i = 1000;
                    }
                    C68341Qrx c68341Qrx = this.LJLJI;
                    c68341Qrx.getClass();
                    if ("create".equals(LJII)) {
                        treeMap = c68341Qrx.LIZIZ;
                    } else if ("edit".equals(LJII)) {
                        treeMap = c68341Qrx.LIZ;
                    } else {
                        throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(LJII)));
                    }
                    if (treeMap.containsKey(Integer.valueOf(i))) {
                        i = ((Integer) treeMap.lastKey()).intValue() + 1;
                    }
                    treeMap.put(Integer.valueOf(i), LIZIZ);
                    return InterfaceC68379QsZ.LJIIJ;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
