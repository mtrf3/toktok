package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4ZR, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4ZR extends TBS implements InterfaceC88472Yns<String, List<? extends C86023Ze>> {
    public C4ZR(C4ZS c4zs) {
        super(1, c4zs, C4ZS.class, "queryByKeyword", "queryByKeyword(Ljava/lang/String;)Ljava/util/List;", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final List<? extends C86023Ze> invoke(String str) {
        InterfaceC63132Oq8 interfaceC63132Oq8;
        String p0 = str;
        o.LJIIIZ(p0, "p0");
        this.receiver.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SELECT docid FROM im_search_index_official WHERE ");
        YE1.LIZLLL(LIZ, C4ZT.LJLILLLLZI.LJLIL, " MATCH '", p0, "';");
        String LIZIZ = X1D.LIZIZ(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("queryByKeyword => ");
        LIZ2.append(LIZIZ);
        InterfaceC63132Oq8 interfaceC63132Oq82 = null;
        C63322OtC.LJI("IMSearchDao", X1D.LIZIZ(LIZ2), null);
        ArrayList arrayList = new ArrayList();
        try {
            interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(LIZIZ, null);
        } catch (Throwable th) {
            th = th;
        }
        try {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("queryByKeyword result count ");
            LIZ3.append(interfaceC63132Oq8.getCount());
            C63322OtC.LJI("IMSearchDao", X1D.LIZIZ(LIZ3), null);
            while (interfaceC63132Oq8.moveToNext()) {
                long j = interfaceC63132Oq8.getLong(0);
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("docid ");
                LIZ4.append(j);
                C63322OtC.LIZIZ("IMSearchDao", X1D.LIZIZ(LIZ4));
                C4ZS.LIZ.getClass();
                C86023Ze LIZ5 = C4ZS.LIZ(j, p0);
                if (LIZ5 != null) {
                    arrayList.add(LIZ5);
                }
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th2) {
            th = th2;
            interfaceC63132Oq82 = interfaceC63132Oq8;
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
            interfaceC63132Oq8 = interfaceC63132Oq82;
            C63143OqJ.LIZ(interfaceC63132Oq8);
            return arrayList;
        }
        C63143OqJ.LIZ(interfaceC63132Oq8);
        return arrayList;
    }
}
