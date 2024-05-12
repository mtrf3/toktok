package X;

import com.ss.android.ugc.aweme.following.model.FollowingItemList;
import com.ss.android.ugc.aweme.notificationlive.repository.SettingFollowingListApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.RetrofitService;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TCD extends R30<TCE, List<? extends User>, TCE, FollowingItemList> {
    public final SettingFollowingListApi LIZJ;

    public TCD() {
        SettingFollowingListApi.LIZ.getClass();
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(com.ss.android.ugc.aweme.app.api.Api.LIZ).create(SettingFollowingListApi.class);
        o.LJIIIIZZ(create, "get().getService(IRetrof…owingListApi::class.java)");
        this.LIZJ = (SettingFollowingListApi) create;
    }

    @Override // X.InterfaceC68907R2p
    public final Object LJFF(Object req) {
        o.LJIIIZ(req, "req");
        return req;
    }

    @Override // X.R30
    public final AbstractC73672Svk<FollowingItemList> LJII(TCE tce) {
        TCE req = tce;
        o.LJIIIZ(req, "req");
        return this.LIZJ.queryFollowingList(req.LJLIL, req.LJLILLLLZI, req.LJLJJI, req.LJLJJL, req.LJLJJLL).LJJL(T16.LIZ());
    }

    @Override // X.InterfaceC68907R2p
    public final Object LJI(Object req, Object obj) {
        FollowingItemList resp = (FollowingItemList) obj;
        o.LJIIIZ(req, "req");
        o.LJIIIZ(resp, "resp");
        return resp.items;
    }
}
