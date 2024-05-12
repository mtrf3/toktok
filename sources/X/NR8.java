package X;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/* loaded from: classes11.dex */
public final class NR8 {
    public final C67996QmO LIZ;
    public final WebView LIZIZ;
    public final List<NSD> LIZJ;
    public final java.util.Map<String, NSD> LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final NRL LJII;

    public NR8(C67996QmO c67996QmO, String str, List list, String str2, NRL nrl) {
        ArrayList arrayList = new ArrayList();
        this.LIZJ = arrayList;
        this.LIZLLL = new HashMap();
        this.LIZ = c67996QmO;
        this.LIZIZ = null;
        this.LJ = str;
        this.LJII = nrl;
        if (list != null) {
            arrayList.addAll(list);
            for (Object obj : list) {
                ((HashMap) this.LIZLLL).put(UUID.randomUUID().toString(), obj);
            }
        }
        this.LJI = str2;
        this.LJFF = null;
    }

    public static NR8 LIZ(C67996QmO c67996QmO, String str, List list, String str2) {
        C38891fp.LJFF(str, "OM SDK JS script content is null");
        C38891fp.LJFF(list, "VerificationScriptResources is null");
        return new NR8(c67996QmO, str, list, str2, NRL.NATIVE);
    }
}
