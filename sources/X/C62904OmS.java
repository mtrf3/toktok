package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.compliance.business.fbv.FBVApi;
import kotlin.jvm.internal.o;

/* renamed from: X.OmS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62904OmS {
    public final FBVApi LIZ;

    public C62904OmS() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String API_URL_PREFIX_SI = EFJ.LIZJ;
        o.LJIIIIZZ(API_URL_PREFIX_SI, "API_URL_PREFIX_SI");
        C65087PgZ LIZ = LIZLLL.LIZ(API_URL_PREFIX_SI);
        LIZ.LIZ(C65238Pj0.LJFF());
        this.LIZ = (FBVApi) LIZ.LJFF().LIZ.LIZ(FBVApi.class);
    }
}
