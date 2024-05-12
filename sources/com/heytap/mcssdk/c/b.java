package com.heytap.mcssdk.c;

import X.X1D;
import com.heytap.msp.push.mode.BaseMode;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes28.dex */
public class b extends BaseMode {
    public String b;
    public String c;
    public String d;
    public String e;
    public int f;
    public String g;
    public int h = -2;
    public String i;

    public static <T> String a(List<T> list) {
        StringBuilder sb = new StringBuilder();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append("&");
        }
        return sb.toString();
    }

    public String a() {
        return this.b;
    }

    public void a(int i) {
        this.f = i;
    }

    public void a(String str) {
        this.b = str;
    }

    public String b() {
        return this.c;
    }

    public void b(int i) {
        this.h = i;
    }

    public void b(String str) {
        this.c = str;
    }

    public String c() {
        return this.d;
    }

    public void c(String str) {
        this.d = str;
    }

    public String d() {
        return this.e;
    }

    public void d(String str) {
        this.e = str;
    }

    public int e() {
        return this.f;
    }

    public void e(String str) {
        this.g = str;
    }

    public String f() {
        return this.g;
    }

    public void f(String str) {
        this.i = str;
    }

    public int g() {
        return this.h;
    }

    @Override // com.heytap.msp.push.mode.BaseMode
    public int getType() {
        return 4105;
    }

    public String h() {
        return this.i;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CallBackResult{, mRegisterID='");
        LIZ.append(this.d);
        LIZ.append('\'');
        LIZ.append(", mSdkVersion='");
        LIZ.append(this.e);
        LIZ.append('\'');
        LIZ.append(", mCommand=");
        LIZ.append(this.f);
        LIZ.append('\'');
        LIZ.append(", mContent='");
        LIZ.append(this.g);
        LIZ.append('\'');
        LIZ.append(", mAppPackage=");
        LIZ.append(this.i);
        LIZ.append('\'');
        LIZ.append(", mResponseCode=");
        LIZ.append(this.h);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }
}
