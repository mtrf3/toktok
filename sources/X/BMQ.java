package X;

import android.view.View;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheet;

/* loaded from: classes6.dex */
public final class BMQ extends C98T {
    public final /* synthetic */ RoomCreateInfo LJLJJL;
    public final /* synthetic */ BasePreviewSettingMainFragmentSheet LJLJJLL;
    public final /* synthetic */ String LJLJL;

    @Override // X.C98T
    public final void LIZ(View view) {
        if (view != null && this.LJLJJL.LIZIZ()) {
            BZI LIZ = C28787BRn.LIZ("livesdk_anchor_donation_click");
            LIZ.LJIILLIIL(C51029K0z.LJIILIIL(this.LJLJJLL));
            LIZ.LJIIJJI("live_take_page");
            LIZ.LJIJJ(this.LJLJL, "powered_by");
            LIZ.LJJIIJZLJL();
            this.LJLJJLL.LJLZ.LJIIIZ(C7N.LJI().R60(), "live_sticker_donation_list");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BMQ(RoomCreateInfo roomCreateInfo, BasePreviewSettingMainFragmentSheet basePreviewSettingMainFragmentSheet, String str) {
        super(300L);
        this.LJLJJL = roomCreateInfo;
        this.LJLJJLL = basePreviewSettingMainFragmentSheet;
        this.LJLJL = str;
    }
}
