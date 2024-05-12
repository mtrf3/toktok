package com.ss.android.ugc.aweme.nows.api;

import X.C48153Iv7;
import X.C51029K0z;
import X.C64697PaH;
import X.C64797Pbt;
import X.F7S;
import X.FBZ;
import X.InterfaceC37216Ej6;
import X.OSZ;
import com.bytedance.retrofit2.client.Request;
import java.util.Map;

/* loaded from: classes12.dex */
public final class NowTimeoutIntercept implements InterfaceC37216Ej6 {
    public final Map<String, Long> LJLIL = C51029K0z.LJJIIZI(new OSZ("/tiktok/v1/now/feed", 60000L));

    @Override // X.InterfaceC37216Ej6
    public final C64797Pbt<?> intercept(FBZ fbz) {
        C64697PaH c64697PaH;
        F7S f7s = (F7S) fbz;
        Request request = f7s.LIZJ;
        Long l = this.LJLIL.get(request.getPath());
        if (l != null) {
            long longValue = l.longValue();
            Object extraInfo = request.getExtraInfo();
            if (extraInfo == null) {
                extraInfo = new C48153Iv7();
                request.setExtraInfo(extraInfo);
            }
            if ((extraInfo instanceof C64697PaH) && (c64697PaH = (C64697PaH) extraInfo) != null) {
                c64697PaH.LJIIIIZZ = 3 * longValue;
                c64697PaH.LJFF = longValue;
                c64697PaH.LJII = longValue;
                c64697PaH.LJI = longValue;
            }
        }
        return f7s.LIZ(request);
    }
}
