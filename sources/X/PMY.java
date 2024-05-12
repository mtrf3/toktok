package X;

import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PMY extends C79359VCp {
    public static volatile PMY LIZLLL;
    public JSONObject LIZJ;

    public PMY() {
        super(3);
        this.LIZ = "TypeUserProfileFeature";
        Object obj = this.LIZIZ;
        if (obj != null) {
            ((VD4) obj).LIZ = "TypeUserProfileFeature";
        }
    }

    public static PMY LJ() {
        if (LIZLLL == null) {
            synchronized (PMY.class) {
                if (LIZLLL == null) {
                    LIZLLL = new PMY();
                }
            }
        }
        return LIZLLL;
    }

    public static Number LIZJ(String str) {
        Number number = -1;
        try {
            if (str.contains(".")) {
                number = Double.valueOf(CastDoubleProtector.parseDouble(str));
            } else {
                number = Integer.valueOf(CastIntegerProtector.parseInt(str));
            }
        } catch (NumberFormatException e) {
            C16880lQ.LLLLIIL(e);
        }
        return number;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x006d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0277 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject LIZLLL(org.json.JSONObject r26, org.json.JSONArray r27, org.json.JSONObject r28) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PMY.LIZLLL(org.json.JSONObject, org.json.JSONArray, org.json.JSONObject):org.json.JSONObject");
    }
}
