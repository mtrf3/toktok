package X;

import com.ss.android.ugc.aweme.ui.feed.FeedPhotoSlideAssem;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.80z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2045380z extends AbstractC65781Prl implements InterfaceC88471Ynr<FeedPhotoSlideAssem, Boolean, C76800UCe> {
    public static final C2045380z LJLIL = new C2045380z();

    public C2045380z() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FeedPhotoSlideAssem feedPhotoSlideAssem, Boolean bool) {
        FeedPhotoSlideAssem selectSubscribe = feedPhotoSlideAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (booleanValue) {
            C82L c82l = selectSubscribe.LLIILZL;
            if (c82l != null) {
                Iterator it = ((ArrayList) c82l.LJLLI).iterator();
                while (it.hasNext()) {
                    ((C82N) it.next()).LJIIIZ();
                }
            }
        } else {
            C82L c82l2 = selectSubscribe.LLIILZL;
            if (c82l2 != null) {
                Iterator it2 = ((ArrayList) c82l2.LJLLI).iterator();
                while (it2.hasNext()) {
                    C82N c82n = (C82N) it2.next();
                    c82n.LIZLLL.removeCallbacks(c82n.LJIILLIIL);
                }
                c82l2.LJLLL = null;
                c82l2.LJLLLL = 0;
            }
        }
        return C76800UCe.LIZ;
    }
}
