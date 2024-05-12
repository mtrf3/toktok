package X;

import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.akE, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94638akE extends AbstractC94465ahR<List<? extends C94384ag8>> {
    @Override // X.AbstractC94465ahR
    public final Object LJFF(EffectChannelResponse response) {
        Integer num;
        boolean z;
        o.LJIIIZ(response, "response");
        ArrayList arrayList = new ArrayList();
        for (EffectCategoryResponse effectCategoryResponse : response.getCategory_responses()) {
            ArrayList arrayList2 = new ArrayList();
            for (Effect effect : effectCategoryResponse.getTotal_effects()) {
                arrayList2.add(new C94383ag7(AbstractC94197ad7.LIZLLL(effect.getIcon_url().getUrl_list()), effect.getName(), AbstractC94197ad7.LJ(this, effect.getExtra(), "effect_key")));
            }
            String name = effectCategoryResponse.getName();
            String extra = effectCategoryResponse.getExtra();
            if (extra != null) {
                if (extra.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    try {
                        num = Integer.valueOf(new JSONObject(extra).optInt("enable_detailed_cell"));
                    } catch (Exception unused) {
                    }
                    EnumC94003aZz enumC94003aZz = EnumC94003aZz.DETAIL;
                    int mark = enumC94003aZz.getMark();
                    if (num == null || num.intValue() != mark) {
                        enumC94003aZz = EnumC94003aZz.NORMAL;
                    }
                    arrayList.add(new C94384ag8(name, enumC94003aZz, arrayList2));
                }
            }
            num = null;
            EnumC94003aZz enumC94003aZz2 = EnumC94003aZz.DETAIL;
            int mark2 = enumC94003aZz2.getMark();
            if (num == null) {
                arrayList.add(new C94384ag8(name, enumC94003aZz2, arrayList2));
            }
            enumC94003aZz2 = EnumC94003aZz.NORMAL;
            arrayList.add(new C94384ag8(name, enumC94003aZz2, arrayList2));
        }
        return arrayList;
    }
}
