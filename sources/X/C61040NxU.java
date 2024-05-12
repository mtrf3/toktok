package X;

import android.net.Uri;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.NxU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61040NxU extends AbstractC61044NxY {
    public final android.net.Uri LJLILLLLZI;
    public final String LJLJI;

    public C61040NxU() {
        throw null;
    }

    @Override // X.InterfaceC61049Nxd
    public final JSONObject getFormatData() {
        JSONObject jSONObject = new JSONObject();
        StringBuilder LIZ = X1D.LIZ();
        jSONObject.put(JBR.LJFF(LIZ, this.LJLJI, "host", LIZ), new Uri.Builder().scheme(this.LJLILLLLZI.getScheme()).authority(this.LJLILLLLZI.getAuthority()).build());
        StringBuilder LIZ2 = X1D.LIZ();
        jSONObject.put(JBR.LJFF(LIZ2, this.LJLJI, "path", LIZ2), this.LJLILLLLZI.getPath());
        StringBuilder LIZ3 = X1D.LIZ();
        jSONObject.put(JBR.LJFF(LIZ3, this.LJLJI, "url", LIZ3), new Uri.Builder().scheme(this.LJLILLLLZI.getScheme()).authority(this.LJLILLLLZI.getAuthority()).path(this.LJLILLLLZI.getPath()).build());
        C78983UzD.LJJLIIIJLLLLLLLZ(jSONObject, LIZ());
        return jSONObject;
    }

    @Override // X.InterfaceC61050Nxe
    public final String getUrl() {
        String uri = new Uri.Builder().scheme(this.LJLILLLLZI.getScheme()).authority(this.LJLILLLLZI.getAuthority()).path(this.LJLILLLLZI.getPath()).build().toString();
        o.LJIIIIZZ(uri, "Builder()\n            .s…      .build().toString()");
        return uri;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C61040NxU(android.net.Uri r2, java.lang.String r3, java.util.Map r4, int r5) {
        /*
            r1 = this;
            r0 = r5 & 2
            if (r0 == 0) goto L6
            java.lang.String r3 = ""
        L6:
            r0 = r5 & 4
            if (r0 == 0) goto Lb
            r4 = 0
        Lb:
            java.lang.String r0 = "uri"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            r1.<init>(r4)
            r1.LJLILLLLZI = r2
            r1.LJLJI = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61040NxU.<init>(android.net.Uri, java.lang.String, java.util.Map, int):void");
    }
}
