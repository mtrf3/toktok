package com.appsflyer.internal;

import X.C16880lQ;
import android.content.Context;
import com.appsflyer.AFLogger;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class af {
    public static af valueOf = new af();

    public static af values() {
        return valueOf;
    }

    public static List<f> valueOf(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(C16880lQ.LLIIJLIL(context), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
            } else {
                for (File file2 : file.listFiles()) {
                    AFLogger.valueOf("Found cached request" + file2.getName());
                    arrayList.add(valueOf(file2));
                }
            }
        } catch (Exception e) {
            AFLogger.valueOf("Could not cache request", e);
        }
        return arrayList;
    }

    public static File values(Context context) {
        return new File(C16880lQ.LLIIJLIL(context), "AFRequestCache");
    }

    public static f valueOf(File file) {
        try {
            FileReader fileReader = new FileReader(file);
            try {
                char[] cArr = new char[(int) file.length()];
                fileReader.read(cArr);
                f fVar = new f(cArr);
                fVar.AFKeystoreWrapper = file.getName();
                try {
                    fileReader.close();
                } catch (IOException e) {
                    AFLogger.valueOf(e);
                }
                return fVar;
            } catch (Exception unused) {
                if (fileReader != null) {
                    try {
                        fileReader.close();
                    } catch (IOException e2) {
                        AFLogger.valueOf(e2);
                    }
                }
                return null;
            } catch (Throwable th) {
                try {
                    fileReader.close();
                    throw th;
                } catch (IOException e3) {
                    AFLogger.valueOf(e3);
                    throw th;
                }
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static void AFKeystoreWrapper(String str, Context context) {
        File file = new File(new File(C16880lQ.LLIIJLIL(context), "AFRequestCache"), str);
        AFLogger.valueOf("Deleting " + str + " from cache");
        if (file.exists()) {
            try {
                C16880lQ.LLLZZIL(file);
            } catch (Exception e) {
                AFLogger.valueOf("Could not delete " + str + " from cache", e);
            }
        }
    }
}
