package com.ss.ttlivestreamer.livestreamv2.utils;

import X.C0EH;
import X.C16880lQ;
import X.X1D;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/* loaded from: classes7.dex */
public class UrlUtils {
    public static String DecodeUrl(String str) {
        try {
            int lastIndexOf = str.lastIndexOf(47) + 1;
            String substring = str.substring(lastIndexOf);
            if (substring.contains("%")) {
                substring = URLDecoder.decode(substring);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str.substring(0, lastIndexOf));
            LIZ.append(substring);
            return X1D.LIZIZ(LIZ);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return str;
        }
    }

    public static String EncodeUrl(String str) {
        if (str != null) {
            String[] split = str.split("/");
            String str2 = new String();
            if (split != null && split.length >= 2) {
                try {
                    str2 = URLEncoder.encode(split[split.length - 1], "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < split.length - 1; i = C0EH.LIZIZ(sb, split[i], "/", i, 1)) {
            }
            sb.append(str2);
            return sb.toString();
        }
        return null;
    }

    public static String AddParam(String str, String str2, String str3) {
        try {
            int length = str.length();
            String str4 = "";
            if (str.lastIndexOf("?") >= 0) {
                length = str.lastIndexOf("?") + 1;
                boolean z = false;
                for (String str5 : str.substring(length).split("&")) {
                    String[] split = str5.split("=");
                    if (split.length != 2) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(str4);
                        LIZ.append(str5);
                        LIZ.append("&");
                        str4 = X1D.LIZIZ(LIZ);
                    } else {
                        if (split[0].equals(str2)) {
                            split[1] = str3;
                            z = true;
                        }
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(str4);
                        LIZ2.append(split[0]);
                        LIZ2.append("=");
                        LIZ2.append(split[1]);
                        LIZ2.append("&");
                        str4 = X1D.LIZIZ(LIZ2);
                    }
                }
                if (!z) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(str4);
                    LIZ3.append(str2);
                    LIZ3.append("=");
                    LIZ3.append(str3);
                    str4 = X1D.LIZIZ(LIZ3);
                }
                if (str4.endsWith("&")) {
                    str4 = str4.substring(0, str4.length() - 1);
                }
            } else if (str.toLowerCase().lastIndexOf("%3f") >= 0) {
                length = str.toLowerCase().lastIndexOf("%3f") + 3;
                boolean z2 = false;
                for (String str6 : str.substring(length).split("%26")) {
                    String[] split2 = str6.split("(%3d|%3D)");
                    if (split2.length != 2) {
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append(str4);
                        LIZ4.append(str6);
                        LIZ4.append("%26");
                        str4 = X1D.LIZIZ(LIZ4);
                    } else {
                        if (split2[0].equals(str2)) {
                            split2[1] = str3;
                            z2 = true;
                        }
                        StringBuilder LIZ5 = X1D.LIZ();
                        LIZ5.append(str4);
                        LIZ5.append(split2[0]);
                        LIZ5.append("%3d");
                        LIZ5.append(split2[1]);
                        LIZ5.append("%26");
                        str4 = X1D.LIZIZ(LIZ5);
                    }
                }
                if (!z2) {
                    StringBuilder LIZ6 = X1D.LIZ();
                    LIZ6.append(str4);
                    LIZ6.append(str2);
                    LIZ6.append("%3d");
                    LIZ6.append(str3);
                    str4 = X1D.LIZIZ(LIZ6);
                }
                if (str4.endsWith("%26")) {
                    str4 = str4.substring(0, str4.length() - 3);
                }
            } else {
                StringBuilder LIZ7 = X1D.LIZ();
                LIZ7.append("");
                LIZ7.append("?");
                LIZ7.append(str2);
                LIZ7.append("=");
                LIZ7.append(str3);
                str4 = X1D.LIZIZ(LIZ7);
            }
            StringBuilder LIZ8 = X1D.LIZ();
            LIZ8.append(str.substring(0, length));
            LIZ8.append(str4);
            return X1D.LIZIZ(LIZ8);
        } catch (Exception unused) {
            return str;
        }
    }
}
