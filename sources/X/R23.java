package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R23 implements InterfaceC63991P9n {
    @Override // X.InterfaceC63991P9n
    public final String executeGet(String str) {
        Uri.Builder buildUpon = UriProtector.parse(str).buildUpon();
        buildUpon.appendQueryParameter("user_id", String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
        C65124PhA LIZLLL = C65124PhA.LIZLLL();
        String builder = buildUpon.toString();
        LIZLLL.getClass();
        byte[] bArr = ((C65123Ph9) C65124PhA.LIZ(builder, null)).LIZ().LJ;
        o.LJIIIIZZ(bArr, "getInstance()\n          …                    .body");
        return new String(bArr, PVC.LIZ);
    }

    @Override // X.InterfaceC63991P9n
    public final String LIZ(String str, byte[] bArr) {
        Uri.Builder buildUpon = UriProtector.parse(str).buildUpon();
        buildUpon.appendQueryParameter("user_id", String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
        C65124PhA LIZLLL = C65124PhA.LIZLLL();
        String builder = buildUpon.toString();
        LIZLLL.getClass();
        byte[] bArr2 = ((C65123Ph9) C65124PhA.LJFF(builder, null, "application/json; charset=utf-8", bArr)).LIZ().LJ;
        o.LJIIIIZZ(bArr2, "getInstance()\n          …                    .body");
        return new String(bArr2, PVC.LIZ);
    }
}
