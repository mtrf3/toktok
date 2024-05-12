package X;

import android.app.Activity;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsAgreementRecord;
import yq4.a;

/* loaded from: classes8.dex */
public final class G9E {
    public static final G9E LIZ = new G9E();

    public static final void LIZ(Activity activity, int i) {
        if (i != 4 && ORY.LJJIJIIJIL(Integer.valueOf(i), new Integer[]{0, 2, 1})) {
            G9D.LIZ.storeInt(G9D.LIZLLL("privacy_setting_permission"), i);
        }
        PrivacySettingsAgreementRecord LJII = a.LJIILIIL().LJII("video_visibility_select");
        if (LJII != null && LJII.status == 1) {
            a.LJFF().LJJIJIL(activity);
            a.LJIILIIL().LJI("video_visibility_select");
        }
    }
}
