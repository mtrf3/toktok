package com.ss.android.ugc.aweme.detail.prefab;

import X.C113554cx;
import X.C212428Vi;
import X.C26338AVi;
import X.C32151Nz;
import X.C55096Ljo;
import X.C55230Lly;
import X.C7SY;
import X.C8VL;
import X.O6R;
import X.OSZ;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.detail.prefab.ability.DetailPageNameAbility;
import com.ss.android.ugc.aweme.prefab.LinearLayoutAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class DetailHeaderAssem extends LinearLayoutAssem {
    public static final Map<String, Integer> LJLLILLLL = C113554cx.LJJL(new OSZ("banner", Integer.valueOf(R.id.aga)), new OSZ("basic_info", Integer.valueOf(R.id.ahh)), new OSZ("buttons", Integer.valueOf(R.id.b2g)), new OSZ("custom2", Integer.valueOf(R.id.c1a)), new OSZ("custom1", Integer.valueOf(R.id.c1_)));
    public final int LJLL;
    public boolean LJLLI;

    public DetailHeaderAssem() {
        new LinkedHashMap();
        this.LJLL = R.id.c95;
        this.LJLLI = true;
    }

    @Override // com.ss.android.ugc.aweme.prefab.LinearLayoutAssem, com.bytedance.assem.arch.dynamic.DynamicAssem
    public final void H3() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, C8VL> map = getConfig().LJIIIZ;
        String[] strArr = {"banner", "basic_info", "advanced_info", "buttons"};
        int i = 0;
        do {
            String str = strArr[i];
            C8VL remove = map.remove(str);
            if (remove != null) {
                linkedHashMap.put(str, remove);
            }
            i++;
        } while (i < 4);
        for (Map.Entry<String, C8VL> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        getConfig().LJIIIZ = linkedHashMap;
        super.H3();
    }

    @Override // com.ss.android.ugc.aweme.prefab.LinearLayoutAssem, com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onCreateView() {
        super.onCreateView();
        C26338AVi.LJIIIZ(x3(), 0, 0, 0, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12))), 16);
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem
    public final Map<String, Integer> K3() {
        return LJLLILLLL;
    }

    @Override // com.ss.android.ugc.aweme.prefab.LinearLayoutAssem
    public final int L3() {
        return this.LJLL;
    }

    @Override // com.ss.android.ugc.aweme.prefab.LinearLayoutAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        DetailPageNameAbility detailPageNameAbility;
        String lr;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (this.LJLLI) {
            this.LJLLI = false;
            Fragment LIZLLL = C212428Vi.LIZLLL(this);
            if (LIZLLL != null && (detailPageNameAbility = (DetailPageNameAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(LIZLLL, null), DetailPageNameAbility.class, null)) != null && (lr = detailPageNameAbility.lr()) != null) {
                view.post(new C7SY(lr));
            }
        }
    }
}
