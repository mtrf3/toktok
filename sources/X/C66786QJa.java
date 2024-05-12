package X;

import android.content.Context;
import org.json.JSONObject;

/* renamed from: X.QJa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66786QJa extends QKR {
    public final Context LJ;
    public final QIF LJFF;
    public final C48852JFg LJI;

    /* JADX WARN: Can't wrap try/catch for region: R(28:1|(1:3)|4|(1:6)(1:85)|7|(1:9)(1:84)|10|(6:12|(1:14)|15|(1:24)(1:20)|21|(1:23))|25|(1:27)(1:83)|28|(1:30)|31|(1:33)(1:82)|34|(1:36)|37|(11:39|(2:77|78)|41|(1:43)|44|(1:46)|47|48|(4:50|(1:52)(3:62|(4:65|(3:67|68|69)(1:71)|70|63)|72)|54|(3:56|(2:59|57)|60))|73|74)|81|41|(0)|44|(0)|47|48|(0)|73|74) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0184, code lost:
    
        if (r3 != 0) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0174 A[Catch: all -> 0x01c7, TryCatch #0 {all -> 0x01c7, blocks: (B:48:0x016e, B:50:0x0174, B:52:0x0180, B:54:0x0186, B:56:0x018c, B:57:0x0194, B:59:0x019a, B:62:0x01a8, B:63:0x01b1, B:65:0x01b7, B:68:0x01bf), top: B:47:0x016e }] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.Map] */
    @Override // X.QKR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(org.json.JSONObject r9) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66786QJa.LIZ(org.json.JSONObject):boolean");
    }

    @Override // X.QKR
    public final void LIZIZ(JSONObject jSONObject) {
        jSONObject.remove("channel");
        jSONObject.remove("not_request_sender");
        jSONObject.remove("aid");
        jSONObject.remove("release_build");
        jSONObject.remove("user_agent");
        jSONObject.remove("ab_version");
        jSONObject.remove("gaid_limited");
        jSONObject.remove("google_aid");
        jSONObject.remove("app_language");
        jSONObject.remove("app_region");
        jSONObject.remove("app_track");
        jSONObject.remove("custom");
    }

    public C66786QJa(Context context, C48852JFg c48852JFg, QIF qif) {
        super(false, true);
        this.LJ = context;
        this.LJFF = qif;
        this.LJI = c48852JFg;
    }
}
