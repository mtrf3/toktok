package X;

import android.app.Activity;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.BgU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29410BgU implements TXE {
    public final LiveWidget LIZ;

    @Override // X.TXE
    public final boolean LJIIIZ() {
        Activity topActivity = ((IHostAction) CN1.LIZ(IHostAction.class)).getTopActivity();
        if (((C29374Bfu) B83.LIZ().LIZIZ()).isLogin()) {
            return false;
        }
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        C29356Bfc c29356Bfc = new C29356Bfc();
        c29356Bfc.LIZ = C15380j0.LJIILJJIL(R.string.sua);
        c29356Bfc.LIZLLL = "interact";
        c29356Bfc.LIZJ = 0;
        ((C29374Bfu) LIZIZ).LIZLLL(topActivity, new C29377Bfx(c29356Bfc)).LJII(this.LIZ.getAutoUnbindTransformer()).LIZ(new C29355Bfb());
        C74824TYe.LJJIIZ("logout");
        return true;
    }

    public C29410BgU(LiveWidget liveWidget) {
        o.LJIIIZ(liveWidget, "liveWidget");
        this.LIZ = liveWidget;
    }
}
