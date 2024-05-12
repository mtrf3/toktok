package com.ss.android.ugc.effectmanager.common.utils;

import X.C68322mC;
import X.X1D;
import android.content.res.AssetManager;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AssetUtils {
    public static final AssetUtils INSTANCE = new AssetUtils();

    public static final String loadJson(AssetManager assetManager, String str) {
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader;
        o.LJIIJ(assetManager, "assetManager");
        InputStreamReader inputStreamReader2 = null;
        if (str != null) {
            try {
                inputStreamReader = new InputStreamReader(assetManager.open(str));
            } catch (Exception e) {
                e = e;
                bufferedReader = null;
                inputStreamReader = null;
            } catch (Throwable th) {
                th = th;
                bufferedReader = null;
                CloseUtil.close(inputStreamReader2);
                CloseUtil.close(bufferedReader);
                throw th;
            }
            try {
                bufferedReader = new BufferedReader(inputStreamReader);
                try {
                    try {
                        StringBuilder sb = new StringBuilder();
                        new C68322mC();
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine != null) {
                                sb.append(readLine);
                            } else {
                                String sb2 = sb.toString();
                                CloseUtil.close(inputStreamReader);
                                CloseUtil.close(bufferedReader);
                                return sb2;
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("#loadJson::jsonFilePath=");
                        LIZ.append(str);
                        EPLog.e("AssetUtils", X1D.LIZIZ(LIZ), e);
                        CloseUtil.close(inputStreamReader);
                        CloseUtil.close(bufferedReader);
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStreamReader2 = inputStreamReader;
                    CloseUtil.close(inputStreamReader2);
                    CloseUtil.close(bufferedReader);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                bufferedReader = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
                inputStreamReader2 = inputStreamReader;
                CloseUtil.close(inputStreamReader2);
                CloseUtil.close(bufferedReader);
                throw th;
            }
        } else {
            CloseUtil.close(null);
            CloseUtil.close(null);
        }
        return null;
    }
}
