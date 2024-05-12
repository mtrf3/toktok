package X;

import Y.ARunnableS42S0100000_6;
import android.content.Intent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.AqS188S0100000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.Fys, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40742Fys implements InterfaceC40755Fz5 {
    public final /* synthetic */ C40739Fyp LIZ;

    @Override // X.InterfaceC40755Fz5
    public final ActivityC45651qj LIZ() {
        return this.LIZ.LJLIL;
    }

    @Override // X.InterfaceC40755Fz5
    public final ARunnableS42S0100000_6 LIZJ() {
        return new ARunnableS42S0100000_6(this.LIZ, LiveTryModeCountDownThresholdSetting.DEFAULT);
    }

    @Override // X.InterfaceC40755Fz5
    public final ActivityC45651qj LIZLLL() {
        return this.LIZ.LJLIL;
    }

    @Override // X.InterfaceC40755Fz5
    public final AqS188S0100000_6 LJ() {
        return new AqS188S0100000_6(this.LIZ, 17);
    }

    @Override // X.InterfaceC40755Fz5
    public final C40804Fzs LJFF() {
        Object obj;
        android.net.Uri data;
        Intent intent = this.LIZ.LJLJJL;
        C40769FzJ c40769FzJ = null;
        if (intent == null || (data = intent.getData()) == null || (obj = UriProtector.getQueryParameter(data, "awedp_require_login")) == null) {
            obj = Boolean.FALSE;
        }
        boolean LJ = o.LJ("normal", obj);
        int LIZ = this.LIZ.LJLILLLLZI.LIZ();
        boolean LIZJ = this.LIZ.LJLILLLLZI.LIZJ();
        boolean LIZIZ = this.LIZ.LJLILLLLZI.LIZIZ();
        Intent intent2 = this.LIZ.LJLJJL;
        if (intent2 != null) {
            c40769FzJ = new C40769FzJ(intent2, LJ);
        }
        return new C40804Fzs(LJ, LIZ, LIZJ, LIZIZ, c40769FzJ);
    }

    @Override // X.InterfaceC40755Fz5
    public final void LIZIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("tryRefreshFeed isNUJAffectFeedContent:");
        LIZ.append(this.LIZ.LJLJJLL);
        C40741Fyr.LIZIZ(X1D.LIZIZ(LIZ));
        C38986FRu.LIZ().LJFF = true;
        C2U8.LIZ(new C8JD(true ^ this.LIZ.LJLJJLL));
    }

    public C40742Fys(C40739Fyp c40739Fyp) {
        this.LIZ = c40739Fyp;
    }
}
