package X;

import android.app.Dialog;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizedDeviceActivity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GHU implements InterfaceC41308GJc {
    public final /* synthetic */ AuthorizedDeviceActivity LIZ;

    @Override // X.InterfaceC41308GJc
    public final void LIZIZ() {
        this.LIZ._$_findCachedViewById(R.id.j9c).setVisibility(8);
        this.LIZ.LLFZ();
    }

    @Override // X.InterfaceC41308GJc
    public final void LJII() {
        V1B.LJLJJL((Dialog) this.LIZ.LJLILLLLZI.getValue());
    }

    @Override // X.InterfaceC41308GJc
    public final void LJIJ() {
        V1B.LJLILLLLZI((Dialog) this.LIZ.LJLILLLLZI.getValue());
    }

    @Override // X.InterfaceC41308GJc
    public final String getEnterFrom() {
        String enterFrom = (String) this.LIZ.LJLIL.getValue();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        return enterFrom;
    }

    public GHU(AuthorizedDeviceActivity authorizedDeviceActivity) {
        this.LIZ = authorizedDeviceActivity;
    }

    @Override // X.InterfaceC41308GJc
    public final void LIZ(Integer num, String str) {
        this.LIZ.LLFII(num, str);
    }
}
