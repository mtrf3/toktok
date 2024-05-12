package X;

import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.CsK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32692CsK {
    public static final /* synthetic */ int LIZLLL = 0;
    public int LIZ = -1;
    public int LIZIZ = -1;
    public long LIZJ = -1;

    public final void LIZIZ(int i, int i2) {
        if (this.LIZ != -1) {
            return;
        }
        this.LIZIZ = i;
        this.LIZ = i2;
        this.LIZJ = C30725C4b.LIZ();
    }

    public final void LIZ(int i, int i2, boolean z, List list, int i3, int i4, int i5) {
        Integer num;
        int i6 = this.LIZ;
        if (i6 == -1) {
            return;
        }
        if (z) {
            i6 = this.LIZIZ;
            i = i2;
        }
        long LIZ = C30725C4b.LIZ();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        C32455CoV.LJII(jSONObject, jSONObject2);
        BZI LIZ2 = C28787BRn.LIZ("gift_panel_scroll");
        LIZ2.LJIIZILJ();
        LIZ2.LJJ(jSONObject);
        LIZ2.LJJ(jSONObject2);
        LIZ2.LIZLLL(C28835BTj.LIZJ("user_live_duration"));
        GiftManager inst = GiftManager.inst();
        C32128CjE c32128CjE = C32129CjF.LIZ;
        LIZ2.LJIJJ(inst.getTabName(c32128CjE.LJFF), "tab_name");
        LIZ2.LJIJJ(C77283UUt.LIZ, "gift_dialog_request_id");
        LIZ2.LJIJJ(Integer.valueOf(GiftManager.inst().getTabLocation(c32128CjE.LJIIIIZZ)), "tab_location");
        LIZ2.LJIJJ(Integer.valueOf(i), "end_row_location");
        LIZ2.LJIJJ(Integer.valueOf(Math.abs(i - i6)), "scroll_rows");
        LIZ2.LJIJJ(Long.valueOf(LIZ - this.LIZJ), "scroll_duration");
        LIZ2.LJIJJ(Integer.valueOf(i6), "start_row_location");
        LIZ2.LJIJJ(C31120CJg.LJ().getDesc(), "send_gift_scene");
        int i7 = 0;
        if (list != null && list.size() > 1) {
            i7 = 1;
        }
        LIZ2.LJIJJ(Integer.valueOf(i7), "is_frequently_used_area_show");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LIZ2.LJIJJ(num, "frequently_gift_cnt");
        LIZ2.LJIJJ(Integer.valueOf(i3), "scroll_stop_image_scc_cnt");
        LIZ2.LJIJJ(Integer.valueOf(i4), "scroll_stop_image_cache_cnt");
        LIZ2.LJIJJ(Integer.valueOf(i5), "scroll_stop_screen_item_cnt");
        LIZ2.LJIL("scroll_stop_image_load_rate", Float.valueOf(i3 / i5));
        LIZ2.LJJIFFI(c32128CjE.LJIILJJIL);
        LIZ2.LJJIIJZLJL();
        this.LIZ = -1;
        this.LIZJ = -1L;
    }
}
