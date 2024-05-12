package com.appsflyer.internal;

import android.util.Base64;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.Scanner;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public final class f {
    public String AFInAppEventParameterName;
    public String AFKeystoreWrapper;
    public String valueOf;
    public byte[] values;

    public f() {
    }

    public final byte[] values() {
        return this.values;
    }

    public f(char[] cArr) {
        byte[] decode;
        Scanner scanner = new Scanner(new String(cArr));
        int i = 0;
        int i2 = 0;
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            if (nextLine.startsWith("url=")) {
                this.valueOf = nextLine.substring(4).trim();
            } else if (nextLine.startsWith("version=")) {
                this.AFInAppEventParameterName = nextLine.substring(8).trim();
                Matcher matcher = PatternProtector.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$").matcher(this.AFInAppEventParameterName);
                if (matcher.matches()) {
                    i = CastIntegerProtector.parseInt(matcher.group(1));
                    i2 = CastIntegerProtector.parseInt(matcher.group(2));
                }
            } else if (nextLine.startsWith("data=")) {
                String trim = nextLine.substring(5).trim();
                if (i <= 4 && i2 < 11) {
                    decode = trim.getBytes();
                } else {
                    decode = Base64.decode(trim, 2);
                }
                this.values = decode;
            }
        }
        scanner.close();
    }

    public f(String str, byte[] bArr, String str2) {
        this.valueOf = str;
        this.values = bArr;
        this.AFInAppEventParameterName = str2;
    }
}
