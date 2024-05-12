package X;

import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.util.HashMap;

/* renamed from: X.QPj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66951QPj extends HashMap<String, String> {
    public final /* synthetic */ IHostAppContext LJLIL;

    public C66951QPj(IHostAppContext iHostAppContext) {
        String str;
        this.LJLIL = iHostAppContext;
        if (C66952QPk.LIZ) {
            C66953QPl c66953QPl = C66953QPl.LJZL;
            if (C66953QPl.LLD) {
                str = c66953QPl.LJLJJI;
            } else {
                str = c66953QPl.LJZI.LIZIZ("X-Tt-Token");
            }
        } else {
            str = null;
        }
        put("X-Tt-Token", str);
        put("sdk-version", C30443Bx9.LIZ());
        if (iHostAppContext.isBoe()) {
            put("x-use-boe", "1");
            put("x-tt-env", iHostAppContext.getBoeLane());
        } else {
            if (!iHostAppContext.isPpe()) {
                return;
            }
            put("x-use-ppe", "1");
            put("x-tt-env", iHostAppContext.getPpeLane());
        }
    }
}
