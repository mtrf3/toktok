package com.bytedance.lynx.webview.adblock;

import X.C38639FEl;
import X.JBR;
import X.O19;
import X.X1D;
import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes11.dex */
public class TTSccAdblockWrapper {
    public long LIZ;

    public static final native boolean nativeDeserialize(long j);

    public static final native void nativeDestroy(long j);

    public static final native int nativeGetEngineVersion();

    public static final native long nativeInit(String str);

    public static final native long nativeInitV2(String str, String str2);

    public static final native boolean nativeParseRulesFiles(long j, String str, String str2);

    public static final native boolean nativeParseRulesString(long j, String str);

    public static final native boolean nativeSerialize(long j);

    public static final native boolean nativeShouldBlockUrlRequest(long j, String str, String str2, int i, boolean z);

    public static final native String nativeShouldHidingElement(long j, String str);

    public final String LIZIZ(String str) {
        String str2;
        long j = this.LIZ;
        if (j == 0) {
            return null;
        }
        try {
            String nativeShouldHidingElement = nativeShouldHidingElement(j, str);
            if (C38639FEl.LIZIZ) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("gettting element hiding, res is null? : ");
                if (TextUtils.isEmpty(nativeShouldHidingElement)) {
                    str2 = "true";
                } else {
                    str2 = "false";
                }
                LIZ.append(str2);
                LIZ.append(", url: ");
                LIZ.append(str);
                X1D.LIZIZ(LIZ);
            }
            return nativeShouldHidingElement;
        } catch (UnsatisfiedLinkError e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("native get element hiding error: ");
            LIZ2.append(e);
            X1D.LIZIZ(LIZ2);
            return null;
        }
    }

    public final boolean LIZ(Uri uri, String str) {
        O19 o19;
        if (this.LIZ == 0) {
            return false;
        }
        if (TextUtils.isEmpty(str) || str.equals(uri.toString())) {
            o19 = O19.kMainFrame;
        } else {
            o19 = O19.kSubResource;
            String path = uri.getPath();
            if (path != null) {
                String lowerCase = path.toLowerCase();
                if (lowerCase.endsWith(".gif")) {
                    o19 = O19.kImage;
                } else if (lowerCase.endsWith(".js") || lowerCase.endsWith(".php") || lowerCase.endsWith(".jss")) {
                    o19 = O19.kScript;
                } else if (lowerCase.endsWith(".css")) {
                    o19 = O19.kStylesheet;
                } else if (lowerCase.endsWith(".html")) {
                    o19 = str.equals(uri.toString()) ? O19.kMainFrame : O19.kSubFrame;
                } else if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".bmp")) {
                    o19 = O19.kImage;
                }
            }
        }
        try {
            boolean nativeShouldBlockUrlRequest = nativeShouldBlockUrlRequest(this.LIZ, uri.toString(), str, o19.getValue(), false);
            if (C38639FEl.LIZIZ && nativeShouldBlockUrlRequest) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("hit adblock rule, url: ");
                LIZ.append(uri);
                LIZ.append(", webview main frame url: ");
                LIZ.append(str);
                X1D.LIZIZ(LIZ);
            }
            return nativeShouldBlockUrlRequest;
        } catch (UnsatisfiedLinkError e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("adblock does hit error: ");
            LIZ2.append(e);
            X1D.LIZIZ(LIZ2);
            return false;
        }
    }

    public final boolean LIZJ(String str, String str2) {
        if (this.LIZ == 0) {
            try {
                this.LIZ = nativeInit(str);
            } catch (UnsatisfiedLinkError e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("adblock init error: ");
                LIZ.append(e);
                X1D.LIZIZ(LIZ);
                return false;
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            boolean nativeParseRulesFiles = nativeParseRulesFiles(this.LIZ, str, str2);
            long currentTimeMillis2 = System.currentTimeMillis();
            if (C38639FEl.LIZIZ) {
                StringBuilder LJI = JBR.LJI("scc parse adblock success? ", nativeParseRulesFiles, ", parse time: ");
                LJI.append(currentTimeMillis2 - currentTimeMillis);
                X1D.LIZIZ(LJI);
            }
            return nativeParseRulesFiles;
        } catch (UnsatisfiedLinkError e2) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("adblock parse error: ");
            LIZ2.append(e2);
            X1D.LIZIZ(LIZ2);
            return false;
        }
    }
}
