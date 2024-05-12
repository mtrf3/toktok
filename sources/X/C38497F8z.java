package X;

import com.bytedance.helios.api.consumer.ApmEvent;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.keva.Keva;
import com.bytedance.pns.scopedid.GetScopedUserIdRequest;
import com.bytedance.pns.scopedid.ScopedUserIdModel;
import com.bytedance.pns.scopedid.ScopedUserIdService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.services.BaseUserService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.F8z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38497F8z {
    public static final C1HQ<String, String> LIZ = new C1HQ<>();
    public static final Keva LIZIZ;
    public static final IRetrofitFactory LIZJ;

    public static void LIZ() {
        String currentUserID;
        String currentUserID2;
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        ScopedUserIdModel scopedUserIdModel = F90.LIZ;
        ScopedUserIdModel scopedUserIdModel2 = (ScopedUserIdModel) LIZLLL.LJIIIIZZ("pns_scoped_user_id_settings", ScopedUserIdModel.class, scopedUserIdModel);
        if (scopedUserIdModel2 != null) {
            scopedUserIdModel = scopedUserIdModel2;
        }
        String valueOf = String.valueOf(scopedUserIdModel.enabled);
        ApmEvent apmEvent = new ApmEvent("scoped_id_monitor");
        apmEvent.LIZ(valueOf, "scoped_userid_sampled");
        C66059PwF.LIZIZ(apmEvent);
        if (!scopedUserIdModel.enabled || scopedUserIdModel.scopedBizIds.isEmpty()) {
            return;
        }
        List<String> list = scopedUserIdModel.scopedBizIds;
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin == null || (currentUserID = createIUserServicebyMonsterPlugin.getCurrentUserID()) == null || currentUserID.length() == 0 || o.LJ(currentUserID, CardStruct.IStatusCode.DEFAULT)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String biz : list) {
            o.LJIIIZ(biz, "biz");
            IUserService createIUserServicebyMonsterPlugin2 = BaseUserService.createIUserServicebyMonsterPlugin(false);
            if (createIUserServicebyMonsterPlugin2 != null && (currentUserID2 = createIUserServicebyMonsterPlugin2.getCurrentUserID()) != null) {
                C1HQ<String, String> c1hq = LIZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(biz);
                LIZ2.append('_');
                LIZ2.append(currentUserID2);
                String orDefault = c1hq.getOrDefault(X1D.LIZIZ(LIZ2), null);
                if (orDefault != null) {
                    C1HQ<String, String> c1hq2 = LIZ;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(biz);
                    LIZ3.append('_');
                    LIZ3.append(currentUserID);
                    c1hq2.put(X1D.LIZIZ(LIZ3), orDefault);
                }
            }
            arrayList.add(biz);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        if (strArr.length == 0) {
            return;
        }
        ((ScopedUserIdService) LIZJ.create("https://api.tiktokv.com").create(ScopedUserIdService.class)).getScopedUserId(new GetScopedUserIdRequest(strArr)).enqueue(new C38495F8x(currentUserID));
    }

    static {
        Keva repo = Keva.getRepo("pns_scoped_user_id");
        o.LJIIIIZZ(repo, "getRepo(\"pns_scoped_user_id\")");
        LIZIZ = repo;
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        o.LJIIIIZZ(LIZLLL, "get().getService(IRetrofitFactory::class.java)");
        LIZJ = LIZLLL;
        for (Map.Entry<String, ?> entry : repo.getAll().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                LIZ.put(key, value);
            }
        }
    }
}
