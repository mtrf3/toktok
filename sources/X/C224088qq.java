package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8qq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C224088qq extends AbstractC65781Prl implements InterfaceC88472Yns<Intent, String> {
    public static final C224088qq INSTANCE = new C224088qq();

    public C224088qq() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(Intent intent) {
        InterfaceC224118qt interfaceC224118qt;
        List<Aweme> awemeList;
        Aweme aweme;
        o.LJIIIZ(intent, "intent");
        Object obj = C55457Lpd.LJLJJLL;
        Aweme aweme2 = null;
        if (obj instanceof InterfaceC224118qt) {
            interfaceC224118qt = (InterfaceC224118qt) obj;
        } else {
            interfaceC224118qt = null;
        }
        if (interfaceC224118qt == null || (awemeList = interfaceC224118qt.getAwemeList()) == null) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "id");
        if (LLJJIJIIJIL == null || LLJJIJIIJIL.length() == 0) {
            aweme = (Aweme) ORZ.LJLLLL(awemeList);
        } else {
            Iterator<Aweme> it = awemeList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Aweme next = it.next();
                if (o.LJ(next.getAid(), LLJJIJIIJIL)) {
                    aweme2 = next;
                    break;
                }
            }
            aweme = aweme2;
        }
        if (aweme != null) {
            C224068qo.LIZ(aweme);
        }
        return CardStruct.IStatusCode.DEFAULT;
    }
}
