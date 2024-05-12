package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.FfE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39524FfE {
    public static final java.util.Map<Character, EnumC39525FfF> LIZ = C113554cx.LJJL(new OSZ('Z', EnumC39525FfF.bool), new OSZ('C', EnumC39525FfF.f1char), new OSZ('B', EnumC39525FfF.f0byte), new OSZ('S', EnumC39525FfF.f6short), new OSZ('I', EnumC39525FfF.f4int), new OSZ('F', EnumC39525FfF.f3float), new OSZ('J', EnumC39525FfF.f5long), new OSZ('D', EnumC39525FfF.f2double), new OSZ('V', EnumC39525FfF.VOID), new OSZ('L', EnumC39525FfF.OBJECT), new OSZ('[', EnumC39525FfF.ARRAY));

    public static List LIZ(C39526FfG[] c39526FfGArr) {
        EnumC39525FfF enumC39525FfF;
        ArrayList arrayList = new ArrayList();
        for (C39526FfG c39526FfG : c39526FfGArr) {
            String className = c39526FfG.LIZ();
            int i = c39526FfG.LIZ;
            if (i == 12) {
                i = 10;
            }
            switch (i) {
                case 0:
                    EnumC39525FfF enumC39525FfF2 = EnumC39525FfF.VOID;
                    o.LJIIIIZZ(className, "className");
                    arrayList.add(new C39513Ff3(enumC39525FfF2, className));
                    break;
                case 1:
                    EnumC39525FfF enumC39525FfF3 = EnumC39525FfF.bool;
                    o.LJIIIIZZ(className, "className");
                    arrayList.add(new C39513Ff3(enumC39525FfF3, className));
                    break;
                case 2:
                    EnumC39525FfF enumC39525FfF4 = EnumC39525FfF.f1char;
                    o.LJIIIIZZ(className, "className");
                    arrayList.add(new C39513Ff3(enumC39525FfF4, className));
                    break;
                case 3:
                    EnumC39525FfF enumC39525FfF5 = EnumC39525FfF.f0byte;
                    o.LJIIIIZZ(className, "className");
                    arrayList.add(new C39513Ff3(enumC39525FfF5, className));
                    break;
                case 4:
                    EnumC39525FfF enumC39525FfF6 = EnumC39525FfF.f6short;
                    o.LJIIIIZZ(className, "className");
                    arrayList.add(new C39513Ff3(enumC39525FfF6, className));
                    break;
                case 5:
                    EnumC39525FfF enumC39525FfF7 = EnumC39525FfF.f4int;
                    o.LJIIIIZZ(className, "className");
                    arrayList.add(new C39513Ff3(enumC39525FfF7, className));
                    break;
                case 6:
                    EnumC39525FfF enumC39525FfF8 = EnumC39525FfF.f3float;
                    o.LJIIIIZZ(className, "className");
                    arrayList.add(new C39513Ff3(enumC39525FfF8, className));
                    break;
                case 7:
                    EnumC39525FfF enumC39525FfF9 = EnumC39525FfF.f5long;
                    o.LJIIIIZZ(className, "className");
                    arrayList.add(new C39513Ff3(enumC39525FfF9, className));
                    break;
                case 8:
                    EnumC39525FfF enumC39525FfF10 = EnumC39525FfF.f2double;
                    o.LJIIIIZZ(className, "className");
                    arrayList.add(new C39513Ff3(enumC39525FfF10, className));
                    break;
                case 9:
                    o.LJIIIIZZ(className, "className");
                    if (s.LJJJLZIJ(className, "byte", false) || s.LJJJLZIJ(className, "Byte", false)) {
                        arrayList.add(new C39513Ff3(EnumC39525FfF.BYTE_ARRAY, className));
                        break;
                    } else {
                        arrayList.add(new C39513Ff3(EnumC39525FfF.ARRAY, className));
                        break;
                    }
                    break;
                case 10:
                case 12:
                    o.LJIIIIZZ(className, "className");
                    switch (className.hashCode()) {
                        case -2056817302:
                            if (className.equals("java.lang.Integer")) {
                                enumC39525FfF = EnumC39525FfF.INT;
                                break;
                            }
                            break;
                        case -1603762768:
                            if (className.equals("com.lynx.react.bridge.WritableMap")) {
                                enumC39525FfF = EnumC39525FfF.WRITABLE_MAP;
                                break;
                            }
                            break;
                        case -607430061:
                            if (className.equals("com.lynx.react.bridge.Dynamic")) {
                                enumC39525FfF = EnumC39525FfF.DYNAMIC;
                                break;
                            }
                            break;
                        case -527879800:
                            if (className.equals("java.lang.Float")) {
                                enumC39525FfF = EnumC39525FfF.FLOAT;
                                break;
                            }
                            break;
                        case -515992664:
                            if (className.equals("java.lang.Short")) {
                                enumC39525FfF = EnumC39525FfF.SHORT;
                                break;
                            }
                            break;
                        case 155276373:
                            if (className.equals("java.lang.Character")) {
                                enumC39525FfF = EnumC39525FfF.CHAR;
                                break;
                            }
                            break;
                        case 344809556:
                            if (className.equals("java.lang.Boolean")) {
                                enumC39525FfF = EnumC39525FfF.BOOL;
                                break;
                            }
                            break;
                        case 398507100:
                            if (className.equals("java.lang.Byte")) {
                                enumC39525FfF = EnumC39525FfF.BYTE;
                                break;
                            }
                            break;
                        case 398795216:
                            if (className.equals("java.lang.Long")) {
                                enumC39525FfF = EnumC39525FfF.LONG;
                                break;
                            }
                            break;
                        case 666668461:
                            if (className.equals("com.lynx.react.bridge.WritableArray")) {
                                enumC39525FfF = EnumC39525FfF.WRITABLE_ARRAY;
                                break;
                            }
                            break;
                        case 761287205:
                            if (className.equals("java.lang.Double")) {
                                enumC39525FfF = EnumC39525FfF.DOUBLE;
                                break;
                            }
                            break;
                        case 795565917:
                            if (className.equals("com.lynx.react.bridge.ReadableArray")) {
                                enumC39525FfF = EnumC39525FfF.READABLE_ARRAY;
                                break;
                            }
                            break;
                        case 805307232:
                            if (className.equals("com.lynx.react.bridge.ReadableMap")) {
                                enumC39525FfF = EnumC39525FfF.READABLE_MAP;
                                break;
                            }
                            break;
                        case 1029007537:
                            if (className.equals("com.lynx.react.bridge.Callback")) {
                                enumC39525FfF = EnumC39525FfF.CALLBACK;
                                break;
                            }
                            break;
                        case 1195259493:
                            if (className.equals("java.lang.String")) {
                                enumC39525FfF = EnumC39525FfF.STRING;
                                break;
                            }
                            break;
                        case 2061128041:
                            if (className.equals("com.lynx.jsbridge.Promise")) {
                                enumC39525FfF = EnumC39525FfF.PROMISE;
                                break;
                            }
                            break;
                    }
                    enumC39525FfF = EnumC39525FfF.OBJECT;
                    arrayList.add(new C39513Ff3(enumC39525FfF, className));
                    break;
            }
        }
        return arrayList;
    }

    public static C39512Ff2 LIZIZ(String str) {
        C39512Ff2 c39512Ff2 = new C39512Ff2(0);
        if (str == null) {
            return c39512Ff2;
        }
        int i = 1;
        int i2 = 0;
        while (str.charAt(i) != ')') {
            while (str.charAt(i) == '[') {
                i++;
            }
            int i3 = i + 1;
            if (str.charAt(i) == 'L') {
                i = Math.max(i3, str.indexOf(59, i3) + 1);
            } else {
                i = i3;
            }
            i2++;
        }
        C39526FfG[] c39526FfGArr = new C39526FfG[i2];
        int i4 = 1;
        int i5 = 0;
        while (str.charAt(i4) != ')') {
            int i6 = i4;
            while (str.charAt(i6) == '[') {
                i6++;
            }
            int i7 = i6 + 1;
            if (str.charAt(i6) == 'L') {
                i7 = Math.max(i7, str.indexOf(59, i7) + 1);
            }
            c39526FfGArr[i5] = C39526FfG.LIZIZ(i4, i7, str);
            i5++;
            i4 = i7;
        }
        List<C39513Ff3> LIZ2 = LIZ(c39526FfGArr);
        C39526FfG[] c39526FfGArr2 = new C39526FfG[1];
        int i8 = 1;
        while (str.charAt(i8) != ')') {
            while (str.charAt(i8) == '[') {
                i8++;
            }
            int i9 = i8 + 1;
            if (str.charAt(i8) == 'L') {
                i8 = Math.max(i9, str.indexOf(59, i9) + 1);
            } else {
                i8 = i9;
            }
        }
        c39526FfGArr2[0] = C39526FfG.LIZIZ(i8 + 1, str.length(), str);
        List LIZ3 = LIZ(c39526FfGArr2);
        c39512Ff2.LJLIL = LIZ2;
        if (((ArrayList) LIZ3).isEmpty()) {
            c39512Ff2.LJLILLLLZI = new C39513Ff3(EnumC39525FfF.VOID, 2);
        } else {
            C39513Ff3 c39513Ff3 = (C39513Ff3) ListProtector.get(LIZ3, 0);
            o.LJIIIZ(c39513Ff3, "<set-?>");
            c39512Ff2.LJLILLLLZI = c39513Ff3;
        }
        return c39512Ff2;
    }
}
