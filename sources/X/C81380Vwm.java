package X;

import android.util.Base64;
import java.io.ByteArrayInputStream;

/* renamed from: X.Vwm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81380Vwm extends AbstractC81781W7t {
    @Override // X.AbstractC81781W7t
    public final String LJ() {
        return "DataFetchProducer";
    }

    public C81380Vwm(W84 w84) {
        super(C79561VKj.LJLIL, w84);
    }

    @Override // X.AbstractC81781W7t
    public final W8X LIZLLL(W5O w5o) {
        byte[] decode;
        String uri = w5o.LIZIZ.toString();
        C32151Nz.LJI(uri.substring(0, 5).equals("data:"));
        int indexOf = uri.indexOf(44);
        String substring = uri.substring(indexOf + 1, uri.length());
        String substring2 = uri.substring(0, indexOf);
        if (substring2.contains(";")) {
            if (substring2.split(";")[r1.length - 1].equals("base64")) {
                decode = Base64.decode(substring, 0);
                return LIZJ(new ByteArrayInputStream(decode), decode.length);
            }
        }
        decode = android.net.Uri.decode(substring).getBytes();
        return LIZJ(new ByteArrayInputStream(decode), decode.length);
    }
}
