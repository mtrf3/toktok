package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.QsW, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68376QsW implements Iterable, InterfaceC68379QsZ {
    public final String LJLIL;

    @Override // X.InterfaceC68379QsZ
    public final String LJII() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC68379QsZ
    public final Iterator LJIIJ() {
        return new C68400Qsu(this);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C68396Qsq(this);
    }

    @Override // X.InterfaceC68379QsZ
    public final Boolean LIZJ() {
        return Boolean.valueOf(!this.LJLIL.isEmpty());
    }

    @Override // X.InterfaceC68379QsZ
    public final InterfaceC68379QsZ LIZLLL() {
        return new C68376QsW(this.LJLIL);
    }

    @Override // X.InterfaceC68379QsZ
    public final Double LJI() {
        if (this.LJLIL.isEmpty()) {
            return Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
        }
        try {
            return CastDoubleProtector.valueOf(this.LJLIL);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    public final String toString() {
        return "\"" + this.LJLIL + "\"";
    }

    public C68376QsW(String str) {
        if (str != null) {
            this.LJLIL = str;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C68376QsW)) {
            return false;
        }
        return this.LJLIL.equals(((C68376QsW) obj).LJLIL);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC68379QsZ
    public final InterfaceC68379QsZ LJIILJJIL(String str, C68377QsX c68377QsX, List list) {
        char c;
        int i;
        int i2;
        double doubleValue;
        double doubleValue2;
        double LIZ;
        String LJII;
        double d;
        double min;
        double length;
        double min2;
        long j;
        int i3;
        int i4;
        int i5;
        int length2;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str) || "trim".equals(str)) {
            switch (str.hashCode()) {
                case -1789698943:
                    if (str.equals("hasOwnProperty")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1776922004:
                    if (str.equals("toString")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case -1464939364:
                    if (str.equals("toLocaleLowerCase")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -1361633751:
                    if (str.equals("charAt")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1354795244:
                    if (str.equals("concat")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1137582698:
                    if (str.equals("toLowerCase")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case -906336856:
                    if (str.equals("search")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -726908483:
                    if (str.equals("toLocaleUpperCase")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -467511597:
                    if (str.equals("lastIndexOf")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -399551817:
                    if (str.equals("toUpperCase")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 3568674:
                    if (str.equals("trim")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 103668165:
                    if (str.equals("match")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 109526418:
                    if (str.equals("slice")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 109648666:
                    if (str.equals("split")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 530542161:
                    if (str.equals("substring")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 1094496948:
                    if (str.equals("replace")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1943291465:
                    if (str.equals("indexOf")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            String str2 = "undefined";
            switch (c) {
                case 0:
                    C68368QsO.LJIIIZ(1, "charAt", list);
                    if (!((ArrayList) list).isEmpty()) {
                        i = (int) C68368QsO.LIZ(c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 0)).LJI().doubleValue());
                    } else {
                        i = 0;
                    }
                    String str3 = this.LJLIL;
                    if (i < 0 || i >= str3.length()) {
                        return InterfaceC68379QsZ.LJIIZILJ;
                    }
                    return new C68376QsW(String.valueOf(str3.charAt(i)));
                case 1:
                    ArrayList arrayList = (ArrayList) list;
                    if (!arrayList.isEmpty()) {
                        StringBuilder sb = new StringBuilder(this.LJLIL);
                        for (int i6 = 0; i6 < arrayList.size(); i6++) {
                            sb.append(c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, i6)).LJII());
                        }
                        return new C68376QsW(sb.toString());
                    }
                    break;
                case 2:
                    C68368QsO.LJII(1, "hasOwnProperty", list);
                    String str4 = this.LJLIL;
                    InterfaceC68379QsZ LIZIZ = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 0));
                    if ("length".equals(LIZIZ.LJII())) {
                        return InterfaceC68379QsZ.LJIILL;
                    }
                    double doubleValue3 = LIZIZ.LJI().doubleValue();
                    if (doubleValue3 == Math.floor(doubleValue3) && (i2 = (int) doubleValue3) >= 0 && i2 < str4.length()) {
                        return InterfaceC68379QsZ.LJIILL;
                    }
                    return InterfaceC68379QsZ.LJIILLIIL;
                case 3:
                    C68368QsO.LJIIIZ(2, "indexOf", list);
                    String str5 = this.LJLIL;
                    ArrayList arrayList2 = (ArrayList) list;
                    if (arrayList2.size() > 0) {
                        str2 = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 0)).LJII();
                    }
                    if (arrayList2.size() < 2) {
                        doubleValue = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                    } else {
                        doubleValue = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1)).LJI().doubleValue();
                    }
                    return new C68366QsM(Double.valueOf(str5.indexOf(str2, (int) C68368QsO.LIZ(doubleValue))));
                case 4:
                    C68368QsO.LJIIIZ(2, "lastIndexOf", list);
                    String str6 = this.LJLIL;
                    ArrayList arrayList3 = (ArrayList) list;
                    if (arrayList3.size() > 0) {
                        str2 = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 0)).LJII();
                    }
                    if (arrayList3.size() < 2) {
                        doubleValue2 = Double.NaN;
                    } else {
                        doubleValue2 = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1)).LJI().doubleValue();
                    }
                    if (Double.isNaN(doubleValue2)) {
                        LIZ = Double.POSITIVE_INFINITY;
                    } else {
                        LIZ = C68368QsO.LIZ(doubleValue2);
                    }
                    return new C68366QsM(Double.valueOf(str6.lastIndexOf(str2, (int) LIZ)));
                case 5:
                    C68368QsO.LJIIIZ(1, "match", list);
                    String str7 = this.LJLIL;
                    if (((ArrayList) list).size() <= 0) {
                        LJII = "";
                    } else {
                        LJII = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 0)).LJII();
                    }
                    Matcher matcher = PatternProtector.compile(LJII).matcher(str7);
                    if (matcher.find()) {
                        return new C68375QsV(Arrays.asList(new C68376QsW(matcher.group())));
                    }
                    return InterfaceC68379QsZ.LJIIJJI;
                case 6:
                    C68368QsO.LJIIIZ(2, "replace", list);
                    InterfaceC68379QsZ interfaceC68379QsZ = InterfaceC68379QsZ.LJIIJ;
                    ArrayList arrayList4 = (ArrayList) list;
                    if (!arrayList4.isEmpty()) {
                        str2 = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 0)).LJII();
                        if (arrayList4.size() > 1) {
                            interfaceC68379QsZ = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1));
                        }
                    }
                    String str8 = this.LJLIL;
                    int indexOf = str8.indexOf(str2);
                    if (indexOf >= 0) {
                        if (interfaceC68379QsZ instanceof AbstractC68364QsK) {
                            interfaceC68379QsZ = ((AbstractC68364QsK) interfaceC68379QsZ).LIZ(c68377QsX, Arrays.asList(new C68376QsW(str2), new C68366QsM(Double.valueOf(indexOf)), this));
                        }
                        return new C68376QsW(str8.substring(0, indexOf) + interfaceC68379QsZ.LJII() + str8.substring(str2.length() + indexOf));
                    }
                    break;
                case 7:
                    C68368QsO.LJIIIZ(1, "search", list);
                    if (!((ArrayList) list).isEmpty()) {
                        str2 = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 0)).LJII();
                    }
                    if (PatternProtector.compile(str2).matcher(this.LJLIL).find()) {
                        return new C68366QsM(Double.valueOf(r1.start()));
                    }
                    return new C68366QsM(Double.valueOf(-1.0d));
                case '\b':
                    C68368QsO.LJIIIZ(2, "slice", list);
                    String str9 = this.LJLIL;
                    ArrayList arrayList5 = (ArrayList) list;
                    if (!arrayList5.isEmpty()) {
                        d = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 0)).LJI().doubleValue();
                    } else {
                        d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                    }
                    double LIZ2 = C68368QsO.LIZ(d);
                    if (LIZ2 < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                        min = Math.max(str9.length() + LIZ2, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
                    } else {
                        min = Math.min(LIZ2, str9.length());
                    }
                    int i7 = (int) min;
                    if (arrayList5.size() > 1) {
                        length = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1)).LJI().doubleValue();
                    } else {
                        length = str9.length();
                    }
                    double LIZ3 = C68368QsO.LIZ(length);
                    if (LIZ3 < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                        min2 = Math.max(str9.length() + LIZ3, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
                    } else {
                        min2 = Math.min(LIZ3, str9.length());
                    }
                    return new C68376QsW(str9.substring(i7, Math.max(0, ((int) min2) - i7) + i7));
                case '\t':
                    C68368QsO.LJIIIZ(2, "split", list);
                    String str10 = this.LJLIL;
                    if (str10.length() == 0) {
                        return new C68375QsV(Arrays.asList(this));
                    }
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = (ArrayList) list;
                    if (arrayList7.isEmpty()) {
                        arrayList6.add(this);
                    } else {
                        String LJII2 = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 0)).LJII();
                        if (arrayList7.size() > 1) {
                            j = C68368QsO.LIZLLL(c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1)).LJI().doubleValue());
                            if (j == 0) {
                                return new C68375QsV();
                            }
                        } else {
                            j = 2147483647L;
                        }
                        String[] split = str10.split(Pattern.quote(LJII2), ((int) j) + 1);
                        int length3 = split.length;
                        if (LJII2.isEmpty() && length3 > 0) {
                            boolean isEmpty = split[0].isEmpty();
                            i3 = length3 - 1;
                            i4 = isEmpty;
                            if (!split[i3].isEmpty()) {
                                i3 = length3;
                                i4 = isEmpty;
                            }
                        } else {
                            i3 = length3;
                            i4 = 0;
                        }
                        if (length3 > j) {
                            i3--;
                        }
                        while (i4 < i3) {
                            arrayList6.add(new C68376QsW(split[i4]));
                            i4++;
                        }
                    }
                    return new C68375QsV(arrayList6);
                case '\n':
                    C68368QsO.LJIIIZ(2, "substring", list);
                    String str11 = this.LJLIL;
                    ArrayList arrayList8 = (ArrayList) list;
                    if (!arrayList8.isEmpty()) {
                        i5 = (int) C68368QsO.LIZ(c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 0)).LJI().doubleValue());
                    } else {
                        i5 = 0;
                    }
                    if (arrayList8.size() > 1) {
                        length2 = (int) C68368QsO.LIZ(c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1)).LJI().doubleValue());
                    } else {
                        length2 = str11.length();
                    }
                    int min3 = Math.min(Math.max(i5, 0), str11.length());
                    int min4 = Math.min(Math.max(length2, 0), str11.length());
                    return new C68376QsW(str11.substring(Math.min(min3, min4), Math.max(min3, min4)));
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    C68368QsO.LJII(0, "toLocaleUpperCase", list);
                    return new C68376QsW(this.LJLIL.toUpperCase());
                case '\f':
                    C68368QsO.LJII(0, "toLocaleLowerCase", list);
                    return new C68376QsW(this.LJLIL.toLowerCase());
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    C68368QsO.LJII(0, "toLowerCase", list);
                    return new C68376QsW(this.LJLIL.toLowerCase(Locale.ENGLISH));
                case 14:
                    C68368QsO.LJII(0, "toString", list);
                    break;
                case 15:
                    C68368QsO.LJII(0, "toUpperCase", list);
                    return new C68376QsW(this.LJLIL.toUpperCase(Locale.ENGLISH));
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    C68368QsO.LJII(0, "toUpperCase", list);
                    return new C68376QsW(this.LJLIL.trim());
                default:
                    throw new IllegalArgumentException("Command not supported");
            }
            return this;
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("%s is not a String function", new Object[]{str}));
    }
}
