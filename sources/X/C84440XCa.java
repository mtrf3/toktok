package X;

import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.net.ConvertOidToUrlResponse;
import com.ss.ugc.effectplatform.model.net.ResourceUrl;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.XCa, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84440XCa implements XDR<ConvertOidToUrlResponse> {
    public final /* synthetic */ XCU LIZ;
    public final /* synthetic */ XCP LIZIZ;
    public final /* synthetic */ Effect LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ boolean LJFF;
    public final /* synthetic */ boolean LJI;
    public final /* synthetic */ boolean LJII;

    @Override // X.XDR
    public final void onSuccess(ConvertOidToUrlResponse convertOidToUrlResponse) {
        List<ResourceUrl> url_list;
        ConvertOidToUrlResponse convertOidToUrlResponse2 = convertOidToUrlResponse;
        if (convertOidToUrlResponse2 != null && (url_list = convertOidToUrlResponse2.getUrl_list()) != null) {
            for (ResourceUrl resourceUrl : url_list) {
                if (o.LJ(this.LIZLLL, resourceUrl.getOid())) {
                    this.LIZJ.getFile_url().setUrl_list(ORY.LJJIJLIJ(new String[]{resourceUrl.getMain_url(), resourceUrl.getBackup_url()}));
                }
            }
        }
        XCL xcl = new XCL(this.LIZJ, this.LIZ.LIZJ, this.LJ, null);
        xcl.LJIIIZ = this.LJFF;
        XCU.LIZ(this.LIZ, this.LIZJ, this.LJ, xcl, this.LJI, this.LJII);
    }

    @Override // X.XDR
    public final /* bridge */ /* synthetic */ void preProcess(ConvertOidToUrlResponse convertOidToUrlResponse) {
    }

    @Override // X.XDR
    public final void onFail(ConvertOidToUrlResponse convertOidToUrlResponse, C84418XBe exception) {
        o.LJIIJ(exception, "exception");
        XCP xcp = this.LIZIZ;
        if (xcp != null) {
            xcp.onFail(this.LIZJ, exception);
        }
    }

    public C84440XCa(XCU xcu, XCP xcp, Effect effect, String str, String str2, boolean z, boolean z2, boolean z3) {
        this.LIZ = xcu;
        this.LIZIZ = xcp;
        this.LIZJ = effect;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = z3;
    }
}
