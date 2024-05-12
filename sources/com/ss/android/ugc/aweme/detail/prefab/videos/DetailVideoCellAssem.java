package com.ss.android.ugc.aweme.detail.prefab.videos;

import X.C16880lQ;
import X.C185927Rk;
import X.C212428Vi;
import X.C55096Ljo;
import X.C55230Lly;
import X.C8VR;
import Y.ACListenerS38S0200000_3;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.detail.prefab.ability.InnerFlowAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class DetailVideoCellAssem extends ReusedUISlotAssem<DetailVideoCellAssem> {
    public InnerFlowAbility<C185927Rk> LLFF;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.akv;
    }

    public DetailVideoCellAssem() {
        new LinkedHashMap();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        InnerFlowAbility<C185927Rk> innerFlowAbility = null;
        if (LIZLLL != null) {
            innerFlowAbility = (InnerFlowAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(LIZLLL, null), InnerFlowAbility.class, null);
        }
        this.LLFF = innerFlowAbility;
        view.setPadding(1, 1, 1, 1);
        C16880lQ.LJIIJ(new ACListenerS38S0200000_3(this, view, 26), view);
        C8VR.LIZ(this, new AqS169S0100000_3(this, 0));
    }
}
