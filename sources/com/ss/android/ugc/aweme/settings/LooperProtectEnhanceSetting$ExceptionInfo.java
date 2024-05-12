package com.ss.android.ugc.aweme.settings;

import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Build;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes7.dex */
public class LooperProtectEnhanceSetting$ExceptionInfo {

    @InterfaceC65349Pkn("apiLevels")
    public List<Integer> apiLevels;

    @InterfaceC65349Pkn("exceptionMessage")
    public String exceptionMessage;

    @InterfaceC65349Pkn("exceptionType")
    public String exceptionType;

    @InterfaceC65349Pkn("models")
    public List<String> models;

    @InterfaceC65349Pkn("stackClassName")
    public String stackClassName;

    @InterfaceC65349Pkn("stackMethodName")
    public String stackMethodName;

    public final boolean LIZ() {
        if (TextUtils.isEmpty(this.exceptionType) || TextUtils.isEmpty(this.exceptionMessage) || TextUtils.isEmpty(this.stackClassName) || TextUtils.isEmpty(this.stackMethodName)) {
            return false;
        }
        List<String> list = this.models;
        if (list != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(Build.MANUFACTURER);
            LIZ.append(" ");
            LIZ.append(Build.MODEL);
            if (!list.contains(X1D.LIZIZ(LIZ))) {
                return false;
            }
        }
        List<Integer> list2 = this.apiLevels;
        if (list2 != null) {
            return list2.contains(Integer.valueOf(Build.VERSION.SDK_INT));
        }
        return true;
    }
}
