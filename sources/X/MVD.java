package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notification.utils.ShareFromWebHelper;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class MVD implements InterfaceC56825MRx {
    @Override // X.InterfaceC56825MRx
    public final void LIZ(C56890MUk c56890MUk) {
    }

    @Override // X.InterfaceC56825MRx
    public final void LIZIZ(C56890MUk c56890MUk) {
    }

    @Override // X.InterfaceC56825MRx
    public final boolean LIZJ(C56889MUj c56889MUj) {
        Context context;
        View view = c56889MUj.LIZIZ;
        if (view != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        if (view == null) {
            return true;
        }
        int id = view.getId();
        try {
            GeneralTemplateNotice generalTemplateNotice = c56889MUj.LIZ;
            String str = generalTemplateNotice.schemaUrl;
            JSONObject jSONObject = new JSONObject(new JSONObject(generalTemplateNotice.messageExtra).optString("business_extra"));
            String optString = jSONObject.optString("notice_type");
            if (o.LJ(optString, "share_video_web.success")) {
                o.LJI(str);
                ShareFromWebHelper.LIZIZ(context, str);
            } else if (o.LJ(optString, "share_sound.success")) {
                String clientID = jSONObject.optString("client_key");
                o.LJI(str);
                o.LJIIIIZZ(clientID, "clientID");
                C42409Gkf.LIZ(context, str, id, clientID);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return true;
    }
}
