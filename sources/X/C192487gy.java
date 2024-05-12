package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.favorites.business.collection.VideoCollectionApi;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.7gy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192487gy implements InterfaceC214228aw<InterfaceC192457gv> {
    public final VideoCollectionApi LIZ;
    public final Keva LIZIZ;
    public final C193277iF LIZJ;

    @Override // X.InterfaceC214228aw
    public final void release() {
    }

    public C192487gy() {
        VideoCollectionApi.LIZ.getClass();
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = com.ss.android.ugc.aweme.app.api.Api.LIZ;
        this.LIZ = (VideoCollectionApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, VideoCollectionApi.class);
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        o.LJIIIIZZ(curUser, "userService().curUser");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoCollection-Keva-");
        LIZ.append(curUser.getUid());
        this.LIZIZ = Keva.getRepo(X1D.LIZIZ(LIZ));
        this.LIZJ = new C193277iF(this);
    }

    @Override // X.InterfaceC214228aw
    public final /* bridge */ /* synthetic */ InterfaceC192457gv getOperator() {
        return this.LIZJ;
    }
}
