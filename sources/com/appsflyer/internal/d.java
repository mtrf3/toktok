package com.appsflyer.internal;

import X.C03880Dg;
import X.C39519Ff9;
import X.C65300Pk0;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class d {
    public static final int AppsFlyerConversionListener = 0;
    public static int AppsFlyerLib = 1;
    public static int onAppOpenAttribution;
    public static Object onAttributionFailure;
    public static byte[] onConversionDataFail;
    public static long onConversionDataSuccess;
    public static Object onDeepLinking;
    public static byte[] onDeepLinkingNative;
    public static final byte[] onValidateInApp = null;
    public static int onValidateInAppFailure;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0066 -> B:7:0x003d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String $$c(int r8, int r9, short r10) {
        /*
            int r2 = com.appsflyer.internal.d.onValidateInAppFailure
            r0 = r2 | 53
            int r1 = r0 << 1
            r0 = r2 ^ 53
            int r1 = r1 - r0
            int r7 = r1 % 128
            com.appsflyer.internal.d.AppsFlyerLib = r7
            int r5 = r8 + 1
            byte[] r8 = com.appsflyer.internal.d.onValidateInApp
            int r1 = -r9
            r0 = r1 | 993(0x3e1, float:1.391E-42)
            int r2 = r0 << 1
            r0 = r1 ^ 993(0x3e1, float:1.391E-42)
            int r2 = r2 - r0
            int r0 = -r10
            int r0 = ~r0
            int r0 = 119 - r0
            int r3 = r0 + (-1)
            byte[] r6 = new byte[r5]
            r1 = 6
            if (r8 != 0) goto L75
            r0 = 45
        L26:
            r4 = 0
            if (r0 == r1) goto L71
            r1 = r7 ^ 69
            r0 = r7 & 69
            int r0 = r0 << 1
            int r1 = r1 + r0
            int r0 = r1 % 128
            com.appsflyer.internal.d.onValidateInAppFailure = r0
            int r0 = r7 + 99
            int r0 = r0 % 128
            com.appsflyer.internal.d.onValidateInAppFailure = r0
            r1 = 0
            r7 = r5
            r3 = r2
        L3d:
            int r0 = -r2
            int r0 = -r0
            int r0 = ~r0
            int r5 = r5 - r0
            int r5 = r5 + (-1)
            int r0 = com.appsflyer.internal.d.onValidateInAppFailure
            int r0 = r0 + 24
            int r0 = r0 + (-1)
            int r0 = r0 % 128
            com.appsflyer.internal.d.AppsFlyerLib = r0
            r2 = r3
        L4e:
            int r3 = r2 + 1
            byte r0 = (byte) r5
            r6[r1] = r0
            r2 = r1 ^ 118(0x76, float:1.65E-43)
            r0 = r1 & 118(0x76, float:1.65E-43)
            int r0 = r0 << 1
            int r2 = r2 + r0
            int r0 = r2 + (-116)
            int r1 = r0 + (-1)
            if (r1 != r7) goto L66
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r4)
            return r0
        L66:
            r2 = r8[r3]
            int r0 = com.appsflyer.internal.d.AppsFlyerLib
            int r0 = r0 + 65
            int r0 = r0 % 128
            com.appsflyer.internal.d.onValidateInAppFailure = r0
            goto L3d
        L71:
            r1 = 0
            r7 = r5
            r5 = r3
            goto L4e
        L75:
            r0 = 6
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.d.$$c(int, int, short):java.lang.String");
    }

    public static int AFInAppEventType(Object obj) {
        int i = AppsFlyerLib;
        int i2 = (i ^ 45) + ((i & 45) << 1);
        int i3 = i2 % 128;
        onValidateInAppFailure = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Object obj2 = onDeepLinking;
        AppsFlyerLib = ((i3 + 66) - 1) % 128;
        try {
            Object[] objArr = {obj};
            byte[] bArr = onValidateInApp;
            return ((Integer) com_appsflyer_internal_d_java_lang_reflect_Method_invoke(Class.forName($$c((byte) (-bArr[427]), (short) 643, bArr[11]), true, (ClassLoader) onAttributionFailure).getMethod($$c(bArr[642], (short) 386, (byte) (-bArr[111])), Object.class), obj2, objArr)).intValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object com_appsflyer_internal_d_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "2309626391053107425"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public static void init$0() {
        int i;
        int i2 = onValidateInAppFailure;
        int i3 = ((i2 | 91) << 1) - (i2 ^ 91);
        AppsFlyerLib = i3 % 128;
        if (!(i3 % 2 == 0)) {
            byte[] bArr = new byte[1012];
            System.arraycopy("\u0005õ\u001f\u008b÷\u0015ëÍ;\u0006¿\u00143ñ\u0000ÿ\róÿå%\u0002\u0005ÿß!þóü\f÷\u0015ëÍ>õ\rùÇ%&ú\u0001ñ\b\u0012ý\u0000ó\t\u0006Í/\u0000üýúþ\u0013õ\u0006ÿ\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ5ÀR÷\u0015ëÍ@û\u0006¿\u00147ûñÝ3ñ\u0000ÿ\r\rö\u000eýúûÊA\u0004»\u00143ô\u0003øÀ2ï\r\u0001ö\u0006ÿ÷\u0015ëÍ;\u0006¿\u00147ûñÜ1\u0000ï\u0018Ð%\u0002\u0005ÿß!þóü\fý\u000b\nó\u0002ÃE\u0006ú\u0001ñ\bÁ\u001b%ß\u0018\b\u0002\u0003\u0007Ë!\u0013Ë)õ\u0012\u0000Ù#ò\u0003\u0001\róü\u0003â/÷\u0000\rþ\u000fÒ#\u0003ù\u000eÑ%\tû÷\u000bñþ\u000fÏ\u001e\u0002\u0005ýß%\tóü\u0003ý\u000b\nó\u0002ÃE\u0006ú\u0001ñ\bÁ\u0016!\u0013Î#\u0003ù\fõ\u0001ú\u0004þ\u0002\u0005ýý\u000b\nó\u0002ÃE\u0006ú\u0001ñ\bÁ\u0014\u001f\u0012òß!\u0013Ë)õ\u0012\u0000Ù#ò\u0003\u0001\rþ\u000fÏ,õ\u0001Þ\u001e\u0002\u0005ýß%\t\u0006õõ\u0005\u0003%Ó/\u0000Õ1ï\t\u0006à%÷õë\u0007é\bF\u0001±Fû\u000b\u0000öÿ\u0002\b\b\u00adLù\u0001\u000eµë\u0006ê\bë\u0004ì\bë\bè\b\fþÁ3\u000f\u0000\u0003ó\u0006\rì\r¼;\u0005\u0006ñ\rüó\u000bÂ4Â\u0000÷\u0015ëÍ>õ\rùÇ\u0015)õ\u0012\u0000Ù#ò\u0003\u0001\r\rö\u000eýúûÊ3\u000f\u0000¾\u0013/\u0000×%\u0003óÿ\u000b\u0007þ\u000fÑ3üñ\rüó\u000bç!û\u0003ï\u0006þß%\tóþ\u0011û\u0003\u00074\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ3Ë÷\u0015ëÍ;\u0006¿\u0016\u001d\u0013íè%\u0002\u0005ÿß!þóü\f\u0003ò\u0003à!\u0013\rö\u000eýúûÊHóü\u0012·\u001d\u001a\u0014Ì1ï\t\u0006÷\u0015ëÍ;\u0006¿\u00147ûñÜ1\u0000ï\u0018Ö&ÿü\u0005ÿß!þóü\f\rö\u000eýúûÊA\u0004»\u0017)\bó\týÿÿø\t\u0006þ\u000fÙ\u0014\u0017Ó\u001a\u0014Ê,õ\u0001øþ\u0007þ\u000fÏ)õ\u0012\u0000Ù#ò\u0003\u0001\r5ý\u0013íÎ5ý\u0013íÎ\u0001\u0007ù\u000fñ\u0005\u0005\u001a\u0014ú\u0001û\u0003óò\u001bï\u000f\u0000õ\rþ\u000fÒþñ\u0007\u0014ê\u0005\u0006ó\u0013õ\rïç\u001dù\u0010ï\u0011\u0007×\u0011\u0013ôÝ'ù\bø\t\u0006ÿ\t\u0003\u0004ò4\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ2Ì÷\u0015ëÍ;\u0006¿Fù\u0003ô\u0005\tþ\u000fÜ\"ý\u0001õ\r\u0002\u0005þ\u000fÍ!\u0011üý\tÿñë\u0011\u0013ô\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ3Â\u0000\rö\u000eýúûÊ3\u000f\u0000¾\u0013\"\u0011õ\ró\u000b\u0005Û\u0014\nóü\u0003ë\u000b\tðê\u0017÷\u0015ëÍ;\u0006¿\u0018#\u0003ùê&ÿü\u0005ÿß!þóü\fþ\ré\u001b÷\u000bñ÷\u0015ëÍ;\u0006¿\u001b\u0006ö3ë\u0002\u000b\u0004õ\u0006ÿ\rö\u000eýúûÊFñ\u0013üº&\u0011\u0013üá\u001fõ\u0003\u0007ñ\u0013ôä\u001d\n\u0001þ\u000fÕ%û\u000bõø\u000bÕ/\u0000üýúþ\u0013õ\u0006ÿ÷\u0015ëÍ;\u0006¿\u0018#\u0003ùõ\u0012\u0001Õ%ö\u0001\u0013×\u0017ë\u0003í\b\u0012ý\u0000ó\t\u0006à\u0015\u0004øè\u001c\u0003\u0000ý\n÷\u0015ëÍ;\u0006¿\u0018#\u0003ùß!\u000eð\u000f÷\u0007\u0004û\u0003ûÓ7ûñÜ1\u0000ï\u0018\u0003ò\u0003ß)õ\u0012\u0000\fþÁ3\u000f\u0000\u0003ó\u0006\rì\rûï\u000fó\u0013õ\rïç\u001dù\u0010ï\u0011\u0007Ë%\tóþ\u0011û\u0003÷ü\u000e÷\u0015ëÍ;\u0006¿\u001b%\u0002\u0005ÿß!þóü\f".getBytes("ISO-8859-1"), 0, bArr, 0, 1012);
            onValidateInApp = bArr;
            i = 237;
        } else {
            byte[] bArr2 = new byte[1012];
            System.arraycopy("\u0005õ\u001f\u008b÷\u0015ëÍ;\u0006¿\u00143ñ\u0000ÿ\róÿå%\u0002\u0005ÿß!þóü\f÷\u0015ëÍ>õ\rùÇ%&ú\u0001ñ\b\u0012ý\u0000ó\t\u0006Í/\u0000üýúþ\u0013õ\u0006ÿ\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ5ÀR÷\u0015ëÍ@û\u0006¿\u00147ûñÝ3ñ\u0000ÿ\r\rö\u000eýúûÊA\u0004»\u00143ô\u0003øÀ2ï\r\u0001ö\u0006ÿ÷\u0015ëÍ;\u0006¿\u00147ûñÜ1\u0000ï\u0018Ð%\u0002\u0005ÿß!þóü\fý\u000b\nó\u0002ÃE\u0006ú\u0001ñ\bÁ\u001b%ß\u0018\b\u0002\u0003\u0007Ë!\u0013Ë)õ\u0012\u0000Ù#ò\u0003\u0001\róü\u0003â/÷\u0000\rþ\u000fÒ#\u0003ù\u000eÑ%\tû÷\u000bñþ\u000fÏ\u001e\u0002\u0005ýß%\tóü\u0003ý\u000b\nó\u0002ÃE\u0006ú\u0001ñ\bÁ\u0016!\u0013Î#\u0003ù\fõ\u0001ú\u0004þ\u0002\u0005ýý\u000b\nó\u0002ÃE\u0006ú\u0001ñ\bÁ\u0014\u001f\u0012òß!\u0013Ë)õ\u0012\u0000Ù#ò\u0003\u0001\rþ\u000fÏ,õ\u0001Þ\u001e\u0002\u0005ýß%\t\u0006õõ\u0005\u0003%Ó/\u0000Õ1ï\t\u0006à%÷õë\u0007é\bF\u0001±Fû\u000b\u0000öÿ\u0002\b\b\u00adLù\u0001\u000eµë\u0006ê\bë\u0004ì\bë\bè\b\fþÁ3\u000f\u0000\u0003ó\u0006\rì\r¼;\u0005\u0006ñ\rüó\u000bÂ4Â\u0000÷\u0015ëÍ>õ\rùÇ\u0015)õ\u0012\u0000Ù#ò\u0003\u0001\r\rö\u000eýúûÊ3\u000f\u0000¾\u0013/\u0000×%\u0003óÿ\u000b\u0007þ\u000fÑ3üñ\rüó\u000bç!û\u0003ï\u0006þß%\tóþ\u0011û\u0003\u00074\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ3Ë÷\u0015ëÍ;\u0006¿\u0016\u001d\u0013íè%\u0002\u0005ÿß!þóü\f\u0003ò\u0003à!\u0013\rö\u000eýúûÊHóü\u0012·\u001d\u001a\u0014Ì1ï\t\u0006÷\u0015ëÍ;\u0006¿\u00147ûñÜ1\u0000ï\u0018Ö&ÿü\u0005ÿß!þóü\f\rö\u000eýúûÊA\u0004»\u0017)\bó\týÿÿø\t\u0006þ\u000fÙ\u0014\u0017Ó\u001a\u0014Ê,õ\u0001øþ\u0007þ\u000fÏ)õ\u0012\u0000Ù#ò\u0003\u0001\r5ý\u0013íÎ5ý\u0013íÎ\u0001\u0007ù\u000fñ\u0005\u0005\u001a\u0014ú\u0001û\u0003óò\u001bï\u000f\u0000õ\rþ\u000fÒþñ\u0007\u0014ê\u0005\u0006ó\u0013õ\rïç\u001dù\u0010ï\u0011\u0007×\u0011\u0013ôÝ'ù\bø\t\u0006ÿ\t\u0003\u0004ò4\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ2Ì÷\u0015ëÍ;\u0006¿Fù\u0003ô\u0005\tþ\u000fÜ\"ý\u0001õ\r\u0002\u0005þ\u000fÍ!\u0011üý\tÿñë\u0011\u0013ô\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ3Â\u0000\rö\u000eýúûÊ3\u000f\u0000¾\u0013\"\u0011õ\ró\u000b\u0005Û\u0014\nóü\u0003ë\u000b\tðê\u0017÷\u0015ëÍ;\u0006¿\u0018#\u0003ùê&ÿü\u0005ÿß!þóü\fþ\ré\u001b÷\u000bñ÷\u0015ëÍ;\u0006¿\u001b\u0006ö3ë\u0002\u000b\u0004õ\u0006ÿ\rö\u000eýúûÊFñ\u0013üº&\u0011\u0013üá\u001fõ\u0003\u0007ñ\u0013ôä\u001d\n\u0001þ\u000fÕ%û\u000bõø\u000bÕ/\u0000üýúþ\u0013õ\u0006ÿ÷\u0015ëÍ;\u0006¿\u0018#\u0003ùõ\u0012\u0001Õ%ö\u0001\u0013×\u0017ë\u0003í\b\u0012ý\u0000ó\t\u0006à\u0015\u0004øè\u001c\u0003\u0000ý\n÷\u0015ëÍ;\u0006¿\u0018#\u0003ùß!\u000eð\u000f÷\u0007\u0004û\u0003ûÓ7ûñÜ1\u0000ï\u0018\u0003ò\u0003ß)õ\u0012\u0000\fþÁ3\u000f\u0000\u0003ó\u0006\rì\rûï\u000fó\u0013õ\rïç\u001dù\u0010ï\u0011\u0007Ë%\tóþ\u0011û\u0003÷ü\u000e÷\u0015ëÍ;\u0006¿\u001b%\u0002\u0005ÿß!þóü\f".getBytes("ISO-8859-1"), 0, bArr2, 0, 1012);
            onValidateInApp = bArr2;
            i = 20953;
        }
        AppsFlyerConversionListener = i;
    }

    public static int values(int i) {
        int i2 = onValidateInAppFailure;
        int i3 = ((i2 | 33) << 1) - (i2 ^ 33);
        AppsFlyerLib = i3 % 128;
        Object obj = i3 % 2 == 0 ? onDeepLinking : onDeepLinking;
        AppsFlyerLib = ((i2 + 56) - 1) % 128;
        try {
            int intValue = ((Integer) com_appsflyer_internal_d_java_lang_reflect_Method_invoke(Class.forName($$c((byte) (-onValidateInApp[427]), (short) 643, r7[11]), true, (ClassLoader) onAttributionFailure).getMethod($$c(r7[9], (short) 220, r7[42]), Integer.TYPE), obj, new Object[]{Integer.valueOf(i)})).intValue();
            int i4 = onValidateInAppFailure;
            int i5 = (i4 ^ 125) + ((i4 & 125) << 1);
            AppsFlyerLib = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            return intValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object values(char c, int i, int i2) {
        int i3 = AppsFlyerLib;
        int i4 = ((i3 ^ 109) + ((i3 & 109) << 1)) % 128;
        onValidateInAppFailure = i4;
        Object obj = onDeepLinking;
        AppsFlyerLib = ((i4 + 36) - 1) % 128;
        try {
            Object[] objArr = {Character.valueOf(c), Integer.valueOf(i), Integer.valueOf(i2)};
            byte[] bArr = onValidateInApp;
            Class<?> cls = Class.forName($$c((byte) (-bArr[427]), (short) 643, bArr[11]), true, (ClassLoader) onAttributionFailure);
            String $$c = $$c(bArr[66], (short) 692, (byte) (-bArr[111]));
            Class<?> cls2 = Integer.TYPE;
            Object com_appsflyer_internal_d_java_lang_reflect_Method_invoke = com_appsflyer_internal_d_java_lang_reflect_Method_invoke(cls.getMethod($$c, Character.TYPE, cls2, cls2), obj, objArr);
            int i5 = AppsFlyerLib;
            onValidateInAppFailure = ((i5 ^ 13) + ((i5 & 13) << 1)) % 128;
            return com_appsflyer_internal_d_java_lang_reflect_Method_invoke;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|2|3|(1:5)(1:779)|6|7|8|(29:10|11|12|13|14|16|17|18|(1:20)(1:(1:752)(3:753|754|755))|(1:22)(5:734|735|736|737|738)|(4:25|26|27|28)|36|37|38|39|40|(1:42)(1:726)|43|(1:45)(1:725)|46|(1:48)(1:724)|49|(2:51|(6:53|54|(1:56)(1:722)|57|58|(4:59|(17:61|62|63|(2:65|66)(1:710)|67|(7:(3:82|83|(1:85))|70|71|72|73|74|76)|(9:566|567|568|569|570|571|572|573|(3:574|(6:575|576|577|(2:(7:579|580|581|(1:690)(1:586)|587|588|589)(3:693|694|695)|590)|594|(3:677|678|(1:(1:1)(4:(2:(3:608|609|(1:614)(3:611|612|613))(3:604|605|606)|607)(1:617)|615|616|607))(1:620))(1:(4:597|598|599|(0)(0))(2:(3:628|629|630)(8:637|638|639|640|642|643|644|645)|(0)(0))))|619))(1:93)|94|95|96|97|98|100|101|102|103|(14:104|105|106|107|108|(3:110|111|112)(12:506|507|508|509|510|511|512|513|514|515|516|517)|113|114|115|(40:117|118|119|(3:121|122|123)(1:357)|124|125|126|127|128|(5:129|130|131|(3:134|135|136)(0)|165)|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|(4:185|186|187|188)|195|196|197|198|199|200|201|203|204|(3:206|207|(15:209|210|(1:212)(1:245)|213|214|215|216|217|218|219|220|221|222|223|224)(1:268))(1:275))(32:359|360|361|362|363|364|365|366|(4:367|368|369|(3:371|372|(4:376|377|378|380)(2:477|386))(1:478))|387|388|389|391|392|393|394|395|396|397|398|399|400|401|402|403|404|(3:406|407|409)|422|423|424|(5:426|(2:428|429)|430|431|432)(1:440)|(0)(0))|563|248|(4:251|252|(2:255|256)(1:254)|249)|257))|712|(1:718)(1:716))))|723|54|(0)(0)|57|58|(5:59|(0)|712|(3:714|717|718)(2:719|720)|716))|772|773|(5:(1:438)|(0)|(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x1567, code lost:
    
        r3 = com.appsflyer.internal.d.onValidateInApp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x15ac, code lost:
    
        throw ((java.lang.Throwable) java.lang.Class.forName($$c(r3[45], (short) 184, r3[16])).getDeclaredConstructor(java.lang.String.class, java.lang.Throwable.class).newInstance($$c(r3[238(0xee, float:3.34E-43)], (short) 677, r3[65]), r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x15ad, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x15ae, code lost:
    
        r0 = r1.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x15b2, code lost:
    
        if (r0 != null) goto L576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x15b4, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x15b5, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0db1, code lost:
    
        if (com.appsflyer.internal.d.onAttributionFailure == null) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:686:0x0754, code lost:
    
        r8 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:767:0x00e3, code lost:
    
        if (r6 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:771:0x00c2, code lost:
    
        if (r6 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:774:0x00a0, code lost:
    
        if (r6 == null) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:209:0x1152 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x136a A[EDGE_INSN: B:268:0x136a->B:269:0x136a BREAK  A[LOOP:0: B:59:0x036e->B:716:0x1564, LOOP_LABEL: LOOP:0: B:59:0x036e->B:716:0x1564], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x068a A[EDGE_INSN: B:601:0x068a->B:618:0x068c BREAK  A[LOOP:7: B:575:0x0494->B:607:0x0494]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x0776 A[EDGE_INSN: B:620:0x0776->B:94:0x0776 BREAK  A[LOOP:6: B:574:0x0493->B:619:0x068c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:714:0x155e  */
    /* JADX WARN: Removed duplicated region for block: B:719:0x1566 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:722:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:724:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:725:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:726:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:734:0x012d A[Catch: Exception -> 0x15da, TRY_ENTER, TRY_LEAVE, TryCatch #21 {Exception -> 0x15da, blocks: (B:3:0x000f, B:5:0x0028, B:25:0x01ec, B:31:0x0248, B:33:0x024e, B:35:0x024f, B:38:0x0280, B:40:0x02fd, B:43:0x0332, B:46:0x033b, B:49:0x0346, B:54:0x0358, B:57:0x036a, B:59:0x036e, B:252:0x1548, B:256:0x154c, B:254:0x1552, B:258:0x1567, B:264:0x15ae, B:266:0x15b4, B:267:0x15b5, B:712:0x1556, B:730:0x15b7, B:732:0x15bd, B:733:0x15be, B:734:0x012d, B:741:0x15c0, B:743:0x15c6, B:744:0x15c7, B:747:0x15c9, B:749:0x15cf, B:750:0x15d0, B:753:0x01a4, B:758:0x15d2, B:760:0x15d8, B:761:0x15d9, B:260:0x157a, B:261:0x15ac, B:37:0x0250, B:738:0x0171, B:28:0x020c, B:736:0x013a, B:755:0x01c6), top: B:2:0x000f, inners: #9, #20, #25, #34, #35, #43 }] */
    /* JADX WARN: Removed duplicated region for block: B:751:0x0196  */
    /* JADX WARN: Type inference failed for: r0v713, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r0v740, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Constructor] */
    /* JADX WARN: Type inference failed for: r10v23, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v23, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r13v32, types: [int, byte] */
    /* JADX WARN: Type inference failed for: r13v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r13v41 */
    /* JADX WARN: Type inference failed for: r13v42 */
    /* JADX WARN: Type inference failed for: r13v43 */
    /* JADX WARN: Type inference failed for: r13v44 */
    /* JADX WARN: Type inference failed for: r13v45 */
    /* JADX WARN: Type inference failed for: r13v46 */
    /* JADX WARN: Type inference failed for: r13v47 */
    /* JADX WARN: Type inference failed for: r13v48 */
    /* JADX WARN: Type inference failed for: r13v49 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v50 */
    /* JADX WARN: Type inference failed for: r13v51 */
    /* JADX WARN: Type inference failed for: r13v52 */
    /* JADX WARN: Type inference failed for: r13v53 */
    /* JADX WARN: Type inference failed for: r13v54 */
    /* JADX WARN: Type inference failed for: r13v55 */
    /* JADX WARN: Type inference failed for: r13v56 */
    /* JADX WARN: Type inference failed for: r13v57 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r1v244, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v97, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v55, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r3v58, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v61, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Constructor] */
    /* JADX WARN: Type inference failed for: r3v88, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v90, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v66, types: [java.lang.Object[]] */
    static {
        /*
            Method dump skipped, instructions count: 5601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.d.<clinit>():void");
    }
}
