package com.ss.android.ugc.aweme.detail.prefab;

import X.C32151Nz;
import X.EnumC72807Shn;
import X.O6R;
import X.W5U;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class DetailCoverAssem extends DynamicAssem {
    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.aku;
    }

    public DetailCoverAssem() {
        new LinkedHashMap();
    }

    public void L3() {
        SmartImageView smartImageView;
        String str;
        String str2;
        Integer num;
        Integer num2;
        View x3 = x3();
        if (!(x3 instanceof SmartImageView) || (smartImageView = (SmartImageView) x3) == null) {
            return;
        }
        Map<String, Object> map = getConfig().LJ;
        ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
        if (layoutParams != null) {
            Object obj = map.get("width_dp");
            if ((obj instanceof Integer) && (num2 = (Integer) obj) != null) {
                layoutParams.width = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(num2.intValue())));
            }
            Object obj2 = map.get("height_dp");
            if ((obj2 instanceof Integer) && (num = (Integer) obj2) != null) {
                layoutParams.height = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(num.intValue())));
            }
            smartImageView.setLayoutParams(layoutParams);
            Object obj3 = map.get("scale_type");
            if ((obj3 instanceof String) && (str2 = (String) obj3) != null) {
                smartImageView.setActualImageScaleType(EnumC72807Shn.valueOf(str2));
            }
            Object obj4 = map.get("img_url");
            if ((obj4 instanceof String) && (str = (String) obj4) != null) {
                smartImageView.LIZ(W5U.LJIIIIZZ(str).LIZ());
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        assembleChildren();
        L3();
    }
}
