package X;

import com.bytedance.android.livesdk.chatroom.banner.panel.BannerPanelFragment;
import com.bytedance.android.livesdk.chatroom.banner.panel.model.BannerPanelItem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class CAZ extends C0CJ {
    public final /* synthetic */ BannerPanelFragment LJLIL;

    public CAZ(BannerPanelFragment bannerPanelFragment) {
        this.LJLIL = bannerPanelFragment;
    }

    @Override // X.C0CJ
    public final void LIZJ(int i) {
        BannerPanelItem bannerPanelItem;
        String str;
        List<BannerPanelItem> list = this.LJLIL.LLF;
        if (list == null || (bannerPanelItem = (BannerPanelItem) ListProtector.get(list, i)) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bannerId", bannerPanelItem.bannerId);
        C1JD.LJJIJL("live_banner_panel_tab_scrolled", jSONObject, 4);
        BZI LIZ = C28787BRn.LIZ("livesdk_banner_detail_enter");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(this.LJLIL.LLD, "enter_banner_id");
        LIZ.LJIJJ(bannerPanelItem.bannerId, "banner_id");
        LIZ.LJIJJ("live_take_detail", "banner_page");
        if (o.LJ(this.LJLIL.LLD, bannerPanelItem.bannerId)) {
            str = "default";
        } else {
            str = "click_tab";
        }
        C78895Uxn.LIZIZ(LIZ, str, "banner_enter_method", i, "banner_detail_position");
        LIZ.LJIJJ(bannerPanelItem.activityId, "activity_id");
        LIZ.LJIJJ(bannerPanelItem.bannerType, "banner_type");
        UFE.LIZIZ(this.LJLIL.LLFF ? 1 : 0, LIZ, "is_anchor");
    }
}
