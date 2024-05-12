package X;

import com.bytedance.android.livesdk.chatroom.banner.panel.BannerPanelFragment;
import com.bytedance.android.livesdk.chatroom.banner.panel.model.BannerPanelItem;
import java.util.List;

/* renamed from: X.CAa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30880CAa implements C0KO {
    public final /* synthetic */ BannerPanelFragment LIZ;

    @Override // X.C0KO
    public final void LIZ() {
    }

    public C30880CAa(BannerPanelFragment bannerPanelFragment) {
        this.LIZ = bannerPanelFragment;
    }

    @Override // X.C0KO
    public final void LIZIZ(int i) {
        BannerPanelItem bannerPanelItem;
        String str;
        String str2;
        if (this.LIZ.LLFII.get(i, false)) {
            return;
        }
        List<BannerPanelItem> list = this.LIZ.LLF;
        String str3 = null;
        if (list != null) {
            bannerPanelItem = (BannerPanelItem) ORZ.LJLLLLLL(i, list);
        } else {
            bannerPanelItem = null;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_banner_detail_tab_show");
        LIZ.LJIIZILJ();
        if (bannerPanelItem != null) {
            str3 = bannerPanelItem.bannerId;
        }
        LIZ.LJIJJ(str3, "banner_id");
        C78895Uxn.LIZIZ(LIZ, this.LIZ.LLD, "enter_banner_id", i, "banner_detail_position");
        LIZ.LJIJJ("live_take_detail", "banner_page");
        String str4 = "";
        if (bannerPanelItem == null || (str = bannerPanelItem.activityId) == null) {
            str = "";
        }
        LIZ.LJIJJ(str, "activity_id");
        if (bannerPanelItem != null && (str2 = bannerPanelItem.bannerType) != null) {
            str4 = str2;
        }
        LIZ.LJIJJ(str4, "banner_type");
        UFE.LIZIZ(this.LIZ.LLFF ? 1 : 0, LIZ, "is_anchor");
        this.LIZ.LLFII.put(i, true);
    }
}
