package com.ss.android.vesdk;

import X.C16880lQ;
import X.C36530EVi;
import defpackage.i0;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class VEVersionUtil {
    public static String getVESDKVersion() {
        return i0.LJFF("15.0.0.74", i0.LJFF("-", "mt"));
    }

    public static String[] getAllVersionInfos() {
        String vESDKVersion = getVESDKVersion();
        ArrayList arrayList = new ArrayList();
        arrayList.add("VESDK-VERSION");
        arrayList.add(vESDKVersion);
        for (Field field : C36530EVi.class.getDeclaredFields()) {
            if (field.getName().contains("VERSION")) {
                try {
                    Object obj = field.get(C36530EVi.class);
                    if (obj != null && obj.getClass() == String.class) {
                        arrayList.add(field.getName());
                        arrayList.add(obj);
                    }
                } catch (IllegalAccessException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
