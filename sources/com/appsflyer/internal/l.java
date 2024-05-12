package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class l {
    public final String[] valueOf;

    /* loaded from: classes.dex */
    public interface c {
        void AFKeystoreWrapper(String str);

        void values(String str, String str2, String str3);
    }

    public l() {
    }

    public l(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            this.valueOf = null;
            return;
        }
        Pattern compile = PatternProtector.compile("[\\w]{1,45}");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str == null || !compile.matcher(str).matches()) {
                AFLogger.values("Invalid partner name: ".concat(String.valueOf(str)));
            } else {
                arrayList.add(str.toLowerCase());
            }
        }
        if (arrayList.contains("all")) {
            this.valueOf = new String[]{"all"};
        } else if (!arrayList.isEmpty()) {
            this.valueOf = (String[]) arrayList.toArray(new String[0]);
        } else {
            this.valueOf = null;
        }
    }
}
