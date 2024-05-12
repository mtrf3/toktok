package X;

import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class KMQ extends O6R {
    @Override // X.O6R
    public final void LJJ(String bridgeName, String str, C37945Eur c37945Eur) {
        String str2;
        o.LJIIIZ(bridgeName, "bridgeName");
        OSZ[] oszArr = new OSZ[2];
        oszArr[0] = new OSZ("code", 1);
        OSZ[] oszArr2 = new OSZ[1];
        if (!CommerceMediaServiceImpl.LIZJ().LIZ() && !CommerceMediaServiceImpl.LIZJ().LJIIIZ()) {
            str2 = "";
        } else {
            str2 = "commerce";
        }
        oszArr2[0] = new OSZ(WM7.SCENE_SERVICE, str2);
        oszArr[1] = new OSZ("data", C113554cx.LJJLIIIIJ(oszArr2));
        c37945Eur.LIZ(1, "", new JSONObject(C113554cx.LJJLIIIIJ(oszArr)));
    }
}
