package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;

/* renamed from: X.Onf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62979Onf extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C62979Onf LJLIL = new C62979Onf();

    public C62979Onf() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        User currentUser = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser();
        if (currentUser != null && currentUser.getAgeGateAction() == EnumC62956OnI.US_FTC.getValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
