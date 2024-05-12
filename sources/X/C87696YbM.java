package X;

import android.graphics.Matrix;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.utils.ColorUtils;
import defpackage.a1;
import defpackage.i0;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.zip.GZIPInputStream;
import org.xml.sax.Attributes;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.YbM, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87696YbM {
    public C87698YbO LIZ;
    public InterfaceC87720Ybk LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;

    public static C87637YaP LJIIIZ(String str) {
        try {
            return new C87637YaP(ColorUtils.LIZ(str));
        } catch (Exception e) {
            throw new VU3(e.toString());
        }
    }

    public static AbstractC87636YaO LJIIJ(String str) {
        str.getClass();
        if (!str.equals(LiveGiftNewGifterBadgeSetting.DEFAULT)) {
            if (!str.equals("currentColor")) {
                try {
                    return LJIIIZ(str);
                } catch (VU3 unused) {
                    return null;
                }
            }
            return C87638YaQ.LJLIL;
        }
        return C87637YaP.LJLJI;
    }

    public static float LJIIL(String str) {
        int length = str.length();
        if (length != 0) {
            return LJIIJJI(length, str);
        }
        throw new VU3("Invalid float value (empty string)");
    }

    public static C87650Yac LJIILIIL(String str) {
        if (str.length() != 0) {
            int length = str.length();
            EnumC87634YaM enumC87634YaM = EnumC87634YaM.px;
            int i = length - 1;
            char charAt = str.charAt(i);
            try {
                if (charAt == '%') {
                    enumC87634YaM = EnumC87634YaM.percent;
                } else {
                    if (str.endsWith("rpx")) {
                        enumC87634YaM = EnumC87634YaM.rpx;
                    } else if (str.endsWith("rem")) {
                        enumC87634YaM = EnumC87634YaM.rem;
                    } else {
                        if (str.endsWith("em")) {
                            enumC87634YaM = EnumC87634YaM.em;
                            length -= 2;
                        } else if (length > 2 && Character.isLetter(charAt)) {
                            i = length - 2;
                            if (Character.isLetter(str.charAt(i))) {
                                try {
                                    enumC87634YaM = EnumC87634YaM.valueOf(str.substring(i).toLowerCase(Locale.US));
                                } catch (IllegalArgumentException unused) {
                                    throw new VU3(i0.LJFF("Invalid length unit specifier: ", str));
                                }
                            }
                        }
                        return new C87650Yac(LJIIJJI(length, str), enumC87634YaM);
                    }
                    length -= 3;
                    return new C87650Yac(LJIIJJI(length, str), enumC87634YaM);
                }
                return new C87650Yac(LJIIJJI(length, str), enumC87634YaM);
            } catch (NumberFormatException e) {
                throw new VU3(i0.LJFF("Invalid length value: ", str), e);
            }
            length = i;
        } else {
            throw new VU3("Invalid length value (empty string)");
        }
    }

    public static C87650Yac LJIILJJIL(C87693YbJ c87693YbJ) {
        int i = c87693YbJ.LIZIZ;
        if (i <= c87693YbJ.LIZJ - 4 && c87693YbJ.LIZ.substring(i, i + 4).equals("auto")) {
            c87693YbJ.LIZIZ += 4;
            return new C87650Yac();
        }
        return c87693YbJ.LJII();
    }

    public static Float LJIILL(String str) {
        try {
            float LJIIL = LJIIL(str);
            if (LJIIL < 0.0f) {
                LJIIL = 0.0f;
            } else if (LJIIL > 1.0f) {
                LJIIL = 1.0f;
            }
            return Float.valueOf(LJIIL);
        } catch (VU3 unused) {
            return null;
        }
    }

    public static AbstractC87636YaO LJIILLIIL(String str) {
        if (str.startsWith("url(")) {
            int indexOf = str.indexOf(")");
            AbstractC87636YaO abstractC87636YaO = null;
            if (indexOf != -1) {
                String trim = str.substring(4, indexOf).trim();
                String trim2 = str.substring(indexOf + 1).trim();
                if (trim2.length() > 0) {
                    abstractC87636YaO = LJIIJ(trim2);
                }
                return new C87635YaN(trim, abstractC87636YaO);
            }
            return new C87635YaN(str.substring(4).trim(), null);
        }
        return LJIIJ(str);
    }

    public static Matrix LJIJ(String str) {
        char c;
        Matrix matrix = new Matrix();
        C87693YbJ c87693YbJ = new C87693YbJ(str);
        c87693YbJ.LJIIJJI();
        while (!c87693YbJ.LJ()) {
            if (!c87693YbJ.LJ()) {
                int i = c87693YbJ.LIZIZ;
                int charAt = c87693YbJ.LIZ.charAt(i);
                while (true) {
                    if (charAt >= 97) {
                        if (charAt <= 122) {
                            charAt = c87693YbJ.LIZ();
                        }
                    } else if (charAt >= 65 && charAt <= 90) {
                        charAt = c87693YbJ.LIZ();
                    }
                }
                int i2 = c87693YbJ.LIZIZ;
                while (C87693YbJ.LJFF(charAt)) {
                    charAt = c87693YbJ.LIZ();
                }
                if (charAt == 40) {
                    c87693YbJ.LIZIZ++;
                    String substring = c87693YbJ.LIZ.substring(i, i2);
                    if (substring != null) {
                        switch (substring.hashCode()) {
                            case -1081239615:
                                if (substring.equals("matrix")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case -925180581:
                                if (substring.equals("rotate")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 109250890:
                                if (substring.equals("scale")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case 109493390:
                                if (substring.equals("skewX")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 109493391:
                                if (substring.equals("skewY")) {
                                    c = 4;
                                    break;
                                }
                                break;
                            case 1052832078:
                                if (substring.equals("translate")) {
                                    c = 5;
                                    break;
                                }
                                break;
                        }
                        c = 65535;
                        if (c != 0) {
                            if (c != 1) {
                                if (c != 2) {
                                    if (c != 3) {
                                        if (c != 4) {
                                            if (c == 5) {
                                                c87693YbJ.LJIIJJI();
                                                float LJI = c87693YbJ.LJI();
                                                float LJIIIZ = c87693YbJ.LJIIIZ();
                                                c87693YbJ.LJIIJJI();
                                                if (!Float.isNaN(LJI) && c87693YbJ.LIZLLL(')')) {
                                                    if (Float.isNaN(LJIIIZ)) {
                                                        matrix.preTranslate(LJI, 0.0f);
                                                    } else {
                                                        matrix.preTranslate(LJI, LJIIIZ);
                                                    }
                                                } else {
                                                    throw new VU3(i0.LJFF("Invalid transform list: ", str));
                                                }
                                            } else {
                                                throw new VU3(a1.LJ("Invalid transform list fn: ", substring, ")"));
                                            }
                                        } else {
                                            c87693YbJ.LJIIJJI();
                                            float LJI2 = c87693YbJ.LJI();
                                            c87693YbJ.LJIIJJI();
                                            if (!Float.isNaN(LJI2) && c87693YbJ.LIZLLL(')')) {
                                                matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(LJI2)));
                                            } else {
                                                throw new VU3(i0.LJFF("Invalid transform list: ", str));
                                            }
                                        }
                                    } else {
                                        c87693YbJ.LJIIJJI();
                                        float LJI3 = c87693YbJ.LJI();
                                        c87693YbJ.LJIIJJI();
                                        if (!Float.isNaN(LJI3) && c87693YbJ.LIZLLL(')')) {
                                            matrix.preSkew((float) Math.tan(Math.toRadians(LJI3)), 0.0f);
                                        } else {
                                            throw new VU3(i0.LJFF("Invalid transform list: ", str));
                                        }
                                    }
                                } else {
                                    c87693YbJ.LJIIJJI();
                                    float LJI4 = c87693YbJ.LJI();
                                    float LJIIIZ2 = c87693YbJ.LJIIIZ();
                                    c87693YbJ.LJIIJJI();
                                    if (!Float.isNaN(LJI4) && c87693YbJ.LIZLLL(')')) {
                                        if (Float.isNaN(LJIIIZ2)) {
                                            matrix.preScale(LJI4, LJI4);
                                        } else {
                                            matrix.preScale(LJI4, LJIIIZ2);
                                        }
                                    } else {
                                        throw new VU3(i0.LJFF("Invalid transform list: ", str));
                                    }
                                }
                            } else {
                                c87693YbJ.LJIIJJI();
                                float LJI5 = c87693YbJ.LJI();
                                float LJIIIZ3 = c87693YbJ.LJIIIZ();
                                float LJIIIZ4 = c87693YbJ.LJIIIZ();
                                c87693YbJ.LJIIJJI();
                                if (!Float.isNaN(LJI5) && c87693YbJ.LIZLLL(')')) {
                                    if (Float.isNaN(LJIIIZ3)) {
                                        matrix.preRotate(LJI5);
                                    } else if (!Float.isNaN(LJIIIZ4)) {
                                        matrix.preRotate(LJI5, LJIIIZ3, LJIIIZ4);
                                    } else {
                                        throw new VU3(i0.LJFF("Invalid transform list: ", str));
                                    }
                                } else {
                                    throw new VU3(i0.LJFF("Invalid transform list: ", str));
                                }
                            }
                        } else {
                            c87693YbJ.LJIIJJI();
                            float LJI6 = c87693YbJ.LJI();
                            c87693YbJ.LJIIJ();
                            float LJI7 = c87693YbJ.LJI();
                            c87693YbJ.LJIIJ();
                            float LJI8 = c87693YbJ.LJI();
                            c87693YbJ.LJIIJ();
                            float LJI9 = c87693YbJ.LJI();
                            c87693YbJ.LJIIJ();
                            float LJI10 = c87693YbJ.LJI();
                            c87693YbJ.LJIIJ();
                            float LJI11 = c87693YbJ.LJI();
                            c87693YbJ.LJIIJJI();
                            if (!Float.isNaN(LJI11) && c87693YbJ.LIZLLL(')')) {
                                Matrix matrix2 = new Matrix();
                                matrix2.setValues(new float[]{LJI6, LJI8, LJI10, LJI7, LJI9, LJI11, 0.0f, 0.0f, 1.0f});
                                matrix.preConcat(matrix2);
                            } else {
                                throw new VU3(i0.LJFF("Invalid transform list: ", str));
                            }
                        }
                        if (c87693YbJ.LJ()) {
                            return matrix;
                        }
                        c87693YbJ.LJIIJ();
                    }
                }
            }
            throw new VU3(i0.LJFF("Bad transform function encountered in transform list: ", str));
        }
        return matrix;
    }

    public final C87698YbO LIZJ(InputStream inputStream) {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int read = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (read == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            LJIJI(inputStream);
            return this.LIZ;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
        }
    }

    public final void LJIJI(InputStream inputStream) {
        try {
            XmlPullParser newPullParser = android.util.Xml.newPullParser();
            C37113EhR c37113EhR = new C37113EhR(newPullParser);
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", true);
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            newPullParser.setInput(inputStream, "utf-8");
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.nextToken()) {
                if (eventType != 0) {
                    if (eventType != 2) {
                        if (eventType == 3) {
                            String name = newPullParser.getName();
                            if (newPullParser.getPrefix() != null) {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append(newPullParser.getPrefix());
                                LIZ.append(':');
                                LIZ.append(name);
                                name = X1D.LIZIZ(LIZ);
                            }
                            LIZIZ(newPullParser.getNamespace(), newPullParser.getName(), name);
                        }
                    } else {
                        String name2 = newPullParser.getName();
                        if (newPullParser.getPrefix() != null) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append(newPullParser.getPrefix());
                            LIZ2.append(':');
                            LIZ2.append(name2);
                            name2 = X1D.LIZIZ(LIZ2);
                        }
                        LJIJJLI(newPullParser.getNamespace(), newPullParser.getName(), name2, c37113EhR);
                    }
                } else {
                    this.LIZ = new C87698YbO();
                }
            }
        } catch (XmlPullParserException e) {
            throw new VU3("XML parser problem", e);
        } catch (Exception e2) {
            throw new VU3("unexpected error", e2);
        }
    }

    public static void LIZ(String str, Object... objArr) {
        LLog.LIZLLL(1, "SVGParser", C16880lQ.LLLZ(str, objArr));
    }

    public static void LIZLLL(AbstractC87705YbV abstractC87705YbV, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                abstractC87705YbV.LIZJ = attributes.getValue(i).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String trim = attributes.getValue(i).trim();
                if ("default".equals(trim)) {
                    abstractC87705YbV.LIZLLL = Boolean.FALSE;
                    return;
                } else {
                    if ("preserve".equals(trim)) {
                        abstractC87705YbV.LIZLLL = Boolean.TRUE;
                        return;
                    }
                    throw new VU3(i0.LJFF("Invalid value for \"xml:space\" attribute: ", trim));
                }
            }
        }
    }

    public static void LJ(AbstractC87700YbQ abstractC87700YbQ, C37113EhR c37113EhR) {
        for (int i = 0; i < c37113EhR.getLength(); i++) {
            String trim = c37113EhR.getValue(i).trim();
            int ordinal = EnumC79794VTi.LIZJ(c37113EhR.getLocalName(i)).ordinal();
            if (ordinal != 17) {
                if (ordinal != 18) {
                    if (ordinal != 20) {
                        if (ordinal != 39) {
                            continue;
                        } else {
                            try {
                                abstractC87700YbQ.LJIIIZ = VWP.valueOf(trim);
                            } catch (IllegalArgumentException unused) {
                                throw new VU3(a1.LJ("Invalid spreadMethod attribute. \"", trim, "\" is not a valid value."));
                            }
                        }
                    } else if ("".equals(c37113EhR.getURI(i)) || "http://www.w3.org/1999/xlink".equals(c37113EhR.getURI(i))) {
                        abstractC87700YbQ.LJIIJ = trim;
                    }
                } else if ("objectBoundingBox".equals(trim)) {
                    abstractC87700YbQ.LJII = Boolean.FALSE;
                } else if ("userSpaceOnUse".equals(trim)) {
                    abstractC87700YbQ.LJII = Boolean.TRUE;
                } else {
                    throw new VU3("Invalid value for attribute gradientUnits");
                }
            } else {
                abstractC87700YbQ.LJIIIIZZ = LJIJ(trim);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0128 A[EDGE_INSN: B:106:0x0128->B:96:0x0128 BREAK  A[LOOP:3: B:91:0x0120->B:99:0x0135], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0135 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(X.AbstractC87705YbV r11, org.xml.sax.Attributes r12) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87696YbM.LJI(X.YbV, org.xml.sax.Attributes):void");
    }

    public static void LJII(InterfaceC87728Ybs interfaceC87728Ybs, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (EnumC79794VTi.LIZJ(attributes.getLocalName(i)) == EnumC79794VTi.transform) {
                interfaceC87728Ybs.LIZJ(LJIJ(attributes.getValue(i)));
            }
        }
    }

    public static void LJIIIIZZ(AbstractC87725Ybp abstractC87725Ybp, C37113EhR c37113EhR) {
        for (int i = 0; i < c37113EhR.getLength(); i++) {
            String trim = c37113EhR.getValue(i).trim();
            int ordinal = EnumC79794VTi.LIZJ(c37113EhR.getLocalName(i)).ordinal();
            if (ordinal != 31) {
                if (ordinal != 56) {
                    continue;
                } else {
                    C87693YbJ c87693YbJ = new C87693YbJ(trim);
                    c87693YbJ.LJIIJJI();
                    float LIZIZ = VPR.LIZIZ(c87693YbJ.LJIIIIZZ(), 0.0f);
                    c87693YbJ.LJIIJ();
                    float LIZIZ2 = VPR.LIZIZ(c87693YbJ.LJIIIIZZ(), 0.0f);
                    c87693YbJ.LJIIJ();
                    float LIZIZ3 = VPR.LIZIZ(c87693YbJ.LJIIIIZZ(), 0.0f);
                    c87693YbJ.LJIIJ();
                    float LIZIZ4 = VPR.LIZIZ(c87693YbJ.LJIIIIZZ(), 0.0f);
                    if (!Float.isNaN(LIZIZ) && !Float.isNaN(LIZIZ2) && !Float.isNaN(LIZIZ3) && !Float.isNaN(LIZIZ4)) {
                        if (LIZIZ3 >= 0.0f) {
                            if (LIZIZ4 >= 0.0f) {
                                abstractC87725Ybp.LJIIIZ = new VU6(LIZIZ, LIZIZ2, LIZIZ3, LIZIZ4);
                            } else {
                                throw new VU3("Invalid viewBox. height cannot be negative");
                            }
                        } else {
                            throw new VU3("Invalid viewBox. width cannot be negative");
                        }
                    } else {
                        throw new VU3("Invalid viewBox definition - should have four numbers");
                    }
                }
            } else {
                LJIIZILJ(abstractC87725Ybp, trim);
            }
        }
    }

    public static float LJIIJJI(int i, String str) {
        float LIZ = new C87694YbK().LIZ(0, i, str);
        if (!Float.isNaN(LIZ)) {
            return LIZ;
        }
        throw new VU3(i0.LJFF("Invalid float value: ", str));
    }

    public static void LJIIZILJ(AbstractC87723Ybn abstractC87723Ybn, String str) {
        YZC yzc;
        C87693YbJ c87693YbJ = new C87693YbJ(str);
        c87693YbJ.LJIIJJI();
        String LJIIIIZZ = c87693YbJ.LJIIIIZZ();
        if ("defer".equals(LJIIIIZZ)) {
            c87693YbJ.LJIIJJI();
            LJIIIIZZ = c87693YbJ.LJIIIIZZ();
        }
        YZH yzh = (YZH) ((HashMap) YZI.LIZ).get(LJIIIIZZ);
        c87693YbJ.LJIIJJI();
        if (!c87693YbJ.LJ()) {
            String LJIIIIZZ2 = c87693YbJ.LJIIIIZZ();
            LJIIIIZZ2.getClass();
            if (!LJIIIIZZ2.equals("meet")) {
                if (LJIIIIZZ2.equals("slice")) {
                    yzc = YZC.slice;
                } else {
                    throw new VU3(i0.LJFF("Invalid preserveAspectRatio definition: ", str));
                }
            } else {
                yzc = YZC.meet;
            }
        } else {
            yzc = null;
        }
        abstractC87723Ybn.LJIIIIZZ = new YZD(yzh, yzc);
    }

    public static void LJFF(C87719Ybj c87719Ybj, C37113EhR c37113EhR, String str) {
        for (int i = 0; i < c37113EhR.getLength(); i++) {
            if (EnumC79794VTi.LIZJ(c37113EhR.getLocalName(i)) == EnumC79794VTi.points) {
                C87693YbJ c87693YbJ = new C87693YbJ(c37113EhR.getValue(i));
                ArrayList arrayList = new ArrayList();
                c87693YbJ.LJIIJJI();
                while (!c87693YbJ.LJ()) {
                    float LJI = c87693YbJ.LJI();
                    if (!Float.isNaN(LJI)) {
                        c87693YbJ.LJIIJ();
                        float LJI2 = c87693YbJ.LJI();
                        if (!Float.isNaN(LJI2)) {
                            c87693YbJ.LJIIJ();
                            arrayList.add(Float.valueOf(LJI));
                            arrayList.add(Float.valueOf(LJI2));
                        } else {
                            throw new VU3(a1.LJ("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                        }
                    } else {
                        throw new VU3(a1.LJ("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                }
                c87719Ybj.LJIIIIZZ = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    c87719Ybj.LJIIIIZZ[i2] = ((Float) it.next()).floatValue();
                    i2++;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:195:0x02e0, code lost:
    
        if (r11.equals("hidden") == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x02ec, code lost:
    
        r6 = java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x02e9, code lost:
    
        if (r11.equals("scroll") == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x02f3, code lost:
    
        if (r11.equals("auto") == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x02fd, code lost:
    
        r6 = java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x02fa, code lost:
    
        if (r11.equals("visible") == false) goto L150;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIJJ(X.C87699YbP r9, java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 1112
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87696YbM.LJIJJ(X.YbP, java.lang.String, java.lang.String):void");
    }

    public final void LIZIZ(String str, String str2, String str3) {
        if (this.LIZJ) {
            int i = this.LIZLLL - 1;
            this.LIZLLL = i;
            if (i == 0) {
                this.LIZJ = false;
                return;
            }
            return;
        }
        if (!"http://www.w3.org/2000/svg".equals(str) && !"".equals(str)) {
            return;
        }
        if (str2.length() <= 0) {
            str2 = str3;
        }
        EnumC81650W2s enumC81650W2s = (EnumC81650W2s) ((HashMap) EnumC81650W2s.LJLILLLLZI).get(str2);
        if (enumC81650W2s == null) {
            enumC81650W2s = EnumC81650W2s.UNSUPPORTED;
        }
        int ordinal = enumC81650W2s.ordinal();
        if (ordinal != 0 && ordinal != 8 && ordinal != 10 && ordinal != 13 && ordinal != 2 && ordinal != 3 && ordinal != 5 && ordinal != 6) {
            switch (ordinal) {
                case 15:
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                case 17:
                    break;
                default:
                    return;
            }
        }
        Object obj = this.LIZIZ;
        if (obj != null) {
            this.LIZIZ = ((C87721Ybl) obj).LIZIZ;
            return;
        }
        throw new VU3(C16880lQ.LLLZ("Unbalanced end element </%s> found", new Object[]{str2}));
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x02b4, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0099, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x06ca, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x086a, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:611:0x09a5, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:269:0x046e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x043a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJLI(java.lang.String r26, java.lang.String r27, java.lang.String r28, X.C37113EhR r29) {
        /*
            Method dump skipped, instructions count: 3026
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87696YbM.LJIJJLI(java.lang.String, java.lang.String, java.lang.String, X.EhR):void");
    }
}
