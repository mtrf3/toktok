package X;

import com.bytedance.vcloud.abrmodule.ABRConfig;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.YMo, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87262YMo extends AbstractC65781Prl implements InterfaceC88474Ynu<String, YNA, JSONObject, java.util.Map<String, String>, C76800UCe> {
    public static final C87262YMo LJLIL = new C87262YMo();

    public C87262YMo() {
        super(4);
    }

    @Override // X.InterfaceC88474Ynu
    public final C76800UCe invoke(String str, YNA yna, JSONObject jSONObject, java.util.Map<String, String> map) {
        YN0 yn0;
        String str2;
        String LJFF;
        Long LJJIZ;
        String LJI;
        YNA commonParams = yna;
        JSONObject jSONObject2 = jSONObject;
        java.util.Map<String, String> map2 = map;
        o.LJIIIZ(str, "<anonymous parameter 0>");
        o.LJIIIZ(commonParams, "commonParams");
        EnumC87257YMj enumC87257YMj = commonParams.LIZIZ;
        if (enumC87257YMj != null && (yn0 = commonParams.LIZJ) != null) {
            int i = YNC.LIZ[yn0.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                C87255YMh.LIZ.getClass();
                                C87255YMh.LIZIZ(enumC87257YMj, map2, jSONObject2);
                            }
                        } else {
                            C87255YMh.LIZ.getClass();
                            C87255YMh.LIZIZ(enumC87257YMj, map2, jSONObject2);
                        }
                    } else {
                        C87255YMh.LIZ.getClass();
                        C87255YMh.LIZIZ(enumC87257YMj, map2, jSONObject2);
                    }
                } else {
                    C87255YMh.LIZ.getClass();
                    C87255YMh.LIZIZ(enumC87257YMj, map2, jSONObject2);
                }
            } else {
                C87255YMh.LIZ.getClass();
                if (K3T.LIZ() != 0 || K3T.LIZIZ().searchSceneNum != 0) {
                    String str3 = null;
                    if ((jSONObject2 == null || (str2 = C87260YMm.LIZIZ(jSONObject2)) == null) && (map2 == null || (str2 = C87260YMm.LIZ(map2)) == null)) {
                        str2 = "";
                    }
                    switch (YN1.LIZ[enumC87257YMj.ordinal()]) {
                        case 1:
                            if (((jSONObject2 != null && (LJFF = C87260YMm.LJI(jSONObject2)) != null) || (map2 != null && (LJFF = C87260YMm.LJFF(map2)) != null)) && (LJJIZ = C38350F3i.LJJIZ(LJFF)) != null) {
                                LJJIZ.longValue();
                                if (LJJIZ.longValue() >= 5000) {
                                    if (jSONObject2 == null || (LJI = C87260YMm.LJI(jSONObject2)) == null) {
                                        if (map2 != null) {
                                            str3 = C87260YMm.LJFF(map2);
                                        }
                                    } else {
                                        str3 = LJI;
                                    }
                                    C17N.LJJJJLL().kO().LIZ(new YN8(str2, str3, enumC87257YMj));
                                    break;
                                }
                            }
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        case 12:
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                            C17N.LJJJJLL().kO().LIZ(new YN8(str2, null, enumC87257YMj));
                            break;
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
