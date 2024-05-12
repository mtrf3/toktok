package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.twitter.sdk.android.core.Session;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import okhttp3.Request;

/* renamed from: X.PYj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64637PYj implements InterfaceC48121Iub {
    public final Session<? extends TwitterAuthToken> LIZ;
    public final TwitterAuthConfig LIZIZ;

    @Override // X.InterfaceC48121Iub
    public final C64598PWw intercept(PXZ pxz) {
        PW8 pw8 = (PW8) pxz;
        Request request = pw8.LJFF;
        C64618PXq newBuilder = request.newBuilder();
        C64626PXy url = request.url();
        C64627PXz LJIIJ = url.LJIIJ();
        LJIIJ.LJI = null;
        List<String> list = url.LJI;
        if (list != null) {
            int size = list.size() / 2;
            for (int i = 0; i < size; i++) {
                List<String> list2 = url.LJI;
                if (list2 != null) {
                    int i2 = i * 2;
                    String LJIJ = C78999UzT.LJIJ((String) ListProtector.get(list2, i2));
                    List<String> list3 = url.LJI;
                    if (list3 != null) {
                        LJIIJ.LIZ(LJIJ, C78999UzT.LJIJ((String) ListProtector.get(list3, i2 + 1)));
                    } else {
                        throw new IndexOutOfBoundsException();
                    }
                } else {
                    throw new IndexOutOfBoundsException();
                }
            }
        }
        newBuilder.LJIIIIZZ(LJIIJ.LIZJ());
        Request LIZIZ = newBuilder.LIZIZ();
        C64618PXq newBuilder2 = LIZIZ.newBuilder();
        TwitterAuthConfig twitterAuthConfig = this.LIZIZ;
        TwitterAuthToken twitterAuthToken = (TwitterAuthToken) this.LIZ.authToken;
        String method = LIZIZ.method();
        String str = LIZIZ.url().LJIIIIZZ;
        HashMap hashMap = new HashMap();
        if ("POST".equals(LIZIZ.method().toUpperCase(Locale.US))) {
            PVP body = LIZIZ.body();
            if (body instanceof C64550PVa) {
                C64550PVa c64550PVa = (C64550PVa) body;
                for (int i3 = 0; i3 < c64550PVa.LIZ.size(); i3++) {
                    String LJFF = c64550PVa.LJFF(i3);
                    String str2 = (String) ListProtector.get(c64550PVa.LIZIZ, i3);
                    hashMap.put(LJFF, C64626PXy.LJIIL(0, str2.length(), str2, true));
                }
            }
        }
        newBuilder2.LIZJ.LJ("Authorization", C65314PkE.LJFF(twitterAuthConfig, twitterAuthToken, null, method, str, hashMap));
        return pw8.LIZ(newBuilder2.LIZIZ());
    }

    public C64637PYj(Session<? extends TwitterAuthToken> session, TwitterAuthConfig twitterAuthConfig) {
        this.LIZ = session;
        this.LIZIZ = twitterAuthConfig;
    }
}
