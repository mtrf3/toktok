package X;

import Y.ACListenerS30S0100000_10;
import android.view.ViewGroup;
import com.bytedance.ies.ugc.aweme.commercialize.search.ISearchAdEventLogger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.N6k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58814N6k extends N6Q<C58852N7w> {
    public final C58852N7w LJLJJLL;

    @Override // X.N6Q, X.JK9
    public final void LLLLZI() {
        C58852N7w c58852N7w = this.LJLJJLL;
        if (c58852N7w != null) {
            c58852N7w.LIZIZ(this.LJLILLLLZI, new ACListenerS30S0100000_10(this, 97));
            c58852N7w.setVisibility(0);
            c58852N7w.LIZJ();
            C26338AVi.LJI(c58852N7w, 0, 0, Integer.valueOf((int) C78886Uxe.LJIIZILJ(8)), 0, false, 16);
        }
        N6K n6k = this.LJLIL.LIZLLL;
        if (n6k != null) {
            n6k.LIZ(N6I.L((N6I) n6k.LIZIZ().getValue(), false, 0, false, 3, 95));
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("bind SearchAdOutsideButtonComponent componentView = ");
        LIZ.append(this.LJLJJLL);
        N8M.LIZ(X1D.LIZIZ(LIZ));
    }

    @Override // X.N6Q, X.JK9
    public final void onViewAttachedToWindow() {
        ISearchAdEventLogger iSearchAdEventLogger = this.LJLIL.LJ;
        C58777N4z.LIZ.getClass();
        iSearchAdEventLogger.LJIILIIL(C58777N4z.LIZLLL);
    }

    @Override // X.N6Q
    public final /* bridge */ /* synthetic */ C58852N7w LIZ() {
        return this.LJLJJLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58814N6k(C58809N6f param) {
        super(param);
        C58852N7w c58852N7w;
        o.LJIIIZ(param, "param");
        ViewGroup viewGroup = param.LIZIZ;
        if (viewGroup != null) {
            c58852N7w = (C58852N7w) viewGroup.findViewById(R.id.i0x);
        } else {
            c58852N7w = null;
        }
        this.LJLJJLL = c58852N7w;
    }

    @Override // X.N6Q
    public final boolean LIZJ(C58809N6f param) {
        o.LJIIIZ(param, "param");
        Aweme aweme = this.LJLILLLLZI;
        if (aweme != null) {
            return O5Y.LJJJI(aweme);
        }
        return false;
    }
}
