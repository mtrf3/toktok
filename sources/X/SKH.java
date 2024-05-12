package X;

import Y.IDDListenerS151S0100000_12;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.PrivacySettingSheet;
import com.ss.android.ugc.tiktok.tpsc.TPSCPageBuildConfigs;
import com.ss.android.ugc.tiktok.tpsc.data.effectcount.VideoCount;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SKH implements SKK {
    @Override // X.SKK
    public final SKO LIZ(int i) {
        return new SKO(i);
    }

    @Override // X.SKK
    public final SKQ LIZLLL(int i) {
        return new SKQ(i);
    }

    @Override // X.SKK
    public final SKP LJ(int i) {
        return new SKP(i);
    }

    @Override // X.SKK
    public final AbstractC71915SKh LJII(AbstractC71913SKf settingItemBuilder) {
        o.LJIIIZ(settingItemBuilder, "settingItemBuilder");
        if (settingItemBuilder instanceof SL4) {
            return new C71912SKe((SL4) settingItemBuilder);
        }
        if (settingItemBuilder instanceof SL3) {
            return new C71911SKd((SL3) settingItemBuilder);
        }
        if (settingItemBuilder instanceof SK9) {
            return new C71910SKc((SK9) settingItemBuilder);
        }
        return new SKB(settingItemBuilder);
    }

    @Override // X.SKK
    public final void LIZIZ(Activity activity, String str) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(str, "str");
        C26045AKb c26045AKb = new C26045AKb(activity);
        c26045AKb.LJIIIZ(str);
        c26045AKb.LJIIJ();
    }

    @Override // X.SKK
    public final void LIZJ(Fragment fragment, String str) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(str, "str");
        C26045AKb c26045AKb = new C26045AKb(fragment);
        c26045AKb.LJIIIZ(str);
        c26045AKb.LJIIJ();
    }

    @Override // X.SKK
    public final void LJI(Context context, TPSCPageBuildConfigs tPSCPageBuildConfigs) {
        ActivityC45651qj activityC45651qj;
        o.LJIIIZ(context, "context");
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (!(LJIJJ instanceof ActivityC45651qj) || (activityC45651qj = (ActivityC45651qj) LJIJJ) == null) {
            return;
        }
        PrivacySettingSheet privacySettingSheet = new PrivacySettingSheet();
        Bundle bundle = new Bundle();
        bundle.putParcelable("buildConfigs", tPSCPageBuildConfigs);
        privacySettingSheet.setArguments(bundle);
        ASL asl = new ASL();
        asl.LIZ.LJLLILLLL = privacySettingSheet;
        if (tPSCPageBuildConfigs.style == EnumC69896Rbw.FIXED_HEIGHT_SHEET) {
            asl.LJI(1);
            asl.LIZ.LJLLLLLL = (int) (KL2.LJIIIZ(context) * 0.55f);
        }
        IDDListenerS151S0100000_12 iDDListenerS151S0100000_12 = new IDDListenerS151S0100000_12(privacySettingSheet, 0);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLILLLLZI = iDDListenerS151S0100000_12;
        C1DG.LJII(activityC45651qj, "activity.supportFragmentManager", tuxSheet, "PrivacySettingSheet");
    }

    @Override // X.SKK
    public final void LJIIIIZZ(int i, Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        C26045AKb c26045AKb = new C26045AKb(fragment);
        c26045AKb.LJIIIIZZ(i);
        c26045AKb.LJIIJ();
    }

    @Override // X.SKK
    public final void LJIIIZ(Activity activity, int i) {
        o.LJIIIZ(activity, "activity");
        C26045AKb c26045AKb = new C26045AKb(activity);
        c26045AKb.LJIIIIZZ(i);
        c26045AKb.LJIIJ();
    }

    @Override // X.SKK
    public final SKN LJFF(InterfaceC65784Pro interfaceC65784Pro, VideoCount videoCount, int i, int i2, int i3) {
        return new SKN(interfaceC65784Pro, videoCount, i, i2, i3);
    }
}
