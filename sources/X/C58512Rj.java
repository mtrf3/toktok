package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.brdatagift.settingandexp.BemobiGifrSettingsParams;

/* renamed from: X.2Rj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C58512Rj {
    public static final BemobiGifrSettingsParams LIZ = new BemobiGifrSettingsParams(false, null, 3, null);

    public static final BemobiGifrSettingsParams LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        BemobiGifrSettingsParams bemobiGifrSettingsParams = LIZ;
        BemobiGifrSettingsParams bemobiGifrSettingsParams2 = (BemobiGifrSettingsParams) LIZLLL.LJIIIIZZ("bemobi_gift_setting", BemobiGifrSettingsParams.class, bemobiGifrSettingsParams);
        if (bemobiGifrSettingsParams2 == null) {
            return bemobiGifrSettingsParams;
        }
        return bemobiGifrSettingsParams2;
    }
}
