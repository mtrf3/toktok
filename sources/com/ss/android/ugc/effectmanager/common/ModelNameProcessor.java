package com.ss.android.ugc.effectmanager.common;

import X.X1D;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.utils.StringUtils;
import com.ss.android.ugc.effectmanager.model.ModelInfo;
import java.util.regex.Pattern;

/* loaded from: classes16.dex */
public class ModelNameProcessor {
    public static String getFullNameFromModelInfo(ModelInfo modelInfo) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(modelInfo.getName());
        LIZ.append("_v");
        LIZ.append(modelInfo.getVersion());
        LIZ.append("_size");
        LIZ.append(modelInfo.getType());
        LIZ.append("_md5");
        LIZ.append(modelInfo.getMD5());
        LIZ.append(".model");
        return X1D.LIZIZ(LIZ);
    }

    public static String getMD5OfModel(String str) {
        if (!str.contains("md5")) {
            return null;
        }
        try {
            return str.substring(str.indexOf("md5") + 3, str.lastIndexOf("_model"));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getNameOfModel(String str) {
        try {
            int lastIndexOf = str.lastIndexOf("/");
            int lastIndexOf2 = str.lastIndexOf("_v");
            int i = lastIndexOf + 1;
            if (StringUtils.substringSafetyCheck(str, i, lastIndexOf2)) {
                int length = str.length();
                int versionIndex = getVersionIndex(str);
                if (versionIndex > 0) {
                    length = versionIndex;
                }
                if (!isVersionString(str.substring(lastIndexOf2 + 2, length))) {
                    return str;
                }
                return str.substring(i, lastIndexOf2);
            }
            int min = Math.min(StringExtension.lastIndexOfRegex(str, "\\.model|_model|\\.dat$"), str.length());
            if (min > 0) {
                return str.substring(i, min);
            }
            return str.substring(i, str.length());
        } catch (Exception e) {
            EPLog.e("ModelNameProcessor", "getNameOfModel failed!", e);
            return str;
        }
    }

    public static int getSizeOfModel(String str) {
        int lastIndexOfRegex;
        if (!str.contains("size")) {
            return 0;
        }
        int lastIndexOf = str.lastIndexOf("size");
        if (str.contains("md5")) {
            lastIndexOfRegex = StringExtension.lastIndexOfRegex(str, "_md5");
        } else {
            lastIndexOfRegex = StringExtension.lastIndexOfRegex(str, "\\.model|_model|\\.dat$");
        }
        if (lastIndexOf >= lastIndexOfRegex) {
            return -1;
        }
        try {
            return CastIntegerProtector.parseInt(str.substring(lastIndexOf + 4, lastIndexOfRegex));
        } catch (Exception unused) {
            return -1;
        }
    }

    public static int getVersionIndex(String str) {
        if (str.contains("_size")) {
            return str.lastIndexOf("_size");
        }
        return StringExtension.lastIndexOfRegex(str, "\\.model|_model|\\.dat$");
    }

    public static String getVersionOfModel(String str) {
        str.lastIndexOf("/");
        int lastIndexOf = str.lastIndexOf("_v");
        int lastIndexOfRegex = StringExtension.lastIndexOfRegex(str, "\\.model|_model|\\.dat$");
        if (lastIndexOf > 0) {
            return str.substring(lastIndexOf + 2, lastIndexOfRegex);
        }
        return "1.0";
    }

    public static boolean isVersionString(String str) {
        return Pattern.matches("^[0-9(.|_)]+", str);
    }

    public static boolean isBigVersionEquals(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (TextUtils.equals(str, str2)) {
                return true;
            }
            try {
                return TextUtils.equals(str.substring(0, str.indexOf(".")), str2.substring(0, str.indexOf(".")));
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
