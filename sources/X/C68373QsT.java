package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.QsT, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68373QsT extends AbstractC68364QsK {
    public final /* synthetic */ C77633UdR LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68373QsT(C77633UdR c77633UdR) {
        super("getValue");
        this.LJLJI = c77633UdR;
    }

    @Override // X.AbstractC68364QsK
    public final InterfaceC68379QsZ LIZ(C68377QsX c68377QsX, List list) {
        String str;
        C68368QsO.LJII(2, "getValue", list);
        InterfaceC68379QsZ LIZIZ = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 0));
        InterfaceC68379QsZ LIZIZ2 = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1));
        String LJII = LIZIZ.LJII();
        C77633UdR c77633UdR = this.LJLJI;
        java.util.Map map = (java.util.Map) ((C68244QqO) c77633UdR.LIZIZ).LIZLLL.getOrDefault(c77633UdR.LIZ, null);
        if (map == null || !map.containsKey(LJII) || (str = (String) map.get(LJII)) == null) {
            return LIZIZ2;
        }
        return new C68376QsW(str);
    }
}
