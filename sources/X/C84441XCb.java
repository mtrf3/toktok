package X;

import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.net.ConvertOidToUrlResponse;
import com.ss.ugc.effectplatform.model.net.ResourceUrl;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.XCb, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84441XCb implements XDR<ConvertOidToUrlResponse> {
    public final /* synthetic */ XCU LIZ;
    public final /* synthetic */ XDR LIZIZ;
    public final /* synthetic */ List LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ XEU LJ;

    @Override // X.XDR
    public final void onSuccess(ConvertOidToUrlResponse convertOidToUrlResponse) {
        List<ResourceUrl> url_list;
        ConvertOidToUrlResponse convertOidToUrlResponse2 = convertOidToUrlResponse;
        if (convertOidToUrlResponse2 != null && (url_list = convertOidToUrlResponse2.getUrl_list()) != null) {
            for (ResourceUrl resourceUrl : url_list) {
                for (Effect effect : this.LIZJ) {
                    if (o.LJ(effect.getFile_url().getUri(), resourceUrl.getOid())) {
                        effect.getFile_url().setUrl_list(ORY.LJJIJLIJ(new String[]{resourceUrl.getMain_url(), resourceUrl.getBackup_url()}));
                    }
                }
            }
        }
        XDR xdr = this.LIZIZ;
        if (xdr != null) {
            this.LIZ.LIZJ.LJJJ.LIZIZ(this.LIZLLL, xdr);
        }
        XCX xcx = this.LIZ.LIZJ.LJJIIJ;
        if (xcx != null) {
            xcx.LIZ(new XCW(this.LIZ.LIZJ, this.LIZJ, this.LIZLLL, this.LJ));
        }
    }

    @Override // X.XDR
    public final /* bridge */ /* synthetic */ void preProcess(ConvertOidToUrlResponse convertOidToUrlResponse) {
    }

    @Override // X.XDR
    public final void onFail(ConvertOidToUrlResponse convertOidToUrlResponse, C84418XBe exception) {
        o.LJIIJ(exception, "exception");
        XDR xdr = this.LIZIZ;
        if (xdr != null) {
            xdr.onFail(this.LIZJ, exception);
        }
    }

    public C84441XCb(XCU xcu, XDR xdr, List list, String str, XEU xeu) {
        this.LIZ = xcu;
        this.LIZIZ = xdr;
        this.LIZJ = list;
        this.LIZLLL = str;
        this.LJ = xeu;
    }
}
