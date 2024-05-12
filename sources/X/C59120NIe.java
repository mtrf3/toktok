package X;

import android.content.Context;
import com.ss.android.ugc.aweme.commercialize.utils.video.VideoPlayTaskManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.NIe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59120NIe implements InterfaceC58748N3w {
    public final Aweme LIZ;
    public final Context LIZIZ;
    public final /* synthetic */ C59316NPs LIZJ;
    public final /* synthetic */ Aweme LIZLLL;

    @Override // X.InterfaceC58748N3w
    public final VideoPlayTaskManager LIZ() {
        return this.LIZJ.LJLLL;
    }

    @Override // X.InterfaceC58748N3w
    public final void LIZJ() {
        NQL LJIILL = NQL.LJIILL();
        Aweme aweme = this.LIZLLL;
        LJIILL.LJIL(this.LIZJ.LJLLL.LIZ(), this.LIZIZ, aweme);
        N7D n7d = this.LIZJ.LLLII;
        if (n7d != null) {
            n7d.yq(EnumC58794N5q.MIDPOINT);
        }
    }

    @Override // X.InterfaceC58748N3w
    public final void LIZLLL() {
        NQL LJIILL = NQL.LJIILL();
        Aweme aweme = this.LIZLLL;
        LJIILL.LJIJJLI(this.LIZJ.LJLLL.LIZ(), this.LIZIZ, aweme);
        N7D n7d = this.LIZJ.LLLII;
        if (n7d != null) {
            n7d.yq(EnumC58794N5q.FIRST_QUARTILE);
        }
    }

    @Override // X.InterfaceC58748N3w
    public final void LJ() {
        NQL LJIILL = NQL.LJIILL();
        Aweme aweme = this.LIZLLL;
        LJIILL.LJJ(this.LIZJ.LJLLL.LIZ(), this.LIZIZ, aweme);
        N7D n7d = this.LIZJ.LLLII;
        if (n7d != null) {
            n7d.yq(EnumC58794N5q.THIRD_QUARTILE);
        }
    }

    @Override // X.InterfaceC58748N3w
    public final Context getContext() {
        return this.LIZIZ;
    }

    public C59120NIe(C59316NPs c59316NPs, Aweme aweme) {
        this.LIZJ = c59316NPs;
        this.LIZLLL = aweme;
        this.LIZ = c59316NPs.LJLJLJ;
        this.LIZIZ = c59316NPs.LJLLI;
    }

    @Override // X.InterfaceC58748N3w
    public final boolean LIZIZ(Context context, Aweme aweme, int i) {
        C59316NPs c59316NPs = this.LIZJ;
        C59133NIr c59133NIr = ((C59132NIq) c59316NPs.LJLJJLL).LIZJ;
        C59123NIh c59123NIh = c59316NPs.LLLLLLLLLL;
        c59133NIr.getClass();
        return NOE.LJJIIJ(context, aweme, i, c59123NIh);
    }
}
