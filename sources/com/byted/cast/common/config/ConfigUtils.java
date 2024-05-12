package com.byted.cast.common.config;

import X.X1D;
import android.os.Build;
import android.text.TextUtils;
import com.byted.cast.common.Logger;
import com.byted.cast.common.StringUtil;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes29.dex */
public class ConfigUtils {
    public static String getBuildVersion() {
        return "3.10.2.7.overseas-tt";
    }

    public static float getOSVersionF() {
        String[] split = Build.VERSION.RELEASE.split("\\.");
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int i2 = 0; i2 < split.length; i2++) {
            if (StringUtil.isNumeric(split[i2])) {
                sb.append(split[i2]);
                if (i == 0) {
                    sb.append(".");
                }
                i++;
            }
        }
        int length = sb.length() - 1;
        if (length >= 0 && '.' == sb.charAt(length)) {
            sb.deleteCharAt(length);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getOSVersionF, newVersion:");
        LIZ.append((Object) sb);
        Logger.i("ConfigUtils", X1D.LIZIZ(LIZ));
        if (sb.length() == 0) {
            Logger.w("ConfigUtils", "getOSVersionF, parse Build.VERSION.RELEASE error, use default version 8.0");
            return 8.0f;
        }
        try {
            return CastFloatProtector.parseFloat(sb.toString());
        } catch (Exception unused) {
            Logger.w("ConfigUtils", "getOSVersionF, parse float error, use default version 8.0");
            return 8.0f;
        }
    }

    public static String getLastId(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.substring(str.length() - 1);
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public static String is2String(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
            } else {
                return sb.toString().trim();
            }
        }
    }

    public static <T> List<T> castList(Object obj, Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(cls.cast(it.next()));
            }
        }
        return arrayList;
    }

    public static <K, V> Map<K, V> castMap(Object obj, Class<K> cls, Class<V> cls2) {
        HashMap hashMap = new HashMap();
        if (obj instanceof Map) {
            for (Map.Entry<K, V> entry : ((Map) obj).entrySet()) {
                hashMap.put(cls.cast(entry.getKey()), cls2.cast(entry.getValue()));
            }
        }
        return hashMap;
    }
}
