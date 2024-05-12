package com.ss.bytertc.engine.utils;

import X.C16880lQ;
import X.X1D;
import android.content.Context;
import com.bytedance.realx.base.ContextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes33.dex */
public class EffectBeautyResource {
    public static String GetEffectComposeMakeupPath() {
        Context applicationContext = ContextUtils.getApplicationContext();
        File file = new File(C16880lQ.LLIIJLIL(applicationContext), "basic_beauty");
        copyAssetFolder(applicationContext, "basic_beauty", file.getAbsolutePath());
        return file.getAbsolutePath();
    }

    public static boolean copyAssetFile(Context context, String str, String str2) {
        try {
            File file = new File(str2);
            if (file.exists()) {
                return true;
            }
            InputStream open = context.getAssets().open(str);
            if (open == null) {
                return false;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = open.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    open.close();
                    fileOutputStream.close();
                    return true;
                }
            }
        } catch (IOException e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    public static boolean copyAssetFolder(Context context, String str, String str2) {
        try {
            String[] list = context.getAssets().list(str);
            if (list == null) {
                return false;
            }
            if (list.length == 0) {
                return copyAssetFile(context, str, str2);
            }
            boolean mkdirs = new File(str2).mkdirs();
            for (String str3 : list) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str);
                String str4 = File.separator;
                LIZ.append(str4);
                LIZ.append(str3);
                String LIZIZ = X1D.LIZIZ(LIZ);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(str2);
                LIZ2.append(str4);
                LIZ2.append(str3);
                mkdirs &= copyAssetFolder(context, LIZIZ, X1D.LIZIZ(LIZ2));
            }
            return mkdirs;
        } catch (IOException e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }
}
