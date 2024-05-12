package X;

import com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel;
import com.ss.android.ugc.aweme.openauthorize.entity.ScanCommonResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OTZ implements InterfaceC61960OTk {
    public final /* synthetic */ AuthCommonViewModel LIZ;

    public OTZ(AuthCommonViewModel authCommonViewModel) {
        this.LIZ = authCommonViewModel;
    }

    @Override // X.InterfaceC61960OTk
    public final void LIZ(ScanCommonResponse response) {
        o.LJIIIZ(response, "response");
        this.LIZ.LJLLLLLL.postValue(response);
    }
}
