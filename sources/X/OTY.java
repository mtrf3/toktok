package X;

import com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel;
import com.ss.android.ugc.aweme.openauthorize.entity.ScanCommonResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OTY implements InterfaceC61959OTj {
    public final /* synthetic */ AuthCommonViewModel LIZ;

    public OTY(AuthCommonViewModel authCommonViewModel) {
        this.LIZ = authCommonViewModel;
    }

    @Override // X.InterfaceC61959OTj
    public final void LIZ(ScanCommonResponse response) {
        o.LJIIIZ(response, "response");
        this.LIZ.LJLLL.postValue(response);
    }
}
