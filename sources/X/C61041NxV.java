package X;

import android.net.Uri;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.NxV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61041NxV extends AbstractC61044NxY {
    public final C61040NxU LJLILLLLZI;
    public C61040NxU LJLJI;

    @Override // X.InterfaceC61049Nxd
    public final JSONObject getFormatData() {
        JSONObject jSONObject = new JSONObject();
        C78983UzD.LJJLIIIJLLLLLLLZ(jSONObject, this.LJLJI.getFormatData());
        C78983UzD.LJJLIIIJLLLLLLLZ(jSONObject, this.LJLILLLLZI.getFormatData());
        C78983UzD.LJJLIIIJLLLLLLLZ(jSONObject, LIZ());
        return jSONObject;
    }

    @Override // X.InterfaceC61050Nxe
    public final String getUrl() {
        String uri = new Uri.Builder().scheme(this.LJLILLLLZI.LJLILLLLZI.getScheme()).authority(this.LJLILLLLZI.LJLILLLLZI.getAuthority()).path(this.LJLILLLLZI.LJLILLLLZI.getPath()).build().toString();
        o.LJIIIIZZ(uri, "Builder()\n            .s…      .build().toString()");
        return uri;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C61041NxV(android.net.Uri referrerUri, android.net.Uri pageUri, java.util.Map<String, String> map) {
        super(map);
        o.LJIIIZ(referrerUri, "referrerUri");
        o.LJIIIZ(pageUri, "pageUri");
        this.LJLILLLLZI = new C61040NxU(referrerUri, "referrer_", null, 4);
        this.LJLJI = new C61040NxU(pageUri, "page_", null, 4);
    }
}
