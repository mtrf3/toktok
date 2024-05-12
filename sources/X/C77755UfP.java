package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.UfP, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77755UfP implements InterfaceC77774Ufi {
    public static final C77755UfP LJLIL = new C77755UfP();

    @Override // X.InterfaceC77774Ufi
    public final void onEventV3(String str, JSONObject params) {
        o.LJIIIIZZ(params, "params");
        HashMap hashMap = new HashMap();
        Iterator<String> keys = params.keys();
        o.LJIIIIZZ(keys, "params.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, JSONObjectProtectorUtils.getString(params, next));
        }
        BZI LIZIZ = C28787BRn.LIZIZ(str);
        LIZIZ.LJJIFFI(hashMap);
        LIZIZ.LJJIIJZLJL();
    }
}
