package X;

import com.ss.android.ugc.aweme.relation.auth.model.UnRegisteredContactUser;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EMO {
    public final InterfaceC88472Yns<String, String> LIZ;
    public final java.util.Map<String, EMX> LIZIZ;
    public final C37065Egf LIZJ;

    public EMO(C37065Egf monitor) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        o.LJIIIIZZ(messageDigest, "getInstance(\"SHA-256\")");
        AqS172S0100000_6 aqS172S0100000_6 = new AqS172S0100000_6(messageDigest, 72);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        o.LJIIIZ(monitor, "monitor");
        this.LIZ = aqS172S0100000_6;
        this.LIZIZ = linkedHashMap;
        this.LIZJ = monitor;
    }

    public final List<EMX> LIZ(List<UnRegisteredContactUser> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<UnRegisteredContactUser> it = list.iterator();
        while (it.hasNext()) {
            EMX emx = this.LIZIZ.get(it.next().hashNationalNumber);
            if (emx != null) {
                arrayList.add(emx);
            }
        }
        return arrayList;
    }
}
