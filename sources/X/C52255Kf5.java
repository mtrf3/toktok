package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.experiment.TTImageHeaderModel;

/* renamed from: X.Kf5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C52255Kf5 {
    public static final TTImageHeaderModel LIZ;

    static {
        new C52255Kf5();
        LIZ = new TTImageHeaderModel(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public static final TTImageHeaderModel LIZ() {
        try {
            return (TTImageHeaderModel) SettingsManager.LIZLLL().LJIIIIZZ("TT_Image_Header", TTImageHeaderModel.class, LIZ);
        } catch (Throwable unused) {
            return LIZ;
        }
    }
}
