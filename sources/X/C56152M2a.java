package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.M2a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56152M2a implements InterfaceC19530ph {
    public final /* synthetic */ C56155M2d LIZ;

    public C56152M2a(C56155M2d c56155M2d) {
        this.LIZ = c56155M2d;
    }

    @Override // X.InterfaceC19530ph
    public final void LIZ(View view, String itemID) {
        User author;
        InterfaceC55036Liq LJIILIIL;
        o.LJIIIZ(itemID, "itemID");
        C56155M2d c56155M2d = this.LIZ;
        String str = c56155M2d.LJLJL;
        if (str == null) {
            return;
        }
        Aweme aweme = c56155M2d.LJLJLLL;
        String str2 = null;
        if (aweme != null && (author = aweme.getAuthor()) != null && (LJIILIIL = C55723Ltv.LIZIZ.LJIILIIL()) != null) {
            Aweme aweme2 = this.LIZ.LJLJLLL;
            if (aweme2 != null) {
                str2 = aweme2.getRequestId();
            }
            LJIILIIL.LIZIZ("story_show", str, author, str2);
        }
    }
}
