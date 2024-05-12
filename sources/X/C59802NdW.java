package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.spark.AdSparkContext;
import com.ss.android.ugc.aweme.spark.AdSparkUtils;
import com.ss.android.ugc.aweme.spark.CommonSparkBizWebChromeDelegate;

/* renamed from: X.NdW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59802NdW implements InterfaceC60819Ntv {
    public final /* synthetic */ AdSparkContext LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Bundle LJLJI;
    public final /* synthetic */ NVO LJLJJI;
    public final /* synthetic */ java.util.Map<String, String> LJLJJL;
    public final /* synthetic */ Context LJLJJLL;
    public final /* synthetic */ AdSparkUtils LJLJL;

    @Override // X.M2J
    public final void release() {
    }

    @Override // X.InterfaceC60819Ntv
    public final void LJIL(InterfaceC60710NsA interfaceC60710NsA) {
        String str = "";
        if (interfaceC60710NsA instanceof C60607NqV) {
            AdSparkContext adSparkContext = this.LJLIL;
            String str2 = this.LJLILLLLZI;
            if (str2 != null) {
                str = str2;
            }
            android.net.Uri parse = UriProtector.parse(str);
            Bundle bundle = this.LJLJI;
            NP1 np1 = new NP1();
            C59473NVt.LIZ(parse, bundle, np1);
            adSparkContext.LJII(NP1.class, np1);
            C60607NqV c60607NqV = (C60607NqV) interfaceC60710NsA;
            c60607NqV.LIZJ = new CommonSparkBizWebChromeDelegate(this.LJLJJI);
            c60607NqV.LIZIZ = new NUO(this.LJLJJI);
            if (C35730E0o.LIZ() && !this.LJLJJI.LLFZ) {
                c60607NqV.LJFF(C60786NtO.class, C59811Ndf.LJLIL);
            }
            java.util.Map<String, String> map = this.LJLJJL;
            if (map != null) {
                c60607NqV.LJIIJ = new C59803NdX(map);
                return;
            }
            return;
        }
        if (!(interfaceC60710NsA instanceof C60606NqU)) {
            return;
        }
        if (C52947KqF.LIZ() == 1 || C52947KqF.LIZ() == 3) {
            C60606NqU c60606NqU = (C60606NqU) interfaceC60710NsA;
            c60606NqU.LJI = Integer.valueOf(View.MeasureSpec.makeMeasureSpec(KL2.LJIIJJI(this.LJLJJLL), 1073741824));
            c60606NqU.LJFF = Integer.valueOf(View.MeasureSpec.makeMeasureSpec(0, 0));
            C59815Ndj c59815Ndj = new C59815Ndj();
            c59815Ndj.LIZIZ = Integer.valueOf(EnumC59959Ng3.PART_ON_LAYOUT.id());
            c59815Ndj.LIZ = Boolean.TRUE;
            c60606NqU.LJJIII = c59815Ndj;
        }
        C60606NqU c60606NqU2 = (C60606NqU) interfaceC60710NsA;
        this.LJLJL.getClass();
        c60606NqU2.LJIIL = C59814Ndi.LJLIL;
        AdSparkContext adSparkContext2 = this.LJLIL;
        String str3 = this.LJLILLLLZI;
        if (str3 != null) {
            str = str3;
        }
        android.net.Uri parse2 = UriProtector.parse(str);
        Bundle bundle2 = this.LJLJI;
        NOY noy = new NOY();
        C59473NVt.LIZ(parse2, bundle2, noy);
        adSparkContext2.LJII(NOY.class, noy);
        c60606NqU2.LJI(new C59800NdU(this.LJLJJI.LJLIL));
    }

    public C59802NdW(AdSparkContext adSparkContext, String str, Bundle bundle, NVO nvo, java.util.Map<String, String> map, Context context, AdSparkUtils adSparkUtils) {
        this.LJLIL = adSparkContext;
        this.LJLILLLLZI = str;
        this.LJLJI = bundle;
        this.LJLJJI = nvo;
        this.LJLJJL = map;
        this.LJLJJLL = context;
        this.LJLJL = adSparkUtils;
    }
}
