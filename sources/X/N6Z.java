package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N6Z extends N6Q<ViewGroup> {
    public N69 LJLJJLL;

    @Override // X.N6Q
    /* renamed from: LIZLLL, reason: merged with bridge method [inline-methods] */
    public final ViewGroup LIZ() {
        ViewGroup viewGroup = this.LJLIL.LIZ;
        if (viewGroup != null) {
            return (ViewGroup) viewGroup.findViewById(R.id.lm6);
        }
        return null;
    }

    @Override // X.N6Q, X.JK9
    public final void LLLLZI() {
        C58827N6x c58827N6x = C58827N6x.LIZIZ;
        N69 LJIIJ = c58827N6x.LIZ.LJIIJ(new C58804N6a(this));
        LJIIJ.KF(LIZ());
        LJIIJ.LLLLZI();
        this.LJLJJLL = LJIIJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("bind SearchAdAnoleButtonComponent componentView = ");
        LIZ.append(LIZ());
        N8M.LIZ(X1D.LIZIZ(LIZ));
    }

    @Override // X.N6Q, X.JK9
    public final void onViewAttachedToWindow() {
        N69 n69 = this.LJLJJLL;
        if (n69 != null) {
            n69.onViewAttachedToWindow();
        }
    }

    @Override // X.N6Q, X.JK9
    public final void onViewDetachedFromWindow() {
        N69 n69 = this.LJLJJLL;
        if (n69 != null) {
            n69.onViewDetachedFromWindow();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N6Z(C58809N6f param) {
        super(param);
        o.LJIIIZ(param, "param");
    }

    @Override // X.N6Q
    public final void LIZIZ(C58798N5u c58798N5u) {
        N69 n69 = this.LJLJJLL;
        if (n69 != null) {
            n69.Kn(c58798N5u);
        }
    }

    @Override // X.N6Q
    public final boolean LIZJ(C58809N6f param) {
        o.LJIIIZ(param, "param");
        Aweme aweme = this.LJLILLLLZI;
        if (aweme != null && O5Y.LJJIJIIJIL(aweme) && O5Y.LJJIJ(this.LJLILLLLZI)) {
            return true;
        }
        return false;
    }
}
