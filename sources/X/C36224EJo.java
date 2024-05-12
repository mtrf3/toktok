package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.ug.appsflyer.IAppsflyerAttributionApi;
import kotlin.jvm.internal.o;

/* renamed from: X.EJo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36224EJo<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ String LIZ = "xiaomiglobal_int";
    public final /* synthetic */ String LIZIZ = "Appvault";
    public final /* synthetic */ String LIZJ = "CPI";
    public final /* synthetic */ String LIZLLL = "1d";

    @Override // X.C10I
    public final Object then(C10K c10k) {
        C65087PgZ LIZ = RetrofitFactory.LIZLLL().LIZ("https://app.appsflyer.com");
        LIZ.LIZJ = true;
        IAppsflyerAttributionApi iAppsflyerAttributionApi = (IAppsflyerAttributionApi) LIZ.LJFF().LIZ.LIZ(IAppsflyerAttributionApi.class);
        String packageName = EF7.LIZIZ().getPackageName();
        o.LJIIIIZZ(packageName, "getApplicationContext().packageName");
        String str = this.LIZ;
        String str2 = this.LIZIZ;
        String str3 = this.LIZJ;
        String str4 = this.LIZLLL;
        Object LJIIJJI = c10k.LJIIJJI();
        o.LJIIIIZZ(LJIIJJI, "task.result");
        iAppsflyerAttributionApi.reportAppsflyerClick(packageName, str, str2, str3, str4, (String) LJIIJJI).LJJL(T16.LIZ()).LJJJ(T16.LIZ()).LIZ(new C36225EJp(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL));
        return C76800UCe.LIZ;
    }
}
