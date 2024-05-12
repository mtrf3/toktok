package com.ss.android.ugc.aweme.prefab;

import X.C8VV;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class LinearLayoutAssem extends DynamicAssem {
    public final int LJLJLLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return 0;
    }

    public LinearLayoutAssem() {
        new LinkedHashMap();
        this.LJLJLLL = R.id.i10;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem
    public void H3() {
        C8VV.LIZJ(this, new AqS169S0100000_3(this, 401));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public void onCreateView() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.setId(L3());
        E3(linearLayout);
        super.onCreateView();
    }

    public int L3() {
        return this.LJLJLLL;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        Integer num;
        LinearLayout linearLayout;
        o.LJIIIZ(view, "view");
        Object obj = getConfig().LJ.get("orientation");
        if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
            int intValue = num.intValue();
            if ((view instanceof LinearLayout) && (linearLayout = (LinearLayout) view) != null) {
                linearLayout.setOrientation(intValue);
            }
        }
        assembleChildren();
    }
}
