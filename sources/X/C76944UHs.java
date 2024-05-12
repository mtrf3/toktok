package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3BackgroundUseMediaFixSetting;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.UHs, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76944UHs {
    public static final java.util.Map<String, Integer> LIZ;

    static {
        HashMap hashMap = new HashMap();
        LIZ = hashMap;
        hashMap.put("android.permission.CAMERA", Integer.valueOf(R.string.szu));
        hashMap.put("android.permission.RECORD_AUDIO", Integer.valueOf(R.string.szz));
        Integer valueOf = Integer.valueOf(R.string.szy);
        hashMap.put("android.permission.READ_EXTERNAL_STORAGE", valueOf);
        hashMap.put("android.permission.WRITE_EXTERNAL_STORAGE", valueOf);
    }

    public static String[] LIZ(Activity activity, String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (!LIZIZ(activity, str)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean LIZIZ(Context context, String... strArr) {
        if (strArr == null) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 23 && !C40221FqT.LIZ.LIZ()) {
            if (LinkMicMultiGuestV3BackgroundUseMediaFixSetting.INSTANCE.getValue()) {
                C28733BPl.LJIILIIL().getClass();
                C0NE.LJII("PermissionsHelper", "invoke PermissionUtils.hasSelfPermissionsUseContextCompat");
                for (String str : strArr) {
                    Integer orDefault = C68886R1u.LIZ.getOrDefault(str, null);
                    if ((orDefault != null && Build.VERSION.SDK_INT < orDefault.intValue()) || C04330Ez.LIZ(context, str) == 0) {
                        try {
                        } catch (RuntimeException unused) {
                        }
                    }
                    return false;
                }
                return true;
            }
            C28733BPl.LJIILIIL().getClass();
            C0NE.LJII("PermissionsHelper", "invoke PermissionUtils.hasSelfPermissions");
            for (String str2 : strArr) {
                Integer orDefault2 = C68886R1u.LIZ.getOrDefault(str2, null);
                if ((orDefault2 != null && Build.VERSION.SDK_INT < orDefault2.intValue()) || C38891fp.LJIIJ(context, str2) == 0) {
                    try {
                    } catch (RuntimeException unused2) {
                    }
                }
                return false;
            }
            return true;
        }
        C28733BPl.LJIILIIL().getClass();
        C0NE.LJII("PermissionsHelper", "invoke PermissionCheckerManager.inst().check");
        C76946UHu c76946UHu = C76945UHt.LIZ;
        c76946UHu.getClass();
        for (String str3 : strArr) {
            if (!c76946UHu.LIZ(context, str3)) {
                return false;
            }
        }
        return true;
    }

    public static boolean LIZJ(Activity activity, String... strArr) {
        if (strArr == null) {
            return false;
        }
        for (String str : strArr) {
            if (C1AR.LJI(activity, str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZLLL(Activity activity, String[] strArr, int[] iArr) {
        if (iArr.length == 0) {
            return false;
        }
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        if (C40221FqT.LIZ.LIZ()) {
            return LIZIZ(activity, strArr);
        }
        return true;
    }
}
