package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class GHX {
    public static final java.util.Map<String, String> LIZ = new LinkedHashMap();

    public static GHY LIZ(VideoPublishEditModel videoEditViewModel) {
        boolean z;
        o.LJIIIZ(videoEditViewModel, "videoEditViewModel");
        GHY ghy = new GHY();
        String editEffectListStr = videoEditViewModel.getEditEffectListStr();
        o.LJIIIIZZ(editEffectListStr, "videoEditViewModel.editEffectListStr");
        final boolean z2 = false;
        if (editEffectListStr.length() > 0 && !TextUtils.isEmpty(videoEditViewModel.getStickers())) {
            StringBuilder LJFF = C72972SkS.LJFF(editEffectListStr, ',');
            LJFF.append(videoEditViewModel.getStickers());
            editEffectListStr = X1D.LIZIZ(LJFF);
        }
        if (editEffectListStr.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (editEffectListStr = videoEditViewModel.getStickers()) == null) {
            editEffectListStr = "";
        }
        ghy.LIZIZ = editEffectListStr;
        ghy.LIZ = videoEditViewModel.getMusicId();
        ghy.LIZJ = "";
        if (TextUtils.isEmpty(videoEditViewModel.mUploadPath)) {
            videoEditViewModel.mUploadPath = (String) ((LinkedHashMap) LIZ).get(videoEditViewModel.getCreationId());
        }
        ghy.LIZLLL = videoEditViewModel.mUploadPath;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mShootWay", videoEditViewModel.mShootWay);
        jSONObject.put("mIsFromDraft", videoEditViewModel.mIsFromDraft);
        jSONObject.put("method", "getFromVideoEditModel");
        jSONObject.toString();
        String creationId = videoEditViewModel.getCreationId();
        JSONObject jSONObject2 = new JSONObject();
        if (creationId == null) {
            creationId = "";
        }
        jSONObject2.put("creation_id", creationId);
        jSONObject2.put("title", "");
        o.LJIIIIZZ(jSONObject2.toString(), "JSONObject().apply {\n   …e ?: \"\")\n    }.toString()");
        String str = ghy.LIZLLL;
        if (str == null || str.length() == 0) {
            z2 = true;
        }
        if (!C1DG.LJIIIIZZ()) {
            C10K.LIZIZ(new Callable() { // from class: X.4iq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String str2;
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        if (z2) {
                            str2 = CardStruct.IStatusCode.DEFAULT;
                        } else {
                            str2 = "1";
                        }
                        jSONObject3.put("zipUrlIsNull", str2);
                        C6BK c6bk = new C6BK();
                        Iterator<String> keys = jSONObject3.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            try {
                                c6bk.LIZLLL(next, JSONObjectProtectorUtils.getString(jSONObject3, next));
                            } catch (JSONException unused) {
                            }
                        }
                        C43882HKc.LIZLLL(0, "hash_tag_zip_url", c6bk.LJ(), true);
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                    return C76800UCe.LIZ;
                }
            }, FMX.LIZIZ(), null);
        }
        return ghy;
    }
}
