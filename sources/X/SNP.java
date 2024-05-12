package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.tiktok.tpsc.TPSCPageBuildConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.GroupTitleAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public final class SNP extends AbstractC65781Prl implements InterfaceC65784Pro<TPSCPageBuildConfigs> {
    public static final SNP LJLIL = new SNP();

    public SNP() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final TPSCPageBuildConfigs invoke() {
        Integer valueOf = Integer.valueOf(R.string.b4q);
        Parcelable[] parcelableArr = new Parcelable[4];
        parcelableArr[0] = new PrivacySettingsAdapterConfigs("chat_item", null);
        PrivacySettingsAdapterConfigs privacySettingsAdapterConfigs = new PrivacySettingsAdapterConfigs("group_chat_item", null);
        if (!(!C53332KwS.LIZ())) {
            privacySettingsAdapterConfigs = null;
        }
        parcelableArr[1] = privacySettingsAdapterConfigs;
        Bundle bundle = new Bundle();
        bundle.putBoolean("isMessageStatusEnable", C43J.LIZLLL());
        GroupTitleAdapterConfigs groupTitleAdapterConfigs = new GroupTitleAdapterConfigs(R.string.ev0, C47261Igj.LJJIJIIJI(new PrivacySettingsAdapterConfigs("tcm_message", null), new PrivacySettingsAdapterConfigs("read_receipts", bundle)), 0, 10);
        if (!C43J.LIZLLL()) {
            groupTitleAdapterConfigs = null;
        }
        parcelableArr[2] = groupTitleAdapterConfigs;
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("showNudeFilter", IMService.createIIMServicebyMonsterPlugin(false).getImIIMNudeFilterService().isEnabled());
        parcelableArr[3] = new GroupTitleAdapterConfigs(R.string.ets, C47261Igj.LJJIJIIJI(new PrivacySettingsAdapterConfigs("safe_mode", null), new PrivacySettingsAdapterConfigs("nude_filter", bundle2), new PrivacySettingsAdapterConfigs("filter_keyword", null)), 0, 10);
        return new TPSCPageBuildConfigs(valueOf, (EnumC69896Rbw) null, ORY.LJJIJLIJ(parcelableArr), 5);
    }
}
