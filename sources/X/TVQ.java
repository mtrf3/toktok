package X;

import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class TVQ {
    public final C74890TaI LIZ;

    public TVQ(TVM onInteractClickListener) {
        o.LJIIIZ(onInteractClickListener, "onInteractClickListener");
        this.LIZ = new C74890TaI(onInteractClickListener);
    }

    public final void LIZ(int i) {
        TVS LIZ;
        String str;
        long j;
        Long valueOf;
        InterfaceC30237Btp interfaceC30237Btp = this.LIZ.LJLJJI;
        if (interfaceC30237Btp != null) {
            Boolean bool = null;
            if (i == 0 && !LiveAppBundleUtils.isPluginAvailable(EnumC38440F6u.LINK_MIC) && ((LIZ = TVK.LIZ()) == null || !LIZ.LIZ())) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("not show guest entrance ");
                TVS LIZ3 = TVK.LIZ();
                if (LIZ3 != null) {
                    bool = Boolean.valueOf(LIZ3.LIZ());
                }
                LIZ2.append(bool);
                LIZ2.append(' ');
                TYP.LIZ("ToolbarGameLinkBehavior", X1D.LIZIZ(LIZ2), false);
                JSONObject jSONObject = new JSONObject();
                Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
                if (room == null || !Room.isValid(room) || (str = room.getIdStr()) == null) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                long j2 = 0;
                if (room != null && Room.isValid(room) && (valueOf = Long.valueOf(room.getOwnerUserId())) != null) {
                    j = valueOf.longValue();
                } else {
                    j = 0;
                }
                C05630Jz.LJI(jSONObject, "room_id", str);
                C05630Jz.LJFF(jSONObject, "anchor_id", j);
                C05630Jz.LJI(jSONObject, "live_type", "live_studio");
                InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
                if (LIZIZ != null) {
                    j2 = ((C29374Bfu) LIZIZ).getCurrentUserId();
                }
                C05630Jz.LJFF(jSONObject, "current_user_id", j2);
                C0K2.LJIIIIZZ("ttlive_linkmic_audience_no_show_entrance_with_no_byte_plugin", 0, jSONObject);
                TVT.LJIIIIZZ("link_icon_show_error", "bundle");
                return;
            }
            interfaceC30237Btp.setVisibility(i);
            if (i != 0) {
                return;
            }
            TVT.LJIIIIZZ("link_icon_show", null);
        }
    }
}
