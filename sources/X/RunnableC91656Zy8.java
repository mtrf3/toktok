package X;

import com.coloros.OpPushAdapter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import org.json.JSONObject;

/* renamed from: X.Zy8, reason: case insensitive filesystem */
/* loaded from: classes28.dex */
public final class RunnableC91656Zy8 implements Runnable {
    public final /* synthetic */ OpPushAdapter LJLIL;

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            if (1 == C36929EeT.LIZJ(this.LJLIL.mContext)) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("notification_status", str);
            QRM.LJII().getClass();
            R39.LIZJ("push_guide_status_change_oppo", jSONObject);
        } catch (Throwable unused) {
        }
    }

    public RunnableC91656Zy8(OpPushAdapter opPushAdapter) {
        this.LJLIL = opPushAdapter;
    }
}
