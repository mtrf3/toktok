package X;

import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.creative.model.CommonMobParamModel;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.GwM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43134GwM {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(String path, CommonMobParamModel mobModel) {
        String str;
        o.LJIIIZ(path, "path");
        o.LJIIIZ(mobModel, "mobModel");
        if (!C44694HgQ.LIZ(C44694HgQ.LJIILJJIL(path))) {
            return 0;
        }
        try {
            C68887R1v LJIIJ = C44694HgQ.LJIIJ(path);
            if (LJIIJ != null) {
                str = LJIIJ.LJII("UserComment");
            } else {
                str = null;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("AIGCManager -> getAIGCLabelTypeForImage -> userComment = ");
            LIZ2.append(str);
            H78.LIZ(X1D.LIZIZ(LIZ2));
        } catch (Exception e) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("getAIGCInfoFromMetadata failed: ");
            LIZ3.append(C78963Uyt.LJIJJ(e));
            H78.LIZJ(X1D.LIZIZ(LIZ3));
        }
        if (str != null && str.length() != 0) {
            new com.google.gson.o();
            String it = com.google.gson.o.LIZ(str).LJIIZILJ().LJJIJ("aigc_info").toString();
            o.LJIIIIZZ(it, "it");
            if (it.length() == 0) {
                return 0;
            }
            new com.google.gson.o();
            JSONObject jSONObject = new JSONObject(com.google.gson.o.LIZ(str).LJIIZILJ().LJJIJ("aigc_info").toString());
            if (jSONObject.has("aigc_label_type") && jSONObject.optInt("aigc_label_type") == 2) {
                if (!mobModel.aigcCreationSource.contains("meta_contain_auto_aigc")) {
                    mobModel.aigcCreationSource.add("meta_contain_auto_aigc");
                }
                return 2;
            }
            if (jSONObject.has("source_info") && C78685UuP.LJJJZ(jSONObject.optString("source_info"))) {
                String optString = jSONObject.optString("source_info");
                o.LJIIIIZZ(optString, "aigcInfo.optString(AIGC_SOURCE_INFO)");
                if (F94.LIZ(optString)) {
                    if (!mobModel.aigcCreationSource.contains("extern_share")) {
                        mobModel.aigcCreationSource.add("extern_share");
                    }
                    return 2;
                }
            }
            return 0;
        }
        return 0;
    }

    public static int LIZIZ(String path, CommonMobParamModel mobModel) {
        o.LJIIIZ(path, "path");
        o.LJIIIZ(mobModel, "mobModel");
        if (C44694HgQ.LIZ(C44694HgQ.LJIILJJIL(path))) {
            return LIZ(path, mobModel);
        }
        String str = TEVideoUtils.getMetaData(path).get("aigc_info");
        if (str != null && str.length() != 0) {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("aigc_label_type") && jSONObject.optInt("aigc_label_type") == 2) {
                if (!mobModel.aigcCreationSource.contains("meta_contain_auto_aigc")) {
                    mobModel.aigcCreationSource.add("meta_contain_auto_aigc");
                }
                return jSONObject.optInt("aigc_label_type");
            }
            if (jSONObject.has("source_info") && C78685UuP.LJJJZ(jSONObject.optString("source_info"))) {
                String optString = jSONObject.optString("source_info");
                o.LJIIIIZZ(optString, "aigcInfo.optString(AIGC_SOURCE_INFO)");
                if (F94.LIZ(optString)) {
                    if (!mobModel.aigcCreationSource.contains("extern_share")) {
                        mobModel.aigcCreationSource.add("extern_share");
                    }
                    return 2;
                }
            }
        }
        return 0;
    }

    public static void LIZJ(int i, String str) {
        if (i != 2 || str == null || str.length() == 0 || !C44694HgQ.LIZ(C44694HgQ.LJIILJJIL(str))) {
            return;
        }
        JSONObject put = new JSONObject().put("aigc_label_type", i);
        C68887R1v LJIIJ = C44694HgQ.LJIIJ(str);
        if (LJIIJ == null) {
            return;
        }
        LJIIJ.LJJIJ(new JSONObject().put("aigc_info", put).toString());
        LJIIJ.LJJIIJ();
    }

    public static void LIZLLL(String srcPath, String targetPath) {
        String str;
        o.LJIIIZ(srcPath, "srcPath");
        o.LJIIIZ(targetPath, "targetPath");
        if (!C44694HgQ.LIZ(C44694HgQ.LJIILJJIL(srcPath)) || !C44694HgQ.LIZ(C44694HgQ.LJIILJJIL(targetPath))) {
            return;
        }
        C68887R1v LJIIJ = C44694HgQ.LJIIJ(srcPath);
        if (LJIIJ != null) {
            str = LJIIJ.LJII("UserComment");
        } else {
            str = null;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("AIGCManager -> userComment = ");
        LIZ2.append(str);
        H78.LIZ(X1D.LIZIZ(LIZ2));
        C68887R1v LJIIJ2 = C44694HgQ.LJIIJ(targetPath);
        if (LJIIJ2 == null) {
            return;
        }
        LJIIJ2.LJJIJ(str);
        LJIIJ2.LJJIIJ();
    }
}
