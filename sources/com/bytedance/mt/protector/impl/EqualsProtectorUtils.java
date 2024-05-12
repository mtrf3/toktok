package com.bytedance.mt.protector.impl;

import X.C65415Plr;
import X.InterfaceC65419Plv;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public class EqualsProtectorUtils {
    public static boolean equals(Object obj, Object obj2) {
        if (C65415Plr.LIZIZ() && obj == null) {
            InterfaceC65419Plv interfaceC65419Plv = C65415Plr.LJ;
            if (interfaceC65419Plv != null) {
                NullPointerException nullPointerException = new NullPointerException("equals NPE");
                if (nullPointerException.getStackTrace() != null && nullPointerException.getStackTrace().length != 0) {
                    StackTraceElement[] stackTrace = nullPointerException.getStackTrace();
                    ArrayList arrayList = new ArrayList();
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        if (stackTraceElement != null && !equals(stackTraceElement.getClassName(), EqualsProtectorUtils.class.getName())) {
                            arrayList.add(stackTraceElement);
                        }
                    }
                    nullPointerException.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
                interfaceC65419Plv.LIZIZ(nullPointerException);
            }
            return false;
        }
        return obj.equals(obj2);
    }
}
