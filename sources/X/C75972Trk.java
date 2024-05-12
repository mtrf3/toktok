package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.DslLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiCohostAreaExpandSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiCohostRoomLoadingOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiHostAudienceLayoutSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchReDesignAnchorSetting;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Trk, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75972Trk implements UC4 {
    public final /* synthetic */ U8H LIZ;
    public final /* synthetic */ U64 LIZIZ;

    @Override // X.UC4
    public final void LIZ(DslLayout dslLayout) {
        o.LJIIIZ(dslLayout, "dslLayout");
        String str = "";
        String str2 = "";
        for (Map.Entry<String, Layout> entry : dslLayout.getData().entrySet()) {
            String key = entry.getKey();
            Layout value = entry.getValue();
            if (!this.LIZ.LJJIJL()) {
                if ((LiveMatchReDesignAnchorSetting.INSTANCE.isEnabled() && o.LJ(value.getLayoutId(), "2003")) || o.LJ(value.getLayoutId(), MultiCohostAreaExpandSetting.INSTANCE.getCohostLayoutId())) {
                    str = key;
                }
                if (o.LJ(value.getLayoutId(), "2001")) {
                    str2 = key;
                }
            } else if (MultiHostAudienceLayoutSwitchSetting.INSTANCE.getValue() && (o.LJ(value.getLayoutId(), "2002") || o.LJ(value.getLayoutId(), "2001"))) {
                str = key;
            }
        }
        if (!this.LIZ.LJJIJL() && MultiCohostAreaExpandSetting.INSTANCE.getValue() && str.length() == 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("fallbackLayoutName:");
            LIZ.append(str2);
            U4R.LIZIZ("CoLinkMicSession", X1D.LIZIZ(LIZ));
            str = str2;
        }
        UC7.LJ("targetLayoutName:", str, "CoLinkMicSession");
        this.LIZ.LJII(dslLayout);
        if ((!MultiCohostRoomLoadingOptSetting.INSTANCE.isEnable() && MultiHostAudienceLayoutSwitchSetting.INSTANCE.getValue()) || this.LIZIZ.LJLJJI.getOwnerUserId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            this.LIZ.LJJLIIIJJI(str, false);
        }
    }

    public C75972Trk(U8H u8h, U64 u64) {
        this.LIZ = u8h;
        this.LIZIZ = u64;
    }
}
