package X;

import Y.AObserverS80S0100000_12;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.BasePrivacySettingFragmentMain;
import com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.privateaccount.PrivateAccountConfig;
import com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.privateaccount.PrivateAccountViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.SOc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72014SOc extends SN1<PrivateAccountViewModel> {
    public final LifecycleOwner LJLLJ;

    @Override // X.SN1
    public final String LLIIII() {
        return "private_account";
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0398  */
    @Override // X.SN1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LLIIIJ(int r18) {
        /*
            Method dump skipped, instructions count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72014SOc.LLIIIJ(int):boolean");
    }

    @Override // X.SN1
    public final void LLIIIL(int i) {
        BasePrivacySettingFragmentMain basePrivacySettingFragmentMain;
        String str;
        LifecycleOwner lifecycleOwner = this.LJLLJ;
        if ((lifecycleOwner instanceof BasePrivacySettingFragmentMain) && (basePrivacySettingFragmentMain = (BasePrivacySettingFragmentMain) lifecycleOwner) != null && (str = basePrivacySettingFragmentMain.LJLJLLL) != null) {
            if (i != 1) {
                if (i == 2) {
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("enter_from", "privacy_and_safety_settings");
                    c188727au.LJIIIZ("enter_method", str);
                    FMX.LJIIL("private_account_off", c188727au.LIZ);
                }
            } else {
                C188727au c188727au2 = new C188727au();
                c188727au2.LJIIIZ("enter_from", "privacy_and_safety_settings");
                c188727au2.LJIIIZ("enter_method", str);
                FMX.LJIIL("private_account_on", c188727au2.LIZ);
            }
        }
        super.LLIIIL(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72014SOc(PrivateAccountViewModel privateAccountViewModel, Context context, LifecycleOwner lifecycleOwner, PrivateAccountConfig privateAccountConfig, SKL skl) {
        super(privateAccountViewModel, context, skl);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLLJ = lifecycleOwner;
        SL3 sl3 = new SL3();
        sl3.LJIILLIIL = 1;
        sl3.LJIIZILJ = 0;
        SN1.LLFZ(this, sl3);
        AbstractC71913SKf.LIZJ(sl3, R.string.paj);
        sl3.LJ = Integer.valueOf(R.string.r0o);
        LJLLLLLL(sl3.LIZ());
        privateAccountViewModel.LJLJI.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 93));
        privateAccountViewModel.LJLJJI.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 94));
    }
}
