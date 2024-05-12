package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class OF7 implements SIR {
    public final int LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;
    public final String LIZLLL;
    public final boolean LJ;

    @Override // X.SIR
    public final void LIZ(JSONObject jSONObject) {
        if (jSONObject.optBoolean("isSuccess")) {
            LIZIZ(true, jSONObject, true, this.LJ);
        }
    }

    @Override // X.SIR
    public final void LJJLIIIJLLLLLLLZ(JSONObject jSONObject, String str, boolean z) {
        LIZIZ(z, jSONObject, false, this.LJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(boolean r10, org.json.JSONObject r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OF7.LIZIZ(boolean, org.json.JSONObject, boolean, boolean):void");
    }

    public OF7(int i, String str, Integer num, String searchId, boolean z) {
        o.LJIIIZ(searchId, "searchId");
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = num;
        this.LIZLLL = searchId;
        this.LJ = z;
    }
}
