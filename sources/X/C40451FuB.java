package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.api.UserSettingsResponse;
import com.ss.android.ugc.aweme.account.popup.popuphelper.SyncNicknameAndUsernamePopUpHelper;
import ujb.o;

/* renamed from: X.FuB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40451FuB<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZ;
    public final /* synthetic */ SyncNicknameAndUsernamePopUpHelper LIZIZ;
    public final /* synthetic */ ActivityC45651qj LIZJ;
    public final /* synthetic */ Fragment LIZLLL;

    public C40451FuB(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, SyncNicknameAndUsernamePopUpHelper syncNicknameAndUsernamePopUpHelper, ActivityC45651qj activityC45651qj, Fragment fragment) {
        this.LIZ = interfaceC65784Pro;
        this.LIZIZ = syncNicknameAndUsernamePopUpHelper;
        this.LIZJ = activityC45651qj;
        this.LIZLLL = fragment;
    }

    @Override // X.C10I
    public final Object then(C10K c10k) {
        String str;
        if (c10k.LJIIJJI() == null || !C82544WaS.LJ(c10k)) {
            this.LIZ.invoke();
        } else if (!o.LJJJJIZL("success", ((UserSettingsResponse) c10k.LJIIJJI()).getMessage(), true) || ((UserSettingsResponse) c10k.LJIIJJI()).getData() == null) {
            this.LIZ.invoke();
        } else {
            UserSettingsResponse.UserSettingsData data = ((UserSettingsResponse) c10k.LJIIJJI()).getData();
            String str2 = null;
            if (data != null) {
                str = data.getSyncUsername2Nickname();
            } else {
                str = null;
            }
            if (!C78685UuP.LJJJZ(str)) {
                UserSettingsResponse.UserSettingsData data2 = ((UserSettingsResponse) c10k.LJIIJJI()).getData();
                if (data2 != null) {
                    str2 = data2.getSyncNickname2Username();
                }
                if (!C78685UuP.LJJJZ(str2)) {
                    this.LIZ.invoke();
                }
            }
            this.LIZIZ.LIZIZ = R41.LIZLLL();
            SyncNicknameAndUsernamePopUpHelper.LIZLLL = ((UserSettingsResponse) c10k.LJIIJJI()).getData();
            this.LIZIZ.LJI(this.LIZJ, this.LIZLLL);
        }
        return C76800UCe.LIZ;
    }
}
