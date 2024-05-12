package com.bytedance.bdlocation.permission;

import X.C04330Ez;
import X.X1D;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.log.Logger;
import com.bytedance.bdlocation.store.LocationCache;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes24.dex */
public class PermissionManager {
    public static int LOCATION_PERMISSION_NO = 71;
    public static int LOCATION_PERMISSION_OK = 1;

    public static boolean canRequestLocationPermission() {
        if (System.currentTimeMillis() - LocationCache.getInstance().getLocationDenyTime() > 172800000) {
            return true;
        }
        return false;
    }

    public static int checkLocationPermissions(Context context) {
        try {
            if (hasAnyPermission(context, BDLocationConfig.getFinePermission(), "android.permission.ACCESS_COARSE_LOCATION")) {
                return LOCATION_PERMISSION_OK;
            }
            return LOCATION_PERMISSION_NO;
        } catch (Exception unused) {
            return LOCATION_PERMISSION_NO;
        }
    }

    public static boolean hasAnyPermission(String... strArr) {
        Context context = BDLocationConfig.getContext();
        if (context == null) {
            return false;
        }
        return checkPermissions(context, strArr);
    }

    public static boolean hasLocationPermissions(Context context) {
        if (checkLocationPermissions(context) == LOCATION_PERMISSION_OK) {
            return true;
        }
        return false;
    }

    public static boolean isApproximateLocation(Context context) {
        boolean hasAnyPermission = hasAnyPermission(context, BDLocationConfig.getFinePermission());
        boolean hasAnyPermission2 = hasAnyPermission(context, "android.permission.ACCESS_COARSE_LOCATION");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PermissionManager isApproximateLocation coarseLocationPermission:");
        LIZ.append(hasAnyPermission2);
        LIZ.append("--fineLocationPermission:");
        LIZ.append(hasAnyPermission);
        Logger.i(X1D.LIZIZ(LIZ));
        if (hasAnyPermission2 && !hasAnyPermission) {
            return true;
        }
        return false;
    }

    public static boolean isFindPermissionGranted(Context context) {
        return hasAnyPermission(context, BDLocationConfig.getFinePermission());
    }

    public static boolean checkPermissions(Context context, String... strArr) {
        if (Build.VERSION.SDK_INT >= 31 || BDLocationConfig.isOverSeas()) {
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str) && C04330Ez.LIZ(context, str) == 0) {
                    return true;
                }
            }
            return false;
        }
        List<String> deniedPermissions = getDeniedPermissions(context, strArr);
        if (deniedPermissions == null || deniedPermissions.isEmpty()) {
            return true;
        }
        return false;
    }

    public static List<String> getDeniedPermissions(Context context, String... strArr) {
        if (context == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (strArr != null) {
            if (strArr.length != 1 || strArr[0] != null) {
                for (String str : strArr) {
                    if (str != null && C04330Ez.LIZ(context, str) == -1) {
                        arrayList.add(str);
                    }
                }
                return arrayList;
            }
        }
        arrayList.add("");
        return arrayList;
    }

    public static boolean hasAnyPermission(Context context, String... strArr) {
        if (context == null) {
            return false;
        }
        return checkPermissions(context, strArr);
    }
}
