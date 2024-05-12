package X;

import android.database.Cursor;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS66S0400000_6;

/* renamed from: X.Eks, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37326Eks extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends EMX>> {
    public final /* synthetic */ EML LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37326Eks(EML eml) {
        super(0);
        this.LJLIL = eml;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.List<? extends X.EMX>] */
    @Override // X.InterfaceC65784Pro
    public final List<? extends EMX> invoke() {
        C37327Ekt c37327Ekt = this.LJLIL.LIZLLL;
        c37327Ekt.getClass();
        C37330Ekw c37330Ekw = new C37330Ekw();
        Cursor LIZIZ = C37327Ekt.LIZIZ(c37327Ekt.LIZ, c37327Ekt.LIZJ.LIZ(), c37330Ekw);
        if (LIZIZ == null || LIZIZ.getCount() == 0) {
            C73802v2.LIZIZ(200, null, 62);
            if (LIZIZ != null) {
                LIZIZ.close();
            }
            return C61878OQg.INSTANCE;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (LIZIZ.moveToNext()) {
            try {
                String string = LIZIZ.getString(LIZIZ.getColumnIndex("contact_id"));
                if (string != null) {
                    C37324Ekq c37324Ekq = (C37324Ekq) linkedHashMap.get(string);
                    if (c37324Ekq == null) {
                        c37324Ekq = new C37324Ekq(0);
                        linkedHashMap.put(string, c37324Ekq);
                    }
                    c37327Ekt.LIZIZ.LJIIIIZZ(new AqS66S0400000_6(c37327Ekt, LIZIZ, c37324Ekq, c37330Ekw, 1));
                }
            } catch (Exception e) {
                c37327Ekt.LIZIZ.LJ(e);
            }
        }
        LIZIZ.close();
        c37327Ekt.LIZIZ.LJIJJ = linkedHashMap.values().size();
        return c37327Ekt.LIZIZ.LJIIJ(new C37323Ekp(linkedHashMap, c37327Ekt));
    }
}
