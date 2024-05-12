package X;

import com.google.gson.m;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.2hL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65312hL {
    public static final HashMap<String, C65312hL> LIZJ = new HashMap<>();
    public final Response<m> LIZ;
    public final XKQ LIZIZ;

    public C65312hL(Response response, String key) {
        XKQ xkq;
        o.LJIIIZ(key, "key");
        o.LJIIIZ(response, "response");
        this.LIZ = response;
        this.LIZIZ = XKX.LIZLLL(C780334l.LJLIL, C36636EZk.LIZ, null, new C63092dl(key, null), 2);
        HashMap<String, C65312hL> hashMap = LIZJ;
        C65312hL c65312hL = hashMap.get(key);
        if (c65312hL != null && (xkq = c65312hL.LIZIZ) != null) {
            xkq.LIZIZ(null);
        }
        hashMap.put(key, this);
    }
}
