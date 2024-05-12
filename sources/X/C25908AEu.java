package X;

import com.ss.android.ugc.aweme.featureeffectvideo.repo.FeatureVideoApi;
import com.ss.android.ugc.aweme.services.RetrofitService;
import kotlin.jvm.internal.o;

/* renamed from: X.AEu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25908AEu {
    public static final FeatureVideoApi LIZ;

    static {
        FeatureVideoApi.LIZ.getClass();
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(EFJ.LIZJ).create(FeatureVideoApi.class);
        o.LJIIIIZZ(create, "get().getService(IRetrof…tureVideoApi::class.java)");
        LIZ = (FeatureVideoApi) create;
    }
}
