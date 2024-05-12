package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.akJ, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94643akJ extends AbstractC94464ahQ<C94255ae3> {
    @Override // X.AbstractC94464ahQ
    public final C94255ae3 LJFF(CategoryPageModel categoryPageModel) {
        String str;
        List<Effect> effects;
        String str2 = null;
        if (categoryPageModel == null) {
            return null;
        }
        List<String> url_prefix = categoryPageModel.getUrl_prefix();
        if (url_prefix != null) {
            str = (String) ORZ.LJLLLL(url_prefix);
        } else {
            str = null;
        }
        CategoryEffectModel categoryEffects = categoryPageModel.getCategoryEffects();
        if (categoryEffects == null || (effects = categoryEffects.getEffects()) == null) {
            return null;
        }
        Iterator<Effect> it = effects.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Effect next = it.next();
        JSONObject LIZIZ = AbstractC94197ad7.LIZIZ(next);
        if (LIZIZ != null) {
            try {
                str2 = JSONObjectProtectorUtils.getString(LIZIZ, "modelpic");
            } catch (Exception unused) {
            }
        }
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        String extra = next.getExtra();
        if (extra != null) {
            str3 = new JSONObject(extra).optString("scalefactor", "");
            o.LJIIIIZZ(str3, "extraJson.optString(MODEL_SCALEFACTOR, \"\")");
        }
        return new C94255ae3(next.getName(), o.LJIILLIIL(str2, str), next.getUnzipPath(), next.getEffect_id(), next.getResource_id(), str3);
    }
}
