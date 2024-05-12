package X;

import com.bytedance.android.livesdk.livesetting.linkmic.CoHostSequentialEventReportSetting;
import kotlin.jvm.internal.AqS163S0100000_13;
import org.json.JSONObject;

/* renamed from: X.UBr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C76787UBr {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 601));
    public String LIZIZ = "";
    public final String LIZJ = "";

    public InterfaceC88472Yns<Object, JSONObject> LIZJ() {
        throw null;
    }

    public long LIZLLL() {
        throw null;
    }

    public String LJFF() {
        throw null;
    }

    public String LJI() {
        throw null;
    }

    public String LJII() {
        throw null;
    }

    public final C76788UBs LJ() {
        return (C76788UBs) this.LIZ.getValue();
    }

    public final void LJIIIIZZ() {
        C0K1 c0k1 = LJ().LJI;
        if (c0k1 != null) {
            c0k1.LIZLLL();
        }
    }

    public final void LJIIJ(JSONObject jSONObject) {
        if (CoHostSequentialEventReportSetting.INSTANCE.getValue().enable) {
            C76788UBs LJ = LJ();
            this.LIZIZ = LJ.LIZLLL(jSONObject, LJ.LIZ, LJ.LIZIZ, LJ.LIZJ, LIZLLL(), "", false, C31012CFc.LIZIZ(), System.currentTimeMillis());
        }
    }

    public final void LIZ(String str, JSONObject jSONObject) {
        if (!CoHostSequentialEventReportSetting.INSTANCE.getValue().enable || this.LIZIZ.length() == 0) {
            return;
        }
        C76788UBs LJ = LJ();
        LJ.LIZIZ(this.LIZIZ, str, jSONObject, LJ.LIZ, LJ.LIZIZ, null, C31012CFc.LIZIZ());
    }

    public final void LIZIZ(int i, JSONObject jSONObject) {
        if (!CoHostSequentialEventReportSetting.INSTANCE.getValue().enable || this.LIZIZ.length() == 0) {
            return;
        }
        C76788UBs LJ = LJ();
        LJ.LJ(i, this.LIZIZ, LJ.LIZ, LJ.LIZIZ, jSONObject);
    }

    public final void LJIIIZ(String str, JSONObject jSONObject) {
        if (!CoHostSequentialEventReportSetting.INSTANCE.getValue().enable || this.LIZIZ.length() == 0) {
            return;
        }
        C76788UBs LJ = LJ();
        LJ.LJFF(C31012CFc.LIZIZ(), System.currentTimeMillis(), this.LIZIZ, str, LJ.LIZ, LJ.LIZIZ, jSONObject);
    }

    public final void LJIIJJI(String str, JSONObject jSONObject) {
        if (CoHostSequentialEventReportSetting.INSTANCE.getValue().enable) {
            C76788UBs.LJII(LJ(), this.LIZIZ, str, jSONObject, null, 248);
        }
    }
}
