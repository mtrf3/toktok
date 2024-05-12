package X;

import Y.ACListenerS30S0100000_10;
import Y.ARunnableS46S0100000_10;
import android.view.ViewGroup;
import com.bytedance.ies.ugc.aweme.commercialize.search.ISearchAdEventLogger;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.N6n, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58817N6n extends N6Q<C58852N7w> {
    public final int LJLJJLL;
    public final int LJLJL;
    public boolean LJLJLJ;
    public IVideoPlayTaskManager LJLJLLL;
    public InterfaceC58799N5v LJLL;
    public long LJLLI;
    public boolean LJLLILLLL;

    @Override // X.N6Q, X.JK9
    public final void onViewAttachedToWindow() {
    }

    @Override // X.N6Q
    /* renamed from: LJ, reason: merged with bridge method [inline-methods] */
    public final C58852N7w LIZ() {
        ViewGroup viewGroup;
        int i = N6W.LIZ[this.LJLIL.LIZJ.ordinal()];
        if (i != 1) {
            if (i != 2 || (viewGroup = this.LJLIL.LIZIZ) == null) {
                return null;
            }
            return (C58852N7w) viewGroup.findViewById(R.id.i0x);
        }
        ViewGroup viewGroup2 = this.LJLIL.LIZ;
        if (viewGroup2 == null) {
            return null;
        }
        return (C58852N7w) viewGroup2.findViewById(R.id.hek);
    }

    public final void LJFF() {
        IVideoPlayTaskManager iVideoPlayTaskManager = this.LJLJLLL;
        if (iVideoPlayTaskManager != null) {
            N68 n68 = new N68("transformBtnChangeColor");
            n68.LIZIZ(this.LJLLI);
            n68.LIZJ = this.LJLJL;
            n68.LIZLLL = new ARunnableS46S0100000_10(this, 215);
            n68.LJ = false;
            iVideoPlayTaskManager.LJLJLJ(n68.LIZ());
        }
    }

    public final void LJI() {
        IVideoPlayTaskManager iVideoPlayTaskManager = this.LJLJLLL;
        if (iVideoPlayTaskManager != null) {
            N68 n68 = new N68("transformBtnShow");
            n68.LIZIZ(this.LJLLI);
            n68.LIZJ = this.LJLJJLL;
            n68.LIZLLL = new ARunnableS46S0100000_10(this, 216);
            n68.LJ = false;
            iVideoPlayTaskManager.LJLJLJ(n68.LIZ());
        }
    }

    public final void LIZLLL() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cta change color hasChangeColor=");
        LIZ.append(this.LJLJLJ);
        N8M.LIZ(X1D.LIZIZ(LIZ));
        if (this.LJLJLJ) {
            return;
        }
        C58852N7w LIZ2 = LIZ();
        if (LIZ2 != null) {
            LIZ2.LIZJ();
        }
        this.LJLIL.LJFF.LJLILLLLZI = 3;
        this.LJLJLJ = true;
    }

    public final void LJII() {
        int i;
        C58852N7w LIZ = LIZ();
        if (LIZ != null) {
            LIZ.LJI();
            LIZ.LJII(N6J.LIZ(this.LJLIL.LIZLLL));
        }
        if (!this.LJLLILLLL) {
            ISearchAdEventLogger iSearchAdEventLogger = this.LJLIL.LJ;
            C58777N4z.LIZ.getClass();
            iSearchAdEventLogger.LJIILIIL(C58777N4z.LIZLLL);
            this.LJLLILLLL = true;
        }
        C58809N6f c58809N6f = this.LJLIL;
        N4S n4s = c58809N6f.LJFF;
        if (c58809N6f.LIZJ == N6V.PRECISE_AD) {
            i = 3;
        } else {
            i = 2;
        }
        n4s.LJLILLLLZI = i;
    }

    @Override // X.N6Q, X.JK9
    public final void LLLLZI() {
        C58852N7w LIZ = LIZ();
        if (LIZ != null) {
            LIZ.LIZIZ(this.LJLILLLLZI, new ACListenerS30S0100000_10(this, 211));
        }
        N6K n6k = this.LJLIL.LIZLLL;
        if (n6k != null) {
            n6k.LIZLLL(N6F.ENTER_DETAIL, new AqS160S0100000_10(this, 621));
        }
        N6K n6k2 = this.LJLIL.LIZLLL;
        if (n6k2 != null) {
            n6k2.LIZLLL(N6F.RETURN_FROM_DETAIL, new AqS160S0100000_10(this, 622));
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("bind SearchAdButtonComponent componentView = ");
        LIZ2.append(LIZ());
        N8M.LIZ(X1D.LIZIZ(LIZ2));
        C58852N7w LIZ3 = LIZ();
        if (LIZ3 != null) {
            C78897Uxp.LJJJJJL(LIZ3, 0.0f);
        }
    }

    @Override // X.N6Q, X.JK9
    public final void onViewDetachedFromWindow() {
        C58852N7w LIZ = LIZ();
        if (LIZ != null) {
            LIZ.LIZLLL();
        }
        C58852N7w LIZ2 = LIZ();
        if (LIZ2 != null) {
            LIZ2.LJ(LIZ2.LJLLI, 0);
        }
        this.LJLJLJ = false;
        this.LJLLILLLL = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58817N6n(C58809N6f param) {
        super(param);
        float f;
        o.LJIIIZ(param, "param");
        AwemeSearchAdModel awemeSearchAdModel = this.LJLJI;
        if (awemeSearchAdModel != null) {
            f = awemeSearchAdModel.getShowButtonSeconds();
        } else {
            f = 0.0f;
        }
        this.LJLJJLL = (int) (f * 1000.0f);
        AwemeSearchAdModel awemeSearchAdModel2 = this.LJLJI;
        this.LJLJL = (int) ((awemeSearchAdModel2 != null ? awemeSearchAdModel2.getButtonColorShowSeconds() : 0.0f) * 1000.0f);
        this.LJLLI = -1L;
    }

    @Override // X.N6Q
    public final void LIZIZ(C58798N5u c58798N5u) {
        N6J.LIZIZ(c58798N5u, this.LJLJJL, C51029K0z.LJJIIZI(new OSZ(N65.LIZ, new AqS157S0200000_10(this, c58798N5u, 52))));
    }

    @Override // X.N6Q
    public final boolean LIZJ(C58809N6f param) {
        o.LJIIIZ(param, "param");
        Aweme aweme = this.LJLILLLLZI;
        if (aweme != null && O5Y.LJJIJIIJIL(aweme) && !O5Y.LJJIJ(this.LJLILLLLZI)) {
            return true;
        }
        return false;
    }
}
