package X;

import android.os.Handler;
import java.util.LinkedHashMap;

/* renamed from: X.YjQ, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88196YjQ extends AbstractC65781Prl implements InterfaceC65784Pro<CHL> {
    public static final C88196YjQ LJLIL = new C88196YjQ();

    public C88196YjQ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final CHL invoke() {
        CHK chk;
        Handler LIZIZ = C88207Yjb.LIZIZ();
        C5H3 c5h3 = (C5H3) ((LinkedHashMap) C88207Yjb.LJ).get("match_color_eggs_reward_start");
        if (c5h3 != null && (chk = (CHK) c5h3.getValue()) != null) {
            chk.LIZLLL = true;
        } else {
            chk = null;
        }
        return new CHL(LIZIZ, chk);
    }
}