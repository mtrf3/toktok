package X;

import com.lingo.caption.LingoCaptionInnerImpl;
import org.json.JSONObject;

/* renamed from: X.NzD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61147NzD implements ACS {
    public final /* synthetic */ LingoCaptionInnerImpl LIZ;
    public final /* synthetic */ C61150NzG LIZIZ;

    @Override // X.ACS
    public final void LIZ(int i) {
        LingoCaptionInnerImpl lingoCaptionInnerImpl = this.LIZ;
        String str = this.LIZIZ.LJLIL;
        lingoCaptionInnerImpl.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("milliseconds", String.valueOf(i));
        jSONObject.put("id", str);
        C72818Shy.LIZ(new C76052yf(currentTimeMillis, new C78529Urt(jSONObject), "onProgressUpdate"));
    }

    public C61147NzD(LingoCaptionInnerImpl lingoCaptionInnerImpl, C61150NzG c61150NzG) {
        this.LIZ = lingoCaptionInnerImpl;
        this.LIZIZ = c61150NzG;
    }
}
