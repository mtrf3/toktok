package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.publish.core.upload.SmartSliceModel;

/* renamed from: X.H1f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43391H1f {
    public static final C43391H1f LIZ = new C43391H1f();

    public static SmartSliceModel LIZ() {
        try {
            return (SmartSliceModel) SettingsManager.LIZLLL().LJIIIIZZ("network_smart_slice_model", SmartSliceModel.class, null);
        } catch (Throwable unused) {
            return null;
        }
    }
}
