package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import java.util.List;

/* renamed from: X.Ptb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC65895Ptb {
    void checkin();

    List<C40926G4k> getAllSupportedLoginPlatform();

    String getLoginMobEnterMethod();

    Class<? extends Activity> getPushLoginActivityClass();

    boolean isEnableMultiAccountLogin();

    void loginByPlatform(C78451Uqd c78451Uqd, C40926G4k c40926G4k);

    void logout(String str, String str2);

    void logout(String str, String str2, InterfaceC65892PtY interfaceC65892PtY);

    void logout(String str, String str2, Bundle bundle, InterfaceC65892PtY interfaceC65892PtY);

    void openCountryListActivity(Activity activity, GBL gbl);

    void saveDTicket(String str, String str2);

    void showFTCCreateAccountView(Activity activity, boolean z);

    void showLoginAndRegisterView(C78451Uqd c78451Uqd);

    void showLoginView(C78451Uqd c78451Uqd);

    void switchAccount(SignificantUserInfo significantUserInfo, Bundle bundle, R4B r4b);

    boolean toRecoverDeletedAccount(String str);

    void tryUpdateStoredLoginPlatform();

    void uploadAccountNum(boolean z);
}
