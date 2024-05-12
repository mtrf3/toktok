package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.ss.android.videoshop.controller.RefactorVideoController;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.IvA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48156IvA extends C36071bH {
    public final /* synthetic */ C48157IvB LIZ;

    public C48156IvA(C48157IvB c48157IvB) {
        this.LIZ = c48157IvB;
    }

    @Override // X.C36071bH
    public final void LJIIJ(int i, String str) {
        Bundle LIZ = C141415gn.LIZ("code", i);
        try {
            LIZ.putString("info", new JSONObject(str).optString("info"));
        } catch (Exception unused) {
        }
        this.LIZ.LIZJ(1004, 0, 0, LIZ);
    }

    @Override // X.C36071bH
    public final void LJIILJJIL(C47789IpF c47789IpF, String str) {
        RefactorVideoController refactorVideoController = this.LIZ.LJI;
        if (refactorVideoController != null && refactorVideoController.getVideoInfoBean() != null) {
            C48155Iv9 videoInfoBean = this.LIZ.LJI.getVideoInfoBean();
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONArray optJSONArray = new JSONObject(str).optJSONArray("list");
                    if (optJSONArray != null) {
                        optJSONArray.length();
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            JSONArrayProtectorUtils.getJSONObject(optJSONArray, i).optInt("language_id");
                        }
                    }
                } catch (Exception unused) {
                }
            }
            videoInfoBean.LIZIZ = new C48160IvE(str);
        }
        this.LIZ.LIZJ(1003, 0, null, null);
    }

    @Override // X.C36071bH
    public final void LJIILL(int i, int i2) {
        this.LIZ.LIZJ(1005, 0, 0, C1DG.LIZLLL("success", i, "subId", i2));
    }
}
