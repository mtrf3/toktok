package X;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QNP implements QNS {
    public final /* synthetic */ OCR LJLIL;

    public QNP(OCR ocr) {
        this.LJLIL = ocr;
    }

    @Override // X.QNS
    public final void onFail(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", i);
            this.LJLIL.LIZLLL(1, jSONObject);
        } catch (JSONException unused) {
        }
    }

    @Override // X.QNS
    public final void LIZ(int i, JSONObject jSONObject) {
        onFail(i);
    }
}
