package X;

import com.ss.android.ugc.aweme.following.model.FollowerItemList;
import com.ss.android.ugc.aweme.following.repository.FollowRelationApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.RetrofitService;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TCK extends R30<TCI, List<? extends User>, TCI, FollowerItemList> {
    public final FollowRelationApi LIZJ;

    public TCK() {
        FollowRelationApi.LIZ.getClass();
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(com.ss.android.ugc.aweme.app.api.Api.LIZ).create(FollowRelationApi.class);
        o.LJIIIIZZ(create, "get().getService(IRetrof…wRelationApi::class.java)");
        this.LIZJ = (FollowRelationApi) create;
    }

    @Override // X.InterfaceC68907R2p
    public final Object LJFF(Object req) {
        o.LJIIIZ(req, "req");
        return req;
    }

    @Override // X.R30
    public final AbstractC73672Svk<FollowerItemList> LJII(TCI tci) {
        TCI req = tci;
        o.LJIIIZ(req, "req");
        return this.LIZJ.queryFollowerList(req.LIZ, req.LIZIZ, req.LIZJ, req.LIZLLL, req.LJ, req.LJFF, req.LJI, req.LJII, req.LJIIIIZZ).LJJL(T16.LIZ());
    }

    @Override // X.InterfaceC68907R2p
    public final Object LJI(Object req, Object obj) {
        FollowerItemList resp = (FollowerItemList) obj;
        o.LJIIIZ(req, "req");
        o.LJIIIZ(resp, "resp");
        return resp.items;
    }
}
