package com.bytedance.bdlocation.exception;

import X.X1D;
import android.text.TextUtils;
import com.bytedance.bdlocation.client.LocationOption;
import defpackage.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class BDLocationException extends Exception {
    public final List<Throwable> causes;
    public final String code;
    public final String detailMessage;
    public final Map<String, String> extra;
    public final int isAssembleError;
    public LocationOption option;
    public final String sdkName;

    public String getCode() {
        if (this.isAssembleError == 0) {
            return this.code;
        }
        for (Throwable th : getRootCauses()) {
            if (th instanceof BDLocationException) {
                return ((BDLocationException) th).getCode();
            }
        }
        return "";
    }

    public Map<String, String> getExtra() {
        if (this.isAssembleError == 0) {
            return this.extra;
        }
        HashMap hashMap = new HashMap(0);
        for (Throwable th : getRootCauses()) {
            if (th instanceof BDLocationException) {
                return ((BDLocationException) th).getExtra();
            }
        }
        return hashMap;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String LIZIZ;
        String LIZIZ2;
        String LIZIZ3;
        StringBuffer stringBuffer = new StringBuffer(71);
        String str = "";
        if (TextUtils.isEmpty(this.detailMessage)) {
            LIZIZ = "";
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("error message: ");
            LIZIZ = q.LIZIZ(LIZ, this.detailMessage, '\n', LIZ);
        }
        stringBuffer.append(LIZIZ);
        if (TextUtils.isEmpty(this.code)) {
            LIZIZ2 = "";
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("error code: ");
            LIZIZ2 = q.LIZIZ(LIZ2, this.code, '\n', LIZ2);
        }
        stringBuffer.append(LIZIZ2);
        if (TextUtils.isEmpty(this.sdkName)) {
            LIZIZ3 = "";
        } else {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("SdkName: ");
            LIZIZ3 = q.LIZIZ(LIZ3, this.sdkName, '\n', LIZ3);
        }
        stringBuffer.append(LIZIZ3);
        if (getExtra().size() != 0) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("wrong description: ");
            LIZ4.append(getExtra());
            LIZ4.append('\n');
            str = X1D.LIZIZ(LIZ4);
        }
        stringBuffer.append(str);
        List<Throwable> rootCauses = getRootCauses();
        if (rootCauses.isEmpty()) {
            return stringBuffer.toString();
        }
        if (rootCauses.size() == 1) {
            stringBuffer.append("There was 1 cause:\n");
        } else {
            stringBuffer.append("There were ");
            stringBuffer.append(rootCauses.size());
            stringBuffer.append(" causes:\n");
        }
        for (Throwable th : rootCauses) {
            stringBuffer.append(th.getClass().getName());
            stringBuffer.append("\n(");
            stringBuffer.append(th.getMessage());
            stringBuffer.append(")\n");
        }
        return stringBuffer.toString();
    }

    public List<Throwable> getRootCauses() {
        ArrayList arrayList = new ArrayList();
        addRootCauses(this, arrayList);
        return arrayList;
    }

    public String getSdkName() {
        if (this.isAssembleError == 0) {
            return this.sdkName;
        }
        for (Throwable th : getRootCauses()) {
            if (th instanceof BDLocationException) {
                return ((BDLocationException) th).getSdkName();
            }
        }
        return "";
    }

    public int getAssembleError() {
        return this.isAssembleError;
    }

    public List<Throwable> getCauses() {
        return this.causes;
    }

    public String getDetailMessage() {
        return this.detailMessage;
    }

    public LocationOption getOption() {
        return this.option;
    }

    public BDLocationException(List<Throwable> list) {
        this("location failed", "", "", new HashMap(), list, 1);
    }

    public String getExtra(String str) {
        return this.extra.get(str);
    }

    public void setOption(LocationOption locationOption) {
        this.option = locationOption;
    }

    private void addRootCauses(Throwable th, List<Throwable> list) {
        if (th instanceof BDLocationException) {
            for (Throwable th2 : ((BDLocationException) th).getCauses()) {
                addRootCauses(th2, list);
                if ((th2 instanceof BDLocationException) && ((BDLocationException) th2).isAssembleError == 0) {
                    list.add(th2);
                }
            }
            return;
        }
        list.add(th);
    }

    public BDLocationException addExtra(String str, String str2) {
        this.extra.put(str, str2);
        return this;
    }

    public BDLocationException(Throwable th, String str, String str2) {
        this("", str, str2, new HashMap(), Collections.singletonList(th), 0);
    }

    public BDLocationException(String str, String str2, String str3) {
        this(str, str2, str3, new HashMap(), Collections.emptyList(), 0);
    }

    public BDLocationException(String str, String str2, String str3, Map<String, String> map, List<Throwable> list, int i) {
        this.detailMessage = str;
        this.sdkName = str2;
        this.code = str3;
        this.extra = map;
        this.causes = list;
        this.isAssembleError = i;
    }
}
