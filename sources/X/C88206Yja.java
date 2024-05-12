package X;

import android.os.Handler;
import java.util.LinkedHashMap;

/* renamed from: X.Yja, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88206Yja extends AbstractC65781Prl implements InterfaceC65784Pro<CHL> {
    public static final C88206Yja LJLIL = new C88206Yja();

    public C88206Yja() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final CHL invoke() {
        CHK chk;
        Handler LIZIZ = C88207Yjb.LIZIZ();
        C5H3 c5h3 = (C5H3) ((LinkedHashMap) C88207Yjb.LJ).get("watch_period");
        if (c5h3 != null && (chk = (CHK) c5h3.getValue()) != null) {
            chk.LIZLLL = true;
        } else {
            chk = null;
        }
        return new CHL(LIZIZ, chk);
    }
}
