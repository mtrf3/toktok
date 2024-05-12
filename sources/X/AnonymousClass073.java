package X;

import com.bytedance.android.live_settings.LiveSettingModel;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.073, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class AnonymousClass073 {
    public static String LIZIZ(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String LIZ(String str, Class cls, String str2, int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(cls);
        LIZ.append(str2);
        LIZ.append(i);
        return X1D.LIZIZ(LIZ);
    }

    public static ArrayList LIZJ(LiveSettingModel liveSettingModel, Class cls, HashMap hashMap, String str, LiveSettingModel liveSettingModel2) {
        liveSettingModel.setDefaultCustomClass(cls);
        hashMap.put(str, liveSettingModel2);
        return new ArrayList();
    }
}
