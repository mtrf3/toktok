package X;

import Y.ACListenerS32S0100000_12;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class THW extends C65314PkE implements InterfaceC135635Tz {
    public final C82622Wbi LJLILLLLZI;

    @Override // X.C65314PkE, X.TGN
    public final int LJ() {
        return R.layout.bja;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLILLLLZI;
    }

    public THW(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLILLLLZI = diContainer;
    }

    @Override // X.C65314PkE, X.TGN
    public final C80700Vlo LIZ(ViewGroup content) {
        View findViewById;
        o.LJIIIZ(content, "content");
        View findViewById2 = content.findViewById(R.id.ejb);
        if (findViewById2 != null) {
            C16880lQ.LJIIJ(new ACListenerS32S0100000_12(this, 126), findViewById2);
        }
        if (L2N.LIZIZ() && (findViewById = content.findViewById(R.id.ejc)) != null) {
            C26338AVi.LJI(findViewById, null, null, Integer.valueOf(C17N.LJIILL(14.0d)), null, false, 27);
        }
        return super.LIZ(content);
    }
}
