package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class ICW extends AbstractC39622Fgo {
    public final String LIZIZ;
    public final boolean LIZJ;

    @Override // X.AbstractC39622Fgo
    public final boolean LIZ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC39622Fgo
    public final String LIZIZ() {
        return this.LIZIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ICW(WRQ cameraApiComponent) {
        super(cameraApiComponent);
        o.LJIIIZ(cameraApiComponent, "cameraApiComponent");
        this.LIZIZ = "NICK";
        this.LIZJ = true;
    }

    @Override // X.AbstractC39622Fgo
    public final void LIZJ(int i, String str) {
        UrlModel avatarMedium;
        UrlModel avatarThumb;
        Object obj;
        List<String> urlList;
        List<String> urlList2;
        List<String> urlList3;
        if (!C44172HVg.LJIJ.isLogin()) {
            C5OG.LIZJ(C46220ICa.LJLIL);
            return;
        }
        C44423Hc3 LJ = C73098SmU.LJ();
        if (LJ != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("interface", this.LIZIZ);
            jSONObject.put("status", 0);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("handle", LJ.getUniqueId());
            jSONObject2.put("nickname", LJ.getNickname());
            UrlModel LJIIIIZZ = LJ.LJIIIIZZ();
            if ((LJIIIIZZ == null || (urlList3 = LJIIIIZZ.getUrlList()) == null || (obj = ORZ.LLFII(urlList3)) == null) && (((avatarMedium = LJ.getAvatarMedium()) == null || (urlList2 = avatarMedium.getUrlList()) == null || (obj = ORZ.LLFII(urlList2)) == null) && ((avatarThumb = LJ.getAvatarThumb()) == null || (urlList = avatarThumb.getUrlList()) == null || (obj = ORZ.LLFII(urlList)) == null))) {
                obj = "";
            }
            jSONObject2.put("avatar_path", obj);
            jSONObject.put("body", jSONObject2);
            String jSONObject3 = jSONObject.toString();
            o.LJIIIIZZ(jSONObject3, "jsonObject.toString()");
            LIZLLL(i, jSONObject3);
            return;
        }
        H78.LIZIZ("EffectUserInfoHandler", "handleEffectMessage::currentUser is null");
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("interface", this.LIZIZ);
        jSONObject4.put("status", 1);
        String jSONObject5 = jSONObject4.toString();
        o.LJIIIIZZ(jSONObject5, "jsonObject.toString()");
        LIZLLL(i, jSONObject5);
    }
}
