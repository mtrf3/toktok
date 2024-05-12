package X;

import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.aweme.userservice.jedi.model.JediFollowApi;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M8F extends R30<String, Integer, M8G, FollowStatus> {
    public final JediFollowApi LIZJ;

    public M8F() {
        JediFollowApi.LIZ.getClass();
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(MainServiceImpl.createIMainServicebyMonsterPlugin(false).getApiUrlPrefix()).create(JediFollowApi.class);
        o.LJIIIIZZ(create, "get()\n                .g…ediFollowApi::class.java)");
        this.LIZJ = (JediFollowApi) create;
    }

    @Override // X.InterfaceC68907R2p
    public final Object LJFF(Object obj) {
        M8G req = (M8G) obj;
        o.LJIIIZ(req, "req");
        return req.LIZ;
    }

    @Override // X.R30
    public final AbstractC73672Svk<FollowStatus> LJII(M8G m8g) {
        M8G req = m8g;
        o.LJIIIZ(req, "req");
        int i = req.LJ;
        if (i == -1) {
            return this.LIZJ.follow(req.LIZ, req.LIZIZ, req.LIZJ, req.LIZLLL, null, req.LJFF, null, req.LJII, req.LJIIIIZZ, req.LJIIIZ, req.LJIIJ).LJJL(T16.LIZ());
        }
        JediFollowApi jediFollowApi = this.LIZJ;
        String str = req.LIZ;
        String str2 = req.LIZIZ;
        int i2 = req.LIZJ;
        int i3 = req.LIZLLL;
        String str3 = req.LJFF;
        int i4 = req.LJI;
        String str4 = req.LJII;
        String str5 = req.LJIIIZ;
        return jediFollowApi.follow(str, str2, i2, i3, Integer.valueOf(i), str3, Integer.valueOf(i4), str4, req.LJIIIIZZ, str5, req.LJIIJ).LJJL(T16.LIZ());
    }

    @Override // X.InterfaceC68907R2p
    public final Object LJI(Object req, Object obj) {
        FollowStatus resp = (FollowStatus) obj;
        o.LJIIIZ(req, "req");
        o.LJIIIZ(resp, "resp");
        if (resp.status_code == 0) {
            return Integer.valueOf(resp.followStatus);
        }
        return null;
    }
}
