package X;

import android.content.Context;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TGe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74356TGe {
    public static List LIZ(Context context) {
        o.LJIIIZ(context, "context");
        ArrayList arrayList = new ArrayList();
        String[] stringArray = context.getResources().getStringArray(R.array.r);
        o.LJIIIIZZ(stringArray, "context.resources.getStr…ray.default_sticker_list)");
        for (String str : stringArray) {
            EffectCategoryModel effectCategoryModel = new EffectCategoryModel(null, 1, null);
            o.LJIIIIZZ(str, "str");
            effectCategoryModel.setName(str);
            arrayList.add(effectCategoryModel);
        }
        return arrayList;
    }
}
