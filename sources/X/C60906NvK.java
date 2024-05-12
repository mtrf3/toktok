package X;

import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.NvK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60906NvK {
    public static final List<String> LIZ = C47261Igj.LJJIJIIJI("min_margin_top", "drag_min_margin_top");

    public static final boolean LIZ(String str, String str2, java.util.Map map, android.net.Uri uri) {
        return o.LJ(str2, "1");
    }

    public static final C60908NvM LIZJ(String str, String str2, java.util.Map map, android.net.Uri uri) {
        C76800UCe c76800UCe = null;
        C60908NvM c60908NvM = new C60908NvM(0, 1, null);
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append('#');
            if (str2 == null) {
                str2 = "";
            }
            LIZ2.append(str2);
            c60908NvM.setColor(C59976NgK.LIZ(C59976NgK.LIZIZ(X1D.LIZIZ(LIZ2))));
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(str);
            LIZ3.append("_light");
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            String str3 = (String) linkedHashMap.get(X1D.LIZIZ(LIZ3));
            if (str3 != null) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append('#');
                LIZ4.append(str3);
                c60908NvM.setColorLight(C59976NgK.LIZ(C59976NgK.LIZIZ(X1D.LIZIZ(LIZ4))));
            }
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append(str);
            LIZ5.append("_dark");
            String str4 = (String) linkedHashMap.get(X1D.LIZIZ(LIZ5));
            if (str4 != null) {
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append('#');
                LIZ6.append(str4);
                c60908NvM.setColorDark(C59976NgK.LIZ(C59976NgK.LIZIZ(X1D.LIZIZ(LIZ6))));
                c76800UCe = C76800UCe.LIZ;
            }
            C3C5.m7constructorimpl(c76800UCe);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return c60908NvM;
    }

    public static C60908NvM LIZLLL(String str, String str2, java.util.Map map, android.net.Uri uri) {
        C76800UCe c76800UCe = null;
        C60908NvM c60908NvM = new C60908NvM(0, 1, null);
        try {
            c60908NvM.setColor(C59976NgK.LIZ(C59976NgK.LIZIZ(str2)));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append("_light");
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            String str3 = (String) linkedHashMap.get(X1D.LIZIZ(LIZ2));
            if (str3 != null) {
                c60908NvM.setColorLight(C59976NgK.LIZ(C59976NgK.LIZIZ(str3)));
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(str);
            LIZ3.append("_dark");
            String str4 = (String) linkedHashMap.get(X1D.LIZIZ(LIZ3));
            if (str4 != null) {
                c60908NvM.setColorDark(C59976NgK.LIZ(C59976NgK.LIZIZ(str4)));
                c76800UCe = C76800UCe.LIZ;
            }
            C3C5.m7constructorimpl(c76800UCe);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return c60908NvM;
    }

    public static final int LIZIZ(String str, String str2, java.util.Map<String, String> map, android.net.Uri uri, boolean z) {
        float parseFloat;
        InterfaceC65784Pro interfaceC65784Pro;
        float floatValue;
        if (z) {
            if (ujb.o.LJJJJ(str2, "rpx", false)) {
                floatValue = CastFloatProtector.parseFloat(s.LJJZZIII("rpx", str2)) / 750;
                parseFloat = C60936Nvo.LIZLLL(null);
            } else {
                if (ujb.o.LJJJJ(str2, "%", false)) {
                    parseFloat = CastFloatProtector.parseFloat(s.LJJZZIII("%", str2)) / 100.0f;
                    if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
                        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                        if (o.LJ((String) linkedHashMap.get("enable_relative_calculation"), "1")) {
                            if (s.LJJJLZIJ(str, "height", false) && parseFloat == 1.0f && o.LJ((String) linkedHashMap.get("trans_status_bar"), "1")) {
                                interfaceC65784Pro = C60922Nva.LJLIL;
                            } else if (s.LJJJLZIJ(str, "height", false) || LIZ.contains(str)) {
                                interfaceC65784Pro = C60909NvN.LJLIL;
                            } else {
                                interfaceC65784Pro = C60907NvL.LJLIL;
                            }
                        } else if (s.LJJJLZIJ(str, "height", false) || LIZ.contains(str)) {
                            interfaceC65784Pro = C60923Nvb.LJLIL;
                        } else {
                            interfaceC65784Pro = C60924Nvc.LJLIL;
                        }
                        floatValue = ((Number) interfaceC65784Pro.invoke()).floatValue();
                    }
                    return -1;
                }
                return C60936Nvo.LIZ(CastFloatProtector.parseFloat(str2));
            }
            return (int) (floatValue * parseFloat);
        }
        return CastIntegerProtector.parseInt(str2);
    }
}
