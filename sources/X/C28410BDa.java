package X;

import Y.ARunnableS41S0100000_5;
import Y.ARunnableS5S2200000_5;
import android.content.Context;
import android.text.TextUtils;
import android.widget.CompoundButton;
import com.bytedance.android.livesdk.broadcast.AgeRestrictedChannel;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheet;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMatureCommunityGuidelinesUrlSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.BDa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28410BDa implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ BasePreviewSettingMainFragmentSheet LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    public C28410BDa(BasePreviewSettingMainFragmentSheet basePreviewSettingMainFragmentSheet, String str, String str2) {
        this.LJLIL = basePreviewSettingMainFragmentSheet;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ARunnableS5S2200000_5 aRunnableS5S2200000_5;
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LJJJLZIJ;
        Boolean bool = Boolean.FALSE;
        c48459J0d.LIZ(bool);
        C30444BxA.LIZ(EnumC30410Bwc.LIVE_GENERAL_SETTINGS_MATURETHEMES);
        C29306Beo.LJI(this.LJLIL._$_findCachedViewById(R.id.z9));
        if (z) {
            BasePreviewSettingMainFragmentSheet basePreviewSettingMainFragmentSheet = this.LJLIL;
            if (basePreviewSettingMainFragmentSheet.LLFFF) {
                String str = this.LJLILLLLZI;
                String str2 = this.LJLJI;
                Context context = basePreviewSettingMainFragmentSheet.getContext();
                if (context != null) {
                    String value = LiveMatureCommunityGuidelinesUrlSetting.INSTANCE.getValue();
                    String LJIILJJIL = C15380j0.LJIILJJIL(R.string.o26);
                    o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_se…eme_community_guidelines)");
                    DataChannel LJIILIIL = C51029K0z.LJIILIIL(basePreviewSettingMainFragmentSheet);
                    if (LJIILIIL != null && o.LJ(LJIILIIL.kv0(UserIsAnchorChannel.class), bool) && !TextUtils.isEmpty(value)) {
                        aRunnableS5S2200000_5 = new ARunnableS5S2200000_5(basePreviewSettingMainFragmentSheet, value, LJIILJJIL, context, 2);
                    } else {
                        aRunnableS5S2200000_5 = null;
                    }
                    C29306Beo.LJJJJIZL(BAY.LIZ(C51029K0z.LJIILIIL(basePreviewSettingMainFragmentSheet), context, aRunnableS5S2200000_5, new ARunnableS41S0100000_5(basePreviewSettingMainFragmentSheet, 307), str, str2));
                    BZI LIZIZ = C0N3.LIZIZ("livesdk_mature_theme_popup", str, "enter_from");
                    LIZIZ.LJIJJ(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "anchor_id");
                    LIZIZ.LJIJJ(str2, "source");
                    LIZIZ.LJJIIJZLJL();
                }
                this.LJLIL.LLFFF = false;
            }
        } else {
            DataChannel LJIILIIL2 = C51029K0z.LJIILIIL(this.LJLIL);
            if (LJIILIIL2 != null) {
                LJIILIIL2.rv0(AgeRestrictedChannel.class, 0);
            }
            this.LJLIL.LLFFF = true;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_mature_theme_icon_click");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(Integer.valueOf(z ? 1 : 0), "action_type");
        LIZ.LJIJJ(String.valueOf(((C29374Bfu) TTL.LIZJ(LIZ, this.LJLILLLLZI, "enter_from")).getCurrentUserId()), "anchor_id");
        LIZ.LJIJJ(this.LJLJI, "source");
        LIZ.LJJIIJZLJL();
    }
}
