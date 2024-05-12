package X;

import com.bytedance.retrofit2.client.Request;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Fgt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39627Fgt implements InterfaceC37216Ej6 {
    public final String LJLIL;

    public C39627Fgt(String str) {
        this.LJLIL = str;
    }

    @Override // X.InterfaceC37216Ej6
    public final C64797Pbt intercept(FBZ fbz) {
        int LJIIZILJ = C1E4.LJIIZILJ();
        F7S f7s = (F7S) fbz;
        Request request = f7s.LIZJ;
        String url = request.getUrl();
        if (url != null && (url.contains("/passport/token/beat/") || url.contains("/passport/token/change/") || url.contains("/passport/user/logout/"))) {
            C64627PXz LJIIJ = C64626PXy.LJIIJJI(request.getUrl()).LJIIJ();
            LJIIJ.LIZIZ("ts", String.valueOf(LJIIZILJ));
            LJIIJ.LIZIZ("app_type", this.LJLIL);
            HashMap hashMap = new HashMap();
            QJY.LJI(hashMap, true);
            for (Map.Entry entry : hashMap.entrySet()) {
                LJIIJ.LIZIZ((String) entry.getKey(), (String) entry.getValue());
            }
            C64908Pdg newBuilder = request.newBuilder();
            newBuilder.LIZJ(LJIIJ.LIZJ().LJIIIIZZ);
            request = newBuilder.LIZ();
        }
        return f7s.LIZ(request);
    }
}
