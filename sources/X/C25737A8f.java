package X;

import android.app.Dialog;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAAnchorServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.A8f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25737A8f extends HSS {
    public boolean LJLJLJ;

    @Override // X.S1E
    public final S1E clone() {
        return new C25737A8f();
    }

    @Override // X.HSS, X.S1E
    public final int type() {
        return EnumC42934Gt8.GET_LEADS.getTYPE();
    }

    @Override // X.HSS, X.S1E
    public final void LJ(C188727au eventMapBuilder) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        super.LJ(eventMapBuilder);
        this.LJLJLJ = true;
        new C237559Tz().LJJIIJ(LJJII().getAuthor(), LJJII(), 1);
    }

    @Override // X.S1E
    public final void LJIIIIZZ(C188727au eventMapBuilder) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            J9P.LIZIZ(LJJI(), "getLeads", "getLeads", null, null);
            new C237559Tz().LJJIFFI(LJJII().getAuthor(), LJJII(), 1, -1);
            return;
        }
        User author = LJJII().getAuthor();
        if (author == null) {
            return;
        }
        new C237559Tz().LJIJ(author, LJJII(), 1);
        BAAnchorServiceImpl.LJII().LJI(LJJI(), author, LJJII(), this.LJLJJL);
    }

    @Override // X.HSS, X.S1E
    public final void LJIJJ(Aweme aweme) {
        this.LJLJLJ = false;
    }

    @Override // X.HSS, X.S1E
    public final void LJIIJ(ViewGroup viewGroup, Dialog dialog, C188727au c188727au, int i) {
        o.LJIIIZ(dialog, "dialog");
        super.LJIIJ(viewGroup, dialog, c188727au, i);
        if (!this.LJLJLJ) {
            new C237559Tz().LJJIIJ(LJJII().getAuthor(), LJJII(), 1);
            this.LJLJLJ = true;
        }
    }
}
