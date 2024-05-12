package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.QsF, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68359QsF extends AbstractC68364QsK {
    public final C68284Qr2 LJLJI;

    public C68359QsF(C68284Qr2 c68284Qr2) {
        super("internal.eventLogger");
        this.LJLJI = c68284Qr2;
    }

    @Override // X.AbstractC68364QsK
    public final InterfaceC68379QsZ LIZ(C68377QsX c68377QsX, List list) {
        java.util.Map hashMap;
        C68368QsO.LJII(3, this.LJLIL, list);
        String LJII = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 0)).LJII();
        long LIZ = (long) C68368QsO.LIZ(c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1)).LJI().doubleValue());
        InterfaceC68379QsZ LIZIZ = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 2));
        if (LIZIZ instanceof C68363QsJ) {
            hashMap = C68368QsO.LJI((C68363QsJ) LIZIZ);
        } else {
            hashMap = new HashMap();
        }
        ((ArrayList) this.LJLJI.LIZJ).add(new C68276Qqu(LIZ, LJII, hashMap));
        return InterfaceC68379QsZ.LJIIJ;
    }
}
