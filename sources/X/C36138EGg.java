package X;

import com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel;
import com.ss.android.ugc.aweme.openauthorize.entity.BCAuthorizationResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.EGg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36138EGg implements InterfaceC36137EGf {
    public final /* synthetic */ AuthCommonViewModel LIZ;

    public C36138EGg(AuthCommonViewModel authCommonViewModel) {
        this.LIZ = authCommonViewModel;
    }

    @Override // X.InterfaceC36137EGf
    public final void LIZ(BCAuthorizationResponse response) {
        o.LJIIIZ(response, "response");
        this.LIZ.LJZL.postValue(response);
    }
}
