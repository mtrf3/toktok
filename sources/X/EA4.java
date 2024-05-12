package X;

import android.net.Uri;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class EA4 extends F9E implements InterfaceC61049Nxd {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final C5H3 LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    public final android.net.Uri L() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-uri>(...)");
        return (android.net.Uri) value;
    }

    @Override // X.InterfaceC61049Nxd
    public final JSONObject getFormatData() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("host", new Uri.Builder().scheme(L().getScheme()).authority(L().getAuthority()).build());
        jSONObject.put("path", L().getPath());
        jSONObject.put("url", new Uri.Builder().scheme(L().getScheme()).authority(L().getAuthority()).path(L().getPath()).build());
        jSONObject.put("method", this.LJLILLLLZI);
        return jSONObject;
    }

    public EA4(String str, String str2, String str3) {
        HH1.LIZ(str, "url", str2, "method", str3, "body");
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = C221108m2.LIZ(EnumC221088m0.NONE, new AqS156S0100000_6(this, 87));
    }
}
