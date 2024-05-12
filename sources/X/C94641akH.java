package X;

import com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectHint;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.EffectCategoryResponse;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.akH, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94641akH extends AbstractC94465ahR<LinkedHashMap<String, EffectHint>> {
    @Override // X.AbstractC94465ahR
    public final Object LJFF(EffectChannelResponse response) {
        String str;
        o.LJIIIZ(response, "response");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<EffectCategoryResponse> it = response.getCategory_responses().iterator();
        while (it.hasNext()) {
            for (Effect effect : it.next().getTotal_effects()) {
                String LJ = AbstractC94197ad7.LJ(this, effect.getExtra(), "hint_key");
                if (LJ.length() != 0) {
                    String LJ2 = AbstractC94197ad7.LJ(this, effect.getExtra(), "effect_key");
                    List<String> url_list = effect.getHint_icon().getUrl_list();
                    List<String> url_list2 = effect.getHint_file().getUrl_list();
                    String hint = effect.getHint();
                    String str2 = "";
                    if (!(!url_list.isEmpty())) {
                        str = "";
                    } else {
                        str = (String) ListProtector.get(url_list, 0);
                    }
                    if (true ^ url_list2.isEmpty()) {
                        str2 = (String) ListProtector.get(url_list2, 0);
                    }
                    linkedHashMap.put(LJ2, new EffectHint(LJ, LJ2, hint, str, str2, effect.getHint_file_format()));
                }
            }
        }
        return linkedHashMap;
    }
}
