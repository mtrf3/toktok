package X;

import android.app.Activity;
import androidx.fragment.app.DialogFragment;

/* renamed from: X.AOj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC26157AOj {
    void callUserSettingsBeforePopUpShow(ActivityC45651qj activityC45651qj, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro);

    void callUserSettingsBeforeUpsell2svWalletPopUpShow(ActivityC45651qj activityC45651qj, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro);

    C10K<Boolean> getSafeInfo();

    int getTwoStepVerificationStatusFromLocal();

    C10K<Boolean> getTwoStepVerificationStatusFromNetwork();

    void handlePushChallengeInfo(String str, String str2);

    boolean isUpsell2svInboxHVAExperimentTreatment();

    boolean isUpsell2svProfileHVAExperimentTreatment();

    boolean isUpsell2svProfileHVAExperimentTreatmentFromKeva();

    boolean isUpsell2svProfileWalletExperimentTreatment();

    void onOpenPushChallengePage(String str);

    void openTwoStepVerificationManageActivity(Activity activity, String str);

    boolean shouldShowUpsell2svHVAPopUp(ActivityC45651qj activityC45651qj);

    boolean shouldShowUpsell2svProfileHVAPopUp(ActivityC45651qj activityC45651qj);

    boolean shouldShowUpsell2svProfileWalletPopUp(ActivityC45651qj activityC45651qj);

    DialogFragment showUpsell2svCommonPopUp(ActivityC45651qj activityC45651qj, C85057XZt c85057XZt);

    void upsell2svHVAPopTask(ActivityC45651qj activityC45651qj, C85057XZt c85057XZt);
}
