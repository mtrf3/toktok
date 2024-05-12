package X;

import android.content.Context;
import com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper;
import com.ss.android.ugc.aweme.utils.SchemaPageHelperImpl;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class MVG implements InterfaceC56825MRx {
    @Override // X.InterfaceC56825MRx
    public final void LIZ(C56890MUk c56890MUk) {
    }

    @Override // X.InterfaceC56825MRx
    public final void LIZIZ(C56890MUk c56890MUk) {
    }

    @Override // X.InterfaceC56825MRx
    public final boolean LIZJ(C56889MUj c56889MUj) {
        String l;
        String l2;
        if (c56889MUj.LIZIZ == null) {
            return true;
        }
        EF7.LIZIZ();
        if (C2NU.LIZ.LIZIZ()) {
            int id = c56889MUj.LIZIZ.getId();
            try {
                JSONObject jSONObject = new JSONObject(c56889MUj.LIZ.messageExtra);
                String optString = jSONObject.optString("content_schema");
                String optString2 = jSONObject.optString("schema");
                String optString3 = jSONObject.optString("web_url");
                String str = "";
                if (id != R.id.j2s && id != R.id.eww) {
                    if (!C61200O0e.LIZLLL().LJII(optString)) {
                        Long l3 = c56889MUj.LIZ.nid;
                        if (l3 != null && (l2 = l3.toString()) != null) {
                            str = l2;
                        }
                        if (!LIZLLL(str, optString3)) {
                            C61200O0e.LIZLLL().LJII(optString2);
                        }
                    }
                } else if (!C61200O0e.LIZLLL().LJII(optString2)) {
                    Long l4 = c56889MUj.LIZ.nid;
                    if (l4 != null && (l = l4.toString()) != null) {
                        str = l;
                    }
                    LIZLLL(str, optString3);
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            return true;
        }
        C26045AKb c26045AKb = new C26045AKb(c56889MUj.LIZIZ);
        c26045AKb.LJIIIIZZ(R.string.img);
        c26045AKb.LJIIJ();
        return true;
    }

    public static boolean LIZLLL(String str, String str2) {
        HashMap LIZJ = C03660Ck.LIZJ("notice_id", str);
        LIZJ.put("aid", String.valueOf(MNR.LIZ));
        LIZJ.put("channel", SchemaPageHelperImpl.LJ().getChannel());
        SchemaPageHelper LJ = SchemaPageHelperImpl.LJ();
        Context LIZIZ = EF7.LIZIZ();
        String string = EF7.LIZIZ().getString(R.string.h9c);
        if (string == null) {
            string = "";
        }
        return LJ.LIZLLL(LIZIZ, str2, string, LIZJ);
    }
}
