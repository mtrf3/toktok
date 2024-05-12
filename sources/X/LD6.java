package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import okhttp3.Request;

/* loaded from: classes10.dex */
public final /* synthetic */ class LD6 implements InterfaceC64701PaL, InterfaceC54346LUo, InterfaceC53885LCv {
    public final /* synthetic */ Object LJLIL;

    @Override // X.InterfaceC54346LUo
    public final Object execute() {
        LFG lfg = (LFG) this.LJLIL;
        Iterator<AbstractC67354Qc2> it = lfg.LIZIZ.LLZ().iterator();
        while (it.hasNext()) {
            lfg.LIZJ.LIZ(it.next(), 1);
        }
        return null;
    }

    public /* synthetic */ LD6(Object obj) {
        this.LJLIL = obj;
    }

    @Override // X.InterfaceC53885LCv
    public final boolean LIZ(User user) {
        Aweme aweme;
        User user2;
        C53887LCx c53887LCx = (C53887LCx) this.LJLIL;
        c53887LCx.getClass();
        if (C00F.LIZ(31744, 0, "disable_search_live_tag", true) == 1) {
            return false;
        }
        C77413UZt.LJIIZILJ();
        if (user == null) {
            return c53887LCx.LJIIIZ();
        }
        if (c53887LCx.LIZJ == 0) {
            aweme = c53887LCx.LIZ.LJIILJJIL;
        } else {
            aweme = c53887LCx.LIZIZ.LJIIL;
        }
        if (!C63081OpJ.LLIIIJ(aweme)) {
            if (!user.isLive()) {
                return false;
            }
            if (user.isSecret() && !AV1.LJIILL(user)) {
                if (c53887LCx.LIZJ == 0) {
                    user2 = c53887LCx.LIZ.LJI;
                } else {
                    user2 = c53887LCx.LIZIZ.LJIILIIL;
                }
                if (user2 == null || !user2.getUid().equals(user.getUid())) {
                    return false;
                }
            }
            if (!UC0.LJJLI() || user.isBlock()) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC64701PaL
    public final String LIZIZ(String str) {
        Request request = ((C64661PZh) this.LJLIL).LJLJJLL;
        if (request != null) {
            return request.header(str);
        }
        return null;
    }
}
