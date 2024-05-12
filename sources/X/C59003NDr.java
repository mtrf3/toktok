package X;

import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.commerce.IBEInfo;
import java.util.List;

/* renamed from: X.NDr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59003NDr extends AbstractC65781Prl implements InterfaceC65784Pro<SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS> {
    public final /* synthetic */ C58993NDh LJLIL;
    public final /* synthetic */ C58628Mzg LJLILLLLZI;
    public final /* synthetic */ IBEInfo LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ Context LJLJJL;
    public final /* synthetic */ InterfaceC88472Yns<SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, C76800UCe> LJLJJLL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C59003NDr(C58993NDh c58993NDh, C58628Mzg c58628Mzg, IBEInfo iBEInfo, String str, Context context, InterfaceC88472Yns<? super SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.LJLIL = c58993NDh;
        this.LJLILLLLZI = c58628Mzg;
        this.LJLJI = iBEInfo;
        this.LJLJJI = str;
        this.LJLJJL = context;
        this.LJLJJLL = interfaceC88472Yns;
        this.LJLJL = interfaceC65784Pro;
    }

    @Override // X.InterfaceC65784Pro
    public final SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS invoke() {
        C58993NDh c58993NDh = this.LJLIL;
        C58628Mzg c58628Mzg = this.LJLILLLLZI;
        IBEInfo iBEInfo = this.LJLJI;
        String str = this.LJLJJI;
        Context context = this.LJLJJL;
        InterfaceC88472Yns<SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, C76800UCe> interfaceC88472Yns = this.LJLJJLL;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJL;
        c58993NDh.getClass();
        N0X.LIZ.getClass();
        c58628Mzg.LIZIZ(N0X.LIZLLL);
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        SparkContext sparkContext = new SparkContext();
        if (str != null) {
            sparkContext.LJII(AbstractC40201Fq9.class, new C40202FqA(str));
        }
        sparkContext.LJJIJLIJ(iBEInfo.getLynxSchema());
        sparkContext.LJJI(new C58995NDj(c58993NDh));
        c40342FsQ.getClass();
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZ = C40343FsR.LIZ(C40342FsQ.LIZ(context, sparkContext));
        List LIZ2 = C58993NDh.LIZ(iBEInfo.getLynxSchema(), c58993NDh.LIZ);
        synchronized (LIZ2) {
            LIZ2.add(new C58991NDf(LIZ, c58628Mzg, interfaceC88472Yns, interfaceC65784Pro));
        }
        LIZ.LIZIZ();
        return LIZ;
    }
}
