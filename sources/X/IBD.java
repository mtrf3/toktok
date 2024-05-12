package X;

import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.effectconfig.EffectConfigViewModel;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class IBD {
    public final ActivityC45651qj LIZ;
    public final ShortVideoContext LIZIZ;
    public final ICA LIZJ;
    public final EffectConfigViewModel LIZLLL;
    public final LifecycleOwner LJ;

    public final boolean LIZIZ() {
        if (!TextUtils.isEmpty(this.LIZIZ.effectMetaInfo)) {
            try {
                JSONObject jSONObject = new JSONObject(this.LIZIZ.effectMetaInfo);
                String effectKey = jSONObject.optString("effect_key");
                JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "effect_meta_info_value");
                ICA ica = this.LIZJ;
                o.LJIIIIZZ(effectKey, "effectKey");
                String jSONObject3 = jSONObject2.toString();
                o.LJIIIIZZ(jSONObject3, "effectMetaInfoValue.toString()");
                ica.setRenderCacheString(effectKey, jSONObject3);
                return true;
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
                return false;
            }
        }
        return false;
    }

    public final void LIZ(ICT ict) {
        if (!TextUtils.isEmpty(this.LIZIZ.effectImage)) {
            try {
                JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(new JSONObject(this.LIZIZ.effectImage), "effect_image_list");
                if (jSONArray != null && jSONArray.length() > 0) {
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                        String optString = jSONObject.optString("effect_key");
                        String effectImageValue = jSONObject.optString("effect_image_value");
                        ActivityC45651qj activityC45651qj = this.LIZ;
                        o.LJIIIIZZ(effectImageValue, "effectImageValue");
                        C86793Y4n.LJIIL(activityC45651qj, effectImageValue, new IBE(this, optString, i, jSONArray, ict));
                    }
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public IBD(C29S c29s, ShortVideoContext shortVideoContext, C46201IBh c46201IBh, EffectConfigViewModel effectConfigViewModel, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LIZ = c29s;
        this.LIZIZ = shortVideoContext;
        this.LIZJ = c46201IBh;
        this.LIZLLL = effectConfigViewModel;
        this.LJ = lifecycleOwner;
    }
}
