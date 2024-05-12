package com.bytedance.assem.arch.dynamic;

import X.C113554cx;
import X.C7TL;
import X.C8V1;
import X.C8VL;
import X.C8VV;
import X.C8W0;
import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.view.UISlotAssem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class DynamicAssem extends UISlotAssem {
    public void H3() {
        Map<String, Integer> K3 = K3();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, C8VL> entry : getConfig().LJIIIZ.entrySet()) {
            String key = entry.getKey();
            C8VL value = entry.getValue();
            Integer num = K3.get(key);
            if (num != null) {
                value.LJI = num.intValue();
                arrayList.add(value);
            }
        }
        C8VV.LIZJ(this, new AqS134S0200000_3(this, (DynamicAssem) arrayList, (List<C8VL>) 28));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    /* renamed from: I3, reason: merged with bridge method [inline-methods] */
    public final C8VL getConfig() {
        C7TL<? extends UIAssem> config = super.getConfig();
        o.LJII(config, "null cannot be cast to non-null type com.bytedance.assem.arch.dynamic.DynamicAssemConfig");
        return (C8VL) config;
    }

    public Map<String, Integer> K3() {
        return C113554cx.LJJJLIIL();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void assembleChildren() {
        super.assembleChildren();
        H3();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void didUpdateConfig(C8V1<? extends C8W0> oldConfig) {
        o.LJIIIZ(oldConfig, "oldConfig");
        super.didUpdateConfig(oldConfig);
        H3();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        assembleChildren();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void setConfig(C8V1<? extends C8W0> v) {
        o.LJIIIZ(v, "v");
        super.setConfig(v);
    }
}
