package X;

import android.net.Uri;
import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.chatroom.banner.panel.model.BannerPanelItem;
import com.bytedance.android.livesdk.chatroom.viewmodule.NewTopRightBannerWidget;
import com.bytedance.android.livesdk.model.BannerInRoom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class CA8 implements InterfaceC28308B9c {
    public final /* synthetic */ CAO LIZ;

    public CA8(CAO cao) {
        this.LIZ = cao;
    }

    @Override // X.InterfaceC28308B9c
    public final void LIZ(View itemView, int i, BannerInRoom banner, List<? extends BannerInRoom> bannerList) {
        String str;
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(banner, "banner");
        o.LJIIIZ(bannerList, "bannerList");
        if (this.LIZ.LJLLILLLL) {
            ArrayList arrayList = new ArrayList();
            for (BannerInRoom bannerInRoom : bannerList) {
                if (bannerInRoom.openWithNavigationTag) {
                    arrayList.add(bannerInRoom);
                }
            }
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                BannerInRoom bannerInRoom2 = (BannerInRoom) it.next();
                String str2 = bannerInRoom2.title;
                o.LJIIIIZZ(str2, "inRoomBanner.title");
                String valueOf = String.valueOf(bannerInRoom2.id);
                String str3 = bannerInRoom2.schemaUrl;
                o.LJIIIIZZ(str3, "inRoomBanner.schemaUrl");
                arrayList2.add(new BannerPanelItem(str2, valueOf, str3));
            }
            CAO cao = this.LIZ;
            if (arrayList2.size() > 1) {
                XKQ xkq = cao.LJLL;
                if (xkq != null) {
                    xkq.LIZIZ(null);
                }
                cao.LJLL = null;
            }
            String valueOf2 = String.valueOf(banner.id);
            Uri.Builder authority = new Uri.Builder().scheme("sslocal").authority("webcast_banner_panel");
            if (valueOf2 != null && valueOf2.length() != 0) {
                authority.appendQueryParameter("banner_id", valueOf2);
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                BannerPanelItem bannerPanelItem = (BannerPanelItem) it2.next();
                BannerPanelItem.Companion.getClass();
                o.LJIIIZ(bannerPanelItem, "<this>");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("title", bannerPanelItem.title);
                jSONObject.put("id", bannerPanelItem.bannerId);
                jSONObject.put("schema_url", bannerPanelItem.schema);
                jSONArray = jSONArray.put(jSONObject.toString());
                o.LJIIIIZZ(jSONArray, "jsonArray.put(item.toJSONObject().toString())");
            }
            android.net.Uri build = authority.appendQueryParameter("banner_list", jSONArray.toString()).build();
            o.LJIIIIZZ(build, "Builder()\n            .s…   )\n            .build()");
            str = build.toString();
        } else {
            str = banner.schemaUrl;
        }
        IActionHandlerService iActionHandlerService = (IActionHandlerService) CN1.LIZ(IActionHandlerService.class);
        if (iActionHandlerService != null) {
            iActionHandlerService.handle(itemView.getContext(), str);
        }
        NewTopRightBannerWidget newTopRightBannerWidget = this.LIZ.LJLJJL;
        if (newTopRightBannerWidget != null) {
            C6J c6j = C6J.LIZ;
            HashMap hashMap = new HashMap(C6J.LIZIZ().LIZIZ());
            hashMap.put("banner_id", Long.valueOf(banner.id));
            C6J.LIZJ(c6j, "banner_click", 0, hashMap);
            BZI LIZ = C28787BRn.LIZ("banner_click");
            C07250Qf.LIZJ(banner.id, LIZ, "banner_id", "campaign_static", "banner_type");
            LIZ.LJIJJ("live_take_detail", "banner_page");
            LIZ.LJIJJ(Integer.valueOf(i + 1), "banner_position");
            LIZ.LJIJJ(0, "is_fe");
            String LJIIJJI = C77413UZt.LJIIJJI(banner);
            if (LJIIJJI == null) {
                LJIIJJI = "";
            }
            LIZ.LJIJJ(LJIIJJI, "activity_id");
            UFE.LIZIZ(newTopRightBannerWidget.LJLJI ? 1 : 0, LIZ, "is_anchor");
        }
    }
}
