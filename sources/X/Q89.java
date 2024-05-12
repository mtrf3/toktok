package X;

import android.content.Context;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.ttnet.diagnosis.IDiagnosisCallback;
import com.bytedance.ttnet.diagnosis.TTGameDiagnosisService;
import com.facebook.share.model.SharePhoto;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final /* synthetic */ class Q89 implements C0K7, FWB, IDiagnosisCallback, Q6N {
    @Override // com.bytedance.ttnet.diagnosis.IDiagnosisCallback
    public void onDiagnosisComplete(String str) {
        TTGameDiagnosisService.LIZ(str);
    }

    @Override // X.Q6N
    public JSONObject LIZ(SharePhoto photo) {
        o.LJIIIZ(photo, "photo");
        android.net.Uri uri = photo.imageUrl;
        if (C66373Q3d.LJIJJLI(uri)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", String.valueOf(uri));
                return jSONObject;
            } catch (JSONException e) {
                throw new Q4W("Unable to attach images", e);
            }
        }
        throw new Q4W("Only web images may be used in OG objects shared via the web dialog");
    }

    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
    }

    @Override // X.FWB
    public void invoke(Object[] objArr) {
        Aweme[] awemeArr = (Aweme[]) objArr;
        try {
            OJY LJIL = C73340SqO.LJIL();
            Context LIZIZ = EF7.LIZIZ();
            Aweme aweme = awemeArr[0];
            LJIL.getClass();
            OJY.LJII(LIZIZ, aweme);
        } catch (Exception unused) {
        }
    }

    public static void LIZIZ(StringBuilder sb, String str, char c, String str2) {
        sb.append(str);
        sb.append(c);
        sb.append(str2);
    }
}
