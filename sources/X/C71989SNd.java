package X;

import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.tiktok.tpsc.TPSCPageBuildConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.DisclosureAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.GroupTitleAdapterConfigs;
import com.zhiliaoapp.musically.R;
import defpackage.t1;

/* renamed from: X.SNd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71989SNd extends AbstractC65781Prl implements InterfaceC65784Pro<TPSCPageBuildConfigs> {
    public static final C71989SNd LJLIL = new C71989SNd();

    public C71989SNd() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final TPSCPageBuildConfigs invoke() {
        boolean z;
        Integer valueOf = Integer.valueOf(R.string.qm);
        DisclosureAdapterConfigs[] disclosureAdapterConfigsArr = new DisclosureAdapterConfigs[3];
        Integer valueOf2 = Integer.valueOf(R.string.qvz);
        C61477OAv c61477OAv = C61477OAv.LJLIL;
        if (t1.LJI() || GuestModeServiceImpl.LJIIJJI().LJIIJ()) {
            z = true;
        } else {
            z = false;
        }
        disclosureAdapterConfigsArr[0] = new DisclosureAdapterConfigs(R.string.qvy, valueOf2, null, "aweme://hyd_action/dyd_unregistered_user", c61477OAv, z, C42252Gi8.LJLIL, 4);
        disclosureAdapterConfigsArr[1] = new DisclosureAdapterConfigs(R.string.efs, Integer.valueOf(R.string.efr), null, "//webview", O13.LJLIL, false, C42253Gi9.LJLIL, 4);
        Integer valueOf3 = Integer.valueOf(R.string.hw4);
        C62718OjS c62718OjS = C62718OjS.LJLIL;
        C85296Xdk.LIZ.getClass();
        disclosureAdapterConfigsArr[2] = new DisclosureAdapterConfigs(R.string.ozc, valueOf3, null, "aweme://location_services/setting", c62718OjS, !C85296Xdk.LJFF(), C46437IKj.LJLIL, 4);
        return new TPSCPageBuildConfigs(valueOf, (EnumC69896Rbw) null, C47261Igj.LJJIJ(new GroupTitleAdapterConfigs(R.string.efq, C47261Igj.LJJIJIIJI(disclosureAdapterConfigsArr), 0, 10)), 5);
    }
}
