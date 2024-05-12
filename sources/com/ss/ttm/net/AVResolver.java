package com.ss.ttm.net;

import X.C1JX;
import X.C47947Irn;
import X.RunnableC47946Irm;
import X.V16;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.Hashtable;

/* loaded from: classes9.dex */
public class AVResolver {
    public static int LJFF = 600000;
    public static final Hashtable<String, C47947Irn> LJI = new Hashtable<>();
    public String LIZ;
    public boolean LIZIZ;
    public String LIZJ;
    public String[] LIZLLL;
    public C47947Irn LJ;

    public void freeAddress() {
    }

    public String getAddress() {
        String[] strArr;
        if (this.LIZIZ && (strArr = this.LIZLLL) != null && strArr[0] != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getAddress return ip:");
            LIZ.append(this.LIZLLL[0]);
            X1D.LIZIZ(LIZ);
            return this.LIZLLL[0];
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("parser host name: ");
        LIZ2.append(this.LIZ);
        LIZ2.append(" error.err msg:");
        LIZ2.append(this.LIZJ);
        return X1D.LIZIZ(LIZ2);
    }

    public int isSuccess() {
        if (!this.LIZIZ) {
            return 0;
        }
        String[] strArr = this.LIZLLL;
        if (strArr != null && strArr[0] != null) {
            return 1;
        }
        return -1;
    }

    public void getAddressInfo(String str) {
        this.LIZ = str;
        if (TextUtils.isEmpty(str)) {
            this.LIZIZ = true;
            return;
        }
        C1JX.LJIIIIZZ("getAddressInfo start.hostname:", str);
        String str2 = this.LIZ;
        if (str2.length() < 7 || str2.length() > 15 ? !(str2.charAt(0) != '[' || str2.charAt(str2.length() - 1) != ']') : PatternProtector.compile("([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}").matcher(str2).find()) {
            C1JX.LJIIIIZZ("getAddressInfo is ip.ip:", str);
            this.LIZLLL = r1;
            String[] strArr = {this.LIZ};
            this.LIZIZ = true;
            return;
        }
        Hashtable<String, C47947Irn> hashtable = LJI;
        C47947Irn c47947Irn = hashtable.get(str);
        this.LJ = c47947Irn;
        if (c47947Irn != null) {
            C1JX.LJIIIIZZ("getAddressInfo first find in cache.hostname:", str);
            if (this.LJ.LIZ != null) {
                long currentTimeMillis = System.currentTimeMillis();
                C47947Irn c47947Irn2 = this.LJ;
                if (currentTimeMillis - c47947Irn2.LIZIZ < LJFF) {
                    this.LIZLLL = r1;
                    String[] strArr2 = {c47947Irn2.LIZ};
                    this.LIZIZ = true;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("getAddressInfo hit cached:ip:");
                    LIZ.append(this.LJ.LIZ);
                    LIZ.append(",time:");
                    LIZ.append(this.LJ.LIZIZ);
                    X1D.LIZIZ(LIZ);
                    return;
                }
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("getAddressInfo cache is to long.hostname:");
            LIZ2.append(str);
            X1D.LIZIZ(LIZ2);
            hashtable.remove(str);
            this.LJ = null;
        }
        try {
            V16.LIZLLL(new RunnableC47946Irm(this, this.LIZ));
        } catch (Exception e) {
            this.LIZIZ = true;
            this.LIZJ = e.getMessage();
        }
    }
}
