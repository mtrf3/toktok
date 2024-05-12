package X;

import defpackage.i0;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;

/* renamed from: X.Ems, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37450Ems implements InterfaceC37464En6 {
    public final java.util.Map<String, String> LIZ;
    public final String LIZIZ;

    @Override // X.InterfaceC37464En6
    public final String LJI() {
        return "UTF-8";
    }

    @Override // X.InterfaceC37464En6
    public final int LJII() {
        return 200;
    }

    @Override // X.InterfaceC37464En6
    public final String LJIIIIZZ() {
        return "OK";
    }

    @Override // X.InterfaceC37464En6
    public final String getMimeType() {
        return "text/html";
    }

    @Override // X.InterfaceC37464En6
    public final InputStream getData() {
        return new ByteArrayInputStream(this.LIZIZ.getBytes());
    }

    @Override // X.InterfaceC37464En6
    public final java.util.Map<String, String> LJFF() {
        return this.LIZ;
    }

    @Override // X.InterfaceC37464En6
    public final EnumC37644Eq0 LJIIIZ() {
        return EnumC37644Eq0.Online;
    }

    public C37450Ems(java.util.Map<String, String> map, String str) {
        boolean z;
        if (map != null) {
            this.LIZ = new HashMap(map);
        } else {
            this.LIZ = new HashMap();
        }
        if (str.lastIndexOf("</body>") != -1) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = str.lastIndexOf("</html>") != -1;
        if (!z) {
            if (!z2) {
                this.LIZIZ = i0.LJFF(str, "</body></html>");
                return;
            }
        } else if (!z2) {
            this.LIZIZ = i0.LJFF(str, "</html>");
            return;
        }
        this.LIZIZ = str;
    }
}
