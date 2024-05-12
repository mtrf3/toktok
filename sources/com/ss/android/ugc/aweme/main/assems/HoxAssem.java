package com.ss.android.ugc.aweme.main.assems;

import X.AbstractC53892LDc;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C212428Vi;
import X.C221108m2;
import X.C2NH;
import X.C35230DsA;
import X.C38995FSd;
import X.C55096Ljo;
import X.C56662Kg;
import X.C62822Ol8;
import X.L9K;
import X.L9L;
import X.LNZ;
import Y.ARunnableS45S0100000_9;
import android.os.Bundle;
import com.bytedance.hox.Hox;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class HoxAssem extends BaseMainContainerAssem {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 282));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 281));

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void S5() {
        C56662Kg.LIZ().LIZJ("main_act_node_init_duration", false);
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            Hox LIZ2 = Hox.LJLLI.LIZ(LIZ);
            AbstractC53892LDc rootNode = LNZ.LIZIZ.getRootNode(LIZ);
            o.LJIIJ(rootNode, "rootNode");
            LIZ2.LJLIL = LIZ;
            LIZ2.LJLILLLLZI = rootNode;
            C56662Kg.LIZ().LJFF("main_act_node_init_duration", false);
            if (((Boolean) C35230DsA.LIZ.getValue()).booleanValue()) {
                C38995FSd.LIZIZ().execute(new ARunnableS45S0100000_9(this, 76));
                return;
            }
            return;
        }
        "can not find activity for hox init".toString();
        throw new IllegalArgumentException("can not find activity for hox init");
    }

    @Override // X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        HomeTabAbility homeTabAbility = (HomeTabAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), HomeTabAbility.class, null);
        if (homeTabAbility != null) {
            homeTabAbility.Pn((L9L) this.LJLIL.getValue());
            homeTabAbility.yL((L9K) this.LJLILLLLZI.getValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void onCreate(Bundle bundle) {
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(HoxAssem.class), "onCreate_with_bundle"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        C2NH.LIZ.post(new ARunnableS45S0100000_9(this, 201));
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }
}
