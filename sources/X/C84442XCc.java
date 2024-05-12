package X;

import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.net.ConvertOidToUrlResponse;
import com.ss.ugc.effectplatform.model.net.ResourceUrl;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.XCc, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84442XCc implements XDR<ConvertOidToUrlResponse> {
    public final /* synthetic */ InterfaceC84451XCl LIZ;
    public final /* synthetic */ java.util.Map LIZIZ;

    @Override // X.XDR
    public final void onSuccess(ConvertOidToUrlResponse convertOidToUrlResponse) {
        List<ResourceUrl> url_list;
        ConvertOidToUrlResponse convertOidToUrlResponse2 = convertOidToUrlResponse;
        if (convertOidToUrlResponse2 != null && (url_list = convertOidToUrlResponse2.getUrl_list()) != null) {
            for (ResourceUrl resourceUrl : url_list) {
                Effect effect = (Effect) this.LIZIZ.get(resourceUrl.getOid());
                if (effect != null) {
                    effect.getIcon_url().setUrl_list(ORY.LJJIJLIJ(new String[]{resourceUrl.getMain_url(), resourceUrl.getBackup_url()}));
                }
            }
        }
        this.LIZ.onSuccess();
    }

    @Override // X.XDR
    public final /* bridge */ /* synthetic */ void preProcess(ConvertOidToUrlResponse convertOidToUrlResponse) {
    }

    public C84442XCc(InterfaceC84451XCl interfaceC84451XCl, java.util.Map map) {
        this.LIZ = interfaceC84451XCl;
        this.LIZIZ = map;
    }

    @Override // X.XDR
    public final void onFail(ConvertOidToUrlResponse convertOidToUrlResponse, C84418XBe exception) {
        o.LJIIJ(exception, "exception");
        this.LIZ.LIZ(exception);
    }
}
