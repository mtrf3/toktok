package X;

import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.akF, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94639akF extends AbstractC94465ahR<List<? extends C93838aXK>> {
    @Override // X.AbstractC94465ahR
    public final Object LJFF(EffectChannelResponse response) {
        String str;
        o.LJIIIZ(response, "response");
        ArrayList arrayList = new ArrayList();
        for (EffectCategoryResponse effectCategoryResponse : response.getCategory_responses()) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<Effect> it = effectCategoryResponse.getTotal_effects().iterator();
            while (true) {
                str = "";
                if (!it.hasNext()) {
                    break;
                }
                Effect next = it.next();
                String effect_id = next.getEffect_id();
                String name = next.getName();
                String LIZLLL = AbstractC94197ad7.LIZLLL(next.getIcon_url().getUrl_list());
                String extra = next.getExtra();
                if (extra != null) {
                    str = extra;
                }
                arrayList2.add(new C93839aXL(effect_id, name, LIZLLL, str));
            }
            String name2 = effectCategoryResponse.getName();
            String extra2 = effectCategoryResponse.getExtra();
            if (extra2 != null) {
                str = extra2;
            }
            arrayList.add(new C93838aXK(name2, str, arrayList2));
        }
        return arrayList;
    }
}
