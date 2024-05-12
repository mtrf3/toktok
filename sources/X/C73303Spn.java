package X;

import com.ss.android.ugc.aweme.profile.effect.EffectProfileListApi;
import com.ss.android.ugc.aweme.services.RetrofitService;
import kotlin.jvm.internal.o;

/* renamed from: X.Spn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73303Spn {
    public static final EffectProfileListApi LIZ;

    static {
        EffectProfileListApi.LIZ.getClass();
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(EFJ.LIZJ).create(EffectProfileListApi.class);
        o.LJIIIIZZ(create, "get().getService(IRetrof…ofileListApi::class.java)");
        LIZ = (EffectProfileListApi) create;
    }
}
