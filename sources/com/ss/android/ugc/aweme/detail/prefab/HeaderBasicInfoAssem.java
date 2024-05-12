package com.ss.android.ugc.aweme.detail.prefab;

import X.C113554cx;
import X.C16880lQ;
import X.C7MY;
import X.OSZ;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class HeaderBasicInfoAssem extends DynamicAssem {
    public static final Map<String, Integer> LJLJLLL = C113554cx.LJJL(new OSZ("cover", Integer.valueOf(R.id.cover)), new OSZ("desc", Integer.valueOf(R.id.desc)));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.akt;
    }

    public HeaderBasicInfoAssem() {
        new LinkedHashMap();
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem
    public final Map<String, Integer> K3() {
        return LJLJLLL;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup;
        o.LJIIIZ(view, "view");
        Object obj = getConfig().LJ.get("is_image_right");
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        if (o.LJ(obj, Boolean.TRUE)) {
            View it = view.findViewById(R.id.cover);
            boolean z = view instanceof ViewGroup;
            if (z) {
                ViewGroup viewGroup2 = (ViewGroup) view;
                if (viewGroup2 != null) {
                    C16880lQ.LJLLL(it, viewGroup2);
                }
                if (z && (viewGroup = (ViewGroup) view) != null) {
                    viewGroup.addView(it);
                }
            }
            o.LJIIIIZZ(it, "it");
            ViewGroup.LayoutParams layoutParams = it.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = C7MY.LIZIZ(4);
                it.setLayoutParams(marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        assembleChildren();
    }
}
