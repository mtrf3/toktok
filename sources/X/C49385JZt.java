package X;

import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.search.HighlightInfo;
import java.util.List;

/* renamed from: X.JZt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49385JZt implements InterfaceC49388JZw {
    public final /* synthetic */ C49383JZr LIZ;

    @Override // X.InterfaceC49388JZw
    public final List<HighlightInfo> LIZ() {
        Challenge challenge = this.LIZ.LJLJLLL;
        if (challenge != null) {
            return challenge.getHighlightInfoList();
        }
        return null;
    }

    public C49385JZt(C49383JZr c49383JZr) {
        this.LIZ = c49383JZr;
    }

    @Override // X.InterfaceC49388JZw
    public final List<Object> LIZIZ(String str, String str2, Position position) {
        if ("search_cha_name".equals(str2)) {
            return new C49386JZu(this);
        }
        return null;
    }
}
